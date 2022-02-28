package projeto.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;


    public LocalDate getData(LocalDate now) {
        return data;
    }

    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "nome='" + getTitulo()+ '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
