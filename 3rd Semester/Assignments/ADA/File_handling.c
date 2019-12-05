#include<stdio.h>
int main()
{
	char	c[1000], str[1000];
	FILE	*fp;
	fp=fopen("sample.txt","r+");
	fscanf(fp,"%[^\n]",c);
	printf("\n%s",c);
	printf("\nEnter the text which you want to save into the file : ");
	scanf("%[^\n]s",str);
	fprintf(fp,"\n%s",str);
	fclose(fp);
	return 0;
}	
