
n=int(input("enter:"))
for i in range(1,n+1):
    if(n%i!=0):
        break
    else:
        continue
if(n%i==0):
    print('yes')
else:
    print('no')
