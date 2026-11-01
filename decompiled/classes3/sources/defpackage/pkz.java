package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkz extends amzm {
    private final amzg b;

    public pkz(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkz.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.String strG = ((defpackage.sql) obj).g();
        return aiql.z(!android.text.TextUtils.isEmpty(strG) ? j$.util.Optional.of(strG) : j$.util.Optional.empty());
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
