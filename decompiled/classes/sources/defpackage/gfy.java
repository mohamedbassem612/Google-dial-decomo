package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gfy {
    public defpackage.aoss a;
    public defpackage.aolr b;
    public java.util.concurrent.Executor c;
    public java.util.concurrent.Executor d;
    public defpackage.gfn e;
    public boolean f;
    public defpackage.ghh g;
    public defpackage.maw k;
    public final defpackage.rsr l = new defpackage.rsr((byte[]) null, (byte[]) null);
    public final java.lang.ThreadLocal h = new java.lang.ThreadLocal();
    public final java.util.Map i = new java.util.LinkedHashMap();
    public boolean j = true;

    private final java.lang.Object x(defpackage.aomy aomyVar) {
        if (!r()) {
            return defpackage.dez.m(this, false, true, new fxs(aomyVar, 7));
        }
        n();
        try {
            java.lang.Object objA = aomyVar.a();
            q();
            return objA;
        } finally {
            o();
        }
    }

    protected abstract defpackage.gfn a();

    public final defpackage.gfn b() {
        defpackage.gfn gfnVar = this.e;
        if (gfnVar != null) {
            return gfnVar;
        }
        defpackage.aooh.j("internalTracker");
        return null;
    }

    protected defpackage.ggb c() {
        throw new defpackage.aoit("An operation is not implemented.");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [git, java.lang.Object] */
    public final defpackage.git d() {
        defpackage.maw mawVar = this.k;
        if (mawVar == null) {
            defpackage.aooh.j("connectionManager");
            mawVar = null;
        }
        ?? r1 = mawVar.c;
        if (r1 != 0) {
            return r1;
        }
        throw new java.lang.IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final java.lang.Object e(java.util.concurrent.Callable callable) {
        return x(new defpackage.ghb(callable, 1));
    }

    public java.util.List f(java.util.Map map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(defpackage.aooc.I((defpackage.aopu) entry.getKey()), entry.getValue());
        }
        return v();
    }

    protected java.util.Map g() {
        java.util.Set<java.util.Map.Entry> setEntrySet = h().entrySet();
        int iAL = defpackage.ajsz.aL(defpackage.ajsz.bl(setEntrySet, 10));
        if (iAL < 16) {
            iAL = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iAL);
        for (java.util.Map.Entry entry : setEntrySet) {
            java.lang.Class cls = (java.lang.Class) entry.getKey();
            java.util.List<java.lang.Class> list = (java.util.List) entry.getValue();
            if (cls == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
            defpackage.aooa aooaVar = new defpackage.aooa(cls);
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            for (java.lang.Class cls2 : list) {
                if (cls2 == null) {
                    defpackage.aooh.i("<this>");
                }
                arrayList.add(new defpackage.aooa(cls2));
            }
            defpackage.aoiu aoiuVar = new defpackage.aoiu(aooaVar, arrayList);
            linkedHashMap.put(aoiuVar.a, aoiuVar.b);
        }
        return linkedHashMap;
    }

    protected java.util.Map h() {
        return defpackage.aokd.a;
    }

    public java.util.Set i() {
        java.util.Set<java.lang.Class> setJ = j();
        java.util.ArrayList arrayList = new java.util.ArrayList(setJ.size());
        for (java.lang.Class cls : setJ) {
            if (cls == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
            arrayList.add(new defpackage.aooa(cls));
        }
        return defpackage.ajsz.cf(arrayList);
    }

    public java.util.Set j() {
        return defpackage.aoke.a;
    }

    public final defpackage.aolr k() {
        defpackage.aoss aossVar = this.a;
        if (aossVar == null) {
            defpackage.aooh.j("coroutineScope");
            aossVar = null;
        }
        return ((defpackage.apbj) aossVar).a;
    }

    public final defpackage.aoss l() {
        defpackage.aoss aossVar = this.a;
        if (aossVar != null) {
            return aossVar;
        }
        defpackage.aooh.j("coroutineScope");
        return null;
    }

    public final void m() {
        if (!this.f && android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            throw new java.lang.IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void n() {
        m();
        m();
        defpackage.gip gipVarB = d().b();
        if (!gipVarB.l()) {
            defpackage.dez.q(new defpackage.dgz(b(), (defpackage.aoln) null, 5));
        }
        if (gipVarB.n()) {
            gipVarB.f();
        } else {
            gipVarB.e();
        }
    }

    public final void o() {
        d().b().i();
        if (s()) {
            return;
        }
        defpackage.gfn gfnVarB = b();
        gfnVarB.c.f(gfnVarB.h, gfnVarB.i);
    }

    public final void p(java.lang.Runnable runnable) {
        x(new defpackage.ddw(runnable, 20));
    }

    public final void q() {
        d().b().k();
    }

    public final boolean r() {
        defpackage.maw mawVar = this.k;
        if (mawVar == null) {
            defpackage.aooh.j("connectionManager");
            mawVar = null;
        }
        return mawVar.c != null;
    }

    public final boolean s() {
        return t() && d().b().l();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gip, java.lang.Object] */
    public final boolean t() {
        defpackage.ghh ghhVar = this.g;
        if (ghhVar != null) {
            defpackage.gip gipVar = ghhVar.h;
            if (gipVar != null) {
                return gipVar.m();
            }
        } else {
            defpackage.maw mawVar = this.k;
            if (mawVar == null) {
                defpackage.aooh.j("connectionManager");
                mawVar = null;
            }
            ?? r1 = mawVar.d;
            if (r1 != 0) {
                return r1.m();
            }
        }
        return false;
    }

    public final void u(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.gfn gfnVarB = b();
        defpackage.ggq ggqVar = gfnVarB.c;
        defpackage.gin ginVarA = gjhVar.a("PRAGMA query_only");
        try {
            ginVarA.m();
            boolean zO = ginVarA.o();
            ginVarA.close();
            if (!zO) {
                defpackage.gin ginVarA2 = gjhVar.a("PRAGMA temp_store = MEMORY");
                try {
                    ginVarA2.m();
                    ginVarA2.close();
                    defpackage.gin ginVarA3 = gjhVar.a("PRAGMA recursive_triggers = 1");
                    try {
                        ginVarA3.m();
                        ginVarA3.close();
                        defpackage.gin ginVarA4 = gjhVar.a("DROP TABLE IF EXISTS room_table_modification_log");
                        try {
                            ginVarA4.m();
                            ginVarA4.close();
                            if (ggqVar.c) {
                                defpackage.gin ginVarA5 = gjhVar.a("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                                try {
                                    ginVarA5.m();
                                    ginVarA5.close();
                                } catch (java.lang.Throwable th) {
                                    try {
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        try {
                                            ginVarA5.close();
                                        } catch (java.lang.Throwable th3) {
                                            aoil.b(th, th3);
                                        }
                                        throw th2;
                                    }
                                }
                            } else {
                                defpackage.dzk.M(gjhVar, defpackage.aoov.Q("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                            }
                            defpackage.gfq gfqVar = ggqVar.e;
                            java.util.concurrent.locks.ReentrantLock reentrantLock = gfqVar.a;
                            reentrantLock.lock();
                            try {
                                gfqVar.d = true;
                                reentrantLock.unlock();
                            } catch (java.lang.Throwable th4) {
                                reentrantLock.unlock();
                                throw th4;
                            }
                        } catch (java.lang.Throwable th5) {
                            try {
                                throw th5;
                            } catch (java.lang.Throwable th6) {
                                try {
                                    ginVarA4.close();
                                } catch (java.lang.Throwable th7) {
                                    aoil.b(th5, th7);
                                }
                                throw th6;
                            }
                        }
                    } catch (java.lang.Throwable th8) {
                        try {
                            throw th8;
                        } catch (java.lang.Throwable th9) {
                            try {
                                ginVarA3.close();
                            } catch (java.lang.Throwable th10) {
                                aoil.b(th8, th10);
                            }
                            throw th9;
                        }
                    }
                } catch (java.lang.Throwable th11) {
                    try {
                        throw th11;
                    } catch (java.lang.Throwable th12) {
                        try {
                            ginVarA2.close();
                        } catch (java.lang.Throwable th13) {
                            aoil.b(th11, th13);
                        }
                        throw th12;
                    }
                }
            }
            synchronized (gfnVarB.j) {
                hgu hguVar = gfnVarB.k;
            }
        } catch (java.lang.Throwable th14) {
            try {
                throw th14;
            } catch (java.lang.Throwable th15) {
                try {
                    ginVarA.close();
                } catch (java.lang.Throwable th16) {
                    aoil.b(th14, th16);
                }
                throw th15;
            }
        }
    }

    public java.util.List v() {
        return defpackage.aokc.a;
    }

    public final java.lang.Object w(defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        defpackage.maw mawVar = this.k;
        if (mawVar == null) {
            defpackage.aooh.j("connectionManager");
            mawVar = null;
        }
        defpackage.ghc ghcVar = (defpackage.ghc) aolnVar.u().get(defpackage.ghc.b);
        defpackage.gha ghaVar = ghcVar != null ? ghcVar.a : null;
        if (ghaVar != null) {
            return aonnVar.a(ghaVar, aolnVar);
        }
        defpackage.ghd ghdVar = (defpackage.ghd) mawVar.f;
        defpackage.gha ghaVar2 = new defpackage.gha(ghdVar.b, (defpackage.gjh) ghdVar.c.a());
        return defpackage.aoov.aj(new defpackage.ghc(ghaVar2), new defpackage.bur(aonnVar, ghaVar2, (defpackage.aoln) null, 12), aolnVar);
    }
}
