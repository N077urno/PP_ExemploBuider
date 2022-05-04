/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoTesteBuider;

/**
 *
 * @author IFGoiano
 */
public class Bateria8cel extends Componentes implements IProtocolo  {
    
    public Bateria8cel(String tipo, float price){
        this.marca = tipo;
        this.preco = price;
    }
    
    @Override
    public float getPrice(){
        return(this.preco);
    }
}
