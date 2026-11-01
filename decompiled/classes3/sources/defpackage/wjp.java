package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wjp {
    public final aify a;
    public final aify b;
    public final amgq c;
    public final long d;

    public wjp(aify aifyVar, aify aifyVar2, amgq amgqVar, long j) {
        aooh.f(aifyVar, "duplexLogs");
        aooh.f(aifyVar2, "transcriptionModeUpdates");
        this.a = aifyVar;
        this.b = aifyVar2;
        this.c = amgqVar;
        this.d = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wjp) {
            defpackage.wjp wjpVar = (defpackage.wjp) obj;
            if (aooh.n(this.a, wjpVar.a) && aooh.n(this.b, wjpVar.b) && aooh.n(this.c, wjpVar.c) && this.d == wjpVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        amgq amgqVar = this.c;
        return (((iHashCode * 31) + (amgqVar == null ? 0 : amgqVar.hashCode())) * 31) + anty.M(this.d);
    }

    public final java.lang.String toString() {
        return "DuplexSessionDebugData(duplexLogs=" + this.a + ", transcriptionModeUpdates=" + this.b + ", latestDuplexResult=" + this.c + ", duplexConversationStartTimeMillis=" + this.d + ')';
    }
}
