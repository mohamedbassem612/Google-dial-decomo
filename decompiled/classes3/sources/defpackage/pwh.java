package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pwh extends amzm {
    private final amzg b;
    private final amzg c;

    public pwh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pwh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.ptx ptxVar = (defpackage.ptx) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        j$.util.Objects.requireNonNull(ptxVar);
        java.lang.Boolean bool = (java.lang.Boolean) mguVar.a(new defpackage.pxs(ptxVar, 1)).a(mfy.bV).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
