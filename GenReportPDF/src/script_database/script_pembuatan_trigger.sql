DELIMITER $$

CREATE TRIGGER penambahan_history BEFORE UPDATE 
on tb_histori_pendataan FOR EACH ROW
BEGIN
    INSERT INTO tb_histori_pendataan (id_barang, in_stok, out_stok, sisa_stok, tanggal)
    VALUES (old.id_barang, old.in_stok, old.out_stok, old.sisa_stok, old.tanggal);
END $$

DELIMITER ; 
 
