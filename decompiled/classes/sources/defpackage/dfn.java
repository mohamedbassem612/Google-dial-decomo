package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfn implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public static final defpackage.dfn b = new defpackage.dfn(8);
    public static final defpackage.dfn a = new defpackage.dfn(7);

    public dfn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).G();
            case 1:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).W();
            case 2:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).n();
            case 3:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).O();
            case 4:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).M();
            case 5:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).I();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.dcv) defpackage.den.aa((defpackage.cje) obj, defpackage.dfo.a)).U();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                if (defpackage.aooh.n(obj, java.lang.Boolean.FALSE)) {
                    float[] fArr = defpackage.crp.a;
                    return new defpackage.cqg(defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u));
                }
                if (obj == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlin.Int");
                }
                return new defpackage.cqg(((long) ((java.lang.Integer) obj).intValue()) << 32);
            default:
                return null;
        }
    }
}
