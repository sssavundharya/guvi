#79
import math
def sqr(n):
    s=math.sqrt(n)
    if s==int(s):
        print("yes")
    else:
        print("no")
        
a=int(input())
b=int(input())
n=a*b
sqr(n)
    
