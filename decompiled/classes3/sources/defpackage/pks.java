package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pks extends amzm {
    private final amzg b;
    private final amzg c;

    public pks(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pks.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.sql sqlVar = (defpackage.sql) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        java.lang.String strI = sqlVar.i();
        return aiql.z((j$.util.Optional) new mgr(mguVar, !android.text.TextUtils.isEmpty(strI) ? j$.util.Optional.of(strI) : j$.util.Optional.empty()).a(mfy.aQ).i());
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
