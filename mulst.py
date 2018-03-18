#100
n=int(input())
s=1
while(n>0):
    rem=n%10
    s=s*rem
    n=n//10
print(s)
