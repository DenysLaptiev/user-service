package com.springboot.user_service.service;

import com.springboot.user_service.model.Album;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    //TODO: remove this class

    private List<Album> albums = List.of(
            new Album("1","title1","userId1", "desc1","albumUrl1"),
            new Album("2","title2","userId2", "desc2","albumUrl2"),
            new Album("3","title3","userId3", "desc3","albumUrl3")
    );

    public List<Album> getAll(){
        return albums;
    }
}
