package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aozl extends defpackage.aozu {
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference(null);

    @Override // defpackage.aozu
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(defpackage.aozk.a);
        return true;
    }

    @Override // defpackage.aozu
    public final /* bridge */ /* synthetic */ defpackage.aoln[] b(java.lang.Object obj) {
        this.a.set(null);
        return defpackage.aozt.a;
    }
}
