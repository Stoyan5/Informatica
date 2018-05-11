package ElaborazioneDiEspressioni;

import static java.lang.Integer.valueOf;
import java.util.ArrayList;

public class Valutatore<T> {
    private static final char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    private static final char[] operators = {'+','-','*','/'};
    private static boolean isChar(char c) {
        for (int i = 0; i < characters.length; i++) {
            if (c == characters[i]) return true;
        }
        return false;
    }
    private static boolean isNumber(char c) {
        for (int i = 0; i < numbers.length; i++) {
            if (c == numbers[i]) return true;
        }
        return false;
    }
    private static boolean isOperator(char c) {
        for (int i = 0; i < operators.length; i++) {
            if (c == operators[i]) return true;
        }
        return false;
    }
    public ArrayList<T> dividi(String esp){
		ArrayList aL = new ArrayList();
		//AlberoBinario tree=new AlberoBinario();
        for(int i=0;i<esp.length();i++) {
            String temp="";
			if(isChar(esp.charAt(i))){
				while(isChar(esp.charAt(i))) {
					temp.concat(esp.substring(i, i));
					i++;
				}
				Variable variabile=new Variable(temp);
				aL.add(variabile);
			}else if(isNumber(esp.charAt(i))){
				while(isNumber(esp.charAt(i))){
					temp.concat(esp.substring(i, i));
					i++;
				}
				Number numero=new Number(temp);
				aL.add(numero);
			}else {
				Operator operatore=new Operator(esp.substring(i,i));
				aL.add(operatore);
			}
        }

        AlberoBinario albero=new AlberoBinario();
		return 
    }
	
}
class Variable<T> {
    String variabile;
    public Variable(String variabile){
        this.variabile=variabile;
    }
}
class Number<T>{
    Integer numero;
    public Number(String number){
        this.numero=valueOf(number);
    }
}
class Operator<T>{
    String operator;
    public Operator(String operator){
        this.operator=operator;
    }
    private static String add(Number n,Number m){
        Integer res=n.numero+m.numero;
        return res.toString();
    }
    private static String add(Number n,Variable m){
        return n.numero.toString().concat("+"+m.variabile);
    }
    private static String add(Variable n,Number m){
        return n.variabile.concat("+"+m.numero.toString());
    }
    private static String add(Variable n,Variable m){
        return n.variabile.concat("+"+m.variabile);
    }

    private static String subtract(Number n,Number m){
        Integer res=n.numero-m.numero;
        return res.toString();
    }
    private static String subtract(Number n,Variable m){
        return n.numero.toString().concat("+"+m.variabile);
    }
    private static String subtract(Variable n,Number m){
        return n.variabile.concat("+"+m.numero.toString());
    }
    private static String subtract(Variable n,Variable m){
        return n.variabile.concat("+"+m.variabile);
    }

    private static String multiply(Number n,Number m) {
        Integer res=n.numero*m.numero;
        return res.toString();
    }
    private static String multiply(Number n,Variable m){
        return n.numero.toString().concat("*"+m.variabile);
    }
    private static String multiply(Variable n,Number m){
        return n.variabile.concat("*"+m.numero.toString());
    }
    private static String multiply(Variable n,Variable m){
        return n.variabile.concat("*"+m.variabile);
    }

    private static String divide(Number n,Number m){
        Double res=n.numero.doubleValue()*m.numero.doubleValue();
        return res.toString();
    }
    private static String divide(Number n,Variable m){
        return n.numero.toString().concat("/"+m.variabile);
    }
    private static String divide(Variable n,Number m){
        return n.variabile.concat("/"+m.numero.toString());
    }
    private static String divide(Variable n,Variable m){
        return n.variabile.concat("/"+m.variabile);
    }
	
    public String execute(Number n,Number m) {
		String result="";
		switch (this.operator) {
			case "+":
				result.concat(add(n,m));
				break;
			case "-":
				result.concat(subtract(n,m));
				break;
			case "*":
				result.concat(multiply(n,m));
				break;
			case "/":
				result.concat(divide(n,m));
				break;
			default:
				break;
		}
		return result;
    }
public String execute(Number n,Variable m) {
		String result="";
		switch (this.operator) {
			case "+":
				result.concat(add(n,m));
				break;
			case "-":
				result.concat(subtract(n,m));
				break;
			case "*":
				result.concat(multiply(n,m));
				break;
			case "/":
				result.concat(divide(n,m));
				break;
			default:
				break;
		}
		return result;
    }
public String execute(Variable n,Number m) {
		String result="";
		switch (this.operator) {
			case "+":
				result.concat(add(n,m));
				break;
			case "-":
				result.concat(subtract(n,m));
				break;
			case "*":
				result.concat(multiply(n,m));
				break;
			case "/":
				result.concat(divide(n,m));
				break;
			default:
				break;
		}
		return result;
    }
public String execute(Variable n,Variable m) {
		String result="";
		switch (this.operator) {
			case "+":
				result.concat(add(n,m));
				break;
			case "-":
				result.concat(subtract(n,m));
				break;
			case "*":
				result.concat(multiply(n,m));
				break;
			case "/":
				result.concat(divide(n,m));
				break;
			default:
				break;
		}
		return result;
    }
}
