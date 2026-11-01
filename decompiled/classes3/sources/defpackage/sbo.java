package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sbo {
    private static final aimz d = aimz.i("com/android/dialer/patrick/impl/logging/PatrickMetricsSingletonCache");
    public final aolr a;
    public final android.content.Context b;
    public final okj c;
    private final zrw e;
    private final ojo f;
    private final zjs g;
    private final aoin h;
    private final aonj i;
    private final aonj j;
    private final aonj k;
    private final aonj l;

    public sbo(aolr aolrVar, android.content.Context context, okj okjVar, zrw zrwVar, aazc aazcVar, ojo ojoVar, zjs zjsVar, ajct ajctVar, aoin aoinVar) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(context, "appContext");
        aooh.f(aazcVar, "clock");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aoinVar, "catchContentProviderException");
        this.a = aolrVar;
        this.b = context;
        this.c = okjVar;
        this.e = zrwVar;
        this.f = ojoVar;
        this.g = zjsVar;
        this.h = aoinVar;
        this.i = new aiuo(new defpackage.sbm(this, (aoln) null, 0));
        this.j = new aiuo(new kqu(this, (aoln) null, 19));
        this.k = new aiuo(new kqu(this, (aoln) null, 20, (byte[]) null));
        this.l = new aiuo(new defpackage.sbm(this, (aoln) null, 1, (byte[]) null));
    }

    public final java.lang.Object a(aoln aolnVar) {
        return this.j.a(aolnVar);
    }

    public final java.lang.Object b(aoln aolnVar) {
        return this.k.a(aolnVar);
    }

    public final java.lang.Object c(aoln aolnVar) {
        return this.l.a(aolnVar);
    }

    public final java.lang.Object d(aoln aolnVar) {
        return this.i.a(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Code duplicated, block: B:40:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    /* JADX WARN: Code duplicated, block: B:54:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object e(boolean z, aoln aolnVar) {
        defpackage.sbn sbnVar;
        java.lang.Object obj;
        boolean z2;
        rsr rsrVarAB;
        boolean z3;
        ojo ojoVar;
        boolean z4;
        if (aolnVar instanceof defpackage.sbn) {
            sbnVar = (defpackage.sbn) aolnVar;
            int i = sbnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbnVar.d = i - Integer.MIN_VALUE;
            } else {
                sbnVar = new defpackage.sbn(this, aolnVar);
            }
        } else {
            sbnVar = new defpackage.sbn(this, aolnVar);
        }
        defpackage.sbn sbnVar2 = sbnVar;
        java.lang.Object objJ = sbnVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = sbnVar2.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    z2 = sbnVar2.a;
                    aooc.af(objJ);
                } else if (i2 == 2) {
                    boolean z5 = sbnVar2.a;
                    ojo ojoVar2 = sbnVar2.e;
                    rsrVarAB = sbnVar2.f;
                    aooc.af(objJ);
                    z3 = z5;
                    ojoVar = ojoVar2;
                    android.net.Uri uri = (android.net.Uri) objJ;
                    java.lang.String[] strArr = {"number"};
                    java.lang.Object obj2 = rsrVarAB.b;
                    java.lang.Object obj3 = rsrVarAB.a;
                    bbb bbbVar = new bbb(13);
                    try {
                        sbnVar2.f = null;
                        sbnVar2.e = null;
                        sbnVar2.a = z3;
                        sbnVar2.d = 3;
                        obj = null;
                        try {
                            objJ = ojoVar.i(uri, strArr, (java.lang.String) obj2, (java.lang.String[]) obj3, (java.lang.String) null, bbbVar, sbnVar2);
                            if (objJ != aoluVar) {
                                return aoluVar;
                            }
                            z4 = z3;
                        } catch (agui e) {
                            e = e;
                            if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                                throw e;
                            }
                            d.d().k(e).l("com/android/dialer/patrick/impl/logging/PatrickMetricsSingletonCache", "queryPast30DaysCallLogCount", 113, "PatrickMetricsSingletonCache.kt").v("Failed to query call log.");
                            return obj;
                        } catch (java.lang.RuntimeException e2) {
                            e = e2;
                            d.d().k(e).l("com/android/dialer/patrick/impl/logging/PatrickMetricsSingletonCache", "queryPast30DaysCallLogCount", 109, "PatrickMetricsSingletonCache.kt").v("Failed to query call log.");
                            return obj;
                        }
                    } catch (agui e3) {
                        e = e3;
                        obj = null;
                        if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                            throw e;
                        }
                        d.d().k(e).l("com/android/dialer/patrick/impl/logging/PatrickMetricsSingletonCache", "queryPast30DaysCallLogCount", 113, "PatrickMetricsSingletonCache.kt").v("Failed to query call log.");
                        return obj;
                    } catch (java.lang.RuntimeException e4) {
                        e = e4;
                        obj = null;
                        d.d().k(e).l("com/android/dialer/patrick/impl/logging/PatrickMetricsSingletonCache", "queryPast30DaysCallLogCount", 109, "PatrickMetricsSingletonCache.kt").v("Failed to query call log.");
                        return obj;
                    }
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z4 = sbnVar2.a;
                    aooc.af(objJ);
                    obj = null;
                }
                aify aifyVar = (aify) objJ;
                return z4 ? new java.lang.Integer(ajsz.bQ(ajsz.bS(aifyVar)).size()) : new java.lang.Integer(aifyVar.size());
            }
            aooc.af(objJ);
            zrw zrwVar = this.e;
            z2 = z;
            sbnVar2.a = z2;
            sbnVar2.d = 1;
            objJ = zrwVar.j(sbnVar2);
            if (objJ == aoluVar) {
                return aoluVar;
            }
            if (!((java.lang.Boolean) objJ).booleanValue()) {
                obj = null;
                d.b().l("com/android/dialer/patrick/impl/logging/PatrickMetricsSingletonCache", "queryPast30DaysCallLogCount", 83, "PatrickMetricsSingletonCache.kt").v("Missing call log read permissions.");
                return obj;
            }
            j$.time.LocalDate localDateOfInstant = j$.time.LocalDate.ofInstant(j$.time.Instant.now(), j$.time.ZoneId.systemDefault());
            long epochMilli = localDateOfInstant.minusDays(30L).atStartOfDay(j$.time.ZoneId.systemDefault()).toInstant().toEpochMilli();
            long epochMilli2 = localDateOfInstant.atStartOfDay(j$.time.ZoneId.systemDefault()).toInstant().toEpochMilli();
            rsr rsrVar = new rsr();
            rsrVar.aC(new kaw("date").aI(">=", java.lang.String.valueOf(epochMilli)));
            rsrVar.aC(new kaw("date").aI("<", java.lang.String.valueOf(epochMilli2)));
            rsrVarAB = rsrVar.aB();
            ojo ojoVar3 = this.f;
            zjs zjsVar = this.g;
            sbnVar2.f = rsrVarAB;
            sbnVar2.e = ojoVar3;
            sbnVar2.a = z2;
            sbnVar2.d = 2;
            java.lang.Object objN = zjsVar.n(sbnVar2);
            if (objN == aoluVar) {
                return aoluVar;
            }
            z3 = z2;
            ojoVar = ojoVar3;
            objJ = objN;
            android.net.Uri uri2 = (android.net.Uri) objJ;
            java.lang.String[] strArr2 = {"number"};
            java.lang.Object obj4 = rsrVarAB.b;
            java.lang.Object obj5 = rsrVarAB.a;
            bbb bbbVar2 = new bbb(13);
            sbnVar2.f = null;
            sbnVar2.e = null;
            sbnVar2.a = z3;
            sbnVar2.d = 3;
            obj = null;
            objJ = ojoVar.i(uri2, strArr2, (java.lang.String) obj4, (java.lang.String[]) obj5, (java.lang.String) null, bbbVar2, sbnVar2);
            if (objJ != aoluVar) {
                return aoluVar;
            }
            z4 = z3;
            aify aifyVar2 = (aify) objJ;
            if (z4) {
            }
        } catch (java.lang.RuntimeException e5) {
            e = e5;
            obj = null;
        } catch (agui e6) {
            e = e6;
            obj = null;
        }
    }
}
