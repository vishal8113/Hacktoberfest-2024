#include <stdio.h>
int binarySearch(int arr[],int n,int s){
    int h=n-1,l=0,m;
    while(l<=h){
        m=(l+h)/2;
        if(s<arr[m]){
            h=m-1;
        }
        else if(s>arr[m]){
            l=m+1;
        }else{
            return m+1;
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
    p=binarySearch(a,n,s);

    // show result
    if(p==-1){
        printf("Element not found \n S");
    }else{
        printf("Element found at index : %d \n",p);
    }

}
// Time Complexity:O(logN)
