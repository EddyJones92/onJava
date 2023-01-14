const myCity = {
    city: 'New York',
    popular: true,
    country: 'USA'
}

console.log(myCity.city) // dot notation точечная запись

console.log(myCity.popular) // вывод свойства значения объекта myCity

const newCity = {
    city: 'New York'
}
newCity.city = 'Las Vegas' //можно изменить переменную в массиве через точечную запись
console.log(newCity)

newCity.popular = true // довавление значений в объект через точечную запись
newCity.country = 'Ukraine'
console.log(newCity)

delete newCity.popular // удаление свойства
console.log(newCity)

const town = {
    city: 'Honolulu'
}
town ['popular'] = true //другой способ добавления значений в кважратных скобках строка (bracket notation)
console.log(town)

const countryPropertyName = 'country'
town[countryPropertyName] = 'USA' //добавление свойства через переменную
console.log(town)

const city2 = {
    city: 'New York',
    info: {
        isPopular: true,
        country: 'USA'
    } // вложенный объект
}
console.log(city2.info.isPopular)
console.log(city2)

delete city2.info['isPopular'] // использование точечной и скобочной записи
console.log(city2)

const name = 'Edik'
const posts = 23

const profile = {
    name,
    posts,
    hasSigned: false
} // просто ссылаемся на переменные, чтоб не писать дважды, сокращенные свойства нужно писать в начале объекта

