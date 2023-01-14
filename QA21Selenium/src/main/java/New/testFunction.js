function checkType(elem) {
    let type = typeof elem;
    // Дополнительная проверка типа null (см. примечание)
     if(elem === null) type = 'null'
    switch(type) {
        case 'number':
            return 'Variable is number'
        case 'null':
            return 'Variable is null'
        case 'boolean':
            return 'Variable is boolean'
        case 'bigint':
            return 'Variable is bigint'
        case 'string':
            return 'Variable is string'
        case 'object':
            return 'Variable is object'
        case 'undefined':
            return 'Variable is undefined'
        case 'symbol':
            return 'Variable is symbol'
        default:
            return 'Variable is something else'
    }
}