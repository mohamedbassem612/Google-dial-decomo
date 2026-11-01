package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agew implements aaug {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ agew(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [aaug, java.lang.Object] */
    public final void a(aaum aaumVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            java.lang.Object obj2 = ((defpackage.agfc) obj).e;
            java.lang.Object obj3 = this.b;
            synchronized (obj2) {
                ((defpackage.agfc) obj).d.remove(obj3);
            }
            return;
        }
        if (i == 1) {
            boolean zK = aaumVar.k();
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.a;
            if (zK) {
                defpackage.ackc ackcVar = (defpackage.ackc) obj5;
                aoov.an(ackcVar.c, (aolr) null, 0, new defpackage.acju(ackcVar, (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj4, (aoln) null, 5, (short[]) null), 3);
                return;
            } else {
                defpackage.ackc ackcVar2 = (defpackage.ackc) obj5;
                aoov.an(ackcVar2.c, (aolr) null, 0, new defpackage.acju(ackcVar2, (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj4, (aoln) null, 3, (byte[]) null), 3);
                return;
            }
        }
        if (i != 2) {
            ((defpackage.ajxd) this.a).g((android.content.Intent) this.b);
            return;
        }
        java.lang.Object obj6 = this.a;
        ahqz ahqzVarF = ahqz.f();
        ahqz.d((ahqz) obj6);
        try {
            this.b.a(aaumVar);
        } finally {
            ahqz.d(ahqzVarF);
        }
    }
}
