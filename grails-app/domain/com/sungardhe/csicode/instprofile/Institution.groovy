package com.sungardhe.csicode.instprofile

class Institution {
//static searchable = true must be there for the searchable plugin   
 static searchable = true
 //Institution can have many persons and products
 static hasMany = [persons:Person, products:Product, stateprovinceregion:StateProvinceRegion]
 //This changes the ugly id way of showing institution name when on modification, product, person
 String toString(){
         return "${name}"
     }
    static constraints = {
        //specifies the field order
        name(blank:false)
        city(blank:false)
        country(blank:false)
        url(blank:false, url:true)
        factBookUrl(blank:true, url:true)
        ficeCode(blank:true, nullable:true)
        customerYear()
        numBranches(blank:true, nullable:true)
        healthSciencesInd(inList:["Y", "N"])
        hospitalInd(inList:["Y", "N"])
        totalCensus(blank:true, nullable:true)
        combAnnualExpend(blank:true, nullable:true)
        itErpFte(blank:true, nullable:true)
        itAppsFte(blank:true, nullable:true)
        itDbaFte(blank:true, nullable:true)
        itNonDbaFte(blank:true, nullable:true)
        erpGovernance(blank:true, nullable:true)
        updatedByEmail(email:true, blank:true, nullable:true)
        dateCreated()
        lastUpdated()
    }
    String name
    String city
    String country
    String url
    String factBookUrl
    String ficeCode
    BigInteger numBranches
    String healthSciencesInd
    String hospitalInd
    String totalCensus
    BigDecimal combAnnualExpend
    BigDecimal itErpFte
    BigDecimal itAppsFte
    BigDecimal itDbaFte
    BigDecimal itNonDbaFte
    String erpGovernance
    String updatedByEmail
    Date customerYear
    Date  dateCreated //Grails will automatically fill in the value 
    Date  lastUpdated //Grails will automatically fill in the value
}