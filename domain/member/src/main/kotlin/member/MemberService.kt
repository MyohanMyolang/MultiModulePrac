package member

import org.springframework.stereotype.Service

@Service
class MemberService (private val repo: MemberRepo){

    fun test(): Boolean{
        return repo.test();
    }
}