package com.mysite.jgo.dashboard;

import com.mysite.jgo.member.Member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Dashboard {
	//엔티티 설정
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dno;
	
	private String subject;
	
	private String content;
	
	private int type;
	
	private int status;
	
	private String productName;
	
	private String pCategory;
	
	private int pPrice;
	
	private String imageUrl;
	
	//외래키
	@ManyToOne
	private Member member;
}
