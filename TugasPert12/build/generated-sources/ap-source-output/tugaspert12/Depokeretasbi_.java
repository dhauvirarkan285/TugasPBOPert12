package tugaspert12;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tugaspert12.PerawatanKereta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-11-09T23:14:02")
@StaticMetamodel(Depokeretasbi.class)
public class Depokeretasbi_ { 

    public static volatile SingularAttribute<Depokeretasbi, String> jenisArmada;
    public static volatile SingularAttribute<Depokeretasbi, Integer> idArmada;
    public static volatile SingularAttribute<Depokeretasbi, Date> tanggalMulaiDinas;
    public static volatile SingularAttribute<Depokeretasbi, Date> tanggalPerawatanTerakhir;
    public static volatile SingularAttribute<Depokeretasbi, String> nomorArmada;
    public static volatile CollectionAttribute<Depokeretasbi, PerawatanKereta> perawatanKeretaCollection;
    public static volatile SingularAttribute<Depokeretasbi, Date> tanggalPerawatanBerikutnya;

}