package com.epe.test.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.epe.center.controller.guide.Member;
import com.epe.center.controller.guide.MemberRespository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

	@Autowired MemberRespository memberRespository;
	
	@Test
	@Transactional	//모든 save 관련 데이터는 트랜잭션이 들어가야 한다. 원래는 repository에 들어가야 하지만 일단은 테스트 코드에 남긴다.
	@Rollback(false)
	public void testMember() throws Exception{
		Member member = new Member();
		member.setName("memberA");
		
		Long savedId = memberRespository.save(member);
		Member findMember = memberRespository.find(savedId);
		
//		Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//		Assertions.assertThat(findMember.getName()).isEqualTo(member.getName());
				
	}
}
