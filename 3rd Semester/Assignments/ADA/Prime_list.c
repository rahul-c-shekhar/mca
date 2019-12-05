#include <stdio.h>
int main() 
{
	int	n, i, j;
	int	num[100];
	printf("Enter a positive number : ");
	scanf("%d", &n);

	for(i = 1; i <= n; i++) 
	{
		num[i] = i;
	}

	for(i = 2; i * i <= n; i++) 
	{
		if(num[i] != 0) 
		{
			for(j = 2 * i; j <= n; j=j+i) 
			num[j] = 0;
		}
	}

	for(i = 2; i <= n; i++) 
	{
		if(num[i] != 0) 
		{
			printf("%d\t", i);
		}
	}
	printf("\n");
	return 0;
}
