function firstFunc(arg1, arg2) {
    console.log('hello from func', arg1 + arg2)
}
firstFunc(1,2)

const a = 10

function checkScope() {
    const a = 5
    console.log(a)
}
checkScope()