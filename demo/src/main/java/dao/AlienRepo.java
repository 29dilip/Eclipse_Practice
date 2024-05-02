package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;

import model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer>

{

}