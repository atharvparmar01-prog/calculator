class test{
    public static void main(String[] args){
        calculator opreration = new calculator(3,2);
        opreration.sub();
    }
}

class calculator{
    int num1;
    int num2;
    calculator(int a,int b){
        num1 = a;
        num2 = b;
    }
    void add(){
        System.out.println("Addition : " + (num1+num2));
    }
    void sub(){
        System.out.println("Subration : " + (num1-num2));
    }
    void multi(){
        System.out.println("Multiplication : " + (num1*num2));
    }
    void divison(){
        System.out.println("Divison : " + (num1/num2));
    }
}
