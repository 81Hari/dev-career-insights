<h1>Alternate Sorting:</h1> 
Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum. <br>
Eg.)<br> 
<b>Input :</b> {1, 2, 3, 4, 5, 6, 7}

<b>Output : </b>{7, 1, 6, 2, 5, 3, 4}

<br>
<br>
<h2>Solution- 1</h2>

<ul> 
  <li>creating two copies of the given array, Sorting one of the array in increasing order and other in decreasing order.</li>
  <li>Now traversing through both arrays alternatively,picking the elements respictively and overwriting the original array.</li>
</ul>

<h2>Solution- 2</h2>
<ul>
<li> Creating a copy of given array,sort that array in increasing order</li>
<li> Now creating two pointers in sorted array, using that pointers traversing the array from the start and from the end,picking elements alternatively from both ends and overwriting the original array.</li>

</ul>

<hr>

<h1>Find the Palindrome</h1>

Take a 2 or 3 digit input number, reverse it and add it to the original number until the obtained number is a palindrome or 5 iterations are completed.<br>

<b>Input :</b><br>
32<br>

<b>Output :</b><br>
55<br>

23 + 32 = 55 which is a palindrome.<br>

<b>Input :</b><br>
39<br>

<b>Output :</b>
363

<hr>

<h1>Sort numbers based on digits starting from most significant numbers</h1>

<pre>
Input: 100 1 11 21 2 3
Output: 1 100 11 2 21 3
</pre>

<h1>Solution</h1>

<ul>
<li>Convert Integer to String.</li>
<li>And sort the strings.</li>
</ul>

<hr>

<h1>Longest Continuous Range</h1>

Given an array of positive numbers. Print the numbers which have longest continuous range.<br>

<b>INPUT :</b> <br>
Enter array size : 8 <br>
Enter array elements : 1 3 10 7 9 2 4 6<br>

<b>OUTPUT :</b> <br>
1 2 3 4<br>

<b>INPUT :</b><br>
Enter array size : 8 <br>
Enter array elements : 1 3 9 7 8 2 4 6 <br>

<b>OUTPUT :</b> <br>
1 2 3 4 <br>
6 7 8 9 <br>

<h2> SOLUTION </h2>

<ul>
  <li> Sort the given array</li>
  <li> Store all the continuous range of elements in 2D Matrix in seperate row</li>
  <li> In Same While Also Store each size of continuous range of elements in 1D array</li>
  <li> Using the sizeArray, find the size of longest continuous range of elements </li>
  <li>Now print only the row whose size is matching the size of longest continuous range</li>
</ul
