package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abuh implements defpackage.abuo {
    private final defpackage.abuw a;

    public abuh(defpackage.abuw abuwVar) {
        aooh.f(abuwVar, "identifier");
        this.a = abuwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abuh) && aooh.n(this.a, ((defpackage.abuh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DeleteSuccess(identifier=" + this.a + ')';
    }
}
