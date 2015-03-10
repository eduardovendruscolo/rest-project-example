package br.com.reflection.odin.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.ciss.odin.reflection.OdinReflection;
import br.com.dados.Child;
import br.com.dados.ChildDTO;
import br.com.dados.Cnae;
import br.com.dados.CnaeDTO;
import br.com.dados.ConvenioMensal;
import br.com.dados.ConvenioMensalDTO;
import br.com.dados.ConvenioVenda;
import br.com.dados.ConvenioVendaDTO;

public class OdinReflectionTest {

    /**
     * Testa reflection com objeto complexo, onde ocorre interdependências de referências de objetos, ou seja
     * ConvecionVendaDTO tem uma referência de ConvenioMensalDTO e vice versa.
     */
    @Test
    public void testReflectionOdinDtoToOrm() {

        ConvenioVendaDTO convenioVendaDTO = new ConvenioVendaDTO();
        convenioVendaDTO.setDsConvenio( "Convênio venda a vista" );
        convenioVendaDTO.setPeDesconto( 10D );
        convenioVendaDTO.setTpConvenio( 0 );
        convenioVendaDTO.setIdConvenioVenda( 1 );
        convenioVendaDTO.setTpConvenio( 2 );

        ConvenioMensalDTO convenioMensalDTO = new ConvenioMensalDTO();
        convenioMensalDTO.setDiFechamento( 20 );
        convenioMensalDTO.setConvenioVenda( convenioVendaDTO );
        convenioMensalDTO.setIdConvenioMensal( 3 );

        ChildDTO cDTO = new ChildDTO();
        cDTO.setNumero( 666 );
        cDTO.setTexto( "nivel 3" );
        convenioMensalDTO.setChild( cDTO );

        convenioVendaDTO.setConvenioMensal( convenioMensalDTO );

        ConvenioVenda convenioVenda = new ConvenioVenda();
        OdinReflection.copy( convenioVendaDTO, convenioVenda );

        Assert.assertEquals( "Convênio venda a vista", convenioVenda.getDsConvenio() );
        Assert.assertEquals( new Double( 10 ), convenioVenda.getPeDesconto() );
        Assert.assertEquals( new Integer( 1 ), convenioVenda.getIdConvenioVenda() );
        Assert.assertNotNull( convenioVenda.getConvenioMensal() );
        Assert.assertNull( convenioVenda.getConvenioQuinzenal() );
        Assert.assertNull( convenioVenda.getConvenioSemanal() );
        Assert.assertNull( convenioVenda.getConveniosSemanais() );
        Assert.assertEquals( new Integer( 20 ), convenioVenda.getConvenioMensal().getDiFechamento() );
        Assert.assertEquals( new Integer( 3 ), convenioVenda.getConvenioMensal().getIdConvenioMensal() );

        Assert.assertNotNull( convenioVenda.getConvenioMensal().getChild() );
        Assert.assertEquals( convenioVenda.getConvenioMensal().getChild().getTexto(), "nivel 3" );
        Assert.assertEquals( convenioVenda.getConvenioMensal().getChild().getNumero(), new Integer( 666 ) );

    }

    @Test
    public void testReflectionOdinOrmToDTO() {

        ConvenioVenda convenioVenda = new ConvenioVenda();
        convenioVenda.setIdConvenioVenda( 8 );
        convenioVenda.setDsConvenio( "ORM rules ok" );
        convenioVenda.setPeDesconto( 44D );

        ConvenioMensal cm = new ConvenioMensal();
        cm.setConvenioVenda( convenioVenda );
        cm.setDiFechamento( 85 );
        cm.setIdConvenioMensal( 322 );

        Child c = new Child();
        c.setNumero( 12 );
        c.setTexto( "child" );
        cm.setChild( c );

        convenioVenda.setConvenioMensal( cm );

        ConvenioVendaDTO convenioVendaDTO = new ConvenioVendaDTO();
        OdinReflection.copy( convenioVenda, convenioVendaDTO );

        Assert.assertNotNull( convenioVendaDTO );
        Assert.assertNotNull( convenioVendaDTO.getConvenioMensal() );
        Assert.assertNotNull( convenioVendaDTO.getConvenioMensal().getChild() );
        Assert.assertEquals( "ORM rules ok", convenioVendaDTO.getDsConvenio() );
        Assert.assertEquals( new Double( "44" ), convenioVendaDTO.getPeDesconto() );
        Assert.assertEquals( new Integer( "8" ), convenioVendaDTO.getIdConvenioVenda() );
        Assert.assertEquals( convenioVendaDTO.getConvenioMensal().getDiFechamento(), new Integer( "85" ) );
        Assert.assertEquals( convenioVendaDTO.getConvenioMensal().getIdConvenioMensal(), new Integer( "322" ) );
        Assert.assertEquals( convenioVendaDTO.getConvenioMensal().getChild().getTexto(), "child" );
        Assert.assertEquals( convenioVendaDTO.getConvenioMensal().getChild().getNumero(), new Integer( "12" ) );
    }

    @Test
    public void cnaeReflectionTest() {

        CnaeDTO cnaeDTO = new CnaeDTO();
        cnaeDTO.setDsCnae( "haaa" );
        cnaeDTO.setFgExcluido( 1 );
        cnaeDTO.setIdCnae( 555 );
        cnaeDTO.setNrCnae( "777" );

        Cnae cnae = new Cnae();
        OdinReflection.copy( cnaeDTO, cnae );

        Assert.assertNotNull( cnae );
        Assert.assertEquals( "haaa", cnae.getDsCnae() );
        // Assert.assertEquals( ExclusaoLogica.SIM, cnae.getFgExcluido() );
        Assert.assertEquals( "777", cnae.getNrCnae() );
        Assert.assertEquals( new Integer( 555 ), cnae.getIdCnae() );

    }
}
