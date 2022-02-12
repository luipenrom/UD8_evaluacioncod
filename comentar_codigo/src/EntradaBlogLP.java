
/**
 * @author LuisPe
 */
/* Clase para manejar las entradas de un blog.
 * La clase se modific� el 20220212 por LuisPe.
 * Esta es la versi�n 6.9
 */

public class EntradaBlogLP {
    /** separador */
	public static char separador=':';
    /** id */
	private int id;
    /** texto */
        private String texto;
    /** autor */
        private String autor;

    /**
     * @param id identifica
     * @param autor LuisPe
     * @param texto texto
     * @throws IllegalArgumentException si el resultado es negativo
     */
	public EntradaBlogLP(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}

    /**
     *
     * @return Suma String + separador + autor
     */
    @Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
    /**
     *
     * @return Devuelve el n�mero de la entrada
     */
	public int getId(){
		return this.id;
	}
	
    /**
     *
     * @return devuelve el texto completo de la entrada
     */
	public String getTexto(){
		return this.texto;
	}
	
    /**
     *
     * @return devuelve el nombre del autor de la entrada en may�sculas
     */
	public String getAutor(){
		return this.autor.toUpperCase();
	}

    /**
     *
     * @return devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     */
	public String devuelveAutor(){
		return this.autor;
	}
    /**
     *
     * @param args metodo principal del programa
     */  
        public static void main(String[] args) {
		EntradaBlogLP e1=new EntradaBlogLP (5,"LuisP","�ltimas noticias, nada funciona en condiciones");
		System.out.println(e1);
    }
}