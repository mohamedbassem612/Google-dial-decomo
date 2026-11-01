package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ula extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public ula(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.ula.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        long jLongValue = ((java.lang.Long) list.get(0)).longValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(2);
        aooh.f(optional, "callDisconnectTimeMillis");
        aooh.f(zpoVar, "callStatus");
        if (zpoVar == defpackage.zpo.g && ((java.lang.Number) aooh.p(optional, 0L)).longValue() - jLongValue > 0) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
