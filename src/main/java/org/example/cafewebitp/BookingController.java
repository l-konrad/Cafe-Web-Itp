package org.example.cafewebitp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @PostMapping("/book")
    public String book() {
        return "Booking successful";
    }

}
