package untitled;

import java.util.ArrayList;
import java.util.List;

public class Untitled {
    // 1. Vamos a practicar operaciones básicas con números
    public static void main(String[] args) {
        Equipo equipo1 =  new Equipo("Argentina", "el mas grande");
        Equipo equipo2 =  new Equipo("Arabia Saudi", "el mas chico");
        Equipo equipo3 =  new Equipo("Mechico", "el mas chico");
        Equipo equipo4 =  new Equipo("Bolonia", "el mas chico");
       Partido partido1 =  new Partido(equipo1, equipo2, 1, 2);
        Partido partido2 =  new Partido(equipo4, equipo3, 0, 0);
        Partido partido3 =  new Partido(equipo1, equipo3, 2, 0);
        Partido partido4 =  new Partido(equipo2, equipo4, 0, 2);
        List<Partido> partidos =  new ArrayList<>();
        partidos.add(partido1);
        partidos.add(partido2);
        partidos.add(partido3);
        partidos.add(partido4);
        Ronda ronda1 = new Ronda(1, partidos);
        Pronostico pronostico1 =  new Pronostico(equipo1, equipo2, ResultadoEnum.PERDERDOR);
        Pronostico pronostico2 =  new Pronostico(equipo4, equipo3, ResultadoEnum.EMPATE);
        Pronostico pronostico3 =  new Pronostico(equipo1, equipo3, ResultadoEnum.GANANDOR);
        Pronostico pronostico4 =  new Pronostico(equipo2, equipo4, ResultadoEnum.PERDERDOR);
        List<Pronostico> pronosticos =  new ArrayList<>();
        pronosticos.add(pronostico4);
        pronosticos.add(pronostico3);
        pronosticos.add(pronostico2);
        pronosticos.add(pronostico1);
        System.out.println(comprararResultados(partidos, pronosticos));
//       System.out.println(partido1.resultado());
//       ResultadoEnum resultado =  ResultadoEnum.GANANDOR;
//       Pronostico pronostico =  new Pronostico(partido1,equipo1, resultado);
//       System.out.println(pronostico.puntos());

    }

    private static int comprararResultados(List<Partido> partidos, List<Pronostico> pronosticos){
        int puntaje = 0;
        for(int i = 0;i<partidos.size(); i++){
            for(int j = 0;j<pronosticos.size(); j++) {
                if(partidos.get(i).getEquipo1().equals(pronosticos.get(j).getEquipo1()) && partidos.get(i).getEquipo2().equals(pronosticos.get(j).getEquipo2())  )
                if (partidos.get(i).resultado().equals(pronosticos.get(j).getResultado())) {
                    puntaje++;
                }
            }
        }
        return puntaje;
    }


    private static void imprimirConsigna(int numeroConsigna) {
        System.out.println("\n**********");
        System.out.println("CONSIGNA " + numeroConsigna);
        System.out.println("**********\n");
    }
}
