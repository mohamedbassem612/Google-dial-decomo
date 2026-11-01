package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xos extends defpackage.xou {
    private final java.lang.Throwable a;
    private final defpackage.xhl b;

    public xos() {
        this(null, new defpackage.xhm("undefined"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xos) {
            defpackage.xos xosVar = (defpackage.xos) obj;
            if (aooh.n(this.a, xosVar.a) && aooh.n(this.b, xosVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Throwable th = this.a;
        return ((th == null ? 0 : th.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Failure(throwable=" + this.a + ", failureReason=" + this.b + ')';
    }

    public xos(java.lang.Throwable th, defpackage.xhl xhlVar) {
        this.a = th;
        this.b = xhlVar;
    }
}
