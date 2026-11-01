package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wda extends amzm {
    private final amzg b;

    public wda(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.wda.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.sql sqlVar = (defpackage.sql) obj;
        return aiql.z(sqlVar.o() ? j$.util.Optional.of(sqlVar.h()) : j$.util.Optional.empty());
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
