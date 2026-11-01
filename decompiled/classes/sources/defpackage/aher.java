package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aher implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.ahew a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ aher(defpackage.ahew ahewVar, boolean z, int i) {
        this.$cid = i;
        this.a = ahewVar;
        this.b = z;
    }

    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        java.io.File fileA;
        int i = this.$cid;
        defpackage.ahew ahewVar = this.a;
        int i2 = 0;
        if (i != 0) {
            ahewVar.b();
            defpackage.aher aherVar = new defpackage.aher(ahewVar, this.b, i2);
            long j = defpackage.ahqx.a;
            return defpackage.abyl.b(ahewVar.a, new defpackage.ahqt(defpackage.ahns.c(false), aherVar, 0), ahewVar.c);
        }
        ahewVar.b();
        boolean z = this.b;
        if (z && (fileA = ahewVar.a()) != null && fileA.exists()) {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(fileA, "r");
                try {
                    int i3 = randomAccessFile.readInt();
                    int i4 = ahewVar.d;
                    randomAccessFile.close();
                    if (i3 == i4) {
                        return ahewVar.c(2, "file_completion_present");
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (java.lang.Throwable th3) {
                            aoil.b(th, th3);
                        }
                        throw th2;
                    }
                }
            } catch (java.io.IOException e) {
                ((defpackage.aimw) ((defpackage.aimw) ahewVar.h.d()).k(e).l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceedFileBacked", 553, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("Failed to read package version from file");
            }
        }
        int i5 = ahewVar.d;
        defpackage.zzx zzxVarD = ahewVar.d();
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("SELECT * FROM AllListenersSucceededVersionTable WHERE version_code = (?)");
        adagVar.o(java.lang.Long.valueOf(i5));
        defpackage.ahru ahruVar = new defpackage.ahru(zzxVarD.M(adagVar.B()));
        defpackage.aheq aheqVar = new defpackage.aheq(new defpackage.dkm(13), 2);
        java.util.concurrent.ExecutorService executorService = ahewVar.b;
        defpackage.ahrv ahrvVarE = ahruVar.c(aheqVar, executorService).e().e(java.lang.Exception.class, new defpackage.ahbx(new defpackage.mdr(ahewVar, 19), 8), defpackage.ajbm.INSTANCE);
        defpackage.afgz afgzVar = new defpackage.afgz(new defpackage.ahes(ahewVar, z, 1), 15);
        long j2 = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), afgzVar, 1);
        int i6 = defpackage.ajan.c;
        defpackage.ajal ajalVar = new defpackage.ajal(ahrvVarE, ajaxVar);
        ahrvVarE.c(ajalVar, defpackage.aiql.t(executorService, ajalVar));
        return ajalVar;
    }
}
