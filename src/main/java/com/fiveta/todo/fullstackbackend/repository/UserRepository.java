package com.fiveta.todo.fullstackbackend.repository;

import com.fiveta.todo.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{ //verdiğimiz model sınıfında primary key ne ise
    //onun ne değişkeni olduğu yazılır bizde primary key id olduğu için ve id Long olduğu için Long yazdık

}
