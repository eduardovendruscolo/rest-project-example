package br.com.reflection.teste;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

import org.junit.Test;

//@Ignore
public class ReflectionTest {

    private String zua = "zua";

    /**
     * @throws ClassNotFoundException
     */
    @Test
    public void testeManipulcaoClasse() throws ClassNotFoundException {
        Class<?> cls = Class.forName( "java.lang.String" );
        Object arr = Array.newInstance( cls, 10 );
        Array.set( arr, 5, "Isto é um teste" );
        String s = ( String ) Array.get( arr, 5 );
        System.out.println( s );
    }

    /**
     * Chama um método de uma classe através de reflexão.
     */
    @Test
    public void testeMetodoSemParametrosPorNome() {
        try {
            @SuppressWarnings( "rawtypes" )
            Class partypes[] = new Class[2];
            partypes[0] = Integer.TYPE;
            partypes[1] = Integer.TYPE;

            Class<?> cls = Class.forName( "br.com.reflection.teste.ReflectionTest" );
            Method meth = cls.getMethod( "getZua" );

            ReflectionTest methobj = new ReflectionTest();
            Object retobj = meth.invoke( methobj );
            String retval = ( String ) retobj;
            System.out.println( retval );
        } catch ( Throwable e ) {
            System.err.println( e );
        }
    }

    /**
     * Chama um método de uma classe através de reflexão.
     */
    @Test
    public void testeMetodoPorNome() {
        try {
            @SuppressWarnings( "rawtypes" )
            Class partypes[] = new Class[2];
            partypes[0] = Integer.TYPE;
            partypes[1] = Integer.TYPE;

            Class<?> cls = Class.forName( "br.com.reflection.teste.ReflectionTest" );
            Method meth = cls.getMethod( "umMetodo", partypes );

            Object arglist[] = new Object[2];
            arglist[0] = new Integer( 37 );
            arglist[1] = new Integer( 47 );

            ReflectionTest methobj = new ReflectionTest();
            Object retobj = meth.invoke( methobj, arglist );
            Integer retval = ( Integer ) retobj;
            System.out.println( retval.intValue() );
        } catch ( Throwable e ) {
            System.err.println( e );
        }
    }

    /**
     * Método de soma, para ser chamado por reflection no teste {@link #testeMetodoPorNome()}
     *
     * @param a
     * @param b
     * @return soma de a + b
     */
    public int umMetodo( int a, int b ) {
        return a + b;
    }

    /**
     * Lista os atributos de uma determinada classe, e seus tipos.
     */
    @Test
    public void testeAtributosClasse() {

        try {
            Class<?> cls = Class.forName( "br.com.reflection.teste.Teste" );

            Field fieldlist[] = cls.getDeclaredFields();
            for ( int i = 0; i < fieldlist.length; i++ ) {
                Field fld = fieldlist[i];
                System.out.println( "nome atributo = " + fld.getName() );
                System.out.println( "membro da classe = " + fld.getDeclaringClass() );
                System.out.println( "tipo = " + fld.getType() );
                int mod = fld.getModifiers();
                System.out.println( "modificadores = " + Modifier.toString( mod ) );
            }
        } catch ( Throwable e ) {
            System.err.println( e );
        }

    }

    /**
     * Teste de intanceof.
     *
     * @throws ClassNotFoundException
     */
    @Test
    public void testeInstanceOf() throws ClassNotFoundException {
        Class<?> cls = Class.forName( "java.lang.String" );

        boolean b1 = cls.isInstance( new Integer( 37 ) );
        System.out.println( b1 );

        boolean b2 = cls.isInstance( new java.lang.String( "teste" ) );
        System.out.println( b2 );

    }

    /**
     * Lista todos os métodos da classe String, com modificadores de acesso, e tipos totalmente qualificados.
     */
    @Test
    public void testeReflectionMethods() {

        try {
            Class<?> c = Class.forName( "java.lang.String" );
            Method m[] = c.getDeclaredMethods();
            for ( int i = 0; i < m.length; i++ ) {
                System.out.println( m[i].toString() );
            }
        } catch ( Throwable e ) {
            System.err.println( e );
        }
    }

    public String getZua() {
        return zua;
    }

    public void setZua( String zua ) {
        this.zua = zua;
    }

}

class Teste {

    private String nome;
    private Date data;

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData( Date data ) {
        this.data = data;
    }

}

enum TesteE {

    SIM, NAO, TALVEZ

}