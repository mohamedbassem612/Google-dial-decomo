package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abml {
    public final bor a;
    public final abmy b;
    public final boolean c;

    public abml(bor borVar, abmy abmyVar, boolean z) {
        aooh.f(abmyVar, "abcColorScheme");
        this.a = borVar;
        this.b = abmyVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abml) {
            defpackage.abml abmlVar = (defpackage.abml) obj;
            if (aooh.n(this.a, abmlVar.a) && aooh.n(this.b, abmlVar.b) && this.c == abmlVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "AbcShaderColorScope(colorScheme=" + this.a + ", abcColorScheme=" + this.b + ", isDark=" + this.c + ')';
    }
}
