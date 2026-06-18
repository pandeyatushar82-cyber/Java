import java.util.ArrayList;
import java.io.*;

abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculatePay();
}

