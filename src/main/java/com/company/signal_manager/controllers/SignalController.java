package com.company.signal_manager.controllers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SignalController {

    @GetMapping("/signal")
    public String getSignal() {
        return "Signal details";
    }

}