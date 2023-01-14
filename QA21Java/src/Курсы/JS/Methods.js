const myCity = {
    city: 'Dnepr',
    cityGreeting : function (){
        console.log('Greetings!!!')
    }
}
myCity.cityGreeting()

//или можно записать в другом варианте, они дают один результат

const myCity2 = {
    city : 'Dnepr',
    cityGreeting2 () {
        console.log('Greetings!')
    } // убрали слово функция и поставили просто после свойства скобки
}
myCity2.cityGreeting2()