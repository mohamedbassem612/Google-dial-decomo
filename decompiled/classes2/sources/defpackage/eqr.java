package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqr {
    public static final defpackage.eqr a = new defpackage.eqr();
    public final android.net.Uri b = null;
    public final java.lang.String c = null;
    public final android.os.Bundle d = null;

    static {
        java.lang.String str = eum.a;
    }

    private eqr() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eqr) {
            defpackage.eqr eqrVar = (defpackage.eqr) obj;
            android.net.Uri uri = eqrVar.b;
            if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                java.lang.String str = eqrVar.c;
                if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                    android.os.Bundle bundle = eqrVar.d;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
