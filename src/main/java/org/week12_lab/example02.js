const Car = {
    init(make, model) {
        this.make = make;
        this.model = model;
        return this;
    },
    startEngine() {
        return `${this.make} ${this.model}'s engine started.`;
    }
};

const ElectricCar = Object.create(Car);

ElectricCar.init = function(make, model, batteryLevel = 100) {
    Car.init.call(this, make, model);
    this.batteryLevel = batteryLevel;
    return this;
};

ElectricCar.chargeBattery = function() {
    this.batteryLevel = 100;
};
ElectricCar.startEngine = function() {
    return `${this.make} ${this.model} (electric) engine started at ${this.batteryLevel}%.`;
};

const bolt = Object.create(ElectricCar).init('Chevy', 'Bolt', 55);
console.log( bolt.startEngine() );
bolt.chargeBattery();
console.log( bolt.startEngine() );