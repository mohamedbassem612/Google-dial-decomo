package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkn implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public static final defpackage.dkn b = new defpackage.dkn(1);
    public static final defpackage.dkn a = new defpackage.dkn(0);

    public dkn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        defpackage.aoio aoioVar;
        if (this.$cid == 0) {
            long j = ((defpackage.cqg) obj2).a;
            if (j == 16) {
                return java.lang.Boolean.FALSE;
            }
            float[] fArr = defpackage.crp.a;
            return java.lang.Integer.valueOf((int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32));
        }
        defpackage.dhr dhrVar = (defpackage.dhr) obj;
        defpackage.dhr dhrVar2 = (defpackage.dhr) obj2;
        if (dhrVar == null || (str = dhrVar.a) == null) {
            str = dhrVar2.a;
        }
        if (dhrVar == null || (aoioVar = dhrVar.b) == null) {
            aoioVar = dhrVar2.b;
        }
        return new defpackage.dhr(str, aoioVar);
    }
}
