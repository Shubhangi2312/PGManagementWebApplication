package myinternship.admin.vo;

public class RoomSetup {

	public RoomSetup() {
		// TODO Auto-generated constructor stub
	}
	
	Integer roomId;
	Integer roomNo;
	String typeOfRoom;
	String roomStatus;//A-Available,B-Booked
	Integer roomCharge;
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public Integer getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	public Integer getRoomCharge() {
		return roomCharge;
	}
	public void setRoomCharge(Integer roomCharge) {
		this.roomCharge = roomCharge;
	}
	
	

}
