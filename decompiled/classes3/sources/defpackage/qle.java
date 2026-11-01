package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qle extends amzm {
    private final amzg b;
    private final amzg c;

    public qle(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qle.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.qkm qkmVar = (defpackage.qkm) list.get(0);
        defpackage.abwd abwdVar = (defpackage.abwd) list.get(1);
        aooh.f(qkmVar, "notificationContactPhotoLoader");
        aooh.f(abwdVar, "photoInfo");
        ahoq ahoqVarW = ahvr.W(616, "StatusBarNotificationProducerModule_produceContactPhotoBitmap");
        try {
            android.content.res.Resources resources = qkmVar.b.getResources();
            ops opsVar = qkmVar.e;
            defpackage.akcu akcuVar = new defpackage.akcu();
            akcuVar.f();
            akcuVar.g(true);
            akcuVar.h(false);
            ajcq ajcqVarE = opsVar.e(abwdVar, akcuVar.e(), (int) resources.getDimension(android.R.dimen.notification_large_icon_width), (int) resources.getDimension(android.R.dimen.notification_large_icon_height));
            ajcq ajcqVarB = ahvr.B(aiql.G(aiql.A(ajcqVarE), ((java.lang.Long) qkmVar.c.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, qkmVar.d), java.util.concurrent.TimeoutException.class, new oqe(qkmVar, ajcqVarE, 14), ajbm.a);
            ahoqVarW.a(ajcqVarB);
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
            return ajcqVarB;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
