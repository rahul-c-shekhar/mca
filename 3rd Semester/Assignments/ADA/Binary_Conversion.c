#include<stdio.h>
int main()
{
	int	a[10], b[10], i=0, n, count=0;
	printf("Enter a positive number in decial format : ");
	scanf("%d",&n);
	while(n>0)
	{
		a[i]=n%2;
		n=n/2;
		i++;
	}
	printf("\nBinary conversion is : ");
	//for(i=i-1; i>=0; i--)
	i=i-1;
	while(i>=0)
	{
		printf("%d",a[i]);
		count++;
		i=i-1;
	}
	
	printf("\nNumber of binary digits = %d\n",count);
	return 0;
}
