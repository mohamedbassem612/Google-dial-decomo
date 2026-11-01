package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wqa implements agxi {
    public static final agxj a = new agxj("XatuSettingsKey");
    static final akzm b = aldf.f(3, 0);
    public static final aimz c = aimz.i("com/android/dialer/xatu/impl/settings/XatuSettingsDataSource");
    public final android.content.Context d;
    public final defpackage.wpx e;
    private final ajct f;
    private final defpackage.tzb g;
    private final defpackage.wjf h;
    private final aoin i;

    public wqa(android.content.Context context, ajct ajctVar, defpackage.wpx wpxVar, defpackage.wjf wjfVar, defpackage.tzb tzbVar, aoin aoinVar) {
        this.d = context;
        this.f = ajctVar;
        this.e = wpxVar;
        this.h = wjfVar;
        this.g = tzbVar;
        this.i = aoinVar;
    }

    public final ajbg a() {
        return new ajbg(ahvr.I(this.e.c.bk(), new ajat() { // from class: wpz
            public final ajcq a(java.lang.Object obj) {
                defpackage.tyv tyvVarBX;
                defpackage.wqc wqcVar;
                wpy wpyVar = (wpy) obj;
                if (wpy.a.equals(wpyVar)) {
                    return aiql.z(agxh.a);
                }
                if ((wpyVar.b & 4) == 0) {
                    return aiql.z(agxh.a);
                }
                defpackage.wpu wpuVarB = defpackage.wpu.b(wpyVar.c);
                if (wpuVarB == null) {
                    wpuVarB = defpackage.wpu.UNKNOWN;
                }
                boolean z = false;
                boolean z2 = wpuVarB == defpackage.wpu.AUTO_ENROLLED || wpuVarB == defpackage.wpu.USER_OPTED_IN;
                aimz aimzVar = defpackage.wqa.c;
                aimzVar.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsDataSource", "isFeatureEnabled", 190, "XatuSettingsDataSource.java").J("enrollment status %s, is enabled %b", wpuVarB, z2);
                defpackage.wpw wpwVarB = defpackage.wpw.b(wpyVar.g);
                if (wpwVarB == null) {
                    wpwVarB = defpackage.wpw.SHOW_AHEAD_AUTO_ENROLLED;
                }
                boolean z3 = wpwVarB == defpackage.wpw.SHOW_AHEAD_AUTO_ENROLLED || wpwVarB == defpackage.wpw.SHOW_AHEAD_USER_OPTED_IN;
                aimzVar.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsDataSource", "isShowAheadEnabled", 198, "XatuSettingsDataSource.java").J("show ahead enrollment status %s, is enabled %b", wpwVarB, z3);
                defpackage.wpt wptVarB = defpackage.wpt.b(wpyVar.h);
                if (wptVarB == null) {
                    wptVarB = defpackage.wpt.AUTOMATIC_DISPLAY_UNSPECIFIED;
                }
                boolean z4 = wptVarB == defpackage.wpt.AUTOMATIC_DISPLAY_UNSPECIFIED || wptVarB == defpackage.wpt.AUTOMATIC_DISPLAY_USER_OPTED_IN;
                aimzVar.b().l("com/android/dialer/xatu/impl/settings/XatuSettingsDataSource", "isAutomaticDisplayEnabled", 206, "XatuSettingsDataSource.java").J("automatic display enrollment status %s, is enabled %b", wptVarB, z4);
                long j = wpyVar.f;
                akzx akzxVarM = defpackage.wqc.a.m();
                akzxVarM.u();
                defpackage.wqc wqcVar2 = (defpackage.wqc) akzxVarM.b;
                wqcVar2.b |= 1;
                wqcVar2.c = z2;
                akzxVarM.u();
                defpackage.wqc wqcVar3 = (defpackage.wqc) akzxVarM.b;
                wqcVar3.b |= 16;
                wqcVar3.f = z3;
                akzxVarM.u();
                defpackage.wqc wqcVar4 = (defpackage.wqc) akzxVarM.b;
                wqcVar4.b |= 32;
                wqcVar4.g = z4;
                if (z2) {
                    if (wpyVar.d) {
                        defpackage.tyz tyzVar = wpyVar.e;
                        if (tyzVar == null) {
                            tyzVar = defpackage.tyz.a;
                        }
                        int iBY = wsc.bY(tyzVar.d);
                        if (iBY == 0) {
                            iBY = 1;
                        }
                        tyvVarBX = wsc.bX(iBY);
                    } else {
                        tyvVarBX = defpackage.tyv.DOWNLOADING_FEATURE;
                    }
                    if (tyvVarBX != defpackage.tyv.DOWNLOADING_FEATURE && tyvVarBX != defpackage.tyv.DOWNLOADING_SODA) {
                        z = true;
                    }
                    akzx akzxVarM2 = defpackage.tyw.a.m();
                    defpackage.tyz tyzVar2 = wpyVar.e;
                    if (tyzVar2 == null) {
                        tyzVar2 = defpackage.tyz.a;
                    }
                    defpackage.wqa wqaVar = this.a;
                    java.lang.String str = tyzVar2.c;
                    akzxVarM2.u();
                    defpackage.tyw tywVar = (defpackage.tyw) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str);
                    tywVar.c = str;
                    java.lang.String string = wqaVar.d.getString(2132021106);
                    akzxVarM2.u();
                    defpackage.tyw tywVar2 = (defpackage.tyw) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(string);
                    tywVar2.e = string;
                    akzxVarM2.u();
                    ((defpackage.tyw) akzxVarM2.b).d = tyvVarBX.a();
                    akzxVarM2.u();
                    ((defpackage.tyw) akzxVarM2.b).f = true;
                    defpackage.tyw tywVar3 = (defpackage.tyw) akzxVarM2.p();
                    akzxVarM.u();
                    defpackage.wqc wqcVar5 = (defpackage.wqc) akzxVarM.b;
                    wqcVar5.b |= 8;
                    wqcVar5.e = z;
                    akzxVarM.u();
                    defpackage.wqc wqcVar6 = (defpackage.wqc) akzxVarM.b;
                    j$.util.Objects.requireNonNull(tywVar3);
                    wqcVar6.d = tywVar3;
                    wqcVar6.b |= 4;
                    wqcVar = (defpackage.wqc) akzxVarM.p();
                } else {
                    akzxVarM.u();
                    defpackage.wqc wqcVar7 = (defpackage.wqc) akzxVarM.b;
                    wqcVar7.b |= 8;
                    wqcVar7.e = true;
                    wqcVar = (defpackage.wqc) akzxVarM.p();
                }
                return aiql.z(j$.time.Instant.now().toEpochMilli() - j <= aldf.a(defpackage.wqa.b) ? agxh.a(wqcVar, j$.time.Instant.ofEpochMilli(j)) : agxh.b(wqcVar));
            }
        }, this.f));
    }

    public final ajcq b() {
        defpackage.wpx wpxVar = this.e;
        ajcq ajcqVarB = wpxVar.b();
        ajcq ajcqVarC = wpxVar.c();
        ajcq ajcqVarA = wpxVar.a();
        akff akffVarA = akff.a((java.lang.String) this.i.a());
        defpackage.tzb tzbVar = this.g;
        ajcq ajcqVarF = aosv.F(tzbVar.a, 0, new defpackage.txm(tzbVar, akffVarA, (aoln) null, 6), 3);
        ajcq ajcqVarB2 = this.h.e.b();
        return ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarC, ajcqVarA, ajcqVarF, ajcqVarB2}).p(new defpackage.vuh(this, ajcqVarB, ajcqVarC, ajcqVarA, ajcqVarB2, ajcqVarF, 2), this.f);
    }

    public final /* synthetic */ java.lang.Object e() {
        return a;
    }
}
