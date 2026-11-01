package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agvm implements agus {
    public final ahyn a;
    public final aogc b;
    private final boolean c;
    private final ajct d;
    private final ahyn e;

    public agvm(ahyn ahynVar, ahyn ahynVar2, ajct ajctVar, ahyn ahynVar3, aogc aogcVar) {
        this.c = ((java.lang.Boolean) ((ahys) ahynVar).a).booleanValue();
        this.a = ahynVar2;
        this.d = ajctVar;
        this.e = ahynVar3;
        this.b = aogcVar;
    }

    private final boolean d() {
        return this.c;
    }

    public final ajcq a(androidx.work.WorkerParameters workerParameters) {
        return !d() ? ajcm.a : ahvr.H(((defpackage.ahid) this.e.a).a(), new defpackage.agnx(this, workerParameters, 4, null), this.d);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    public final void b(ajcq ajcqVar, androidx.work.WorkerParameters workerParameters, j$.time.Duration duration) {
        ?? r0 = this.a.a;
        java.lang.String strB = agvl.b(workerParameters);
        defpackage.aljf aljfVar = (defpackage.aljf) r0.a();
        try {
            aiql.H(ajcqVar);
            aogc aogcVar = this.b;
            java.lang.Object obj = aogcVar.b;
            aljfVar.d((java.lang.String) obj, aogcVar.p(), strB, "success");
            aljfVar.e(duration.toMillis(), (java.lang.String) obj, aogcVar.p(), strB, "success");
        } catch (java.util.concurrent.CancellationException unused) {
            aogc aogcVar2 = this.b;
            java.lang.String str = (java.lang.String) aogcVar2.b;
            aljfVar.d(str, aogcVar2.p(), strB, "cancellation");
            aljfVar.e(duration.toMillis(), str, aogcVar2.p(), strB, "cancellation");
        } catch (java.lang.Exception unused2) {
            aogc aogcVar3 = this.b;
            java.lang.String str2 = (java.lang.String) aogcVar3.b;
            aljfVar.d(str2, aogcVar3.p(), strB, "failure");
            aljfVar.e(duration.toMillis(), str2, aogcVar3.p(), strB, "failure");
        }
    }

    public final ajcq c(ajcq ajcqVar, androidx.work.WorkerParameters workerParameters, j$.time.Duration duration) {
        return !d() ? ajcm.a : ahvr.H(((defpackage.ahid) this.e.a).a(), new defpackage.ahmm(this, ajcqVar, workerParameters, duration, 1), this.d);
    }
}
