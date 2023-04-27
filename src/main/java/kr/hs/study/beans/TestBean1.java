package kr.hs.study.beans;

public class TestBean1 {
    private int num1;
    private int num2;

    public TestBean1(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public TestBean1() {

    }

    public int getNum1() {
        for(int i=0; i<num2; i++){
            num1+=i;
        }
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
