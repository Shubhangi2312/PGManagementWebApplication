package myinternship.admin.persistence;

import java.util.Date;
import java.util.List;

import myinternship.actionDispatcherFilter.HibernateUtil;
import myinternship.admin.vo.FeeCollection;
import myinternship.admin.vo.FeePayment;
import myinternship.admin.vo.RegisterTenant;
import myinternship.admin.vo.RoomAllotment;
import myinternship.admin.vo.RoomSetup;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

import sun.util.logging.resources.logging;

import com.sun.org.apache.regexp.internal.recompile;


public class LoginHibernateDao implements LoginDao {
	
	public List<RegisterTenant> 	tenantList;
	public List<RoomSetup> roomSetupList;
	public List<RoomAllotment> roomAllotmentList;
	public List<RoomAllotment> roomAvailableList;
	public List<RoomAllotment> tenantAvailableList;
	
	
	public List<FeeCollection> feeCollectionList;
	public List<RegisterTenant> availableTenantList;
   
	@Override
	public List<RegisterTenant> getAllTenantList() {
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RegisterTenant");
			tenantList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return tenantList;
	}

	@Override
	public void saveNewTenantInfo(RegisterTenant objTenant) {
		Session session = HibernateUtil.getSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			if(objTenant.getTenantId()==null){
				session.save(objTenant);
			}else {
				session.update(objTenant);
			}
			tx.commit();
		} catch (RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		finally
		{
			session.close();
		}
	}

	@Override
	public RegisterTenant editTenantById(Integer tenantId) {
		Session session = HibernateUtil.getSession();
		try {
			return (RegisterTenant)session.get(RegisterTenant.class, tenantId);
			
		}finally {
			session.close();
		}
	}

	@Override
	public List<RegisterTenant> getUniqueTenantInfo(Integer tenantId) {
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RegisterTenant where tenantId=:tenantId");
			q.setInteger("tenantId", tenantId);
			tenantList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return tenantList;
	}

	@Override
	public void removeTenantInfo(Integer tenantId) {
	  Session session = HibernateUtil.getSession();
	  Transaction tx=null;
		try {
			tx=session.beginTransaction();
			Query q = session.createQuery("Delete RegisterTenant where tenantId=:tenantId");
			q.setInteger("tenantId", tenantId);
			q.executeUpdate();
			tx.commit();
		}finally {
			session.close();
		}
	}

	@Override
	public void saveNewRoomInfo(RoomSetup objroom) {
		Session session = HibernateUtil.getSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			if(objroom.getRoomId()==null)
			{
				session.save(objroom);
			}
			else {
				
				session.update(objroom);
			}
			tx.commit();
		} 
		catch (RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		finally
		{
			session.close();
		}
	}

	@Override
	public List<RoomSetup> getAllRoomSetupList() {
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RoomSetup");
			roomSetupList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return roomSetupList;
	}

	@Override
	public RoomSetup editRoomSetupById(Integer roomId) {
		Session session = HibernateUtil.getSession();
		try {
			return (RoomSetup)session.get(RoomSetup.class, roomId);
			
		}finally {
			session.close();
		}
	}

	@Override
	public List<RoomSetup> getUniqueRoomSetupInfo(Integer roomId) {
		
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RoomSetup where roomId=:roomId");
			q.setInteger("roomId", roomId);
			roomSetupList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return roomSetupList;
	}

	@Override
	public void removeRoomInfo(Integer roomId) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSession();
		  Transaction tx=null;
			try {
				tx=session.beginTransaction();
				Query q = session.createQuery("Delete RoomSetup where roomId=:roomId");
				q.setInteger("roomId", roomId);
				q.executeUpdate();
				tx.commit();
			}finally {
				session.close();
			}
		
	}

	@Override
	public void saveNewAllotmentInfo(RoomAllotment objallot) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			if(objallot.getAllotmentId()==null){
				session.save(objallot);
			}else {
				session.update(objallot);
			}
			tx.commit();
		} catch (RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		finally
		{
			session.close();
		}
		
	}

	@Override
	public List<RoomAllotment> getAllRoomAllotmentList() {
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RoomAllotment");
			roomAllotmentList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return roomAllotmentList;
	}

	@Override
	public RoomAllotment editRoomAllotmentById(Integer allotmentId) {
		Session session= HibernateUtil.getSession();
		try
		{
			return(RoomAllotment)session.get(RoomAllotment.class, allotmentId);
			
		}
		finally
		{
			session.close();
		}
	}

	@Override
	public List<RoomAllotment> getUniqueRoomAllotmentInfo(Integer allotmentId) {
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RoomAllotment where allotmentId=:allotmentId");
			q.setInteger("allotmentId", allotmentId);
			roomAllotmentList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return roomAllotmentList;
	}

	@Override
	public void updateRoomById(Integer roomId) {
		// TODO Auto-generated method stub
		Session session =  HibernateUtil.getSession();
		Transaction tx=null;
		
		try
		{
			tx=session.beginTransaction();
			Query q=session.createQuery("update RoomSetup set roomStatus='B' where roomId=:roomId");
			q.setInteger("roomId", roomId);
			q.executeUpdate();
			tx.commit();
		}
		finally
		{
			session.close();
		}
		
		
	}

	@Override
	public List<RoomAllotment> getAllRoomAvailableList(Integer rmid) {
		
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RoomAllotment where roomInfo.roomId=:rmid");
			q.setInteger("rmid", rmid);
			roomAvailableList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return roomAvailableList;
	}

	@Override
	public List<RoomAllotment> getAllTenantAvailableList(Integer tid) {
		
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RoomAllotment where tenantInfo.tenantId=:tid");
			q.setInteger("tid", tid);
			tenantAvailableList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return tenantAvailableList;
	}

	@Override
	public void saveNewFeeInfo(FeeCollection objfee) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			if(objfee.getFeeId()==null){
				session.save(objfee);
			}else {
				session.update(objfee);
			}
			tx.commit();
		} catch (RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		finally
		{
			session.close();
		}
		
		
	}

	@Override
	public List<FeeCollection> getAllFeeCollectionList() {
		
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from FeeCollection");
			feeCollectionList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return feeCollectionList;
	}

	@Override
	public List<RoomAllotment> getUniqueTenantByRoom(Integer tid) {
		

		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RoomAllotment where tenantInfo.tenantId=:tid");
			q.setInteger("tid", tid);
			roomAllotmentList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return roomAllotmentList;
	}

	@Override
	public void leaveTenantInfo(Integer tenantId) {
		Session session =  HibernateUtil.getSession();
		Transaction tx=null;
		try
		{
			tx=session.beginTransaction();
			Query q=session.createQuery("update RegisterTenant set tenantStatus='L' where tenantId=:tenantId");
			q.setInteger("tenantId", tenantId);
			q.executeUpdate();
			tx.commit();
		}
		finally
		{
			session.close();
		}
		
	}

	@Override
	public List<RegisterTenant> getAllAvailableTenantList() {
		Session session=HibernateUtil.getSession();
		try
		{
			Query q =session.createQuery("from RegisterTenant where tenantStatus='A'");
			availableTenantList=q.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return availableTenantList;
	}

	

	
	}

	

	
	
	
	


		

	