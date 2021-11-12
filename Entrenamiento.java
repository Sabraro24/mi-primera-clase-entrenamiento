public class Entrenamiento{
    private String tipoLevantamiento;
    private int kgLevantamiento;
    private boolean exito;

    public Entrenamiento(String tipoDeLevantamiento, int kgEnLevantamiento, boolean logrado){
        tipoLevantamiento = tipoDeLevantamiento;
        kgLevantamiento = kgEnLevantamiento;
        exito = logrado;
    }

    public void setTipoLevantamiento(String tipoDeLevantamiento){
        tipoLevantamiento = tipoDeLevantamiento;
    }

    public void incrementarKg(int kgIncrementado){
        kgLevantamiento = kgLevantamiento + kgIncrementado;
    }
    
    public void cambiarExito(boolean cambiarExito){
        if (cambiarExito == true){
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
        estado = tipoLevantamiento + kgLevantamiento + exito;
        return estado;
    }
}