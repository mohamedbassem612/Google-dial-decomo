package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adrr {
    public final aify a;
    public final long b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final j$.util.Optional e;
    public final j$.util.Optional f;

    public adrr(aify aifyVar, long j, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4) {
        this.a = aifyVar;
        this.b = j;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adrr) {
            defpackage.adrr adrrVar = (defpackage.adrr) obj;
            if (ahvr.aP(this.a, adrrVar.a) && this.b == adrrVar.b && this.c.equals(adrrVar.c) && this.d.equals(adrrVar.d) && this.e.equals(adrrVar.e) && this.f.equals(adrrVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.f;
        j$.util.Optional optional2 = this.e;
        j$.util.Optional optional3 = this.d;
        j$.util.Optional optional4 = this.c;
        return "SpeechRecognitionResult{suggestions=" + java.lang.String.valueOf(this.a) + ", resultReceivedTime=" + this.b + ", latencyMs=" + java.lang.String.valueOf(optional4) + ", audioData=" + java.lang.String.valueOf(optional3) + ", trancriptionType=" + java.lang.String.valueOf(optional2) + ", debugInformation=" + java.lang.String.valueOf(optional) + '}';
    }

    public adrr() {
        throw null;
    }
}
