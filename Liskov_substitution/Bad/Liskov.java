package Bad;

interface Database{
    boolean connect();
    String get();
    void post(Object obj);
}

class Mysql implements Database{

    @Override
    public boolean connect() {
        System.out.println("Connected to MYSQL database");
        return true;
    }

    @Override
    public String get() {
        System.out.println("get from MYSQL database");
        return null;
    }

    @Override
    public void post(Object obj) {
        System.out.println("post to MYSQL database");
        
    }

    void display(){
        System.out.println(this.getClass().getName());
    }

}

class Sqlite implements Database{

    @Override
    public boolean connect() {
        System.out.println("Connected to Sqlite database");
        return true;
    }

    @Override
    public String get() {
        System.out.println("get from Sqlite database");
        return null;
    }

    @Override
    public void post(Object obj) {
        System.out.println("post to Sqlite database");
        
    }

}

//We know, parent class can't access unique methods of child class

// Here, we can't use Database as reference instead of Mysql.
// Because Mysql has an unique method named display(). 
// So, this code breaks the Liskov substitution principle
class Checker {
    void check(Mysql db) {
        db.connect();
        db.get();
        db.post(new Object());
        db.display();
    }
}

class Liskov{
    public static void main(String[] args) {
        System.out.println("Liskov");

        Database sql1 = new Mysql();
        Database sql2 = new Sqlite();
        Checker checker = new Checker();

        //Below code Throws error because Database is used as reference instead of Mysql
        // checker.check(sql1);
        // checker.check(sql2);
    }
}