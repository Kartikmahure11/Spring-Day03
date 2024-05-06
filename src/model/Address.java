package model;

public class Address {
	private int plotNo;
	private String area;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int plotNo, String area) {
		super();
		this.plotNo = plotNo;
		this.area = area;
	}
	
	
	public Address(int plotNo) {
		super();
		this.plotNo = plotNo;
		
	}
	
	public Address(String area) {
		super();
		this.area = area;
	}
	
	public int getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", area=" + area + "]";
	}


}
