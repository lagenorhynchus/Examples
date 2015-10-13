"use strict"

class User
  constructor: (@id, @name) ->

  toString: ->
    "User(#{@id}, \"#{@name}\")"

users = [
  new User(3, "A"),
  new User(1, "B"),
  new User(2, "C")
]
console.log "users: #{users}"

sortedUsers1 = users.concat()
sortedUsers1.sort((x, y) -> x.id - y.id)
console.log "sortedUsers1: #{sortedUsers1}"
