public class Entrenamiento{
    private String tipoLevantamiento;
    private int kgLevantamiento;
    private boolean exito;

    public Entrenamiento(String tipoDeLevantamiento, int kgEnLevantamiento){
        tipoLevantamiento = tipoDeLevantamiento;
        kgLevantamiento = kgEnLevantamiento;
        exito = true;
    }

    public void setTipoLevantamiento(String tipoDeLevantamiento){
        tipoLevantamiento = tipoDeLevantamiento;
    }

    public void incrementarKg(int kgIncrementado){
        kgLevantamiento = kgLevantamiento + kgIncrementado;
    }

    public void cambiarExito(boolean logrado){
        if (logrado == true){
            exito = true;
        }
        else{
            exito = false;
        }
    }

    public void imprimeDetalles(){
        System.out.println("Tipo levantamiento: "+ tipoLevantamiento + 
            ". Kg levantados: "+ kgLevantamiento + ". Levantamiento logrado: " 
            + exito + ".");
    }

    public String getEstado(){
        String estado;
        estado = ("Tipo levantamiento: "+ tipoLevantamiento + ". Kg levantados: "+ kgLevantamiento + ". Levantamiento logrado: " 
            + exito + ".");
        return estado;
    }

    public String getTipoDeLevantamiento(){
        return tipoLevantamiento;
    }

    public int getKgEnLevantamiento(){
        return kgLevantamiento;
    }

    public boolean getLogrado(){
        return exito;
    }
}