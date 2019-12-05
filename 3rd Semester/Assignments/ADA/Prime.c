#include<stdio.h>
int main()
{
	int	n,i,temp;
	printf("Enter a positive integer : ");
	scanf("%d",&n);
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			temp=0;
			break;
		}
		else
			temp=1;
	}
	if(temp)
		printf("It is a prime number\n");
	else 
		printf("It is not a prime number\n");
	return 0;
}
