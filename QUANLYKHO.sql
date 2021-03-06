use master
go

drop database QUANLYKHO
go

create database QUANLYKHO
go


use QUANLYKHO
go


Create table TaiKhoan(
	tenTK varchar(20) primary key not null,	
	HoTen nvarchar(50),
	MatKhau	varchar(50),	
	GioiTinh nvarchar(50),
	DiaChi nvarchar(50),
	SDT nvarchar(50),
	typeUser bit,
	status bit default 1  
);
go

Create table KhachHang(
	maKH varchar(20) primary key,
	tenKH nvarchar(50),
	diachi nvarchar(50),
	sdt nvarchar(50),
	status bit default 1
);
go



Create table NhaCC(
	maNhaCC nvarchar(50) primary key,
	DiaChi nvarchar(50),
	SDT nvarchar(50),
	status bit default 1
);
go

Create table LoaiHang(
	maLH varchar(20) primary key,
	tenLH nvarchar(50),

	status bit default 1,
);
go

Create table ccLoaiHang(
	maNhaCC NVARCHAR(50),
	maLH varchar(20)
	
	foreign key (maNhaCC) references NhaCC(maNhaCC),
	foreign key (maLH) references LoaiHang(maLH)
);
go

Create table SanPham(
	maSP varchar(20) primary key,
	tenSP nvarchar(50),
	maLH varchar(20),
	maNhaCC NVARCHAR(50),
	DonVi nvarchar(50),
	SoLuong int,
	GiaNhap float,
	GiaXuat float,
	status bit default 1,
	foreign key (maNhaCC) references NhaCC(maNhaCC),
	foreign key (maLH) references LoaiHang(maLH)
);
go

Create table PhieuXuat(
	maPX varchar(20) primary key,
	tenTK varchar(20),
	maKH varchar(20),
	ngayxuat datetime,
	status bit default 1,
	
	foreign key (tenTK) references TaiKhoan(tenTK),
	foreign key (maKH) references KhachHang(maKH)
);
go

Create table ctPhieuXuat(
	maPX varchar(20),
	maSP varchar(20),
	SoLuong int,
	DonGia float,
	ThanhTien float,
	
	foreign key (maPX) references PhieuXuat(maPX),
	foreign key (maSP) references SanPham(maSP)
);
go


Create table PhieuNhap(
	maPN varchar(20) primary key,
	tenTK varchar(20),
	maNhaCC NVARCHAR(50),
	ngayNhap datetime,
	status bit default 1,
	
	foreign key (tenTK) references TaiKhoan(tenTK),
	foreign key (maNhacc) references NhaCC(maNhacc)
);
go


Create table ctPhieuNhap(
	maPN varchar(20),
	maSP varchar(20),
	SoLuong int,
	DonGia float,
	ThanhTien float,
	
	foreign key (maPN) references PhieuNhap(maPN),
	foreign key (maSP) references SanPham(maSP)
);
go


Select * from TAIKHOAN
Insert into TAIKHOAN values ('TOANDZ',N'Nguyễn Đức Toàn','123',N'Nam',N'Tân Mỹ - Mỹ Đình - Hà Nội','01634361994',1,1);
Insert into TAIKHOAN values ('TUANVN',N'Vũ Ngọc Tuân','123',N'Nam',N'Ngõ chợ - Khâm Khiên - Hà Nội','0969888666',1,1);
Insert into TAIKHOAN values ('THUDV',N'Đào Văn Thư','123',N'Nam',N'Đông anh - Hà Nội','09688886433',0,1);
Insert into TAIKHOAN values ('MINHMV',N'Mạc Văn Minh','123',N'Nam',N'Mễ Trì - Mỹ Đình - Hà Nội','01952346234',0,1);
Insert into TAIKHOAN values ('DUYLD',N'Lê Doãn Duy','123',N'Nam',N'Xuân Đỉnh - Mỹ Đình - Hà Nội','09862356347',0,1);


select * from KhachHang
Insert into KhachHang values ('duongphi',N'Phí Đình Dương',N'Hoài Đức','0977446447',1);
Insert into KhachHang values ('thamnguyen',N'Nguyễn Thị Thắm',N'Ngõ Chợ','0988666666',1);
Insert into KhachHang values ('manhnguyen',N'Nguyễn Hùng Mạnh',N'Bắc Ninh','0123456789',1);
Insert into KhachHang values ('hanhvu',N'Vũ Hành Hạnh',N'Hầm Kim Liên','0988777444',1);
Insert into KhachHang values ('mennguyen',N'Nguyễn Thị Mến',N'Hồ Tây','09888111333',1);

select * from NhaCC
Insert into NhaCC values (N'Adidas',N'Hòa Kỳ','88-888-888',1);
Insert into NhaCC values (N'Nike',N'Vương Quốc Anh','66-666-666',1);
Insert into NhaCC values (N'Anta',N'Trung Quốc','33-333-333',1);
Insert into NhaCC values (N'Li-Ning',N'Hồng Kông','11-111-111',1);

select * from LoaiHang
Insert into LoaiHang values ('SH',N'Giày',1);
Insert into LoaiHang values ('CL',N'Quần Áo',1);
Insert into LoaiHang values ('SB',N'SnapBack',1);
Insert into LoaiHang values ('BP',N'Balo',1);
Insert into LoaiHang values ('HB',N'Túi xách',1);


select * from ccLoaiHang

insert into ccLoaiHang values (N'Adidas','SH');
insert into ccLoaiHang values (N'Adidas','CL');
insert into ccLoaiHang values (N'Adidas','SB');
insert into ccLoaiHang values (N'Adidas','BP');
insert into ccLoaiHang values (N'Adidas','HB');

insert into ccLoaiHang values (N'Nike','SH');
insert into ccLoaiHang values (N'Nike','CL');
insert into ccLoaiHang values (N'Nike','SB');
insert into ccLoaiHang values (N'Nike','BP');


insert into ccLoaiHang values (N'Anta','SH');
insert into ccLoaiHang values (N'Anta','CL');

insert into ccLoaiHang values (N'Li-Ning','SH');
insert into ccLoaiHang values (N'Li-Ning','BP');
insert into ccLoaiHang values (N'Li-Ning','HB');





Select * from SanPham
Update SanPham Set SoLuong=1000
Delete from SanPham
Delete from PhieuXuat
Insert into SanPham values ('SP01',N'Yeezy boost 350','SH',N'Adidas',N'Đôi',0,300,1000,1);
Insert into SanPham values ('SP02',N'Nike Jodan 11s','SH',N'Nike',N'Đôi',0,300,1000,1);
Insert into SanPham values ('SP03',N'Jogger Pants','CL',N'Nike',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP04',N'T-Shirt','CL',N'Adidas',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP05',N'SnapBack Jodan','SB',N'Anta',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP06',N'SnapBack Nike','SB',N'Nike',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP07',N'Balo Adidas','BP',N'Adidas',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP08',N'Balo Nike','BP',N'Nike',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP09',N'Túi Adidas','HB',N'Adidas',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP10',N'Túi Nike','HB',N'Nike',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP11',N'Giày Anta','SH',N'Anta',N'Đôi',0,300,1000,1);
Insert into SanPham values ('SP12',N'Giày Li-Ning','SH',N'Li-Ning',N'Đôi',0,300,1000,1);
Insert into SanPham values('SP13',N'Balo Li-Ning','BP',N'Li-Ning',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP14',N'Nike Huarache','SH',N'Nike',N'Đôi',0,300,1000,1);
Insert into SanPham values ('SP15',N'Sport Neo','SH',N'Adidas',N'Đôi',0,300,1000,1);
Insert into SanPham values ('SP16',N'SnapBack Adidas','SB',N'Adidas',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP17',N'SnapBack Nike','SB',N'Nike',N'Chiếc',0,300,1000,1);
Insert into SanPham values ('SP18',N'SnapBack Redbull','SB',N'Anta',N'Chiếc',0,300,1000,1);



/*Select distinct tenSP from SanPham inner join LoaiHang on LoaiHang.maLH=SanPham.maLH  
            where tenLH = N'Túi Xách'
Select tenSP from SanPham inner join LoaiHang on LoaiHang.maLH=SanPham.maLH inner join NhaCC on SanPham.maNhaCC=NhaCC.maNhaCC
             where tenLH = N'Quần Áo' and tenNhaCC=N'Adidas'
			 SELECT tenLH from LoaiHang inner join ccLoaiHang on LoaiHang.maLH=ccLoaiHang.maLH
                    where ccLoaiHang.maNhaCC=N'Adidas'
SELECT tenLH from LoaiHang inner join ccLoaiHang on LoaiHang.maLH=ccLoaiHang.maLH
                    where ccLoaiHang.maNhaCC = 'Adidas'
Select tenSP from SanPham inner join LoaiHang on LoaiHang.maLH=SanPham.maLH
            where tenLH = N'Giày' and SanPham.maNhaCC=N'Adidas'
Select tenSP from SanPham inner join LoaiHang on LoaiHang.maLH=SanPham.maLH where tenLH = N'Quần Áo' and SanPham.maNhaCC=N'Adidas'
select * from SanPham
select * from LoaiHang
select tenSP from SanPham inner join LoaiHang on SanPham.maLH = LoaiHang.maLH where maNhaCC = 'Adidas' and tenLH = N'Giày'
select CAST(GiaNhap AS int)   from SanPham*/

IF OBJECT_ID ('spPhieuNhap') is not null
drop PROC spPhieuNhap
GO
CREATE PROC spPhieuNhap 
@MaPN varchar(20),
@tenTK varchar(20),
@maCC varchar(50),
@ngayNhap varchar(20)
AS
Declare @Ngay datetime
SET @Ngay=CONVERT(NVARCHAR,@ngayNhap,112)
Insert into PhieuNhap Values (@MaPN,@tenTK,@maCC,@Ngay,1)
go


IF OBJECT_ID ('spPhieuNhapCT') is not null
drop PROC spPhieuNhapCT
GO
CREATE PROC spPhieuNhapCT 
@MaPN varchar(20),
@tenSP varchar(20),
@SL int,
@DonGia float,
@Ttien float
AS
Declare @maSP varchar(20)
Select @maSP=maSP from SanPham where tenSP=@tenSP
Insert into ctPhieuNhap Values (@MaPN,@MaSP,@DonGia,@SL,@Ttien)
Update SanPham SET SoLuong=@SL+SoLuong where maSP=@MaSP
go


IF OBJECT_ID ('spPhieuXuat') is not null
drop PROC spPhieuXuat
GO
CREATE PROC spPhieuXuat
@MaPX varchar(20),
@tenTK varchar(20),
@tenKH nvarchar(50),
@ngayXuat varchar(20)
AS
Declare @Ngay datetime
SET @Ngay=CONVERT(NVARCHAR,@ngayXuat,105)
declare @maKH varchar(20) 
Select @maKH=maKH from KhachHang where tenKH=@tenKH
IF @maKH is null
Begin
declare @maKH1 varchar(30)
Select @maKH1='KH'+SUBSTRING(cast(rand() as varchar),3,10)
Insert into KhachHang(maKH,tenKH) values (@maKH1,@tenKH)
Insert into PhieuXuat Values (@MaPX,@tenTK,@maKH1,@Ngay,1)
END
ELSE
Insert into PhieuXuat Values (@MaPX,@tenTK,@maKH,@Ngay,1)
go
EXEC spPhieuXuat 'PX03','minhmv',N'Mạc Văn Minh','3/12/2016'
EXEC spPhieuXuatCT 'PX03','SP01',50,3.5,85


IF OBJECT_ID ('spPhieuXuatCT') is not null
drop PROC spPhieuXuatCT
GO
CREATE PROC spPhieuXuatCT 
@MaPX varchar(20),
@tenSP varchar(20),
@SL int,
@DonGia float,
@Ttien float
AS
Declare @maSP varchar(20)
Select @maSP=SanPham.maSP from SanPham where tenSP=@tenSP
Insert into ctPhieuXuat Values (@MaPX,@MaSP,@DonGia,@SL,@Ttien)
Update SanPham SET SoLuong=SoLuong-@SL where maSP=@MaSP
go
