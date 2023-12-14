package account.accountapi.register

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(("/regist"))
class Register {

    @PostMapping
    fun regist(@RequestBody req:String):Boolean {
        println("${req}")
        return true;
    }
}