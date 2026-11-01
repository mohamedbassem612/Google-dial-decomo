package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class admg {
    public defpackage.adjg a;
    public defpackage.adid b;
    public int c = 2;
    private final defpackage.adlb d;
    private defpackage.ajcq e;

    public admg(defpackage.adjg adjgVar, defpackage.adlb adlbVar) {
        this.a = adjgVar;
        this.b = defpackage.adng.a(adjgVar);
        this.d = adlbVar;
    }

    final boolean a() {
        return this.e != null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adht */
    public final void b(int i, defpackage.tvn tvnVar) throws adht {
        java.lang.String str;
        if (a()) {
            return;
        }
        try {
            defpackage.aiob aiobVar = (defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/scheduling/ActiveDownloads$DownloadContext", "pause", 268, "ActiveDownloads.java");
            java.lang.String strE = this.a.d().e(true);
            if (i == 3) {
                str = "CANCELLATION";
            } else if (i != 4) {
                str = i != 5 ? "PREEMPTED" : "PARAMETERS_CHANGED";
            } else {
                str = "JOB_STOPPED";
            }
            aiobVar.I("Pausing download %s, reason: %s", strE, str);
            defpackage.adhw adhwVarD = defpackage.adhw.d(this.a.i());
            defpackage.adlb adlbVar = this.d;
            synchronized (adlbVar) {
                defpackage.adla adlaVar = (defpackage.adla) adlbVar.c.get(adhwVarD);
                if (adlaVar != null) {
                    adlaVar.a();
                }
            }
            tvnVar.P(new defpackage.admf(this, 0));
            this.c = i;
            this.e = adlbVar.b(adhwVarD);
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.c()).k(e)).l("com/google/android/libraries/micore/superpacks/scheduling/ActiveDownloads$DownloadContext", "pause", 292, "ActiveDownloads.java")).y("Failed to parse download %s for canceling", this.a.d().e(true));
        }
    }

    public final java.lang.String toString() {
        return "{" + this.a.i() + ", " + java.lang.String.valueOf(this.b) + '}';
    }
}
