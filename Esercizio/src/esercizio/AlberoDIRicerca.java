/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio;

import java.util.Comparator;

/**
 *
 * @author stoyan.botusharov
 */
public class AlberoDIRicerca<T> extends AlberoBin {
	private AlberoBin albero;
	private T dato;
	private AlberoBin sentinella;

	public AlberoDIRicerca() {
		this.albero = new AlberoBin();
	}

	public void add(T dato) {
		if (sentinella.isEmpty()) {
			sentinella.setInfo(dato);
		} else {
			if (dato.compareTo(this.albero.getInfo()) < 0) {
				if (sentinella.getSX().info == null) {
					sentinella.setSX(new AlberoBin(dato, null, null));
				} else {
					sentinella = sentinella.getSX();
				}
			} else {
				if (sentinella.getDX().info == null) {
					sentinella.setDX(new AlberoBin(dato, null, null));
				} else {
					sentinella = sentinella.getDX();
				}
			}
		}
	}

	@Override
	public int compareTo(Animal other) {
		return Integer.compare(this.year_discovered, other.year_discovered);
	}
}
