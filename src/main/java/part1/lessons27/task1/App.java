package part1.lessons27.task1;

/**
 * Hello world!
 *
 */
public class App 
{
    private  double firstNumber;
    private  double secondNumber;

    public App() {

    }
    public App(double firstNumber, double secondNumber){
        this.setFirstNumber(firstNumber);
        this.setSecondNumber(secondNumber);
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculateSUM () {
        return (firstNumber+secondNumber);
    }
    public double calcateMINUS () {
        return (firstNumber-secondNumber);
    }
    public double calcatemulti (){
        return (firstNumber*secondNumber);
    }
    public double calcateDevide (){
        return (firstNumber/secondNumber);
    }
}
