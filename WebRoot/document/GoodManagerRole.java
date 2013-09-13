package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ��Ʒ����Ա��ɫ
 * 
 * @author huang
 * 
 */
@Entity
@Table(name = "good_manager_role")
public class GoodManagerRole extends BaseEntity {

	public GoodManagerRole() {
	}

	/**
	 * ��ɫ����
	 */
	@Column(nullable = false, unique = true, length = 30)
	private String rolename;

	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<GoodManager> goodManagers;

	/**
	 * ��ɫ���
	 */
	@Column
	private String code;

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<GoodManager> getGoodManagers() {
		return goodManagers;
	}

	public void setGoodManagers(List<GoodManager> goodManagers) {
		this.goodManagers = goodManagers;
	}

}
