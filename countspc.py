import re
x=input()
new=re.sub('[\w]+','',x)
print(len(new))
