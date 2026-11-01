package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorq {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.aorq.class, java.lang.Object.class, "a");
    public volatile java.lang.Object a;
    private final defpackage.aooh c;

    public aorq(java.lang.Object obj, defpackage.aooh aoohVar) {
        this.c = aoohVar;
        this.a = obj;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.Object andSet = b.getAndSet(this, obj);
        if (this.c != defpackage.aorr.a) {
            java.util.Objects.toString(obj);
            java.util.Objects.toString(andSet);
        }
        return andSet;
    }

    public final void b(java.lang.Object obj) {
        b.lazySet(this, obj);
        if (this.c != defpackage.aorr.a) {
            java.util.Objects.toString(obj);
        }
    }

    public final void c(java.lang.Object obj) {
        this.a = obj;
        if (this.c != defpackage.aorr.a) {
            java.util.Objects.toString(obj);
        }
    }

    public final boolean d(java.lang.Object obj, java.lang.Object obj2) {
        boolean zAg = defpackage.anty.ag(b, this, obj, obj2);
        if (!zAg || this.c == defpackage.aorr.a) {
            return zAg;
        }
        java.util.Objects.toString(obj);
        java.util.Objects.toString(obj2);
        return true;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.a);
    }
}
