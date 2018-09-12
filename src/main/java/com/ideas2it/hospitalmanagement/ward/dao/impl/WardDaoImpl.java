package com.ideas2it.hospitalmanagement.ward.dao.impl;

import java.util.List;

import com.ideas2it.hospitalmanagement.exception.ApplicationException;
import com.ideas2it.hospitalmanagement.ward.model.Ward;
import com.ideas2it.hospitalmanagement.ward.dao.WardDao;
import com.ideas2it.hospitalmanagement.genericdao.GenericDao;
import com.ideas2it.hospitalmanagement.logger.Logger;

/**
 * <p>
 * WardDAOImpl class takes of creation,updation and retrieval of wards.
 * </p>
 * @author Latheesh
 *
 */
public class WardDaoImpl extends GenericDao implements WardDao{
    
    /**
     *  {@inheritDoc}
     */
    public boolean insertWard(Ward ward) throws ApplicationException {
        try {
            return (null != super.save(ward));
        } catch (ApplicationException e) {
            Logger.error("Ward could not be added", e);
            throw new ApplicationException("Ward could not be added", e);
        }
    }
    
    /**
     *  {@inheritDoc}
     */
    public boolean updateWard(Ward ward) throws ApplicationException {
        try {
            return super.update(ward);
        } catch (ApplicationException e) {
            Logger.error("Ward could not be updated", e );
            throw new ApplicationException("Ward could not be updated", e);
        }
    }
    
    /**
     *  {@inheritDoc}
     */
    public Ward searchWard(Ward ward,String attributeName,Object attributeValue) throws ApplicationException {
        try {
            return super.getByAttribute(ward.getClass(),attributeName,attributeValue);
        } catch (ApplicationException e) {
            Logger.error("Ward could not be retrieved", e);
            throw new ApplicationException("Ward could not be retrieved", e);
        }
    }
    
    /**
     *  {@inheritDoc}
     */
    public List<Ward> getAllWards() throws ApplicationException {

        try {
            return super.getAll(Ward.class);
        } catch (ApplicationException e) {
            Logger.error("Wards could not be retrieved", e);
            throw new ApplicationException("Wards could not be retrieved", e);
        }
    }
}