Counts distinct values in a sorted array using 2 approaches: straight iteration thru the array and using recursion.
With straight iteration, the performance is O(N) since we are comparing each value in the array. With recursion, the
best performance is a single comparison of first and last values in the array if all the values are duplicates, 
and O(N) if all the values are unique. But on average it would be better than O(N). Below are the results of a sample
run with varying array length.

input data    : gijkqrstwz
output        : {g=1, i=1, j=1, k=1, q=1, r=1, s=1, t=1, w=1, z=1}
data length   : 10
iteration took: 787,200 nsecs
recursion took: 292,000 nsecs

input data    : aaaaaaabbcccccdddddeeeeffffffgggghhhhiiiijjjjjkkmmmnnopqrrrrrsssttttttuuuuvvvvvvvwwwwwwwxxxxyyyyzzzz
output        : {a=7, b=2, c=5, d=5, e=4, f=6, g=4, h=4, i=4, j=5, k=2, m=3, n=2, o=1, p=1, q=1, r=5, s=3, t=6, u=4, v=7, w=7, x=4, y=4, z=4}
data length   : 100
iteration took: 220,500 nsecs
recursion took: 338,800 nsecs

input data    : aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccccccccccc...
output        : {a=39, b=31, c=37, d=29, e=37, f=38, g=50, h=42, i=34, j=36, k=45, l=30, m=42, n=42, o=48, p=40, q=41, r=31, s=46, t=36, u=45, v=48, w=24, x=37, y=35, z=37}
data length   : 1,000
iteration took: 678,300 nsecs
recursion took: 721,100 nsecs

input data    : aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...
output        : {a=374, b=419, c=362, d=427, e=397, f=382, g=386, h=368, i=389, j=360, k=412, l=380, m=392, n=379, o=380, p=386, q=362, r=326, s=363, t=412, u=379, v=420, w=396, x=359, y=397, z=393}
data length   : 10,000
iteration took: 2,245,400 nsecs
recursion took: 1,070,500 nsecs

input data    : aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...
output        : {a=3798, b=3943, c=3808, d=3863, e=3852, f=3878, g=3943, h=3767, i=3925, j=3845, k=3940, l=3850, m=3786, n=3777, o=3769, p=3809, q=3946, r=3872, s=3916, t=3808, u=3784, v=3881, w=3792, x=3768, y=3784, z=3896}
data length   : 100,000
iteration took: 10,102,000 nsecs
recursion took: 1,564,500 nsecs

input data    : aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...
output        : {a=38737, b=38206, c=38731, d=38724, e=38444, f=38097, g=38034, h=38421, i=38442, j=38427, k=38570, l=38430, m=38531, n=38741, o=38076, p=38297, q=38520, r=38406, s=38837, t=38567, u=38576, v=38386, w=38126, x=38241, y=38334, z=39099}
data length   : 1,000,000
iteration took: 33,435,200 nsecs
recursion took: 5,999,600 nsecs

