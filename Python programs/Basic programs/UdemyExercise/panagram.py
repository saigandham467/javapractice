def panagram(con):
    alpha="abcdefghijklmnopqrstuvwxyz"
    alphad={c:0 for c in alpha}

    for i in con:
        if(i==' '):
            continue
        alphad[i.lower()]+=1

    for i in alphad:
        if(alphad[i]==0):
            print("{}: is not panagram".format(con))
            return

    print("is panagram")

con="abcdefghijklmnopqrstuvwxyz"
panagram(con)