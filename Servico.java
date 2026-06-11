package PROJETO02;

public class Servico {
    private double valor = 0;
    double acm = 0;
    boolean s1 = false;
    boolean s2 = false;
    boolean s3 = false;
    String oi = "------ VALOR --------";



    public double getValor(int n){
        if(n == 1){
            acm = acm + 100; // Valor troca de pastilha
            s1 = true;
        } else if (n == 2){
            acm = acm + 75; // Valor troca de óleo
            s2 = true;
        } else if (n == 3){
            acm = acm + 300; // Valor troca de Pneu 
            s3 = true;
        } else {
            return valor;
        }
        valor = acm;
        return acm;
    }
    public double getValor(){
        return valor;
    }

    public String getescrever(){
        return oi;
    }

    public void getServicos(){
        if(s1 && s2 && s3 == true){
            System.out.println("1. Troca de pastilha");
            System.out.println("2. Troca de óleo");
            System.out.println("3. Troca de pneu");
        } else if (s1 == true){
            System.out.println("1. Troca de pastilha");
            if(s2 == true){
                System.out.println("2. Troca de óleo");
            } else if(s3 == true){
                System.out.println("2. Troca de pneu");
            }
        } else if (s2 == true){
            System.out.println("1. Troca de óleo");
            if(s3 == true){
                System.out.println("2. Troca de pneu");
            }
        } else if (s3 == true){
            System.out.println("1. Troca de pneu");
        }
    }
}
