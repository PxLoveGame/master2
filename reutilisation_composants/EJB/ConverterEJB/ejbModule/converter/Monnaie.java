package converter;

import java.io.Serializable;

public class Monnaie implements Serializable {

	private String countryName;
	private String currencyName;
	private double rate;
	private String currencyCode;
	
	public Monnaie(String country, String currency, double r, String cc) {
		this.setCountryName(country);
		this.setCurrencyName(currency);
		this.setRate(r);
		this.setCurrencyCode(cc);
	}
	
	public Monnaie(String cc, double r) {
		this.setCurrencyCode(cc);
		this.setRate(r);
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	
}
