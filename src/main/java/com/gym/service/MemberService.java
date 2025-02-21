package com.gym.service;

import com.gym.model.Member;
import com.gym.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    // Create Member
    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    // Get All Members
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    // Get Member by ID
    public Optional<Member> getMemberById(String id) {
        return memberRepository.findById(id);
    }

    // Update Member
    public Member updateMember(String id, Member updatedMember) {
        if (memberRepository.existsById(id)) {
            updatedMember.setId(id); // Ensure the ID is retained
            return memberRepository.save(updatedMember);
        }
        return null;
    }

    // Delete Member
    public boolean deleteMember(String id) {
        if (memberRepository.existsById(id)) {
            memberRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

