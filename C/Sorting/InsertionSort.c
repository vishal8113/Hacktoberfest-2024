#include <stdio.h>
void insertionSort(int arr[],int n){
    int i,j,temp;
    for(i=1;i<n;i++){
        for ( j =i ,temp=arr[i]; j >0 && arr[j-1]>temp; j--){
            // if(arr[j-1]<temp){
            //     break;
            // }
            arr[j]=arr[j-1];
        }
        arr[j]=temp;
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
    insertionSort(a,n);
    // Show elements in a array after sorting
    printf("Elements in the array after Insertion sorting:");
    for( i=0 ; i<n ; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
}
// Time Complexity:O(N^2)