package com.sungardhe.csicode.instprofile

class StateProvinceRegion {
 static belongsTo = [institution:Institution]
 //show the belonging relationship by showing last name
 String toString(){
         return "${code}"}
    static constraints = {
        code(blank:false)
        fullName(blank:true, nullable:true)
        sortOrder(blank:true, nullable:true)
        updatedByEmail(blank:true, nullable:true)
        dateCreated()
        lastUpdated()
    }
    String code
    String fullName
    Integer sortOrder
    String updatedByEmail
    Date  dateCreated 
    Date  lastUpdated
}
