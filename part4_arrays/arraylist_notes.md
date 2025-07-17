✅ Use ArrayList when:
#### 1. Size is dynamic (not fixed)
   You don’t know in advance how many elements you’ll have.
```
ArrayList<String> names = new ArrayList<>();
names.add("Tushar");
names.add("Aditya");
names.add("Sarthak");
```
➡️ Use when elements may be added or removed at runtime.

#### 2. You want useful methods built-in
  add(), remove(), contains(), indexOf(), clear(), etc.

Makes working with collections faster and easier.
```
if (names.contains("Tushar")) {
System.out.println("He's here!");
}
```

#### 3. You’re working with objects or classes
   ArrayList only stores objects, not primitives.

Good for storing String, Integer, custom Student, Employee, etc.
```
ArrayList<Student> students = new ArrayList<>();
students.add(new Student("Tushar", 101));
```

#### 4. You want flexible resizing with minimal manual work
   Arrays need you to create a new array and copy data manually. 
   ArrayList does it internally.

| Method                           | Description                |
| -------------------------------- | -------------------------- |
| `add(element)`                   | Adds element to the end    |
| `add(index, element)`            | Adds at specified index    |
| `get(index)`                     | Returns element at index   |
| `set(index, element)`            | Replaces element at index  |
| `remove(index)` or `remove(obj)` | Removes by index or object |
| `size()`                         | Number of elements         |
| `clear()`                        | Removes all elements       |
| `contains(obj)`                  | Checks if element exists   |
| `isEmpty()`                      | Checks if list is empty    |

##  ArrayList marks = new ArrayList();
🔴 Problem with This Approach:
You didn’t specify a type for the ArrayList — this means it becomes raw type.

This allows adding any object (int, String, double, custom objects, etc.).

But it also causes loss of type safety, and may lead to ClassCastException at runtime.

✅ Recommended Way (Type-Safe):
If your list should only store Integer values, write:
````
ArrayList<Integer> marks = new ArrayList<>(10);
marks.add(1);         // OK
// marks.add("tushar");  ❌ Compile-time error
System.out.println(marks);
````

If your list should store both Strings and Integers, you can use:

````
ArrayList<Object> marks = new ArrayList<>(10);
marks.add(1);           // Integer
marks.add("tushar");    // String
System.out.println(marks);
````
Or better yet, if you're mixing types, ask yourself why — usually it's cleaner to use a specific type per list.


## internal working
✅ Step-by-Step Internal Workflow
#### Initialization:
`ArrayList<Integer> list = new ArrayList<>();`

 Internally creates:
`````
Object[] elementData = new Object[10]; // Default size
int size = 0;
`````
`Adding Elements:list.add(42);`
Internally:
It checks if the internal array (elementData) has enough space.

`If yes:
Adds 42 at index size`

Increments size
````
If no:
Creates a new, larger array (usually 1.5x old size)
Copies old elements to new array
Adds the new element
````

Getting Elements:
list.get(0);
Internally:
return (Integer) elementData[0]; // Casted back from Object
Removing Elements:
list.remove(1);
Internally:

Shifts all elements after index 1 to the left

Decreases size

⚡ Resizing Logic
When capacity is full, it resizes like:
```int newCapacity = oldCapacity + (oldCapacity >> 1); // 1.5x growth```
So, if current capacity is 10:

New capacity becomes 10 + 5 = 15

This is why frequent adding is efficient: it grows exponentially.



