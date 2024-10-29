#include <stdio.h>
void merge(int *,int ,int, int);
void mergeSort(int *,int ,int);
void mergeSort(int arr[],int l,int h){
    if(l<h){
        int m=(l+h)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,h);
        merge(arr,l,m,h);
    }
    
        
}
void merge(int arr[],int l,int m,int h){
    int nums[h-l+1];
    int i=l,j=m+1,k=0;
    while(i<=m && j<=h){
        if(arr[i]<=arr[j]){
            nums[k++]=arr[i++];
        }else{
            nums[k++]=arr[j++];
        }
    }
    while(i<=m){
        nums[k++]=arr[i++];
    }
    while(j<=h){
        nums[k++]=arr[j++];
    }
    i=0;
    while(i<k){
        arr[l++]=nums[i++];
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
    mergeSort(a,0,n-1);
    // Show elements in a array after sorting
    printf("Elements in the array after sorting:");
    for( i=0 ; i<n ; i++){
        printf("%d ",a[i]);
    }
    printf("\n");
}
// Time Complexity:O(logN)