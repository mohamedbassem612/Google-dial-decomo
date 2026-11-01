package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yfv implements defpackage.yfw {
    final /* synthetic */ defpackage.yfw a;
    private volatile java.lang.Object b;

    public yfv(defpackage.yfw yfwVar) {
        this.a = yfwVar;
    }

    @Override // defpackage.yfw
    public final java.lang.Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    java.lang.Object objA = this.a.a();
                    anty.aI(objA, "Argument must not be null");
                    this.b = objA;
                }
            }
        }
        return this.b;
    }
}
