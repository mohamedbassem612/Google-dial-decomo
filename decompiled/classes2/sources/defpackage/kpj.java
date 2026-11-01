package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kpj implements defpackage.kpe {
    public final defpackage.klt a;
    public final gpd b;
    private final aolr c;
    private final rlv d;
    private final apdp e;

    public kpj(aolr aolrVar, defpackage.klt kltVar, gpd gpdVar, rlv rlvVar, aazc aazcVar) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aazcVar, "clock");
        this.c = aolrVar;
        this.a = kltVar;
        this.b = gpdVar;
        this.d = rlvVar;
        this.e = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kpe
    public final java.lang.Object a(defpackage.kpd kpdVar, aoln aolnVar) {
        defpackage.kpf kpfVar;
        java.lang.Object objB;
        if (aolnVar instanceof defpackage.kpf) {
            kpfVar = (defpackage.kpf) aolnVar;
            int i = kpfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpfVar.c = i - Integer.MIN_VALUE;
            } else {
                kpfVar = new defpackage.kpf(this, aolnVar);
            }
        } else {
            kpfVar = new defpackage.kpf(this, aolnVar);
        }
        java.lang.Object obj = kpfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kpfVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            kpfVar.c = 1;
            objB = b(kpdVar, kpfVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            objB = ((aoiw) obj).a;
        }
        java.lang.Object obj2 = objB;
        if (!aoiw.d(obj2)) {
            return obj2;
        }
        try {
            defpackage.kqy kqyVar = ((defpackage.kpc) obj2).b;
            if (kqyVar == null) {
                return aokc.a;
            }
            if ((kqyVar.b & 1) != 0) {
                int i3 = kqyVar.d;
                defpackage.kqz kqzVarB = defpackage.kqz.b(i3);
                if (kqzVarB == null) {
                    kqzVarB = defpackage.kqz.UNSET_ERROR;
                }
                defpackage.kqz kqzVar = defpackage.kqz.UNSET_ERROR;
                if (kqzVarB != kqzVar) {
                    defpackage.kqz kqzVarB2 = defpackage.kqz.b(i3);
                    if (kqzVarB2 != null) {
                        kqzVar = kqzVarB2;
                    }
                    throw new defpackage.kpk(kqzVar, null, null);
                }
            }
            alat alatVar = kqyVar.c;
            aooh.e(alatVar, "getCallActionsList(...)");
            return alatVar;
        } catch (java.lang.Throwable th) {
            return aooc.ae(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.kpe
    public final java.lang.Object b(defpackage.kpd kpdVar, aoln aolnVar) {
        defpackage.kpg kpgVar;
        java.lang.Object objC;
        long j;
        defpackage.kqz kqzVar;
        if (aolnVar instanceof defpackage.kpg) {
            kpgVar = (defpackage.kpg) aolnVar;
            int i = kpgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpgVar.d = i - Integer.MIN_VALUE;
            } else {
                kpgVar = new defpackage.kpg(this, aolnVar);
            }
        } else {
            kpgVar = new defpackage.kpg(this, aolnVar);
        }
        java.lang.Object obj = kpgVar.b;
        aolu aoluVar = aolu.a;
        int i2 = kpgVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                if (!this.e.c()) {
                    return aooc.ae(new defpackage.kpk(defpackage.kqz.BUSY, null, null));
                }
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                kpgVar.e = kpdVar;
                kpgVar.a = jElapsedRealtime;
                kpgVar.d = 1;
                objC = c(kpdVar, kpgVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                j = jElapsedRealtime;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = kpgVar.a;
                kpdVar = kpgVar.e;
                aooc.af(obj);
                objC = ((aoiw) obj).a;
            }
            this.e.d();
            this = this.d;
            int iBd = mni.bd(kpdVar);
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j;
            vqu vquVarJ = akky.J(amrp.a.m());
            vquVarJ.ao(iBd);
            vquVarJ.al(jElapsedRealtime2);
            if (aoiw.d(objC)) {
                defpackage.kpc kpcVar = (defpackage.kpc) objC;
                vquVarJ.an(kpcVar.a.length());
                defpackage.kqy kqyVar = kpcVar.b;
                if (kqyVar != null) {
                    defpackage.kqz kqzVarB = defpackage.kqz.b(kqyVar.d);
                    if (kqzVarB == null) {
                        kqzVarB = defpackage.kqz.UNSET_ERROR;
                    }
                    vquVarJ.aj(kqzVarB);
                    vquVarJ.ak(kqyVar.c.size());
                }
            }
            java.lang.Throwable thC = aoiw.c(objC);
            if (thC != null) {
                defpackage.kpk kpkVar = thC instanceof defpackage.kpk ? (defpackage.kpk) thC : null;
                if (kpkVar == null || (kqzVar = kpkVar.a) == null) {
                    kqzVar = defpackage.kqz.DUPLEX_GENERIC_FAILURE;
                }
                vquVarJ.am(kqzVar);
            }
            this.u(vquVarJ.ai());
            return objC;
        } catch (java.lang.Throwable th) {
            this.e.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.kpd kpdVar, aoln aolnVar) {
        defpackage.kph kphVar;
        if (aolnVar instanceof defpackage.kph) {
            kphVar = (defpackage.kph) aolnVar;
            int i = kphVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kphVar.c = i - Integer.MIN_VALUE;
            } else {
                kphVar = new defpackage.kph(this, aolnVar);
            }
        } else {
            kphVar = new defpackage.kph(this, aolnVar);
        }
        java.lang.Object objAj = kphVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kphVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.c;
            defpackage.kpi kpiVar = new defpackage.kpi(this, kpdVar, null);
            kphVar.c = 1;
            objAj = aoov.aj(aolrVar, kpiVar, kphVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        return ((aoiw) objAj).a;
    }
}
