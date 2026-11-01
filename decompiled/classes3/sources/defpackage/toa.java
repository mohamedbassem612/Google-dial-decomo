package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class toa extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toa(jgk jgkVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.d = jgkVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return new defpackage.toa((jgk) this.d, (aoln) obj, 1).b(aojh.a);
        }
        return new defpackage.toa((defpackage.toj) this.d, (aoln) obj, 0).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0117  */
    /* JADX WARN: Code duplicated, block: B:30:0x011f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0133  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object objAu;
        defpackage.toj tojVar;
        defpackage.tth tthVarB;
        int iOrdinal;
        java.lang.Object obj3;
        java.lang.Object obj4;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            if (this.c != 0) {
                obj4 = this.b;
                obj3 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                java.lang.Object obj5 = this.d;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("beesly_recording_");
                jgk jgkVar = (jgk) obj5;
                sb.append(jgkVar.g);
                sb.append(".m4a");
                java.lang.String string = sb.toString();
                this.a = string;
                icm icmVar = jgkVar.t;
                this.b = icmVar;
                this.c = 1;
                kgl kglVar = jgkVar.w;
                obj = aoov.aj((aolr) kglVar.d, new icr(kglVar, (aoln) null, 10), this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                obj3 = string;
                obj4 = icmVar;
            }
            java.io.File file = new java.io.File((java.io.File) obj, (java.lang.String) obj3);
            defpackage.rai raiVar = new defpackage.rai(this.d, (byte[]) null);
            icm icmVar2 = (icm) obj4;
            him himVar = ((hih) icmVar2.n.a).a;
            icu icuVar = new icu(icmVar2, file, raiVar, (aoss) himVar.bZ.a(), (aoss) himVar.cb.a(), (aolr) himVar.bg.a());
            icmVar2.f.put(icuVar, new icv(false));
            return icuVar;
        }
        aolu aoluVar2 = aolu.a;
        int i = this.c;
        if (i == 0) {
            aooc.af(obj);
            defpackage.toj tojVar2 = (defpackage.toj) this.d;
            alat alatVar = tojVar2.D.m().d;
            aooh.e(alatVar, "getScamAlertsList(...)");
            if (alatVar.isEmpty()) {
                tojVar = (defpackage.toj) this.d;
                tthVarB = defpackage.tth.b(tojVar.D.m().c);
                if (tthVarB == null) {
                    tthVarB = defpackage.tth.UNRECOGNIZED;
                }
                iOrdinal = tthVarB.ordinal();
                if (iOrdinal != 3) {
                    tojVar.u.a(qbc.lN);
                    this.c = 3;
                    if (tojVar.f(true, this) == aoluVar2) {
                        return aoluVar2;
                    }
                } else {
                    tojVar.u.a(qbc.lN);
                    this.c = 3;
                    if (tojVar.f(true, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
            } else {
                obj2 = tojVar2.B;
                j$.time.Instant instantNow = j$.time.Instant.now();
                aooh.e(instantNow, "instant(...)");
                objAu = aooc.au(instantNow);
                ajcq ajcqVar = tojVar2.w.b;
                aooh.e(ajcqVar, "getDirection(...)");
                this.a = obj2;
                this.b = objAu;
                this.c = 1;
                obj = aosv.D(ajcqVar, this);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
                aooh.e(obj, "await(...)");
                this.a = null;
                this.b = null;
                this.c = 2;
                if (((defpackage.rju) obj2).g((alcf) objAu, (defpackage.zmy) obj, this) == aoluVar2) {
                    return aoluVar2;
                }
                tojVar = (defpackage.toj) this.d;
                tthVarB = defpackage.tth.b(tojVar.D.m().c);
                if (tthVarB == null) {
                    tthVarB = defpackage.tth.UNRECOGNIZED;
                }
                iOrdinal = tthVarB.ordinal();
                if (iOrdinal != 3) {
                    tojVar.u.a(qbc.lN);
                    this.c = 3;
                    if (tojVar.f(true, this) == aoluVar2) {
                        return aoluVar2;
                    }
                } else {
                    tojVar.u.a(qbc.lN);
                    this.c = 3;
                    if (tojVar.f(true, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
            }
        } else if (i == 1) {
            objAu = this.b;
            obj2 = this.a;
            aooc.af(obj);
            aooh.e(obj, "await(...)");
            this.a = null;
            this.b = null;
            this.c = 2;
            if (((defpackage.rju) obj2).g((alcf) objAu, (defpackage.zmy) obj, this) == aoluVar2) {
                return aoluVar2;
            }
            tojVar = (defpackage.toj) this.d;
            tthVarB = defpackage.tth.b(tojVar.D.m().c);
            if (tthVarB == null) {
                tthVarB = defpackage.tth.UNRECOGNIZED;
            }
            iOrdinal = tthVarB.ordinal();
            if (iOrdinal != 3) {
                tojVar.u.a(qbc.lN);
                this.c = 3;
                if (tojVar.f(true, this) == aoluVar2) {
                    return aoluVar2;
                }
            } else {
                tojVar.u.a(qbc.lN);
                this.c = 3;
                if (tojVar.f(true, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
        } else if (i != 2) {
            aooc.af(obj);
        } else {
            aooc.af(obj);
            tojVar = (defpackage.toj) this.d;
            tthVarB = defpackage.tth.b(tojVar.D.m().c);
            if (tthVarB == null) {
                tthVarB = defpackage.tth.UNRECOGNIZED;
            }
            iOrdinal = tthVarB.ordinal();
            if (iOrdinal != 3 || iOrdinal == 4) {
                tojVar.u.a(qbc.lN);
                this.c = 3;
                if (tojVar.f(true, this) == aoluVar2) {
                    return aoluVar2;
                }
            } else if (iOrdinal == 5 || iOrdinal == 7) {
                defpackage.tth tthVar = defpackage.tth.ENDED;
                this.c = 4;
                if (tojVar.v(tthVar, true, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
        }
        return aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toa(defpackage.toj tojVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.d = tojVar;
    }
}
