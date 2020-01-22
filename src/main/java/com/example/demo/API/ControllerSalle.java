package com.example.demo.API;

import com.example.demo.Models.Salle;
import com.example.demo.Services.Respository.SalleRespository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Salle")
public class ControllerSalle {


    SalleRespository SLR;

    @RequestMapping("AddSalle")
    @ResponseBody
    public  boolean AddSalle(@RequestBody Salle salle){


        try{


            SLR.save(salle);
            return true;
        }catch (Exception e){

            System.out.println("In Add Salle \n"+e);
            return false;
        }
    }
    @RequestMapping("")
    @ResponseBody
    public List<Salle> ListSalle(){

        try{


            return SLR.findAll();

        }catch (Exception e){

            System.out.println("In List Salle \n"+e);

            return null;
        }


    }


    @RequestMapping("/{id}")
    @ResponseBody
    public Salle SalleById( @RequestBody int Id){

        try{


            return SLR.findById(Id).get();


        }catch (Exception e){

            System.out.println("In On Salle by Id \n"+e);

            return null;
        }


    }


    @RequestMapping("Delete/{id}")
    @ResponseBody
    public boolean DeleteSalleById( @RequestBody int Id){

        try{


            SLR.deleteById(Id);
            return true;


        }catch (Exception e){

            System.out.println("In On delete Salle by Id \n"+e);

            return false;
        }


    }




    @RequestMapping("DeleteALL")
    @ResponseBody
    public boolean DeleteSalleALL( ){

        try{


            SLR.deleteAll();
            return true;


        }catch (Exception e){

            System.out.println("In On DELETE Salle \n"+e);

            return false;
        }


    }




}
