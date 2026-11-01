package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class guq extends defpackage.gsy {
    public android.content.Context c;
    public defpackage.grk d;
    public androidx.work.impl.WorkDatabase e;
    public java.util.List f;
    public defpackage.gtr g;
    public boolean h = false;
    public android.content.BroadcastReceiver.PendingResult i;
    public volatile defpackage.gzd j;
    public defpackage.gou k;
    public final defpackage.kgl l;
    public defpackage.ipc m;
    private final defpackage.aoss p;
    public static final java.lang.String a = defpackage.gsh.b("WorkManagerImpl");
    private static defpackage.guq n = null;
    private static defpackage.guq o = null;
    public static final java.lang.Object b = new java.lang.Object();

    /* JADX WARN: Type inference failed for: r10v1, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public guq(android.content.Context context, final defpackage.grk grkVar, defpackage.gou gouVar, androidx.work.impl.WorkDatabase workDatabase, final java.util.List list, defpackage.gtr gtrVar, defpackage.kgl kglVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (aa$.ExternalSyntheticApiModelOutline1.m(applicationContext)) {
            throw new java.lang.IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        int i = grkVar.j;
        defpackage.gsh gshVar = new defpackage.gsh(4);
        synchronized (defpackage.gsh.a) {
            if (defpackage.gsh.b == null) {
                defpackage.gsh.b = gshVar;
            }
        }
        this.c = applicationContext;
        this.k = gouVar;
        this.e = workDatabase;
        this.g = gtrVar;
        this.l = kglVar;
        this.d = grkVar;
        this.f = list;
        this.p = gouVar.a;
        final androidx.work.impl.WorkDatabase workDatabase2 = this.e;
        this.m = new defpackage.ipc((java.lang.Object) workDatabase2, (byte[]) null);
        defpackage.gtr gtrVar2 = this.g;
        final ?? r7 = gouVar.e;
        java.lang.String str = defpackage.gtv.a;
        gtrVar2.c(new defpackage.gtf() { // from class: gtu
            @Override // defpackage.gtf
            public final void a(defpackage.gxd gxdVar, boolean z) {
                java.lang.String str2 = defpackage.gtv.a;
                r7.execute(new defpackage.gsr(workDatabase2, gxdVar, list, grkVar, 2));
            }
        });
        java.util.ListIterator listIterator = ((defpackage.aokv) list).listIterator(0);
        while (listIterator.hasNext()) {
            defpackage.gtt gttVar = (defpackage.gtt) listIterator.next();
            if (gttVar instanceof defpackage.gtg) {
                defpackage.gtr gtrVar3 = this.g;
                defpackage.gtg gtgVar = (defpackage.gtg) gttVar;
                synchronized (gtrVar3.l) {
                    gtrVar3.k.add(gtgVar);
                }
            }
        }
        this.k.b(new defpackage.gyd(applicationContext, this));
        defpackage.aoss aossVar = this.p;
        android.content.Context context2 = this.c;
        java.lang.String str2 = defpackage.gub.a;
        if (aossVar == null) {
            defpackage.aooh.i("<this>");
        }
        if (context2 == null) {
            defpackage.aooh.i("appContext");
        }
        if (grkVar == null) {
            defpackage.aooh.i("configuration");
        }
        if (workDatabase == null) {
            defpackage.aooh.i("db");
        }
        if (defpackage.gyj.a(context2, grkVar)) {
            defpackage.aoov.an(aossVar, null, 0, new defpackage.aegc(new defpackage.gdc(defpackage.aoxo.a(defpackage.aoov.aD(new defpackage.gdc(workDatabase.D().k(), new defpackage.gtz(null), 9), -1)), new defpackage.gua(context2, null), 12), (defpackage.aoln) null, 2), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static defpackage.guq h(android.content.Context context) {
        defpackage.guq guqVarH;
        defpackage.gfv gfvVar;
        java.lang.Object obj = b;
        synchronized (obj) {
            synchronized (obj) {
                try {
                    guqVarH = n;
                    if (guqVarH == null) {
                        guqVarH = o;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        if (guqVarH == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof com.android.dialer.Dialer_Application)) {
                throw new java.lang.IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            com.android.dialer.Dialer_Application dialer_Application = (com.android.dialer.Dialer_Application) applicationContext;
            java.lang.AutoCloseable ahnoVar = !defpackage.agab.aw() ? new defpackage.ahno(2) : ((defpackage.ahpz) ((defpackage.agur) defpackage.aooc.ar(dialer_Application, defpackage.agur.class)).nI().a).f(1469, "getWorkManagerConfiguration");
            try {
                defpackage.grk grkVarQ = ((defpackage.agur) defpackage.aooc.ar(dialer_Application, defpackage.agur.class)).q();
                ahnoVar.close();
                synchronized (obj) {
                    if (n == null) {
                        android.content.Context applicationContext2 = applicationContext.getApplicationContext();
                        defpackage.guq guqVar = o;
                        if (guqVar == null) {
                            if (applicationContext2 == null) {
                                defpackage.aooh.i("context");
                            }
                            if (grkVarQ == null) {
                                defpackage.aooh.i("configuration");
                            }
                            defpackage.gou gouVar = new defpackage.gou(grkVarQ.c);
                            final android.content.Context applicationContext3 = applicationContext2.getApplicationContext();
                            defpackage.aooh.e(applicationContext3, "getApplicationContext(...)");
                            ?? r2 = gouVar.e;
                            defpackage.aooh.e(r2, "getSerialTaskExecutor(...)");
                            defpackage.gus gusVar = grkVarQ.p;
                            boolean z = applicationContext2.getResources().getBoolean(2131034174);
                            if (applicationContext3 == null) {
                                defpackage.aooh.i("context");
                            }
                            if (r2 == 0) {
                                defpackage.aooh.i("queryExecutor");
                            }
                            if (z) {
                                if (applicationContext3 == null) {
                                    defpackage.aooh.i("context");
                                }
                                defpackage.gfv gfvVar2 = new defpackage.gfv(applicationContext3, androidx.work.impl.WorkDatabase.class, null);
                                gfvVar2.c = true;
                                gfvVar = gfvVar2;
                            } else {
                                defpackage.gfv gfvVarD = defpackage.gfz.d(applicationContext3, androidx.work.impl.WorkDatabase.class, "androidx.work.workdb");
                                gfvVarD.b = new defpackage.gis() { // from class: gud
                                    @Override // defpackage.gis
                                    public final defpackage.git a(defpackage.aewz aewzVar) {
                                        defpackage.gir girVarK = defpackage.dzk.K(applicationContext3);
                                        girVarK.a = aewzVar.a;
                                        girVarK.b = (defpackage.giq) aewzVar.e;
                                        girVarK.c = true;
                                        girVarK.d = true;
                                        return new defpackage.gje().a(girVarK.a());
                                    }
                                };
                                gfvVar = gfvVarD;
                            }
                            gfvVar.f(r2);
                            gfvVar.g(new defpackage.gtd());
                            gfvVar.b(defpackage.gtl.c);
                            gfvVar.b(new defpackage.gts(applicationContext3, 2, 3));
                            gfvVar.b(defpackage.gtm.c);
                            gfvVar.b(defpackage.gtn.c);
                            gfvVar.b(new defpackage.gts(applicationContext3, 5, 6));
                            gfvVar.b(defpackage.gto.c);
                            gfvVar.b(defpackage.gtp.c);
                            gfvVar.b(defpackage.gtq.c);
                            gfvVar.b(new defpackage.gut(applicationContext3));
                            gfvVar.b(new defpackage.gts(applicationContext3, 10, 11));
                            gfvVar.b(defpackage.gth.c);
                            gfvVar.b(defpackage.gti.c);
                            gfvVar.b(defpackage.gtj.c);
                            gfvVar.b(defpackage.gtk.c);
                            gfvVar.b(new defpackage.gts(applicationContext3, 21, 22));
                            gfvVar.f = false;
                            gfvVar.g = true;
                            gfvVar.h = true;
                            androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) gfvVar.a();
                            android.content.Context applicationContext4 = applicationContext2.getApplicationContext();
                            defpackage.aooh.e(applicationContext4, "getApplicationContext(...)");
                            android.content.Context applicationContext5 = applicationContext4.getApplicationContext();
                            defpackage.aooh.e(applicationContext5, "getApplicationContext(...)");
                            defpackage.gvy gvyVar = new defpackage.gvy(applicationContext5, gouVar);
                            android.content.Context applicationContext6 = applicationContext4.getApplicationContext();
                            defpackage.aooh.e(applicationContext6, "getApplicationContext(...)");
                            defpackage.gwa gwaVar = new defpackage.gwa(applicationContext6, gouVar);
                            android.content.Context applicationContext7 = applicationContext4.getApplicationContext();
                            defpackage.aooh.e(applicationContext7, "getApplicationContext(...)");
                            defpackage.kgl kglVar = new defpackage.kgl(applicationContext4, gvyVar, gwaVar, new defpackage.gwh(applicationContext7, gouVar));
                            defpackage.gtr gtrVar = new defpackage.gtr(applicationContext2.getApplicationContext(), grkVarQ, gouVar, workDatabase);
                            defpackage.gur gurVar = defpackage.gur.a;
                            if (applicationContext2 == null) {
                                defpackage.aooh.i("context");
                            }
                            if (grkVarQ == null) {
                                defpackage.aooh.i("configuration");
                            }
                            if (workDatabase == null) {
                                defpackage.aooh.i("workDatabase");
                            }
                            defpackage.guq guqVar2 = new defpackage.guq(applicationContext2.getApplicationContext(), grkVarQ, gouVar, workDatabase, gurVar.a(applicationContext2, grkVarQ, gouVar, workDatabase, kglVar, gtrVar), gtrVar, kglVar);
                            o = guqVar2;
                            guqVar = guqVar2;
                        }
                        n = guqVar;
                    } else if (o != null) {
                        throw new java.lang.IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                    guqVarH = h(applicationContext);
                }
            } catch (java.lang.Throwable th2) {
                try {
                    ahnoVar.close();
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
        return guqVarH;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gsy
    public final defpackage.gso a(java.lang.String str) {
        defpackage.aooh.f(str, "name");
        defpackage.gus gusVar = this.d.r;
        ?? r1 = this.k.e;
        defpackage.aooh.e(r1, "getSerialTaskExecutor(...)");
        return defpackage.gus.S(gusVar, "CancelWorkByName_".concat(java.lang.String.valueOf(str)), r1, new bxq(str, this, 19));
    }

    @Override // defpackage.gsy
    public final defpackage.gso b(java.util.UUID uuid) {
        return defpackage.gus.e(uuid, this);
    }

    @Override // defpackage.gsy
    public final defpackage.gso c(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new defpackage.guc(this, null, 2, list).a();
    }

    @Override // defpackage.gsy
    public final defpackage.gso d(java.lang.String str, int i, java.util.List list) {
        return new defpackage.guc(this, str, i, list).a();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gsy
    public final defpackage.ajcq e(defpackage.ipc ipcVar) {
        androidx.work.impl.WorkDatabase workDatabase = this.e;
        defpackage.gou gouVar = this.k;
        defpackage.aooh.f(workDatabase, "<this>");
        defpackage.aooh.f(gouVar, "executor");
        defpackage.gxo gxoVar = new defpackage.gxo(ipcVar, 4);
        ?? r3 = gouVar.e;
        defpackage.aooh.e(r3, "getSerialTaskExecutor(...)");
        return defpackage.gus.x(r3, "loadStatusFuture", new defpackage.bev(gxoVar, workDatabase, 12));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.gsy
    public final defpackage.gso g(java.lang.String str, int i, defpackage.aogc aogcVar) {
        if (i != 3) {
            return new defpackage.guc(this, str, i != 2 ? 1 : 2, java.util.Collections.singletonList(aogcVar)).a();
        }
        if (str == null) {
            defpackage.aooh.i("name");
        }
        defpackage.gus gusVar = this.d.r;
        ?? r0 = this.k.e;
        defpackage.aooh.e(r0, "getSerialTaskExecutor(...)");
        return defpackage.gus.S(gusVar, "enqueueUniquePeriodic_".concat(java.lang.String.valueOf(str)), r0, new defpackage.dcg(this, str, aogcVar, 4));
    }

    public final void i() {
        synchronized (b) {
            this.h = true;
            android.content.BroadcastReceiver.PendingResult pendingResult = this.i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public final void j() {
        defpackage.gus gusVar = this.d.r;
        defpackage.gpg gpgVar = new defpackage.gpg(this, 11);
        boolean zM = da$.ExternalSyntheticApiModelOutline0.m();
        if (zM) {
            try {
                android.os.Trace.beginSection(defpackage.dzk.H("ReschedulingWork"));
            } finally {
                if (zM) {
                    android.os.Trace.endSection();
                }
            }
        }
        gpgVar.a();
    }

    public final void k(defpackage.gxd gxdVar, int i) {
        this.k.b(new gym(this.g, new defpackage.ipc(gxdVar), true, i));
    }
}
