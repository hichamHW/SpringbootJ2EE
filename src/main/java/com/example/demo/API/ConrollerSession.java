package com.example.demo.API;


import com.example.demo.Models.Session;
import com.example.demo.Services.Respository.SessionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Session")
public class ConrollerSession {


    @Autowired
    SessionRespository SR;

    @RequestMapping("AddSession")
    @ResponseBody
    public boolean AddSession(Session session){



        try {

            SR.save(session);
            return true;

        }catch (Exception e){


            System.out.println("In Add Session \n"+e);

            return false;
        }
    }



    @RequestMapping("/{id}")
    @ResponseBody
    public Session SessionById( @PathVariable("id") int Id){






        try {


            return SR.findById(Id).get();

        }catch (Exception e){


            System.out.println("In Find On Session \n"+e);

            return null;
        }

    }




    @RequestMapping("Delete/{id}")
    @ResponseBody
    public boolean DeleteSessionById( @PathVariable("id") int Id){






        try {


            SR.deleteById(Id);
            return true;

        }catch (Exception e){


            System.out.println("In Delete On Session \n"+e);

            return false;
        }

    }




    @RequestMapping("")
    @ResponseBody
    public List<Session> ListSession( ){






        try {


            return SR.findAll();

        }catch (Exception e){


            System.out.println("In Find Many Session \n"+e);

            return null;
        }

    }






    @RequestMapping("DeleteALL")
    @ResponseBody
    public boolean DeleteAllSession( ){






        try {


            SR.deleteAll();
            return true;

        }catch (Exception e){


            System.out.println("In Delete All Session \n"+e);

            return false;
        }

    }




    @RequestMapping("/{Query_Search}")

    public  List<Session>  SearchBykeyWord(@PathVariable("Query_Search") String Key){





        try {



            //return SR.getSessionBySalleLikeOrConferenceLikeOrDateDebutLikeOrDateFinLikeOrSujetLikeOrSpeakerLike(Key);

            return  null;
        }catch (Exception e){


            System.out.println("In Search Session \n"+e);

            return null;
        }


    }





}
