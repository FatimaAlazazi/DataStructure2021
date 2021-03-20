package lab9;
import Lab7.LinkedStack;
import java.util.Scanner;
/**
 * Created by fatima on 27/02/2020.
 */
public class EvaluateExpression {
   static LinkedStack<Double> operands= new LinkedStack<>();
    static LinkedStack<Character> operators= new LinkedStack<>();

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

    String expression= input.nextLine();
        char[] parts=expression.toCharArray();
        int i=0;
        while (i<parts.length)
        {
            if(parts[i]==' ')
            {
                i++;
                continue;
            }
            else if(parts[i]>='0' &&parts[i]<='9')
            { String value="";
                while ((i<parts.length)&&parts[i]>='0' &&parts[i]<='9'){
                   value=value+parts[i];
                    i++;
                }

                operands.push(Double.parseDouble(value));
            }

           else if(parts[i]=='+'||parts[i]=='-'||parts[i]=='/'||parts[i]=='*')
            {

                    while(!operators.isEmpty()&&hasLowerPriority(parts[i],operators.top()))
                    {Double value2=operands.pop();
                        Double value1=operands.pop();
                        operands.push(doOperation(operators.pop(), value1,value2 ));
                    }
                   operators.push(parts[i++]);

            }

        }
        while(!operators.isEmpty())
        {Double value2=operands.pop();
            Double value1=operands.pop();
            operands.push(doOperation(operators.pop(), value1,value2 ));}
        System.out.println(operands.pop());

    }
    public static boolean hasLowerPriority(char o1,char o2)
    {
        if((o1=='*'||o1=='/')&&(o2=='+'||o2=='-'))
            return false;
        else
            return true;
    }
public static Double doOperation(char operation,Double value1,Double value2)
{
    switch (operation)
    {
        case '+': return value1+value2;
        case '-': return value1-value2;
        case '/': if(value2!=0)return value1/value2;
        case '*': return value1*value2;
    }
    return new Double(-1);
}
}
