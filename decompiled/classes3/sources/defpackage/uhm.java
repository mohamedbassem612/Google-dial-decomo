package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uhm implements afgr {
    public final android.content.Context a;
    public final ajct b;
    private final rlv c;

    public uhm(rlv rlvVar, android.content.Context context, ajct ajctVar) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(context, "appContext");
        aooh.f(ajctVar, "backgroundExecutor");
        this.c = rlvVar;
        this.a = context;
        this.b = ajctVar;
    }

    public final /* bridge */ /* synthetic */ albh a(defpackage.afpl afplVar, albh albhVar) {
        defpackage.uhl uhlVar = (defpackage.uhl) albhVar;
        aooh.f(uhlVar, "message");
        this.c.o(rmx.oD);
        defpackage.vaa vaaVarBI = wsc.bI(uhlVar.p());
        vaaVarBI.n(afplVar.h("spam_blocking_promo_last_show_millis") != 0);
        return vaaVarBI.m();
    }
}
