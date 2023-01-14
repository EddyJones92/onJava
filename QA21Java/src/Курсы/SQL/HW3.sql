use academy;

create table if not exists curators
(
    `id`      int          not null auto_increment primary key,
    `name`    varchar(255) not null check ( `name` != '' ),
    `surname` varchar(255) not null check ( `surname` != '' )
);

alter table departments
    add FacultyId int not null;

alter table departments
    add constraint departments_faculties_id_fk
        foreign key (FacultyId) references faculties (id);

alter table faculties
    add financing decimal default 0 not null check (financing >= 0 );

alter table `groups`
    add constraint groups_departments_id_fk
        foreign key (departmentsId) references departments (id);

-- 3. Вывести фамилии кураторов групп и названия групп, которые они курируют.
select c.surname, g.name from groupscurators
join curators c on c.id = groupscurators.curatorId
join `groups` g on g.id = groupscurators.groupId;

-- 4. Вывести имена и фамилии преподавателей, которые читают лекции у группы “g2”.

select t.name, t.surname, g.name from groupslectures
join `groups` g on g.id = groupslectures.GroupId
join lectures l on l.id = groupslectures.LectureId
join teachers t on t.id = l.TeacherId
where g.name = 'g2';

-- 6. Вывести названия кафедр и названия групп, которые к ним относятся.
select `groups`.name, d.name from `groups`
join departments d on d.id = `groups`.departmentsId;

-- 9. Вывести названия групп, которые относятся к факультету “QA”.

select f.name, `groups`.name from `groups`
join departments d on d.id = `groups`.departmentsId
join faculties f on f.id = d.FacultyId
where f.name = 'QA';