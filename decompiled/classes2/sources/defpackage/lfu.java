package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfu extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public lfu(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.lfu.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        lbw lbwVar = (lbw) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        j$.util.Objects.requireNonNull(lbwVar);
        return aiql.z(new uyg(new defpackage.iwm(lbwVar, 8), new defpackage.ibi(this.c, ajctVar, 14, null)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.d.d()});
    }
}
