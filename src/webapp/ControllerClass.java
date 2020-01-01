package webapp;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerClass {
	User user;
	 
	String c_ans,j_ans,cpp_ans,ds_ans;
	String a,b,c,d,q;
	@RequestMapping("/")
	public ModelAndView Display() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("msg","hello World");
		return model;
		
	} 
	@RequestMapping("/indexpage")
	public ModelAndView Display1() {
		ModelAndView model = new ModelAndView("index");
		model.addObject("msg","hello World");
		return model;
		
	}
	@RequestMapping("/Loginpage")
	public ModelAndView loginpage() {
		ModelAndView model = new ModelAndView("Login");
		model.addObject("msg","hello World");
		return model;
		
	} 
	@RequestMapping("/AboutUspage")
	public ModelAndView AboutUs() {
		ModelAndView model = new ModelAndView("AboutUs");
		model.addObject("msg","hello World");
		return model;
		
	}
	@RequestMapping("/Contactpage")
	public ModelAndView Contact() {
		ModelAndView model = new ModelAndView("Contact");
		model.addObject("msg","hello World");
		return model;
		
	}
	  

		
	
	@RequestMapping("/C_page")
	public ModelAndView c_page() throws ClassNotFoundException, SQLException {
		if(user==null) {
		ModelAndView	model = new ModelAndView("index");
		model.addObject("err","please Login first to attemptt the Quiz");
		return model;
		}else {
		ModelAndView model = new ModelAndView("c");
		QuizSubject QS=  new QuizSubject();
		ResultSet rs =  QS.c();
		if(rs.next()) {
			model = new ModelAndView("c");
			//model.addObject("msg","c");
			model.addObject("Q_NO",rs.getString("question_num"));
			model.addObject("que",rs.getString("question"));
			model.addObject("ans1",rs.getString("ans1"));
			model.addObject("ans2",rs.getString("ans2"));
			model.addObject("ans3",rs.getString("ans3"));
			model.addObject("ans4",rs.getString("ans4"));
			//model.addObject("ans5",rs.getString("right_ans"));
			c_ans=rs.getString("right_ans");
			a=rs.getString("ans1");
			b=rs.getString("ans2");
			c=rs.getString("ans3");
			d=rs.getString("ans4");
			q=rs.getString("question");

		}
		else {
			
			 model = new ModelAndView("userprofile");
			 model.addObject("user",user); 
			 
		}
		
		return model;
		}
	}    

	@RequestMapping("/Cpp_page")
	public ModelAndView Cpp_page() throws ClassNotFoundException, SQLException {
		QuizSubject QS=  new QuizSubject();
		ModelAndView model = new ModelAndView("cpp");
		
		ResultSet rs =  QS.cpp();
		
		if(rs.next()) {
			//model.addObject("msg","cpp");
			model.addObject("Q_NO",rs.getString("question_num"));
			model.addObject("que",rs.getString("question"));
			model.addObject("ans1",rs.getString("ans1"));
			model.addObject("ans2",rs.getString("ans2"));
			model.addObject("ans3",rs.getString("ans3"));
			model.addObject("ans4",rs.getString("ans4"));
		
			
			cpp_ans=rs.getString("right_ans");
			a=rs.getString("ans1");
			b=rs.getString("ans2");
			c=rs.getString("ans3");
			d=rs.getString("ans4");
			q=rs.getString("question");
		}
		else {
			
			 model = new ModelAndView("userprofile");
			 model.addObject("user",user); 
			 
		}
		//model.addObject("msg","hello World");
		return model;
		
	}

	@RequestMapping("/java_page")
	public ModelAndView java_page() throws ClassNotFoundException, SQLException {
		ModelAndView model = new ModelAndView("java");
		QuizSubject QS=  new QuizSubject();
		ResultSet rs =  QS.java();
		if(rs.next()) {			
		//	model.addObject("msg","java");
			model.addObject("Q_NO",rs.getString("question_num"));
			model.addObject("que",rs.getString("question"));
			model.addObject("ans1",rs.getString("ans1"));
			model.addObject("ans2",rs.getString("ans2"));
			model.addObject("ans3",rs.getString("ans3"));
			model.addObject("ans4",rs.getString("ans4"));
			
			j_ans=rs.getString("right_ans");
			a=rs.getString("ans1");
			b=rs.getString("ans2");
			c=rs.getString("ans3");
			d=rs.getString("ans4");
			q=rs.getString("question");
			}
		else {
			
			 model = new ModelAndView("userprofile");
			 model.addObject("user",user); 
			 
		}
		 
		return model;
		
	}

	
	@RequestMapping("/ds_page")
	public ModelAndView ds_page() throws ClassNotFoundException, SQLException {
		QuizSubject QS=  new QuizSubject();
		ModelAndView model = new ModelAndView("dataStructure");
		ResultSet rs =  QS.datastructure();
		
		if(rs.next()) {
			 
			//model.addObject("msg","datastructure");
			model.addObject("Q_NO",rs.getString("question_num"));
			model.addObject("que",rs.getString("question"));
			model.addObject("ans1",rs.getString("ans1"));
			model.addObject("ans2",rs.getString("ans2"));
			model.addObject("ans3",rs.getString("ans3"));
			model.addObject("ans4",rs.getString("ans4"));

			
			ds_ans=rs.getString("right_ans");
			a=rs.getString("ans1");
			b=rs.getString("ans2");
			c=rs.getString("ans3");
			d=rs.getString("ans4");
			q=rs.getString("question");
		}		
		else {
			
			 model = new ModelAndView("userprofile");
			  model.addObject("user",user); 
			 
		}
		
		
		return model;
		
	}
	

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("email_id") String  email_id , @RequestParam("password") String password) throws ClassNotFoundException, SQLException {
		ModelAndView model;
		 user= new User();
		Database db=new Database();
		ResultSet rs= db.login(email_id, password);
		
		
		if(rs.next()) 
		{
			//model.addObject("msg",rs.getString("email_id")+""+rs.getString("password"));
			
			if(email_id.equals(rs.getString("email_id")) && password.equals(rs.getString("password") ))
			{
				user.setName(rs.getString("name"));
				user.setEmail_id(rs.getString("email_id"));
				user.setCity(rs.getString("city"));
				user.setMobile(rs.getString("mobile"));
				model = new ModelAndView("userprofile");
				//model.addObject("user",rs.getString("name")+""+rs.getString("email_id")+""+rs.getString("city")+""+rs.getString("mobile"));
				model.addObject("user",user) ;
				/* 
				 user.setName(rs.getString("name"));
				 user.setEmail_id(rs.getString("email_id"));
				 user.setCity(rs.getString("city"));
				 user.setPassword(rs.getString("password"));
				 user.setMobile(rs.getString("mobile"));
				 model.addObject("user",user);*/
			}
			else {
				model = new ModelAndView("Login");
				model.addObject("user","inncorrect ");
			}
			 
		}else{
			model = new ModelAndView("Login");
			
			model.addObject("user","data not found");
			
		}
			return model;
		
		
		
	}

	//For redirecting page
	@RequestMapping("/signup")
	public ModelAndView signup() {
		ModelAndView model = new ModelAndView("signUp");
		model.addObject("msg","hello World");
		return model;
		
	}
	//for register user
	@RequestMapping("/register")
	public ModelAndView register(@RequestParam("name") String name,@RequestParam("email_id") String  email_id, @RequestParam("password") String password , @RequestParam("city") String city,@RequestParam("mobile") String mobile) throws ClassNotFoundException, SQLException {
		Database db=new Database();
		db.registerUser(name, email_id, password, city, mobile);
		ModelAndView model = new ModelAndView("Login");
		model.addObject("msg","hello World");
		return model;
		
	}
	
	@RequestMapping("/canswer")
	public ModelAndView checkAns_c(@RequestParam("ans") String ans1) throws ClassNotFoundException, SQLException {
		 
		ModelAndView model = new ModelAndView("c");
		if(ans1.equals(c_ans)) {
			 
			
			 
			user.setC_quiz(1);
			model.addObject("Q_NO",1);
			model.addObject("que",q);
			model.addObject("ans1",a);
			model.addObject("ans2",b);
			model.addObject("ans3",c);
			model.addObject("ans4",d);
			model.addObject("ans5",c_ans);
			model.addObject("msg", "Correct Answer :");

		 }				
		else
		{
 
			model.addObject("Q_NO",1);
			model.addObject("que",q);
			model.addObject("ans1",a);
			model.addObject("ans2",b);
			model.addObject("ans3",c);
			model.addObject("ans4",d);
			model.addObject("ans5",c_ans);
			model.addObject("msg", "Incorrect Answer :");
			
		}
		
		return model;
	}
	
	
	@RequestMapping("/janswer")
	public ModelAndView checkAns_j(@RequestParam("ans") String ans1) throws ClassNotFoundException, SQLException {
		//User user= new User();
		ModelAndView model = new ModelAndView("java");
		
		if(ans1.equals(j_ans)) {
			 
			
			 
			user.setJava_quiz(1);
			model.addObject("Q_NO",1);
			model.addObject("que",q);
			model.addObject("ans1",a);
			model.addObject("ans2",b);
			model.addObject("ans3",c);
			model.addObject("ans4",d);
			model.addObject("ans5",j_ans);
			model.addObject("msg", "Correct Answer :");

		 }				
		else
		{
 
			model.addObject("Q_NO",1);
			model.addObject("que",q);
			model.addObject("ans1",a);
			model.addObject("ans2",b);
			model.addObject("ans3",c);
			model.addObject("ans4",d);
			model.addObject("ans5",j_ans);
			model.addObject("msg", "Incorrect Answer :");
			
		}
		
		return model;
	}
	
	
	@RequestMapping("/cppanswer")
	public ModelAndView checkAns_cpp(@RequestParam("ans") String ans1) throws ClassNotFoundException, SQLException {
		//User user= new User();
		ModelAndView model = new ModelAndView("cpp");
		if(ans1.equals(cpp_ans)) {
			 
			
			
			user.setCpp_quiz(1);
			model.addObject("Q_NO",1);
			model.addObject("que",q);
			model.addObject("ans1",a);
			model.addObject("ans2",b);
			model.addObject("ans3",c);
			model.addObject("ans4",d);
			model.addObject("ans5",cpp_ans);
			model.addObject("msg", "Correct Answer :");

		 }				
		else
		{
 
			model.addObject("Q_NO",1);
			model.addObject("que",q);
			model.addObject("ans1",a);
			model.addObject("ans2",b);
			model.addObject("ans3",c);
			model.addObject("ans4",d);
			model.addObject("ans5",cpp_ans);
			model.addObject("msg", "Incorrect Answer :");
			
		}
		
		return model;
	}
	
	@RequestMapping("/dsanswer")
	public ModelAndView checkAns_ds(@RequestParam("ans") String ans1) throws ClassNotFoundException, SQLException {
		//User user= new User();
		ModelAndView model = new ModelAndView("dataStructure");
		if(ans1.equals(ds_ans)) {
			 
			
			 
			user.setData_structure_quiz(1);
			model.addObject("Q_NO",1);
			model.addObject("que",q);
			model.addObject("ans1",a);
			model.addObject("ans2",b);
			model.addObject("ans3",c);
			model.addObject("ans4",d);
			model.addObject("ans5",ds_ans);
			model.addObject("msg", "Correct Answer :");

		 }				
		else
		{
 
			model.addObject("Q_NO",1);
			model.addObject("que",q);
			model.addObject("ans1",a);
			model.addObject("ans2",b);
			model.addObject("ans3",c);
			model.addObject("ans4",d);
			model.addObject("ans5",ds_ans);
			model.addObject("msg", "incorrect Answer :");
			
		}
		
		return model;
	}

}
