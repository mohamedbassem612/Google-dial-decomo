package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rii {
    public final java.lang.Integer a;
    public final java.lang.CharSequence b;
    public final java.lang.CharSequence c;

    public rii(java.lang.Integer num, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        aooh.f(charSequence, "title");
        aooh.f(charSequence2, "summary");
        this.a = num;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rii) {
            defpackage.rii riiVar = (defpackage.rii) obj;
            if (aooh.n(this.a, riiVar.a) && aooh.n(this.b, riiVar.b) && aooh.n(this.c, riiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "JoyballContent(icon=" + this.a + ", title=" + ((java.lang.Object) this.b) + ", summary=" + ((java.lang.Object) this.c) + ')';
    }
}
