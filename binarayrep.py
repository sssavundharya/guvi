
l=['0','1']
s=0
n=input()
for i in range(len(n)):
    if n[i]in l:
        continue
    else:
        break
if s==0:
    print("yes")
else:
    print("no")
