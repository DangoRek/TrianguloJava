class QuickStart {
    public static void main(String[] args) {
        Triangulo t1, t2;
        t1 = new Triangulo (3,4,5);
        t2 = new Triangulo (6,8,10);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(Triangulo.definirMaior(t1.calcularArea(),t2.calcularArea()));
    }
}