package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksm implements defpackage.ksn {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.Integer c;

    public ksm(java.lang.String str, java.lang.Integer num) {
        aooh.f(str, "snippetText");
        this.a = str;
        this.b = "";
        this.c = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ksm) {
            defpackage.ksm ksmVar = (defpackage.ksm) obj;
            if (aooh.n(this.a, ksmVar.a) && aooh.n(this.b, ksmVar.b) && aooh.n(this.c, ksmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.Integer num = this.c;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "Snippet(snippetText=" + this.a + ", summarizerModel=" + this.b + ", maxLines=" + this.c + ')';
    }
}
