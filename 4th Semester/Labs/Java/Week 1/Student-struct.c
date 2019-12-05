#include<stdio.h>

struct Student
{
    char    name[30];
    int     age;
    char    srn[10];
};

int main()
{
    struct Student s[10];
    int     n;
    printf("Enter the number of students : ");
    scanf("%d",&n);
    printf("\nEnter the Student Details : ");
    for(int i = 1; i <= n; i++)
    {
        printf("\nStudent number : %d\n",i);
        printf("\nEnter the Student's Name : ");
        scanf("%s",s[i].name);
        printf("\nEnter the Student's Age : ");
        scanf("%d",&s[i].age);
        printf("\nEnter the Student's SRN : ");
        scanf("%s",s[i].srn);
    }
    printf("\n    Student Details     ");
    for(int i = 1; i <= n; i++)
    {
        printf("\nStudent Name : %s",s[i].name);
        printf("\nStudent Age : %d",s[i].age);
        printf("\nStudent SRN : %s",s[i].srn);
        printf("\n");
    }

    return 1;
    
}