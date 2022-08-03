package ca.cgi.coaching.childmanagement.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Base {
	@Column(name = "CREATE_BY", nullable = false, updatable = false)
	private Long createBy;

	@Column(name = "UPDATE_BY", nullable = true)
	private Long updateBy;

	@Column(name = "UPDATE_DATE", nullable = true)
	private LocalDate updateDate;

	@Column(name = "CREATE_DATE", updatable = false, nullable = false)
	private LocalDate createDate;
}