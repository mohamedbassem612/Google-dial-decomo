package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zbm implements defpackage.zbn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/callingshared/cui/impl/InternalSemanticEventLogger");
    public static final defpackage.aenj b = new defpackage.aenj("");
    public final defpackage.aoss c;
    public final j$.util.concurrent.ConcurrentHashMap d;
    public final defpackage.zap e;
    public final defpackage.apdp f;
    public final defpackage.aazc g;
    public final defpackage.agqj h;
    public final defpackage.ahbv i;
    public final defpackage.zzx j;
    public final defpackage.zzx k;
    private final j$.util.Optional l;

    public zbm(defpackage.aoss aossVar, defpackage.aazc aazcVar, defpackage.agqj agqjVar, defpackage.zzx zzxVar, defpackage.ahbv ahbvVar, defpackage.zzx zzxVar2, j$.util.Optional optional) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (agqjVar == null) {
            defpackage.aooh.i("currentCuis");
        }
        if (ahbvVar == null) {
            defpackage.aooh.i("cuiImpressionsLogger");
        }
        if (optional == null) {
            defpackage.aooh.i("optionalCuiEventTracker");
        }
        this.c = aossVar;
        this.g = aazcVar;
        this.h = agqjVar;
        this.j = zzxVar;
        this.i = ahbvVar;
        this.k = zzxVar2;
        this.l = optional;
        this.f = new defpackage.apdp();
        this.d = new j$.util.concurrent.ConcurrentHashMap();
        if (optional == null) {
            defpackage.aooh.i("<this>");
        }
        this.e = (defpackage.zap) optional.orElse((java.lang.Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(defpackage.zat zatVar, defpackage.zba zbaVar, defpackage.zan zanVar, defpackage.aoln aolnVar) throws java.io.IOException {
        defpackage.zbb zbbVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof defpackage.zbb) {
            zbbVar = (defpackage.zbb) aolnVar;
            int i = zbbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbbVar.c = i - Integer.MIN_VALUE;
            } else {
                zbbVar = new defpackage.zbb(this, aolnVar);
            }
        } else {
            zbbVar = new defpackage.zbb(this, aolnVar);
        }
        java.lang.Object obj = zbbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zbbVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = zbbVar.d;
            try {
                defpackage.aooc.af(obj);
                defpackage.ajsz.ak(ahoqVar, null);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        defpackage.aooc.af(obj);
        defpackage.aenj aenjVar = zanVar.a;
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1208, aenjVar.a, defpackage.ahot.a, true);
        try {
            defpackage.agqj agqjVar = this.h;
            if (zatVar == null) {
                defpackage.aooh.i("key");
            }
            if (zanVar == null) {
                defpackage.aooh.i("semanticEventData");
            }
            java.util.Map mapH = agqjVar.h();
            defpackage.zao zaoVar = zatVar.a;
            defpackage.zjm zjmVar = (defpackage.zjm) mapH.get(zaoVar);
            if (zjmVar != null) {
                j$.util.Map.-EL.replaceAll((java.util.Map) zjmVar.b, new defpackage.zau(new defpackage.dkm(8), 0));
            }
            defpackage.zjm zjmVar2 = (defpackage.zjm) agqjVar.g().get(zaoVar);
            if (zjmVar2 != null) {
                j$.util.Map.-EL.replaceAll((java.util.Map) zjmVar2.a, new defpackage.zau(new defpackage.dkm(7), 1));
            }
            if (((java.lang.Long) ((j$.util.concurrent.ConcurrentHashMap) agqjVar.g).remove(zatVar)) == null) {
                ((defpackage.ahbv) agqjVar.h).d(defpackage.zbw.l, new defpackage.zav(java.lang.Integer.valueOf(zanVar.b)), zatVar.b);
            } else {
                ((defpackage.ahbv) agqjVar.h).d(defpackage.zbw.m, new defpackage.zax(java.lang.Integer.valueOf(zanVar.b), null, null), zatVar.b);
            }
            defpackage.zzx zzxVar = this.k;
            if (zatVar == null) {
                defpackage.aooh.i("configurationKey");
            }
            if (zbaVar == null) {
                defpackage.aooh.i("endState");
            }
            java.lang.String strN = defpackage.zzx.n(zatVar);
            java.lang.Object obj2 = zzxVar.a;
            zca zcaVar = new zca(strN);
            java.lang.String str = zatVar.b;
            ((defpackage.zzx) obj2).l(new zbx(zcaVar, str));
            da$.ExternalSyntheticApiModelOutline0.m(defpackage.zhr.a(strN), zatVar.hashCode());
            java.lang.String str2 = zaoVar.g + ' ' + zbaVar.e + ' ' + aenjVar;
            da$.ExternalSyntheticApiModelOutline0.m$1(defpackage.zhr.a(str2), aenjVar.hashCode());
            da$.ExternalSyntheticApiModelOutline0.m(defpackage.zhr.a(str2), aenjVar.hashCode());
            defpackage.aoub aoubVar = (defpackage.aoub) this.d.remove(zatVar);
            if (aoubVar != null) {
                zbbVar.d = ahoqVarX;
                zbbVar.c = 1;
                if (defpackage.aooc.T(aoubVar, zbbVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                this.i.d(defpackage.zbw.i, new defpackage.zav(new java.lang.Integer(zanVar.b)), str);
            }
            ahoqVar = ahoqVarX;
            defpackage.ajsz.ak(ahoqVar, null);
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarX;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final java.lang.Object b(defpackage.zat zatVar, long j, long j2, boolean z, defpackage.aoln aolnVar) throws java.io.IOException {
        zbe zbeVar;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        long j3;
        boolean z2;
        defpackage.apdp apdpVar;
        defpackage.zat zatVar2;
        long j4;
        java.io.Closeable closeable2;
        defpackage.zan zanVar;
        defpackage.apdp apdpVar2;
        java.io.Closeable closeable3;
        defpackage.zat zatVar3;
        java.io.Closeable closeable4;
        defpackage.zba zbaVar;
        java.lang.Throwable th2;
        java.io.Closeable closeable5;
        if (aolnVar instanceof zbe) {
            zbeVar = (zbe) aolnVar;
            int i = zbeVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbeVar.h = i - Integer.MIN_VALUE;
            } else {
                zbeVar = new zbe(this, aolnVar);
            }
        } else {
            zbeVar = new zbe(this, aolnVar);
        }
        zbe zbeVar2 = zbeVar;
        java.lang.Object obj = zbeVar2.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        defpackage.apdp apdpVar3 = zbeVar2.h;
        try {
            try {
                try {
                    try {
                        if (apdpVar3 == 0) {
                            defpackage.aooc.af(obj);
                            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1211, "InternalSemanticEventLogger_handleTimeout");
                            defpackage.apdp apdpVar4 = this.f;
                            zbeVar2.a = zatVar;
                            zbeVar2.b = ahoqVarW;
                            zbeVar2.j = apdpVar4;
                            j3 = j;
                            zbeVar2.c = j3;
                            zbeVar2.d = j2;
                            z2 = z;
                            zbeVar2.e = z2;
                            zbeVar2.h = 1;
                            if (apdpVar4.b(zbeVar2) == aoluVar) {
                                return aoluVar;
                            }
                            apdpVar = apdpVar4;
                            zatVar2 = zatVar;
                            j4 = j2;
                            closeable2 = ahoqVarW;
                        } else {
                            if (apdpVar3 != 1) {
                                if (apdpVar3 != 2) {
                                    if (apdpVar3 != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    apdpVar2 = (defpackage.apdp) zbeVar2.b;
                                    java.io.Closeable closeable6 = (java.io.Closeable) zbeVar2.a;
                                    defpackage.aooc.af(obj);
                                    closeable4 = closeable6;
                                    th2 = null;
                                    closeable5 = closeable4;
                                    apdpVar2.d();
                                    defpackage.ajsz.ak(closeable5, th2);
                                    return defpackage.aojh.a;
                                }
                                defpackage.zan zanVar2 = zbeVar2.i;
                                defpackage.apdp apdpVar5 = zbeVar2.j;
                                java.io.Closeable closeable7 = (java.io.Closeable) zbeVar2.b;
                                zatVar3 = (defpackage.zat) zbeVar2.a;
                                try {
                                    defpackage.aooc.af(obj);
                                    zanVar = zanVar2;
                                    apdpVar2 = apdpVar5;
                                    closeable3 = closeable7;
                                    zbaVar = defpackage.zba.TIMED_OUT;
                                    zbeVar2.a = closeable3;
                                    zbeVar2.b = apdpVar2;
                                    th2 = null;
                                    zbeVar2.j = null;
                                    zbeVar2.i = null;
                                    zbeVar2.h = 3;
                                    closeable5 = closeable3;
                                    if (a(zatVar3, zbaVar, zanVar, zbeVar2) == aoluVar) {
                                        return aoluVar;
                                    }
                                    apdpVar2.d();
                                    defpackage.ajsz.ak(closeable5, th2);
                                    return defpackage.aojh.a;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    apdpVar3 = apdpVar5;
                                    apdpVar3.d();
                                    throw th;
                                }
                            }
                            boolean z3 = zbeVar2.e;
                            long j5 = zbeVar2.d;
                            long j6 = zbeVar2.c;
                            apdpVar = zbeVar2.j;
                            java.io.Closeable closeable8 = (java.io.Closeable) zbeVar2.b;
                            zatVar2 = (defpackage.zat) zbeVar2.a;
                            defpackage.aooc.af(obj);
                            z2 = z3;
                            j4 = j5;
                            j3 = j6;
                            closeable2 = closeable8;
                        }
                        defpackage.zan zanVarE = this.h.e(zatVar2.a, defpackage.zak.b);
                        if (!z2) {
                            this.i.d(defpackage.zbw.j, new defpackage.zav(zanVarE != null ? new java.lang.Integer(zanVarE.b) : null), zatVar2.b);
                            apdpVar2 = apdpVar;
                            closeable4 = closeable2;
                            th2 = null;
                            closeable5 = closeable4;
                            apdpVar2.d();
                            defpackage.ajsz.ak(closeable5, th2);
                            return defpackage.aojh.a;
                        }
                        if (zanVarE == null) {
                            throw new java.lang.IllegalStateException("Should not have returned null semantic event data for common error.");
                        }
                        defpackage.ahbv ahbvVar = this.i;
                        defpackage.zbw zbwVar = defpackage.zbw.k;
                        defpackage.zax zaxVar = new defpackage.zax(new java.lang.Integer(zanVarE.b), null, null);
                        java.lang.String str = zatVar2.b;
                        ahbvVar.d(zbwVar, zaxVar, str);
                        long j7 = j4;
                        defpackage.zar zarVar = zanVarE.d;
                        zbeVar2.a = zatVar2;
                        zbeVar2.b = closeable2;
                        zbeVar2.j = apdpVar;
                        zbeVar2.i = zanVarE;
                        zbeVar2.h = 2;
                        zanVar = zanVarE;
                        if (e(zanVar, j3, j7, zarVar, str) == aoluVar) {
                            return aoluVar;
                        }
                        apdpVar2 = apdpVar;
                        closeable3 = closeable2;
                        zatVar3 = zatVar2;
                        zbaVar = defpackage.zba.TIMED_OUT;
                        zbeVar2.a = closeable3;
                        zbeVar2.b = apdpVar2;
                        th2 = null;
                        zbeVar2.j = null;
                        zbeVar2.i = null;
                        zbeVar2.h = 3;
                        closeable5 = closeable3;
                        if (a(zatVar3, zbaVar, zanVar, zbeVar2) == aoluVar) {
                            return aoluVar;
                        }
                        apdpVar2.d();
                        defpackage.ajsz.ak(closeable5, th2);
                        return defpackage.aojh.a;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        apdpVar3 = apdpVar;
                        apdpVar3.d();
                        throw th;
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    closeable = 2;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th6) {
                        defpackage.ajsz.ak(closeable, th);
                        throw th6;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                closeable = closeable2;
                throw th;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
    }

    public final void c(java.lang.Enum r8, defpackage.aonj aonjVar) throws java.io.IOException {
        if (r8 == null) {
            defpackage.ajcq ajcqVarC = defpackage.aosv.C(defpackage.aoov.am(this.c, 4, new zbk(this, aonjVar, (defpackage.aoln) null), 1));
            defpackage.agsm.i(1214, ajcqVarC, "Sequencing future failed.", new java.lang.Object[0]);
            this.i.e(defpackage.zbw.n, defpackage.zbw.o, ajcqVarC);
            return;
        }
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1215, r8.name(), defpackage.ahot.a, true);
        try {
            defpackage.ajcq ajcqVarC2 = defpackage.aosv.C(defpackage.aoov.am(this.c, 4, new defpackage.zbj(this, aonjVar, (defpackage.aoln) null, 0), 1));
            ahoqVarX.a(ajcqVarC2);
            defpackage.agsm.i(1216, ajcqVarC2, "Sequencing future failed.", new java.lang.Object[0]);
            this.i.e(defpackage.zbw.n, defpackage.zbw.o, ajcqVarC2);
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.zbn
    public final void d(java.lang.Throwable th) throws java.io.IOException {
        defpackage.aooh.f(th, "ex");
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1212, "InternalSemanticEventLogger_handleUncaughtException");
        try {
            c(null, new zbf(this, android.os.SystemClock.elapsedRealtime(), th, (defpackage.aoln) null, 0));
            defpackage.ajsz.ak(ahoqVarW, null);
        } catch (java.lang.Throwable th2) {
            try {
                throw th2;
            } catch (java.lang.Throwable th3) {
                defpackage.ajsz.ak(ahoqVarW, th2);
                throw th3;
            }
        }
    }

    public final java.lang.Object e(defpackage.zan zanVar, long j, long j2, defpackage.zar zarVar, java.lang.String str) throws java.io.IOException {
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1213, zarVar.name(), defpackage.ahot.a, true);
        try {
            java.lang.Boolean.TRUE.booleanValue();
            defpackage.zzx zzxVar = this.j;
            int i = zanVar.b;
            defpackage.aenj aenjVar = zanVar.a;
            zzxVar.l(new defpackage.zbu(i, aenjVar, zarVar, j, j2, str));
            if (zarVar != defpackage.zar.OK) {
                ((defpackage.aimw) a.b().l("com/google/android/callingshared/cui/impl/InternalSemanticEventLogger", "logSemanticEvent$<anonymous>", 340, "InternalSemanticEventLogger.kt")).I("Emitted failed CUI completion event for %s with result %s", aenjVar, zarVar.name());
            }
            ahoqVarX.close();
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahoqVarX.close();
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.zat zatVar, defpackage.mce mceVar, java.lang.String str, defpackage.aoln aolnVar) {
        defpackage.zbg zbgVar;
        if (aolnVar instanceof defpackage.zbg) {
            zbgVar = (defpackage.zbg) aolnVar;
            int i = zbgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbgVar.c = i - Integer.MIN_VALUE;
            } else {
                zbgVar = new defpackage.zbg(this, aolnVar);
            }
        } else {
            zbgVar = new defpackage.zbg(this, aolnVar);
        }
        java.lang.Object obj = zbgVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zbgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.zao zaoVar = zatVar.a;
            if (!zaoVar.a.contains(mceVar)) {
                return java.lang.Boolean.FALSE;
            }
            this.i.d(defpackage.zbw.d, new defpackage.zax(null, mceVar, null), str);
            defpackage.agqj agqjVar = this.h;
            defpackage.zba zbaVar = defpackage.zba.CANCELLED;
            defpackage.zan zanVarD = agqjVar.d(zaoVar);
            zbgVar.d = zatVar;
            zbgVar.c = 1;
            if (a(zatVar, zbaVar, zanVarD, zbgVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zatVar = zbgVar.d;
            defpackage.aooc.af(obj);
        }
        ((defpackage.aimw) a.b().l("com/google/android/callingshared/cui/impl/InternalSemanticEventLogger", "processPotentialCancelEvent", 221, "InternalSemanticEventLogger.kt")).y("Cancelled CUI %s due to cancelEvent", this.h.d(zatVar.a).a);
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Set] */
    public final java.lang.Object g(defpackage.zat zatVar, java.lang.String str, long j, defpackage.mce mceVar, long j2, defpackage.aoln aolnVar) {
        defpackage.zbh zbhVar;
        defpackage.zan zanVar;
        defpackage.zan zanVar2;
        defpackage.zat zatVar2 = zatVar;
        if (aolnVar instanceof defpackage.zbh) {
            zbhVar = (defpackage.zbh) aolnVar;
            int i = zbhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zbhVar.c = i - Integer.MIN_VALUE;
            } else {
                zbhVar = new defpackage.zbh(this, aolnVar);
            }
        } else {
            zbhVar = new defpackage.zbh(this, aolnVar);
        }
        defpackage.zbh zbhVar2 = zbhVar;
        java.lang.Object obj = zbhVar2.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = zbhVar2.c;
        if (i2 != 0) {
            if (i2 == 1) {
                zanVar2 = zbhVar2.e;
                defpackage.zat zatVar3 = zbhVar2.d;
                defpackage.aooc.af(obj);
                zatVar2 = zatVar3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return java.lang.Boolean.TRUE;
        }
        defpackage.aooc.af(obj);
        defpackage.agqj agqjVar = this.h;
        defpackage.zao zaoVar = zatVar2.a;
        if (mceVar == null) {
            defpackage.aooh.i("endEvent");
        }
        defpackage.zjm zjmVar = (defpackage.zjm) agqjVar.h().get(zaoVar);
        if (zjmVar != null) {
            java.util.Iterator it = zjmVar.a.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    zanVar = null;
                    break;
                }
                defpackage.zam zamVar = (defpackage.zam) it.next();
                java.util.Set set = zamVar.a;
                java.util.ArrayList arrayList = new java.util.ArrayList(set.size());
                java.util.Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList.add((java.lang.Boolean) zjmVar.b.get((defpackage.mce) it2.next()));
                }
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!defpackage.aooh.n((java.lang.Boolean) it3.next(), java.lang.Boolean.TRUE)) {
                            }
                        }
                    }
                }
                zanVar = zamVar.b;
                break loop0;
            }
            if (zanVar == null) {
                zanVar = (defpackage.zan) zaoVar.b.get(mceVar);
            }
        } else {
            zanVar = (defpackage.zan) zaoVar.b.get(mceVar);
        }
        if (zanVar == null) {
            return java.lang.Boolean.FALSE;
        }
        this.i.d(defpackage.zbw.c, new defpackage.zax(new java.lang.Integer(zanVar.b), mceVar, null), str);
        java.lang.String str2 = zatVar2.b;
        defpackage.zar zarVar = defpackage.zar.OK;
        java.lang.String strBL = defpackage.afsq.bL(str2, str);
        zbhVar2.d = zatVar2;
        zbhVar2.e = zanVar;
        zbhVar2.c = 1;
        zanVar2 = zanVar;
        if (e(zanVar2, j2, j, zarVar, strBL) == obj2) {
            return obj2;
        }
        defpackage.zba zbaVar = defpackage.zba.VALID;
        zbhVar2.d = null;
        zbhVar2.e = null;
        zbhVar2.c = 2;
        if (a(zatVar2, zbaVar, zanVar2, zbhVar2) == obj2) {
            return obj2;
        }
        return java.lang.Boolean.TRUE;
    }
}
