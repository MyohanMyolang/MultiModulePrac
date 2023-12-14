package account.accountapi.controller

import crypto.Crypto
import member.Member
import member.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@RestController
@RequestMapping(("/regist"))
class Register @Autowired constructor(
    private val service: MemberService
) {

    @PostMapping
    fun regist(@RequestBody member: Member):Boolean {

        member.pw = Crypto().cryptoString(member.pw);
        return service.registMember(member);
    }
}