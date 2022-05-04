/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoTesteBuider;

/**
 *
 * @author IFGoiano
 */
public class BuilderNotebookBasico implements IBuilderProtocolo {
    public Computador notebook = new Computador();
    
    @Override
    public Computador configura(String m, String t, String d, String nd, String d2, String b, String me){
        Componentes monitor = new Monitor15("Monitor TCE",300);
        this.notebook.adicionaComponente(monitor);
        Componentes teclado = new TecladoComum("Teclado comum",100);
        this.notebook.adicionaComponente(teclado);
        Componentes drive = new Hdd("Drive HDD",300);
        this.notebook.adicionaComponente(drive);
        Componentes bateria = new Bateria8cel("Bateria 8 celulas",400);
        this.notebook.adicionaComponente(bateria);
        Componentes memoria = new Memoria4GB("Memória DDR3 4 GB",400);
        this.notebook.adicionaComponente(memoria);
        
        return(this.notebook);


    }
}
