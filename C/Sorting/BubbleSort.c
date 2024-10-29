#include <stdio.h>
void bubbleSort(int arr[],int n){
    int i,j,temp,swap=0;
    for(i=0;i<n;i++){
        for ( j =0; j < n-i-1; j++){
            if(arr[j]>arr[j+1]){
                // swap
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=1;
            }
        }
        if (!swap){
            break;
        }  
    }
}
int main(){
    int n,a[100],i,p;
    printf("\nEnter the number of elements:");
    scanf("%d",&n);

    //Input the array elements
    printf("Enter the array elements:");
    for ( i=0 ; i<n ; i++){
        scanf("%d",a+i);
    }
    // Show elements in a array before sorting
    printf("Elements in the array before sorting:");
    for( i=0 ; i<n ; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
    bubbleSort(a,n);
    // Show elements in a array after sorting
    printf("Elements in the array after sorting:");
    for( i=0 ; i<n ; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
}
// Time Complexity:O(N^2)