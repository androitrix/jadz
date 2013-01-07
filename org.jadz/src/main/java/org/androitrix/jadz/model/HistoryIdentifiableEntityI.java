package org.androitrix.jadz.model;

import java.util.Date;

/**
 * 
 * @author shauryab
 *
 */
public interface HistoryIdentifiableEntityI {

   public Date getWhenCreated();
   
   public void setWhenCreated(Date d);
   
   public Date getWhenModified();
   
   public void setWhenModified(Date d); 
}
