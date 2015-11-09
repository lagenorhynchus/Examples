# coding: utf-8

import sys

from scipy.misc import comb


def pascals_triangle(m):
    width = len(' '.join('{0:>5}'.format(comb(m - 1, k, 1))
                         for k in xrange(m)))
    for n in xrange(m):
        print (' '.join('{0:>5}'.format(comb(n, k, 1))
                        for k in xrange(n + 1))).center(width)


if __name__ == '__main__':
    n = 5
    if len(sys.argv) == 2:
        n = int(sys.argv[1])
    pascals_triangle(n)
