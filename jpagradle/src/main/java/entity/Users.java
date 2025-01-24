package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="users")
public class Users { //users 테이블로 정의 생성
	@Id //id컬럼 number(??) primary key 활용
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(length = 20, nullable = false) //username varchar2(???)
	String username;
	
	@Transient //age변수 테이블에서 제외
	int age;
}
