/**
 * 
 */
package org.ttinana.demo.financialInstruments.service;

import java.util.ArrayList;
import java.util.List;

import org.ttinana.demo.financialInstruments.model.FinancialInstrument;

/**
 * @author ttinana
 *
 */
public class FinancialInstrumentService {
	List<FinancialInstrument> list = new ArrayList<FinancialInstrument>();

	public FinancialInstrumentService() {
		FinancialInstrument fi1 = new FinancialInstrument(1L, "rs1", "ttinana");
		FinancialInstrument fi2 = new FinancialInstrument(2L, "rs2", "ttinana");
		list.add(fi1);
		list.add(fi2);

	}

	public List<FinancialInstrument> getAllFI() {
		return list;

	}

	public FinancialInstrument getFI(long id) {
		int i = (int) id;
		FinancialInstrument fi1 = list.get(i - 1);
		return fi1;
	}

	public FinancialInstrument postFI(FinancialInstrument fi) {
		list.add(fi);
		return fi;

	}

}
