public class Book {
    private String name;
    private Author authors;
    private double price;
    private int qty;

    public Book(String name, Author authors, double price){
        this.authors = authors;
        this.name = name;
        this.price = price;
    }

    public Book(String name, Author authors, double price, int qty){
        this.price = price;
        this.name = name;
        this.authors = authors;
        this.qty = qty;
    }

    public Book(String javaForDummy, Author[] authors, double price, int qty) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthors() {
        return authors;
    }

    public void setAuthors(Author authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){
        return authors.getName();
    }
}
