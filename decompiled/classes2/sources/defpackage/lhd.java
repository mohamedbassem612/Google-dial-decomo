package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lhd {
    public final boolean a;
    public final boolean b;
    public final defpackage.adnw c;
    public final defpackage.adnw d;
    public final j$.util.Optional e;
    public final j$.util.Optional f;
    public final j$.util.Optional g;
    public final int h;

    public lhd(int i, boolean z, boolean z2, defpackage.adnw adnwVar, defpackage.adnw adnwVar2, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3) {
        this.h = i;
        this.a = z;
        this.b = z2;
        this.c = adnwVar;
        this.d = adnwVar2;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
    }

    public static defpackage.lhc a(int i, defpackage.adnw adnwVar, defpackage.adnw adnwVar2) {
        defpackage.lhc lhcVar = new defpackage.lhc();
        lhcVar.f = i;
        lhcVar.d(false);
        lhcVar.e = (byte) (lhcVar.e | 5);
        lhcVar.b(false);
        if (adnwVar == null) {
            throw new java.lang.NullPointerException("Null disclosureRequest");
        }
        lhcVar.a = adnwVar;
        if (adnwVar2 == null) {
            throw new java.lang.NullPointerException("Null resumeScreeningRequest");
        }
        lhcVar.b = adnwVar2;
        return lhcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lhd) {
            defpackage.lhd lhdVar = (defpackage.lhd) obj;
            int i = this.h;
            int i2 = lhdVar.h;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a == lhdVar.a && this.b == lhdVar.b && this.c.equals(lhdVar.c) && this.d.equals(lhdVar.d) && this.e.equals(lhdVar.e) && this.f.equals(lhdVar.f) && this.g.equals(lhdVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        anty.aJ(i);
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (true != this.a ? 1237 : 1231)) * (-721379959)) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.h;
        if (i != 1) {
            str = i != 2 ? "null" : "REVELIO";
        } else {
            str = "MANUAL";
        }
        boolean z = this.a;
        boolean z2 = this.b;
        defpackage.adnw adnwVar = this.c;
        defpackage.adnw adnwVar2 = this.d;
        j$.util.Optional optional = this.e;
        j$.util.Optional optional2 = this.f;
        j$.util.Optional optional3 = this.g;
        return "SessionConfig{sessionType=" + str + ", shouldRequestSpamAudioDetection=false, shouldRequestAudioRecording=" + z + ", spamAudioDetectionTimeoutMillis=0, isAudioProcessingStateSupported=" + z2 + ", disclosureRequest=" + java.lang.String.valueOf(adnwVar) + ", resumeScreeningRequest=" + java.lang.String.valueOf(adnwVar2) + ", pauseScreeningRequest=" + java.lang.String.valueOf(optional) + ", rejectCallRequest=" + java.lang.String.valueOf(optional2) + ", acceptCallRequest=" + java.lang.String.valueOf(optional3) + '}';
    }

    public lhd() {
        throw null;
    }
}
