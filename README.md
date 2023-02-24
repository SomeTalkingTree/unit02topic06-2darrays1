1. Copying arrays

Write three static methods that make a copy of the input array, and return that copy.

* `copySquare` assumes the input array is square

* `copyRectangle` assumes the input array is rectangular

* `copyRagged` will handle ragged arrays

`copyRectangle` should work for copying square arrays also, and `copyRagged` should work for both rectangular and square arrays (in addition to ragged ones).

The three methods should get progressively more complicated (don't just use the most general ragged code case each time)

2. `printTranspose`

Write a method to print the transposition (rows and columns exchanged) of a rectangular array. For the spreadsheet discussed in class, 

```
double[][] a = new double[][] {
    {99, 85, 98},
    {98, 57, 79},
    {92, 77, 74},
    {94, 62, 81},
    {99, 94, 92},
    {80, 76.5, 67},
    {76, 58.5, 90.5},
    {92, 66, 91},
    {77, 70.5, 66.5},
    {89, 89.5, 81}
};
```

The following should be printed:
```
99 98 92 94 99 80 76 92 77 89
85 57 77 62 94 76.5 58.5 66 70.5 89.5
98 79 74 81 92 67 90.5 91 66.5 81
```

3. `withWeightedAverage`

Take as input a spreadsheet (two dimensional array of `double`s) and a one dimensional array `weights[]`. Return a new two dimensional array that has row and column averages, but in this case the row averages should be weighted according to the `weights` array. (So the length of `weights` needs to be the number of columns in the spreadsheet)

For example, to make the last of the three exams in the example be twice the weight of the first two, you would use:

```
double[] weights = { 0.25, 0.25, 0.50 };
```

Using these weights, the first row average would be 95 instead of 94.

Note that the weights should sum to 1.

//me below
`Notes:` The last one should be done twice, so all of the weights would be .25
[][] "lists" for the entire thing.
