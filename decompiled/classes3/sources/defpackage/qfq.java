package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qfq extends amzm {
    private final amzg b;
    private final amzg c;

    public qfq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qfq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        j$.util.Optional optional = ((defpackage.qfg) list.get(1)).g;
        return aiql.z(!optional.isPresent() ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Integer.valueOf(((java.lang.Integer) optional.orElseThrow()).intValue() + (zBooleanValue ? 1 : 0))));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
