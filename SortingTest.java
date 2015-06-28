import java.util.*;
import java.util.stream.*;

public class SortingTest {
  public static class User {
    private int id;
    private String name;

    public User(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return String.format("User(%d, \"%s\")", this.id, this.name);
    }
  }

  public static void main(String[] args) {
    List<User> users = Arrays.asList(
      new User(3, "A"),
      new User(1, "B"),
      new User(2, "C")
    );
    System.out.println("users: " + users);

    List<User> sortedUsers1 = new ArrayList<>(users);
    Collections.sort(sortedUsers1, new Comparator<User>() {
      @Override
      public int compare(User x, User y) {
        return x.getId() - y.getId();
      }
    });
    System.out.println("sortedUsers1: " + sortedUsers1);

    List<User> sortedUsers2 = new ArrayList<>(users);
    Collections.sort(sortedUsers2, (x, y) -> x.getId() - y.getId());
    System.out.println("sortedUsers2: " + sortedUsers2);

    List<User> sortedUsers3 = users.stream()
      .sorted((x, y) -> x.getId() - y.getId())
      .collect(Collectors.toList());
    System.out.println("sortedUsers3: " + sortedUsers3);

    List<User> sortedUsers4 = users.stream()
      .sorted(Comparator.comparing(x -> x.getId()))
      .collect(Collectors.toList());
    System.out.println("sortedUsers4: " + sortedUsers4);

    List<User> sortedUsers5 = users.stream()
      .sorted(Comparator.comparing(User::getId))
      .collect(Collectors.toList());
    System.out.println("sortedUsers5: " + sortedUsers5);
  }
}
