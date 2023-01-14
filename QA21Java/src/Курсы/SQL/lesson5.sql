use import_hospital;
select max(building)
from departments;
select count(*)
from departments;
select avg(building)
from departments;
select sum(financing)
from departments;

-- 5. Вывести названия отделений, в которых проводят обследования 5 и более врачей.

select departments.name, count(*)
from departments
         join wards w on departments.id = w.DepartmentId
         join doctorsexaminations d on w.Id = d.WardId
         join examinations e on e.Id = d.ExaminationId
group by departments.name
having count(*) > 2
;

-- 6. Вывести количество врачей и их суммарную зарплату (сумма ставки и надбавки).

select count(*), sum(Salary + Premium)
from doctors
;

-- 9. Вывести в каких из корпусов 1, 6, 7 и 8, суммарное количество мест в палатах превышает 100.
-- При этом учитывать только палаты с количеством мест больше 10.

select departments.name, sum(places)
from departments
         join wards w on departments.id = w.DepartmentId
where places > 10
group by departments.name
having sum(places) > 20
;
