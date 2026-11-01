package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgk {
    public final defpackage.kgc a;
    public final boolean b;
    public final int c;
    public final defpackage.aomy d;

    public kgk(defpackage.kgc kgcVar, boolean z, int i, defpackage.aomy aomyVar) {
        if (kgcVar == null) {
            defpackage.aooh.i("key");
        }
        this.a = kgcVar;
        this.b = z;
        this.c = i;
        this.d = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kgk) {
            defpackage.kgk kgkVar = (defpackage.kgk) obj;
            if (this.a == kgkVar.a && this.b == kgkVar.b && this.c == kgkVar.c && defpackage.aooh.n(this.d, kgkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + defpackage.anty.L(this.b)) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "FilterState(key=" + this.a + ", selected=" + this.b + ", labelResId=" + this.c + ", clickListener=" + this.d + ')';
    }
}
