package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rog {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/main/impl/MainActivityPeer");
    public final com.android.dialer.main.impl.MainActivity b;
    public final defpackage.rkg c;
    public final defpackage.uqf d;
    public final defpackage.lpe e;
    public final defpackage.aoin f;
    public final defpackage.rlv g;
    public final defpackage.urs h;
    public final defpackage.ruc i;
    public final defpackage.tec j;
    public final defpackage.mgw k;
    public final defpackage.zjm l;
    public final defpackage.zzx m;
    public final defpackage.gpd n;
    public final defpackage.tkl o;
    public final defpackage.ttj p;
    public final defpackage.adae q;
    public final defpackage.zjm r;
    public final defpackage.ipc s;
    public final defpackage.aogc t;
    public final defpackage.aogc u;
    private final defpackage.gpd v;
    private final defpackage.rsr w;

    /* JADX WARN: Type inference failed for: r12v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aoin, java.lang.Object] */
    public rog(com.android.dialer.main.impl.MainActivity mainActivity, defpackage.rkg rkgVar, defpackage.uqf uqfVar, defpackage.lpe lpeVar, defpackage.zjm zjmVar, defpackage.zjm zjmVar2, defpackage.aoin aoinVar, defpackage.ipc ipcVar, defpackage.rlv rlvVar, defpackage.zzx zzxVar, defpackage.gpd gpdVar, defpackage.urs ursVar, defpackage.ruc rucVar, defpackage.ttj ttjVar, defpackage.adae adaeVar, defpackage.tkl tklVar, defpackage.gpd gpdVar2, defpackage.tec tecVar, defpackage.rsr rsrVar, defpackage.aogc aogcVar, defpackage.mgw mgwVar) {
        if (uqfVar == null) {
            defpackage.aooh.i("mainActivityStartupMonitor");
        }
        if (lpeVar == null) {
            defpackage.aooh.i("revertedFlagsDetector");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableHardwareAccelerationForVivoGo");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        if (adaeVar == null) {
            defpackage.aooh.i("growthKitCallbacksManager");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("mainActivityProvider");
        }
        if (mgwVar == null) {
            defpackage.aooh.i("debugSingletonEventRecorder");
        }
        this.b = mainActivity;
        this.c = rkgVar;
        this.d = uqfVar;
        this.e = lpeVar;
        this.r = zjmVar;
        this.l = zjmVar2;
        this.f = aoinVar;
        this.s = ipcVar;
        this.g = rlvVar;
        this.m = zzxVar;
        this.v = gpdVar;
        this.h = ursVar;
        this.i = rucVar;
        this.p = ttjVar;
        this.q = adaeVar;
        this.o = tklVar;
        this.n = gpdVar2;
        this.j = tecVar;
        this.w = rsrVar;
        this.t = aogcVar;
        this.k = mgwVar;
        defpackage.oqi oqiVar = (defpackage.oqi) rsrVar.b.a();
        oqiVar.getClass();
        defpackage.zzx zzxVar2 = (defpackage.zzx) rsrVar.a.a();
        zzxVar2.getClass();
        this.u = new defpackage.aogc(oqiVar, zzxVar2, mainActivity, (float[]) null);
    }

    public final defpackage.aw a() {
        if (this.j.a(this.b)) {
            rpm rpmVar = new rpm();
            defpackage.amxr.g(rpmVar);
            return rpmVar;
        }
        defpackage.rpv rpvVar = new defpackage.rpv();
        defpackage.amxr.g(rpvVar);
        return rpvVar;
    }

    public final void b(defpackage.mce mceVar) {
        this.v.i(null).b(mceVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean c() {
        defpackage.gpd gpdVar = this.n;
        return (gpdVar.c(gpdVar.a) || gpdVar.f()) && this.j.a(this.b);
    }
}
