package com.security.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "my_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;

	@NotNull
	@Column(name = "user_role")
	private String role;

	@NotNull
	@Column(name = "user_email", unique = true)
	private String email;

	@NotNull
	@Column(name = "user_name", unique = true)
	private String username;

	@NotNull
	@Column(name = "user_pass")
	private String password;

}
