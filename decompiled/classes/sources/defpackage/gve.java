package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gve {
    public final defpackage.gxl a;
    public final android.content.Context b;
    public final java.lang.String c;
    public final defpackage.grk d;
    public final androidx.work.impl.WorkDatabase e;
    public final defpackage.gxm f;
    public final defpackage.gwn g;
    public final java.lang.String h;
    public final java.util.List i;
    public final defpackage.aoud j;
    public final defpackage.gou k;
    private final defpackage.gwj l;
    private final java.util.List m;
    private final java.util.List n;

    /* JADX WARN: Type inference failed for: r2v5, types: [gwj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public gve(defpackage.ahbv ahbvVar) throws java.io.IOException {
        defpackage.gxl gxlVar = (defpackage.gxl) ahbvVar.g;
        this.a = gxlVar;
        this.b = (android.content.Context) ahbvVar.a;
        java.lang.String str = gxlVar.b;
        this.c = str;
        this.k = (defpackage.gou) ahbvVar.f;
        defpackage.grk grkVar = (defpackage.grk) ahbvVar.c;
        this.d = grkVar;
        defpackage.gus gusVar = grkVar.p;
        this.l = ahbvVar.e;
        androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) ahbvVar.b;
        this.e = workDatabase;
        this.f = workDatabase.D();
        this.g = workDatabase.x();
        ?? r2 = ahbvVar.d;
        this.m = r2;
        this.h = "Work [ id=" + str + ", class=" + gxlVar.d + ", tags={ " + defpackage.ajsz.cr(r2, ",", null, null, null, 62) + " } ]";
        this.j = new defpackage.aoud(null);
        this.i = new java.util.ArrayList();
        this.n = new java.util.ArrayList();
    }

    public final defpackage.gxd a() {
        return defpackage.gus.u(this.a);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.gvd gvdVar;
        defpackage.grp grpVarA;
        androidx.work.WorkerParameters workerParameters;
        java.lang.String str;
        defpackage.dxw dxwVar;
        defpackage.gve gveVar = this;
        if (aolnVar instanceof defpackage.gvd) {
            gvdVar = (defpackage.gvd) aolnVar;
            int i = gvdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gvdVar.c = i - Integer.MIN_VALUE;
            } else {
                gvdVar = new defpackage.gvd(gveVar, aolnVar);
            }
        } else {
            gvdVar = new defpackage.gvd(gveVar, aolnVar);
        }
        defpackage.gvd gvdVar2 = gvdVar;
        java.lang.Object objAj = gvdVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = gvdVar2.c;
        int i3 = 1;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objAj);
                defpackage.grk grkVar = gveVar.d;
                defpackage.gus gusVar = grkVar.r;
                defpackage.gxl gxlVar = gveVar.a;
                boolean zM = da$.ExternalSyntheticApiModelOutline0.m();
                java.lang.String str2 = gxlVar.y;
                if (zM && str2 != null) {
                    da$.ExternalSyntheticApiModelOutline0.m$1(defpackage.dzk.H(str2), gxlVar.hashCode());
                }
                if (!((java.lang.Boolean) gveVar.e.e(new defpackage.guy(gveVar, i3))).booleanValue()) {
                    if (gxlVar.d()) {
                        grpVarA = gxlVar.f;
                    } else {
                        defpackage.gus gusVar2 = grkVar.q;
                        java.lang.String str3 = gxlVar.e;
                        if (str3 == null) {
                            defpackage.aooh.i("className");
                            defpackage.aooh.i("className");
                        }
                        java.lang.String str4 = defpackage.gry.a;
                        if (str3 == null) {
                            defpackage.aooh.i("className");
                        }
                        defpackage.grx grxVar = null;
                        try {
                            java.lang.Object objNewInstance = java.lang.Class.forName(str3).getDeclaredConstructor(null).newInstance(null);
                            if (objNewInstance == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type androidx.work.InputMerger");
                            }
                            grxVar = (defpackage.grx) objNewInstance;
                        } catch (java.lang.Exception e) {
                            defpackage.gsh.a();
                            android.util.Log.e(defpackage.gry.a, "Trouble instantiating ".concat(java.lang.String.valueOf(str3)), e);
                        }
                        if (grxVar == null) {
                            java.lang.String str5 = defpackage.gvf.a;
                            defpackage.gsh.a();
                            android.util.Log.e(str5, "Could not create Input Merger ".concat(java.lang.String.valueOf(gveVar.a.e)));
                            return new gvc(false);
                        }
                        java.util.List listSingletonList = java.util.Collections.singletonList(gveVar.a.f);
                        defpackage.aooh.e(listSingletonList, "singletonList(...)");
                        grpVarA = grxVar.a(defpackage.ajsz.bT(listSingletonList, gveVar.f.e(gveVar.c)));
                    }
                    defpackage.grp grpVar = grpVarA;
                    java.lang.String str6 = gveVar.c;
                    java.util.List list = gveVar.m;
                    defpackage.gxl gxlVar2 = gveVar.a;
                    defpackage.grk grkVar2 = gveVar.d;
                    defpackage.gou gouVar = gveVar.k;
                    java.util.UUID uuidFromString = java.util.UUID.fromString(str6);
                    int i4 = gxlVar2.l;
                    java.util.concurrent.Executor executor = grkVar2.a;
                    defpackage.aolr aolrVar = grkVar2.b;
                    defpackage.gta gtaVar = grkVar2.d;
                    int i5 = defpackage.gys.a;
                    androidx.work.WorkerParameters workerParameters2 = new androidx.work.WorkerParameters(uuidFromString, grpVar, list, i4, executor, aolrVar, gouVar, gtaVar, new defpackage.gyr(gveVar.e, gveVar.l, gouVar));
                    try {
                        defpackage.gsg gsgVarB = gtaVar.b(gveVar.b, gxlVar2.d, workerParameters2);
                        gsgVarB.c = true;
                        defpackage.aolp aolpVar = gvdVar2.u().get(defpackage.aoub.d);
                        if (aolpVar == null) {
                            defpackage.aooh.g();
                        }
                        defpackage.aoub aoubVar = (defpackage.aoub) aolpVar;
                        defpackage.gux guxVar = new defpackage.gux(gsgVarB, zM, str2, gveVar, 0);
                        gveVar = gveVar;
                        aoubVar.p(guxVar);
                        java.lang.Object objE = gveVar.e.e(new defpackage.guy(gveVar, 0));
                        defpackage.aooh.e(objE, "runInTransaction(...)");
                        if (((java.lang.Boolean) objE).booleanValue() && !aoubVar.v()) {
                            defpackage.grw grwVar = workerParameters2.h;
                            ?? r0 = gveVar.k.c;
                            defpackage.aooh.e(r0, "getMainThreadExecutor(...)");
                            defpackage.aosp aospVarAc = defpackage.aooc.ac(r0);
                            try {
                                defpackage.edj edjVar = new defpackage.edj(gveVar, gsgVarB, grwVar, (defpackage.aoln) null, 3);
                                gvdVar2.d = workerParameters2;
                                gvdVar2.c = 1;
                                objAj = defpackage.aoov.aj(aospVarAc, edjVar, gvdVar2);
                                if (objAj == aoluVar) {
                                    return aoluVar;
                                }
                                workerParameters = workerParameters2;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                workerParameters = workerParameters2;
                                str = defpackage.gvf.a;
                                defpackage.gsh.a();
                                android.util.Log.e(str, gveVar.h.concat(" failed because it threw an exception/error"), th);
                                dxwVar = gveVar.d.h;
                                if (dxwVar != null) {
                                    defpackage.ils ilsVar = new defpackage.ils(gveVar.a.d, workerParameters, th);
                                    if (str == null) {
                                        defpackage.aooh.i("tag");
                                    }
                                    dxwVar.accept(ilsVar);
                                }
                                return new guz();
                            }
                        }
                    } catch (java.lang.Throwable unused) {
                        java.lang.String str7 = defpackage.gvf.a;
                        defpackage.gsh.a();
                        android.util.Log.e(str7, "Could not create Worker ".concat(java.lang.String.valueOf(gveVar.a.d)));
                        return new gvc(false);
                    }
                }
                return new gvc(true);
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            workerParameters = gvdVar2.d;
            try {
                defpackage.aooc.af(objAj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = defpackage.gvf.a;
                defpackage.gsh.a();
                android.util.Log.e(str, gveVar.h.concat(" failed because it threw an exception/error"), th);
                dxwVar = gveVar.d.h;
                if (dxwVar != null) {
                    defpackage.ils ilsVar2 = new defpackage.ils(gveVar.a.d, workerParameters, th);
                    if (str == null) {
                        defpackage.aooh.i("tag");
                    }
                    try {
                        dxwVar.accept(ilsVar2);
                    } catch (java.lang.Throwable th3) {
                        defpackage.gsh.a();
                        android.util.Log.e(str, "Exception handler threw an exception", th3);
                    }
                }
                return new guz();
            }
            defpackage.gus gusVar3 = (defpackage.gus) objAj;
            if (gusVar3 == null) {
                defpackage.aooh.g();
            }
            return new defpackage.gva(gusVar3);
        } catch (java.util.concurrent.CancellationException e2) {
            java.lang.String str8 = gveVar.h;
            java.lang.String str9 = defpackage.gvf.a;
            int i6 = defpackage.gsh.a().c;
            android.util.Log.i(str9, str8.concat(" was cancelled"), e2);
            throw e2;
        }
    }

    public final boolean c(int i) {
        defpackage.gxm gxmVar = this.f;
        java.lang.String str = this.c;
        defpackage.gsw gswVarB = gxmVar.b(str);
        if (gswVarB == null || gswVarB.a()) {
            java.lang.String str2 = defpackage.gvf.a;
            defpackage.gsh.a().c(str2, "Status for " + str + " is " + gswVarB + " ; not doing any work");
            return false;
        }
        defpackage.gxl gxlVar = this.a;
        if (defpackage.aooh.n(gxlVar.z, java.lang.Boolean.TRUE)) {
            java.lang.String str3 = defpackage.gvf.a;
            defpackage.gsh.a().c(str3, "Worker " + gxlVar.d + " was interrupted. Backing off.");
            d(i);
            return true;
        }
        java.lang.String str4 = defpackage.gvf.a;
        defpackage.gsh.a().c(str4, "Status for " + str + " is " + gswVarB + "; not doing any work and rescheduling for later execution");
        gxmVar.A(defpackage.gsw.a, str);
        gxmVar.r(str, i);
        gxmVar.w(str, -1L);
        return true;
    }

    public final void d(int i) {
        defpackage.gxm gxmVar = this.f;
        defpackage.gsw gswVar = defpackage.gsw.a;
        java.lang.String str = this.c;
        gxmVar.A(gswVar, str);
        gxmVar.p(str, java.lang.System.currentTimeMillis());
        gxmVar.o(str, this.a.w);
        gxmVar.w(str, -1L);
        gxmVar.r(str, i);
    }

    public final void e() {
        defpackage.gxm gxmVar = this.f;
        java.lang.String str = this.c;
        gxmVar.p(str, java.lang.System.currentTimeMillis());
        gxmVar.A(defpackage.gsw.a, str);
        gxmVar.y(str);
        gxmVar.o(str, this.a.w);
        gxmVar.m(str);
        gxmVar.w(str, -1L);
    }

    public final void f(defpackage.gus gusVar) {
        java.lang.String str = defpackage.gvf.a;
        defpackage.gsh.a();
        android.util.Log.i(str, "Worker result FAILURE for ".concat(this.h));
        if (this.a.d()) {
            e();
        } else {
            g(gusVar);
        }
    }

    public final void g(defpackage.gus gusVar) {
        java.lang.String str = this.c;
        java.util.List<java.lang.String> listBd = defpackage.ajsz.bd(str);
        listBd.addAll(defpackage.gus.c(this.g, str));
        for (java.lang.String str2 : listBd) {
            defpackage.gxm gxmVar = this.f;
            if (gxmVar.b(str2) != defpackage.gsw.f) {
                gxmVar.A(defpackage.gsw.d, str2);
                if (!defpackage.aooh.n(str2, str)) {
                    this.n.add(str2);
                }
            }
        }
        defpackage.grp grpVar = ((gsd) gusVar).a;
        defpackage.aooh.e(grpVar, "getOutputData(...)");
        defpackage.gxm gxmVar2 = this.f;
        gxmVar2.o(str, this.a.w);
        gxmVar2.q(str, grpVar);
    }
}
