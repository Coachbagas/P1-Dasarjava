import javax.lang.model.element.VariableElement;

public class D_Variabelglobaldanlokal {
    static int Varglobal=34;

    public static void main(String[] args) {
        Varglobal=25;
        System.out.println("varglobal diakses di method main dengan nilai = " + Varglobal);
        double Varlokal=3.14;
        System.out.println("varglobal diakses di method main dengan nilai = " + Varlokal);
        aksesVariabellokal();
    }

    public static void aksesVariabellokal(){
        System.out.println("varglobal diakses di method aksesvariabellokal dengan nilai = " + Varglobal);
        //varlokal2.5;
        System.out.println("varloakl tidak bisa di akses di method aksesvariabelloakl ini");
    }
    }

