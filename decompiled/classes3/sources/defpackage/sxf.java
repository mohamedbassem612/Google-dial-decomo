package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxf extends aomh implements aonn {
    long a;
    int b;
    final /* synthetic */ lmq c;
    final /* synthetic */ defpackage.sxj d;
    final /* synthetic */ defpackage.sxg e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxf(lmq lmqVar, defpackage.sxj sxjVar, defpackage.sxg sxgVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = lmqVar;
        this.d = sxjVar;
        this.e = sxgVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x0174  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.String strB;
        long creationTimeMillis;
        long j;
        java.lang.Object objD;
        long j2;
        defpackage.tbe tbeVarB;
        defpackage.tbe tbeVarB2;
        defpackage.tbe tbeVarB3;
        defpackage.tbe tbeVarB4;
        java.lang.Object objD2;
        j$.util.Optional optional;
        defpackage.rhb rhbVar;
        j$.util.Optional optional2;
        zzc zzcVarH;
        zdi zdiVar;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i == 0) {
            aooc.af(obj);
            aoss aossVar = (aoss) this.f;
            defpackage.sxg.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/callscreeningservice/TidepodsRevelioIncomingCallScreeningEndedListener", "handleRejectionResponse$<anonymous>", 118, "TidepodsRevelioIncomingCallScreeningEndedListener.kt").v("call was rejected");
            lmq lmqVar = this.c;
            android.telecom.Call.Details details = lmqVar.a;
            strB = defpackage.ura.b(details);
            creationTimeMillis = details.getCreationTimeMillis();
            defpackage.sxi sxiVar = this.d.a;
            if (sxiVar == defpackage.sxi.b) {
                ajcq ajcqVarE = this.e.k.e();
                this.f = strB;
                this.a = creationTimeMillis;
                this.b = 1;
                objD = aosv.D(ajcqVarE, this);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                j2 = creationTimeMillis;
                tbf tbfVar = (tbf) objD;
                akzx akzxVarM = defpackage.amre.a.m();
                tbeVarB = defpackage.tbe.b(tbfVar.e);
                if (tbeVarB == null) {
                    tbeVarB = defpackage.tbe.NOT_SET_BY_USER;
                }
                akzxVarM.u();
                defpackage.amre amreVar = (defpackage.amre) akzxVarM.b;
                amreVar.d = tbeVarB.e;
                amreVar.b |= 2;
                tbeVarB2 = defpackage.tbe.b(tbfVar.f);
                if (tbeVarB2 == null) {
                    tbeVarB2 = defpackage.tbe.NOT_SET_BY_USER;
                }
                akzxVarM.u();
                defpackage.amre amreVar2 = (defpackage.amre) akzxVarM.b;
                amreVar2.e = tbeVarB2.e;
                amreVar2.b |= 4;
                tbeVarB3 = defpackage.tbe.b(tbfVar.g);
                if (tbeVarB3 == null) {
                    tbeVarB3 = defpackage.tbe.NOT_SET_BY_USER;
                }
                akzxVarM.u();
                defpackage.amre amreVar3 = (defpackage.amre) akzxVarM.b;
                amreVar3.f = tbeVarB3.e;
                amreVar3.b |= 8;
                tbeVarB4 = defpackage.tbe.b(tbfVar.h);
                if (tbeVarB4 == null) {
                    tbeVarB4 = defpackage.tbe.NOT_SET_BY_USER;
                }
                akzxVarM.u();
                defpackage.amre amreVar4 = (defpackage.amre) akzxVarM.b;
                amreVar4.g = tbeVarB4.e;
                amreVar4.b |= 16;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.amre amreVar5 = (defpackage.amre) aladVarP;
                if (strB != null) {
                }
                creationTimeMillis = j2;
            } else if (sxiVar == defpackage.sxi.a) {
                aimz aimzVar = zih.a;
                defpackage.sxg sxgVar = this.e;
                aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.sxe(null, sxgVar, creationTimeMillis, strB, lmqVar));
                ajcq ajcqVarA = sxgVar.h.a(creationTimeMillis, new lct(16));
                this.a = creationTimeMillis;
                this.b = 3;
                if (aosv.D(ajcqVarA, this) == aoluVar) {
                    return aoluVar;
                }
                j = creationTimeMillis;
                creationTimeMillis = j;
            }
            ajcq ajcqVarA2 = this.e.h.d.a(creationTimeMillis);
            this.f = null;
            this.b = 4;
            objD2 = aosv.D(ajcqVarA2, this);
            if (objD2 == aoluVar) {
                return aoluVar;
            }
            optional = (j$.util.Optional) objD2;
            if (optional.isPresent()) {
                akzx akzxVarM2 = amow.a.m();
                defpackage.amrf amrfVar = (defpackage.amrf) optional.orElseThrow();
                akzxVarM2.u();
                amow amowVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(amrfVar);
                amowVar.M = amrfVar;
                amowVar.c |= 4096;
                defpackage.sxg sxgVar2 = this.e;
                akzx akzxVarM3 = ampv.a.m();
                defpackage.taj tajVar = new defpackage.taj(new defpackage.skk(14), 1);
                j$.util.Optional optional3 = sxgVar2.i;
                optional3.isPresent();
                java.lang.Object objA = tajVar.a.a(optional3.get());
                objA.getClass();
                rhbVar = new defpackage.rhb(new defpackage.skx(akzxVarM3, 18), 17);
                optional2 = (j$.util.Optional) objA;
                if (true == optional2.isPresent()) {
                    rhbVar.a.a(optional2.get());
                }
                ampw ampwVarBd = sxgVar2.n.bd();
                akzxVarM3.u();
                ampv ampvVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull(ampwVarBd);
                ampvVar.s = ampwVarBd;
                ampvVar.c |= 1;
                aooh.e(akzxVarM3, "apply(...)");
                akzxVarM3.u();
                ampv ampvVar2 = akzxVarM3.b;
                amow amowVarP = akzxVarM2.p();
                j$.util.Objects.requireNonNull(amowVarP);
                ampvVar2.d = amowVarP;
                ampvVar2.b |= 1;
                zzcVarH = sxgVar2.d.h(akzxVarM3.p(), abtl.b(sxgVar2.b, new apdz()));
                zdiVar = sxgVar2.j;
                this.b = 5;
                if (zdiVar.b(zzcVarH, this) == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i == 1) {
            j2 = this.a;
            java.lang.String str = (java.lang.String) this.f;
            aooc.af(obj);
            strB = str;
            objD = obj;
            tbf tbfVar2 = (tbf) objD;
            akzx akzxVarM4 = defpackage.amre.a.m();
            tbeVarB = defpackage.tbe.b(tbfVar2.e);
            if (tbeVarB == null) {
                tbeVarB = defpackage.tbe.NOT_SET_BY_USER;
            }
            akzxVarM4.u();
            defpackage.amre amreVar6 = (defpackage.amre) akzxVarM4.b;
            amreVar6.d = tbeVarB.e;
            amreVar6.b |= 2;
            tbeVarB2 = defpackage.tbe.b(tbfVar2.f);
            if (tbeVarB2 == null) {
                tbeVarB2 = defpackage.tbe.NOT_SET_BY_USER;
            }
            akzxVarM4.u();
            defpackage.amre amreVar7 = (defpackage.amre) akzxVarM4.b;
            amreVar7.e = tbeVarB2.e;
            amreVar7.b |= 4;
            tbeVarB3 = defpackage.tbe.b(tbfVar2.g);
            if (tbeVarB3 == null) {
                tbeVarB3 = defpackage.tbe.NOT_SET_BY_USER;
            }
            akzxVarM4.u();
            defpackage.amre amreVar8 = (defpackage.amre) akzxVarM4.b;
            amreVar8.f = tbeVarB3.e;
            amreVar8.b |= 8;
            tbeVarB4 = defpackage.tbe.b(tbfVar2.h);
            if (tbeVarB4 == null) {
                tbeVarB4 = defpackage.tbe.NOT_SET_BY_USER;
            }
            akzxVarM4.u();
            defpackage.amre amreVar9 = (defpackage.amre) akzxVarM4.b;
            amreVar9.g = tbeVarB4.e;
            amreVar9.b |= 16;
            alad aladVarP2 = akzxVarM4.p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.amre amreVar10 = (defpackage.amre) aladVarP2;
            if (strB != null || strB.length() == 0) {
                creationTimeMillis = j2;
            } else {
                defpackage.sxg sxgVar3 = this.e;
                sxgVar3.e.n(rmw.hW);
                defpackage.ufz ufzVar = new defpackage.ufz(strB, null, pez.bg(amreVar10), new java.lang.Long(j2));
                this.f = null;
                this.a = j2;
                this.b = 2;
                if (sxgVar3.l.g(ufzVar, this) == aoluVar) {
                    return aoluVar;
                }
                j = j2;
                creationTimeMillis = j;
            }
            ajcq ajcqVarA3 = this.e.h.d.a(creationTimeMillis);
            this.f = null;
            this.b = 4;
            objD2 = aosv.D(ajcqVarA3, this);
            if (objD2 == aoluVar) {
                return aoluVar;
            }
            optional = (j$.util.Optional) objD2;
            if (optional.isPresent()) {
                akzx akzxVarM5 = amow.a.m();
                defpackage.amrf amrfVar2 = (defpackage.amrf) optional.orElseThrow();
                akzxVarM5.u();
                amow amowVar2 = akzxVarM5.b;
                j$.util.Objects.requireNonNull(amrfVar2);
                amowVar2.M = amrfVar2;
                amowVar2.c |= 4096;
                defpackage.sxg sxgVar4 = this.e;
                akzx akzxVarM6 = ampv.a.m();
                defpackage.taj tajVar2 = new defpackage.taj(new defpackage.skk(14), 1);
                j$.util.Optional optional4 = sxgVar4.i;
                optional4.isPresent();
                java.lang.Object objA2 = tajVar2.a.a(optional4.get());
                objA2.getClass();
                rhbVar = new defpackage.rhb(new defpackage.skx(akzxVarM6, 18), 17);
                optional2 = (j$.util.Optional) objA2;
                if (true == optional2.isPresent()) {
                    rhbVar.a.a(optional2.get());
                }
                ampw ampwVarBd2 = sxgVar4.n.bd();
                akzxVarM6.u();
                ampv ampvVar3 = akzxVarM6.b;
                j$.util.Objects.requireNonNull(ampwVarBd2);
                ampvVar3.s = ampwVarBd2;
                ampvVar3.c |= 1;
                aooh.e(akzxVarM6, "apply(...)");
                akzxVarM6.u();
                ampv ampvVar4 = akzxVarM6.b;
                amow amowVarP2 = akzxVarM5.p();
                j$.util.Objects.requireNonNull(amowVarP2);
                ampvVar4.d = amowVarP2;
                ampvVar4.b |= 1;
                zzcVarH = sxgVar4.d.h(akzxVarM6.p(), abtl.b(sxgVar4.b, new apdz()));
                zdiVar = sxgVar4.j;
                this.b = 5;
                if (zdiVar.b(zzcVarH, this) == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i == 2 || i == 3) {
            j = this.a;
            aooc.af(obj);
            creationTimeMillis = j;
            ajcq ajcqVarA4 = this.e.h.d.a(creationTimeMillis);
            this.f = null;
            this.b = 4;
            objD2 = aosv.D(ajcqVarA4, this);
            if (objD2 == aoluVar) {
                return aoluVar;
            }
            optional = (j$.util.Optional) objD2;
            if (optional.isPresent()) {
                akzx akzxVarM7 = amow.a.m();
                defpackage.amrf amrfVar3 = (defpackage.amrf) optional.orElseThrow();
                akzxVarM7.u();
                amow amowVar3 = akzxVarM7.b;
                j$.util.Objects.requireNonNull(amrfVar3);
                amowVar3.M = amrfVar3;
                amowVar3.c |= 4096;
                defpackage.sxg sxgVar5 = this.e;
                akzx akzxVarM8 = ampv.a.m();
                defpackage.taj tajVar3 = new defpackage.taj(new defpackage.skk(14), 1);
                j$.util.Optional optional5 = sxgVar5.i;
                optional5.isPresent();
                java.lang.Object objA3 = tajVar3.a.a(optional5.get());
                objA3.getClass();
                rhbVar = new defpackage.rhb(new defpackage.skx(akzxVarM8, 18), 17);
                optional2 = (j$.util.Optional) objA3;
                if (true == optional2.isPresent()) {
                    rhbVar.a.a(optional2.get());
                }
                ampw ampwVarBd3 = sxgVar5.n.bd();
                akzxVarM8.u();
                ampv ampvVar5 = akzxVarM8.b;
                j$.util.Objects.requireNonNull(ampwVarBd3);
                ampvVar5.s = ampwVarBd3;
                ampvVar5.c |= 1;
                aooh.e(akzxVarM8, "apply(...)");
                akzxVarM8.u();
                ampv ampvVar6 = akzxVarM8.b;
                amow amowVarP3 = akzxVarM7.p();
                j$.util.Objects.requireNonNull(amowVarP3);
                ampvVar6.d = amowVarP3;
                ampvVar6.b |= 1;
                zzcVarH = sxgVar5.d.h(akzxVarM8.p(), abtl.b(sxgVar5.b, new apdz()));
                zdiVar = sxgVar5.j;
                this.b = 5;
                if (zdiVar.b(zzcVarH, this) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            aooc.af(obj);
            if (i == 4) {
                objD2 = obj;
                optional = (j$.util.Optional) objD2;
                if (optional.isPresent()) {
                    akzx akzxVarM9 = amow.a.m();
                    defpackage.amrf amrfVar4 = (defpackage.amrf) optional.orElseThrow();
                    akzxVarM9.u();
                    amow amowVar4 = akzxVarM9.b;
                    j$.util.Objects.requireNonNull(amrfVar4);
                    amowVar4.M = amrfVar4;
                    amowVar4.c |= 4096;
                    defpackage.sxg sxgVar6 = this.e;
                    akzx akzxVarM10 = ampv.a.m();
                    defpackage.taj tajVar4 = new defpackage.taj(new defpackage.skk(14), 1);
                    j$.util.Optional optional6 = sxgVar6.i;
                    optional6.isPresent();
                    java.lang.Object objA4 = tajVar4.a.a(optional6.get());
                    objA4.getClass();
                    rhbVar = new defpackage.rhb(new defpackage.skx(akzxVarM10, 18), 17);
                    optional2 = (j$.util.Optional) objA4;
                    if (true == optional2.isPresent()) {
                        rhbVar.a.a(optional2.get());
                    }
                    ampw ampwVarBd4 = sxgVar6.n.bd();
                    akzxVarM10.u();
                    ampv ampvVar7 = akzxVarM10.b;
                    j$.util.Objects.requireNonNull(ampwVarBd4);
                    ampvVar7.s = ampwVarBd4;
                    ampvVar7.c |= 1;
                    aooh.e(akzxVarM10, "apply(...)");
                    akzxVarM10.u();
                    ampv ampvVar8 = akzxVarM10.b;
                    amow amowVarP4 = akzxVarM9.p();
                    j$.util.Objects.requireNonNull(amowVarP4);
                    ampvVar8.d = amowVarP4;
                    ampvVar8.b |= 1;
                    zzcVarH = sxgVar6.d.h(akzxVarM10.p(), abtl.b(sxgVar6.b, new apdz()));
                    zdiVar = sxgVar6.j;
                    this.b = 5;
                    if (zdiVar.b(zzcVarH, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.sxf sxfVar = new defpackage.sxf(this.c, this.d, this.e, aolnVar);
        sxfVar.f = obj;
        return sxfVar;
    }
}
