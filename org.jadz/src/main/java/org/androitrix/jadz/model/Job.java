package org.androitrix.jadz.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * A job entity
 * @author shauryab
 *
 */
@Entity(name="JOB")
public class Job extends HistoryIdentifiableEntity {

   @Column(name="WHEN_COMMITMENT_START", nullable = false)
   private Date whenCommitmentStart;
   
   @Column(name="WHEN_COMMITMENT_END", nullable = false)
   private Date whenCommitmentEnd;

   /**
    * @return the whenCommitmentStart
    */
   public Date getWhenCommitmentStart() {
      return whenCommitmentStart;
   }

   /**
    * @param whenCommitmentStart the whenCommitmentStart to set
    */
   public void setWhenCommitmentStart(Date whenCommitmentStart) {
      this.whenCommitmentStart = whenCommitmentStart;
   }

   /**
    * @return the whenCommitmentEnd
    */
   public Date getWhenCommitmentEnd() {
      return whenCommitmentEnd;
   }

   /**
    * @param whenCommitmentEnd the whenCommitmentEnd to set
    */
   public void setWhenCommitmentEnd(Date whenCommitmentEnd) {
      this.whenCommitmentEnd = whenCommitmentEnd;
   }
}
