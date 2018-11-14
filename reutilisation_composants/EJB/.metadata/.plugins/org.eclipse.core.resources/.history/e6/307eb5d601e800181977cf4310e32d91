package converter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;

import org.jdom2.JDOMException;

@Remote
public interface IConverter {

	public double euroToOtherCurrency(double amount, String currencyCode) throws IOException, JDOMException;
	
	public double euroToOtherCurrency(double amount, double rate);
	
	public List<Monnaie> getAvailableCurrencies() throws IOException, JDOMException;
	
	public Map<Monnaie, Double> euroToAllCurrencies(double amount) throws IOException, JDOMException;
}
