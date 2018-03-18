#94
def num(n):
    a=[]
    k=int(input("enter"))
    for i in range(n):
        a.append(int(input()))
        list1=list(a)
    print(list1[k-1])
n=int(input())
num(n)
