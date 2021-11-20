package Good;


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

//Here, Parent class Database can be used as reference because child class - Mysql, sqlite has no unique method. 
class Checker {
    void check(Database db) {
        db.connect();
        db.get();
        db.post(new Object());
    }
}

class Liskov{
    public static void main(String[] args) {
        System.out.println("Liskov");

        Database sql1 = new Mysql();
        Database sql2 = new Sqlite();
        Checker checker = new Checker();

        checker.check(sql1);
        checker.check(sql2);
    }
}