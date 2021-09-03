
package com.mycompany.reto10luiszapatafernandobuelvas.modelpackage;

import static java.lang.Math.pow;


public class Esfera implements InterfaceEsfera {
    
    private Double r;
    
    
    public Esfera(){
    
        this.r = 0.0;
    }
    
    
    @Override
    public Double volumen(){
        
      Double volumen = (1.3333 * 3.141592) * (double)pow(this.r, 3);
       
      return volumen;
        
    }

    @Override
    public Double superficie() {
        
       Double superficie = 4 * (3.141592) * (double)pow(this.r, 2);
       
      return superficie;
        
    }

    @Override
    public Double areaCirculo() {
        
       Double area = (3.141592) * (double)pow(this.r, 2);
       
       return area;
       
    }

    @Override
    public Double perimetroCirculo() {
        
       Double perimetro = (2 * 3.141592) * this.r;
       
       return perimetro;
        
    }

    @Override
    public void setR(Double r) {
        this.r = r;
    }

    @Override
    public Double getR() {
        return this.r;
    }
    
    
}
