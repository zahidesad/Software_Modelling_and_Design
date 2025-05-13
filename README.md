# Software Modeling and Design Lab

This repository contains **Java-based** examples from the **Software Modeling and Design** course, covering **design patterns**, **SOLID principles**, and **software design best practices**. Organized into weekly labs and preparation modules, it includes implementations of creational, structural, and behavioral patterns, along with functional programming examples in JavaScript.

## 📌 Topics Covered

### **Weekly Labs**

#### **Week 1: Object-Oriented Basics & Principles**
- **Composition vs Inheritance** (`Example01BeforeComposition`, `Example01AfterComposition`)
- **Single Responsibility Principle (SRP)** (`Example02ViolationOfSingleResponsibility`, `Example02SolutionUsingSingleResponsibility`)
- **Inversion of Control (IoC) & Dependency Injection (DI)** (`Example03BeforeIoC`, `Example03AfterIoC`)
- **Filter Pattern** (`Example04`)

#### **Week 2: SOLID Principles**
- **Liskov Substitution Principle (LSP)** (`Example01Before`, `Example01After`)
- **Interface Segregation Principle (ISP)** (`Example02Before`, `Example02After`)
- **Dependency Inversion Principle (DIP)** (`Example03Before`, `Example03After`)
- **Singleton Pattern & Database Connection** (`Example04Before`, `Example04After`)

#### **Week 3: Creational Design Patterns**
- **Factory Pattern** (`Example01`, `Example02MethodParameter`, `Example02SeparateMethods`)
- **Prototype Pattern** (`Example03`)
- **Connection Pool (Singleton + Prototype)** (`Example04`)

#### **Week 4: Structural Design Patterns**
- **Adapter Pattern** (`example01`: Payment System Integration)
- **Bridge Pattern** (`example02`: Webpage Localization)

#### **Week 5: Advanced Design Patterns**
- **Builder Pattern** (`example01`: Vehicle Configuration)
- **Composite & Flyweight Patterns** (`example02`: Shape Rendering)
- **Decorator Pattern with Factories** (`example03`: Car Customization)

#### **Week 11: Behavioral Patterns & Functional Programming**
- **State Pattern** (`example01`: Task Workflow)
- **Memento Pattern** (`example02`: Text Editor History)
- **Functional Programming Examples** (`functional_programming_examples` in JavaScript)

---

### **Midterm Preparation**
#### Behavioral Patterns
- **Chain of Responsibility** (`chain_of_responsibility_pattern`)
- **Command** (`command_pattern`, `command_runnable_pattern`)
- **Interpreter** (`interpreter_pattern`)

#### Structural Patterns
- **Adapter** (`adapter_design_pattern`)
- **Bridge** (`bridge_design_pattern`)
- **Composite** (`composite_design_pattern`)
- **Decorator** (`decorator_design_pattern`)
- **Facade** (`facade_design_pattern`)
- **Flyweight** (`flyweight_pattern`)
- **Proxy** (`proxy_design_pattern`)

---

### **Quiz Preparation**

#### **Quiz 01**
- **Creational Patterns**
  - Abstract Factory (`abstract_factory`)
  - Builder (`builder`)
  - Factory Method (`factory/corrected`, `factory/violation`)
  - Prototype (`prototype/deep_copy`, `prototype/shallow_copy`)
  - Singleton (`singleton/eager_initialization`, `singleton/lazy_initialization`)

- **SOLID Principles**
  - Dependency Inversion (`dependency_inversion`)
  - Interface Segregation (`interface_segregation`)
  - Liskov Substitution (`liskov_substitution`)
  - Open/Closed (`open_closed`)
  - Single Responsibility (`single_responsibility`)

#### **Quiz 02**
- **Behavioral Patterns**
  - Chain of Responsibility (`chain_of_responsibility_pattern`)
  - Command (`command_pattern`, `command_runnable_pattern`)
  - Interpreter (`interpreter_pattern`)
  - Iterator (`iterator_pattern`)
  - Mediator (`mediator_pattern`)
  - Memento (`memento_pattern`)
  - Null Object (`null_object_pattern`)
  - Observer (`observer_pattern`)
  - State (`state_pattern`)
  - Strategy (`strategy_pattern`)
  - Template Method (`template_method_pattern`)
  - Visitor (`visitor_pattern`)

---
## ⚙️ Setup & Execution
This project uses **Maven** for dependency management. Ensure **Java 17** is installed.

### **Clone & Build**
```sh
git clone https://github.com/zahidesad/software_modelling_and_design.git
cd software_modelling_and_design
