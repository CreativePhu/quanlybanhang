package vn.thienphu.quanlybanhang.model;

import java.util.ArrayList;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ten_tai_khoan")
	private long tenTaiKhoan;
	
	@Column(name = "mat_khau")
	private String matKhau;
	
	@Column(name = "trang_thai")
	private boolean trangThai;
	
	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "quyen_taiKhoan", joinColumns = @JoinColumn(name = "ten_tai_khoan"), inverseJoinColumns = @JoinColumn(name = "id_quyen"))
	private List<Quyen> danhSachQuyen;
	
	@OneToOne(mappedBy = "taiKhoan", cascade = CascadeType.ALL)
	private NhanVien nhanVien;

	public TaiKhoan() {

	}

	public TaiKhoan(String matKhau, boolean trangThai) {
		this.matKhau = matKhau;
		this.trangThai = trangThai;
	}

	public long getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(long tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public List<Quyen> getDanhSachQuyen() {
		return danhSachQuyen;
	}

	public void setDanhSachQuyen(List<Quyen> danhSachQuyen) {
		this.danhSachQuyen = danhSachQuyen;
	}
	
	public void themQuyen(Quyen quyen) {
		if(danhSachQuyen == null) {
			danhSachQuyen = new ArrayList<Quyen>();
		}
		danhSachQuyen.add(quyen);
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	@Override
	public String toString() {
		return "TaiKhoan [tenTaiKhoan=" + tenTaiKhoan + ", matKhau=" + matKhau + ", trangThai=" + trangThai
				+ ", danhSachQuyen=" + danhSachQuyen + "]";
	}

	

}
