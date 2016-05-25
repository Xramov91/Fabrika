/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mill;

/**
 *
 * @author Alex
 */
public class Material {
    private String material;
    Material(String material1){
    material = material1; 
    }
public String get(){
    return material;
}
public void set(String mat){
    material = mat;
}
}
