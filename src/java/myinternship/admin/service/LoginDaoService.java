package myinternship.admin.service;

import java.util.List;

import myinternship.admin.vo.FeeCollection;
import myinternship.admin.vo.FeePayment;
import myinternship.admin.vo.RegisterTenant;
import myinternship.admin.vo.RoomAllotment;
import myinternship.admin.vo.RoomSetup;


public class LoginDaoService implements LoginService {

	private myinternship.admin.persistence.LoginDao logindao;

	public LoginDaoService()
	{
		this.logindao=new myinternship.admin.persistence.LoginHibernateDao();
	}

	@Override
	public List<RegisterTenant> getAllTenantList() {
		return logindao.getAllTenantList();
	}

	@Override
	public void saveNewTenantInfo(RegisterTenant objTenant) {
		logindao.saveNewTenantInfo(objTenant);
	}

	@Override
	public RegisterTenant editTenantById(Integer tenantId) {
		return logindao.editTenantById(tenantId);
	}

	@Override
	public List<RegisterTenant> getUniqueTenantInfo(Integer tenantId) {
		return logindao.getUniqueTenantInfo(tenantId);
	}

	@Override
	public void removeTenantInfo(Integer tenantId) {
		logindao.removeTenantInfo(tenantId);
	}

	@Override
	public void saveNewRoomInfo(RoomSetup objroom) {
		// TODO Auto-generated method stub
		logindao.saveNewRoomInfo(objroom);
	}

	@Override
	public List<RoomSetup> getAllRoomSetupList() {
		// TODO Auto-generated method stub
		return logindao.getAllRoomSetupList();
	}

	@Override
	public RoomSetup editRoomSetupById(Integer roomId) {
		// TODO Auto-generated method stub
		return logindao.editRoomSetupById(roomId);
	}

	@Override
	public List<RoomSetup> getUniqueRoomSetupInfo(Integer roomId) {
		// TODO Auto-generated method stub
		return logindao.getUniqueRoomSetupInfo(roomId);
	}

	@Override
	public void removeRoomInfo(Integer roomId) {
		// TODO Auto-generated method stub
		logindao.removeRoomInfo(roomId);
		
	}

	@Override
	public void saveNewAllotmentInfo(RoomAllotment objallot) {
		// TODO Auto-generated method stub
		logindao.saveNewAllotmentInfo(objallot);
		
	}

	@Override
	public List<RoomAllotment> getAllRoomAllotmentList() {
		// TODO Auto-generated method stub
		return logindao.getAllRoomAllotmentList();
	}

	@Override
	public RoomAllotment editRoomAllotmentById(Integer allotmentId) {
		// TODO Auto-generated method stub
		return logindao.editRoomAllotmentById(allotmentId);
	}

	@Override
	public List<RoomAllotment> getUniqueRoomAllotmentInfo(Integer allotmentId) {
		// TODO Auto-generated method stub
		return logindao.getUniqueRoomAllotmentInfo(allotmentId);
	}

	@Override
	public void updateRoomById(Integer intvalue2) {
		// TODO Auto-generated method stub
		logindao.updateRoomById(intvalue2);
		
	}

	@Override
	public List<RoomAllotment> getAllRoomAvailableList(Integer intvalue2) {
		// TODO Auto-generated method stub
		return logindao.getAllRoomAvailableList(intvalue2);
	}

	@Override
	public List<RoomAllotment> getAllTenantAvailableList(Integer intvalue1) {
		// TODO Auto-generated method stub
		return logindao.getAllTenantAvailableList(intvalue1);
	}

	@Override
	public void saveNewFeeInfo(FeeCollection objfee) {
		// TODO Auto-generated method stub
		
		logindao.saveNewFeeInfo(objfee);
		
	}

	@Override
	public List<FeeCollection> getAllFeeCollectionList() {
		// TODO Auto-generated method stub
		return logindao.getAllFeeCollectionList();
	}

	@Override
	public List<RoomAllotment> getUniqueTenantByRoom(Integer intvalue1) {
		// TODO Auto-generated method stub
		return logindao.getUniqueTenantByRoom(intvalue1);
	}

	@Override
	public void leaveTenantInfo(Integer tenantId) {
		// TODO Auto-generated method stub
		logindao.leaveTenantInfo(tenantId);
	}

	@Override
	public List<RegisterTenant> getAllAvailableTenantList() {
		// TODO Auto-generated method stub
		return logindao.getAllAvailableTenantList();
	}

	

}
	


	 
   

