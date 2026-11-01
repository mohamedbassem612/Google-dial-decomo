package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkp extends amzm {
    private final amyz b;
    private final amzg c;
    private final amzg d;

    public pkp(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkp.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
        this.d = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.Boolean bool = (java.lang.Boolean) ((mgu) list.get(1)).a(new defpackage.pin((j$.util.Optional) list.get(0), this.b, 2, null)).a(mfy.aW).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.c.d(), this.d.d()});
    }
}
