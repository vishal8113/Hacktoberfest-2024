#include <stdio.h>
int linearSearch(int a[],int n,int s){
    int i;
    for (i = 0; i < n; i++){
        if(a[i]==s){
            return i+1;
        }   
    }
    return -1;
        
    
}
int main(){
    int n,s,a[100],i,p;
    printf("\nEnter the number of elements:");
    scanf("%d",&n);

    //Input the array elements
    printf("Enter the array elements:");
    for ( i=0 ; i<n ; i++){
        scanf("%d",a+i);
    }
    //Input the element to search
    printf("Enter searching element :");
    scanf("%d",&s);
    p=linearSearch(a,n,s);

    // show result
    if(p==-1){
        printf("Element not found");
    }else{
        printf("Element found at index : %d \n",p);
    }

}

// Time Complexity:O(N)