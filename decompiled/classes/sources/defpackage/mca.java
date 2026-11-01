package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mca implements defpackage.zbn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/cui/impl/InternalSemanticEventLogger");
    public static final defpackage.aenj b = new defpackage.aenj("");
    public final defpackage.aoss c;
    public final defpackage.mbl d;
    public final defpackage.aoin e;
    public final j$.util.concurrent.ConcurrentHashMap f;
    public final defpackage.zap g;
    public final defpackage.apdp h;
    public final defpackage.adak i;
    public final defpackage.aazc j;
    public final defpackage.kaw k;
    public final defpackage.kaw l;
    private final j$.util.Optional m;
    private final j$.util.Optional n;
    private final defpackage.acxg o;
    private final defpackage.ipc p;

    public mca(defpackage.aoss aossVar, defpackage.aazc aazcVar, defpackage.mbl mblVar, defpackage.acxg acxgVar, defpackage.aoin aoinVar, j$.util.Optional optional, defpackage.ipc ipcVar, defpackage.adak adakVar, j$.util.Optional optional2, defpackage.kaw kawVar, defpackage.kaw kawVar2) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (mblVar == null) {
            defpackage.aooh.i("currentCuis");
        }
        if (acxgVar == null) {
            defpackage.aooh.i("semanticLogger");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("cuiTimeoutMillis");
        }
        if (optional == null) {
            defpackage.aooh.i("cuiMetadataFactory");
        }
        if (adakVar == null) {
            defpackage.aooh.i("cuiImpressionsLogger");
        }
        if (optional2 == null) {
            defpackage.aooh.i("optionalCuiEventTracker");
        }
        this.c = aossVar;
        this.j = aazcVar;
        this.d = mblVar;
        this.o = acxgVar;
        this.e = aoinVar;
        this.m = optional;
        this.p = ipcVar;
        this.i = adakVar;
        this.n = optional2;
        this.l = kawVar;
        this.k = kawVar2;
        this.h = new defpackage.apdp();
        this.f = new j$.util.concurrent.ConcurrentHashMap();
        if (optional2 == null) {
            defpackage.aooh.i("<this>");
        }
        this.g = (defpackage.zap) optional2.orElse((java.lang.Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(mbb mbbVar, mbk mbkVar, defpackage.zan zanVar, defpackage.aoln aolnVar) throws java.io.IOException {
        mbt mbtVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof mbt) {
            mbtVar = (mbt) aolnVar;
            int i = mbtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbtVar.c = i - Integer.MIN_VALUE;
            } else {
                mbtVar = new mbt(this, aolnVar);
            }
        } else {
            mbtVar = new mbt(this, aolnVar);
        }
        java.lang.Object obj = mbtVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mbtVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = mbtVar.d;
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
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(335, aenjVar.a, defpackage.ahot.a, true);
        try {
            defpackage.mbl mblVar = this.d;
            defpackage.aooh.f(mbbVar, "key");
            defpackage.aooh.f(zanVar, "semanticEventData");
            java.util.Map mapE = mblVar.e();
            defpackage.zao zaoVar = mbbVar.a;
            pgi pgiVar = (pgi) mapE.get(zaoVar);
            if (pgiVar != null) {
                j$.util.Map.-EL.replaceAll((java.util.Map) pgiVar.a, new mbc(new fxb(17), 0));
            }
            pgi pgiVar2 = (pgi) mblVar.d().get(zaoVar);
            if (pgiVar2 != null) {
                j$.util.Map.-EL.replaceAll((java.util.Map) pgiVar2.a, new mbc(new fxb(16), 1));
            }
            if (((java.lang.Long) mblVar.c.remove(mbbVar)) == null) {
                mblVar.e.d(mbd.l, new mbf(java.lang.Integer.valueOf(zanVar.b)), mbbVar.b);
            } else {
                mblVar.e.d(mbd.m, new mbi(java.lang.Integer.valueOf(zanVar.b), (defpackage.mce) null, (defpackage.zal) null), mbbVar.b);
            }
            defpackage.kaw kawVar = this.k;
            defpackage.aooh.f(mbbVar, "configurationKey");
            defpackage.aooh.f(mbkVar, "endState");
            java.lang.String strV = defpackage.kaw.V(mbbVar);
            java.lang.Object obj2 = kawVar.a;
            java.lang.String str = mbbVar.b;
            ((defpackage.kaw) obj2).X(strV, str);
            defpackage.zhr.c(strV, mbbVar.hashCode());
            java.lang.String str2 = zaoVar.g + ' ' + mbkVar.e + ' ' + aenjVar;
            defpackage.zhr.b(str2, aenjVar.hashCode());
            defpackage.zhr.c(str2, aenjVar.hashCode());
            defpackage.aoub aoubVar = (defpackage.aoub) this.f.remove(mbbVar);
            if (aoubVar != null) {
                mbtVar.d = ahoqVarX;
                mbtVar.c = 1;
                if (defpackage.aooc.T(aoubVar, mbtVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                this.i.d(mbd.i, new mbf(new java.lang.Integer(zanVar.b)), str);
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

    /* JADX WARN: Code duplicated, block: B:48:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object b(mbb mbbVar, long j, long j2, boolean z, defpackage.aoln aolnVar) throws java.io.IOException {
        mbv mbvVar;
        java.lang.Throwable th;
        mbv mbvVarW;
        defpackage.apdp apdpVar;
        long j3;
        long j4;
        mbb mbbVar2;
        boolean z2;
        defpackage.apdp apdpVar2;
        defpackage.mca mcaVar;
        defpackage.zan zanVar;
        mbv mbvVar2;
        mbb mbbVar3;
        mbv mbvVar3;
        mbk mbkVar;
        java.lang.Throwable th2;
        if (aolnVar instanceof mbv) {
            mbvVar = (mbv) aolnVar;
            int i = mbvVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbvVar.h = i - Integer.MIN_VALUE;
            } else {
                mbvVar = new mbv(this, aolnVar);
            }
        } else {
            mbvVar = new mbv(this, aolnVar);
        }
        java.lang.Object obj = mbvVar.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mbvVar.h;
        try {
            try {
                try {
                    if (i2 == 0) {
                        defpackage.aooc.af(obj);
                        mbvVarW = defpackage.ahvr.W(338, "InternalSemanticEventLogger_handleTimeout");
                        apdpVar = this.h;
                        mbvVar.a = mbbVar;
                        mbvVar.b = mbvVarW;
                        mbvVar.j = apdpVar;
                        j3 = j;
                        mbvVar.c = j3;
                        j4 = j2;
                        mbvVar.d = j4;
                        mbvVar.e = z;
                        mbvVar.h = 1;
                        if (apdpVar.b(mbvVar) == aoluVar) {
                            return aoluVar;
                        }
                        mbbVar2 = mbbVar;
                        z2 = z;
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                zanVar = mbvVar.i;
                                defpackage.apdp apdpVar3 = mbvVar.j;
                                mbv mbvVar4 = (java.io.Closeable) mbvVar.b;
                                mbbVar3 = (mbb) mbvVar.a;
                                try {
                                    defpackage.aooc.af(obj);
                                    mbvVar2 = mbvVar;
                                    apdpVar = apdpVar3;
                                    mbvVarW = mbvVar4;
                                    mcaVar = this;
                                    mbkVar = mbk.b;
                                    mbvVar2.a = mbvVarW;
                                    mbvVar2.b = apdpVar;
                                    th2 = null;
                                    mbvVar2.j = null;
                                    mbvVar2.i = null;
                                    mbvVar2.h = 3;
                                    if (mcaVar.a(mbbVar3, mbkVar, zanVar, mbvVar2) != aoluVar) {
                                        return aoluVar;
                                    }
                                    apdpVar2 = apdpVar;
                                    mbvVar3 = mbvVarW;
                                    apdpVar2.d();
                                    defpackage.ajsz.ak(mbvVar3, th2);
                                    return defpackage.aojh.a;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    apdpVar2 = apdpVar3;
                                }
                            } else {
                                if (i2 != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                apdpVar2 = (defpackage.apdp) mbvVar.b;
                                mbvVar3 = (java.io.Closeable) mbvVar.a;
                                try {
                                    defpackage.aooc.af(obj);
                                    th2 = null;
                                    apdpVar2.d();
                                    defpackage.ajsz.ak(mbvVar3, th2);
                                    return defpackage.aojh.a;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                }
                            }
                            apdpVar2.d();
                            throw th;
                        }
                        z2 = mbvVar.e;
                        long j5 = mbvVar.d;
                        long j6 = mbvVar.c;
                        defpackage.apdp apdpVar4 = mbvVar.j;
                        mbvVarW = (java.io.Closeable) mbvVar.b;
                        mbbVar2 = (mbb) mbvVar.a;
                        defpackage.aooc.af(obj);
                        j4 = j5;
                        j3 = j6;
                        apdpVar = apdpVar4;
                    }
                    defpackage.zan zanVarB = this.d.b(mbbVar2.a, defpackage.zak.b);
                    if (!z2) {
                        this.i.d(mbd.j, new mbf(zanVarB != null ? new java.lang.Integer(zanVarB.b) : null), mbbVar2.b);
                        apdpVar2 = apdpVar;
                        mbvVar3 = mbvVarW;
                        th2 = null;
                        apdpVar2.d();
                        defpackage.ajsz.ak(mbvVar3, th2);
                        return defpackage.aojh.a;
                    }
                    if (zanVarB == null) {
                        throw new java.lang.IllegalStateException("Should not have returned null semantic event data for common error.");
                    }
                    defpackage.adak adakVar = this.i;
                    mbd mbdVar = mbd.k;
                    mbi mbiVar = new mbi(new java.lang.Integer(zanVarB.b), (defpackage.mce) null, (defpackage.zal) null);
                    java.lang.String str = mbbVar2.b;
                    adakVar.d(mbdVar, mbiVar, str);
                    defpackage.zar zarVar = zanVarB.d;
                    mbvVar.a = mbbVar2;
                    mbvVar.b = mbvVarW;
                    mbvVar.j = apdpVar;
                    mbvVar.i = zanVarB;
                    mbvVar.h = 2;
                    mbv mbvVar5 = mbvVar;
                    java.lang.Object objC = c(zanVarB, j4 - j3, zarVar, str, mbvVar5);
                    mcaVar = this;
                    zanVar = zanVarB;
                    mbvVar2 = mbvVar5;
                    if (objC == aoluVar) {
                        return aoluVar;
                    }
                    mbbVar3 = mbbVar2;
                    mbkVar = mbk.b;
                    mbvVar2.a = mbvVarW;
                    mbvVar2.b = apdpVar;
                    th2 = null;
                    mbvVar2.j = null;
                    mbvVar2.i = null;
                    mbvVar2.h = 3;
                    if (mcaVar.a(mbbVar3, mbkVar, zanVar, mbvVar2) != aoluVar) {
                        return aoluVar;
                    }
                    apdpVar2 = apdpVar;
                    mbvVar3 = mbvVarW;
                    apdpVar2.d();
                    defpackage.ajsz.ak(mbvVar3, th2);
                    return defpackage.aojh.a;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    apdpVar2 = apdpVar;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                mbvVarW = mbvVar;
                try {
                    throw th;
                } catch (java.lang.Throwable th7) {
                    defpackage.ajsz.ak(mbvVarW, th);
                    throw th7;
                }
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a2 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #0 {all -> 0x00c6, blocks: (B:12:0x002d, B:22:0x0089, B:24:0x008d, B:27:0x0095, B:29:0x00a2), top: B:40:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.zan zanVar, long j, defpackage.zar zarVar, java.lang.String str, defpackage.aoln aolnVar) throws java.io.IOException {
        mbw mbwVar;
        defpackage.ahoq ahoqVar;
        defpackage.afab afabVar;
        defpackage.zar zarVar2;
        defpackage.zan zanVar2;
        defpackage.afab afabVar2;
        if (aolnVar instanceof mbw) {
            mbwVar = (mbw) aolnVar;
            int i = mbwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbwVar.c = i - Integer.MIN_VALUE;
            } else {
                mbwVar = new mbw(this, aolnVar);
            }
        } else {
            mbwVar = new mbw(this, aolnVar);
        }
        java.lang.Object obj = mbwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mbwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ahoq ahoqVarV = defpackage.ahvr.V(340, zarVar);
            try {
                defpackage.aoin aoinVar = zanVar.c;
                java.lang.Boolean.TRUE.booleanValue();
                int i3 = zanVar.b;
                afabVar = new defpackage.afab();
                afabVar.a = i3;
                afabVar.e(defpackage.abrz.h());
                j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(j);
                defpackage.aooh.e(durationOfMillis, "ofMillis(...)");
                afabVar.d(defpackage.gus.aE(zarVar, durationOfMillis));
                defpackage.kaw kawVar = (defpackage.kaw) defpackage.aooh.q(this.m);
                if (kawVar != null) {
                    mbwVar.d = zanVar;
                    mbwVar.e = zarVar;
                    mbwVar.f = ahoqVarV;
                    mbwVar.g = afabVar;
                    mbwVar.c = 1;
                    java.lang.Object objU = kawVar.U(str, mbwVar);
                    if (objU == aoluVar) {
                        return aoluVar;
                    }
                    obj = objU;
                    ahoqVar = ahoqVarV;
                    zarVar2 = zarVar;
                    zanVar2 = zanVar;
                    afabVar2 = afabVar;
                } else {
                    ahoqVar = ahoqVarV;
                }
                this.o.e(afabVar.j());
                if (zarVar != defpackage.zar.OK) {
                    ((defpackage.aimw) a.b().l("com/android/dialer/cui/impl/InternalSemanticEventLogger", "logSemanticEvent$<anonymous>", 342, "InternalSemanticEventLogger.kt")).I("Logging failed CUI %s with result %s to GIL", zanVar.a, zarVar.name());
                }
                defpackage.ajsz.ak(ahoqVar, null);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th) {
                th = th;
                ahoqVar = ahoqVarV;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        afabVar2 = mbwVar.g;
        ahoqVar = mbwVar.f;
        zarVar2 = mbwVar.e;
        zanVar2 = mbwVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (java.lang.Throwable th3) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th3;
            }
        }
        defpackage.acme acmeVar = (defpackage.acme) obj;
        if (acmeVar != null) {
            afabVar2.d(acmeVar);
        }
        afabVar = afabVar2;
        zanVar = zanVar2;
        zarVar = zarVar2;
        this.o.e(afabVar.j());
        if (zarVar != defpackage.zar.OK) {
            ((defpackage.aimw) a.b().l("com/android/dialer/cui/impl/InternalSemanticEventLogger", "logSemanticEvent$<anonymous>", 342, "InternalSemanticEventLogger.kt")).I("Logging failed CUI %s with result %s to GIL", zanVar.a, zarVar.name());
        }
        defpackage.ajsz.ak(ahoqVar, null);
        return defpackage.aojh.a;
    }

    @Override // defpackage.zbn
    public final void d(java.lang.Throwable th) throws java.io.IOException {
        defpackage.aooh.f(th, "ex");
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(339, "InternalSemanticEventLogger_handleUncaughtException");
        try {
            e(null, new zbf(this, android.os.SystemClock.elapsedRealtime(), th, (defpackage.aoln) null, 1));
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

    public final void e(java.lang.Enum r11, defpackage.aonj aonjVar) throws java.io.IOException {
        if (r11 == null) {
            defpackage.ajcq ajcqVarC = defpackage.aosv.C(defpackage.aoov.am(this.c, 4, new kem(this, aonjVar, (defpackage.aoln) null, 4, (byte[]) null), 1));
            defpackage.agsm.i(341, ajcqVarC, "Sequencing future failed.", new java.lang.Object[0]);
            this.i.e(defpackage.rmx.CUI_INFRA_SEQUENCE_FUTURE_FAILED, defpackage.rmx.CUI_INFRA_SEQUENCE_FUTURE_CANCELED, ajcqVarC);
            return;
        }
        defpackage.ahoq ahoqVarV = defpackage.ahvr.V(342, r11);
        try {
            defpackage.ajcq ajcqVarC2 = defpackage.aosv.C(defpackage.aoov.am(this.c, 4, new kem(this, aonjVar, (defpackage.aoln) null, 3), 1));
            ahoqVarV.a(ajcqVarC2);
            defpackage.agsm.i(343, ajcqVarC2, "Sequencing future failed.", new java.lang.Object[0]);
            this.i.e(defpackage.rmx.CUI_INFRA_SEQUENCE_FUTURE_FAILED, defpackage.rmx.CUI_INFRA_SEQUENCE_FUTURE_CANCELED, ajcqVarC2);
            defpackage.ajsz.ak(ahoqVarV, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahoqVarV, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(mbb mbbVar, defpackage.mce mceVar, java.lang.String str, defpackage.aoln aolnVar) {
        mbx mbxVar;
        if (aolnVar instanceof mbx) {
            mbxVar = (mbx) aolnVar;
            int i = mbxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbxVar.c = i - Integer.MIN_VALUE;
            } else {
                mbxVar = new mbx(this, aolnVar);
            }
        } else {
            mbxVar = new mbx(this, aolnVar);
        }
        java.lang.Object obj = mbxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mbxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.zao zaoVar = mbbVar.a;
            if (!zaoVar.a.contains(mceVar)) {
                return java.lang.Boolean.FALSE;
            }
            this.i.d(mbd.d, new mbi((java.lang.Integer) null, mceVar, (defpackage.zal) null), str);
            defpackage.mbl mblVar = this.d;
            mbk mbkVar = mbk.c;
            defpackage.zan zanVarA = mblVar.a(zaoVar);
            mbxVar.d = mbbVar;
            mbxVar.c = 1;
            if (a(mbbVar, mbkVar, zanVarA, mbxVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mbbVar = mbxVar.d;
            defpackage.aooc.af(obj);
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/cui/impl/InternalSemanticEventLogger", "processPotentialCancelEvent", 228, "InternalSemanticEventLogger.kt")).y("Cancelled logging CUI %s to GIL due to cancelEvent", this.d.a(mbbVar.a).a);
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object g(mbb mbbVar, java.lang.String str, long j, defpackage.mce mceVar, long j2, defpackage.aoln aolnVar) {
        mby mbyVar;
        defpackage.zan zanVar;
        defpackage.zan zanVar2;
        mbb mbbVar2 = mbbVar;
        long j3 = j;
        long j4 = j2;
        if (aolnVar instanceof mby) {
            mbyVar = (mby) aolnVar;
            int i = mbyVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbyVar.e = i - Integer.MIN_VALUE;
            } else {
                mbyVar = new mby(this, aolnVar);
            }
        } else {
            mbyVar = new mby(this, aolnVar);
        }
        mby mbyVar2 = mbyVar;
        java.lang.Object obj = mbyVar2.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mbyVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                long j5 = mbyVar2.b;
                long j6 = mbyVar2.a;
                defpackage.zan zanVar3 = mbyVar2.g;
                mbb mbbVar3 = mbyVar2.f;
                defpackage.aooc.af(obj);
                j4 = j5;
                zanVar2 = zanVar3;
                mbbVar2 = mbbVar3;
                j3 = j6;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return java.lang.Boolean.TRUE;
        }
        defpackage.aooc.af(obj);
        defpackage.mbl mblVar = this.d;
        defpackage.zao zaoVar = mbbVar2.a;
        defpackage.aooh.f(mceVar, "endEvent");
        pgi pgiVar = (pgi) mblVar.e().get(zaoVar);
        if (pgiVar != null) {
            java.util.Iterator it = pgiVar.b.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    zanVar = null;
                    break;
                }
                defpackage.zam zamVar = (defpackage.zam) it.next();
                java.util.Set set = zamVar.a;
                java.util.Iterator it2 = it;
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(set, 10));
                for (java.util.Iterator it3 = set.iterator(); it3.hasNext(); it3 = it3) {
                    arrayList.add((java.lang.Boolean) pgiVar.a.get((defpackage.mce) it3.next()));
                }
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (!defpackage.aooh.n((java.lang.Boolean) it4.next(), java.lang.Boolean.TRUE)) {
                                it = it2;
                            }
                        }
                    }
                }
                zanVar = zamVar.b;
                break;
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
        this.i.d(mbd.c, new mbi(new java.lang.Integer(zanVar.b), mceVar, (defpackage.zal) null), str);
        java.lang.String str2 = mbbVar2.b;
        defpackage.zar zarVar = defpackage.zar.OK;
        java.lang.String strBL = defpackage.afsq.bL(str2, str);
        mbyVar2.f = mbbVar2;
        mbyVar2.g = zanVar;
        mbyVar2.a = j3;
        mbyVar2.b = j4;
        mbyVar2.e = 1;
        zanVar2 = zanVar;
        if (c(zanVar2, j3 - j4, zarVar, strBL, mbyVar2) == aoluVar) {
            return aoluVar;
        }
        this.p.aO(zanVar2.a, j4, j3);
        mbk mbkVar = mbk.a;
        mbyVar2.f = null;
        mbyVar2.g = null;
        mbyVar2.e = 2;
        if (a(mbbVar2, mbkVar, zanVar2, mbyVar2) == aoluVar) {
            return aoluVar;
        }
        return java.lang.Boolean.TRUE;
    }
}
