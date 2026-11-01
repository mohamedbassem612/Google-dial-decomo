package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public syq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.syq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        return ((java.lang.Boolean) list.get(0)).booleanValue() ? ahvr.H(this.b.d(), new defpackage.syf(4), (ajct) list.get(1)) : aiql.z(j$.util.Optional.of("phone_incoming_call"));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.c.d(), this.d.d()});
    }
}
