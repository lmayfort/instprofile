package com.sungardhe.csicode.instprofile

class Modification {

   //Modifications belong to products and institutions
static belongsTo = [product:Product, institution:Institution]
String toString(){
         return "${name}"
     }
    static constraints = {
         name(blank:false)
         description(blank:true, nullable:true)
         activeInd(inList:["Y", "N"])
         updatedByEmail(blank:true, nullable:true)
         available(blank:true, nullable:true)
         dateCreated()
         lastUpdated()
    }
    String name
    String description
    String activeInd
    String updatedByEmail
    String available
    Date  dateCreated 
    Date  lastUpdated
}