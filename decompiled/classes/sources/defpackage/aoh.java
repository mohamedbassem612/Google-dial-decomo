package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoh {
    public final long a;
    public final defpackage.ayy b;

    public /* synthetic */ aoh(byte[] bArr) {
        defpackage.ayy ayyVarBb = defpackage.den.bb(0.0f, 3);
        this.a = -43234558140743680L;
        this.b = ayyVarBb;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (defpackage.aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
            }
            defpackage.aoh aohVar = (defpackage.aoh) obj;
            long j = aohVar.a;
            if (defpackage.aooh.n(this.b, aohVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (-312056230) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "OverscrollConfiguration(glowColor=" + defpackage.cqg.g(-43234558140743680L) + ", drawPadding=" + this.b + ')';
    }

    public aoh() {
        this(null);
    }
}
