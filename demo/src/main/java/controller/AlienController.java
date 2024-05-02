package controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import dao.AlienRepo;

import model.Alien;

@Controller

public class AlienController

{

 @Autowired

 AlienRepo repo;

 @RequestMapping("/")

 public String home()

 {

 return "home.html";

 }

 @RequestMapping("/addAlien")

 public String addAlien(Alien alien)

 {

 repo.save(alien);

 return "home.html";

 }

}


