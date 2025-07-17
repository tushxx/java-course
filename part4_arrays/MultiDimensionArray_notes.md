## 🔸 Declaration & Initialization
#### ✅ Method 1: Declare + Assign directly
```
int[][] arr = {
{1, 2},
{3, 4},
{5, 6}
};
```

#### ✅ Method 2: Declare with size
```int[][] arr = new int[3][2];  // 3 rows, 2 columns```

// fill values manually
```
arr[0][0] = 1;
arr[0][1] = 2;
```
// and so on...


## 🔸 Access Elements
```System.out.println(arr[1][0]);  // prints 3 (row 1, column 0)```
Remember: Indexing starts at 0

## 🔸 Loop through 2D array
#### ✅ Using nested for loops:
```
for (int i = 0; i < arr.length; i++) {           // rows
  for (int j = 0; j < arr[i].length; j++) {    // columns
  System.out.print(arr[i][j] + " ");
}
System.out.println();
}
```

## 🔸 Using enhanced for-loop:
```
for (int[] row : arr) {
for (int val : row) {
System.out.print(val + " ");
}
System.out.println();
}
```


## 🔸 Print 2D array with Arrays.deepToString()
````System.out.println(Arrays.deepToString(arr));````
🟢 Output:
[[1, 2], [3, 4], [5, 6]]


#### 🧠 Irregular (Jagged) Arrays
You can also have rows of different lengths:
```
int[][] jagged = {
{1, 2},
{3, 4, 5},
{6}
};
```
✅ Java allows this. It's not a perfect rectangle anymore.



#### a 2D array is actually an array of arrays

#### System.out.println(Arrays.toString(arr)); // [[I@1be6f5c3, [I@6b884d57, [I@38af3868]
// Because arr is a 2D array — i.e.,
// an array of arrays — and Arrays.toString() just prints each sub-array as an object reference, not their contents.

Why deepToString()?
Because it recursively prints nested arrays (multi-dimensional) in readable form.


