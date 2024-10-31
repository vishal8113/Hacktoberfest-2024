#include <stdio.h>
int resetBit(int num,int pos){
    return num&(~(1<<pos));
}
int setBit(int num,int pos){
    return num|(1<<pos);
}

int main(){
    int n,p,res;
    char ch;
    printf("\nEnter the number:");
    scanf("%d",&n);

    printf("Enter the position(starting from zero) from right:");
    scanf("%d",&p);
    
    printf("Enter 's' to set or 'r' to reset the bit:");
    scanf(" %c",&ch);
    switch (ch)
    {
    case 's':
    case 'S':
        res=setBit(n,p);
        printf("Value of %d after setting the bit at position %d is : %d \n",n,p,res);
        break;
    case 'r':
    case 'R':
        res=resetBit(n,p);
        printf("Value of %d after resetting the bit at position %d is : %d\n",n,p,res);
        break;
    
    default:
    printf("Wrong choice\n");
        break;
    }
}