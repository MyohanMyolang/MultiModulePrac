package member

import org.springframework.stereotype.Repository

@Repository
class MemberRepo {
    private val memberList = mutableListOf<Member>();

    fun test(): Boolean{
        return false;
    }
}