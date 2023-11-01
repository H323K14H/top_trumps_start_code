package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping (value = "/topTrump")
public class TopTrumpsControllers {



    @PostMapping
    public ResponseEntity<String> newGame(@RequestBody ArrayList<Card> card){
        return new ResponseEntity<>("card", HttpStatus.CREATED);
    }


}
