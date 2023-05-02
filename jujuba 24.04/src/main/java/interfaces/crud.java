package interfaces;
import classe.Categoria;
import java.util.ArrayList;

public interface crud {
    public void adicionar();
    public ArrayList<Categoria> listar();
    public void atualizar();
    public void deletar();
}
