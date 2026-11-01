package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahes implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.ahew a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ahes(defpackage.ahew ahewVar, boolean z, int i) {
        this.$cid = i;
        this.a = ahewVar;
        this.b = z;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        java.io.File fileA;
        if (this.$cid != 0) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            defpackage.aooh.f(bool, "allSucceeded");
            boolean zBooleanValue = bool.booleanValue();
            final defpackage.ahew ahewVar = this.a;
            if (zBooleanValue) {
                return ahewVar.c(2, "sqlite_completion_present");
            }
            final java.util.Map map = ahewVar.j;
            java.lang.Object objA = ahewVar.g.a();
            defpackage.aooh.e(objA, "get(...)");
            java.lang.Iterable iterable = (java.lang.Iterable) objA;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(iterable, 10));
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new ahev((ahex) it.next()));
            }
            final boolean z = this.b;
            return ahewVar.l.d(new defpackage.ajas() { // from class: aheu
                @Override // defpackage.ajas
                public final defpackage.ajcq a() {
                    defpackage.ahew ahewVar2 = ahewVar;
                    defpackage.zzx zzxVarD = ahewVar2.d();
                    final int i = ahewVar2.d;
                    defpackage.ajcq ajcqVarC = defpackage.ahvr.C(zzxVarD.G(new defpackage.afii() { // from class: ahet
                        @Override // defpackage.afii
                        public final void a(defpackage.adag adagVar) throws java.lang.InterruptedException {
                            defpackage.ahbq ahbqVar = defpackage.ahew.k;
                            defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
                            adagVar2.n("DELETE FROM ListenerSuccessfulRuns WHERE version_code != ?");
                            java.lang.Long lValueOf = java.lang.Long.valueOf(i);
                            adagVar2.o(lValueOf);
                            adagVar.A(adagVar2.B());
                            defpackage.adag adagVar3 = new defpackage.adag((byte[]) null);
                            adagVar3.n("DELETE FROM AllListenersSucceededVersionTable WHERE version_code != ?");
                            adagVar3.o(lValueOf);
                            adagVar.A(adagVar3.B());
                        }
                    }), java.lang.Exception.class, new defpackage.afgz(new defpackage.aoqo(ahewVar2, 1), 20), defpackage.ajbm.INSTANCE);
                    defpackage.afgz afgzVar = new defpackage.afgz(new defpackage.mdr(ahewVar2, 20), 16);
                    java.util.concurrent.ExecutorService executorService = ahewVar2.b;
                    return defpackage.ahvr.I(defpackage.ahvr.I(defpackage.ahvr.I(ajcqVarC, afgzVar, executorService), new defpackage.afgz(new defpackage.nxi(ahewVar2, map, 10), 18), executorService), new defpackage.afgz(new defpackage.ahes(ahewVar2, z, 0), 19), executorService);
                }
            }, defpackage.ahvr.bx(arrayList));
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        defpackage.aooh.f(bool2, "allSucceeded");
        if (!bool2.booleanValue()) {
            return defpackage.ajcm.a;
        }
        boolean z2 = this.b;
        defpackage.ahew ahewVar2 = this.a;
        int i = ahewVar2.d;
        if (z2 && (fileA = ahewVar2.a()) != null) {
            try {
                java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(fileA, "rw");
                try {
                    randomAccessFile.writeInt(i);
                    defpackage.ajsz.ak(randomAccessFile, null);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        defpackage.ajsz.ak(randomAccessFile, th);
                        throw th2;
                    }
                }
            } catch (java.io.IOException e) {
                ((defpackage.aimw) ((defpackage.aimw) ahewVar2.h.d()).k(e).l("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "writePackageVersionToFile", 563, "StartupAfterPackageReplacedWithRetryRunner.kt")).v("Failed to write package version to file");
            }
        }
        defpackage.zzx zzxVarD = ahewVar2.d();
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("INSERT INTO AllListenersSucceededVersionTable (version_code) VALUES (?)");
        adagVar.o(java.lang.Long.valueOf(i));
        defpackage.ajcq ajcqVarN = zzxVarD.N(adagVar.B());
        defpackage.aooh.e(ajcqVarN, "execSql(...)");
        return ajcqVarN;
    }
}
