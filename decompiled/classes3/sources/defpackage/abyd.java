package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abyd {
    public final android.view.View a;
    public final int b;

    public abyd(android.view.View view, int i) {
        aooh.f(view, "view");
        this.a = view;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abyd) {
            defpackage.abyd abydVar = (defpackage.abyd) obj;
            if (aooh.n(this.a, abydVar.a) && this.b == abydVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "ViewWithLayoutResourceId(view=" + this.a + ", layoutResourceId=" + this.b + ')';
    }
}
