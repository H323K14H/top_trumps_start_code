package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.stereotype.Service;

@Service
public class TopTrumpsService {

    private Card card;


    public TopTrumpsService(Card card) {
        this.card = card;
    }

    public TopTrumpsService() {
    }

    public String checkWinner() {

        Card card1 = new Card(Rank.EIGHT, Suit.CLUBS);
        Card card2 = new Card(Rank.SEVEN, Suit.HEARTS);

        if (card1.getCardValue() > card2.getCardValue()) {
            return card1.getRank().name() + " of " + card1.getSuit().name() + " is the higher card.";
        } else if (card2.getCardValue() > card1.getCardValue()) {
            return card2 + "is the higher card.";
        } else {
            return "These cards are equal";
        }
    }

}

