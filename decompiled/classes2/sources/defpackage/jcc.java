package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jcc implements agxi {
    public static final agxj a = new agxj("BeeslySettingsDataSourceKey");
    private static final j$.time.Duration g;
    public final jbm b;
    public final tzb c;
    public final iwc d;
    public final iqm e;
    public final aazc f;
    private final android.content.Context h;
    private final aoss i;
    private final ish j;
    private final defpackage.jcf k;
    private final aoin l;
    private final ivi m;
    private final ysb n;
    private final ils o;

    static {
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(3L);
        aooh.e(durationOfSeconds, "ofSeconds(...)");
        g = durationOfSeconds;
    }

    public jcc(android.content.Context context, aoss aossVar, aazc aazcVar, jbm jbmVar, tzb tzbVar, ils ilsVar, ish ishVar, defpackage.jcf jcfVar, iwc iwcVar, aoin aoinVar, ysb ysbVar, ivi iviVar, iqm iqmVar) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aazcVar, "clock");
        aooh.f(jbmVar, "beeslySettings");
        aooh.f(ishVar, "beeslySingletonAudioPrismConfigProvider");
        aooh.f(jcfVar, "beeslySettingsModelDownloader");
        aooh.f(iwcVar, "beeslySingletonLocaleProvider");
        aooh.f(aoinVar, "enableBeeslySmartAction");
        aooh.f(ysbVar, "aiCoreAvailability");
        this.h = context;
        this.i = aossVar;
        this.f = aazcVar;
        this.b = jbmVar;
        this.c = tzbVar;
        this.o = ilsVar;
        this.j = ishVar;
        this.k = jcfVar;
        this.d = iwcVar;
        this.l = aoinVar;
        this.n = ysbVar;
        this.m = iviVar;
        this.e = iqmVar;
    }

    public final ajbg a() {
        return new ajbg(aosv.F(this.i, 0, new icp(this, (aoln) null, 14), 3));
    }

    public final ajcq b() {
        return aosv.F(this.i, 0, new defpackage.jbw(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.jbx jbxVar;
        tyy tyyVarB;
        if (aolnVar instanceof defpackage.jbx) {
            jbxVar = (defpackage.jbx) aolnVar;
            int i = jbxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbxVar.c = i - Integer.MIN_VALUE;
            } else {
                jbxVar = new defpackage.jbx(this, aolnVar);
            }
        } else {
            jbxVar = new defpackage.jbx(this, aolnVar);
        }
        java.lang.Object objB = jbxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jbxVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
                return java.lang.Boolean.valueOf(((ysc) objB).a());
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
            tyyVarB = tyy.b(((tyz) objB).e);
            if (tyyVarB == null) {
                tyyVarB = tyy.e;
            }
            return java.lang.Boolean.valueOf(tyyVarB == tyy.d);
        }
        aooc.af(objB);
        if (((java.lang.Boolean) this.l.a()).booleanValue()) {
            ysb ysbVar = this.n;
            yse yseVar = yse.b;
            jbxVar.c = 1;
            objB = ysbVar.a(yseVar, jbxVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            return java.lang.Boolean.valueOf(((ysc) objB).a());
        }
        if (!this.e.g()) {
            return java.lang.Boolean.TRUE;
        }
        tzb tzbVar = this.c;
        java.lang.Integer num = this.d.h.g() ? 255 : null;
        jbxVar.c = 2;
        objB = tzbVar.b(akff.a(gus.ae(tzbVar.b).toLanguageTag()), num, jbxVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        tyyVarB = tyy.b(((tyz) objB).e);
        if (tyyVarB == null) {
            tyyVarB = tyy.e;
        }
        return java.lang.Boolean.valueOf(tyyVarB == tyy.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.jby jbyVar;
        ils ilsVar;
        if (aolnVar instanceof defpackage.jby) {
            jbyVar = (defpackage.jby) aolnVar;
            int i = jbyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbyVar.c = i - Integer.MIN_VALUE;
            } else {
                jbyVar = new defpackage.jby(this, aolnVar);
            }
        } else {
            jbyVar = new defpackage.jby(this, aolnVar);
        }
        java.lang.Object obj = jbyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jbyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!this.e.b()) {
                ils ilsVar2 = this.o;
                ish ishVar = this.j;
                jbyVar.d = ilsVar2;
                jbyVar.c = 1;
                java.lang.Object objB = ishVar.b(jbyVar);
                if (objB != aoluVar) {
                    obj = objB;
                    ilsVar = ilsVar2;
                }
                return aoluVar;
            }
            defpackage.heq heqVarK = defpackage.hhk.k(defpackage.igp.a.m());
            heqVarK.l();
            defpackage.heq heqVarY = defpackage.hhe.y(defpackage.igo.a.m());
            heqVarY.o(true);
            defpackage.igo igoVarM = heqVarY.m();
            aooh.f(igoVarM, "value");
            akzx akzxVar = (akzx) heqVarK.a;
            akzxVar.u();
            defpackage.igp igpVar = (defpackage.igp) akzxVar.b;
            j$.util.Objects.requireNonNull(igoVarM);
            igpVar.b();
            igpVar.b.add(igoVarM);
            return heqVarK.k();
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return obj;
        }
        ilsVar = jbyVar.d;
        aooc.af(obj);
        igs igsVar = ((igf) obj).f;
        if (igsVar == null) {
            igsVar = igs.a;
        }
        aooh.e(igsVar, "getCompositeModelConfig(...)");
        jbyVar.d = null;
        jbyVar.c = 2;
        java.lang.Object objC = ilsVar.c(igsVar, jbyVar);
        if (objC != aoluVar) {
            return objC;
        }
        return aoluVar;
    }

    public final /* synthetic */ java.lang.Object e() {
        return a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:50:0x018c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX WARN: Code duplicated, block: B:52:0x0196  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.jbz jbzVar;
        jbr jbrVar;
        boolean zBooleanValue;
        java.lang.Object objB;
        boolean z;
        jbr jbrVar2;
        defpackage.jbn jbnVarB;
        jbp jbpVar;
        jbp jbpVar2;
        tyz tyzVar;
        defpackage.hgw hgwVarC;
        uzx uzxVarCf;
        java.lang.Object objH;
        defpackage.jbn jbnVar;
        uzx uzxVar;
        defpackage.hgw hgwVar;
        defpackage.hgw hgwVar2;
        defpackage.hgw hgwVar3;
        uzx uzxVar2;
        alcf alcfVar;
        if (aolnVar instanceof defpackage.jbz) {
            jbzVar = (defpackage.jbz) aolnVar;
            int i = jbzVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbzVar.e = i - Integer.MIN_VALUE;
            } else {
                jbzVar = new defpackage.jbz(this, aolnVar);
            }
        } else {
            jbzVar = new defpackage.jbz(this, aolnVar);
        }
        java.lang.Object objB2 = jbzVar.c;
        aolu aoluVar = aolu.a;
        int i2 = jbzVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB2);
            } else if (i2 == 2) {
                jbrVar = (jbr) jbzVar.a;
                aooc.af(objB2);
                zBooleanValue = ((java.lang.Boolean) objB2).booleanValue();
                jbm jbmVar = this.b;
                jbzVar.a = jbrVar;
                jbzVar.b = zBooleanValue;
                jbzVar.e = 3;
                objB = jbmVar.b(jbzVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                jbr jbrVar3 = jbrVar;
                z = zBooleanValue;
                objB2 = objB;
                jbrVar2 = jbrVar3;
                jbnVarB = defpackage.jbn.b(((jbr) objB2).c);
                if (jbnVarB == null) {
                    jbnVarB = defpackage.jbn.UNRECOGNIZED;
                }
                if ((jbrVar2.b & 2) == 0) {
                    defpackage.hgw hgwVarC2 = defpackage.hhe.C(defpackage.jcd.a.m());
                    hgwVarC2.j(z);
                    hgwVarC2.i(jbnVarB == defpackage.jbn.DISABLED_BY_EMM);
                    return agxh.b(hgwVarC2.h());
                }
                jbpVar = jbrVar2.d;
                if (jbpVar == null) {
                    jbpVar = jbp.a;
                }
                jbpVar2 = jbpVar;
                aooh.e(jbpVar2, "getCachedExternalStates(...)");
                boolean z2 = jbrVar2.h;
                tyzVar = jbpVar2.d;
                if (tyzVar == null) {
                    tyzVar = tyz.a;
                }
                aooh.e(tyzVar, "getSodaStatus(...)");
                hgwVarC = defpackage.hhe.C(defpackage.jcd.a.m());
                hgwVarC.j(z);
                uzxVarCf = wsc.cf(tyw.a.m());
                java.lang.String str = tyzVar.c;
                aooh.e(str, "getLanguageCode(...)");
                uzxVarCf.y(str);
                java.lang.String string = this.h.getString(2132017559);
                aooh.e(string, "getString(...)");
                uzxVarCf.w(string);
                jbzVar.a = jbnVarB;
                jbzVar.f = jbpVar2;
                jbzVar.j = hgwVarC;
                jbzVar.k = hgwVarC;
                jbzVar.g = uzxVarCf;
                jbzVar.h = uzxVarCf;
                jbzVar.l = hgwVarC;
                jbzVar.i = uzxVarCf;
                jbzVar.e = 4;
                objH = h(jbpVar2, z2, jbzVar);
                if (objH == aoluVar) {
                    return aoluVar;
                }
                jbnVar = jbnVarB;
                uzxVar = uzxVarCf;
                hgwVar = hgwVarC;
                hgwVar2 = hgwVar;
                hgwVar3 = hgwVar2;
                objB2 = objH;
                uzxVar2 = uzxVar;
            } else if (i2 == 3) {
                z = jbzVar.b;
                jbrVar2 = (jbr) jbzVar.a;
                aooc.af(objB2);
                jbnVarB = defpackage.jbn.b(((jbr) objB2).c);
                if (jbnVarB == null) {
                    jbnVarB = defpackage.jbn.UNRECOGNIZED;
                }
                if ((jbrVar2.b & 2) == 0) {
                    defpackage.hgw hgwVarC3 = defpackage.hhe.C(defpackage.jcd.a.m());
                    hgwVarC3.j(z);
                    hgwVarC3.i(jbnVarB == defpackage.jbn.DISABLED_BY_EMM);
                    return agxh.b(hgwVarC3.h());
                }
                jbpVar = jbrVar2.d;
                if (jbpVar == null) {
                    jbpVar = jbp.a;
                }
                jbpVar2 = jbpVar;
                aooh.e(jbpVar2, "getCachedExternalStates(...)");
                boolean z3 = jbrVar2.h;
                tyzVar = jbpVar2.d;
                if (tyzVar == null) {
                    tyzVar = tyz.a;
                }
                aooh.e(tyzVar, "getSodaStatus(...)");
                hgwVarC = defpackage.hhe.C(defpackage.jcd.a.m());
                hgwVarC.j(z);
                uzxVarCf = wsc.cf(tyw.a.m());
                java.lang.String str2 = tyzVar.c;
                aooh.e(str2, "getLanguageCode(...)");
                uzxVarCf.y(str2);
                java.lang.String string2 = this.h.getString(2132017559);
                aooh.e(string2, "getString(...)");
                uzxVarCf.w(string2);
                jbzVar.a = jbnVarB;
                jbzVar.f = jbpVar2;
                jbzVar.j = hgwVarC;
                jbzVar.k = hgwVarC;
                jbzVar.g = uzxVarCf;
                jbzVar.h = uzxVarCf;
                jbzVar.l = hgwVarC;
                jbzVar.i = uzxVarCf;
                jbzVar.e = 4;
                objH = h(jbpVar2, z3, jbzVar);
                if (objH == aoluVar) {
                    return aoluVar;
                }
                jbnVar = jbnVarB;
                uzxVar = uzxVarCf;
                hgwVar = hgwVarC;
                hgwVar2 = hgwVar;
                hgwVar3 = hgwVar2;
                objB2 = objH;
                uzxVar2 = uzxVar;
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uzxVar2 = jbzVar.i;
                hgwVar = jbzVar.l;
                uzxVarCf = jbzVar.h;
                uzxVar = jbzVar.g;
                hgwVar2 = jbzVar.k;
                hgwVar3 = jbzVar.j;
                jbpVar2 = jbzVar.f;
                jbnVar = (defpackage.jbn) jbzVar.a;
                aooc.af(objB2);
            }
            uzxVar2.u((tyv) objB2);
            uzxVarCf.x(true);
            tyw tywVarT = uzxVar.t();
            aooh.f(tywVarT, "value");
            akzx akzxVar = (akzx) hgwVar.a;
            akzxVar.u();
            defpackage.jcd jcdVar = (defpackage.jcd) akzxVar.b;
            defpackage.jcd jcdVar2 = defpackage.jcd.a;
            j$.util.Objects.requireNonNull(tywVarT);
            jcdVar.d = tywVarT;
            jcdVar.b |= 2;
            boolean z4 = jbpVar2.g;
            akzx akzxVar2 = (akzx) hgwVar2.a;
            akzxVar2.u();
            defpackage.jcd jcdVar3 = (defpackage.jcd) akzxVar2.b;
            jcdVar3.b |= 32;
            jcdVar3.e = z4;
            boolean z5 = jbpVar2.f;
            akzxVar2.u();
            defpackage.jcd jcdVar4 = (defpackage.jcd) akzxVar2.b;
            jcdVar4.b |= 128;
            jcdVar4.g = z5;
            hgwVar2.i(jbnVar == defpackage.jbn.DISABLED_BY_EMM);
            defpackage.jcd jcdVarH = hgwVar3.h();
            alcfVar = jbpVar2.c;
            if (alcfVar == null) {
                alcfVar = alcf.a;
            }
            aooh.e(alcfVar, "getLastUpdateTimestamp(...)");
            j$.time.Instant instantAw = aooc.aw(alcfVar);
            return j$.time.Instant.now().minus(g).compareTo(instantAw) <= 0 ? agxh.a(jcdVarH, instantAw) : agxh.b(jcdVarH);
        }
        aooc.af(objB2);
        jbm jbmVar2 = this.b;
        jbzVar.e = 1;
        objB2 = jbmVar2.b(jbzVar);
        if (objB2 == aoluVar) {
            return aoluVar;
        }
        jbm jbmVar3 = this.b;
        jbr jbrVar4 = (jbr) objB2;
        jbzVar.a = jbrVar4;
        jbzVar.e = 2;
        java.lang.Object objG = jbmVar3.g(jbzVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        jbrVar = jbrVar4;
        objB2 = objG;
        zBooleanValue = ((java.lang.Boolean) objB2).booleanValue();
        jbm jbmVar4 = this.b;
        jbzVar.a = jbrVar;
        jbzVar.b = zBooleanValue;
        jbzVar.e = 3;
        objB = jbmVar4.b(jbzVar);
        if (objB != aoluVar) {
            return aoluVar;
        }
        jbr jbrVar5 = jbrVar;
        z = zBooleanValue;
        objB2 = objB;
        jbrVar2 = jbrVar5;
        jbnVarB = defpackage.jbn.b(((jbr) objB2).c);
        if (jbnVarB == null) {
            jbnVarB = defpackage.jbn.UNRECOGNIZED;
        }
        if ((jbrVar2.b & 2) == 0) {
            defpackage.hgw hgwVarC4 = defpackage.hhe.C(defpackage.jcd.a.m());
            hgwVarC4.j(z);
            hgwVarC4.i(jbnVarB == defpackage.jbn.DISABLED_BY_EMM);
            return agxh.b(hgwVarC4.h());
        }
        jbpVar = jbrVar2.d;
        if (jbpVar == null) {
            jbpVar = jbp.a;
        }
        jbpVar2 = jbpVar;
        aooh.e(jbpVar2, "getCachedExternalStates(...)");
        boolean z6 = jbrVar2.h;
        tyzVar = jbpVar2.d;
        if (tyzVar == null) {
            tyzVar = tyz.a;
        }
        aooh.e(tyzVar, "getSodaStatus(...)");
        hgwVarC = defpackage.hhe.C(defpackage.jcd.a.m());
        hgwVarC.j(z);
        uzxVarCf = wsc.cf(tyw.a.m());
        java.lang.String str3 = tyzVar.c;
        aooh.e(str3, "getLanguageCode(...)");
        uzxVarCf.y(str3);
        java.lang.String string3 = this.h.getString(2132017559);
        aooh.e(string3, "getString(...)");
        uzxVarCf.w(string3);
        jbzVar.a = jbnVarB;
        jbzVar.f = jbpVar2;
        jbzVar.j = hgwVarC;
        jbzVar.k = hgwVarC;
        jbzVar.g = uzxVarCf;
        jbzVar.h = uzxVarCf;
        jbzVar.l = hgwVarC;
        jbzVar.i = uzxVarCf;
        jbzVar.e = 4;
        objH = h(jbpVar2, z6, jbzVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        jbnVar = jbnVarB;
        uzxVar = uzxVarCf;
        hgwVar = hgwVarC;
        hgwVar2 = hgwVar;
        hgwVar3 = hgwVar2;
        objB2 = objH;
        uzxVar2 = uzxVar;
        uzxVar2.u((tyv) objB2);
        uzxVarCf.x(true);
        tyw tywVarT2 = uzxVar.t();
        aooh.f(tywVarT2, "value");
        akzx akzxVar3 = (akzx) hgwVar.a;
        akzxVar3.u();
        defpackage.jcd jcdVar5 = (defpackage.jcd) akzxVar3.b;
        defpackage.jcd jcdVar6 = defpackage.jcd.a;
        j$.util.Objects.requireNonNull(tywVarT2);
        jcdVar5.d = tywVarT2;
        jcdVar5.b |= 2;
        boolean z7 = jbpVar2.g;
        akzx akzxVar4 = (akzx) hgwVar2.a;
        akzxVar4.u();
        defpackage.jcd jcdVar7 = (defpackage.jcd) akzxVar4.b;
        jcdVar7.b |= 32;
        jcdVar7.e = z7;
        boolean z8 = jbpVar2.f;
        akzxVar4.u();
        defpackage.jcd jcdVar8 = (defpackage.jcd) akzxVar4.b;
        jcdVar8.b |= 128;
        jcdVar8.g = z8;
        hgwVar2.i(jbnVar == defpackage.jbn.DISABLED_BY_EMM);
        defpackage.jcd jcdVarH2 = hgwVar3.h();
        alcfVar = jbpVar2.c;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        aooh.e(alcfVar, "getLastUpdateTimestamp(...)");
        j$.time.Instant instantAw2 = aooc.aw(alcfVar);
        if (j$.time.Instant.now().minus(g).compareTo(instantAw2) <= 0) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) throws aois {
        defpackage.jca jcaVar;
        if (aolnVar instanceof defpackage.jca) {
            jcaVar = (defpackage.jca) aolnVar;
            int i = jcaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jcaVar.c = i - Integer.MIN_VALUE;
            } else {
                jcaVar = new defpackage.jca(this, aolnVar);
            }
        } else {
            jcaVar = new defpackage.jca(this, aolnVar);
        }
        java.lang.Object objA = jcaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jcaVar.c;
        boolean z = false;
        if (i2 == 0) {
            aooc.af(objA);
            if (((java.lang.Boolean) this.l.a()).booleanValue()) {
                ysb ysbVar = this.n;
                yse yseVar = yse.b;
                jcaVar.c = 1;
                objA = ysbVar.a(yseVar, jcaVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objA);
        ysc yscVar = (ysc) objA;
        if (yscVar.b) {
            switch (yscVar.a.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    z = true;
                    break;
                case 5:
                case 6:
                    break;
                default:
                    throw new aois();
            }
        } else {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(jbp jbpVar, boolean z, aoln aolnVar) {
        defpackage.jcb jcbVar;
        boolean zBooleanValue;
        int i;
        tyz tyzVar;
        int iBY;
        tyz tyzVar2;
        if (aolnVar instanceof defpackage.jcb) {
            jcbVar = (defpackage.jcb) aolnVar;
            int i2 = jcbVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jcbVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jcbVar = new defpackage.jcb(this, aolnVar);
            }
        } else {
            jcbVar = new defpackage.jcb(this, aolnVar);
        }
        java.lang.Object objH = jcbVar.b;
        aolu aoluVar = aolu.a;
        int i3 = jcbVar.d;
        if (i3 == 0) {
            aooc.af(objH);
            if (this.e.b()) {
                ivi iviVar = this.m;
                jcbVar.e = jbpVar;
                jcbVar.a = z;
                jcbVar.d = 1;
                objH = iviVar.h((defpackage.orr) null, jcbVar);
                if (objH == aoluVar) {
                    return aoluVar;
                }
            } else {
                defpackage.igp igpVar = jbpVar.e;
                if (igpVar == null) {
                    igpVar = defpackage.igp.a;
                }
                alat alatVar = igpVar.b;
                aooh.e(alatVar, "getIndividualModelAvaila…lityCheckResultsList(...)");
                if (alatVar.isEmpty()) {
                    zBooleanValue = false;
                } else {
                    if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
                        java.util.Iterator it = alatVar.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((defpackage.igo) it.next()).e) {
                                    zBooleanValue = false;
                                }
                            }
                        }
                    }
                    zBooleanValue = true;
                }
            }
            i = this.k.f;
            tyzVar = jbpVar.d;
            if (tyzVar == null) {
                tyzVar = tyz.a;
            }
            iBY = wsc.bY(tyzVar.d);
            if (iBY == 0) {
                iBY = 1;
            }
            if (wsc.bX(iBY).ordinal() != 4) {
                tyzVar2 = jbpVar.d;
                if (tyzVar2 == null) {
                    tyzVar2 = tyz.a;
                }
                int iBY2 = wsc.bY(tyzVar2.d);
                return wsc.bX(iBY2 != 0 ? iBY2 : 1);
            }
            if (zBooleanValue) {
                return tyv.j;
            }
            if (i == 3) {
                return tyv.f;
            }
            return !z ? tyv.h : tyv.i;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = jcbVar.a;
        jbpVar = jcbVar.e;
        aooc.af(objH);
        zBooleanValue = ((java.lang.Boolean) objH).booleanValue();
        i = this.k.f;
        tyzVar = jbpVar.d;
        if (tyzVar == null) {
            tyzVar = tyz.a;
        }
        iBY = wsc.bY(tyzVar.d);
        if (iBY == 0) {
            iBY = 1;
        }
        if (wsc.bX(iBY).ordinal() != 4) {
            tyzVar2 = jbpVar.d;
            if (tyzVar2 == null) {
                tyzVar2 = tyz.a;
            }
            int iBY3 = wsc.bY(tyzVar2.d);
            return wsc.bX(iBY3 != 0 ? iBY3 : 1);
        }
        if (zBooleanValue) {
            return tyv.j;
        }
        if (i == 3) {
            return tyv.f;
        }
        if (!z) {
        }
    }
}
