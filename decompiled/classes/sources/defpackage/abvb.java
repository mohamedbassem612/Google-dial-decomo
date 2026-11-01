package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abvb {
    public final long a;
    public final boolean b;

    public abvb(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abvb) {
            defpackage.abvb abvbVar = (defpackage.abvb) obj;
            if (this.a == abvbVar.a && this.b == abvbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (defpackage.anty.M(this.a) * 31) + defpackage.anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "PackageInfoHolder(versionCode=" + this.a + ", isEnabled=" + this.b + ')';
    }
}
