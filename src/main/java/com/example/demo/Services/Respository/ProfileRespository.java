package com.example.demo.Services.Respository;

import com.example.demo.Models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody
public interface ProfileRespository   extends JpaRepository<Profile,Integer> {



}
