import java.util.Objects;
    //Clase factura
public class Factura {
    //Atributos
        private String folio;
        private String cliente;
        private double total;

        //Contructor
        public Factura(String folio, String cliente, double total){
            this.folio= folio;
            this.cliente= cliente;
            this.total= total;
        }

        //Metodo toString () para representar el objeto de forma legible
        //@Override es una anotación que se utiliza para indicar que un metodo esta sobrescribiendo
        @Override
        public String toString(){
            //Devuelve una representación en texto de la factura, incluyendo folio, cliente y total
            return "\uD83E\uDDFE Factura [folio= " + folio + ", cliente= "+ cliente +" , total=$"+ total+ "]";
        }

       @Override
        public boolean equals (Object obj){
            //Si los objetos apuntan al mismo lugar de memoria son iguales
            if (this == obj) return true;
            //Si el objeto es null o no es de la misma clase, no son iguales
            if (obj ==null || getClass() != obj.getClass())
                return false;
            //Se asegua de que el objeto sea del tipo factura antes de compararlo
            Factura factura= (Factura) obj;
            //Compara los folios de ambas facturas para determinar si son iguales
            return Objects.equals(folio, factura.folio);
            }

        @Override
        //Genera un código hash basado unicamente en el folio
        public int hashCode (){
            return Objects.hash(folio);
       }
}
