/*
Company Tesla has kept a contest for catchy caption for the image. They have a rule that the caption should not be more than 10 words. If the caption of a candidate is more than 10 words, then the candidature stands to be disqualified. Can you write a program to check whether a caption is eligible for the contest or not.
The maximum sizeof the caption is of 100 bytes.
*/


#include <cstring>

#include <iostream>

using namespace std;

int main()

{

  char s[100];

 cin.getline(s,100);

 int len = strlen(s);

 int word=0;

 for(int i=0;i<len;i++)

 {

 if(s[i]==' ')

   word++;

 }

 if(word<=10)

 cout<<"Caption eligible for the contest"<<endl;

 else  

   cout<<"Caption not eligible for the contest"<<endl;

 }