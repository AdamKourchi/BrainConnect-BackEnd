package com.example.brainconnect.dao;

import com.example.brainconnect.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    int deleteByCodeRoom(String code);
    List<Room> findByUserId(Long userId);
    Room findByCodeRoom(String code);

}
