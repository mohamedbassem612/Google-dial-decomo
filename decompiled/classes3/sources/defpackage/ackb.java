package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ackb implements aaug {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ackb(aabo aaboVar, java.lang.String str, java.util.concurrent.ScheduledFuture scheduledFuture, int i) {
        this.$cid = i;
        this.c = aaboVar;
        this.a = str;
        this.b = scheduledFuture;
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void a(aaum aaumVar) {
        if (this.$cid != 0) {
            aec aecVar = ((aabo) this.c).c;
            java.lang.Object obj = this.a;
            synchronized (aecVar) {
                aecVar.remove(obj);
            }
            this.b.cancel(false);
            return;
        }
        boolean zK = aaumVar.k();
        java.lang.Object obj2 = this.a;
        java.lang.Object obj3 = this.b;
        if (!zK) {
            defpackage.ackc ackcVar = (defpackage.ackc) obj3;
            aoov.an(ackcVar.c, (aolr) null, 0, new defpackage.acju(ackcVar, (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj2, (aoln) null, 4, (char[]) null), 3);
            return;
        }
        com.google.android.play.core.review.ReviewInfo reviewInfo = (com.google.android.play.core.review.ReviewInfo) aaumVar.g();
        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj2;
        akjx akjxVar = promoContext.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        if (akjxVar.f) {
            defpackage.ackc ackcVar2 = (defpackage.ackc) obj3;
            aoov.an(ackcVar2.c, (aolr) null, 0, new defpackage.acju(ackcVar2, promoContext, (aoln) null, 2), 3);
        } else {
            java.lang.Object obj4 = this.c;
            defpackage.ackc ackcVar3 = (defpackage.ackc) obj3;
            ackcVar3.b.k(promoContext);
            ackcVar3.d.a((android.app.Activity) obj4, reviewInfo).n(ajbm.a, new defpackage.agew(obj3, obj2, 1));
        }
    }

    public /* synthetic */ ackb(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.ackc ackcVar, az azVar, int i) {
        this.$cid = i;
        this.a = promoContext;
        this.b = ackcVar;
        this.c = azVar;
    }
}
