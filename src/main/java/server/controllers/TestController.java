package server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static server.constants.ServerConstant.API_ROUTE;

@RestController
@RequestMapping(path = API_ROUTE + "/test")
public class TestController {

    private final TestServicer servicer;

    @Autowired
    public TestController(TestServicer servicer) {
        this.servicer = servicer;
    }

    @GetMapping
    public List<Item> getItems() {
        return TestServicer.getItems();
    }

}
