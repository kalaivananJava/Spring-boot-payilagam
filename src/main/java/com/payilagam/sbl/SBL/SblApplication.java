package com.payilagam.sbl.SBL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication // to tell the compiler it is a springboot application
public class SblApplication {

	

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SblApplication.class, args);// means compiler  project run panna spring application run panra maari run panu

		// Home h = new Home();
		// h.connect(); // it is not advisable we may change the house frequently....
		//Home  class ku namma object create pannamam spring boot directly create object by ConfigurableApplicationContext.
       //Spring boot is populared by auto configuration ...
	   // namma project thevai aaana all configurations spring boot paathukkum..
       // pojo class are called bean . developer  home nu class compile pani vechurken antha class kku thevaiyaana ellathaiyum spring boot paahuka  
	 
	  Home bean = context.getBean(Home.class);//summa kudutha no such qualifying bean of type nu error varum becoz. Home.class pass panna SB naala kandupudikka mudiyathu .SB kandu pidikka @Component nu antha object create panra pojo class ku  kuduthaa thaa Jvm kulla Spring container ulla spring objects create aagum..
	  bean.connect();
	//   Home obj2 = context.getBean(Home.class);
	//   obj2.connect();//SB willl create only one object so that's why it is called Singleton scope. so athunaala thhaa constructor one time mattum call aaguthu.
	  //in SB it is not object. it is know as Spring Bean. we can create more objects but not by this setup. creating more objects is called Prototype scope.
	  // to create more object we need to add anothe annotation known as @Scope(value="prototype") in pojo class. so this annotation will create objects for each creating bean. By default SB is follwing Singleton scope..
	  /*
	   * SpringApplication.run()=> it setsup default configuration for the project
	   * starts the springApplication Context Automatically
	   * Starts and stop the servers
	   * Class Path scan  for that bean creation @Component..
	   * home class object illama context vechae antha class access pandrom..
	   * 
	   * 
	   */
  //Autowiring
  /*
   * 
   */



	}

}
