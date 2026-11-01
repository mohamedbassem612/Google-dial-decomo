package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeyy {
    public static final defpackage.aeyx a = new defpackage.aeyx();
    static final defpackage.aeyt b = new defpackage.aeyt(new defpackage.adcu(17), false, defpackage.aikn.a);
    public final defpackage.aewq c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    public final defpackage.zzx g;
    private volatile defpackage.aezs h;
    private final defpackage.aihd i;
    private final defpackage.aezt j;

    public aeyy(defpackage.aewq aewqVar, defpackage.aeyt aeytVar) {
        this.c = aewqVar;
        java.lang.String strA = aeytVar.a(aewqVar.c);
        this.d = strA;
        this.e = "";
        boolean z = aeytVar.a;
        this.f = z;
        boolean z2 = aeytVar.b;
        this.i = aeytVar.c;
        this.h = null;
        this.g = new defpackage.zzx((char[]) null, (byte[]) null);
        this.j = new defpackage.aezt(aewqVar, strA, "", z);
    }

    public final defpackage.aezs a() {
        defpackage.aezs aezsVarA = this.h;
        if (aezsVarA == null) {
            synchronized (this) {
                aezsVarA = this.h;
                if (aezsVarA == null) {
                    android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
                    try {
                        aezsVarA = this.j.a();
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        java.lang.Object obj = aezsVarA.e;
                        int i = ((defpackage.aezr) obj).c - 2;
                        if (i != 15 && i != 16) {
                            defpackage.aewq aewqVar = this.c;
                            aewqVar.f.f();
                            int i2 = 11;
                            if (aezsVarA.a() && ((java.lang.String) aezsVarA.b).isEmpty()) {
                                aewqVar.c().execute(new defpackage.aetv(this, i2));
                                aezsVarA = new defpackage.aezs(aezu.a, (defpackage.aezr) obj);
                            } else {
                                aewqVar.c().execute(new defpackage.abqg(this, 10));
                                aewqVar.i.A((defpackage.akzc) aezsVarA.c, this.i, "", this.d, false, false);
                                if (!this.e.equals("")) {
                                    aewqVar.c().execute(new defpackage.aetv(this, 12));
                                }
                                defpackage.aezt aeztVar = this.j;
                                defpackage.aezw aezwVar = aeztVar.a.f;
                                boolean z = aeztVar.d;
                                defpackage.ajsw ajswVar = defpackage.ajsw.FILE;
                                if (z) {
                                    defpackage.aexw aexwVarB = aezwVar.b();
                                    if (aexwVarB.e && new defpackage.alam(aexwVarB.i, defpackage.aexw.a).contains(ajswVar) && !aexwVarB.n) {
                                        aewqVar.c().execute(new defpackage.abqg(this, i2));
                                    }
                                } else {
                                    defpackage.aexv aexvVarA = aezwVar.a();
                                    if (aexvVarA.e && new defpackage.alam(aexvVarA.j, defpackage.aexv.a).contains(ajswVar) && !aexvVarA.o) {
                                        aewqVar.c().execute(new defpackage.abqg(this, i2));
                                    }
                                }
                            }
                        }
                        this.h = aezsVarA;
                    } catch (java.lang.Throwable th) {
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            }
        }
        return aezsVarA;
    }

    public final void b() {
        defpackage.aezt aeztVar = this.j;
        defpackage.ajcq ajcqVarC = aeztVar.c(this.e);
        j$.util.Objects.requireNonNull(aeztVar);
        defpackage.adfd adfdVar = new defpackage.adfd(aeztVar, 13);
        defpackage.aewq aewqVar = this.c;
        defpackage.ajan.g(ajcqVarC, adfdVar, aewqVar.c()).c(new aekf(this, ajcqVarC, 10), aewqVar.c());
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Map] */
    public final /* synthetic */ void c(defpackage.ajcq ajcqVar) {
        defpackage.aezm aezmVar;
        try {
            defpackage.aezs aezsVar = new defpackage.aezs((aezu) defpackage.aiql.H(ajcqVar), new defpackage.aezr(6, 2, false));
            defpackage.aezs aezsVar2 = this.h;
            if (aezsVar2 == null) {
                synchronized (this) {
                    try {
                        aezsVar2 = this.h;
                        if (aezsVar2 == null) {
                            this.h = aezsVar;
                            ((java.util.concurrent.atomic.AtomicInteger) this.g.a).incrementAndGet();
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            if (defpackage.ahvr.aJ(aezsVar2.d, aezsVar.d) || (aezmVar = (defpackage.aezm) this.c.d.eZ()) == null) {
                return;
            }
            aezmVar.a();
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
            if (e.getCause() instanceof java.lang.SecurityException) {
                return;
            }
            android.util.Log.w("FlagStore", "Unable to update local snapshot for " + this.d + ", may result in stale flags.", e);
        }
    }

    public final void d() {
        defpackage.ajcq ajcqVarB;
        defpackage.aezs aezsVarA = a();
        java.lang.Object obj = aezsVarA.b;
        defpackage.aewq aewqVar = this.c;
        defpackage.aezn aeznVarC = aewqVar.f.c(this.f);
        if (aeznVarC.e) {
            java.lang.String str = (java.lang.String) obj;
            if (defpackage.ahvr.cp(str) && !aeznVarC.d) {
                defpackage.ajcq ajcqVar = defpackage.ajcm.a;
                return;
            }
            defpackage.akzx akzxVarM = defpackage.aexf.a.m();
            java.lang.Object obj2 = aezsVarA.e;
            defpackage.akzx akzxVarM2 = defpackage.aexe.a.m();
            akzxVarM2.u();
            defpackage.aexe aexeVar = (defpackage.aexe) akzxVarM2.b;
            defpackage.aezr aezrVar = (defpackage.aezr) obj2;
            aexeVar.c = aezrVar.b - 2;
            aexeVar.b |= 1;
            akzxVarM2.u();
            defpackage.aexe aexeVar2 = (defpackage.aexe) akzxVarM2.b;
            int i = aezrVar.c;
            aexeVar2.d = i == 1 ? defpackage.alau.a() : i - 2;
            aexeVar2.b |= 2;
            defpackage.aexe aexeVar3 = (defpackage.aexe) akzxVarM2.r();
            akzxVarM.u();
            defpackage.aexf aexfVar = (defpackage.aexf) akzxVarM.b;
            j$.util.Objects.requireNonNull(aexeVar3);
            aexfVar.d = aexeVar3;
            aexfVar.b |= 2;
            if (!defpackage.ahvr.cp(str)) {
                akzxVarM.u();
                defpackage.aexf aexfVar2 = (defpackage.aexf) akzxVarM.b;
                j$.util.Objects.requireNonNull(obj);
                aexfVar2.b |= 1;
                aexfVar2.c = str;
            }
            if (aeznVarC.d) {
                java.lang.String str2 = this.d;
                akzxVarM.u();
                defpackage.aexf aexfVar3 = (defpackage.aexf) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                aexfVar3.b |= 4;
                aexfVar3.e = str2;
            }
            ajcqVarB = aewqVar.b().c((defpackage.aexf) akzxVarM.r());
        } else {
            java.lang.String str3 = (java.lang.String) obj;
            if (defpackage.ahvr.cp(str3)) {
                defpackage.ajcq ajcqVar2 = defpackage.ajcm.a;
                return;
            }
            ajcqVarB = aewqVar.b().b(str3);
        }
        defpackage.adpx adpxVar = new defpackage.adpx(this, aezsVarA, 6);
        defpackage.ajcu ajcuVarC = aewqVar.c();
        defpackage.aizs aizsVar = new defpackage.aizs(ajcqVarB, defpackage.aexj.class, adpxVar);
        ajcqVarB.c(aizsVar, defpackage.aiql.t(ajcuVarC, aizsVar));
    }
}
