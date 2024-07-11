public class Student {
    private int id;
    private String name;
    private int grade;
    private int feePaid;
    private int totalFee;

    public Student(int id, String name, int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feePaid=0;
        this.totalFee=50000;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public void payFees(int fee){
        feePaid +=fee;
        School.updateTotalMoneyEarned(feePaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public int getRemainingFees(){
        return totalFee-feePaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feePaid;
    }
}
