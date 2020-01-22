package com.example.demo.API;

import com.example.demo.Models.Profile;
import com.example.demo.Services.Respository.ProfileRespository;
import com.example.demo.Services.Security.BCryEncry;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(path = "/Profile")
public class ControllerProfile {





    final String secretKey = "ssshhhhhhhhhhh!!!!";

    @Autowired
    ProfileRespository PR;

  @Autowired
    BCryEncry BC;





     @RequestMapping("AddProfile")
     @ResponseBody
    public  Boolean AddProfile(@RequestBody Profile  profile){




         try{




             System.out.println(profile.toString());


             String Encpassword = BC.encrypt(profile.getPassword(),secretKey);


             profile.setPassword(Encpassword);


             System.out.println(profile.toString());


             PR.save(profile);
             return true;


         }catch (Exception e){


             System.out.println("In Add Profile \n"+e);

             return false;
         }

    }


    @RequestMapping("")
    @ResponseBody

    public List<Profile> ListProfile(){

         List<Profile> li=null;



        try{




            return li= PR.findAll() ;


        }catch (Exception e){


            System.out.println("In List Profile\n"+e);

            return null;
        }

    }

    @RequestMapping("/{id}")
    @ResponseBody
    public Profile ProfileById(@PathVariable("id") int Id){


        try{




            Profile p = PR.findById(Id).get();
            System.out.println(p.toString());

            p.setPassword(BC.decrypt(p.getPassword(),secretKey));

            System.out.println(p.toString());
            return PR.findById(Id).get();


        }catch (Exception e){


            System.out.println("In One Profile\n"+e);

            return null;
        }


    }

    @RequestMapping("Delete/{id}")
    @ResponseBody
    public boolean DeleteProfileById(@PathVariable("id") int Id){


        try{



            System.out.println("Id est : "+Id);


            PR.deleteById(Id);
            return true;


        }catch (Exception e){


            System.out.println("In Delete On Profile\n"+e);

            return false;
        }


    }

    @RequestMapping("DeleteAll")
    @ResponseBody
    public boolean DeleteAllProfile(@PathVariable("id") int Id){


        try{




            PR.deleteAll();
            return true;


        }catch (Exception e){


            System.out.println("In DeleteALL Profile\n"+e);

            return false;
        }


    }





}
