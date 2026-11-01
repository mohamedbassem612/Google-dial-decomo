package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vyo implements defpackage.vyr {
    public final defpackage.wei a;

    public vyo(defpackage.wei weiVar) {
        aooh.f(weiVar, "errorModel");
        this.a = weiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.vyo) && aooh.n(this.a, ((defpackage.vyo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ErrorModel(errorModel=" + this.a + ')';
    }
}
