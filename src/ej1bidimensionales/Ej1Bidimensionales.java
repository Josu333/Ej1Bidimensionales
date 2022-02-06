/*
 Un concesionario de automóviles quiere guardar información de las ventas de sus
 15 modelos de coches durante los seis primeros meses.
 Se pide:
 a. Cargar los modelos de los coches (de un modelo se guarda el nombre del 
 modelo y el tipo).
 b. Cargar las ventas por meses.
 c. Obtener un listado de ventas
 Nota: El beneficio de las ventas se calcula en función del total de ventas y 
tipo de coche.

          IMPORTE VENTAS   15000   30000   50000   100000  +100000
TURISMO
Turismo                     15%      10%    10%      18%        6%
Deportivo                   18%      12%    14%      20%        8%
Todo Terreno                21%      14%    16%      22%       10%


                         INFORME DE VENTAS
Fecha:                                                       Página:

Modelo de coche | Importe ventas 1er trimestre | Importe ventas 2º trimestre | Total | Beneficio

 */

package ej1bidimensionales;

/**
 *
 * @author dam
 */
public class Ej1Bidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concesionario miEmpresa=new Concesionario(1);
        miEmpresa.crear();
        miEmpresa.pedirDatos();
        miEmpresa.pedirVentasMes();
        miEmpresa.informe();
    }
    
}
