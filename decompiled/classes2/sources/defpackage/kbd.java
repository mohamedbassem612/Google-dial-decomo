package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbd extends defpackage.kbf {
    private final java.lang.String b;

    public kbd(java.lang.String str) {
        super(2131231081);
        this.b = str;
    }

    @Override // defpackage.kbf
    public final java.lang.String a(cav cavVar) {
        cavVar.u(-1297485045);
        java.lang.String strG = dfa.g(2132017640, new java.lang.Object[]{this.b}, cavVar);
        cavVar.o();
        return strG;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kbd) && aooh.n(this.b, ((defpackage.kbd) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "WifiVideoCallButton(primaryText=" + this.b + ')';
    }
}
