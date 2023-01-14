describe("variable type function test", function() {

    it("определяет тип переменной", function() {
        assert.equal(checkType(12), 'Variable is number');
        assert.equal(checkType(null), 'Variable is null'); // этот тест без дополнительной проверки null в функции checkType не пройдет
        assert.equal(checkType(Boolean(1)), 'Variable is boolean');
        assert.equal(checkType(1224n), 'Variable is bigint');
        assert.equal(checkType("String"), 'Variable is string');
        assert.equal(checkType({a:2, b:1}), 'Variable is object');
        assert.equal(checkType(undefined), 'Variable is undefined');
        assert.equal(checkType(Symbol()), 'Variable is symbol');
        assert.equal(checkType((a)=>{a}), 'Variable is something else'); // проверка функционального аргумента
    });
    it("проверка строкового типа", function() {
        assert.equal(checkType("apple"), 'Variable is string');
    });

    it("проверка числового типа", function() {
        assert.equal(checkType(12), 'Variable is number');
    });
    it("проверка логического типа", function() {
        assert.equal(checkType(Boolean(1)), 'Variable is boolean');
    });


});