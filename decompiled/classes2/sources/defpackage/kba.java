package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kba extends defpackage.kbf {
    private final java.lang.String b;

    public kba(java.lang.String str) {
        super(2131232047);
        this.b = str;
    }

    @Override // defpackage.kbf
    public final java.lang.String a(cav cavVar) {
        cavVar.u(-470898601);
        java.lang.String strG = dfa.g(2132017638, new java.lang.Object[]{this.b}, cavVar);
        cavVar.o();
        return strG;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kba) && aooh.n(this.b, ((defpackage.kba) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "RttCallButton(primaryText=" + this.b + ')';
    }
}
