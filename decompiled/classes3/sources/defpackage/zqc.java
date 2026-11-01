package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zqc extends amzm {
    private final amzg b;
    private final amzg c;

    public zqc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.zqc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.zqj zqjVar = (defpackage.zqj) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        j$.util.Objects.requireNonNull(zqjVar);
        java.lang.Boolean bool = (java.lang.Boolean) mguVar.a(new defpackage.pxs(zqjVar, 19)).a(mfy.aY).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
