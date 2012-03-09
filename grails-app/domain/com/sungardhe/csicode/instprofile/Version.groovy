package com.sungardhe.csicode.instprofile

class Version {
      static belongsTo = [product:Product]
//show the belonging relationship by showing last name
 String toString(){
         return "${name}"}
    static constraints = {
        name(blank:false)
        notes(blank:true, nullable:true)
        updatedByEmail(blank:true, nullable:true)
    }
    String name
    String notes
    String updatedByEmail
   
}
