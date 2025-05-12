const animal = {
    type: "Generic Animal",
    speak() {
        console.log(`The ${this.type} makes a sound.`);
    }
};


const dog = Object.create(animal);


dog.type = "Dog";
dog.__proto__.bark = function() {
    console.log("How!");
};

console.log("dog.type:", dog.type);
dog.bark();
dog.speak();


animal.sleep = function() {
    console.log(`The ${this.type} is sleeping.`);
};


dog.sleep();
