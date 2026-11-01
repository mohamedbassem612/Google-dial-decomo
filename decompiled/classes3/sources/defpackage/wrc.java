package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrc {
    public final j$.util.Optional a;
    public final aify b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final defpackage.whw g;
    public final defpackage.wre h;
    public final j$.util.Optional i;
    public final aify j;

    public wrc(j$.util.Optional optional, aify aifyVar, long j, long j2, long j3, long j4, defpackage.whw whwVar, defpackage.wre wreVar, j$.util.Optional optional2, aify aifyVar2) {
        this.a = optional;
        this.b = aifyVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = whwVar;
        this.h = wreVar;
        this.i = optional2;
        this.j = aifyVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wrc) {
            defpackage.wrc wrcVar = (defpackage.wrc) obj;
            if (this.a.equals(wrcVar.a) && ahvr.aP(this.b, wrcVar.b) && this.c == wrcVar.c && this.d == wrcVar.d && this.e == wrcVar.e && this.f == wrcVar.f && this.g.equals(wrcVar.g) && this.h.equals(wrcVar.h) && this.i.equals(wrcVar.i) && ahvr.aP(this.j, wrcVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.f;
        defpackage.whw whwVar = this.g;
        long j2 = (j >>> 32) ^ j;
        long j3 = this.e;
        long j4 = (j3 >>> 32) ^ j3;
        long j5 = this.d;
        long j6 = (j5 >>> 32) ^ j5;
        long j7 = this.c;
        return (((((((((((((((iHashCode * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ ((int) j6)) * 1000003) ^ ((int) j4)) * 1000003) ^ ((int) j2)) * 1000003) ^ whwVar.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.j;
        j$.util.Optional optional = this.i;
        defpackage.wre wreVar = this.h;
        defpackage.whw whwVar = this.g;
        aify aifyVar2 = this.b;
        return "XatuSessionInfo{duplexModel=" + java.lang.String.valueOf(this.a) + ", duplexLogs=" + java.lang.String.valueOf(aifyVar2) + ", callCreationTimeMillis=" + this.c + ", xatuSessionStartTimeMillis=" + this.d + ", duplexConversationStartTimeMillis=" + this.e + ", xatuSessionEndTimeMillis=" + this.f + ", xatuSessionLogs=" + java.lang.String.valueOf(whwVar) + ", endCause=" + java.lang.String.valueOf(wreVar) + ", agentOnlineDurationMillis=" + java.lang.String.valueOf(optional) + ", transcriptionModeUpdates=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public wrc() {
        throw null;
    }
}
