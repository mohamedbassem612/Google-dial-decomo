package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onk extends amzm {
    private final amzg b;
    private final amzg c;

    public onk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.onk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        one oneVar = (one) obj;
        j$.util.Objects.requireNonNull(oneVar);
        defpackage.nfp nfpVar = new defpackage.nfp(oneVar, 9);
        amzg amzgVar = this.c;
        j$.util.Objects.requireNonNull(amzgVar);
        return aiql.z(new uyg(nfpVar, new defpackage.ibg(amzgVar, 20)));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
