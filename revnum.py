n=int(input())
re=0
while(n>0):
    re=(re*10)+(n%10)
    n=n//10
print(re)
