package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tuf {
    public final long a;
    public final java.lang.String b;
    public final defpackage.tud c;
    public final defpackage.tud d;
    public final defpackage.tue e;

    public tuf(long j, java.lang.String str, defpackage.tud tudVar, defpackage.tud tudVar2, defpackage.tue tueVar) {
        aooh.f(str, "callId");
        aooh.f(tudVar, "mlVerdict");
        aooh.f(tudVar2, "userVerdict");
        aooh.f(tueVar, "userScamAlertAction");
        this.a = j;
        this.b = str;
        this.c = tudVar;
        this.d = tudVar2;
        this.e = tueVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tuf) {
            defpackage.tuf tufVar = (defpackage.tuf) obj;
            if (this.a == tufVar.a && aooh.n(this.b, tufVar.b) && this.c == tufVar.c && this.d == tufVar.d && this.e == tufVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((anty.M(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "SharpieDataEntity(callCreatedTimestampMs=" + this.a + ", callId=" + this.b + ", mlVerdict=" + this.c + ", userVerdict=" + this.d + ", userScamAlertAction=" + this.e + ')';
    }
}
