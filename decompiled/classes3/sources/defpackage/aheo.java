package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aheo {
    public final android.content.Context a;
    public final java.util.Map b;
    public final aoin c;
    public final aoin d;
    public final ajct e;
    public final amwu f;
    public final aoin g;
    public final aoin h;
    public final boolean i;
    public final java.util.Map j;
    public final ahda k;
    public final adag l;
    private final java.util.Map m;

    public aheo(android.content.Context context, adag adagVar, java.util.Map map, java.util.Map map2, aoin aoinVar, aoin aoinVar2, ajct ajctVar, amwu amwuVar, aoin aoinVar3, ahda ahdaVar, aoin aoinVar4) {
        aooh.f(context, "context");
        aooh.f(ajctVar, "backgroundExecutor");
        aooh.f(amwuVar, "androidFutures");
        aooh.f(aoinVar3, "traceCreation");
        aooh.f(aoinVar4, "packageInfoProvider");
        this.a = context;
        this.l = adagVar;
        this.m = map;
        this.b = map2;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = ajctVar;
        this.f = amwuVar;
        this.g = aoinVar3;
        this.k = ahdaVar;
        this.h = aoinVar4;
        if (!ajsz.cd(((aikj) map).f(), ((aikj) map2).f()).isEmpty()) {
            java.util.Set setCd = ajsz.cd(((aikj) map).f(), ((aikj) map2).f());
            java.util.Objects.toString(setCd);
            throw new java.lang.IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(setCd.toString()));
        }
        java.lang.Boolean.FALSE.booleanValue();
        this.i = false;
        this.j = adagVar.r() ? ajsz.aQ(map, map2) : map2;
    }

    public static final int b(java.io.RandomAccessFile randomAccessFile) throws java.io.IOException {
        int i;
        try {
            i = randomAccessFile.readInt();
        } catch (java.io.EOFException unused) {
            i = -1;
        } finally {
            randomAccessFile.seek(0L);
        }
        return i;
    }

    public final void a(boolean z) {
        ahoq ahoqVarW = ahvr.W(1377, "StartupAfterPackageReplaced");
        try {
            ajcq ajcqVarG = ahvr.G(new iaw(this, z, 7), this.e);
            agsm agsmVar = (agsm) this.f.a();
            ahoqVarW.a(ajcqVarG);
            agsmVar.g(ajcqVarG, 30L, java.util.concurrent.TimeUnit.SECONDS);
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }
}
