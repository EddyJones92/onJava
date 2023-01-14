const aaa = {
        "email": "tutor@gmail.com",
        "password": "123456"
}

// перевод формата JSON в JS

JSON.stringify() // перевод формата JS в JSON

const post = {
        title : 'My post',
        likesQty : 5
}
console.log(JSON.stringify((post)) )

const post1 = JSON.stringify((post))

console.log(JSON.parse(post1))