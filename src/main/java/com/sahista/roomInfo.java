package com.sahista;

public class roomInfo {
private String roomno;
private String floorno;
private String roomtype;
public String getRoomno() {
	return roomno;
}
public void setRoomno(String roomno) {
	this.roomno = roomno;
}
public String getFloorno() {
	return floorno;
}
public void setFloorno(String floorno) {
	this.floorno = floorno;
}
public String getRoomtype() {
	return roomtype;
}
public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}
public roomInfo(String roomno, String floorno, String roomtype) {
	super();
	this.roomno = roomno;
	this.floorno = floorno;
	this.roomtype = roomtype;
}
public roomInfo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "roomInfo [roomno=" + roomno + ", floorno=" + floorno + ", roomtype=" + roomtype + "]";
}

}
