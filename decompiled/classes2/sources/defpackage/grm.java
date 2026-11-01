package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class grm {
    public final android.net.Uri a;
    public final boolean b;

    public grm(android.net.Uri uri, boolean z) {
        aooh.f(uri, "uri");
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            aooh.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            defpackage.grm grmVar = (defpackage.grm) obj;
            if (aooh.n(this.a, grmVar.a) && this.b == grmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.L(this.b);
    }
}
