const person = {
    name : 'Bob',
    age : 25
}

const person2 = Object.assign({}, person) // вызываем класс Object новый объект со свойствами скопированного
    //меняет только в новом объекте, потому что создали новую ссылку {} показывает, что создаем новый объект
person2.age = 26

console.log(person2.age) // 26
console.log(person.age) // 25

// второй спобоб

console.log('----------------------------------')

const pers = {
    name : 'Bob',
    age : 20
}
const pers2 = {...pers} // ... это оператор разделение объекта на свойства, скобки показывают,
// что разделенные свойста мы соеденили в новый объект
pers2.name = 'Kate'
console.log(pers2.name)
console.log(pers.name)

//сслыки на вложенные объекты сохраняются в новых объектах и мутируют в основном проект

console.log('----------------------------------')

const per = {
    name : 'Oleg',
    age : 23
}

const per2 = JSON.parse(JSON.stringify(per)) // при этом способе меняются ссылки на все, даже на вложенные объекты.
// происходит двойная конвертация

per2.name = 'Alex'

console.log(per2.name)
console.log(per.name)