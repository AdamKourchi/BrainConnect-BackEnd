package com.example.brainconnect.service;

import com.example.brainconnect.dao.RoomRepository;
import com.example.brainconnect.entity.Room;
import com.example.brainconnect.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    public RoomRepository dao;


    public Room save(Room room, User user) {
        room.setUser(user);
        dao.save(room);
        return room;
    }

    @Transactional
    public int deleteByCode(String code) {
        return dao.deleteByCodeRoom(code);
    }


    public Room findById(Long id) {
        return dao.findById(id).orElse(null);
    }

    public int saveRoomState(Long roomId, String stageState) {
        Room room = findById(roomId);

        if (room == null) {
            return -1;
        }

        room.setDesign(stageState);
        dao.save(room);
        return 1;
    }

    public List<Room> findByUserId(Long userId) {

        return dao.findByUserId(userId);
    }

    public Long findByCode(String code){
        Room room = dao.findByCodeRoom(code);
        if(room == null){
            return null;
        }
        return room.getId();
    }

}
