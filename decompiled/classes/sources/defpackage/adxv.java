package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adxv implements defpackage.aolq {
    private final defpackage.apdp a;

    public adxv(defpackage.apdp apdpVar) {
        defpackage.aooh.f(apdpVar, "mutex");
        this.a = apdpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.adxv) && defpackage.aooh.n(this.a, ((defpackage.adxv) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ')';
    }
}
