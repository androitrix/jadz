package org.androitrix.jadz.model;

import java.util.Date;

import javax.persistence.Column;

public abstract class HistoryIdentifiableEntity extends Identifiable implements HistoryIdentifiableEntityI {
   
   @Column(name = "WHEN_CREATED", nullable = false)
   private Date whenCreated;
   
   @Column(name = "WHEN_MODIFIED", nullable = false)
   private Date whenModified;

   public Date getWhenCreated() {
      return whenCreated;
   }

   public void setWhenCreated(Date whenCreated) {
      this.whenCreated = whenCreated;
   }

   public Date getWhenModified() {
      return whenModified;
   }

   public void setWhenModified(Date whenModified) {
      this.whenModified = whenModified;
   }
   
   

}
