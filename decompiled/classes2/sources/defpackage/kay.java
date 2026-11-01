package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kay extends defpackage.kbf {
    private final java.lang.String b;
    private final java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kay(java.lang.String str, java.lang.String str2) {
        super(2131231080);
        aooh.f(str2, "appDisplayName");
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.kbf
    public final java.lang.String a(cav cavVar) {
        cavVar.u(1144867398);
        java.lang.String strG = dfa.g(2132018860, new java.lang.Object[]{this.b, this.c}, cavVar);
        cavVar.o();
        return strG;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kay) {
            defpackage.kay kayVar = (defpackage.kay) obj;
            if (aooh.n(this.b, kayVar.b) && aooh.n(this.c, kayVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "HaloVideoButton(primaryText=" + this.b + ", appDisplayName=" + this.c + ')';
    }
}
