// 1. Define the three operations
function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}


const operations = [add, subtract, multiply];

function callOperation(ops, index) {
    if (index < 0 || index >= ops.length) {
        throw new RangeError(`Invalid operation index: ${index}`);
    }
    return ops[index];
}


function runTests() {
    console.assert(
        callOperation(operations, 0)(2, 3) === 5,
        'Test 1 (add) failed'
    );
    console.assert(
        callOperation(operations, 1)(10, 4) === 6,
        'Test 2 (subtract) failed'
    );
    console.assert(
        callOperation(operations, 2)(6, 7) === 42,
        'Test 3 (multiply) failed'
    );

    // also test the error case
    try {
        callOperation(operations, 3);
        console.error('Test 4 (invalid index) should have thrown');
    } catch (e) {
        console.log('Test 4 passed (caught invalid index)');
    }

    console.log('All valid-operation tests passed!');
}

runTests();
