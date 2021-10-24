/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so1proyecto2;

/**
 *
 * @author cesar
 */
public class Proceso {
    String name;
    int size;
    int pId;
    int quantum;

    public Proceso(String name, int size, int pId, int quantum){
        this.pId = pId;
        this.name = name;
        this.size = size;
        this.quantum = quantum;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }    

    public void setSize(int size){
        this.size = size;
    }

    public int getPId(){
        return this.pId;
    }

    public int getQuantum(){
        return this.quantum;
    }

}
