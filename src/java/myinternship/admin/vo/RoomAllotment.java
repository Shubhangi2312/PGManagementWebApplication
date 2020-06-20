package myinternship.admin.vo;

public class RoomAllotment {

	public RoomAllotment() {
		// TODO Auto-generated constructor stub
	}
	
	Integer allotmentId;
	public myinternship.admin.vo.RegisterTenant tenantInfo;
    public myinternship.admin.vo.RoomSetup roomInfo;
    
	public Integer getAllotmentId() {
		return allotmentId;
	}
	public void setAllotmentId(Integer allotmentId) {
		this.allotmentId = allotmentId;
	}
	public myinternship.admin.vo.RegisterTenant getTenantInfo() {
		return tenantInfo;
	}
	public void setTenantInfo(myinternship.admin.vo.RegisterTenant tenantInfo) {
		this.tenantInfo = tenantInfo;
	}
	public myinternship.admin.vo.RoomSetup getRoomInfo() {
		return roomInfo;
	}
	public void setRoomInfo(myinternship.admin.vo.RoomSetup roomInfo) {
		this.roomInfo = roomInfo;
	}
    
	

}
