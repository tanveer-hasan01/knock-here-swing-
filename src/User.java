/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cse92
 */
public class User {
    
    private String name;
    private String email;
    private String phone;
    private String location;
    private String type;
    private String hard_copy;
    private String soft_copy;
    
    
    public User(String name,String email,String phone,String location,String type,String hard_copy, String soft_copy)
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.location=location;
        this.type=type;
        this.hard_copy=hard_copy;
        this.soft_copy=soft_copy;
        
        
        
    }
    
    public String getname()
    {
        return name;
    }
    
     public String getemail()
    {
        return email;
    }
     public String getphone()
    {
        return phone;
    }
      public String getlocation()
    {
        return location;
    }
       public String gettype()
    {
        return type;
    }
        public String gethard_copy()
    {
        return hard_copy;
    }
         public String getsoft_copy()
    {
        return soft_copy;
    }
   
}


