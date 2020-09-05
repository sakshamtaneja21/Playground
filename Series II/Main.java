//Write a program to generate the first 'n' terms of the following series 121, 225, 361,...
#include<iostream>
int main ()
{
   int n, a=11, x=4, i=0, num;
   std::cin>>n;
for(i=0;i<n;i++)
{
   num=a*a;
   std::cout<<num<<" ";
   a=a+4;
}
}