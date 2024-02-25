public class TestMyLinkedList {
  /** Main method */
  public static void main(String[] args) {
    // Create a list for strings
    MyLinkedList<Integer> list = new MyLinkedList<>();
    int cnt;
    list.add(8);

	list.add(3);

	list.add(6);

	list.add(2);

	list.add(9);

	list.add(12);

	list.add(1);

	list.add(19);
	System.out.println(list);
System.out.println("Value at the 5th position is: " + list.get(4));
System.out.println("Sum: " + list.nodeSum(list.head));

  }
}