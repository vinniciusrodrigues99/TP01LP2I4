package Ex3;
class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void enrollInCourse(String courseName) {
        System.out.println(getName() + " se matriculou no curso de " + courseName);
    }

    public void payFee(double amount) {
        if (amount > 0) {
            fee -= amount;
            System.out.println(getName() + " pagou uma taxa de R$" + amount);
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[name = " + getName() +
                ", address = " + getAddress() +
                ", program = " + program +
                ", year = " + year +
                ", fee = " + fee + "]";
    }
}
