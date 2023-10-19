
// Problem Statement : 70. Climbing Stairs

// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

class Solution {
    public int climbStairs(int n) {
        //Based on fibonacci series 
        //so seried=s will be 1,2,3,5,8,13.......
        //therefor the first elemnts there is no need of adding previous elements
        int[] a= new int[n];
        
        {
            if(n<=3)   
            {
            return n;
            }
            for(int i=2;i<n;i++)
            {
                a[0]=1;
                a[1]=2;
                a[i]=a[i-1]+a[i-2];
            }
            return a[n-1];
        }
        
    }
}