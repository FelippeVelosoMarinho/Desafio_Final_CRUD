# Desafio_Final_CRUD
## Desafio final do programa Campinas tech talents.

Realiza as 4 operações básicas usadas em Banco de dados relacionais. O CRUD é um acrônimo de "Create(Criação), Retrieve(Consulta), Update(Atualização), Delete(Deleta)".

Foi criada uma tabela com os seguintes campos:
Id auto incremento,
Nome not null,
Login (e-mail) not null,
Senha not null,
Data de cadastro, recuperar a data do sistema;

### Os arquivos
O arquivos Connection Factory tem toda a parte de conexão com o banco de dados e é instanciado nas classes CRUD que possui as 4 operações citadas e na CRUDMetodo, que possui igualmente as operações, porém retorna um valor pré-definido.
O classe Cadastro está pegando os dados do usuário pelo Scanner, já a classe CadastroMetodos tem os dados prédefinidos para facilitar os testes em J-unity na classe CadastroJunity.
A classe JDBCTEste é a main.

E como bônus, me arrisquei fazendo uma GUI" Grafical User Interface" simples utilizando a classe InsterfaceGUI pra colocar os Listenners e a classe JDBCInterfaceTeste pra exibir o programinha...
"A interface gráfica deve ser usada em conjunto com o terminal da IDE que irá pedir os dados para conexão com o servidor"...

### Insert
![Insert](https://user-images.githubusercontent.com/60450622/111563894-93797280-8777-11eb-973b-a72631491973.PNG)

### Select
![Select](https://user-images.githubusercontent.com/60450622/111564017-cd4a7900-8777-11eb-9db0-d5f524f06029.PNG)

### Update
![Update](https://user-images.githubusercontent.com/60450622/111564066-e0f5df80-8777-11eb-8400-912ba34eebdd.PNG)

### Delete
![Delete](https://user-images.githubusercontent.com/60450622/111563950-b1df6e00-8777-11eb-9106-f0deb6f7747d.PNG)
