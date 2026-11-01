package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hol {
    public final java.lang.String a;
    public final pom b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final quf f;
    public final int g;
    public aonj h;
    public aomy i;
    public defpackage.hqb j;
    public qtx k;
    public qtx l;
    public qtx m;
    public qtx n;
    private final j$.util.Optional o;

    public hol(java.lang.String str, j$.util.Optional optional, pom pomVar, boolean z, boolean z2, int i, quf qufVar, int i2) {
        aooh.f(str, "callId");
        aooh.f(optional, "outgoingCallRequestId");
        aooh.f(pomVar, "contactGridModel");
        this.a = str;
        this.o = optional;
        this.b = pomVar;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = qufVar;
        this.g = i2;
        int i3 = 9;
        this.h = new defpackage.guv(i3);
        this.i = new defpackage.eli(i3);
        this.j = new defpackage.hok();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hol) {
            defpackage.hol holVar = (defpackage.hol) obj;
            if (aooh.n(this.a, holVar.a) && aooh.n(this.o, holVar.o) && aooh.n(this.b, holVar.b) && this.c == holVar.c && this.d == holVar.d && this.e == holVar.e && aooh.n(this.f, holVar.f) && this.g == holVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.o.hashCode()) * 31) + this.b.hashCode();
        quf qufVar = this.f;
        return (((((((((iHashCode * 31) + anty.L(this.c)) * 31) + anty.L(this.d)) * 31) + this.e) * 31) + (qufVar == null ? 0 : qufVar.hashCode())) * 31) + this.g;
    }

    public final java.lang.String toString() {
        return "CarVoiceModelData(callId=" + this.a + ", outgoingCallRequestId=" + this.o + ", contactGridModel=" + this.b + ", isMuted=" + this.c + ", isEmergencyCall=" + this.d + ", audioRouteDrawableRes=" + this.e + ", callNotesButton=" + this.f + ", numOfCalls=" + this.g + ')';
    }
}
