package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vrj {
    public final j$.util.Optional a;
    public final int b;
    public final boolean c;
    public final defpackage.vqt d;
    public final defpackage.vok e;

    public vrj(j$.util.Optional optional, int i, defpackage.vok vokVar, defpackage.vqt vqtVar, boolean z) {
        this.a = optional;
        this.b = i;
        this.e = vokVar;
        this.d = vqtVar;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vrj) {
            defpackage.vrj vrjVar = (defpackage.vrj) obj;
            if (this.a.equals(vrjVar.a) && this.b == vrjVar.b && this.e.equals(vrjVar.e) && this.d.equals(vrjVar.d) && this.c == vrjVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        defpackage.vqt vqtVar = this.d;
        defpackage.vok vokVar = this.e;
        return "VoicemailPinModel{defaultPin=" + java.lang.String.valueOf(this.a) + ", defaultPinVerificationResult=" + this.b + ", pinSpecification=" + java.lang.String.valueOf(vokVar) + ", pinChanger=" + java.lang.String.valueOf(vqtVar) + ", shouldShowCarrierLabelText=" + this.c + '}';
    }

    public vrj() {
        throw null;
    }
}
