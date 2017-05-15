package com.github.evgdim.kotlintest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by evgen on 5/15/2017.
 */
@RestController
@RequestMapping("home")
class HomeController {
    @GetMapping
    fun index(): String {
        return "index"
    }
}