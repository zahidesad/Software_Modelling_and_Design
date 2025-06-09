function createPerson(name, age) {
    return {
        name: name,
        age: age,
        greet: function() {
            return `Hello, my name is ${name} and I am ${age} years old.`;
        }
    };
}


const person = createPerson("Alice", 30);
console.log(person.greet());
