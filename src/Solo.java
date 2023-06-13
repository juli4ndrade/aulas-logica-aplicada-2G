public class Solo {
    // Atributos do Solo
    boolean fertil;
    String tipoSolo;
    String localSolo;
    String estado;
    //Método
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);

        return p1;
    }
}
