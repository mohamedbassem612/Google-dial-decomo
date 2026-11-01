package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nu implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ nu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aomy
    public final java.lang.Object a() {
        defpackage.aii aiiVar;
        switch (this.$cid) {
            case 0:
                int i = nv.a;
                return null;
            case 1:
                return defpackage.aojh.a;
            case 2:
            case 4:
                return null;
            case 3:
                defpackage.aonj aonjVar = defpackage.aga.a;
                return java.lang.Boolean.TRUE;
            case 5:
                return defpackage.aij.a(1.0f);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.aij.a(1.0f);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                aiiVar = new defpackage.aii(new defpackage.dpn(0L), defpackage.alo.g, null, "Animatable");
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cqg cqgVar = new defpackage.cqg(defpackage.cfd.M(0));
                defpackage.aonj aonjVar2 = afn.a;
                float[] fArr = defpackage.crp.a;
                aiiVar = new defpackage.aii(cqgVar, (defpackage.nf) aonjVar2.a(defpackage.crp.e), null, "Animatable");
                break;
            case 9:
                aiiVar = new defpackage.aii(new defpackage.crg(defpackage.mni.bj(0.5f, 0.5f)), defpackage.aga.h, null, "Animatable");
                break;
            case 10:
                return new aon(0);
            case 11:
                return defpackage.aojh.a;
            case 12:
                return java.lang.Boolean.TRUE;
            case 13:
                bcb bcbVar = bco.a;
                return new bcl(0, 0);
            case 14:
                return new defpackage.dpn(0L);
            case 15:
                return new defpackage.dpn(0L);
            case 16:
                defpackage.cbd cbdVar = bix.a;
                return null;
            case 17:
                defpackage.cbd cbdVar2 = bix.a;
                return null;
            case 18:
                defpackage.aonp aonpVar = bkk.a;
                defpackage.aosp aospVar = defpackage.aoth.a;
                return defpackage.apcz.a;
            case 19:
                return new blz(1L);
            default:
                return new bmb();
        }
        return aiiVar;
    }
}
