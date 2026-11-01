package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kyc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public kyc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new amzw(defpackage.kyc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        kuz kuzVar = (kuz) list.get(0);
        defpackage.kxx kxxVar = (defpackage.kxx) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        j$.util.Objects.requireNonNull(kuzVar);
        return aiql.z(uyg.L(new defpackage.iwm(kuzVar, 7), new defpackage.jyr(kxxVar, 9), ajctVar));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
