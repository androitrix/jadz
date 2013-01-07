package org.androitrix.jadz.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class Identifiable implements IdentifiableI {

   @Id
   @GeneratedValue
   @Column(name = "ID")
   private Long id;
   
   @Override
   public Long getId() {
      return id;
   }

   @Override
   public void setId(Long id) {
      this.id = id;
   }

}
