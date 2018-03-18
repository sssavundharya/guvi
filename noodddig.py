#80
n=int(input())
count=0
while(n>0):
    rem=n%10
    n=n//10
    if(rem%2!=0):
        count+=1
print(count)

