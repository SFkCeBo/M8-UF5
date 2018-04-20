
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marc
 */
public class Aplicacio {

    public static void main(String[] args) {
        boolean sortir = false;
        int opcion;
        String nompropietari;
        String pcognompropietari;
        String scognompropietari;
        int newsecret;
        float cambiarsaldo;
        int cambiarnsecreto;
        int i;
        String quieres;
        String newnom;
        int totalcomptes = 0;
        ArrayList persones = new ArrayList();
        ArrayList banca = new ArrayList();
        Iterator iter = null;
        int buscarncompte = 0;
        int buscarnsecret = 0;
        float saldoact = 0;
        int comprovar1 = 0;
        int comprovar2 = 0;

        while (!sortir) {
            System.out.println("1. Crear nou compte");
            System.out.println("2. Modificar compte");
            System.out.println("3. Eliminar compte");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Ingressar");
            System.out.println("6. Extreure");
            System.out.println("7. Modificar número secret");
            System.out.println("8. Sortir");
            opcion = cLlegir.datoInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introdueix el nom del propietari");
                    nompropietari = cLlegir.dato();
                    System.out.println("Introdueix el primer cognom del propietari");
                    pcognompropietari = cLlegir.dato();
                    System.out.println("Introdueix el segon cognom del propietari");
                    scognompropietari = cLlegir.dato();
                    System.out.println("Introdueix el numero secret del propietari");
                    newsecret = cLlegir.datoInt();
                    CPersona cp = new CPersona(nompropietari, pcognompropietari, scognompropietari, newsecret);
                    persones.add(cp);
                    CCompteBancari cb = new CCompteBancari(cp);
                    totalcomptes++;
                    banca.add(cb);
                    System.out.println("Compte Creat Correctament " + cb.getNumero());
                    break;

                case 2:
                    System.out.println("Introdueix el numero de compte");
                    buscarncompte = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    buscarnsecret = cLlegir.datoInt();
                    iter = banca.iterator();
                    while (iter.hasNext()) {
                        CCompteBancari cu = (CCompteBancari) iter.next();
                        if (cu.getNumero() == buscarncompte) {
                            if (cu.comprovarNsecret(cu.getPropietari().getNsecret(), buscarnsecret)) {
                                System.out.println("Benvingut " + cu.getPropietari().getNom() + " " + cu.getPropietari().getScognom());
                                System.out.println("Introdueix el nou nom");
                                newnom = cLlegir.dato();
                                cu.getPropietari().setNom(newnom);
                                System.out.println("Nom cambiat");
                                break;
                            } else {
                                comprovar2++;
                            }
                        } else {
                            comprovar1++;
                        }
                    }
                    if (comprovar1 == totalcomptes) {
                        System.out.println("El numero de compte no existeix");
                        comprovar1 = 0;
                        break;
                    }
                    if (comprovar2 == totalcomptes) {
                        System.out.println("El numero secret es incorrecte");
                        comprovar2 = 0;
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Introdueix el numero de compte");
                    buscarncompte = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    buscarnsecret = cLlegir.datoInt();
                    iter = banca.iterator();
                    while (iter.hasNext()) {
                        CCompteBancari cu = (CCompteBancari) iter.next();
                        if (cu.getNumero() == buscarncompte) {
                            if (cu.comprovarNsecret(cu.getPropietari().getNsecret(), buscarnsecret)) {
                                System.out.println("Benvingut " + cu.getPropietari().getNom() + " " + cu.getPropietari().getScognom());
                                System.out.println("Estas seguro que quieres eliminar la cuenta?Si/No");
                                quieres = cLlegir.dato();
                                if (quieres.equals("Si") || quieres.equals("S") || quieres.equals("1")) {
                                    banca.remove(cu);
                                    System.out.println("Cuenta Borrada");
                                    break;
                                } else {
                                comprovar2++;
                            }
                        } else {
                            comprovar1++;
                        }
                    }
                    }
                    if (comprovar1 == totalcomptes) {
                        System.out.println("El numero de compte no existeix");
                        comprovar1 = 0;
                        break;
                    }
                    if (comprovar2 == totalcomptes) {
                        System.out.println("El numero secret es incorrecte");
                        comprovar2 = 0;
                        break;
                    }
                    break;
                case 4:
                    System.out.println("Introdueix el numero de compte");
                    buscarncompte = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    buscarnsecret = cLlegir.datoInt();
                    iter = banca.iterator();
                    while (iter.hasNext()) {
                        CCompteBancari cu = (CCompteBancari) iter.next();
                        if (cu.getNumero() == buscarncompte) {
                            if (cu.comprovarNsecret(cu.getPropietari().getNsecret(), buscarnsecret)) {
                                System.out.println("Benvingut " + cu.getPropietari().getNom() + " " + cu.getPropietari().getScognom());
                                System.out.println("Tu saldo es de " + cu.consultarSaldo());
                                break;
                            } else {
                                comprovar2++;
                            }
                        } else {
                            comprovar1++;
                        }
                    }
                    if (comprovar1 == totalcomptes) {
                        System.out.println("El numero de compte no existeix");
                        comprovar1 = 0;
                        break;
                    }
                    if (comprovar2 == totalcomptes) {
                        System.out.println("El numero secret es incorrecte");
                        comprovar2 = 0;
                        break;
                    }
                    break;
                case 5:
                    System.out.println("Introdueix el numero de compte");
                    buscarncompte = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    buscarnsecret = cLlegir.datoInt();
                    iter = banca.iterator();
                    while (iter.hasNext()) {
                        CCompteBancari cu = (CCompteBancari) iter.next();
                        if (cu.getNumero() == buscarncompte) {
                            if (cu.comprovarNsecret(cu.getPropietari().getNsecret(), buscarnsecret)) {
                                System.out.println("Benvingut " + cu.getPropietari().getNom() + " " + cu.getPropietari().getScognom());
                                System.out.println("Tu saldo es de " + cu.consultarSaldo() + " €");
                                System.out.println("Cuanto vas a ingresar");
                                cambiarsaldo = cLlegir.datoFloat();
                                cu.ingresar(cu.getNumero(), cambiarsaldo);
                                System.out.println("Ingreso completado, ahora tienes " + cu.consultarSaldo() + " €");
                                break;
                            } else {
                                comprovar2++;
                            }
                        } else {
                            comprovar1++;
                        }
                    }
                    if (comprovar1 == totalcomptes) {
                        System.out.println("El numero de compte no existeix");
                        comprovar1 = 0;
                        break;
                    }
                    if (comprovar2 == totalcomptes) {
                        System.out.println("El numero secret es incorrecte");
                        comprovar2 = 0;
                        break;
                    }
                    break;
                case 6:
                    System.out.println("Introdueix el numero de compte");
                    buscarncompte = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    buscarnsecret = cLlegir.datoInt();
                    iter = banca.iterator();
                    while (iter.hasNext()) {
                        CCompteBancari cu = (CCompteBancari) iter.next();
                        if (cu.getNumero() == buscarncompte) {
                            if (cu.comprovarNsecret(cu.getPropietari().getNsecret(), buscarnsecret)) {
                                System.out.println("Benvingut " + cu.getPropietari().getNom() + " " + cu.getPropietari().getScognom());
                                System.out.println("Tu saldo es de " + cu.consultarSaldo() + " €");
                                System.out.println("Cuanto vas a extrear");
                                cambiarsaldo = cLlegir.datoFloat();
                                saldoact = cu.consultarSaldo();
                                saldoact = saldoact - cambiarsaldo;
                                if (cambiarsaldo > 0) {
                                    cu.extraer(cu.getNumero(), cambiarsaldo);
                                    System.out.println("Extraccion completada, ahora tienes " + cu.consultarSaldo() + " €");
                                    break;
                                } else {
                                    System.out.println("No tienes suficiente dinero");
                                    break;
                                }
                            } else {
                                comprovar2++;
                            }
                        } else {
                            comprovar1++;
                        }
                    }
                    if (comprovar1 == totalcomptes) {
                        System.out.println("El numero de compte no existeix");
                        comprovar1 = 0;
                        break;
                    }
                    if (comprovar2 == totalcomptes) {
                        System.out.println("El numero secret es incorrecte");
                        comprovar2 = 0;
                        break;
                    }
                    break;
                case 7:
                    System.out.println("Introdueix el numero de compte");
                    buscarncompte = cLlegir.datoInt();
                    System.out.println("Introdueix el numero secret");
                    buscarnsecret = cLlegir.datoInt();
                    iter = banca.iterator();
                    while (iter.hasNext()) {
                        CCompteBancari cu = (CCompteBancari) iter.next();
                        if (cu.getNumero() == buscarncompte) {
                            if (cu.comprovarNsecret(cu.getPropietari().getNsecret(), buscarnsecret)) {
                                System.out.println("Benvingut " + cu.getPropietari().getNom() + " " + cu.getPropietari().getScognom());
                                System.out.println("Que numero secreto quieres");
                                cambiarnsecreto = cLlegir.datoInt();
                                cu.getPropietari().setNsecret(cambiarnsecreto);
                                System.out.println("Cambio completado");
                                break;
                            } else {
                                comprovar2++;
                            }
                        } else {
                            comprovar1++;
                        }
                    }
                    if (comprovar1 == totalcomptes) {
                        System.out.println("El numero de compte no existeix");
                        comprovar1 = 0;
                        break;
                    }
                    if (comprovar2 == totalcomptes) {
                        System.out.println("El numero secret es incorrecte");
                        comprovar2 = 0;
                        break;
                    }
                    break;
                case 8:
                    System.out.println("Gracias por confiar con nosotros <3");
                    sortir = true;
                    break;
            }

        }
    }
}
