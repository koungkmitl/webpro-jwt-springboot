package murraco.controller;

import murraco.dto.StatResponse;
import murraco.service.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/stat")
public class StatController {

    @Autowired
    private StatService statService;

    @GetMapping("")
    public ResponseEntity<StatResponse> viewtat(HttpServletRequest req){
        return statService.statView(req);
    }
}
