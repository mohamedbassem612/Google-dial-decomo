package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kpd {
    public final long a;
    public final java.util.TimeZone b;
    public final defpackage.koy c;
    public final int d;

    public kpd(long j, java.util.TimeZone timeZone, defpackage.koy koyVar) {
        aooh.f(timeZone, "timezone");
        aooh.f(koyVar, "transcription");
        this.a = j;
        this.b = timeZone;
        this.c = koyVar;
        this.d = 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kpd) {
            defpackage.kpd kpdVar = (defpackage.kpd) obj;
            if (this.a == kpdVar.a && aooh.n(this.b, kpdVar.b) && aooh.n(this.c, kpdVar.c)) {
                int i = kpdVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((anty.M(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 2;
    }

    public final java.lang.String toString() {
        return "SummaryRequest(callCreationTimeMs=" + this.a + ", timezone=" + this.b + ", transcription=" + this.c + ", callDirection=INCOMING)";
    }
}
