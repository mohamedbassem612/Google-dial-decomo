package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jsz extends amzm {
    private final amyz b;
    private final amzg c;
    private final amyz d;

    public jsz(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar, amyz amyzVar4) {
        super(amyzVar2, new amzw(defpackage.jsz.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
        this.d = amyzVar4;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aoss aossVar = (aoss) obj;
        amyz amyzVar = this.b;
        aooh.f(amyzVar, "callerIdFeedbackSnackbarController");
        aooh.f(aossVar, "lightweightScope");
        amyz amyzVar2 = this.d;
        aooh.f(amyzVar2, "enableCallerIdFeedbackOnInCallUi");
        return aiql.z(new uyg(new defpackage.iwm(amyzVar2, 4), new defpackage.ibi(aossVar, amyzVar, 8, null)));
    }

    protected final ajcq c() {
        return this.c.d();
    }
}
