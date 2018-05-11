/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sl07;

import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author stoyan.botusharov
 */
public class Finder {
	private String message;
	private List list;
	
	public Finder(String message, List list) {
		this.message=message;
		this.list=list;
	}

	public String find() {
		int pos = 0;
		long timeStart = System.currentTimeMillis();
		for (int i = 0; i < this.message.length(); i++) {
			pos=get(list, message.charAt(i), 0, 122, i);
		}
		System.out.println((System.currentTimeMillis() - timeStart) / 1000);
		return (String) list.get(pos+1);
	}

	private int get(List<String> lista, char key, int low, int high, int i) {
		int mid;
		mid = (low + high) / 2;
		if ((mid < low) || (high < 0)) {
			return -1; //Valore non trovato
		} else if (key < (int) lista.get(mid).charAt(i)) {
			return get(lista, key, low, mid - 1, i);
		} else if (key <= (int) lista.get(mid).charAt(i)) {
			return mid;
		} else {
			return get(lista, key, mid + 1, high, i);
		}
	}
}
