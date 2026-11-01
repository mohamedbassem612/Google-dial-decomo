package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acjb implements emj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public acjb(acjf acjfVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, int i) {
        this.$cid = i;
        this.a = acjfVar;
        this.b = promoContext;
    }

    public final void b(emx emxVar) {
        if (this.$cid == 0) {
            ((acjf) this.a).d((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) this.b);
            emxVar.P().d(this);
            return;
        }
        ((defpackage.tw) this.a).a();
        defpackage.tt ttVar = (defpackage.tt) this.b;
        android.hardware.display.VirtualDisplay virtualDisplay = ttVar.c;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            ttVar.c = null;
        }
        emxVar.P().d(this);
    }

    public acjb(defpackage.tt ttVar, defpackage.tw twVar, int i) {
        this.$cid = i;
        this.a = twVar;
        this.b = ttVar;
    }

    public final /* synthetic */ void a(emx emxVar) {
    }

    public final /* synthetic */ void c(emx emxVar) {
    }

    public final /* synthetic */ void e(emx emxVar) {
    }

    public final /* synthetic */ void f(emx emxVar) {
    }

    public final /* synthetic */ void fn(emx emxVar) {
    }
}
