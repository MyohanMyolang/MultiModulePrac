package member

import org.springframework.stereotype.Service

@Service
class MemberService (private val repo: MemberRepo){

    fun registMember(member:Member): Boolean{
        return null == repo.addMember(member);
    }
}