import com.sungardhe.csicode.instprofile.Institution
import com.sungardhe.csicode.instprofile.StateProvinceRegion
import com.sungardhe.csicode.instprofile.Person
import com.sungardhe.csicode.instprofile.Product
import com.sungardhe.csicode.instprofile.Modification
import com.sungardhe.csicode.instprofile.Version

class BootStrap {

    def init = { servletContext ->
        //institutions
         def u1 =   Institution.findByName("University of New Mexico") ?: new Institution(name: "University of New Mexico", city: "Albuquerque", customerYear:"3/4/2012", healthSciencesInd:"Y", hospitalInd:"Y",
            country: "USA", url: "http://www.unm.edu/", factBookUrl: "http://www.unm.edu/").save(failOnError: true)
         def u2 =   Institution.findByName("Drexel University") ?: new Institution(name: "Drexel University", city: "Philadelphia", customerYear:"3/4/2012", healthSciencesInd:"Y", hospitalInd:"Y",
            country: "USA", url: "http://www.drexel.edu/", factBookUrl: "http://www.drexel.edu/").save(failOnError: true)
         def u3 =  Institution.findByName("Texas Tech University") ?: new Institution(name: "Texas Tech University", city: "Lubbock",customerYear:"3/4/2012", healthSciencesInd:"Y", hospitalInd:"Y",
            country: "USA", url: "http://www.ttu.edu/", factBookUrl: "http://www.ttu.edu/").save(failOnError: true)
       //states 
         def c1 =  new StateProvinceRegion(institution:u1,code:"NM").save(failOnError: true)
         def c2 =  new StateProvinceRegion(institution:u2,code:"PA").save(failOnError: true)
         def c3 =  new StateProvinceRegion(institution:u3,code:"TX").save(failOnError: true)
       //people   
         def p1 = new Person(institution:u1,firstName: "Duane", lastName:"Arruti", activeInd:"Y", email:"darruti@unm.edu").save(failOnError: true)
         def p2 = new Person(institution:u2,firstName: "Hannah", lastName:"Zang", activeInd:"Y", email:"hz49@drexel.edu").save(failOnError: true)
         def p3 = new Person(institution:u3, firstName: "Jorge", lastName:"Baquero", activeInd:"Y", email:"jorge.baquero@ttu.edu").save(failOnError: true)
         def p4 = new Person(institution:u1, firstName: "Linda", lastName:"Mayforth", activeInd:"Y", email:"lmayfort@unm.edu").save(failOnError: true)
         def p5 = new Person(institution:u1, firstName: "Jeff", lastName:"O'Keefe", activeInd:"Y", email:"jokeefe@unm.edu").save(failOnError: true)
        //products
         def pr1 = new Product(institution:u1, person:p1, name:"Banner Self Service", implemented: "Y", goLive:"06-MAR-2012", yearsInUse: 5, nextUpgrade: "07-Mar-2012", tier: "3").save(failOnError:true)
        //modifications
         def m1 = new Modification(institution:u1, product:pr1, name:"Open Enrollment",description: "UNM Modded", activeInd: "Y", dateCreated:"06-MAR-2012").save(failOnError: true)
         //versions
         def v1 = new Version(product:pr1, name:"8.5", notes:"Life Events not implemented", updatedByEmail:"darruti@unm.edu").save(failOnError: true)
   }   
    
      
    def destroy = {
       
        
    }
}

