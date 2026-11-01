package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wlr extends amzm {
    private final amyz b;
    private final amzg c;

    public wlr(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.wlr.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        defpackage.abtr abtrVar = (defpackage.abtr) obj;
        if (((java.lang.Boolean) this.b.a()).booleanValue()) {
            akzx akzxVarM = defpackage.wlf.a.m();
            defpackage.wpg wpgVar = abtrVar.n().c;
            if (wpgVar == null) {
                wpgVar = defpackage.wpg.a;
            }
            defpackage.wox woxVar = wpgVar.g;
            if (woxVar == null) {
                woxVar = defpackage.wox.a;
            }
            akzxVarM.u();
            defpackage.wlf wlfVar = (defpackage.wlf) akzxVarM.b;
            j$.util.Objects.requireNonNull(woxVar);
            wlfVar.d = woxVar;
            wlfVar.c = 6;
            optionalOf = j$.util.Optional.of((defpackage.wlf) akzxVarM.p());
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return this.c.d();
    }
}
