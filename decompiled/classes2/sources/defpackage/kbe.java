package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbe extends defpackage.kbf {
    private final java.lang.String b;

    public kbe(java.lang.String str) {
        super(2131231083);
        this.b = str;
    }

    @Override // defpackage.kbf
    public final java.lang.String a(cav cavVar) {
        cavVar.u(-253118398);
        java.lang.String strG = dfa.g(2132017642, new java.lang.Object[]{this.b}, cavVar);
        cavVar.o();
        return strG;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kbe) && aooh.n(this.b, ((defpackage.kbe) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "WifiVoiceCallButton(primaryText=" + this.b + ')';
    }
}
