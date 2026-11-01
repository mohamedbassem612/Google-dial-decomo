package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gni implements java.lang.Comparable {
    public static final defpackage.gni a;
    public final int b;
    public final int c;
    public final int d;
    private final java.lang.String e;
    private final aoir f = aooc.ag(new defpackage.fxt(this, 2));

    static {
        new defpackage.gni(0, 0, 0, "");
        a = new defpackage.gni(0, 1, 0, "");
        new defpackage.gni(1, 0, 0, "");
    }

    public gni(int i, int i2, int i3, java.lang.String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    private final java.math.BigInteger b() {
        java.lang.Object objA = this.f.a();
        aooh.e(objA, "getValue(...)");
        return (java.math.BigInteger) objA;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.gni gniVar) {
        aooh.f(gniVar, "other");
        return b().compareTo(gniVar.b());
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.gni)) {
            return false;
        }
        defpackage.gni gniVar = (defpackage.gni) obj;
        return this.b == gniVar.b && this.c == gniVar.c && this.d == gniVar.d;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.e;
        java.lang.String strConcat = !aoov.H(str) ? "-".concat(java.lang.String.valueOf(str)) : "";
        return this.b + '.' + this.c + '.' + this.d + strConcat;
    }
}
