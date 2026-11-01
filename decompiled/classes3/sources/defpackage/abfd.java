package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abfd implements defpackage.abfo {
    public final java.lang.String a;
    public final aomy b;
    public final int c;
    public final int d;

    public abfd(java.lang.String str, aomy aomyVar, int i, int i2) {
        aooh.f(str, "tag");
        this.a = str;
        this.b = aomyVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abfd) {
            defpackage.abfd abfdVar = (defpackage.abfd) obj;
            if (aooh.n(this.a, abfdVar.a) && aooh.n(this.b, abfdVar.b) && this.c == abfdVar.c && this.d == abfdVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final java.lang.String toString() {
        return "Clickable(tag=" + this.a + ", onClick=" + this.b + ", start=" + this.c + ", end=" + this.d + ')';
    }
}
