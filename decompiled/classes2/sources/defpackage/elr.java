package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elr {
    public static final java.util.List a;

    static {
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.5f);
        a = ajsz.bb(new aoiu[]{new aoiu(fValueOf, fValueOf), new aoiu(fValueOf2, fValueOf2)});
    }

    public static final long a(defpackage.elq elqVar) {
        aooh.f(elqVar, "feature");
        java.util.List list = elqVar.b;
        return mni.bj((((defpackage.ell) ajsz.bE(list)).a() + ((defpackage.ell) ajsz.bI(list)).c()) / 2.0f, (((defpackage.ell) ajsz.bE(list)).b() + ((defpackage.ell) ajsz.bI(list)).d()) / 2.0f);
    }
}
