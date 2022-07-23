package com.sahista;

public class BookingInfo {
private int BookingId;
private String booking_date;
private String time;
private String roomno;
private String roomtype;
private String price;
public int getBookingId() {
	return BookingId;
}
public void setBookingId(int bookingId) {
	BookingId = bookingId;
}
public String getBooking_date() {
	return booking_date;
}
public void setBooking_date(String booking_date) {
	this.booking_date = booking_date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getRoomno() {
	return roomno;
}
public void setRoomno(String roomno) {
	this.roomno = roomno;
}
public String getRoomtype() {
	return roomtype;
}
public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public BookingInfo(int bookingId, String booking_date, String time, String roomno, String roomtype, String price) {
	super();
	BookingId = bookingId;
	this.booking_date = booking_date;
	this.time = time;
	this.roomno = roomno;
	this.roomtype = roomtype;
	this.price = price;
}
public BookingInfo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "BookingInfo [BookingId=" + BookingId + ", booking_date=" + booking_date + ", time=" + time + ", roomno="
			+ roomno + ", roomtype=" + roomtype + ", price=" + price + "]";
}

}
