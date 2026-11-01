package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tne extends amzm {
    private final amzg b;

    public tne(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.tne.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.zlr zlrVar = (defpackage.zlr) obj;
        java.util.Set set = defpackage.tna.a;
        aooh.f(zlrVar, "sharpieState");
        defpackage.tth tthVarB = defpackage.tth.b(zlrVar.m().c);
        if (tthVarB == null) {
            tthVarB = defpackage.tth.UNRECOGNIZED;
        }
        return aiql.z(java.lang.Boolean.valueOf(tthVarB == defpackage.tth.SCAM_DETECTED));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
