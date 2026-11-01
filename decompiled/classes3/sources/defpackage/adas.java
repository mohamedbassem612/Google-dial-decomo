package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adas implements defpackage.adaw {
    public final android.content.Context a;
    public final aczw b;
    public final acxa c;
    public final defpackage.acvr d;
    public final defpackage.acvv e;
    public final adba f;
    public final defpackage.acwb g;
    public final int h;
    public final long i;
    public final java.lang.String j;
    public final ahyn k;
    public final java.util.concurrent.Executor l;
    public final int m;
    public final adae n;
    public final aogc o;
    private final acvl p;

    public adas(android.content.Context context, aczw aczwVar, aogc aogcVar, acxa acxaVar, defpackage.acvr acvrVar, int i, adae adaeVar, defpackage.acvv acvvVar, adba adbaVar, defpackage.acwb acwbVar, int i2, long j, java.lang.String str, ahyn ahynVar, acvl acvlVar, java.util.concurrent.Executor executor) {
        this.a = context;
        this.b = aczwVar;
        this.o = aogcVar;
        this.c = acxaVar;
        this.d = acvrVar;
        this.m = i;
        this.n = adaeVar;
        this.e = acvvVar;
        this.f = adbaVar;
        this.g = acwbVar;
        this.h = i2;
        this.i = j;
        this.j = str;
        this.k = ahynVar;
        this.p = acvlVar;
        this.l = executor;
    }

    @Override // defpackage.adaw
    public final ajcq a(android.net.Uri uri) {
        int i = adbe.a;
        aogc aogcVar = this.o;
        defpackage.acvv acvvVar = this.e;
        if (!defpackage.adau.e(aogcVar, uri, acvvVar.e)) {
            adbe.e("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", new java.lang.Object[]{"DeltaFileDownloaderCallbackImpl", uri, acvvVar.e});
            yg ygVarB = acvh.b();
            ygVarB.b = defpackage.acvg.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            acvh acvhVarD = ygVarB.d();
            aczw aczwVar = this.b;
            defpackage.acvr acvrVar = this.d;
            int i2 = this.m;
            java.lang.String str = acvvVar.e;
            adba adbaVar = this.f;
            acvl acvlVar = this.p;
            java.util.concurrent.Executor executor = this.l;
            return defpackage.adcs.e(defpackage.adat.d(aczwVar, acvrVar, i2, aogcVar, uri, str, adbaVar, acvlVar, executor)).d(java.io.IOException.class, new defpackage.aczi(acvhVarD, 9), executor).g(new defpackage.aczi(acvhVarD, 10), executor);
        }
        android.net.Uri uriAw = afsq.aw(uri);
        akzx akzxVarM = defpackage.acwe.a.m();
        defpackage.acvq acvqVar = acvvVar.g;
        if (acvqVar == null) {
            acvqVar = defpackage.acvq.a;
        }
        java.lang.String str2 = acvqVar.b;
        akzxVarM.u();
        defpackage.acwe acweVar = (defpackage.acwe) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        acweVar.b |= 4;
        acweVar.e = str2;
        int i3 = this.m;
        akzxVarM.u();
        defpackage.acwe acweVar2 = (defpackage.acwe) akzxVarM.b;
        acweVar2.f = i3 - 1;
        acweVar2.b |= 8;
        defpackage.acwe acweVar3 = (defpackage.acwe) akzxVarM.p();
        ajcq ajcqVarE = this.b.e(acweVar3);
        defpackage.acyj acyjVar = new defpackage.acyj((java.lang.Object) this, (alad) acweVar3, (java.lang.Object) uriAw, (java.lang.Object) uri, 9);
        java.util.concurrent.Executor executor2 = this.l;
        return ahvr.I(ahvr.I(ajcqVarE, acyjVar, executor2), new defpackage.acze(this, uriAw, 11, null), executor2);
    }

    @Override // defpackage.adaw
    public final ajcq b(acvh acvhVar) {
        defpackage.acvr acvrVar = this.d;
        java.lang.String str = acvrVar.g;
        int i = adbe.a;
        boolean zEquals = acvhVar.a.equals(defpackage.acvg.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR);
        int i2 = this.m;
        if (zEquals) {
            return defpackage.adat.c(defpackage.acwa.CORRUPTED, acvrVar, i2, this.b, this.l);
        }
        return defpackage.adat.c(defpackage.acwa.DOWNLOAD_FAILED, acvrVar, i2, this.b, this.l);
    }
}
