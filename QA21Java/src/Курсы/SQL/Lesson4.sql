use import_hospital;

select * from import_hospital.wards
inner join departments d on wards.DepartmentId = d.id
where d.name = 'DEP7';
INSERT INTO import_hospital.wards (Name, DepartmentId) VALUES ('ward8', 2);
select distinct departments.name from departments
join donations d on departments.id = d.DepartmentId
join sponsors s on s.Id = d.SponsorId
where s.Name = 'umbrella';

create table `DoctorsExaminations`
(
    `Id` int not null auto_increment primary key,
    `EndTime` time not null,
    `StartTime` time not null check (`StartTime` between '08:00' and '18:00'),
    `DoctorId` int not null,
    `ExaminationId` int not null,
    `WardId` int not null,
    check (`StartTime` < `EndTime`)
);
create table `Examinations`
(
    `Id` int not null auto_increment primary key,
    `Name` nvarchar(100) not null unique check (`Name` <> N'')
);
alter table `DoctorsExaminations`
    add foreign key (`ExaminationId`) references `Examinations`(`Id`);

alter table `DoctorsExaminations`
    add foreign key (`WardId`) references `Wards`(`Id`);

alter table `DoctorsExaminations`
    add foreign key (`DoctorId`) references `Doctors`(`Id`);

select * from doctorsexaminations;