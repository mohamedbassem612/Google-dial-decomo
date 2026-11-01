package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwi implements defpackage.lwj {
    public final long a;
    public final java.lang.String b;
    public final boolean c;

    public lwi(long j, java.lang.String str, boolean z) {
        aooh.f(str, "displayName");
        this.a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lwi) {
            defpackage.lwi lwiVar = (defpackage.lwi) obj;
            if (this.a == lwiVar.a && aooh.n(this.b, lwiVar.b) && this.c == lwiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.M(this.a) * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "Directory(id=" + this.a + ", displayName=" + this.b + ", isLocal=" + this.c + ')';
    }
}
