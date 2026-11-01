package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkb {
    public final defpackage.dkc a;
    public final int b;
    public final int c;

    public dkb(defpackage.dkc dkcVar, int i, int i2) {
        this.a = dkcVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dkb) {
            defpackage.dkb dkbVar = (defpackage.dkb) obj;
            if (defpackage.aooh.n(this.a, dkbVar.a) && this.b == dkbVar.b && this.c == dkbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}
