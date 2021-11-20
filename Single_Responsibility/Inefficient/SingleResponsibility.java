package Inefficient;

class Book{
    private String name, author;
    private int numpage;

    Book(String name, String author, int numpage){
        this.name = name;
        this.author = author;
        this.numpage = numpage;
    }

    // This is an Inefficient approach. setInformation is responsible
    // for changing 3 properties
    void setInformation(String name, String author, int numpage){
        if(name != null) this.name = name;
        if(author != null) this.author = author;
        if(numpage != -1) this.numpage = numpage;
    }


    // print logic should be responsibility of another Class  
    public String jsonPrint(){
        //json print logic
        return "Json format";
    }

    public String xmlPrint(){
        //xml print logic
        return "xml format";
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

public class SingleResponsibility{
    public static void main(String[] args){
        Book book = new Book("Dune Messiah", "Frank Herbert", 256);

        book.setInformation("Children of Dune", null, 444);

        System.out.println(book);

        System.out.println(book.jsonPrint());
        System.out.println(book.xmlPrint());
    }
}