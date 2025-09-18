package atividade02cesar_caua;

import java.util.Scanner;

public class Atividade03cesar_caua {
    public static void main(String[] args) {
        System.out.println("Açúcar necessário para 10 porções: " + ReceitaEscalonada.calcularAcucar(10) + "g");
        System.out.println("Tempo necessário com 6 impressoras: " + ImpressorasTempo.calcularTempo(6) + " minutos");
        System.out.println("Combustível necessário para 300 km: " + ConsumoCombustivel.calcularCombustivel(300) + "L");
        System.out.println("Peças produzidas: " + ProducaoMaquinas.calcularProducao(8, 6));
        System.out.println("Valor em reais: " + ConversaoCambial.converterParaReais(5.25, 100));
        System.out.println("Raiz da equação: " + RaizEquacaoLinear.calcularRaiz(2, 4));
        System.out.println("Valor de y para x0 = 4: " + AvaliacaoFuncaoLinear.calcularY(2, 3, 4));
        RetaPorDoisPontos.calcularReta(1, 2, 3, 6);
        IntersecaoRetas.calcularIntersecao(1, 2, -1, 4);
        Quadratica.calcularRaizes(1, -3, 2); // a, b, c
        System.out.println("Distância entre as raízes: " + DistanciaRaizes.calcularDistancia(16, 2));
        DerivadaQuadratica.calcularDerivada(1, -3, 2, 1);
        System.out.println("Área sob a reta: " + AreaSobReta.calcularArea(2, 1, 1, 3));
    }
}
#atividade1
class ReceitaEscalonada {
    public static double calcularAcucar(int porcoes) {
        return (200.0 * porcoes) / 8;
    }
}
#atividade2
class ImpressorasTempo {
    public static double calcularTempo(int impressoras) {
        return (12.0 * 3) / impressoras;
    }
}
atividade 3
class ConsumoCombustivel {
    public static double calcularCombustivel(double distancia) {
        return (18.0 * distancia) / 240;
    }
}
#atividade4
class ProducaoMaquinas {
    public static double calcularProducao(int maquinas, int horas) {
        return (900.0 * maquinas * horas) / (6.0 * 5);
    }
}
#atividade5
class ConversaoCambial {
    public static double converterParaReais(double cotacao, double dolares) {
        return cotacao * dolares;
    }
}
#atividade6
class RaizEquacaoLinear {
    public static double calcularRaiz(double a, double b) {
        return -b / a;
    }
}
#atividade7
class AvaliacaoFuncaoLinear {
    public static double calcularY(double m, double b, double x0) {
        return m * x0 + b;
    }
}
#atividade8
class RetaPorDoisPontos {
    public static void calcularReta(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        System.out.println("Equação da reta: y = " + m + "x + " + b);
    }
}
#atividade9
class IntersecaoRetas {
    public static void calcularIntersecao(double m1, double b1, double m2, double b2) {
        double x = (b2 - b1) / (m1 - m2);
        double y = m1 * x + b1;
        System.out.println("Ponto de intersecção: (" + x + ", " + y + ")");
    }
}
atividade10
class Quadratica {
    public static void calcularRaizes(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Não há raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Δ = " + delta);
            System.out.println("Raiz x1 = " + x1);
            System.out.println("Raiz x2 = " + x2);
        }
    }
}
#atividade11
class DistanciaRaizes {
    public static double calcularDistancia(double delta, double a) {
        return Math.abs(Math.sqrt(delta) / a);
    }
}
#atividade12
class DerivadaQuadratica {
    public static void calcularDerivada(double a, double b, double c, double x0) {
        double fx0 = a * Math.pow(x0, 2) + b * x0 + c;
        double fpx0 = 2 * a * x0 + b;
        System.out.println("f(" + x0 + ") = " + fx0);
        System.out.println("f'(" + x0 + ") = " + fpx0);
    }
}
#atividade13
class AreaSobReta {
    public static double calcularArea(double m, double b, double x1, double x2) {
        double y1 = m * x1 + b;
        double y2 = m * x2 + b;
        return ((y1 + y2) / 2) * (x2 - x1);
    }
}
