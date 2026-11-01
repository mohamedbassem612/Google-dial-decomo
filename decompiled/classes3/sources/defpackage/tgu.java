package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgu implements defpackage.tgw {
    public final boolean a;
    private final java.lang.CharSequence b;
    private final int c;

    public tgu(boolean z, java.lang.CharSequence charSequence) {
        aooh.f(charSequence, "text");
        this.a = z;
        this.b = charSequence;
        this.c = true != z ? 2131231060 : 2131231083;
    }

    @Override // defpackage.tgw
    public final int a() {
        return this.c;
    }

    @Override // defpackage.tgw
    public final java.lang.CharSequence b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tgu) {
            defpackage.tgu tguVar = (defpackage.tgu) obj;
            if (this.a == tguVar.a && aooh.n(this.b, tguVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MakeVoiceCall(displayWifiIcons=" + this.a + ", text=" + ((java.lang.Object) this.b) + ')';
    }
}
