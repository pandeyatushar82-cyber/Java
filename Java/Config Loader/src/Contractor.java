import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Contractor extends Employee {

    double hours;
    double rate;

    Contractor(String name,
               double hours,
               double rate) {

        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculatePay() {
        return hours * rate;
    }
}

