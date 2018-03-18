#98
n=int(input())
a=[]
for i in range(n+1):
    a.append(int(input()))
    l=list(a)
for i in range(1,n+1):
    if(l[i-1]>l[i]):
        print(l[i-1])
        break
    
