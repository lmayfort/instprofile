package com.sungardhe.csicode.instprofile

class Product {
static belongsTo = [institution:Institution,  person:Person]
static hasMany = [modifications:Modification, versions:Version]
String toString(){
         return "${name}"
     }
    static constraints = {
        name(blank:false)
        productDescription(blank:true, nullable:true)
        implemented(inList:["Y","N"])
        integrationNotes(blank:true, nullable:true)
        goLive()
        yearsInUse()
        nextUpgrade()
        tier()
        tierDescription(blank:true, nullable:true)
        updatedByEmail(email:true, blank:true, nullable:true)
        dateCreated()
        lastUpdated()
    }
    String name
    String implemented
    String productDescription
    String integrationNotes
    Date goLive
    BigInteger yearsInUse
    Date nextUpgrade
    Integer tier
    String tierDescription
    String updatedByEmail
    Date  dateCreated 
    Date  lastUpdated
}