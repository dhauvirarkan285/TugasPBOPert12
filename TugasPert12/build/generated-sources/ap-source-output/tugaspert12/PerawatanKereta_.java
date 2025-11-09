package tugaspert12;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tugaspert12.Depokeretasbi;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-11-09T23:14:02")
@StaticMetamodel(PerawatanKereta.class)
public class PerawatanKereta_ { 

    public static volatile SingularAttribute<PerawatanKereta, String> jenisPerawatan;
    public static volatile SingularAttribute<PerawatanKereta, String> keterangan;
    public static volatile SingularAttribute<PerawatanKereta, Depokeretasbi> idArmada;
    public static volatile SingularAttribute<PerawatanKereta, Integer> idPerawatan;
    public static volatile SingularAttribute<PerawatanKereta, Date> tanggalPerawatan;

}