package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apcr implements defpackage.aolq {
    private final java.lang.ThreadLocal a;

    public apcr(java.lang.ThreadLocal threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.apcr) && defpackage.aooh.n(this.a, ((defpackage.apcr) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}
