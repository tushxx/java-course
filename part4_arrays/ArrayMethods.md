✅ 1. Arrays.toString() → Print array as a string

```
import java.util.Arrays;

int[] arr = {10, 20, 30, 40};
System.out.println(Arrays.toString(arr));
🟢 Output:
```
[10, 20, 30, 40]


✅ 2. Arrays.sort() → Sort an array
```int[] arr = {30, 10, 40, 20};
Arrays.sort(arr); // sorts in ascending order
System.out.println(Arrays.toString(arr));
```
🟢 Output:
[10, 20, 30, 40]


✅ 3. Arrays.copyOf() → Copy array or resize
```int[] arr = {1, 2, 3};
int[] newArr = Arrays.copyOf(arr, 5);
System.out.println(Arrays.toString(newArr));
```
🟢 Output:
[1, 2, 3, 0, 0]
The extra space is filled with 0 (default for int)

✅ 4. Arrays.equals() → Compare two arrays
```int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(Arrays.equals(a, b));  // true
```

✅ 5. Arrays.fill() → Fill all elements with a value
```int[] arr = new int[5];
Arrays.fill(arr, 7);
System.out.println(Arrays.toString(arr));
```
🟢 Output:
[7, 7, 7, 7, 7]


✅ 6. Arrays.binarySearch() → Search in sorted array
```int[] arr = {10, 20, 30, 40};
int index = Arrays.binarySearch(arr, 30);
System.out.println(index);  // Output: 2
```
⚠️ The array must be sorted for correct results

✅ 7. System.arraycopy() → Copy from one array to another
```int[] src = {1, 2, 3};
int[] dest = new int[5];
System.arraycopy(src, 0, dest, 0, src.length);
System.out.println(Arrays.toString(dest));
```
🟢 Output:
[1, 2, 3, 0, 0]


✅ 8. .length → Get the size of the array
```int[] arr = {1, 2, 3};
System.out.println(arr.length); // Output: 3
```
This is a property, not a method → no () at the end

🧠 Bonus: Convert Array to List
```String[] names = {"Tushar", "Amit"};
List<String> list = Arrays.asList(names);
```
System.out.println(list);  // [Tushar, Amit]