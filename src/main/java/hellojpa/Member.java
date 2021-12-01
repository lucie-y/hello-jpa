package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // JPA 사용 인식.
        // 이게 붙어 있으면 JPA가 관리하는 객체고 데이터베이스 테이블과 매핑해서 쓰겠구나.
@Table(name = "MBR")
public class Member {
    // JPA는 내부적으로 REFLECTION같은 걸 사용
    // 동적으로 객체를 생성해야 함.
    // 그래서 기본 생성자가 필요.

    @Id // javax.persistence
    private Long id;
    private String name;

    public Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
