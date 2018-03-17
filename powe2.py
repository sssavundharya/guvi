def power(n):
    n=n/2
    if n==2:
        print("yes")
    elif n>2:
        power(n)
    else:
        print("no")
            
n=int(input())
power(n)
