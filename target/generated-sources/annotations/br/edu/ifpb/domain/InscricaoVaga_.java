package br.edu.ifpb.domain;

import br.edu.ifpb.domain.Atitude;
import br.edu.ifpb.domain.Candidato;
import br.edu.ifpb.domain.Habilidade;
import br.edu.ifpb.domain.Idioma;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-17T09:54:14")
@StaticMetamodel(InscricaoVaga.class)
public class InscricaoVaga_ { 

    public static volatile ListAttribute<InscricaoVaga, Idioma> idiomas;
    public static volatile ListAttribute<InscricaoVaga, Atitude> atitudes;
    public static volatile SingularAttribute<InscricaoVaga, String> objetivo;
    public static volatile SingularAttribute<InscricaoVaga, Integer> id;
    public static volatile SingularAttribute<InscricaoVaga, Candidato> candidato;
    public static volatile ListAttribute<InscricaoVaga, Habilidade> habilidades;

}