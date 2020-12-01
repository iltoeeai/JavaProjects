package Paskaitos;

public class Rusiavimas {
    public static void main(String[] args) {

        int[] m = {3, 2, 7, 1};
        //System.out.println(m);
        spausdintiMasyva(m);
        // sukeisti masyvo 0 ir 3 elementa vietomis

//        int s = m[0]; // 3
//        m[0] = m[3];  // 1
//        m[3] = s;     // 3

//        sukeistiVietomis(m, 0, 3);
//        //System.out.println(m);
//        spausdintiMasyva(m);

        for(int i = 0; i<m.length - 1; i++){

            int einamasisMaziausias = m[i];
            for(int j = i+1; j<m.length; j++){
                if(einamasisMaziausias > m[j]){
                    sukeistiVietomis(m, i, j);
                    spausdintiMasyva(m);
                }
            }

        }
    }

    //rasom static, nes negaletume is main metodo iskviest ir iskart naudot

    static void sukeistiVietomis(int[] p, int x, int y){ //jei butu pries metoda parasyta public, galetume kviesti is bet kurios klases package
        //metodai gali tureti tuos pacius pavadinimus, tik turi buti skirtingi parametru tipai ar ju skaicius
        int s = p[x];
        p[x] = p[y];
        p[y] = s;

    }

    static void spausdintiMasyva(int[] p){ //p kintamasis galioja tik sitam bloke
        System.out.print("{");

        for(int e : p){
            System.out.print(e + " ");
        }

        System.out.print("}");

    }
}
