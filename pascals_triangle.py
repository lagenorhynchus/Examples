# coding: utf-8

import sys

from scipy.misc import comb


def pascals_triangle(m):
    for n in xrange(m):
        print ('  ' * (m - n - 1) + ' '.join('{0:>3}'.format(comb(n, k, 1))
                                             for k in xrange(n + 1)))


if __name__ == '__main__':
    n = 5
    if len(sys.argv) == 2:
        n = int(sys.argv[1])
    pascals_triangle(n)
