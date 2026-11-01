package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tsj implements defpackage.agxi {
    public final defpackage.aoss e;
    public final tzb f;
    public final defpackage.rlv g;
    public final defpackage.tlb h;
    public boolean i;
    public final defpackage.yvh j;
    public final defpackage.ahda k;
    public final defpackage.aogc l;
    private final android.content.Context o;
    private final defpackage.ajxw p;
    public static final defpackage.agxj a = new defpackage.agxj("SharpieSettingsDataSourceKey");
    private static final j$.time.Duration m = j$.time.Duration.ofSeconds(3);
    private static final defpackage.aimz n = defpackage.aimz.i("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsFragmentDataSource");
    public static final java.util.Set b = defpackage.ajsz.cW(new yuy[]{yuy.a, yuy.b, yuy.c, yuy.e, yuy.f, yuy.g});
    public static final java.util.Set c = defpackage.ajsz.cW(new yuy[]{yuy.a, yuy.b, yuy.c, yuy.e, yuy.f});
    public static final java.util.Set d = defpackage.ajsz.cW(new yuy[]{yuy.h, yuy.i});

    public tsj(android.content.Context context, defpackage.aoss aossVar, defpackage.aazc aazcVar, defpackage.aogc aogcVar, tzb tzbVar, defpackage.ajxw ajxwVar, defpackage.rlv rlvVar, defpackage.tlb tlbVar, defpackage.yvh yvhVar) {
        defpackage.aooh.f(context, "appContext");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aogcVar, "sharpieSettings");
        defpackage.aooh.f(ajxwVar, "sharpieSettingsSingletonState");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        this.o = context;
        this.e = aossVar;
        this.l = aogcVar;
        this.f = tzbVar;
        this.p = ajxwVar;
        this.g = rlvVar;
        this.h = tlbVar;
        this.j = yvhVar;
        this.i = true;
        this.k = new defpackage.ahda((byte[]) null);
    }

    private final boolean d(boolean z) {
        return z && this.i;
    }

    @Override // defpackage.agxi
    public final defpackage.ajbg a() {
        return new defpackage.ajbg(defpackage.aosv.F(this.e, 0, new tpd(this, (defpackage.aoln) null, 14), 3));
    }

    @Override // defpackage.agxi
    public final defpackage.ajcq b() {
        return defpackage.aosv.F(this.e, 0, new tsh(this, (defpackage.aoln) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x012b  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0140  */
    /* JADX WARN: Code duplicated, block: B:46:0x0142  */
    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
    /* JADX WARN: Code duplicated, block: B:48:0x0146  */
    /* JADX WARN: Code duplicated, block: B:50:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x014e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0158  */
    /* JADX WARN: Code duplicated, block: B:59:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x016a  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:66:0x018b  */
    /* JADX WARN: Code duplicated, block: B:69:0x021b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0236  */
    /* JADX WARN: Code duplicated, block: B:73:0x023b  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r14v0, types: [aolr, java.lang.Object] */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        tsi tsiVar;
        boolean zB;
        defpackage.trs trsVar;
        defpackage.tru truVar;
        tyz tyzVar;
        java.lang.String str;
        vqu vquVarCw;
        java.lang.Object objAj;
        vqu vquVar;
        boolean z;
        defpackage.trs trsVar2;
        vqu vquVar2;
        defpackage.tru truVar2;
        defpackage.trs trsVar3;
        tsl tslVar;
        boolean z2;
        int i;
        char c2;
        tyz tyzVar2;
        int iBY;
        tyv tyvVarBX;
        defpackage.alcf alcfVar;
        if (aolnVar instanceof tsi) {
            tsiVar = (tsi) aolnVar;
            int i2 = tsiVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tsiVar.e = i2 - Integer.MIN_VALUE;
            } else {
                tsiVar = new tsi(this, aolnVar);
            }
        } else {
            tsiVar = new tsi(this, aolnVar);
        }
        java.lang.Object objAu = tsiVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = tsiVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                defpackage.aooc.af(objAu);
            } else if (i3 == 2) {
                zB = tsiVar.b;
                java.lang.String str2 = (java.lang.String) tsiVar.a;
                tyz tyzVar3 = tsiVar.h;
                defpackage.trs trsVar4 = tsiVar.g;
                truVar = tsiVar.f;
                defpackage.aooc.af(objAu);
                str = str2;
                trsVar = trsVar4;
                tyzVar = tyzVar3;
                if (!defpackage.aooh.n(str, ((java.util.Locale) objAu).toLanguageTag())) {
                    ((defpackage.aimw) n.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsFragmentDataSource", "loadCacheData", 129, "SharpieSettingsFragmentDataSource.kt")).v("Soda language code mismatch, refreshing cache");
                    vqu vquVarCw2 = defpackage.wsc.cw(tsk.a.m());
                    vquVarCw2.ag(d(zB));
                    return defpackage.agxh.b(vquVarCw2.af());
                }
                vquVarCw = defpackage.wsc.cw(tsk.a.m());
                vquVarCw.ag(d(zB));
                defpackage.ajxw ajxwVar = this.p;
                tsiVar.f = truVar;
                tsiVar.g = trsVar;
                tsiVar.h = tyzVar;
                tsiVar.a = vquVarCw;
                tsiVar.j = vquVarCw;
                tsiVar.i = trsVar;
                tsiVar.b = zB;
                tsiVar.e = 3;
                objAj = defpackage.aoov.aj(ajxwVar.a, new tmn(ajxwVar, (defpackage.aoln) null, 2), tsiVar);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                vquVar = vquVarCw;
                z = zB;
                trsVar2 = trsVar;
                vquVar2 = vquVar;
                objAu = objAj;
                truVar2 = truVar;
                trsVar3 = trsVar2;
            } else {
                if (i3 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = tsiVar.b;
                trsVar2 = tsiVar.i;
                vquVar2 = tsiVar.j;
                vquVar = (vqu) tsiVar.a;
                tyzVar = tsiVar.h;
                trsVar3 = tsiVar.g;
                truVar2 = tsiVar.f;
                defpackage.aooc.af(objAu);
            }
            tslVar = (tsl) objAu;
            z2 = truVar2.e;
            i = trsVar2.f;
            if (i != 0) {
                c2 = 2;
            } else if (i != 1) {
                c2 = 3;
            } else if (i != 2) {
                c2 = 0;
            } else {
                c2 = 4;
            }
            if (c2 == 0) {
                c2 = 1;
            }
            tyzVar2 = trsVar2.d;
            if (tyzVar2 == null) {
                tyzVar2 = tyz.a;
            }
            iBY = defpackage.wsc.bY(tyzVar2.d);
            if (iBY == 0) {
                iBY = 1;
            }
            tyvVarBX = defpackage.wsc.bX(iBY);
            if (tyvVarBX.ordinal() == 4) {
                if (c2 == 4) {
                    tyvVarBX = tyv.e;
                } else if (tslVar == tsl.d) {
                    tyvVarBX = tyv.f;
                } else if (z2) {
                    tyvVarBX = tyv.c;
                } else {
                    ((defpackage.aimw) n.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsFragmentDataSource", "setBannerMode", 182, "SharpieSettingsFragmentDataSource.kt")).v("Not connected to Wifi, showing NEED_WIFI banner");
                    tyvVarBX = tyv.h;
                }
            }
            uzx uzxVarCf = defpackage.wsc.cf(tyw.a.m());
            java.lang.String str3 = tyzVar.c;
            defpackage.aooh.e(str3, "getLanguageCode(...)");
            uzxVarCf.y(str3);
            java.lang.String string = this.o.getString(2132020127);
            defpackage.aooh.e(string, "getString(...)");
            uzxVarCf.w(string);
            uzxVarCf.u(tyvVarBX);
            uzxVarCf.x(z);
            tyw tywVarT = uzxVarCf.t();
            defpackage.aooh.f(tywVarT, "value");
            defpackage.akzx akzxVar = (defpackage.akzx) vquVar2.a;
            akzxVar.u();
            tsk tskVar = akzxVar.b;
            tsk tskVar2 = tsk.a;
            j$.util.Objects.requireNonNull(tywVarT);
            tskVar.d = tywVarT;
            tskVar.b |= 1;
            boolean zD = d(!defpackage.ajsz.bb(tyv.f, tyv.c, tyv.d).contains(tyvVarBX));
            akzxVar.u();
            tsk tskVar3 = akzxVar.b;
            tskVar3.b |= 2;
            tskVar3.e = zD;
            boolean z3 = trsVar3.g;
            akzxVar.u();
            tsk tskVar4 = akzxVar.b;
            tskVar4.b |= 4;
            tskVar4.f = z3;
            tsk tskVarAf = vquVar.af();
            alcfVar = trsVar3.c;
            if (alcfVar == null) {
                alcfVar = defpackage.alcf.a;
            }
            defpackage.aooh.e(alcfVar, "getLastUpdateTimestamp(...)");
            j$.time.Instant instantAw = defpackage.aooc.aw(alcfVar);
            return j$.time.Instant.now().minus(m).compareTo(instantAw) <= 0 ? defpackage.agxh.a(tskVarAf, instantAw) : defpackage.agxh.b(tskVarAf);
        }
        defpackage.aooc.af(objAu);
        defpackage.aogc aogcVar = this.l;
        tsiVar.e = 1;
        objAu = aogcVar.au(tsiVar);
        if (objAu == aoluVar) {
            return aoluVar;
        }
        defpackage.tru truVar3 = (defpackage.tru) objAu;
        trv trvVar = trv.a;
        trt trtVarB = trt.b(truVar3.c);
        if (trtVarB == null) {
            trtVarB = trt.f;
        }
        zB = trvVar.b(trtVarB);
        if ((truVar3.b & 1) == 0) {
            vqu vquVarCw3 = defpackage.wsc.cw(tsk.a.m());
            vquVarCw3.ag(d(zB));
            return defpackage.agxh.b(vquVarCw3.af());
        }
        trsVar = truVar3.d;
        if (trsVar == null) {
            trsVar = defpackage.trs.a;
        }
        defpackage.aooh.e(trsVar, "getCachedDownloadStatus(...)");
        tyz tyzVar4 = trsVar.d;
        if (tyzVar4 == null) {
            tyzVar4 = tyz.a;
        }
        defpackage.aooh.e(tyzVar4, "getCachedSodaDownloadStatus(...)");
        defpackage.tlb tlbVar = this.h;
        java.lang.String str4 = tyzVar4.c;
        tsiVar.f = truVar3;
        tsiVar.g = trsVar;
        tsiVar.h = tyzVar4;
        tsiVar.a = str4;
        tsiVar.b = zB;
        tsiVar.e = 2;
        java.lang.Object objA = tlbVar.a(tsiVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        truVar = truVar3;
        objAu = objA;
        tyzVar = tyzVar4;
        str = str4;
        if (!defpackage.aooh.n(str, ((java.util.Locale) objAu).toLanguageTag())) {
            ((defpackage.aimw) n.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsFragmentDataSource", "loadCacheData", 129, "SharpieSettingsFragmentDataSource.kt")).v("Soda language code mismatch, refreshing cache");
            vqu vquVarCw4 = defpackage.wsc.cw(tsk.a.m());
            vquVarCw4.ag(d(zB));
            return defpackage.agxh.b(vquVarCw4.af());
        }
        vquVarCw = defpackage.wsc.cw(tsk.a.m());
        vquVarCw.ag(d(zB));
        defpackage.ajxw ajxwVar2 = this.p;
        tsiVar.f = truVar;
        tsiVar.g = trsVar;
        tsiVar.h = tyzVar;
        tsiVar.a = vquVarCw;
        tsiVar.j = vquVarCw;
        tsiVar.i = trsVar;
        tsiVar.b = zB;
        tsiVar.e = 3;
        objAj = defpackage.aoov.aj(ajxwVar2.a, new tmn(ajxwVar2, (defpackage.aoln) null, 2), tsiVar);
        if (objAj != aoluVar) {
            return aoluVar;
        }
        vquVar = vquVarCw;
        z = zB;
        trsVar2 = trsVar;
        vquVar2 = vquVar;
        objAu = objAj;
        truVar2 = truVar;
        trsVar3 = trsVar2;
        tslVar = (tsl) objAu;
        z2 = truVar2.e;
        i = trsVar2.f;
        if (i != 0) {
            c2 = 2;
        } else if (i != 1) {
            c2 = 3;
        } else if (i != 2) {
            c2 = 0;
        } else {
            c2 = 4;
        }
        if (c2 == 0) {
            c2 = 1;
        }
        tyzVar2 = trsVar2.d;
        if (tyzVar2 == null) {
            tyzVar2 = tyz.a;
        }
        iBY = defpackage.wsc.bY(tyzVar2.d);
        if (iBY == 0) {
            iBY = 1;
        }
        tyvVarBX = defpackage.wsc.bX(iBY);
        if (tyvVarBX.ordinal() == 4) {
            if (c2 == 4) {
                tyvVarBX = tyv.e;
            } else if (tslVar == tsl.d) {
                tyvVarBX = tyv.f;
            } else if (z2) {
                ((defpackage.aimw) n.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieSettingsFragmentDataSource", "setBannerMode", 182, "SharpieSettingsFragmentDataSource.kt")).v("Not connected to Wifi, showing NEED_WIFI banner");
                tyvVarBX = tyv.h;
            } else {
                tyvVarBX = tyv.c;
            }
        }
        uzx uzxVarCf2 = defpackage.wsc.cf(tyw.a.m());
        java.lang.String str5 = tyzVar.c;
        defpackage.aooh.e(str5, "getLanguageCode(...)");
        uzxVarCf2.y(str5);
        java.lang.String string2 = this.o.getString(2132020127);
        defpackage.aooh.e(string2, "getString(...)");
        uzxVarCf2.w(string2);
        uzxVarCf2.u(tyvVarBX);
        uzxVarCf2.x(z);
        tyw tywVarT2 = uzxVarCf2.t();
        defpackage.aooh.f(tywVarT2, "value");
        defpackage.akzx akzxVar2 = (defpackage.akzx) vquVar2.a;
        akzxVar2.u();
        tsk tskVar5 = akzxVar2.b;
        tsk tskVar6 = tsk.a;
        j$.util.Objects.requireNonNull(tywVarT2);
        tskVar5.d = tywVarT2;
        tskVar5.b |= 1;
        boolean zD2 = d(!defpackage.ajsz.bb(tyv.f, tyv.c, tyv.d).contains(tyvVarBX));
        akzxVar2.u();
        tsk tskVar7 = akzxVar2.b;
        tskVar7.b |= 2;
        tskVar7.e = zD2;
        boolean z4 = trsVar3.g;
        akzxVar2.u();
        tsk tskVar8 = akzxVar2.b;
        tskVar8.b |= 4;
        tskVar8.f = z4;
        tsk tskVarAf2 = vquVar.af();
        alcfVar = trsVar3.c;
        if (alcfVar == null) {
            alcfVar = defpackage.alcf.a;
        }
        defpackage.aooh.e(alcfVar, "getLastUpdateTimestamp(...)");
        j$.time.Instant instantAw2 = defpackage.aooc.aw(alcfVar);
        if (j$.time.Instant.now().minus(m).compareTo(instantAw2) <= 0) {
        }
    }

    @Override // defpackage.agxi
    public final /* synthetic */ java.lang.Object e() {
        return a;
    }
}
