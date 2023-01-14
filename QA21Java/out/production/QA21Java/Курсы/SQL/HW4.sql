use import_hospital;

-- 6. Вывести фамилии врачей с указанием отделений, в которых они проводят обследования. Необходимо учитывать
-- обследования, проводимые только в будние дни.

select d.Surname, d2.name, e.Name from doctorsexaminations
join doctors d on d.Id = doctorsexaminations.DoctorId
join examinations e on e.Id = doctorsexaminations.ExaminationId
join wards w on w.Id = doctorsexaminations.WardId
join departments d2 on d2.id = w.DepartmentId
where EndTime <= '16:00:00' and StartTime >= '11:00:00';

-- 7. Вывести названия палат и корпуса отделений, в которых проводит обследования врач “Helen Williams”.

select w.Name, building from doctorsexaminations
join doctors d on d.Id = doctorsexaminations.DoctorId
join wards w on w.Id = doctorsexaminations.WardId
join departments d2 on d2.id = w.DepartmentId
where d.Name = 'doc2';

-- 10. Вывести названия специализаций, которые используются
-- для лечения заболеваний со степенью тяжести выше 3.

select Name from specializations
where stepen > 3;

-- 12. Вывести названия отделений и палат, в которых проводились обследования по заразительным заболеваниям.

select d.name, w.Name from doctorsexaminations
join examinations e on e.Id = doctorsexaminations.ExaminationId
join wards w on w.Id = doctorsexaminations.WardId
join departments d on d.id = w.DepartmentId
where infection = true;