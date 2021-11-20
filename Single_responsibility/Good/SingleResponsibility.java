package Good;
class Book extends StylishPrint{
    private String name, author;
    private int numpage;

    Book(String name, String author, int numpage){
        this.name = name;
        this.author = author;
        this.numpage = numpage;
    }

    // This is an Efficient approach. Each setter method has only one responsibility.
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setNumpage(int numpage) {
        this.numpage = numpage;
    }

    @Override
    public String toString() {
        String str = "{\n";
        str += "    name: " + this.name + ",\n";
        str += "    author: " + this.author + ",\n";
        str += "    num page: " + this.numpage + "\n";
        str += "}";
        return str;
    }


}

class StylishPrint{
    public String jsonPrint(){
        //json print logic
        return "Json format";
    }

    public String xmlPrint(){
        //xml print logic
        return "xml format";
    }
}

public class SingleResponsibility{
    public static void main(String[] args){
        Book book = new Book("Dune Messiah", "Frank Herbert", 256);
        book.setName("Children of Dune");
        book.setNumpage(444);
        System.out.println(book);

        System.out.println(book.jsonPrint());   
        System.out.println(book.xmlPrint());
    }
}