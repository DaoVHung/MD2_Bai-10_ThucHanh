package ra.dev;

public class listTest {
    public static void main(String[] args) {
        List<Integer> listInteger = new List<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        System.out.println("element 2 " + listInteger.get(2) );
    }
}
