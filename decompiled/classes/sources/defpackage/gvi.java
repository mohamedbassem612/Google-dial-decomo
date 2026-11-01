package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gvi implements defpackage.gtt, defpackage.gvp, defpackage.gtf {
    private static final java.lang.String b = defpackage.gsh.b("GreedyScheduler");
    java.lang.Boolean a;
    private final android.content.Context c;
    private final defpackage.gvg e;
    private boolean f;
    private final defpackage.gtr i;
    private final defpackage.grk j;
    private final defpackage.apkv l;
    private final defpackage.gou m;
    private final defpackage.ipc n;
    private final defpackage.rsr o;
    private final java.util.Map d = new java.util.HashMap();
    private final java.lang.Object g = new java.lang.Object();
    private final defpackage.gtw h = new defpackage.gty(new defpackage.gtx());
    private final java.util.Map k = new java.util.HashMap();

    public gvi(android.content.Context context, defpackage.grk grkVar, defpackage.kgl kglVar, defpackage.gtr gtrVar, defpackage.rsr rsrVar, defpackage.gou gouVar) {
        this.c = context;
        defpackage.gsu gsuVar = grkVar.e;
        defpackage.gus gusVar = grkVar.p;
        this.e = new defpackage.gvg(this, gsuVar);
        this.l = new defpackage.apkv(gsuVar, rsrVar);
        this.m = gouVar;
        this.n = new defpackage.ipc(kglVar);
        this.j = grkVar;
        this.i = gtrVar;
        this.o = rsrVar;
    }

    private final void f() {
        this.a = java.lang.Boolean.valueOf(defpackage.gyj.a(this.c, this.j));
    }

    private final void g() {
        if (this.f) {
            return;
        }
        this.i.c(this);
        this.f = true;
    }

    @Override // defpackage.gtf
    public final void a(defpackage.gxd gxdVar, boolean z) {
        defpackage.aoub aoubVar;
        defpackage.ipc ipcVarB = this.h.b(gxdVar);
        if (ipcVarB != null) {
            this.l.b(ipcVarB);
        }
        synchronized (this.g) {
            aoubVar = (defpackage.aoub) this.d.remove(gxdVar);
        }
        if (aoubVar != null) {
            defpackage.gsh gshVarA = defpackage.gsh.a();
            java.lang.String str = b;
            java.util.Objects.toString(gxdVar);
            gshVarA.c(str, "Stopping tracking for ".concat(java.lang.String.valueOf(gxdVar)));
            aoubVar.s(null);
        }
        if (z) {
            return;
        }
        synchronized (this.g) {
            this.k.remove(gxdVar);
        }
    }

    @Override // defpackage.gtt
    public final void b(java.lang.String str) {
        java.util.List<defpackage.ipc> listBZ;
        java.lang.Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            defpackage.gsh.a();
            android.util.Log.i(b, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        defpackage.gsh.a().c(b, "Cancelling work ID ".concat(java.lang.String.valueOf(str)));
        defpackage.gvg gvgVar = this.e;
        if (gvgVar != null && (runnable = (java.lang.Runnable) gvgVar.d.remove(str)) != null) {
            gvgVar.c.a(runnable);
        }
        defpackage.gtw gtwVar = this.h;
        if (str == null) {
            defpackage.aooh.i("workSpecId");
        }
        synchronized (((defpackage.gty) gtwVar).b) {
            defpackage.gtw gtwVar2 = ((defpackage.gty) gtwVar).a;
            if (str == null) {
                defpackage.aooh.i("workSpecId");
            }
            java.util.Map map = ((defpackage.gtx) gtwVar2).a;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (defpackage.aooh.n(((defpackage.gxd) entry.getKey()).a, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                map.remove((defpackage.gxd) it.next());
            }
            listBZ = defpackage.ajsz.bZ(linkedHashMap.values());
        }
        for (defpackage.ipc ipcVar : listBZ) {
            this.l.b(ipcVar);
            defpackage.rsr rsrVar = this.o;
            if (ipcVar == null) {
                defpackage.aooh.i("workSpecId");
            }
            rsrVar.ay(ipcVar, -512);
        }
    }

    @Override // defpackage.gtt
    public final void c(defpackage.gxl... gxlVarArr) {
        long jMax;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            defpackage.gsh.a();
            android.util.Log.i(b, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        java.util.HashSet<defpackage.gxl> hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (defpackage.gxl gxlVar : gxlVarArr) {
            defpackage.gxd gxdVarU = defpackage.gus.u(gxlVar);
            defpackage.gtw gtwVar = this.h;
            if (!gtwVar.a(gxdVarU)) {
                synchronized (this.g) {
                    defpackage.gxd gxdVarU2 = defpackage.gus.u(gxlVar);
                    java.util.Map map = this.k;
                    defpackage.gvh gvhVar = (defpackage.gvh) map.get(gxdVarU2);
                    if (gvhVar == null) {
                        int i = gxlVar.l;
                        defpackage.gus gusVar = this.j.p;
                        gvhVar = new defpackage.gvh(i, java.lang.System.currentTimeMillis());
                        map.put(gxdVarU2, gvhVar);
                    }
                    jMax = gvhVar.b + (((long) java.lang.Math.max((gxlVar.l - gvhVar.a) - 5, 0)) * 30000);
                }
                long jMax2 = java.lang.Math.max(gxlVar.a(), jMax);
                defpackage.gus gusVar2 = this.j.p;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (gxlVar.c == defpackage.gsw.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        defpackage.gvg gvgVar = this.e;
                        if (gvgVar != null) {
                            java.lang.String str = gxlVar.b;
                            java.util.Map map2 = gvgVar.d;
                            java.lang.Runnable runnable = (java.lang.Runnable) map2.remove(str);
                            if (runnable != null) {
                                gvgVar.c.a(runnable);
                            }
                            defpackage.an anVar = new defpackage.an(gvgVar, gxlVar, 9);
                            map2.put(str, anVar);
                            gvgVar.c.b(jMax2 - java.lang.System.currentTimeMillis(), anVar);
                        }
                    } else if (gxlVar.b()) {
                        defpackage.grn grnVar = gxlVar.k;
                        if (grnVar.e) {
                            defpackage.gsh.a().c(b, defpackage.a.bg(gxlVar, "Ignoring ", ". Requires device idle."));
                        } else if (grnVar.b()) {
                            defpackage.gsh.a().c(b, defpackage.a.bg(gxlVar, "Ignoring ", ". Requires ContentUri triggers."));
                        } else {
                            hashSet.add(gxlVar);
                            hashSet2.add(gxlVar.b);
                        }
                    } else if (!gtwVar.a(defpackage.gus.u(gxlVar))) {
                        defpackage.gsh.a().c(b, "Starting work for ".concat(java.lang.String.valueOf(gxlVar.b)));
                        if (gxlVar == null) {
                            defpackage.aooh.i("spec");
                        }
                        defpackage.ipc ipcVarC = gtwVar.c(defpackage.gus.u(gxlVar));
                        this.l.c(ipcVarC);
                        this.o.ax(ipcVarC, null);
                    }
                }
            }
        }
        synchronized (this.g) {
            if (!hashSet.isEmpty()) {
                defpackage.gsh.a().c(b, defpackage.a.bx(android.text.TextUtils.join(",", hashSet2), "Starting tracking for "));
                for (defpackage.gxl gxlVar2 : hashSet) {
                    defpackage.gxd gxdVarU3 = defpackage.gus.u(gxlVar2);
                    java.util.Map map3 = this.d;
                    if (!map3.containsKey(gxdVarU3)) {
                        map3.put(gxdVarU3, defpackage.gvs.a(this.n, gxlVar2, (defpackage.aosp) this.m.b, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.gtt
    public final boolean d() {
        return false;
    }

    @Override // defpackage.gvp
    public final void e(defpackage.gxl gxlVar, hgt hgtVar) {
        boolean z = hgtVar instanceof gvm;
        defpackage.gxd gxdVarU = defpackage.gus.u(gxlVar);
        if (z) {
            defpackage.gtw gtwVar = this.h;
            if (gtwVar.a(gxdVarU)) {
                return;
            }
            defpackage.gsh gshVarA = defpackage.gsh.a();
            java.lang.String str = b;
            java.util.Objects.toString(gxdVarU);
            gshVarA.c(str, "Constraints met: Scheduling work ID ".concat(gxdVarU.toString()));
            defpackage.ipc ipcVarC = gtwVar.c(gxdVarU);
            this.l.c(ipcVarC);
            this.o.ax(ipcVarC, null);
            return;
        }
        defpackage.gsh gshVarA2 = defpackage.gsh.a();
        java.lang.String str2 = b;
        java.util.Objects.toString(gxdVarU);
        gshVarA2.c(str2, "Constraints not met: Cancelling work ID ".concat(gxdVarU.toString()));
        defpackage.ipc ipcVarB = this.h.b(gxdVarU);
        if (ipcVarB != null) {
            this.l.b(ipcVarB);
            this.o.ay(ipcVarB, ((gvn) hgtVar).a);
        }
    }
}
