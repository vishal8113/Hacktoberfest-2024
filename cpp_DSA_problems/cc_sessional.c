#include<stdio.h>
 
int main()
{
      int i, n, total = 0, x, count = 0, time_quantum, wt = 0, tat = 0, at[20], bt[20], temp[20];
      float avg_wt, avg_tat;
      printf("\nTotal Number of Processes: ");
      scanf("%d", &n);
      x = n;
      for(i = 0; i < n; i++)
      {
            printf("\nFor Process[%d]\n", i + 1); 
            printf("Arrival Time: "); 
            scanf("%d", &at[i]); 
            printf("Burst Time: "); 
            scanf("%d", &bt[i]); 
            temp[i] = bt[i];
      }
 
      printf("\nTime Quantum: ");
      scanf("%d", &time_quantum);
      printf("\nProcess ID\t\tArrival Time\tBurst Time\t Turnaround Time\t Waiting Time\n");
      for(total = 0, i = 0; x != 0;)
      {
            if(temp[i] <= time_quantum && temp[i] > 0)
            {
                  total = total + temp[i];
                  temp[i] = 0;
                  count = 1;
            }
            else if(temp[i] > 0)
            {
                  temp[i] = temp[i] - time_quantum;
                  total = total + time_quantum;
            }
            if(temp[i] == 0 && count == 1)
            {
                  x--;
                  printf("\nProcess[%d]\t\t%d\t\t%d\t\t%d\t\t%d", i + 1, at[i], bt[i], total - at[i], total - at[i] - bt[i]);
                  wt = wt + total - at[i] - bt[i];
                  tat = tat + total - at[i]; 
                  count = 0;
            }
            if(at[i + 1] <= total)
            {
                  i++;
            }
            else
            {
                  i = 0;
            }
      }
 
      avg_wt = wt/n;
      avg_tat = tat/n;
      printf("\nAverage Waiting Time: %f", avg_wt);
      printf("\nAvg Turnaround Time: %f\n", avg_tat);
      return 0;
}