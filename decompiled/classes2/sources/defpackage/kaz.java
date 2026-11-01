package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kaz extends defpackage.kbf {
    private final java.lang.String b;
    private final java.lang.String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kaz(java.lang.String str, java.lang.String str2) {
        super(2131231060);
        aooh.f(str2, "appDisplayName");
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.kbf
    public final java.lang.String a(cav cavVar) {
        cavVar.u(-978959619);
        java.lang.String strG = dfa.g(2132018861, new java.lang.Object[]{this.b, this.c}, cavVar);
        cavVar.o();
        return strG;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kaz) {
            defpackage.kaz kazVar = (defpackage.kaz) obj;
            if (aooh.n(this.b, kazVar.b) && aooh.n(this.c, kazVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "HaloVoiceButton(primaryText=" + this.b + ", appDisplayName=" + this.c + ')';
    }
}
