use academy;
-- 1. Вывести количество преподавателей кафедры “dep3”.
select count(t.name), t.name
from groupslectures
         join lectures l on l.id = groupslectures.LectureId
         join teachers t on t.id = l.TeacherId
         join `groups` g on g.id = groupslectures.GroupId
         join departments d on d.id = g.departmentsId
where d.name = 'dep3'
group by t.name;
-- 2. Вывести количество лекций, которые читает преподаватель “oleg”.
select count(l.id), l.LectureRoom
from groupslectures
         join lectures l on l.id = groupslectures.LectureId
         join teachers t on t.id = l.TeacherId
where t.name = 'oleg'
group by l.LectureRoom;
-- 3. Вывести количество занятий, проводимых в аудитории “12”.
select count(*)
from lectures
         join subjects s on s.id = lectures.SubjectId
where LectureRoom = 12;
-- 6. Вывести среднюю ставку преподавателей факультета “QA”.
select avg(salary)
from groupslectures
         join lectures l on l.id = groupslectures.LectureId
         join teachers t on t.id = l.TeacherId
         join `groups` g on g.id = groupslectures.GroupId
         join departments d on d.id = g.departmentsId
         join faculties f on f.id = d.FacultyId
where f.name = 'QA';
-- 7. Вывести минимальное и максимальное количество студентов среди всех групп.
select min(students), max(students) from `groups`;
-- 12.Вывести названия факультетов и количество дисциплин, которые на них читаются.
select f.name, count(s.name) from groupslectures
join lectures l on l.id = groupslectures.LectureId
join subjects s on s.id = l.SubjectId
join `groups` g on g.id = groupslectures.GroupId
join departments d on d.id = g.departmentsId
join faculties f on f.id = d.FacultyId
group by f.name;