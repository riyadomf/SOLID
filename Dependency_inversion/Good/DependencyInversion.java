package Good;

// ---> Dependency Inversion
// High level modules can't be directly dependedent on low level modules.
// Here, Calculator is not directly dependent on AddOperation, SubOperation...
//  No matter what kind of operation we add, it doesn't effect the Calculator class.
//
// High level(Calculator) class communicates with Low level(AddOperation) class
//  through an abstraction(CalculatorOperation) class.  



abstract class CalculatorOperation{
    abstract double calculate(double x, double y);
}

class AddOperation extends CalculatorOperation{

    @Override
    double calculate(double x, double y) {
        return x+y;
    }

}

class SubOperation extends CalculatorOperation{

    @Override
    double calculate(double x, double y) {
        return x-y;
    }

}

class MulOperation extends CalculatorOperation{

    @Override
    double calculate(double x, double y) {
        return x*y;
    }

}

class DivOperation extends CalculatorOperation{

    @Override
    double calculate(double x, double y) {
        return x/y;
    }

}


class Calculator{
    CalculatorOperation operation;
    
    Calculator(CalculatorOperation operation){
        this.operation = operation;
    }

    double calculate(double x, double y){
        return operation.calculate(x, y);
    }
}



class DependencyInversion{
    public static void main(String[] args) {
        System.out.println("Dependency Inversion");

        Calculator calc = new Calculator(new MulOperation());
        double res = calc.calculate(5.8, 8.9);
        System.out.println(res);
    }
}