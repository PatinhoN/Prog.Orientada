    package classe;

    import interfaces.crud;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;


    public class Categoria implements crud {

    int id;
    String nome;

    public Categoria(){}
    public Categoria(int id) {
        if (id > 0) {
            String sql = "SELECT*FROM produtos WHERE id=?";
            try {
                Connection cone = DB.conexao();
                PreparedStatement stmt = cone.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();

                while (registro.next()) {
                    this.setId(registro.getInt("id"));
                    this.setNome(registro.getString("nome"));
                }
            } catch (SQLException e) {
                System.out.println("Erro na consula de Produto" + e.toString());
            }
        }
    }
    @Override
    public void adicionar(){
        String sql = "INSERT INTO categorias (nome) VALUES(?)";
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,this.getNome());
            stmt.execute();
        }catch(SQLException e){
            System.out.println("Erro" + e);
        }
    }
    public ArrayList<Categoria> listar{
        String sql = "SELECT*FROM categorias;";
        ArrayList<Categoria>categorias= new ArrayList<>();
        try{ 
            Connection con = DB.conexao();
            PreparedStatement stmt =con.prepareStatement(sql);
            ResultSet registro = stmt.executeQuery();

            while(registros.next()){
                Categoria temp = new Categoria();
                temp.setId(registro.getInt("id"));
                temp.setNome(registro.getString("nome"));
                categorias.add(temp);
            }
        }catch(SQLException e){
            System.out.println("Erro no Listar Categoria"+e.toString());
        }
        return categorias;
    }

    public Categoria(int id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }
    ////
    public Categoria(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
