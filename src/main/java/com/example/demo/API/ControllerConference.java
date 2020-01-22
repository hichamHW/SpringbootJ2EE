package com.example.demo.API;


import com.example.demo.Models.Conference;
import com.example.demo.Services.Respository.ConferenceRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping(path = "/Conference")
public class ControllerConference {



    @Autowired
    ConferenceRespository CR;



    @RequestMapping("AddConference")
    @ResponseBody
    public boolean AddConference( @RequestBody   Conference conference)
    {


        try {

            CR.save(conference);



            return true;

        }catch(Exception e)

        {


            System.out.println("In Add conference \n"+e);

            return false;

        }

    }

    @RequestMapping("Ispub/{id}")
    @ResponseBody
    public boolean Ispubl( @PathVariable(name = "id") int Id )
    {


        try {

            CR.UpdateIspublice(Id);



            return true;

        }catch(Exception e)

        {


            System.out.println("In Ispub conference \n"+e);

            return false;

        }

    }
    @RequestMapping("Delete/{id}")
    @ResponseBody
    public  boolean DeleteConferenceById(  @PathVariable(name = "id") int Id){


        try {

            CR.deleteById(Id);


            return true;

        }catch(Exception e)

        {


            System.out.println("In Delete conference \n"+e);
            return  false;

        }
    }
    @RequestMapping("DeleteALL")
    @ResponseBody
    public  Boolean DeleteAllConferences(){


        try {

            CR.deleteAll();

            return  true;


        }catch(Exception e)

        {


            System.out.println("In DeleteALL conference \n"+e);
            return  false;

        }


    }


    @RequestMapping("/")
    @ResponseBody
    public List<Conference> ListConference(){

        List<Conference> conferences =null;
        try {

            conferences = CR.findAll();



        }catch(Exception e)

        {


            System.out.println("In Lists conference \n"+e);

        }


        return  conferences;
    }
    @RequestMapping("/{id}")
    @ResponseBody
    public  Conference FindConferceById( @PathVariable(name = "id") int Id){


        Conference conference =null;
        try {

            conference = CR.findById(Id).get();


        }catch(Exception e)

        {


            System.out.println("In List conference \n"+e);

        }


        return  conference;
    }



    @RequestMapping("Test")
    @ResponseBody
    public  Boolean AddConferences( ){




        return true;
    }


}
