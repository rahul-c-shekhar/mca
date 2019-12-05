#include<stdio.h>
#include<stdlib.h>

void warshall(int n, int graph[][10], int r[][10]);

int main()
{
  int n, i, j, graph[10][10], r[10][10];

  printf("Enter the matrix size: \n");
  scanf("%d", &n);

  printf("Enter matrix elements: \n");

  for(i = 0; i < n; i ++)
  {
    for(j = 0; j < n; j++)
    {
      scanf("%d", &graph[i][j]);
    }
  }

  warshall(n, graph, r);

  printf("Transitive Closure: \n");

  for(i = 0; i < n; i ++)
  {
    for(j = 0; j < n; j++)
    {
            printf ("%d ", r[i][j]); 
    }
    printf("\n"); 
  } 

}

void warshall(int n, int graph[][10], int r[][10])
{
  int i, j, k;

  for(i = 0; i < n; i ++)
  {
    for(j = 0; j < n; j++)
    {
      r[i][j] = graph[i][j];
    }
  } 

  for(k = 0; k < n; k++)
  {   
    for(i = 0; i < n ;i++)
    {
      for(j = 0; j < n; j++)
      {
        r[i][j] = r[i][j] || r[i][k] && r[k][j];
      }
    }
  }

}