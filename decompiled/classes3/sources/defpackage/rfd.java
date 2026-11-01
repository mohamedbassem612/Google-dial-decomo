package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rfd {
    public final java.lang.String a;
    public final boolean b;
    public final defpackage.rev c;
    public final aify d;
    public final boolean e;
    public final j$.util.Optional f;

    public rfd(java.lang.String str, boolean z, defpackage.rev revVar, aify aifyVar, boolean z2, j$.util.Optional optional) {
        this.a = str;
        this.b = z;
        this.c = revVar;
        this.d = aifyVar;
        this.e = z2;
        this.f = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rfd) {
            defpackage.rfd rfdVar = (defpackage.rfd) obj;
            if (this.a.equals(rfdVar.a) && this.b == rfdVar.b && this.c.equals(rfdVar.c) && ahvr.aP(this.d, rfdVar.d) && this.e == rfdVar.e && this.f.equals(rfdVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.f;
        aify aifyVar = this.d;
        return "VoiceFeaturePromoModel{callId=" + this.a + ", showPreviewLabel=" + this.b + ", promoTextKey=" + java.lang.String.valueOf(this.c) + ", activationChips=" + java.lang.String.valueOf(aifyVar) + ", shouldEnableActivationChips=" + this.e + ", errorDialog=" + java.lang.String.valueOf(optional) + '}';
    }

    public rfd() {
        throw null;
    }
}
