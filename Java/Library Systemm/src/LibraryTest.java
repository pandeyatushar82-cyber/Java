public class LibraryTest {
    public static void main(String[] args) {

        EBook e = new EBook();
        PhysicalBook p = new PhysicalBook();

        e.search("Java");
        p.search("Java");
    }
}