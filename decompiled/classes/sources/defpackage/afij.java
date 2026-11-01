package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afij {
    static final java.lang.Object[] a;
    static final defpackage.afij b;
    public final java.lang.Object[] c;
    private final int d;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        a = objArr;
        b = new defpackage.afij(objArr);
    }

    public afij(java.lang.Object... objArr) {
        this.c = objArr;
        this.d = java.util.Arrays.hashCode(objArr);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.afij) {
            defpackage.afij afijVar = (defpackage.afij) obj;
            if (this.d == afijVar.d && java.util.Arrays.equals(this.c, afijVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final java.lang.String toString() {
        return java.util.Arrays.toString(this.c);
    }
}
