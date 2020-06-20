package myinternship.admin.action;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myinternship.admin.service.LoginDaoService;
import myinternship.admin.service.LoginService;
import myinternship.admin.vo.FeeCollection;
import myinternship.admin.vo.FeePayment;
import myinternship.admin.vo.RegisterTenant;
import myinternship.admin.vo.RoomAllotment;
import myinternship.admin.vo.RoomSetup;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

 
public class LoginAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,SessionAware{
	
	 
	private static long serialVersionUID = 1L;
	private String userName="";
	private String password="";	 
	HttpServletRequest request;
	HttpServletResponse response;
	
	public LoginService loginservice=new LoginDaoService();
	
	RegisterTenant	objTenant	=new RegisterTenant();
	RoomSetup objroom =new RoomSetup();
	RoomAllotment objallot=new RoomAllotment();
	FeeCollection objfee = new FeeCollection();
	
	public RoomSetup getObjroom() {
		return objroom;
	}

	public void setObjroom(RoomSetup objroom) {
		this.objroom = objroom;
	}

	public List<RegisterTenant> 	tenantList;
	public List<RegisterTenant> 	availableTenantList;
	public List<RoomSetup> roomSetupList;
	public List<RoomAllotment> roomAllotmentList;
	
	public List<RoomAllotment> roomAvailableList;
	public List<RoomAllotment> tenantAvailableList;
	
	public List<FeeCollection> feeCollectionList;
	
	
	SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy"); 
	
	String 		status;	
	String 		strDate;
	String 		pagenumber="1";
	String 		pagestatus="F";
	int 		firstresult=0;
	int 		maxresult=10;
	int 		firstresults=0;
	int 		maxresults=15;
	int 		maxresultss=10000;
	String 		remainingvalue;
	String 		strValue1;
	String 		strValue2;
	
	String 		activationDate="31-01-2017";
	String		expiredDate="12-02-2020";
	String		twday;
	Long		countList;
	int			maxquesrersult=1;
	
	Integer		intvalue1;
	Integer     intvalue2;
	
	 
	public String registerTenant(){
		tenantList=loginservice.getAllTenantList();
		return "done";
	}
	
	public String saveTenantInfo() throws ParseException{
		objTenant.setTenantStatus("A");
		objTenant.setAdmissiondate(sdf.parse(strDate));
		loginservice.saveNewTenantInfo(objTenant);
		return "save";
	}
	
	public String editTenantInfo(){
		objTenant=loginservice.editTenantById(objTenant.getTenantId());
		tenantList=loginservice.getUniqueTenantInfo(objTenant.getTenantId());
		return "edit";
	}
	

	public String removeTenant(){
		loginservice.removeTenantInfo(objTenant.getTenantId());
		return "remove";
	}
	
	
	
	public String saveRoomInfo()
	{
		objroom.setRoomStatus("A");
		loginservice.saveNewRoomInfo(objroom);
		return "save";

	}
	
	public String roomAllotment()
	{
		roomSetupList=loginservice.getAllRoomSetupList();
		tenantList=loginservice.getAllTenantList();
		roomAllotmentList = loginservice.getAllRoomAllotmentList();
		
		
		tenantAvailableList = loginservice.getAllTenantAvailableList(intvalue1);
		roomAvailableList = loginservice.getAllRoomAvailableList(intvalue2);
		return "done";
	}
	
	
	public String saveAllotmentInfo()
	{
		objallot.roomInfo = new RoomSetup();
		objallot.tenantInfo = new  RegisterTenant();
		
		objallot.tenantInfo.setTenantId(intvalue1);
		objallot.roomInfo.setRoomId(intvalue2);

		
		loginservice.saveNewAllotmentInfo(objallot);
		
		loginservice.updateRoomById(intvalue2);
		return "save";
	}
	
	public String editRoomAllotmentInfo()
	{
		objallot=loginservice.editRoomAllotmentById(objallot.getAllotmentId());
		
		roomAllotmentList=loginservice.getUniqueRoomAllotmentInfo(objallot.getAllotmentId());
		
		roomSetupList=loginservice.getAllRoomSetupList();
		tenantList=loginservice.getAllTenantList();
		return "edit";
	}
	
	public String registerRoom()
	{
		roomSetupList=loginservice.getAllRoomSetupList();
		return "done";
	}

	public String editRoomInfo()
	{
		objroom=loginservice.editRoomSetupById(objroom.getRoomId());
		roomSetupList=loginservice.getUniqueRoomSetupInfo(objroom.getRoomId());
		return "edit";
	}

	
	public String removeRoom()
	{
		loginservice.removeRoomInfo(objroom.getRoomId());
		return "remove";
	}
	
	public String feecollection()
	{
		roomAllotmentList=loginservice.getUniqueTenantByRoom(intvalue1);
		availableTenantList = loginservice.getAllAvailableTenantList();
		feeCollectionList=loginservice.getAllFeeCollectionList();
		return "done";
	}
	
	public String saveFeeInfo()
	{
		objfee.tenantInfo = new  RegisterTenant();
		objfee.tenantInfo.setTenantId(intvalue1);
		loginservice.saveNewFeeInfo(objfee);
		return "save";
	}
	
	public String leaveTenant()
	{
		loginservice.leaveTenantInfo(objTenant.getTenantId());
		return "leave";
	}
	

	/***********************************Getter Setter Start****************************************/
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public String library(){
		return "done";
	}


	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSession(Map arg0) {
		// TODO Auto-generated method stub
		
	}


	public HttpServletRequest getRequest() {
		return request;
	}


	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}


	public HttpServletResponse getResponse() {
		return response;
	}


	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}


	public LoginService getLoginservice() {
		return loginservice;
	}


	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public static long getSerialVersionUID() {
		return serialVersionUID;
	}



	public static void setSerialVersionUID(long serialVersionUID) {
		LoginAction.serialVersionUID = serialVersionUID;
	}
	 
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the strDate
	 */
	public String getStrDate() {
		return strDate;
	}

	/**
	 * @param strDate the strDate to set
	 */
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}

	/**
	 * @return the pagenumber
	 */
	public String getPagenumber() {
		return pagenumber;
	}

	/**
	 * @param pagenumber the pagenumber to set
	 */
	public void setPagenumber(String pagenumber) {
		this.pagenumber = pagenumber;
	}

	/**
	 * @return the pagestatus
	 */
	public String getPagestatus() {
		return pagestatus;
	}

	/**
	 * @param pagestatus the pagestatus to set
	 */
	public void setPagestatus(String pagestatus) {
		this.pagestatus = pagestatus;
	}

	/**
	 * @return the firstresult
	 */
	public int getFirstresult() {
		return firstresult;
	}

	/**
	 * @param firstresult the firstresult to set
	 */
	public void setFirstresult(int firstresult) {
		this.firstresult = firstresult;
	}

	/**
	 * @return the maxresult
	 */
	public int getMaxresult() {
		return maxresult;
	}

	/**
	 * @param maxresult the maxresult to set
	 */
	public void setMaxresult(int maxresult) {
		this.maxresult = maxresult;
	}

	/**
	 * @return the firstresults
	 */
	public int getFirstresults() {
		return firstresults;
	}

	/**
	 * @param firstresults the firstresults to set
	 */
	public void setFirstresults(int firstresults) {
		this.firstresults = firstresults;
	}

	/**
	 * @return the maxresults
	 */
	public int getMaxresults() {
		return maxresults;
	}

	/**
	 * @param maxresults the maxresults to set
	 */
	public void setMaxresults(int maxresults) {
		this.maxresults = maxresults;
	}

	/**
	 * @return the maxresultss
	 */
	public int getMaxresultss() {
		return maxresultss;
	}

	/**
	 * @param maxresultss the maxresultss to set
	 */
	public void setMaxresultss(int maxresultss) {
		this.maxresultss = maxresultss;
	}

	/**
	 * @return the remainingvalue
	 */
	public String getRemainingvalue() {
		return remainingvalue;
	}

	/**
	 * @param remainingvalue the remainingvalue to set
	 */
	public void setRemainingvalue(String remainingvalue) {
		this.remainingvalue = remainingvalue;
	}

	/**
	 * @return the strValue1
	 */
	public String getStrValue1() {
		return strValue1;
	}

	/**
	 * @param strValue1 the strValue1 to set
	 */
	public void setStrValue1(String strValue1) {
		this.strValue1 = strValue1;
	}

	/**
	 * @return the strValue2
	 */
	public String getStrValue2() {
		return strValue2;
	}

	/**
	 * @param strValue2 the strValue2 to set
	 */
	public void setStrValue2(String strValue2) {
		this.strValue2 = strValue2;
	}

	/**
	 * @return the activationDate
	 */
	public String getActivationDate() {
		return activationDate;
	}

	/**
	 * @param activationDate the activationDate to set
	 */
	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}

	/**
	 * @return the expiredDate
	 */
	public String getExpiredDate() {
		return expiredDate;
	}

	/**
	 * @param expiredDate the expiredDate to set
	 */
	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	/**
	 * @return the twday
	 */
	public String getTwday() {
		return twday;
	}

	/**
	 * @param twday the twday to set
	 */
	public void setTwday(String twday) {
		this.twday = twday;
	}

	/**
	 * @return the countList
	 */
	public Long getCountList() {
		return countList;
	}

	/**
	 * @param countList the countList to set
	 */
	public void setCountList(Long countList) {
		this.countList = countList;
	}

	/**
	 * @return the maxquesrersult
	 */
	public int getMaxquesrersult() {
		return maxquesrersult;
	}

	/**
	 * @param maxquesrersult the maxquesrersult to set
	 */
	public void setMaxquesrersult(int maxquesrersult) {
		this.maxquesrersult = maxquesrersult;
	}

	/**
	 * @return the intvalue1
	 */
	public Integer getIntvalue1() {
		return intvalue1;
	}

	/**
	 * @param intvalue1 the intvalue1 to set
	 */
	public void setIntvalue1(Integer intvalue1) {
		this.intvalue1 = intvalue1;
	}

	/**
	 * @return the sdf
	 */
	public SimpleDateFormat getSdf() {
		return sdf;
	}

	/**
	 * @param sdf the sdf to set
	 */
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	/**
	 * @return the objTenant
	 */
	public RegisterTenant getObjTenant() {
		return objTenant;
	}

	/**
	 * @param objTenant the objTenant to set
	 */
	public void setObjTenant(RegisterTenant objTenant) {
		this.objTenant = objTenant;
	}

	/**
	 * @return the tenantList
	 */
	public List<RegisterTenant> getTenantList() {
		return tenantList;
	}

	/**
	 * @param tenantList the tenantList to set
	 */
	public void setTenantList(List<RegisterTenant> tenantList) {
		this.tenantList = tenantList;
	}

	public RoomAllotment getObjallot() {
		return objallot;
	}

	public void setObjallot(RoomAllotment objallot) {
		this.objallot = objallot;
	}

	public List<RoomSetup> getRoomSetupList() {
		return roomSetupList;
	}

	public void setRoomSetupList(List<RoomSetup> roomSetupList) {
		this.roomSetupList = roomSetupList;
	}

	public Integer getIntvalue2() {
		return intvalue2;
	}

	public void setIntvalue2(Integer intvalue2) {
		this.intvalue2 = intvalue2;
	}

	public List<RoomAllotment> getRoomAllotmentList() {
		return roomAllotmentList;
	}

	public void setRoomAllotmentList(List<RoomAllotment> roomAllotmentList) {
		this.roomAllotmentList = roomAllotmentList;
	}

	public List<RoomAllotment> getRoomAvailableList() {
		return roomAvailableList;
	}

	public void setRoomAvailableList(List<RoomAllotment> roomAvailableList) {
		this.roomAvailableList = roomAvailableList;
	}

	public FeeCollection getObjfee() {
		return objfee;
	}

	public void setObjfee(FeeCollection objfee) {
		this.objfee = objfee;
	}

	public List<RoomAllotment> getTenantAvailableList() {
		return tenantAvailableList;
	}

	public void setTenantAvailableList(List<RoomAllotment> tenantAvailableList) {
		this.tenantAvailableList = tenantAvailableList;
	}

	/**
	 * @return the feeCollectionList
	 */
	public List<FeeCollection> getFeeCollectionList() {
		return feeCollectionList;
	}

	/**
	 * @param feeCollectionList the feeCollectionList to set
	 */
	public void setFeeCollectionList(List<FeeCollection> feeCollectionList) {
		this.feeCollectionList = feeCollectionList;
	}


	 
	 
	
		
/******************************************Getter setter parts ends**************************************************************************/	
	
}

