package admin.adminapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Admin {

    @GetMapping
    fun test(): String{
        return "Admin Server Test"
    }

}