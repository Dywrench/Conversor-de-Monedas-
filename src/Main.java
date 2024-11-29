import java.util.Scanner;

public class Main {

    static View objV = new View();

    public static void main(String[] args) {

            boolean continuar = true;

            while (continuar) {
                int opcion = objV.leerInt(
                        "1. Dólar --> Peso Argentino.\n" +
                                "2. Peso Argentino --> Dólar.\n" +
                                "3. Dólar --> Real Brasileño.\n"  +
                                "4. Real Brasileño --> Dólar.\n"  +
                                "5. Dólar --> Peso Colombiano.\n" +
                                "6. Peso Colombiano  --> Dólar.\n"+
                                "7. Salir."
                );
                switch (opcion) {
                    case 1: {
                        double valor = objV.leerDouble("Ingrese la cantidad a convertir (Dólares a Pesos Argentinos)");
                        try {
                            double tasaCambio = Conversor.obtenerTasaCambio("ARS"); // Peso Argentino.
                            double resultado = Math.round(Conversor.convertir(valor, tasaCambio));
                            objV.mostrarMensaje(
                                    "El valor " + valor + "  [USD] corresponde al valor final de =>>> "
                                            + resultado + " [ARS]."
                            );
                        } catch (Exception e) {
                            objV.mostrarMensaje("Error: " + e.getMessage());
                        }
                        break;
                    }
                    case 2: {
                        double valor = objV.leerDouble("Ingrese la cantidad a convertir (Pesos Argentinos a Dólares)");
                        try {
                            double tasaCambio = Conversor.obtenerTasaCambio("ARS"); // Peso Argentino.
                            double resultado = Math.round(Conversor.convertir(valor, 1 / tasaCambio));
                            objV.mostrarMensaje(
                                    "El valor " + valor + "[ARS] corresponde al valor final de =>>> "
                                            + resultado + " [USD]."
                            );
                        } catch (Exception e) {
                            objV.mostrarMensaje("Error: " + e.getMessage());
                        }
                        break;
                    }
                    case 3: {
                        double valor = objV.leerDouble("Ingrese la cantidad a convertir (Dólares a Reales Brasileños)");
                        try {
                            double tasaCambio = Conversor.obtenerTasaCambio("BRL"); // Real Brasileño.
                            double resultado = Math.round(Conversor.convertir(valor, tasaCambio));
                            objV.mostrarMensaje(
                                    "El valor " + valor + "  [USD] corresponde al valor final de =>>> "
                                            + resultado + " [BRL]."
                            );
                        } catch (Exception e) {
                            objV.mostrarMensaje("Error: " + e.getMessage());
                        }
                        break;
                    }
                    case 4: {
                        double valor = objV.leerDouble("Ingrese la cantidad a convertir (Reales Brasileños a Dólares)");
                        try {
                            double tasaCambio = Conversor.obtenerTasaCambio("BRL"); // Real Brasileño.
                            double resultado = Math.round(Conversor.convertir(valor, 1 / tasaCambio));
                            objV.mostrarMensaje(
                                    "El valor " + valor + "  [BRL] corresponde al valor final de =>>> "
                                            + resultado + " [USD]."
                            );
                        } catch (Exception e) {
                            objV.mostrarMensaje("Error: " + e.getMessage());
                        }
                        break;
                    }
                    case 5: {
                        double valor = objV.leerDouble("Ingrese la cantidad a convertir (Dólares a Pesos Colombianos)");
                        try {
                            double tasaCambio = Conversor.obtenerTasaCambio("COP"); // Peso Colombiano.
                            double resultado = Math.round(Conversor.convertir(valor, tasaCambio));
                            objV.mostrarMensaje(
                                    "El valor " + valor + " [USD] corresponde al valor final de =>>> "
                                            + resultado + " [COP]."
                            );
                        } catch (Exception e) {
                            objV.mostrarMensaje("Error: " + e.getMessage());
                        }
                        break;
                    }
                    case 6: {
                        double valor = objV.leerDouble("Ingrese la cantidad a convertir (Pesos Colombianos a Dólares)");
                        try {
                            double tasaCambio = Conversor.obtenerTasaCambio("COP"); // Peso Colombiano.
                            double resultado = Math.round(Conversor.convertir(valor, 1 / tasaCambio));
                            objV.mostrarMensaje(
                                    "El valor " + valor + " [COP] corresponde al valor final de =>>> "
                                            + resultado + "  [USD]."
                            );
                        } catch (Exception e) {
                            objV.mostrarMensaje("Error: " + e.getMessage());
                        }
                        break;
                    }
                    case 7: {
                        objV.mostrarMensaje("Hasta pronto.");
                        continuar = false;
                        break;
                    }
                    default: {
                        objV.mostrarMensaje("Opción inválida. Por favor, elija una opción válida.");
                        break;
                    }
                }


            }

            }
        }



