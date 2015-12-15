# coding: utf-8

import sys

from scipy.misc import comb


def pascals_triangle(m):
    def row(n):
        return ' '.join('{0:>5}'.format(comb(n, k, 1)) for k in range(n + 1))
    width = len(row(m - 1))
    for n in range(m):
        print(row(n).center(width))


if __name__ == '__main__':
    n = 5
    if len(sys.argv) == 2:
        n = int(sys.argv[1])
    pascals_triangle(n)
