
CREATE TABLE tb_barang ( 
    id_barang INT PRIMARY KEY NOT NULL, 
    in_stok INT DEFAULT 0, 
    out_stok INT DEFAULT 0, 
    sisa_stok INT DEFAULT 0, 
    tanggal TIMESTAMP
);

CREATE TABLE tb_pegawai ( 
    id_pegawai VARCHAR(12) PRIMARY KEY NOT NULL,  
    nama_depan VARCHAR(12) NOT NULL,
    nama_belakang VARCHAR(12) NOT NULL, 
    jabatan VARCHAR(12), 
    nomor_telp VARCHAR(13)  
);

CREATE TABLE tb_histori_pegawai ( 
    id_history INT PRIMARY KEY NOT NULL, 
    id_barang INT, 
    in_stok INT, 
    out_stok INT, 
    tanggal TIMESTAMP,
    FOREIGN KEY (id_barang) REFERENCES tb_barang(id_barang)
);

CREATE TABLE tb_satuan(
    kode_satuan VARCHAR(12) PRIMARY KEY NOT NULL, 
    satuan VARCHAR(12)
);

ALTER TABLE tb_barang ADD COLUMN kode_satuan VARCHAR(12);
ALTER TABLE tb_barang ADD FOREIGN KEY (kode_satuan) REFERENCES tb_satuan(kode_satuan);

CREATE TABLE tb_kategori_barang (
    kode_kategori VARCHAR(12) PRIMARY KEY NOT NULL,
    kategori VARCHAR(12),
);

ALTER TABLE tb_barang ADD COLUMN kode_kategori VARCHAR(12) ;

ALTER TABLE tb_barang ADD FOREIGN KEY (kode_kategori) 
REFERENCES tb_kategori_barang(kode_kategori);
