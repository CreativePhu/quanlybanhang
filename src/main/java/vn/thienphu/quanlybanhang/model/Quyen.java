package vn.thienphu.quanlybanhang.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quyen")
public class Quyen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_quyen")
	private long idQuyen;
	@Column(name = "ten_quyen")
	private String tenQuyen;
	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "quyen_taiKhoan", joinColumns = @JoinColumn(name = "id_quyen"), inverseJoinColumns = @JoinColumn(name = "ten_tai_khoan"))
	private List<TaiKhoan> danhSachTaiKhoan;

	public Quyen() {

	}

	public Quyen(String tenQuyen) {
		this.tenQuyen = tenQuyen;
	}

	public long getIdQuyen() {
		return idQuyen;
	}

	public void setIdQuyen(int idQuyen) {
		this.idQuyen = idQuyen;
	}

	public String getTenQuyen() {
		return tenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		this.tenQuyen = tenQuyen;
	}

	public List<TaiKhoan> getDanhSachTaiKhoan() {
		return danhSachTaiKhoan;
	}

	public void setDanhSachTaiKhoan(List<TaiKhoan> danhSachTaiKhoan) {
		this.danhSachTaiKhoan = danhSachTaiKhoan;
	}

	@Override
	public String toString() {
		return "Quyen [idQuyen=" + idQuyen + ", tenQuyen=" + tenQuyen + "]";
	}

}
