#105
def place(n):
    string='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    string=list(string)
    print(string[n-1])
try:
    n=int(input())
    if(n>0 and n<=26):
        place(n)
    else:
        print("error")
except:
    print("invalid")
