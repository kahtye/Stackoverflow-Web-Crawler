import java.util.ArrayList;
import java.util.*;

public class Page implements Comparable<Page>{
	String url;
	int incomingLinks;
	int upvotes;
	ArrayList<Page> incomingPages;
	int outgoingLinks;
	double pr;
	double prevPr;
	
	public Page(String url, String upvotes) {
		this.url = url;
		this.upvotes = Integer.parseInt(upvotes);
		incomingPages = new ArrayList<Page>();
	}
	
	public int compareTo(Page p) {
		return -Double.compare(getPr(),p.getPr());
		
	}
	public void addIncLinks() {
		incomingLinks++;
	}
	
	public void addIncomingPage(Page p) {
		incomingPages.add(p);
	}
	
	public void addNumOutGoing() {
		outgoingLinks++;
	}
	
	public void setPr(double _pr) {
		pr = _pr;
	}
	
	public void setPrevPr(double _pr) {
		prevPr = _pr;
	}
	
	public double getPr() {
		return pr;
	}
	
}


