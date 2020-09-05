/*
Write a program to print the following pattern.
Sample Input:

3

Sample Output:

3 
44 
555 
6666 
6666 
555 
44 
3
*/


#include<iostream>

using namespace std;

int main()

{

int n = 3,n1,i,j;

cin >> n1;

for(i=1;i<=n+1;i++)

{

for(j=1;j<=i;j++)

cout<<n1;

n1++;

cout<<endl;

}

n1--;

for(i=n+1;i>=1;i--)

{

for(j=1;j<=i;j++)

cout<<n1;

n1--;

cout<<endl;

}

}

