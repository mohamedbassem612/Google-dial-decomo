package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adoi {
    public final java.lang.String a;
    public final boolean b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final j$.util.Optional e;
    public final j$.util.Optional f;
    private final long g;

    public adoi(java.lang.String str, boolean z, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, long j, j$.util.Optional optional4) {
        this.a = str;
        this.b = z;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.g = j;
        this.f = optional4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adoi) {
            defpackage.adoi adoiVar = (defpackage.adoi) obj;
            if (this.a.equals(adoiVar.a) && this.b == adoiVar.b && this.c.equals(adoiVar.c) && this.d.equals(adoiVar.d) && this.e.equals(adoiVar.e) && this.g == adoiVar.g && this.f.equals(adoiVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.g;
        return ((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.f;
        j$.util.Optional optional2 = this.e;
        j$.util.Optional optional3 = this.d;
        return "CallerTranscriptArgs{transcript=" + this.a + ", isFinal=" + this.b + ", confidence=" + java.lang.String.valueOf(this.c) + ", latencyMs=" + java.lang.String.valueOf(optional3) + ", audioData=" + java.lang.String.valueOf(optional2) + ", resultReceivedTime=" + this.g + ", transcriptionType=" + java.lang.String.valueOf(optional) + '}';
    }

    public adoi() {
        throw null;
    }
}
