
#include <stdio.h>
int Partition(int A[],int low,int high){
    int pivot=A[low],left=low,right=high;
    while(left<right){
        while(left<high && A[left]<=pivot){
            left++;
        }
        while(right>low && A[right]>pivot){
            right--;
        }
        if(left<right){
            int temp = A[left];
            A[left]=A[right];
            A[right]=temp;
        }
    
    }
    int temp2=A[low];
    A[low]=A[right];
    A[right]=temp2;
    return right;
}

void quickSort(int A[],int low,int high){
    if(low<high){
        int p= Partition(A,low,high);
        quickSort(A,low,p-1);
        quickSort(A,p+1,high);
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
    quickSort(a,0,n-1);
    // Show elements in a array after sorting
    printf("Elements in the array after  quick sort:");
    for( i=0 ; i<n ; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
}
// Time Complexity:O(N^2) Average case:Theta(logN)