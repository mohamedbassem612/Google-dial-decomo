package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ysu {
    private static final aimz c = aimz.i("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl");
    public final ajct a;
    public final aoss b;
    private final android.content.Context d;
    private final ajct e;
    private defpackage.ymd f;
    private final apdp g;
    private final zzx h;

    public ysu(android.content.Context context, ajct ajctVar, ajct ajctVar2, aoss aossVar, zzx zzxVar) {
        aooh.f(context, "appContext");
        aooh.f(ajctVar, "blockingExecutor");
        aooh.f(ajctVar2, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        this.d = context;
        this.e = ajctVar;
        this.a = ajctVar2;
        this.b = aossVar;
        this.h = zzxVar;
        this.g = new apdp();
    }

    private static final void g(defpackage.ymi ymiVar, int i) {
        boolean z;
        int i2 = ymiVar.a;
        defpackage.aepb aepbVar = new defpackage.aepb(i2);
        int i3 = ymiVar.b;
        defpackage.aepb aepbVar2 = new defpackage.aepb(i3);
        boolean z2 = false;
        if (i3 == 6 || i3 == 602 || i3 == 603) {
            z = true;
        } else if (i3 == 601) {
            i3 = 601;
            z = true;
        } else {
            z = false;
        }
        if (i2 == 1) {
            if (i3 == 0 && (ymiVar.getCause() instanceof java.lang.IllegalStateException)) {
                i2 = 1;
                z2 = true;
            } else {
                i2 = 1;
            }
        }
        if (i3 == 606) {
            c.b().k(ymiVar).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "logAiCoreException", 180, "AiCoreClientImpl.kt").M("Failed for feature %s due to feature not found. (ErrorType: %s, ErrorCode: %s)", defpackage.yqm.d(i), aepbVar, aepbVar2);
            return;
        }
        if (i2 == 4 || z) {
            c.b().k(ymiVar).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "logAiCoreException", 190, "AiCoreClientImpl.kt").M("Failed for feature %s due to connection error. (ErrorType: %s, ErrorCode: %s)", defpackage.yqm.d(i), aepbVar, aepbVar2);
            return;
        }
        aimz aimzVar = c;
        if (z2) {
            aimzVar.b().k(ymiVar).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "logAiCoreException", 200, "AiCoreClientImpl.kt").M("Failed for feature %s due to AiCore service-side download failure. (ErrorType: %s, ErrorCode: %s)", defpackage.yqm.d(i), aepbVar, aepbVar2);
        } else {
            aimzVar.c().k(ymiVar).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "logAiCoreException", 210, "AiCoreClientImpl.kt").M("AiCoreException for feature %s: ErrorType %s, ErrorCode %s", defpackage.yqm.d(i), aepbVar, aepbVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ysl yslVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ysl) {
            yslVar = (defpackage.ysl) aolnVar;
            int i = yslVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yslVar.c = i - Integer.MIN_VALUE;
            } else {
                yslVar = new defpackage.ysl(this, aolnVar);
            }
        } else {
            yslVar = new defpackage.ysl(this, aolnVar);
        }
        java.lang.Object obj = yslVar.a;
        aojh aojhVar = aolu.a;
        int i2 = yslVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.g;
                yslVar.d = apdpVar2;
                yslVar.c = 1;
                if (apdpVar2.b(yslVar) != aojhVar) {
                    apdpVar = apdpVar2;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = yslVar.d;
            aooc.af(obj);
            defpackage.ymd ymdVar = this.f;
            if (ymdVar != null) {
                ((defpackage.yna) ymdVar).l();
            }
            this.f = null;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ysm ysmVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ysm) {
            ysmVar = (defpackage.ysm) aolnVar;
            int i = ysmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ysmVar.c = i - Integer.MIN_VALUE;
            } else {
                ysmVar = new defpackage.ysm(this, aolnVar);
            }
        } else {
            ysmVar = new defpackage.ysm(this, aolnVar);
        }
        java.lang.Object obj = ysmVar.a;
        aolu ynaVar = aolu.a;
        int i2 = ysmVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.g;
                ysmVar.d = apdpVar2;
                ysmVar.c = 1;
                if (apdpVar2.b(ysmVar) != ynaVar) {
                    apdpVar = apdpVar2;
                }
                return ynaVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = ysmVar.d;
            aooc.af(obj);
            aolu aoluVar = this.f;
            if (aoluVar == null) {
                defpackage.ymf ymfVarA = defpackage.ymh.a(this.d);
                ymfVarA.b(this.e);
                ynaVar = new defpackage.yna(ymfVarA.a());
                this.f = ynaVar;
            } else {
                ynaVar = aoluVar;
            }
            return ynaVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c A[Catch: Exception -> 0x0089, CancellationException -> 0x00b4, ymi -> 0x00b7, TryCatch #2 {CancellationException -> 0x00b4, ymi -> 0x00b7, Exception -> 0x0089, blocks: (B:13:0x0028, B:25:0x0057, B:27:0x005c, B:28:0x007d, B:29:0x0088, B:18:0x0036, B:23:0x0047, B:21:0x003d), top: B:39:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007d A[Catch: Exception -> 0x0089, CancellationException -> 0x00b4, ymi -> 0x00b7, TryCatch #2 {CancellationException -> 0x00b4, ymi -> 0x00b7, Exception -> 0x0089, blocks: (B:13:0x0028, B:25:0x0057, B:27:0x005c, B:28:0x007d, B:29:0x0088, B:18:0x0036, B:23:0x0047, B:21:0x003d), top: B:39:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(int i, aoln aolnVar) {
        defpackage.ysn ysnVar;
        java.lang.Object objAe;
        defpackage.ymk ymkVar;
        if (aolnVar instanceof defpackage.ysn) {
            ysnVar = (defpackage.ysn) aolnVar;
            int i2 = ysnVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ysnVar.d = i2 - Integer.MIN_VALUE;
            } else {
                ysnVar = new defpackage.ysn(this, aolnVar);
            }
        } else {
            ysnVar = new defpackage.ysn(this, aolnVar);
        }
        java.lang.Object objB = ysnVar.b;
        aolu aoluVar = aolu.a;
        int i3 = ysnVar.d;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    i = ysnVar.a;
                    aooc.af(objB);
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = ysnVar.a;
                    aooc.af(objB);
                }
                ymkVar = (defpackage.ymk) objB;
                if (ymkVar != null) {
                    throw new java.util.NoSuchElementException(a.bj(i, "AiFeature not found: "));
                }
                this.h.l(new zcd(defpackage.zce.a, ajsz.aY(new defpackage.zck(i)), new defpackage.zck(ymkVar.e), (java.lang.Long) null, (defpackage.zcf) null, 24));
                return ymkVar;
            }
            aooc.af(objB);
            ysnVar.a = i;
            ysnVar.d = 1;
            objB = b(ysnVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            ajcq ajcqVarA = ((defpackage.ymd) objB).a(i);
            ysnVar.a = i;
            ysnVar.d = 2;
            objB = aosv.D(ajcqVarA, ysnVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            ymkVar = (defpackage.ymk) objB;
            if (ymkVar != null) {
                throw new java.util.NoSuchElementException(a.bj(i, "AiFeature not found: "));
            }
            this.h.l(new zcd(defpackage.zce.a, ajsz.aY(new defpackage.zck(i)), new defpackage.zck(ymkVar.e), (java.lang.Long) null, (defpackage.zcf) null, 24));
            return ymkVar;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (defpackage.ymi e2) {
            g(e2, i);
            objAe = aooc.ae(e2);
            return objAe;
        } catch (java.lang.Exception e3) {
            c.c().k(e3).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "getFeature", 70, "AiCoreClientImpl.kt").y("AiFeature not found: %s", defpackage.yqm.d(i));
            objAe = aooc.ae(e3);
            return objAe;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object d(int i, int i2, aoln aolnVar) {
        defpackage.yso ysoVar;
        int i3;
        int i4;
        java.lang.Object objB;
        java.lang.Object objD;
        int i5;
        if (aolnVar instanceof defpackage.yso) {
            ysoVar = (defpackage.yso) aolnVar;
            int i6 = ysoVar.e;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ysoVar.e = i6 - Integer.MIN_VALUE;
            } else {
                ysoVar = new defpackage.yso(this, aolnVar);
            }
        } else {
            ysoVar = new defpackage.yso(this, aolnVar);
        }
        java.lang.Object obj = ysoVar.c;
        aolu aoluVar = aolu.a;
        int i7 = ysoVar.e;
        try {
            if (i7 == 0) {
                aooc.af(obj);
                i3 = i;
                try {
                    ysoVar.a = i3;
                    i4 = i2;
                    ysoVar.b = i4;
                    ysoVar.e = 1;
                    objB = b(ysoVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    ajcq ajcqVarB = ((defpackage.ymd) objB).b(i3, i4);
                    ysoVar.a = i3;
                    ysoVar.b = i4;
                    ysoVar.e = 2;
                    objD = aosv.D(ajcqVarB, ysoVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    i5 = i4;
                } catch (defpackage.ymi e) {
                    e = e;
                    g(e, i3);
                    return aooc.ae(e);
                } catch (java.lang.Exception e2) {
                    e = e2;
                    c.c().k(e).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "getFeatureOrControl", 100, "AiCoreClientImpl.kt").y("AiFeature not found: %s", defpackage.yqm.d(i3));
                    return aooc.ae(e);
                }
            } else if (i7 == 1) {
                i4 = ysoVar.b;
                int i8 = ysoVar.a;
                try {
                    aooc.af(obj);
                    objB = obj;
                    i3 = i8;
                    ajcq ajcqVarB2 = ((defpackage.ymd) objB).b(i3, i4);
                    ysoVar.a = i3;
                    ysoVar.b = i4;
                    ysoVar.e = 2;
                    objD = aosv.D(ajcqVarB2, ysoVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    i5 = i4;
                } catch (defpackage.ymi e3) {
                    e = e3;
                    i3 = i8;
                    g(e, i3);
                    return aooc.ae(e);
                } catch (java.lang.Exception e4) {
                    e = e4;
                    i3 = i8;
                    c.c().k(e).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "getFeatureOrControl", 100, "AiCoreClientImpl.kt").y("AiFeature not found: %s", defpackage.yqm.d(i3));
                    return aooc.ae(e);
                }
            } else {
                if (i7 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = ysoVar.b;
                int i9 = ysoVar.a;
                try {
                    aooc.af(obj);
                    objD = obj;
                    i3 = i9;
                } catch (defpackage.ymi e5) {
                    e = e5;
                    i3 = i9;
                    g(e, i3);
                    return aooc.ae(e);
                } catch (java.lang.Exception e6) {
                    e = e6;
                    i3 = i9;
                    c.c().k(e).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "getFeatureOrControl", 100, "AiCoreClientImpl.kt").y("AiFeature not found: %s", defpackage.yqm.d(i3));
                    return aooc.ae(e);
                }
            }
            defpackage.ymk ymkVar = (defpackage.ymk) objD;
            if (ymkVar == null) {
                throw new java.util.NoSuchElementException(a.bj(i3, "AiFeature not found: "));
            }
            this.h.l(new zcd(defpackage.zce.b, ajsz.bb(new defpackage.zck[]{new defpackage.zck(i3), new defpackage.zck(i5)}), new defpackage.zck(ymkVar.e), (java.lang.Long) null, (defpackage.zcf) null, 24));
            c.b().l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "getFeatureOrControl", 88, "AiCoreClientImpl.kt").I("requested version [%s] using available version [%s]", new defpackage.aepb(i5), new defpackage.aepb(ymkVar.f));
            return ymkVar;
        } catch (java.util.concurrent.CancellationException e7) {
            throw e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.ymk ymkVar, aoln aolnVar) {
        defpackage.ysp yspVar;
        java.lang.Object objAe;
        if (aolnVar instanceof defpackage.ysp) {
            yspVar = (defpackage.ysp) aolnVar;
            int i = yspVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yspVar.c = i - Integer.MIN_VALUE;
            } else {
                yspVar = new defpackage.ysp(this, aolnVar);
            }
        } else {
            yspVar = new defpackage.ysp(this, aolnVar);
        }
        java.lang.Object objB = yspVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yspVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ymkVar = yspVar.d;
                    aooc.af(objB);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ymkVar = yspVar.d;
                    aooc.af(objB);
                }
                java.lang.Integer num = (java.lang.Integer) objB;
                zzx zzxVar = this.h;
                defpackage.zce zceVar = defpackage.zce.c;
                java.util.List listAY = ajsz.aY(new defpackage.zck(ymkVar.e));
                aooh.c(num);
                zzxVar.l(new zcd(zceVar, listAY, new defpackage.zck(num.intValue()), (java.lang.Long) null, (defpackage.zcf) null, 24));
                return num;
            }
            aooc.af(objB);
            yspVar.d = ymkVar;
            yspVar.c = 1;
            objB = b(yspVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            ajcq ajcqVarC = ((defpackage.ymd) objB).c(ymkVar);
            yspVar.d = ymkVar;
            yspVar.c = 2;
            objB = aosv.D(ajcqVarC, yspVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            java.lang.Integer num2 = (java.lang.Integer) objB;
            zzx zzxVar2 = this.h;
            defpackage.zce zceVar2 = defpackage.zce.c;
            java.util.List listAY2 = ajsz.aY(new defpackage.zck(ymkVar.e));
            aooh.c(num2);
            zzxVar2.l(new zcd(zceVar2, listAY2, new defpackage.zck(num2.intValue()), (java.lang.Long) null, (defpackage.zcf) null, 24));
            return num2;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (defpackage.ymi e2) {
            g(e2, ymkVar.e);
            objAe = aooc.ae(e2);
            return objAe;
        } catch (java.lang.Exception e3) {
            c.c().k(e3).l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "getFeatureStatus", 125, "AiCoreClientImpl.kt").y("getFeatureStatus failed for feature: %s", defpackage.yqm.d(ymkVar.e));
            objAe = aooc.ae(e3);
            return objAe;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.ymk ymkVar, defpackage.ysd ysdVar, aoln aolnVar) {
        defpackage.ysq ysqVar;
        java.lang.Object objAe;
        if (aolnVar instanceof defpackage.ysq) {
            ysqVar = (defpackage.ysq) aolnVar;
            int i = ysqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ysqVar.c = i - Integer.MIN_VALUE;
            } else {
                ysqVar = new defpackage.ysq(this, aolnVar);
            }
        } else {
            ysqVar = new defpackage.ysq(this, aolnVar);
        }
        java.lang.Object objB = ysqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ysqVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ysdVar = ysqVar.e;
                    ymkVar = ysqVar.d;
                    aooc.af(objB);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ymkVar = ysqVar.d;
                    aooc.af(objB);
                }
                this.h.l(new zcd(defpackage.zce.d, ajsz.aY(new defpackage.zck(ymkVar.e)), (wsc) null, (java.lang.Long) null, (defpackage.zcf) null, 28));
                return aojh.a;
            }
            aooc.af(objB);
            ysqVar.d = ymkVar;
            ysqVar.e = (defpackage.ytg) ysdVar;
            ysqVar.c = 1;
            objB = b(ysqVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            ajcq ajcqVarF = ((defpackage.ymd) objB).f(ymkVar, new defpackage.yst(ysdVar, this));
            ysqVar.d = ymkVar;
            ysqVar.e = null;
            ysqVar.c = 2;
            if (aosv.D(ajcqVarF, ysqVar) == aoluVar) {
                return aoluVar;
            }
            this.h.l(new zcd(defpackage.zce.d, ajsz.aY(new defpackage.zck(ymkVar.e)), (wsc) null, (java.lang.Long) null, (defpackage.zcf) null, 28));
            return aojh.a;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (defpackage.ymi e2) {
            g(e2, ymkVar.e);
            objAe = aooc.ae(e2);
            return objAe;
        } catch (java.lang.Exception e3) {
            c.b().l("com/google/android/callcoreshared/aicore/internal/client/AiCoreClientImpl", "requestDownloadableFeature", 150, "AiCoreClientImpl.kt").I("requestDownloadableFeature failed for feature: %s %s", defpackage.yqm.d(ymkVar.e), e3);
            objAe = aooc.ae(e3);
            return objAe;
        }
    }
}
