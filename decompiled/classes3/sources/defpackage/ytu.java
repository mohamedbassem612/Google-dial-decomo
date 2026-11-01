package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytu implements ytw {
    private final defpackage.ytt a;
    private final java.lang.Throwable b;

    public ytu(defpackage.ytt yttVar, java.lang.Throwable th) {
        this.a = yttVar;
        this.b = th;
    }

    public final defpackage.ytt a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ytu) {
            defpackage.ytu ytuVar = (defpackage.ytu) obj;
            if (this.a == ytuVar.a && aooh.n(this.b, ytuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "FailedWithCause(reason=" + this.a + ", cause=" + this.b + ')';
    }
}
