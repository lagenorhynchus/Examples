from itertools import groupby


def rle(s):
    return ''.join(c + str(len(list(cs))) for c, cs in groupby(s))
