#include<stdio.h>

int max(int a, int b); 
int knap_sack(int W, int weights[], int val[], int n);

int main()
{
    int i, n, val[20], weights[20], W;
    
    printf("Enter number of items: ");
    scanf("%d", &n);
    
    printf("Enter weights and values of items:\n");

    for(i = 0; i < n; i++){
        scanf("%d%d", &weights[i], &val[i]);
    }
 
    printf("Enter size of knapsack: ");
    scanf("%d", &W);
    
    printf("Total profit : %d\n", knap_sack(W, weights, val, n));

    return 0;
}


int max(int a, int b) 
{ 
    return (a > b)? a : b; 
}

int knap_sack(int W, int weights[], int val[], int n) 
{ 
    if (n == 0 || W == 0)
    { 
        return 0; 
    }
  
    if (weights[n-1] > W)
    {
        return knap_sack(W, weights, val, n-1); 
    } 
  
    else
    {
        return max(val[n - 1] + knap_sack(W - weights[n - 1], weights, val, n - 1), knap_sack(W, weights, val, n - 1));
    }    
} 
