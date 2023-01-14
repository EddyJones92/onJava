use academy;

alter table teachers
    add isAssistant bit default 0 not null after EmploymentDate;
alter table teachers
    add isProfessor bit default 0 not null after isAssistant;
alter table teachers
    add position varchar(255) not null after name;

INSERT INTO academy.faculties (name, Dean) VALUES ('QA', 'Serg');
INSERT INTO academy.faculties (name, Dean) VALUES ('Dev', 'Anya');
INSERT INTO academy.faculties (name, Dean) VALUES ('PM', 'Dima');
INSERT INTO academy.faculties (name, Dean) VALUES ('Gamedev', 'Anton');
INSERT INTO academy.faculties (name, Dean) VALUES ('BA', 'Vika');
INSERT INTO academy.faculties (name, Dean) VALUES ('Java', 'Alex');
INSERT INTO academy.faculties (name, Dean) VALUES ('JS', 'Max');

 INSERT INTO academy.teachers (EmploymentDate, isAssistant, isProfessor, name, position, salary, premium, surname)
 VALUES ('2012-08-09', true, false, 'andrey', 'dvornik', 1000.00, 100.00, 'cherniaev');

INSERT INTO academy.teachers (EmploymentDate, isAssistant, isProfessor, name, position, salary, premium, surname)
VALUES ('2019-06-20', false, true, 'vanya', 'translator', 20000.00, 2000.00, 'dyukar');

INSERT INTO academy.teachers (EmploymentDate, isAssistant, isProfessor, name, position, salary, premium, surname)
VALUES ('2022-08-12', true, false, 'edik', 'student', 100.00, 0.00, 'mazur');

INSERT INTO academy.teachers (EmploymentDate, isAssistant, isProfessor, name, position, salary, premium, surname)
VALUES ('2019-11-13', false, true, 'moisey', 'prorok', 100000.00, 18000.00, 'jesus');

INSERT INTO academy.teachers (EmploymentDate, isAssistant, isProfessor, name, position, salary, premium, surname)
VALUES ('2014-09-24', false, true, 'oleg', 'mag', 16000.00, 1300.00, 'rasputin');

select * from faculties order by id desc;

select name, surname, (salary / premium * 100), (salary / (salary+teachers.premium) * 100) from teachers;

select name from departments where financing > 25000 || financing < 11000;

select  name from faculties where name != 'dev';

select position, surname from teachers where isProfessor = 0;

select surname, position, salary, premium from teachers where isAssistant = 1 and premium between 50 and 500;

select surname, salary from teachers where  isAssistant = 1;

select surname, position from teachers where EmploymentDate < '2015-01-01';

select surname from teachers where (salary + premium) > 500 and isAssistant = 1;

select name from `groups` where year = 2 and rating between 2 and 4;

select surname from teachers where isAssistant = 1 and (salary > 500 or premium > 50);



