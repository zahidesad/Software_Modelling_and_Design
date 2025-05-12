function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    if (b === 0) {
        throw new Error('Cannot divide by zero');
    }
    return a / b;
}


function calculate(a, b, op) {
    switch (op) {
        case '+': return add(a, b);
        case '-': return subtract(a, b);
        case '*': return multiply(a, b);
        case '/': return divide(a, b);
        default:
            throw new Error(`Unknown operator "${op}". Use '+', '-', '*' or '/'.`);
    }
}


console.log(calculate(10,  5, '+')); // 15
console.log(calculate(10,  5, '-')); //  5
console.log(calculate(10,  5, '*')); // 50
console.log(calculate(10,  5, '/')); //  2

