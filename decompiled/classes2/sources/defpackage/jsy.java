package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jsy extends amzm {
    private final amyz b;
    private final amzg c;
    private final amzg d;

    public jsy(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.jsy.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
        this.d = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        amyz amyzVar = this.b;
        aoss aossVar = (aoss) obj;
        aooh.f(amyzVar, "enableCallerIdFeedbackOnInCallUi");
        aooh.f(aossVar, "lightweightScope");
        return aiql.z(new uyg(new defpackage.iwm(amyzVar, 5), new defpackage.ibi(aossVar, this.d, 9, null)));
    }

    protected final ajcq c() {
        return this.c.d();
    }
}
