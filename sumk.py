arr=[]
count=0
add=0
n=int(input("n value"))
k=int(input("k value"))
for i in range(1,n+1):
    arr.append(i)
for i in arr:
    count=count+1
    if count<=k:
        add=add+i

        
print(add)        
