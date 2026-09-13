# Space Mission Builder

## Product

`SpaceMission` represents a space mission. It contains a mission name, destination, rocket, and crew size.

The Builder Pattern allows us to create different missions step by step.

## Project Structure

```text
src/
├── SpaceMission.java
├── SpaceMissionBuilder.java
├── MissionDirector.java
└── Main.java
```

* **Product:** `SpaceMission`
* **Builder:** `SpaceMissionBuilder`
* **Director:** `MissionDirector`
* **Client:** `Main`

## Clean Code Principles

### 1. Meaningful Names

Names such as `setDestination()` clearly describe what the method does.

### 2. Small Methods

Each method performs one simple task, such as setting the rocket or destination.

### 3. Single Responsibility

Each class has one main responsibility.

### 4. Validation

`build()` checks invalid values, such as a negative crew size.

### 5. Consistent Formatting

The code follows standard Java naming and formatting conventions.

## How to Run

Run `Main.java` in IntelliJ IDEA.
