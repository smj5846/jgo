package com.mysite.jgo.payment;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {
	
	private int payno;
}
