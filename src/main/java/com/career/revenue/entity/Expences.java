package com.career.revenue.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.career.constants.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expences {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long expenceId;
	
	@CreationTimestamp
	private LocalDateTime createdOn;
	
	@NotNull
	private Long mentorId;
	
	@NotNull
	private String remarks;
	
	@NotNull
	private Long amount;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@UpdateTimestamp
	private LocalDateTime updatedOn;
	
	@NotNull
	private String createdBy;
	
	@NotNull
	private String updatedBy;
	
	@Column(name = "active", columnDefinition = "boolean default true")
	private boolean active=true;

}

