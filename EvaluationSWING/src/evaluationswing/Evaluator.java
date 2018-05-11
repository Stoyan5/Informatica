package evaluationswing;

import java.util.ArrayDeque;

/**
 *
 * @author Stoyan.botusharov
 */
public class Evaluator {
    private static final char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    private static final char[] operators = {'+','-','*','/'};
	
	public Evaluator(String s){
		AlberoBinario<Character> t= new AlberoBinario();
		PrefixTranslator pTrans= new PrefixTranslator(s);
		String prefix=pTrans.translate();
		
	}
	private static boolean isOperator(char c) {
        for (int i = 0; i < operators.length; i++) {
            if (c == operators[i]) return true;
        }
        return false;
    }
	
	
}
