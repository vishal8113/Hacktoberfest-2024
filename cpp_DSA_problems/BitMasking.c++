#include<bits/stdc++.h>
using namespace std;
int GetManipulation(int n,int pos)  //n =0101
{
    return (n & (1 <<pos)) !=0; 
}
int setBit(int n,int pos)  //n=0101
{
    return (n | (1 << pos)) ;
}
int clearBit(int n,int pos) //0101  we have to clear bit at 2 position so using ~ we make it 1's compliment
{
    int mask=~(1 << pos);
    return (n & mask);
}

int updateBit(int n, int pos,int value)                                      
{
    int mask= ~(1<<pos);
    n= n &  mask;
    return ( n | (value<< pos));
}
 int main()
 {
    cout << "GEt"<< GetManipulation(5,2) << endl;

    cout << setBit(5,1);

   cout << clearBit(5,2);

   cout << updateBit(5,1,1) << endl;
    return 0;
 }
