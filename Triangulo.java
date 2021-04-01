class Triangulo{
    private int a, b, c;
    
    public Triangulo(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int getSideA(){
        return a;
    }

    public int getSideB(){
        return b;
    }

    public int getSideC(){
        return c;
    }

    public void setSideA(int a){
        this.a=a;
    }

    public void setSideB(int b){
        this.b=b;
    }

    public void setSideC(int c){
        this.c=c;
    }


    public double calcularArea(){
        double p = (a+b+c)/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return Math.round(a);
    }

    public static String definirMaior(double area1, double area2){
        if(area1==area2)
            return "As areas são iguais";
            else if(area1>area2)
                return "A primeira area é maior";
                else
                    return "A segunda area é maior";
    }

    public String toString(){
        return "Os lados desse triangulo são:"+a+","+b+","+c+"\nJá a area é de:"+calcularArea();
    }
}