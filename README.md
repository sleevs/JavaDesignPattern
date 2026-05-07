# Java Design Patterns Demonstration

This repository contains practical implementations of classical software design patterns using Java.

The goal of this project is to study reusable software architecture solutions and demonstrate how design patterns can be applied in real-world scenarios such as APIs, distributed systems, notifications, and enterprise applications.

---

## About Design Patterns

Design patterns are reusable solutions to recurring software design problems.

They help developers:
- Improve code maintainability
- Reduce coupling
- Increase flexibility
- Reuse proven architectural solutions
- Communicate software architecture more effectively

This repository explores both theoretical concepts and practical implementations.

---

# Creational Patterns

## Factory Method
**Problem:** Different strategies for calculating shipping rates need to be implemented in an extensible way.  
**Pattern:** Factory Method  
**Solution:** Logistics API that dynamically instantiates fare calculators.  

Status: ✅ DONE

---

## Abstract Factory
**Problem:** Creating multiple related objects (payments) without coupling to concrete implementations.  
**Pattern:** Abstract Factory  
**Solution:** Payment API that creates compatible payment objects.  

Status: ✅ DONE

---

## Builder
**Problem:** Notifications require multiple configuration and delivery options.  
**Pattern:** Builder  
**Solution:** Notification API that allows building various notification configurations fluently.  

Status: ✅ DONE

---

## Prototype
**Problem:** Marketplace catalog needs to allow copies of complex objects without recreating them from scratch.  
**Pattern:** Prototype  
**Solution:** Implementation that clones catalog objects for reuse.  

Status: ✅ DONE

---

## Singleton
**Problem:** A global shared instance is needed for configuration or central resources.  
**Pattern:** Singleton  
**Solution:** Global configuration manager accessible across the application.  

Status: 🚧 TODO

---

# Structural Patterns

## Adapter
**Problem:** A modern API needs to integrate with an incompatible legacy service (e.g., SOAP).  
**Pattern:** Adapter  
**Solution:** Adapter layer that converts REST calls into compatible SOAP requests.  

Status: 🚧 TODO

---

## Bridge
**Problem:** Notifications must support multiple channels and independent providers.  
**Pattern:** Bridge  
**Solution:** Separate the notification abstraction from the provider implementation, allowing independent evolution.  

Status: 🚧 TODO

---

## Composite
**Problem:** Project management platform needs to represent hierarchical structures (Projects → Analyses → Tasks → Actions).  
**Pattern:** Composite  
**Solution:** All project elements are treated as tree components sharing the same interface.  

Status: 🚧 IN PROGRESS

---

## Decorator
**Problem:** E-commerce system needs to dynamically add behavior to price calculations (discounts, taxes, shipping).  
**Pattern:** Decorator  
**Solution:** Dynamically wrap price components to add behavior without changing core classes.  

Status: 🚧 TODO

---

## Facade
**Problem:** Client application needs to interact with multiple complex subsystems (authentication, payment, notifications).  
**Pattern:** Facade  
**Solution:** Provide a unified API that simplifies interactions with internal subsystems.  

Status: 🚧 TODO

---

## Flyweight
**Problem:** Multiplayer game server needs to manage thousands of character objects efficiently.  
**Pattern:** Flyweight  
**Solution:** Share immutable character states among multiple instances to reduce memory usage.  

Status: 🚧 TODO

---

## Proxy
**Problem:** Document management system requires access control and lazy loading for large files.  
**Pattern:** Proxy  
**Solution:** Introduce a proxy responsible for authorization and deferred loading.  

Status: 🚧 TODO

---

# Behavioral Patterns

## Interpreter
**Problem:** GitHub analytics service needs to interpret custom queries to filter repositories.  
**Pattern:** Interpreter  
**Solution:** Implement a parser capable of converting expressions into executable rules.  

Status: 🚧 TODO

---

## Chain of Responsibility
**Problem:** Sequential request processing with flexible handling.  
**Pattern:** Chain of Responsibility  
**Solution:** Implementation that processes requests in a chain, used to retrieve GitHub issues.  

Status: ✅ DONE

---

## Command
**Problem:** Distributed microservices need to execute transactions in an encapsulated way.  
**Pattern:** Command  
**Solution:** Command that encapsulates actions across microservices.  

Status: ✅ DONE

---

## Iterator
**Problem:** Reporting system needs to traverse internal collections in a standardized way.  
**Pattern:** Iterator  
**Solution:** Provides a unified iteration interface, independent of the collection implementation.  

Status: 🚧 TODO

---

## Mediator
**Problem:** Chat application needs to manage communication between multiple users without direct coupling.  
**Pattern:** Mediator  
**Solution:** Central mediator responsible for routing messages among participants.  

Status: 🚧 IN PROGRESS

---

## Memento
**Problem:** Text editor requires undo/redo functionality without exposing internal object state.  
**Pattern:** Memento  
**Solution:** Store snapshots of state that can be restored when needed.  

Status: 🚧 TODO

---

## Observer
**Problem:** Recruitment platform needs to notify recruiters and candidates in real time.  
**Pattern:** Observer  
**Solution:** Subscribers automatically receive notifications whenever relevant events occur.  

Status: 🚧 IN PROGRESS

---

## State
**Problem:** Order processing system changes behavior depending on order state.  
**Pattern:** State  
**Solution:** Encapsulate behavior in specific state classes (e.g., Pending, Paid, Delivered).  

Status: 🚧 TODO

---

## Strategy
**Problem:** Logistics platform needs to support multiple shipping calculation strategies.  
**Pattern:** Strategy  
**Solution:** Encapsulate shipping algorithms and switch dynamically based on business rules.  

Status: 🚧 TODO

---

## Template Method
**Problem:** Different report generators share workflows but have specific formatting steps.  
**Pattern:** Template Method  
**Solution:** Define the algorithm skeleton and allow subclasses to customize individual steps.  

Status: 🚧 TODO

---

## Visitor
**Problem:** Financial platform needs to apply multiple operations to transaction objects without modifying their classes.  
**Pattern:** Visitor  
**Solution:** Separate operations from the object structure using visitor implementations.  

Status: 🚧 TODO

---

# Concurrent Patterns

## Barrier
**Problem:** Distributed system needs to synchronize multiple threads before continuing execution.  
**Pattern:** Barrier  
**Solution:** Force all threads to wait at a synchronization point before proceeding.  

Status: 🚧 TODO

---

## Active Object
**Problem:** High-concurrency notification system needs to process requests asynchronously without blocking the main thread.  
**Pattern:** Active Object  
**Solution:** Encapsulate asynchronous execution behind a scheduler and worker thread abstraction.  

Status: 🚧 TODO

---

# Stack

- Java
- Maven
- Spring Boot (selected examples)
- REST APIs
- GitHub API

---

# Goals

- Study software architecture patterns
- Practice enterprise application design
- Explore reusable design solutions
- Apply patterns in real-world scenarios
- Improve object-oriented design skills
