package com.sahista;

public class Tarrif {
private	int SlNo;
private String roomType;
private String price;
private String facility;
public int getSlNo() {
	return SlNo;
}
public void setSlNo(int slNo) {
	SlNo = slNo;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getFacility() {
	return facility;
}
public void setFacility(String facility) {
	this.facility = facility;
}
public Tarrif(int slNo, String roomType, String price, String facility) {
	super();
	SlNo = slNo;
	this.roomType = roomType;
	this.price = price;
	this.facility = facility;
}

public Tarrif(String roomType, String price, String facility) {
	super();
	this.roomType = roomType;
	this.price = price;
	this.facility = facility;
}
public Tarrif() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Tarrif [SlNo=" + SlNo + ", roomType=" + roomType + ", price=" + price + ", facility=" + facility + "]";
}

}
