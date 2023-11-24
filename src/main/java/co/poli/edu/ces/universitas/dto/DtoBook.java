package co.poli.edu.ces.universitas.dto;

public class DtoBook {
    public int id;

    protected String titulo;

    private String autor;

    public DtoBook(int id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public DtoBook(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
    }

    public DtoBook() {

    }

    public int getId(){
        return this.id;
    }


    private void setId(int id){
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "El estudiante se llama: " + this.autor +
                " su Titulo es: " + this.titulo;
    }
}
