/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoTesteBuider;

/**
 *
 * @author IFGoiano
 */
public class BuilderNotebookPersonalizado implements IBuilderProtocolo{
    public Computador notebook = new Computador();
    
    @Override
     public Computador configura(String m, String t, String d, String nd, String d2, String b, String me){
         if(m.equals("1")){
             Componentes monitor = new Monitor15("Monitor TCE",300);
             this.notebook.adicionaComponente(monitor);
        }else{
            Componentes monitor = new Monitor17("Monitor ACER",500);
            this.notebook.adicionaComponente(monitor);
        }
        
         
        
        if(t.equals("1")){
             Componentes teclado = new TecladoComum("Teclado comum",100);
             this.notebook.adicionaComponente(teclado);
        }else{
            Componentes teclado = new TecladoRetroIluminado("Teclado RetroIluminado",800);
            this.notebook.adicionaComponente(teclado);
        }
        
            
        if(d.equals("1")){
             Componentes drive = new Hdd("Drive HDD",300);
             this.notebook.adicionaComponente(drive);
        }else{
            Componentes drive = new Ssd("Drive SSD",600);
            this.notebook.adicionaComponente(drive);
        }
        
              
        if(nd.equals("1")){
        
              
            if(d2.equals("1")){
                Componentes drive = new Hdd("Drive HDD",300);
                this.notebook.adicionaComponente(drive);
            }else{
                Componentes drive = new Ssd("Drive SSD",600);
                this.notebook.adicionaComponente(drive);
            }
        }
        
        
        
        if(b.equals("1")){
            Componentes bateria = new Bateria8cel("Bateria 8 celulas",400);
            this.notebook.adicionaComponente(bateria);
        }
                     
        if(b.equals("2")){
            Componentes bateria = new Bateria10cel("Bateria  10 celulas",600);
            this.notebook.adicionaComponente(bateria);
        }
        
        if(b.equals("3")){
            Componentes bateria = new Bateria16cel("Bateria 16 celulas",1000);
            this.notebook.adicionaComponente(bateria);
        }
        
               
        if(me.equals("1")){
            Componentes memoria = new Memoria4GB("Memória DDR3 4 GB",400);
            this.notebook.adicionaComponente(memoria);
        }
                     
        if(me.equals("2")){
            Componentes memoria = new Memoria8GB("Memória DDR4 8 GB",700);
            this.notebook.adicionaComponente(memoria);
        }
        
        if(me.equals("3")){
            Componentes memoria = new Memoria16GB("Memória DDR5 16 GB",1200);
            this.notebook.adicionaComponente(memoria);
        }
        
        return(this.notebook);
     }
}
