import sys


def tower_of_hanoi(n_disks):
    def hanoi(n, src, tmp, dst):
        if n <= 0:
            return
        # move (n-1) disks from src to tmp
        hanoi(n - 1, src, dst, tmp)
        # move n-th disk from src to dst
        print('{0} -> {1}'.format(src, dst))
        # move (n-1) disks from tmp to dst
        hanoi(n - 1, tmp, src, dst)
    hanoi(n_disks, 'p1', 'p2', 'p3')


if __name__ == '__main__':
    n = int(sys.argv[1]) if len(sys.argv) == 2 else 3
    print('tower_of_hanoi({0}):'.format(n))
    tower_of_hanoi(n)
