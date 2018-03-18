#75
n=input()
l=len(n)
list1=list(n)
mid=l//2
list1[mid]='*'
ans=''
for x in list1:
    ans=ans+x
print(ans)

    
