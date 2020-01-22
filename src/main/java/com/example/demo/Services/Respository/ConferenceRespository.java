package com.example.demo.Services.Respository;

import com.example.demo.Models.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferenceRespository extends JpaRepository<Conference,Integer> {



    @Query("SELECT u FROM Conference u where u.Description LIKE '%?%' or u.Theme LIKE '%?%' or u.Organizer LIKE '%?%'  or u.TypeConference LIKE '%?%' or u.TypeConference LIKE '%?%'")
    List<Conference> findConferenceByKeyWord(String KeyWord);

    @Modifying(clearAutomatically = true)
    @Query(value = "update  Conference u  SET u.isPubl = true where  u.Id = :ID ")
    void UpdateIspublice(@Param("ID") int Id);


}
