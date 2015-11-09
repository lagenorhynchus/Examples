class LinkedList():
    def __init__(self, value):
        self.head = Cons(value)

    def add(self, value):
        pass

    def remove(self, i):
        pass


class Cons():
    def __init__(self, value, tail=None):
        self.value = value
        self.tail = tail
