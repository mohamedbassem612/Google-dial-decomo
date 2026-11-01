package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zdc {
    public final java.lang.String a;
    private final long b;

    public zdc(long j, java.lang.String str) {
        this.b = j;
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zdc) {
            defpackage.zdc zdcVar = (defpackage.zdc) obj;
            if (this.b == zdcVar.b && aooh.n(this.a, zdcVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.b) * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AppInfoMemoized(versionCode=" + this.b + ", versionName=" + this.a + ')';
    }
}
