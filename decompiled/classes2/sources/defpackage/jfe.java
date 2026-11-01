package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jfe extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public jfe(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.jfe.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        iqm iqmVar = (iqm) list.get(0);
        aoss aossVar = (aoss) list.get(1);
        izg izgVar = (izg) list.get(2);
        aooh.f(iqmVar, "enabledFn");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(izgVar, "state");
        return aiql.z(new uyg(new defpackage.iwm(iqmVar, 3), new defpackage.ibi(aossVar, izgVar, 7, null)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
