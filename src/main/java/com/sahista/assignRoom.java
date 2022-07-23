package com.sahista;

public class assignRoom {
private String room_no;
private String roomtype;
private String facility;
public String getRoom_no() {
	return room_no;
}
public void setRoom_no(String room_no) {
	this.room_no = room_no;
}
public String getRoomtype() {
	return roomtype;
}
public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}
public String getFacility() {
	return facility;
}
public void setFacility(String facility) {
	this.facility = facility;
}
public assignRoom(String room_no, String roomtype, String facility) {
	super();
	this.room_no = room_no;
	this.roomtype = roomtype;
	this.facility = facility;
}
public assignRoom() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "assignRoom [room_no=" + room_no + ", roomtype=" + roomtype + ", facility=" + facility + "]";
}

}
