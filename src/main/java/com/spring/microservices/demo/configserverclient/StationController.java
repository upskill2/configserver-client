package com.spring.microservices.demo.configserverclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class StationController {

    @Value ("${stationamount}")
    String station;

    @Value ("${stationamount}")
    String lanecount;

    @Value ("${stationamount}")
    String tollstart;

    @RequestMapping("/station")
    public String getStation (Model model) {
        model.addAttribute ("stationamount", station);
        model.addAttribute ("lanes", lanecount);
        model.addAttribute ("toolstart", tollstart);

        return "stationview";
    }

}
