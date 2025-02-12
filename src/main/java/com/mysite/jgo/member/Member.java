package com.mysite.jgo.member;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mno;
	
	private String id;
	
	private String pw;
	
	private String addr;
	
	private String email;
	
	private String phoneno;
	
	private LocalDateTime creDate;
	
	private LocalDateTime modDate;
}
