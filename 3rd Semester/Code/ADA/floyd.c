#include<stdio.h>
#include<stdlib.h>

void floyd(int n, int graph[][10], int d[][10]);

int main()
{
	int n, i, j, graph[10][10], d[10][10];
	printf("Enter the size of matrix: \n");
	scanf("%d", &n);
	printf("Enter matrix (9999 for infinity): \n");
	for(i = 0; i < n; i ++)
	{
		for(j = 0; j < n; j++)
		{
			scanf("%d", &graph[i][j]);
		}
	}

	floyd(n, graph, d);

	printf("Short Path Pairs: \n");
	for(i = 0; i < n; i ++)
	{
		for(j = 0; j < n; j++)
		{
            if (d[i][j] == 9999)
            {
                printf("%s", "inf"); 
            } 
            else
            {
                printf ("%d ", d[i][j]); 
            }
        }
        printf("\n"); 
    } 
}

void floyd(int n, int graph[][10], int d[][10])
{
	int i, j, k;

	for(i = 0; i < n; i ++)
	{
		for(j = 0; j < n; j++)
		{
			d[i][j] = graph[i][j];
		}
	}	

	for(k = 0; k < n; k++)
	{		
		for(i = 0; i < n ;i++)
		{
			for(j = 0; j < n; j++)
			{
				if(d[i][j] > d[i][k] + d[k][j])
				{
					d[i][j] = d[i][k] + d[k][j];
				}
			}
		}
	}

}