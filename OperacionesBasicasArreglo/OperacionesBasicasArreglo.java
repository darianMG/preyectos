/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Luis Andrés Valido Fajardo 
 */
public class OperacionesBasicasArreglo {

    /**
     * @breif Constantes que sirve para definir el color de texto de la información que
     * se impriman por consola. Pura pacotilla para darle un mejor acabado visual
     * al programa.
     * 
     * @author Luis Andrés Valido Fajardo 
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static boolean arregloCreado(int [] _arreglo){
        if(_arreglo == null) return false;
        else return true;
    }
    
    public static int [] crearNuevoArreglo(Scanner _input){
        System.out.println("Entre la capacidad del arreglo");
        int capacidadMaxima = inputOnlyInteger(_input);
        int [] arreglo =new int [capacidadMaxima];
        System.out.println(ANSI_GREEN+"Arreglo"+ANSI_RESET);
        return arreglo;
    }
    
    public static void imprimirArreglo(int [] _arreglo, int _cantReal){
        System.out.print(ANSI_BLUE+"["+ANSI_RESET);
        
        for(int i=0;i<_cantReal;i++){
            if(i>0){
                System.out.print(ANSI_BLUE+","+ANSI_RESET);
            }
            System.out.print(ANSI_BLUE+_arreglo[i]+ANSI_RESET);
        }
        
        System.out.println(ANSI_BLUE+"]"+ANSI_RESET);
    }
    
    public static void imprimirInformacionCompletaArreglo(Scanner _input ,int [] _arreglo, int _cantReal){
        System.out.println(ANSI_BLUE+"Arreglo con una capacidad maxima de:"+_arreglo.length+ANSI_RESET);
        System.out.println(ANSI_BLUE+"La cantidad de elementos en el arreglo son:"+_cantReal+ANSI_RESET);
        System.out.println(ANSI_BLUE+"Los elementos almacenados son:"+ANSI_RESET);
        imprimirArreglo(_arreglo, _cantReal);
    }
    
    /**
     * Metodo encargado de adicionnar un nuevo elemento al arreglo
     * 
     * @param _arregloEnteros arreglo donde se va adicionar el nuevo elemento
     * @param _cantReal cantidad real de elementos del arreglo.
     * @param _valorAdicionar valor que se desea adicionar al arreglo
     * @return  Verdadero si se pudo adicionar al arreglo falso en caso contrario.
     */
    public static boolean adicionarArreglo(int[] _arregloEnteros, int _cantReal, int _valorAdicionar) {
        boolean adicionar =false;
        if(_cantReal<_arregloEnteros.length){
            _arregloEnteros[_cantReal]=_valorAdicionar;
            adicionar=true;
        } 
        return adicionar;
    }
    
    /**
     * Metodo encargado de insertar un nuevo elemento al arreglo
     * 
     * @param _arregloEnteros arreglo donde se va adicionar el nuevo elemento
     * @param _cantReal cantidad real de elementos del arreglo.
     * @param _valorInsertar valor que se va insertar en el arreglo
     * @param _posicionInsertar posicion en el arreglo que se desea insertar el valor
     * @return Verdadero si se pudo insertar en el arreglo falso en caso contrario
     */
    public static boolean insertarArreglo(int[] _arregloEnteros, int _cantReal, int _valorInsertar, int _posicionInsertar) {
       boolean insertar =false;
        //TODO Implementar el resto del algoritmo
    if (_posicionInsertar < 0 || _posicionInsertar > _cantReal) {
        return false;
    }
    if (_cantReal == _arregloEnteros.length) {
        int[] nuevoArreglo = new int[_arregloEnteros.length * 2];
        for (int i = 0; i < _cantReal; i++) {
            nuevoArreglo[i] = _arregloEnteros[i];
        }
        _arregloEnteros = nuevoArreglo;
    }
    
    for (int i = _cantReal - 1; i >= _posicionInsertar; i--) {
        _arregloEnteros[i + 1] = _arregloEnteros[i];
    }
    _arregloEnteros[_posicionInsertar] = _valorInsertar;
    _cantReal++;
    insertar = true;
       return insertar;
    }
    
    /**
     * Metodo encargado de eliminar un elemento del arreglo conocida su posicion
     * en el arreglo. La eliminacion del elemento no provoca cambios en el orden de los
     * elementos restantes
     * 
     * @param _arregloEnteros arreglo de donde se desea eliminar 
     * @param _cantReal cantidad real de elementos del arreglo
     * @param _posicion posicion en el arreglo que se desea eliminar el valor 
     * que esta ahi.
     * @return Verdadero si se pudo eliminar en el arreglo falso en caso contrario
     */
    public static boolean eliminarArregloManteniendoOrden(int[] _arregloEnteros, int _cantReal, int _posicion) {
       boolean eliminar =false;
        //TODO Implementar el resto del algoritmo
    if (_posicion < 0 || _posicion >= _cantReal) {
        return false;
    }
    for (int i = _posicion; i < _cantReal - 1; i++) {
        _arregloEnteros[i] = _arregloEnteros[i + 1];
    }
    _cantReal--;
    eliminar = true;
       return eliminar;
    }

    /**
     * Metodo encargado de eliminar un elemento del arreglo conocida su posicion
     * en el arreglo. La eliminacion del elemento provoca cambios en el orden de los
     * elementos restantes
     * 
     * @param _arregloEnteros arreglo de donde se desea eliminar 
     * @param _cantReal cantidad real de elementos del arreglo
     * @param _posicion posicion en el arreglo que se desea eliminar el valor 
     * que esta ahi.
     * @return Verdadero si se pudo eliminar en el arreglo falso en caso contrario
     */
    public static boolean eliminarArregloSinOrden(int[] _arregloEnteros, int _cantReal, int _posicion) {
       boolean eliminar =false;
        //TODO Implementar el resto del algoritmo
    if (_posicion < 0 || _posicion >= _cantReal) {
        return false;
    }
    _arregloEnteros[_posicion] = _arregloEnteros[_cantReal - 1];
    _cantReal--;
    eliminar = true;
    
    return eliminar;
    }
    
    /**
     * Busca la ultima posicion del arreglo donde se encuentra el valor 
     * 
     * @param _arregloEnteros arreglo donde se va a buscar
     * @param _cantReal cantidad real de elementos del arreglo
     * @param _valorBuscar valor a buscar en el arreglo
     * @return Retorna -1 si elemento no se encuentra en el arreglo sino retorna
     * la posicion del elemento
     */
    public static int buscarUltimaOcurrencia(int[] _arregloEnteros, int _cantReal, int _valorBuscar) {
        int posicion=-1;
        //TODO Implementar el resto del algoritmo
    for (int i = _cantReal - 1; i >= 0; i--) {
        if (_arregloEnteros[i] == _valorBuscar) {
    
            posicion = i;
            break;
        }
    }
        return posicion;
    }

    /**
     * Busca la primera posicion del arreglo donde se encuentra el valor 
     * 
     * @param _arregloEnteros arreglo donde se va a buscar
     * @param _cantReal cantidad real de elementos del arreglo
     * @param _valorBuscar valor a buscar en el arreglo
     * @return Retorna -1 si elemento no se encuentra en el arreglo sino retorna
     * la posicion del elemento
     */
    public static int buscarPrimeraOcurrencia(int[] _arregloEnteros, int _cantReal, int _valorBuscar) {
        int posicion =-1;
        //TODO Implementar el resto del algoritmo
        for (int i = 0; i < _cantReal; i++) {
            if (_arregloEnteros[i] == _valorBuscar) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     * Busca la existencia o no de un valor dentro de los almacenados en el arreglo
     * 
     * @param _arregloEnteros arreglo donde se va a buscar
     * @param _cantReal cantidad real de elementos del arreglo
     * @param _valorBuscar valor a buscar en el arreglo
     * @return Retorna verdadero si el elemento esta en el arreglo sino retorna falso.
     */
    public static boolean buscar(int[]_arregloEnteros, int _cantReal, int _valorBuscar) {
        boolean encontrado =false;
        //TODO Implementar el resto del algoritmo
        for (int i = 0; i < _cantReal; i++) {
            if (_arregloEnteros[i] == _valorBuscar) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }
    
    /**
     * @brief Método principal del programa y donde inicia el programa
     * 
     * @param args
     * @throws IOException
     * 
     * @author Luis Andres Valido Fajardo
     */
    public static void main(String[] args) throws IOException {
        
        //TODO: Variable que indica cuando el usuario quiere terminar el programa
        boolean exitProgram = false; 
        //TODO: Objeto Scanner para leer los datos de la consola
        Scanner input = new Scanner(System.in);
        
        //TODO: Variable que va almacenar la opción asociado a una operación que 
        // quiere el usuario realizar en el programa.
        int option;
        
        int [] arregloEnteros = null ;
        int cantReal=0;

        //TODO: Mientras el usuario no quiera terminar el programa
        while (exitProgram == false) {
            //Muestro el menu
            showMenuProgram();
            // Capturo la opcion-operacion que quiere realizar el usuario inv-
            //cando al método inputOnlyInteger.
            option = inputOnlyInteger(input);
            //Determino que operacion quiere hacer el usuario
            switch (option) {
                case 1://Si el usuario quiere hacer la operación asociado al uno
                    arregloEnteros = crearNuevoArreglo(input);
                    cantReal =0;
                    waitPressKey();
                    break;
                case 2://Si el usuario quiere hacer la operación asociado al dos
                    if(arregloCreado(arregloEnteros)){
                        System.out.println("Entre el valor a adicionar");
                        int valorAdicionar = inputOnlyInteger(input);
                        if(adicionarArreglo(arregloEnteros,cantReal,valorAdicionar)){
                            cantReal++;
                            System.out.println(ANSI_RED+"Exito!!!. Elemento adicionado al arreglo."+ANSI_RESET);
                        }else{
                            System.out.println(ANSI_RED+"Error!!!. No se pudo adicionar el elemento al arreglo, no existe capacidad."+ANSI_RESET);
                        }
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    break;
                case 3://Si el usuario quiere hacer la operación asociado al tres
                    if(arregloCreado(arregloEnteros)){
                       System.out.println("Entre el valor a insertar");
                       int valorInsertar = inputOnlyInteger(input);
                       System.out.println("Entre la posicion a insertar");
                       int posicionInsertar = inputOnlyInteger(input);
                       if(insertarArreglo(arregloEnteros,cantReal,valorInsertar,posicionInsertar)){
                            cantReal++;
                            System.out.println(ANSI_RED+"Exito!!!. Elemento insertado al arreglo."+ANSI_RESET);
                        }else{
                            System.out.println(ANSI_RED+"Error!!!. No se pudo insertar el elemento al arreglo"+ANSI_RESET);
                        } 
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;
                case 4://Si el usuario quiere hacer la operación asociado al cuatro
                    if(arregloCreado(arregloEnteros)){
                        System.out.println(ANSI_BLUE+"Los valores del arreglo son:"+ANSI_RESET);
                        imprimirArreglo(arregloEnteros, cantReal);
                        System.out.println(ANSI_BLUE+"Entre la posicion del valor del arreglo que desea eliminar"+ANSI_RESET);
                        int posicion = inputOnlyInteger(input);
                        posicion--;
                        if(eliminarArregloSinOrden(arregloEnteros,cantReal,posicion)){
                            cantReal--;
                             System.out.println(ANSI_RED+"Exito!!!. Elemento eliminado del arreglo."+ANSI_RESET);
                        }else{
                            System.out.println(ANSI_RED+"Error!!!. No se pudo eliminar el valor del arreglo"+ANSI_RESET);
                        }
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;
                case 5://Si el usuario quiere hacer la operación asociado al cinco
                    if(arregloCreado(arregloEnteros)){
                        System.out.println(ANSI_BLUE+"Los valores del arreglo son:"+ANSI_RESET);
                        imprimirArreglo(arregloEnteros, cantReal);
                        System.out.println(ANSI_BLUE+"Entre la posicion del valor del arreglo que desea eliminar"+ANSI_RESET);
                        int posicion = inputOnlyInteger(input);
                        posicion--;
                        if(eliminarArregloManteniendoOrden(arregloEnteros,cantReal,posicion)){
                            cantReal--;
                             System.out.println(ANSI_RED+"Exito!!!. Elemento eliminado del arreglo."+ANSI_RESET);
                        }else{
                            System.out.println(ANSI_RED+"Error!!!. No se pudo eliminar el valor del arreglo"+ANSI_RESET);
                        }
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;
                case 6://Si el usuario quiere hacer la operación asociado al cinco
                    if(arregloCreado(arregloEnteros)){
                        System.out.println(ANSI_BLUE+"Entre la posicion del valor del arreglo que desea obtener"+ANSI_RESET);
                        int posicion = inputOnlyInteger(input);
                        posicion--;
                        if(0<=posicion && posicion<cantReal){
                            System.out.println(ANSI_BLUE+"El valor almacenado en esa posicion del arreglo es:"+arregloEnteros[posicion]+ANSI_RESET);
                        }else{
                            System.out.println(ANSI_RED+"Error!!!. Posicion fuera de rango valido del arreglo"+ANSI_RESET);
                        }
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;
                case 7://Si el usuario quiere hacer la operación asociado al cinco
                    if(arregloCreado(arregloEnteros)){
                       System.out.println("Entre el valor");
                       int valorModificar = inputOnlyInteger(input);
                       System.out.println("Entre la posicion a modificar");
                       int posicionModificar = inputOnlyInteger(input);
                        posicionModificar--;
                        if(0<=posicionModificar && posicionModificar<cantReal){
                            System.out.println(ANSI_BLUE+"El valor almacenado en esa posicion del arreglo ha sido modificado"+ANSI_RESET);
                            arregloEnteros[posicionModificar]=valorModificar;
                        }else{
                            System.out.println(ANSI_RED+"Error!!!. Posicion fuera de rango valido del arreglo"+ANSI_RESET);
                        }
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;
                case 8://Si el usuario quiere hacer la operación asociado al cinco
                    if(arregloCreado(arregloEnteros)){
                         System.out.println("Entre el valor a buscar");
                         int valorBuscar = inputOnlyInteger(input);
                         if(buscar(arregloEnteros,cantReal,valorBuscar)==true){
                             System.out.println(ANSI_RED+"El elemento buscado se encuentra en el arreglo"+ANSI_RESET);
                         }else{
                             System.out.println(ANSI_YELLOW+"El elemento buscado no se encuentra en el arreglo"+ANSI_RESET);
                         }
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;
                case 9://Si el usuario quiere hacer la operación asociado al cinco
                    if(arregloCreado(arregloEnteros)){
                        System.out.println("Entre el valor a buscar");
                         int valorBuscar = inputOnlyInteger(input);
                         int posicion = buscarPrimeraOcurrencia(arregloEnteros,cantReal,valorBuscar);
                         if(posicion!=-1){
                             posicion++;
                             System.out.println(ANSI_RED+"El elemento buscado se encuentra en el arreglo en la posicion:"+posicion+ANSI_RESET);
                         }else{
                             System.out.println(ANSI_YELLOW+"El elemento buscado no se encuentra en el arreglo"+ANSI_RESET);
                         }
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;
                case 10://Si el usuario quiere hacer la operación asociado al cinco
                    if(arregloCreado(arregloEnteros)){
                        System.out.println("Entre el valor a buscar");
                         int valorBuscar = inputOnlyInteger(input);
                         int posicion = buscarUltimaOcurrencia(arregloEnteros,cantReal,valorBuscar);
                         if(posicion!=-1){
                             posicion++;
                             System.out.println(ANSI_RED+"El elemento buscado se encuentra en el arreglo en la posicion:"+posicion+ANSI_RESET);
                         }else{
                             System.out.println(ANSI_YELLOW+"El elemento buscado no se encuentra en el arreglo"+ANSI_RESET);
                         }
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;    
                case 11://Si el usuario quiere hacer la operación asociado al cinco
                    if(arregloCreado(arregloEnteros)){
                        imprimirInformacionCompletaArreglo(input,arregloEnteros,cantReal);
                    }else{
                        System.out.println(ANSI_RED+"Error!!!. El arreglo no ha sido creado"+ANSI_RESET);
                    }
                    waitPressKey();
                    break;
                    
                case 12: //Si el usuario quiere hacer la operación asociado al seis
                    exitProgram = true;
                    break;
                default://En caso que el usuario entro un numero que no tiene definido
                    // una operación se le notifica del error.
                    System.out.println(ANSI_RED +"Usted ha escojido una opción incorrecta \nLea"
                            + " atentamente el menú."+ ANSI_RESET);
                    waitPressKey();
                    break;
            }
        }
        //TODO: Cartel de finalizacion del programa
        System.out.println(ANSI_GREEN+"El programa a finalizado correctamente."+ANSI_RESET);
    }

    /**
     * @breif Método que se encarga de imprimir en consola el menú con las diferentes 
     * operaciones que se pueden realizar en el programa. Notar que cada supuesta 
     * funcionalidad, acción u operación se asocia a un número. Por lo general 
     * si el programa tiene N operaciones el número N+1 es el que va indicar que
     * el usuario quiere terminar el programa.
     * 
     * @author Luis Andrés Valido Fajardo 
     */
    private static void showMenuProgram() {
         System.out.println(ANSI_BLUE+"*******************************************************************"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"*                     Bienvenidos al Programa X                   *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* Opciones del programa:                                          *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 1-Para crear un arreglo nuevo vacio                             *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 2-Adicionar un elemento al arreglo                              *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 3-Insertar un elemento al arreglo                               *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 4-Eliminar un elemento del arreglo sin importar orden inicial   *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 5-Eliminar un elemento del arreglo manteniendo el orden inicial *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 6-Obtener un elemento del arreglo                               *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 7-Modificar un elemento del arreglo                             *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 8-Buscar un elemento en el arreglo                              *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 9-Posicion de la primera ocurrencia un elemento en el arreglo   *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 10-Posicion de la ultima ocurrencia un elemento en el arreglo    *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 11-Imprimir los valores del arreglo                             *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* 12-Salir del programa                                           *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"*                                                                 *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* Presiones el número asociado a la operación                     *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"* que desea realizar.                                             *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"*                                                                 *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"*                                                    Autor: √αઽђα *"+ANSI_RESET);
         System.out.println(ANSI_BLUE+"*******************************************************************"+ANSI_RESET);
    }

    /**
     * @brief Método encargado de leer exactamente un enetero por la consola.
     * Mientras el usuario no entre un valor con esas características el método
     * se queda esperando por dicho valor.
     * 
     * @param _input Varaible de tipo Scanner que esta conectado a la consola a 
     * través de la cual se recibe la información que introduce el usuario.
     * 
     * @return El valor entero introducido por el usuario por consola.
     * 
     * @author Luis Andrés Valido Fajardo 
     */
    private static int inputOnlyInteger(Scanner _input) {
        String data = _input.next();
        while (isInteger(data) == false) {
            System.out.println(ANSI_RED +"El valor introducido no es un valor entero. \n"
                    + "Por favor vuelva a intentarlo."+ ANSI_RESET);
            data = _input.next();
        }
        return Integer.parseInt(data);
    }

    /**
     * @brief Método encargado de comprobar si una cadena de caracteres puede
     * ser convertida en un numero entero sin problema.
     * 
     * @param strNum Variable de tipo cadena que almacena una secuencia de 
     * caracteres la cual se quiere comprobar que todos son digitos.
     * 
     * @return Verdadero si la candena puede ser convertida a un entero o Falso
     * en caso contrario.
     * 
     * @author Luis Andrés Valido Fajardo
     */
    private static boolean isInteger(String strNum) {
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    
    /**
     * @brief Método encargado de comprobar si una cadena de caracteres puede
     * ser convertida en un numero real sin problema.
     * 
     * @param strNum Variable de tipo cadena que almacena una secuencia de 
     * caracteres la cual se quiere comprobar que todos son digitos.
     * 
     * @return Verdadero si la candena puede ser convertida a un real o Falso
     * en caso contrario.
     * 
     * @author Luis Andrés Valido Fajardo
     */
    private static boolean isDouble(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    /**
     * @breif Método encargado de imprimir el cartel "Presione ENTER para continuar." y
     * esperar que el usuario presione la tecla ENTER
     *
     * @author Luis Andrés Valido Fajardo 
     */
    private static void waitPressKey() throws IOException {
        System.out.println(ANSI_YELLOW+"Presione ENTER para continuar."+ANSI_RESET);
        char c = (char) System.in.read();
        clearConsole();
    }
    
    /**
     * @breif Método encargado de limpiar la consola siempre y cuando se este 
     * ejecutando el programa desde el cmd del Sistema operativo
     *
     * @author Luis Andrés Valido Fajardo 
     */
    public final static void clearConsole(){
        try{
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");
                System.out.print("\033[H\033[2J");

            }else{
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");

            }
        }catch (final Exception e){
            System.out.print("\033[H\033[2J");
        }
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }

    

    

    

    

}
