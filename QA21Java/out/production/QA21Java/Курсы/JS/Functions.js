// функция может быть именованной, присвоена переменной, анонимной, аргументом при вызове другой функции
// и значением свойства (метод) объекта. Функция - это объект


let a = 3
let b = 5

let c

c = a + b
console.log(c)

a = 8
b = 12

c = a + b
console.log(c) // не нормализированный код

// правильный способ. надо создать функцию

let q = 4
let w = 5

function sum(q,w) {
    const c = q+w
    console.log(c) //тело функции
}

sum(q,w)

q = 23
w = 11

sum(q,w)

function myFn(a,b) {
    let c
    a = a + 1
    c = a + b
    return c
}

console.log(myFn(3,4))