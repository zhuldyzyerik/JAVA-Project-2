package Project2;

abstract public class Marks {
    /*
    We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
     */
    abstract double getPercentage();

    double subject1, subject2, subject3;
    double subject4;

}

class A extends Marks{
    public  A(double subject1, double subject2, double subject3) {
   this.subject1=subject1;
    this.subject2=subject2;
    this.subject3=subject3;
    }
    @Override
double getPercentage() {
        double average = (subject1 + subject2 + subject3) / 3;
        System.out.println("The average score for student A is: " + average);
        return average;
    }}
class B extends Marks {
    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        double average = (subject1 + subject2 + subject3 + subject4) / 4;
        System.out.println("The average score for student B is: " + average);
        return average;
    }}
