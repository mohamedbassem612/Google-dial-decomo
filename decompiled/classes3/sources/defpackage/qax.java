package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qax {
    public static final aimz a = aimz.i("com/android/dialer/incall/latencyreport/CallScopeLatencyTracker");
    public final aazc A;
    public final java.lang.String b;
    public final java.lang.String c;
    public final j$.util.Optional d;
    public final ruc e;
    public final ajct f;
    public boolean q;
    public final defpackage.pqo x;
    public final zpm y;
    public final defpackage.rdp z;
    public boolean g = false;
    public boolean h = false;
    public long i = -1;
    public long j = -1;
    public long k = -1;
    public long l = -1;
    public long m = -1;
    public long n = -1;
    public long o = -1;
    public long p = -1;
    public long r = -1;
    public j$.util.Optional s = j$.util.Optional.empty();
    public j$.util.Optional t = j$.util.Optional.empty();
    public j$.util.Optional u = j$.util.Optional.empty();
    public final zog v = new les(this, 9);
    public final defpackage.zoi w = new jwb(this, 6);

    public qax(java.lang.String str, java.lang.String str2, defpackage.rdp rdpVar, j$.util.Optional optional, aazc aazcVar, defpackage.pqo pqoVar, ruc rucVar, zpm zpmVar, ajct ajctVar) {
        this.b = str;
        this.c = str2;
        this.z = rdpVar;
        this.d = optional;
        this.A = aazcVar;
        this.x = pqoVar;
        this.e = rucVar;
        this.y = zpmVar;
        this.f = ajctVar;
    }

    public static long a(long j, long j2) {
        if (j == -1 || j2 == -1) {
            return -1L;
        }
        return j2 - j;
    }

    public final void b() {
        ahoq ahoqVarW = ahvr.W(570, "CallScopeLatencyTracker_onAcceptIncomingCallFromAnswerScreen");
        try {
            this.d.isPresent();
            if (this.p == -1) {
                this.p = android.os.SystemClock.elapsedRealtime();
                ruc rucVar = this.e;
                aenj aenjVar = ruc.aH;
                rucVar.j(aenjVar);
                try {
                    da$.ExternalSyntheticApiModelOutline0.m$1(aenjVar.a, this.b.hashCode());
                } catch (java.lang.IllegalStateException e) {
                    a.d().i(zct.b).k(e).l("com/android/dialer/incall/latencyreport/CallScopeLatencyTracker", "onAcceptIncomingCallFromAnswerScreen", 198, "CallScopeLatencyTracker.java").w("Failed to begin trace section for AcceptOnAnswerScreenToInCallFragmentRenderingLatency with cookie: %d", this.b.hashCode());
                }
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        j$.util.Optional optional = this.u;
        defpackage.puo puoVar = new defpackage.puo(this, 12);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = puoVar.a;
            defpackage.qax qaxVar = (defpackage.qax) obj2;
            qaxVar.e.p((aeun) obj, ruc.aK);
            qaxVar.u = j$.util.Optional.empty();
        }
    }
}
