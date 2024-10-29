#include <stdio.h>
void selectionSort(int arr[],int n){
    int i,j,temp;
    for(i=0;i<n-1;i++){
        for ( j = i+1; j < n; j++){
            if(arr[i]>arr[j]){
                // swap
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
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
    selectionSort(a,n);
    // Show elements in a array after sorting
    printf("Elements in the array after Selection sorting:");
    for( i=0 ; i<n ; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
}
// Time Complexity:O(N^2)