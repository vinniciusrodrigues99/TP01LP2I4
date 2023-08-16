package Ex2.classes;

class Book {
     private String name;
    private Author[] authors; // Array de autores
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        StringBuilder authorString = new StringBuilder();
        for (Author author : authors) {
            authorString.append(author.toString()).append(",");
        }
        authorString.deleteCharAt(authorString.length() - 1); // Remover a última vírgula

        return "Book[name=" + name +
                ",authors={" + authorString + "}" +
                ",price=" + price +
                ",qty=" + qty +
                "]";
    }}

