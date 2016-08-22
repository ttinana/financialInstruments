/**
 * 
 */
package org.ttinana.demo.financialInstruments.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ttinana
 *
 */
@XmlRootElement
public class FinancialInstrument {
	private long id;
	private String ISIN;
	private Date emissionDate;
	private String author;

	public FinancialInstrument() {

	}
	
	public FinancialInstrument(String iSIN, String author) {
		ISIN = iSIN;
		this.emissionDate = new Date();
		this.author = author;
	}

	public FinancialInstrument(long id, String iSIN, String author) {
		this.id = id;
		ISIN = iSIN;
		this.emissionDate = new Date();
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getISIN() {
		return ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	public Date getEmissionDate() {
		return emissionDate;
	}

	public void setEmissionDate(Date emissionDate) {
		this.emissionDate = emissionDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
