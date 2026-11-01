package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yuo {
    private static final aimz a = aimz.i("com/google/android/callcoreshared/aicore/session/impl/AiCoreSessionsImpl");
    private final aolr b;
    private final defpackage.ysf c;
    private final aoin d;
    private final defpackage.ysu e;
    private final xtq f;
    private final zzx g;

    public yuo(defpackage.ysu ysuVar, xtq xtqVar, aolr aolrVar, defpackage.ysf ysfVar, zzx zzxVar, aoin aoinVar) {
        aooh.f(ysuVar, "aiCoreClient");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aoinVar, "enableAicoreStatusCheck");
        this.e = ysuVar;
        this.f = xtqVar;
        this.b = aolrVar;
        this.c = ysfVar;
        this.g = zzxVar;
        this.d = aoinVar;
    }

    private final defpackage.yty e(java.lang.Object obj) {
        defpackage.ytt yttVar;
        java.lang.Throwable thC;
        if (((java.lang.Boolean) this.d.a()).booleanValue()) {
            yttVar = defpackage.ytt.a;
            thC = aoiw.c(obj);
        } else {
            yttVar = defpackage.ytt.a;
            thC = null;
        }
        return wsc.z(yttVar, thC);
    }

    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v9, types: [ymd] */
    public final java.lang.Object a(defpackage.yts ytsVar, aoln aolnVar) {
        defpackage.yuk yukVar;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        defpackage.yts ytsVar2;
        java.io.Closeable closeable2;
        java.lang.Object objD;
        ?? r11;
        if (aolnVar instanceof defpackage.yuk) {
            yukVar = (defpackage.yuk) aolnVar;
            int i = yukVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yukVar.e = i - Integer.MIN_VALUE;
            } else {
                yukVar = new defpackage.yuk(this, aolnVar);
            }
        } else {
            yukVar = new defpackage.yuk(this, aolnVar);
        }
        defpackage.yuk yukVar2 = yukVar;
        java.lang.Object objB = yukVar2.c;
        aolu aoluVar = aolu.a;
        int i2 = yukVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                closeable2 = yukVar2.f;
                ytsVar2 = (defpackage.yts) yukVar2.a;
                try {
                    aooc.af(objB);
                    defpackage.ymd ymdVar = (defpackage.ymd) objB;
                    yukVar2.a = ytsVar2;
                    yukVar2.f = closeable2;
                    yukVar2.b = ymdVar;
                    yukVar2.e = 2;
                    objD = d(ytsVar2, yukVar2);
                    r11 = ymdVar;
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    closeable = closeable2;
                }
            } else if (i2 == 2) {
                java.lang.Object obj = yukVar2.b;
                java.io.Closeable closeable3 = yukVar2.f;
                ytsVar2 = (defpackage.yts) yukVar2.a;
                try {
                    aooc.af(objB);
                    java.lang.Object obj2 = ((aoiw) objB).a;
                    r11 = obj;
                    closeable2 = closeable3;
                    objD = obj2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    closeable = closeable3;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (java.io.Closeable) yukVar2.a;
                try {
                    aooc.af(objB);
                    ajsz.ak(closeable, (java.lang.Throwable) null);
                    return objB;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            }
            try {
                throw th;
            } catch (java.lang.Throwable th5) {
                ajsz.ak(closeable, th);
                throw th5;
            }
        }
        aooc.af(objB);
        if (!ahvr.R(yukVar2.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        java.io.Closeable closeableZ = ahvr.Z(1187, "AiCoreSessionsImpl_createLlmSession");
        try {
            defpackage.ysu ysuVar = this.e;
            yukVar2.a = ytsVar;
            yukVar2.f = closeableZ;
            yukVar2.e = 1;
            java.lang.Object objB2 = ysuVar.b(yukVar2);
            if (objB2 == aoluVar) {
                return aoluVar;
            }
            ytsVar2 = ytsVar;
            closeable2 = closeableZ;
            objB = objB2;
            defpackage.ymd ymdVar2 = (defpackage.ymd) objB;
            yukVar2.a = ytsVar2;
            yukVar2.f = closeable2;
            yukVar2.b = ymdVar2;
            yukVar2.e = 2;
            objD = d(ytsVar2, yukVar2);
            r11 = ymdVar2;
            if (objD == aoluVar) {
                return aoluVar;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            closeable = closeableZ;
        }
        if (objD instanceof aoiv) {
            objB = e(objD);
        } else {
            defpackage.ymk ymkVar = (defpackage.ymk) objD;
            defpackage.aliq aliqVarA = defpackage.ynr.a(r11);
            aliqVarA.t(ymkVar);
            defpackage.ymj ymjVarC = defpackage.yqm.c(aliqVarA.s());
            yukVar2.a = closeable2;
            yukVar2.f = null;
            yukVar2.b = null;
            yukVar2.e = 3;
            objB = b(ymjVarC, ytsVar2, ymkVar, 1, yukVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
        }
        closeable = closeable2;
        ajsz.ak(closeable, (java.lang.Throwable) null);
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, ymj] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final java.lang.Object b(defpackage.ymj ymjVar, defpackage.yts ytsVar, defpackage.ymk ymkVar, int i, aoln aolnVar) {
        defpackage.yul yulVar;
        ?? r7;
        if (aolnVar instanceof defpackage.yul) {
            yulVar = (defpackage.yul) aolnVar;
            int i2 = yulVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yulVar.d = i2 - Integer.MIN_VALUE;
            } else {
                yulVar = new defpackage.yul(this, aolnVar);
            }
        } else {
            yulVar = new defpackage.yul(this, aolnVar);
        }
        java.lang.Object objAj = yulVar.b;
        aolu aoluVar = aolu.a;
        int i3 = yulVar.d;
        try {
            if (i3 == 0) {
                aooc.af(objAj);
                if (ymkVar == null || ymkVar.c != i) {
                    this.g.l(new zbq(defpackage.zbr.m));
                    return wsc.z(defpackage.ytt.b, (java.lang.Throwable) null);
                }
                aolr aolrVar = this.b;
                defpackage.xtn xtnVar = new defpackage.xtn(ymjVar, (aoln) null, 3);
                yulVar.a = ymjVar;
                yulVar.e = ytsVar;
                yulVar.f = ymkVar;
                yulVar.d = 1;
                objAj = aoov.aj(aolrVar, xtnVar, yulVar);
                if (objAj == aoluVar) {
                    r7 = ymjVar;
                    return aoluVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ymkVar = yulVar.f;
                ytsVar = yulVar.e;
                java.lang.Object obj = yulVar.a;
                aooc.af(objAj);
                r7 = obj;
            }
            r7 = ymjVar;
            zzx zzxVar = this.g;
            xtq xtqVarE = wsc.E(ysv.a.m());
            xtqVarE.i(defpackage.yqm.e(ytsVar.a));
            xtqVarE.h(3);
            zzxVar.l(new ysw(xtqVarE.g()));
            xtq xtqVar = this.f;
            ytsVar.getClass();
            r7.getClass();
            ymkVar.getClass();
            defpackage.yui yuiVar = (defpackage.yui) xtqVar.a.a();
            yuiVar.getClass();
            return new defpackage.ytx(new defpackage.ahdv(ytsVar, r7, ymkVar, yuiVar));
        } catch (defpackage.ymi e) {
            a.d().k(e).j(zct.a, java.lang.Boolean.TRUE).l("com/google/android/callcoreshared/aicore/session/impl/AiCoreSessionsImpl", "createSessionForFeature", 177, "AiCoreSessionsImpl.kt").y("Failed to prepare inference engine for %s", new aepg(ytsVar.a));
            this.g.l(new zbq(defpackage.zbr.n));
            return ((java.lang.Boolean) this.d.a()).booleanValue() ? wsc.z(defpackage.ytt.c, e) : wsc.z(defpackage.ytt.c, (java.lang.Throwable) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v9, types: [ymd] */
    public final java.lang.Object c(defpackage.yts ytsVar, aoln aolnVar) {
        defpackage.yum yumVar;
        java.lang.Throwable th;
        java.io.Closeable closeable;
        defpackage.yts ytsVar2;
        java.io.Closeable closeable2;
        java.lang.Object objD;
        ?? r11;
        if (aolnVar instanceof defpackage.yum) {
            yumVar = (defpackage.yum) aolnVar;
            int i = yumVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yumVar.e = i - Integer.MIN_VALUE;
            } else {
                yumVar = new defpackage.yum(this, aolnVar);
            }
        } else {
            yumVar = new defpackage.yum(this, aolnVar);
        }
        defpackage.yum yumVar2 = yumVar;
        java.lang.Object objB = yumVar2.c;
        aolu aoluVar = aolu.a;
        int i2 = yumVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                closeable2 = yumVar2.f;
                ytsVar2 = (defpackage.yts) yumVar2.a;
                try {
                    aooc.af(objB);
                    defpackage.ymd ymdVar = (defpackage.ymd) objB;
                    yumVar2.a = ytsVar2;
                    yumVar2.f = closeable2;
                    yumVar2.b = ymdVar;
                    yumVar2.e = 2;
                    objD = d(ytsVar2, yumVar2);
                    r11 = ymdVar;
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    closeable = closeable2;
                }
            } else if (i2 == 2) {
                java.lang.Object obj = yumVar2.b;
                java.io.Closeable closeable3 = yumVar2.f;
                ytsVar2 = (defpackage.yts) yumVar2.a;
                try {
                    aooc.af(objB);
                    java.lang.Object obj2 = ((aoiw) objB).a;
                    r11 = obj;
                    closeable2 = closeable3;
                    objD = obj2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    closeable = closeable3;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (java.io.Closeable) yumVar2.a;
                try {
                    aooc.af(objB);
                    ajsz.ak(closeable, (java.lang.Throwable) null);
                    return objB;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            }
            try {
                throw th;
            } catch (java.lang.Throwable th5) {
                ajsz.ak(closeable, th);
                throw th5;
            }
        }
        aooc.af(objB);
        if (!ahvr.R(yumVar2.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        java.io.Closeable closeableZ = ahvr.Z(1188, "AiCoreSessionsImpl_createSummarizationSession");
        try {
            defpackage.ysu ysuVar = this.e;
            yumVar2.a = ytsVar;
            yumVar2.f = closeableZ;
            yumVar2.e = 1;
            java.lang.Object objB2 = ysuVar.b(yumVar2);
            if (objB2 == aoluVar) {
                return aoluVar;
            }
            ytsVar2 = ytsVar;
            closeable2 = closeableZ;
            objB = objB2;
            defpackage.ymd ymdVar2 = (defpackage.ymd) objB;
            yumVar2.a = ytsVar2;
            yumVar2.f = closeable2;
            yumVar2.b = ymdVar2;
            yumVar2.e = 2;
            objD = d(ytsVar2, yumVar2);
            r11 = ymdVar2;
            if (objD == aoluVar) {
                return aoluVar;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            closeable = closeableZ;
        }
        if (objD instanceof aoiv) {
            objB = e(objD);
        } else {
            defpackage.ymk ymkVar = (defpackage.ymk) objD;
            defpackage.aliq aliqVarA = defpackage.yot.a(r11);
            aliqVarA.q(ymkVar);
            defpackage.yor yorVarI = defpackage.yor.i(aliqVarA.p());
            yumVar2.a = closeable2;
            yumVar2.f = null;
            yumVar2.b = null;
            yumVar2.e = 3;
            objB = b(yorVarI, ytsVar2, ymkVar, 3, yumVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
        }
        closeable = closeable2;
        ajsz.ak(closeable, (java.lang.Throwable) null);
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.yts ytsVar, aoln aolnVar) {
        defpackage.yun yunVar;
        java.lang.Object objC;
        if (aolnVar instanceof defpackage.yun) {
            yunVar = (defpackage.yun) aolnVar;
            int i = yunVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yunVar.c = i - Integer.MIN_VALUE;
            } else {
                yunVar = new defpackage.yun(this, aolnVar);
            }
        } else {
            yunVar = new defpackage.yun(this, aolnVar);
        }
        java.lang.Object obj = yunVar.a;
        java.lang.Object obj2 = aolu.a;
        int i2 = yunVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            int iA = this.c.a(ytsVar.a);
            java.lang.Integer num = ytsVar.b;
            defpackage.ysu ysuVar = this.e;
            if (num != null) {
                int iIntValue = num.intValue();
                yunVar.d = ytsVar;
                yunVar.c = 1;
                objC = ysuVar.d(iA, iIntValue, yunVar);
                if (objC != obj2) {
                }
            } else {
                yunVar.d = ytsVar;
                yunVar.c = 2;
                objC = ysuVar.c(iA, yunVar);
                if (objC != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ytsVar = yunVar.d;
        aooc.af(obj);
        objC = ((aoiw) obj).a;
        obj2 = objC;
        if (obj2 instanceof aoiv) {
            boolean zBooleanValue = ((java.lang.Boolean) this.d.a()).booleanValue();
            aimz aimzVar = a;
            if (zBooleanValue) {
                aimzVar.b().k(aoiw.c(obj2)).j(zct.a, java.lang.Boolean.TRUE).l("com/google/android/callcoreshared/aicore/session/impl/AiCoreSessionsImpl", "getAiFeature", 132, "AiCoreSessionsImpl.kt").y("getting feature failed for feature %s", new aepg(ytsVar.a));
            } else {
                aimzVar.b().l("com/google/android/callcoreshared/aicore/session/impl/AiCoreSessionsImpl", "getAiFeature", 137, "AiCoreSessionsImpl.kt").v("getting feature failed");
            }
            this.g.l(new zbq(defpackage.zbr.l));
        }
        return obj2;
    }
}
