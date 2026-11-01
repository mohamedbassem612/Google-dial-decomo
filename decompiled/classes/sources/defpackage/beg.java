package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class beg implements java.util.Comparator {
    private final /* synthetic */ int $cid;

    public /* synthetic */ beg(int i) {
        this.$cid = i;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return defpackage.aooh.a(((defpackage.bef) obj).c(), ((defpackage.bef) obj2).c());
            case 1:
                int i = ((amwp) obj2).a;
                int i2 = ((amwp) obj).a;
                long j = defpackage.bcr.a;
                return defpackage.aooh.a(i, i2);
            case 2:
                return defpackage.aooh.a(((defpackage.aodd) obj).b, ((defpackage.aodd) obj2).b);
            case 3:
                defpackage.dbk dbkVar = (defpackage.dbk) obj;
                defpackage.dbk dbkVar2 = (defpackage.dbk) obj2;
                return dbkVar.d() == dbkVar2.d() ? defpackage.aooh.a(dbkVar.f(), dbkVar2.f()) : java.lang.Float.compare(dbkVar.d(), dbkVar2.d());
            case 4:
                defpackage.aopq aopqVar = (defpackage.aopq) obj;
                defpackage.aopq aopqVar2 = (defpackage.aopq) obj2;
                return (aopqVar.b - aopqVar.a) - (aopqVar2.b - aopqVar2.a);
            case 5:
                return java.lang.Integer.valueOf(((defpackage.kgc) ((java.util.Map.Entry) obj).getKey()).ordinal()).compareTo(java.lang.Integer.valueOf(((defpackage.kgc) ((java.util.Map.Entry) obj2).getKey()).ordinal()));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.kkd) obj).a().compareTo(((defpackage.kkd) obj2).a());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ajsz.au(java.lang.Integer.valueOf(((defpackage.rnx) obj).a()), java.lang.Integer.valueOf(((defpackage.rnx) obj2).a()));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Integer.valueOf(((defpackage.rob) obj).c).compareTo(java.lang.Integer.valueOf(((defpackage.rob) obj2).c));
            case 9:
                return java.lang.Integer.valueOf(((defpackage.rny) obj).b).compareTo(java.lang.Integer.valueOf(((defpackage.rny) obj2).b));
            case 10:
                return java.lang.Integer.valueOf(((defpackage.rnx) obj).a()).compareTo(java.lang.Integer.valueOf(((defpackage.rnx) obj2).a()));
            case 11:
                return defpackage.ajsz.au(((defpackage.rrz) obj).b(), ((defpackage.rrz) obj2).b());
            case 12:
                byte[] bArr = defpackage.soh.a;
                return java.lang.Long.compare(java.lang.Long.valueOf(((java.io.File) obj).getName()).longValue(), java.lang.Long.valueOf(((java.io.File) obj2).getName()).longValue());
            case 13:
                akjy akjyVar = ((akhl) obj2).l;
                if (akjyVar == null) {
                    akjyVar = akjy.a;
                }
                java.lang.Double dValueOf = java.lang.Double.valueOf(akjyVar.c);
                akjy akjyVar2 = ((akhl) obj).l;
                if (akjyVar2 == null) {
                    akjyVar2 = akjy.a;
                }
                return defpackage.ajsz.au(dValueOf, java.lang.Double.valueOf(akjyVar2.c));
            case 14:
                int i3 = defpackage.adjz.i;
                return ((defpackage.adkd) obj).e().compareTo(((defpackage.adkd) obj2).e());
            case 15:
                defpackage.adkd adkdVar = (defpackage.adkd) obj;
                defpackage.adkd adkdVar2 = (defpackage.adkd) obj2;
                int i4 = defpackage.adjz.i;
                int iCompare = java.lang.Long.compare(adkdVar.b(), adkdVar2.b());
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = java.lang.Long.compare(adkdVar.f(), adkdVar2.f());
                return iCompare2 == 0 ? java.lang.Long.compare(adkdVar.c(), adkdVar2.c()) : iCompare2;
            case 16:
                return ((defpackage.adsi) obj).a.compareTo(((defpackage.adsi) obj2).a);
            case 17:
                return defpackage.ajsz.au(java.lang.Integer.valueOf(((defpackage.akri) obj).hashCode()), java.lang.Integer.valueOf(((defpackage.akri) obj2).hashCode()));
            case 18:
                aiqr aiqrVarA = aiqr.a(obj);
                aiqr aiqrVarA2 = aiqr.a(obj2);
                if (aiqrVarA != aiqrVarA2) {
                    return aiqrVarA.compareTo(aiqrVarA2);
                }
                int iOrdinal = aiqrVarA.ordinal();
                if (iOrdinal == 0) {
                    return ((java.lang.Boolean) obj).compareTo((java.lang.Boolean) obj2);
                }
                if (iOrdinal == 1) {
                    return ((java.lang.String) obj).compareTo((java.lang.String) obj2);
                }
                if (iOrdinal == 2) {
                    return ((java.lang.Long) obj).compareTo((java.lang.Long) obj2);
                }
                if (iOrdinal == 3) {
                    return ((java.lang.Double) obj).compareTo((java.lang.Double) obj2);
                }
                throw null;
            case 19:
                return ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).compareTo((java.lang.String) ((java.util.Map.Entry) obj2).getKey());
            default:
                java.lang.String str = (java.lang.String) obj;
                java.lang.String str2 = (java.lang.String) obj2;
                int i5 = defpackage.apor.e;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 != null) {
                    return str.compareToIgnoreCase(str2);
                }
                return 1;
        }
    }
}
