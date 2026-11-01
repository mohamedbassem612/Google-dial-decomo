package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rzj extends snl {
    public final java.lang.Throwable a;
    public final snl b;

    public rzj(java.lang.Throwable th, snl snlVar) {
        this.a = th;
        this.b = snlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rzj) {
            defpackage.rzj rzjVar = (defpackage.rzj) obj;
            if (aooh.n(this.a, rzjVar.a) && aooh.n(this.b, rzjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(cause=" + this.a + ", type=" + this.b + ')';
    }
}
