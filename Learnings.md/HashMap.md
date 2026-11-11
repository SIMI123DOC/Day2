# HashMap

- HashMap is a data structure that stores data in key-value pairs.
- Each key must be unique.
- Values can be duplicated.
- Uses hashing to store and retrieve data.
- Does not maintain insertion order.
- Allows one null key and multiple null values.
- Insertion, searching, updating and deletion are the main operations.

## HashMap Operations

- put(key, value): Inserts a new key-value pair or updates an existing value.
- get(key): Retrieves the value using its key.
- remove(key):Deletes a key-value pair.
- containsKey(key): Checks whether a key exists.
- containsValue(value): Checks whether a value exists.
- size(): Returns the number of key-value pairs.
- isEmpty():Checks whether the HashMap is empty.

## Time Complexity

- Average time complexity for insertion, searching and deletion: O(1).
- Worst-case time complexity: O(n) due to hash collisions (implementation-dependent).