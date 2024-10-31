package zad5;

import java.util.Arrays;
import java.util.Objects;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results = new int[5];

    public Results(String firstName, String lastName, int size){
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[size];
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void addResult(int index, int result){
        results[index] = result;
    }

    public double averageResult(){
        int sum = 0;
        double avg;
        for(int result: results){
            sum += result;
        }
        avg = (double)sum/results.length;
        return avg;
    }

    @Override
    public String toString(){
        return "Results for " + firstName + " " + lastName + ": Average Score = "
                + this.averageResult() + ", Results: " + Arrays.toString(results);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Results results1 = (Results) o;
        return Objects.equals(firstName, results1.firstName) && Objects.equals(lastName, results1.lastName) && Arrays.equals(results, results1.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Arrays.hashCode(results));
    }

    public static void main(String[] args) {
        Results r1 = new Results("Karol", "Nowicki", 2);
        r1.addResult(0,3);
        r1.addResult(1,5);
        Results r2 = new Results("Karol", "Nowicki", 2);
        r2.addResult(0,3);
        r2.addResult(1,5);
        Results r3 = new Results("Karol", "Nowicki", 2);
        r3.addResult(0,3);
        r3.addResult(1,5);
        r3.addResult(2,5);
        Results r4 = new Results("Karol", "Nowicki", 2);
        r4.addResult(0,4);
        r4.addResult(1,5);
        System.out.println(r1.toString());
        System.out.println(r1.hashCode());
        System.out.println(r1.equals(r2));
        System.out.println(r3.toString());
        System.out.println(r1.equals(r3));
        System.out.println(r4.toString());
    }
}
