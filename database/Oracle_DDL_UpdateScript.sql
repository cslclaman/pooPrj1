ALTER TABLE TP_Item_Pedido
DROP CONSTRAINT FK_TP_ItemPedido_Pedido;

DROP TABLE TP_Pedido;

CREATE TABLE TP_Pedido
(
  Numero number(7) not null,
  CPF_Cliente varchar2(15) null,
  CPF_Vendedor varchar2(15) not null,
  Status char(1) null,
  Data_Pedido varchar2(15) not null,
  Data_Pagto varchar2(15) null,
  
  CONSTRAINT PK_Pedido_Numero PRIMARY KEY (Numero)
);

ALTER TABLE TP_Item_Pedido
ADD CONSTRAINT FK_TP_ItemPedido_Pedido FOREIGN KEY (Numero_Pedido) REFERENCES TP_Pedido (Numero);