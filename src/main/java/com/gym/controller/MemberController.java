package com.gym.controller;


import com.gym.model.Member;
import com.gym.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // Add Member
    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    // Get All Members
    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    // Get Member by ID
    @GetMapping("/{id}")
    public Optional<Member> getMemberById(@PathVariable String id) {
        return memberService.getMemberById(id);
    }

    // Update Member
    @PutMapping("/{id}")
    public Member updateMember(@PathVariable String id, @RequestBody Member updatedMember) {
        return memberService.updateMember(id, updatedMember);
    }

    // Delete Member
    @DeleteMapping("/{id}")
    public String deleteMember(@PathVariable String id) {
        return memberService.deleteMember(id) ? "Deleted successfully" : "Member not found";
    }
}
