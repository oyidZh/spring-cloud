package com.oyid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oyid.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
