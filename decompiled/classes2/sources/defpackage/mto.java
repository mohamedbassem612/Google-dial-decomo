package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mto {
    public final java.lang.String a;
    public final defpackage.nbw b;
    public final defpackage.mtm c;
    public final defpackage.aboq d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public mto(java.lang.String str, defpackage.nbw nbwVar, defpackage.mtm mtmVar, defpackage.aboq aboqVar, boolean z, boolean z2, boolean z3) {
        aooh.f(str, "callId");
        aooh.f(nbwVar, "dobbyInCallUiType");
        this.a = str;
        this.b = nbwVar;
        this.c = mtmVar;
        this.d = aboqVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mto) {
            defpackage.mto mtoVar = (defpackage.mto) obj;
            if (aooh.n(this.a, mtoVar.a) && this.b == mtoVar.b && aooh.n(this.c, mtoVar.c) && aooh.n(this.d, mtoVar.d) && this.e == mtoVar.e && this.f == mtoVar.f && this.g == mtoVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        boolean z = this.g;
        return (((((iHashCode * 31) + anty.L(this.e)) * 31) + anty.L(this.f)) * 31) + anty.L(z);
    }

    public final java.lang.String toString() {
        return "DobbyInCallUiModel(callId=" + this.a + ", dobbyInCallUiType=" + this.b + ", dobbyInCallContactGridData=" + this.c + ", messageList=" + this.d + ", showLlmGeneratedContentDisclaimerDialog=" + this.e + ", showLlmGeneratedContentConsentDialog=" + this.f + ", shouldEnableFooterButtons=" + this.g + ')';
    }
}
