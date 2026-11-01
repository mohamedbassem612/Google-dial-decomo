package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uan extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public uan(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.uan.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.taq taqVar = (defpackage.taq) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        ohk ohkVar = new ohk(((java.lang.Boolean) list.get(2)).booleanValue(), 4);
        j$.util.Objects.requireNonNull(taqVar);
        return aiql.z(defpackage.uyg.L(ohkVar, new defpackage.tvg(taqVar, 6), ajctVar));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
