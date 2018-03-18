#105
def place(a):
    string='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    string=list(string)
    print(string[n-1])
try:
    a=int(input())
    if(a>0 and a<=26):
        place(a)
    else:
        print("error")
except:
    print("invalid")
