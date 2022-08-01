package server.controllers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServicer {

    public static List<Item> getItems() {
        return List.of(new Item(1, "utensil", "spatula"));
    }
}
