from operator import attrgetter


class User:
    def __init__(self, id, name):
        self.__id = id
        self.__name = name

    @property
    def id(self):
        return self.__id

    @property
    def name(self):
        return self.__name

    def __repr__(self):
        return 'User({0.id!r}, {0.name!r})'.format(self)


if __name__ == '__main__':
    users = [
        User(3, 'A'),
        User(1, 'B'),
        User(2, 'C')
    ]
    print('users: {0}'.format(users))

    sorted_users1 = sorted(users, key=lambda x: x.id)
    print('sorted_users1: {0}'.format(sorted_users1))

    sorted_users2 = sorted(users, key=attrgetter('id'))
    print('sorted_users2: {0}'.format(sorted_users2))
