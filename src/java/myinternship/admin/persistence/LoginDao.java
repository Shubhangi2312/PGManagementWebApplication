package myinternship.admin.persistence;

import java.util.List;

import myinternship.admin.vo.FeeCollection;
import myinternship.admin.vo.FeePayment;
import myinternship.admin.vo.RegisterTenant;
import myinternship.admin.vo.RoomAllotment;
import myinternship.admin.vo.RoomSetup;


public interface LoginDao {

	List<RegisterTenant> getAllTenantList();

	void saveNewTenantInfo(RegisterTenant objTenant);

	RegisterTenant editTenantById(Integer tenantId);

	List<RegisterTenant> getUniqueTenantInfo(Integer tenantId);

	void removeTenantInfo(Integer tenantId);

	void saveNewRoomInfo(RoomSetup objroom);

	List<RoomSetup> getAllRoomSetupList();

	RoomSetup editRoomSetupById(Integer roomId);

	List<RoomSetup> getUniqueRoomSetupInfo(Integer roomId);

	void removeRoomInfo(Integer roomId);

	void saveNewAllotmentInfo(RoomAllotment objallot);

	List<RoomAllotment> getAllRoomAllotmentList();

	RoomAllotment editRoomAllotmentById(Integer allotmentId);

	List<RoomAllotment> getUniqueRoomAllotmentInfo(Integer allotmentId);

	void updateRoomById(Integer intvalue2);

	List<RoomAllotment> getAllRoomAvailableList(Integer intvalue2);

	List<RoomAllotment> getAllTenantAvailableList(Integer intvalue1);

	void saveNewFeeInfo(FeeCollection objfee);

	List<FeeCollection> getAllFeeCollectionList();

	List<RoomAllotment> getUniqueTenantByRoom(Integer intvalue1);

	void leaveTenantInfo(Integer tenantId);

	List<RegisterTenant> getAllAvailableTenantList();

}
