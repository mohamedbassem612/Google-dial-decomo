package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lil implements agxi {
    public static final akzm a = aldf.f(5, 0);
    public static final agxj b = new agxj("CallScreenSettingsKey");
    static final akzm c = aldf.d(2);
    public static final aimz d = aimz.i("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource");
    public final ajcu e;
    public final ljd f;
    public final lht g;
    public final llz h;
    public final lcx i;
    public final long j;
    public final twp k;
    public final aogc l;
    public final aogc m;
    private final android.content.Context n;
    private final rlv o;

    public lil(android.content.Context context, ajcu ajcuVar, aogc aogcVar, ljd ljdVar, lht lhtVar, llz llzVar, lcx lcxVar, twp twpVar, aogc aogcVar2, aoin aoinVar, rlv rlvVar) {
        this.n = context;
        this.e = ajcuVar;
        this.m = aogcVar;
        this.f = ljdVar;
        this.g = lhtVar;
        this.h = llzVar;
        this.i = lcxVar;
        this.k = twpVar;
        this.l = aogcVar2;
        this.j = ((java.lang.Long) aoinVar.a()).longValue();
        this.o = rlvVar;
    }

    public final ajbg a() {
        return new ajbg(ahrv.g(this.m.bk()).h(new defpackage.lef(16), this.e));
    }

    public final ajcq b() {
        ahrv ahrvVarG = ahrv.g(this.m.bk());
        ajat ajatVarC = ahqx.c(new defpackage.lhy(this, 4));
        ajcu ajcuVar = this.e;
        return ahrvVarG.i(ajatVarC, ajcuVar).i(new defpackage.lhy(this, 5), ajcuVar).h(new lix(1), ajcuVar);
    }

    public final defpackage.liq c(java.lang.String str, defpackage.lin linVar, defpackage.lio lioVar) {
        defpackage.liq liqVar = defpackage.liq.a;
        akzx akzxVarM = liqVar.m();
        switch (linVar) {
            case UNKNOWN:
            case ERROR:
            case UNRECOGNIZED:
                a.bI(d.c().m(aioa.b), "SODA model status check failed with error", "com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource", "getStatusBannerModel", (char) 288, "CallScreenSettingsDataSource.java", zct.b);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).c = a.Q(5);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).d = a.Q(4);
                java.lang.String string = this.n.getString(2132018787);
                akzxVarM.u();
                defpackage.liq liqVar2 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                liqVar2.f = string;
                akzxVarM.u();
                defpackage.liq liqVar3 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                liqVar3.b = str;
                return (defpackage.liq) akzxVarM.p();
            case READY:
                d.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource", "getStatusBannerModel", 276, "CallScreenSettingsDataSource.java").v("ready");
                break;
            case CURRENTLY_DOWNLOADING:
                d.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource", "getStatusBannerModel", 265, "CallScreenSettingsDataSource.java").v("Showing activation spinner because SODA download is ongoing");
                akzxVarM.u();
                defpackage.liq liqVar4 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                liqVar4.b = str;
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).c = a.Q(4);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).d = a.Q(5);
                java.lang.String string2 = android.text.TextUtils.expandTemplate(this.n.getString(2132019354), str).toString();
                akzxVarM.u();
                defpackage.liq liqVar5 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                liqVar5.f = string2;
                return (defpackage.liq) akzxVarM.p();
            case NEEDS_DOWNLOAD:
                this.o.o(rmx.gQ);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).e = a.R(3);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).c = a.Q(5);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).d = a.Q(4);
                java.lang.String string3 = this.n.getString(2132019894);
                akzxVarM.u();
                defpackage.liq liqVar6 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(string3);
                liqVar6.f = string3;
                akzxVarM.u();
                defpackage.liq liqVar7 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                liqVar7.b = str;
                return (defpackage.liq) akzxVarM.p();
            case UNNECESSARY:
                break;
            case NEEDS_UPDATE:
                this.o.o(rmx.gO);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).e = a.R(4);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).c = a.Q(5);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).d = a.Q(4);
                java.lang.String string4 = this.n.getString(2132018856);
                akzxVarM.u();
                defpackage.liq liqVar8 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(string4);
                liqVar8.f = string4;
                akzxVarM.u();
                defpackage.liq liqVar9 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                liqVar9.b = str;
                return (defpackage.liq) akzxVarM.p();
            case MODEL_UNREADY:
                this.o.o(rmx.gP);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).c = a.Q(5);
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).d = a.Q(4);
                java.lang.String string5 = this.n.getString(2132019894);
                akzxVarM.u();
                defpackage.liq liqVar10 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(string5);
                liqVar10.f = string5;
                akzxVarM.u();
                defpackage.liq liqVar11 = (defpackage.liq) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                liqVar11.b = str;
                akzxVarM.u();
                ((defpackage.liq) akzxVarM.b).e = a.R(6);
                return (defpackage.liq) akzxVarM.p();
            default:
                return (defpackage.liq) akzxVarM.p();
        }
        d.b().l("com/android/dialer/callscreen/impl/settings/data/CallScreenSettingsDataSource", "getStatusBannerModel", 279, "CallScreenSettingsDataSource.java").v("Hiding activation spinner because everything is loaded");
        akzx akzxVarM2 = liqVar.m();
        int iOrdinal = lioVar.ordinal();
        if (iOrdinal == 0) {
            this.o.o(rmx.gS);
            akzxVarM2.u();
            ((defpackage.liq) akzxVarM2.b).e = a.R(5);
            akzxVarM2.u();
            ((defpackage.liq) akzxVarM2.b).c = a.Q(5);
            akzxVarM2.u();
            ((defpackage.liq) akzxVarM2.b).d = a.Q(4);
            java.lang.String string6 = this.n.getString(2132017286);
            akzxVarM2.u();
            defpackage.liq liqVar12 = (defpackage.liq) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string6);
            liqVar12.f = string6;
            akzxVarM2.u();
            defpackage.liq liqVar13 = (defpackage.liq) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            liqVar13.b = str;
            return (defpackage.liq) akzxVarM2.p();
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.o.o(rmx.gT);
            akzxVarM2.u();
            ((defpackage.liq) akzxVarM2.b).c = a.Q(2);
            akzxVarM2.u();
            ((defpackage.liq) akzxVarM2.b).d = a.Q(2);
            java.lang.String string7 = this.n.getString(2132017841);
            akzxVarM2.u();
            defpackage.liq liqVar14 = (defpackage.liq) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string7);
            liqVar14.f = string7;
            akzxVarM2.u();
            defpackage.liq liqVar15 = (defpackage.liq) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            liqVar15.b = str;
            return (defpackage.liq) akzxVarM2.p();
        }
        if (iOrdinal == 3) {
            akzxVarM2.u();
            ((defpackage.liq) akzxVarM2.b).c = a.Q(4);
            akzxVarM2.u();
            ((defpackage.liq) akzxVarM2.b).d = a.Q(5);
            java.lang.String string8 = this.n.getString(2132019176);
            akzxVarM2.u();
            defpackage.liq liqVar16 = (defpackage.liq) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string8);
            liqVar16.f = string8;
            akzxVarM2.u();
            defpackage.liq liqVar17 = (defpackage.liq) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            liqVar17.b = str;
            return (defpackage.liq) akzxVarM2.p();
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? (defpackage.liq) akzxVarM2.p() : (defpackage.liq) akzxVarM2.p();
        }
        akzxVarM2.u();
        ((defpackage.liq) akzxVarM2.b).c = a.Q(3);
        akzxVarM2.u();
        ((defpackage.liq) akzxVarM2.b).d = a.Q(3);
        java.lang.String string9 = this.n.getString(2132017287);
        akzxVarM2.u();
        defpackage.liq liqVar18 = (defpackage.liq) akzxVarM2.b;
        j$.util.Objects.requireNonNull(string9);
        liqVar18.f = string9;
        akzxVarM2.u();
        defpackage.liq liqVar19 = (defpackage.liq) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        liqVar19.b = str;
        return (defpackage.liq) akzxVarM2.p();
    }

    public final /* synthetic */ java.lang.Object e() {
        return b;
    }
}
