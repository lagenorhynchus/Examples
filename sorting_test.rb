class User
  attr_reader :id, :name

  def initialize(id, name)
    @id = id
    @name = name
  end

  def inspect
    "User(#{id}, \"#{name}\")"
  end
end

if __FILE__ == $0
  users = [
    User.new(3, "A"),
    User.new(1, "B"),
    User.new(2, "C")
  ]
  puts "users: #{users}"

  sorted_users1 = users.sort { |x, y| x.id <=> y.id }
  puts "sorted_users1: #{sorted_users1}"

  sorted_users2 = users.sort_by { |x| x.id }
  puts "sorted_users2: #{sorted_users2}"

  sorted_users3 = users.sort_by(&:id)
  puts "sorted_users3: #{sorted_users3}"
end
