# Data Classes

### Definition:
A data class is a special type of class in Kotlin that is specifically designed to hold data. It's concise and automatically generates several methods for you, such as `equals()`, `hashCode()`, `toString()`, `copy()`, and component functions for destructuring.

### Syntax:
To define a data class in Kotlin, you use the `data` keyword before the `class` keyword. Here's the syntax:

```kotlin
data class MyClass(val property1: Type1, val property2: Type2, ...)
```

- `MyClass`: The name of the data class.
- `val property1: Type1, val property2: Type2, ...`: Properties of the data class. These are the variables that hold the data.

### Features:
1. **Automatic `equals()` Method:**
    - The `equals()` method compares the content of two objects and returns `true` if they are equal.
    - For data classes, the `equals()` method is automatically generated based on the properties of the class.

2. **Automatic `hashCode()` Method:**
    - The `hashCode()` method generates a unique hash code for each object, which is useful for hashing and storing objects in collections like HashMap.
    - Data classes automatically generate a `hashCode()` method based on the properties of the class.

3. **Automatic `toString()` Method:**
    - The `toString()` method returns a string representation of the object, usually including the values of its properties.
    - Data classes automatically generate a `toString()` method that includes the values of all properties.

4. **`copy()` Method:**
    - The `copy()` method creates a copy of an object with some of its properties modified.
    - It's useful for creating modified copies of objects while keeping the original intact.
    - Data classes automatically provide a `copy()` method that allows you to copy objects with modified properties.

5. **Component Functions for Destructuring:**
    - Kotlin provides component functions (`component1()`, `component2()`, etc.) that allow you to destructure objects into their individual properties.
    - Data classes automatically provide component functions corresponding to the properties of the class, making it easy to destructure objects.

### Example:
Here's an example of a simple data class in Kotlin:

```kotlin
data class Person(val name: String, val age: Int)
```

With this data class, you automatically get `equals()`, `hashCode()`, `toString()`, `copy()`, and component functions for free.

### When to Use:
- Use data classes when you need simple containers for holding data with minimal behavior.
- They're particularly useful for modeling DTOs (Data Transfer Objects), POJOs (Plain Old Java Objects), entities in database applications, and other similar scenarios.

### Note:
- Data classes must have at least one primary constructor parameter.
- Properties in data classes can be `val` or `var`, but `val` is preferred for immutability.
- Data classes cannot be abstract, open, sealed, or inner.
- You can still define additional methods in data classes if needed.

Data classes are a powerful feature in Kotlin that simplify working with data-centric classes, reduce boilerplate code, and improve code readability and maintainability.