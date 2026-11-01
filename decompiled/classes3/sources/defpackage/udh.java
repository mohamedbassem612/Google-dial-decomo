package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class udh implements lmv {
    public final rlv a;
    public final defpackage.ahiy b;
    private final aoss c;

    public udh(aoss aossVar, rlv rlvVar, defpackage.ahiy ahiyVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        this.c = aossVar;
        this.a = rlvVar;
        this.b = ahiyVar;
    }

    public final ajcq a(lmq lmqVar, lnl lnlVar) {
        aooh.f(lnlVar, "result");
        return aosv.F(this.c, 0, new defpackage.ugg(lnlVar, lmqVar, this, (aoln) null, 1), 3);
    }
}
