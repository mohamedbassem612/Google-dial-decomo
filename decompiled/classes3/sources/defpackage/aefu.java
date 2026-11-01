package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aefu {
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    private final java.lang.String f;

    public aefu(java.lang.String str, int i, int i2) {
        aooh.f(str, "url");
        this.a = str;
        this.f = null;
        this.b = i;
        this.c = i2;
        this.d = false;
        this.e = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aefu) {
            defpackage.aefu aefuVar = (defpackage.aefu) obj;
            if (aooh.n(this.a, aefuVar.a)) {
                java.lang.String str = aefuVar.f;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && this.b == aefuVar.b && this.c == aefuVar.c) {
                    boolean z = aefuVar.d;
                    boolean z2 = aefuVar.e;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 961) + this.b) * 31) + this.c) * 31) + anty.L(false)) * 31) + anty.L(false);
    }

    public final java.lang.String toString() {
        return "GnpMedia(url=" + this.a + ", accountName=null, width=" + this.b + ", height=" + this.c + ", shouldAuthenticateFifeUrls=false, shouldApplyFifeOptions=false)";
    }
}
