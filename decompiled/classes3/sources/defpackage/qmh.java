package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmh extends amzm {
    private final amzg b;

    public qmh(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qmh.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qix qixVar = (defpackage.qix) obj;
        aooh.f(qixVar, "notificationType");
        return aiql.z(java.lang.Boolean.valueOf(ajsz.cW(new defpackage.qix[]{defpackage.qix.c, defpackage.qix.d, defpackage.qix.b}).contains(qixVar)));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
