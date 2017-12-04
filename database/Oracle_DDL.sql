CREATE TABLE TP_Cliente
(
  CPF varchar2(15) not null,
  Nome varchar2(40) not null,
  Endereco varchar2(50) null,
  Cidade varchar2(30) null,
  CEP varchar2(10) null,
  UF varchar2(2) null,
  DDD varchar2(2) null,
  Telefone varchar2(10) null,
  Limite_Cred number(7,2) not null,
  Limite_Disp number(7,2) null,
  
  CONSTRAINT PK_Cliente_CPF PRIMARY KEY (CPF)
);

CREATE TABLE TP_Vendedor
(
  CPF varchar2(15) not null,
  Nome varchar2(40) not null,
  Endereco varchar2(50) null,
  Cidade varchar2(30) null,
  CEP varchar2(10) null,
  UF varchar2(2) null,
  DDD varchar2(2) null,
  Telefone varchar2(10) null,
  Salario_Base number(7,2) not null,
  Comissao number(5,2) null,
  
  CONSTRAINT PK_Vendedor_CPF PRIMARY KEY (CPF)
);

CREATE TABLE TP_Produto
(
  Codigo number(7) not null,
  Descricao varchar2(40) not null,
  Qtde_Disponivel number(7) null,
  Preco_Unit number (7,2) null,
  Estoque_Min number(7) null,
  
  CONSTRAINT PK_Produto_Codigo PRIMARY KEY (Codigo)
);

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

CREATE TABLE TP_Item_Pedido
(
  Numero_Item number(8) not null,
  Qtde_Vendida number(7) not null,
  Numero_Pedido number(7) null, 
  Codigo_Produto number(7) not null,
  
  CONSTRAINT PK_ItemPedido_NumeroItem PRIMARY KEY (Numero_Item)
);

ALTER TABLE TP_Pedido
ADD CONSTRAINT FK_TP_Pedido_Cliente FOREIGN KEY (CPF_Cliente) REFERENCES TP_Cliente (CPF);

ALTER TABLE TP_Pedido
ADD CONSTRAINT FK_TP_Pedido_Vendedor FOREIGN KEY (CPF_Vendedor) REFERENCES TP_Vendedor (CPF);

ALTER TABLE TP_Item_Pedido
ADD CONSTRAINT FK_TP_ItemPedido_Pedido FOREIGN KEY (Numero_Pedido) REFERENCES TP_Pedido (Numero);

ALTER TABLE TP_Item_Pedido
ADD CONSTRAINT FK_TP_ItemPedido_Produto FOREIGN KEY (Codigo_Produto) REFERENCES TP_Produto (Codigo);