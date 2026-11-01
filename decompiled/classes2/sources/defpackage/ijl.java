package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijl extends amzm {
    private final amzg b;
    private final amzg c;

    public ijl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.ijl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aoss aossVar = (aoss) list.get(0);
        defpackage.ijk ijkVar = (defpackage.ijk) list.get(1);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ijkVar, "audioPrismExclusivityDialogsImpl");
        return aiql.z(uyg.J(new defpackage.ibi(aossVar, ijkVar, 4, null)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
