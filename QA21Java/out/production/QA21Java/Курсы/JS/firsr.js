const object = {
    a : 10,
    b : true,
} // ссылочный тип - объект, можно менять и добавлять переменные
console.log(object)

copy = object // к одному объекту можно создавать много переменных (ссылки к объекту)

console.log(copy)

copy.a = 20 //изменить переменную с объекта через точку

console.log(object)

copy.c = 'Hello' // доюавить новую переменную в объект

console.log(object.c) //вывод на консоль