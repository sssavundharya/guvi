#80
n=int(input())

while(n>0):
    rem=n%10
    n=n//10
    if(rem%2!=0):
        print(rem)

