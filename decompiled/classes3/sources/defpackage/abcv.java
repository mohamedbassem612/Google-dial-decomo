package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abcv {
    public final zvj a;
    public final android.content.Context b;
    public final abcp c;
    public aify d;
    public final aify e;
    public final aigf f;
    public final defpackage.abct g;
    public final boolean h;
    public final boolean i;

    public abcv(defpackage.abcu abcuVar) {
        this.a = abcuVar.a;
        android.content.Context context = abcuVar.b;
        ahvr.ci(context);
        this.b = context;
        abcp abcpVar = abcuVar.c;
        ahvr.ci(abcpVar);
        this.c = abcpVar;
        this.d = abcuVar.d;
        this.e = abcuVar.e;
        this.f = aigf.i(abcuVar.f);
        this.g = abcuVar.g;
        this.h = abcuVar.h;
        this.i = abcuVar.i;
    }

    public final defpackage.abcr a(defpackage.zvl zvlVar) {
        defpackage.abcr abcrVar = (defpackage.abcr) this.f.get(zvlVar);
        return abcrVar == null ? new defpackage.abcr(zvlVar, 2) : abcrVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final aify b() {
        aify aifyVar = this.d;
        if (aifyVar != null) {
            return aifyVar;
        }
        defpackage.afpl afplVar = new defpackage.afpl(this.b, null, null, null);
        try {
            aify aifyVarN = aify.n((java.util.List) ajan.f(((afhf) afplVar.a).c(), new defpackage.ymu(9), (java.util.concurrent.Executor) afplVar.b).s());
            this.d = aifyVarN;
            return aifyVarN == null ? aike.a : aifyVarN;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalArgumentException("Retrieval of recent fix data failed", e);
        }
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("entry_point", this.a);
        ahymVarL.b("context", this.b);
        ahymVarL.b("appDoctorLogger", this.c);
        ahymVarL.b("recentFixes", this.d);
        ahymVarL.b("fixesExecutedThisIteration", this.e);
        ahymVarL.b("fixStatusesExecutedThisIteration", this.f);
        ahymVarL.b("currentFixer", this.g);
        ahymVarL.g("processRestartNeeded", this.h);
        ahymVarL.g("appRestartNeeded", this.i);
        return ahymVarL.toString();
    }
}
