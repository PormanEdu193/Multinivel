package Model;

public class Calculate {
    private float num_1,num_2,result;
    private char operator;
    private String error;

    public Calculate() {
        num_1=num_2=result=0;
        operator='\0';
        error="";
    }

    public float getNum_1() {
        return num_1;
    }

    public void setNum_1(float num_1) {
        this.num_1 = num_1;
    }

    public float getNum_2() {
        return num_2;
    }

    public void setNum_2(float num_2) {
        this.num_2 = num_2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public String getError() {
        return error;
    }

    public float Operation(){
        switch(operator){
            case '+':{
                result=num_1+num_2;
                break;
            }
            case '-':{
                result=num_1-num_2;
                break;
            }
            case '*':{
                result=num_1*num_2;
                break;
            }
            case '/':{
                result=num_1/num_2;
                break;
            }
            default:{
                error="Operador no valido";
                break;
            }
        }
        return result;
    }
}