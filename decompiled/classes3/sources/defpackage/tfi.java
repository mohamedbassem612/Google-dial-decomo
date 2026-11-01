package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfi {
    public final int a;
    public final int b;
    public final int c;
    public final defpackage.tfz d;
    public final boolean e;

    public tfi(int i, int i2, int i3, defpackage.tfz tfzVar, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = tfzVar;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfi) {
            defpackage.tfi tfiVar = (defpackage.tfi) obj;
            if (this.a == tfiVar.a && this.b == tfiVar.b && this.c == tfiVar.c && aooh.n(this.d, tfiVar.d) && this.e == tfiVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + anty.L(this.e);
    }

    public final java.lang.String toString() {
        return "SearchActionButton(textRes=" + this.a + ", descriptionRes=" + this.b + ", iconRes=" + this.c + ", event=" + this.d + ", isEnabled=" + this.e + ')';
    }
}
