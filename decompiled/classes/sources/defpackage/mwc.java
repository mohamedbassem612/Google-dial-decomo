package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mwc implements defpackage.mvz {
    private static final long a;
    private static final defpackage.acux b;
    private static final defpackage.mwb c;
    private final defpackage.mvy d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.aoin i;
    private final defpackage.aoin j;
    private final defpackage.aoin k;
    private final defpackage.aoin l;
    private final defpackage.aoin m;
    private final defpackage.mwb n;
    private final defpackage.mwb o;
    private final defpackage.mwb p;
    private final defpackage.mwb q;
    private final defpackage.mwb r;
    private final defpackage.mwb s;
    private final defpackage.mwb t;

    static {
        long j = defpackage.aorh.a;
        a = defpackage.aorh.i(defpackage.aooh.A(7, defpackage.aorj.DAYS));
        defpackage.adae adaeVarCw = defpackage.agab.cw(defpackage.acux.a.m());
        adaeVarCw.p("dobby-duplex-files");
        adaeVarCw.v();
        adaeVarCw.t();
        defpackage.acux acuxVarM = adaeVarCw.m();
        b = acuxVarM;
        c = new defpackage.mwb(acuxVarM, defpackage.aokc.a);
    }

    public mwc(defpackage.mvy mvyVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8, defpackage.aoin aoinVar9) {
        if (mvyVar == null) {
            defpackage.aooh.i("dobbySingletonLocaleProvider");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("downloadPath");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableAgenticCallScreen");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("isUserInUs");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("isUserInUk");
        }
        if (aoinVar5 == null) {
            defpackage.aooh.i("isUserInJp");
        }
        if (aoinVar6 == null) {
            defpackage.aooh.i("isUserInCa");
        }
        if (aoinVar7 == null) {
            defpackage.aooh.i("isUserInIe");
        }
        if (aoinVar8 == null) {
            defpackage.aooh.i("isUserInAu");
        }
        if (aoinVar9 == null) {
            defpackage.aooh.i("isUserInIn");
        }
        this.d = mvyVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.h = aoinVar4;
        this.i = aoinVar5;
        this.j = aoinVar6;
        this.k = aoinVar7;
        this.l = aoinVar8;
        this.m = aoinVar9;
        defpackage.adae adaeVarCw = defpackage.agab.cw(c().L());
        adaeVarCw.v();
        java.util.List listSingletonList = java.util.Collections.singletonList("en-US");
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        adaeVarCw.r(listSingletonList);
        adaeVarCw.o(1791597920);
        adaeVarCw.u();
        defpackage.acuw acuwVar = defpackage.acuw.a;
        defpackage.adae adaeVarCv = defpackage.agab.cv((defpackage.akzz) acuwVar.m());
        adaeVarCv.i(144413409L);
        adaeVarCv.j("212349afaf94d24b8b91ebb2ce6dafd5ba7bac1c");
        java.lang.Object objA = aoinVar.a();
        java.util.Objects.toString(objA);
        adaeVarCv.k(java.lang.String.valueOf(objA).concat("/call_assistant_extraction-v6_5-en_us.zip"));
        adaeVarCv.l();
        adaeVarCw.s(adaeVarCv.h());
        defpackage.acux acuxVarM = adaeVarCw.m();
        defpackage.ihe iheVar = defpackage.ihe.USE_CASE_SMART_REPLY;
        defpackage.ihe iheVar2 = defpackage.ihe.USE_CASE_BAM;
        defpackage.ihe iheVar3 = defpackage.ihe.USE_CASE_SPAM_FILTER;
        java.util.List listAsList = java.util.Arrays.asList(defpackage.ihe.USE_CASE_AGENTIC_CALL_SCREEN, iheVar, iheVar2, iheVar3);
        defpackage.aooh.e(listAsList, "asList(...)");
        this.n = new defpackage.mwb(acuxVarM, listAsList);
        defpackage.adae adaeVarCw2 = defpackage.agab.cw(c().L());
        adaeVarCw2.v();
        adaeVarCw2.r(defpackage.ajsz.cU(new java.lang.String[]{"*"}));
        adaeVarCw2.o(1769797676);
        adaeVarCw2.u();
        defpackage.adae adaeVarCv2 = defpackage.agab.cv((defpackage.akzz) acuwVar.m());
        adaeVarCv2.i(25723077L);
        adaeVarCv2.j("1dd0503cc7dd9324d9cec3c0b2fdcff9a98932ef");
        java.lang.Object objA2 = aoinVar.a();
        java.util.Objects.toString(objA2);
        adaeVarCv2.k(java.lang.String.valueOf(objA2).concat("/call_assistant_extraction-v5_9-en_in.zip"));
        adaeVarCv2.l();
        adaeVarCw2.s(adaeVarCv2.h());
        defpackage.acux acuxVarM2 = adaeVarCw2.m();
        java.util.List listSingletonList2 = java.util.Collections.singletonList(iheVar);
        defpackage.aooh.e(listSingletonList2, "singletonList(...)");
        this.o = new defpackage.mwb(acuxVarM2, listSingletonList2);
        defpackage.adae adaeVarCw3 = defpackage.agab.cw(c().L());
        adaeVarCw3.v();
        adaeVarCw3.r(defpackage.ajsz.cU(new java.lang.String[]{"hi-IN"}));
        adaeVarCw3.o(1769797933);
        adaeVarCw3.u();
        defpackage.adae adaeVarCv3 = defpackage.agab.cv((defpackage.akzz) acuwVar.m());
        adaeVarCv3.i(25709571L);
        adaeVarCv3.j("ee3efab12bcea4ff64234c2be56a0496fda88984");
        java.lang.Object objA3 = aoinVar.a();
        java.util.Objects.toString(objA3);
        adaeVarCv3.k(java.lang.String.valueOf(objA3).concat("/call_assistant_extraction-v5_9-hi_in.zip"));
        adaeVarCv3.l();
        adaeVarCw3.s(adaeVarCv3.h());
        defpackage.acux acuxVarM3 = adaeVarCw3.m();
        java.util.List listSingletonList3 = java.util.Collections.singletonList(iheVar);
        defpackage.aooh.e(listSingletonList3, "singletonList(...)");
        this.p = new defpackage.mwb(acuxVarM3, listSingletonList3);
        defpackage.adae adaeVarCw4 = defpackage.agab.cw(c().L());
        adaeVarCw4.v();
        adaeVarCw4.r(defpackage.ajsz.cU(new java.lang.String[]{"ja-JP"}));
        adaeVarCw4.o(1722447165);
        adaeVarCw4.u();
        defpackage.adae adaeVarCv4 = defpackage.agab.cv((defpackage.akzz) acuwVar.m());
        adaeVarCv4.i(46503950L);
        adaeVarCv4.j("56675277678bdf24bc5ca08bd0020161b9bc8591");
        java.lang.Object objA4 = aoinVar.a();
        java.util.Objects.toString(objA4);
        adaeVarCv4.k(java.lang.String.valueOf(objA4).concat("/call_assistant_extraction-v4_2-ja_jp.zip"));
        adaeVarCv4.l();
        adaeVarCw4.s(adaeVarCv4.h());
        defpackage.acux acuxVarM4 = adaeVarCw4.m();
        java.util.List listSingletonList4 = java.util.Collections.singletonList(iheVar);
        defpackage.aooh.e(listSingletonList4, "singletonList(...)");
        this.q = new defpackage.mwb(acuxVarM4, listSingletonList4);
        defpackage.adae adaeVarCw5 = defpackage.agab.cw(c().L());
        adaeVarCw5.v();
        adaeVarCw5.r(defpackage.ajsz.cU(new java.lang.String[]{"en-US", "en-*"}));
        adaeVarCw5.o(1754894330);
        adaeVarCw5.u();
        defpackage.adae adaeVarCv5 = defpackage.agab.cv((defpackage.akzz) acuwVar.m());
        adaeVarCv5.i(141866094L);
        adaeVarCv5.j("cd431ef265908b5e32ad2e94841a616f6b368c9a");
        java.lang.Object objA5 = aoinVar.a();
        java.util.Objects.toString(objA5);
        adaeVarCv5.k(java.lang.String.valueOf(objA5).concat("/call_assistant_extraction-v5_3-en_us.zip"));
        adaeVarCv5.l();
        adaeVarCw5.s(adaeVarCv5.h());
        defpackage.acux acuxVarM5 = adaeVarCw5.m();
        java.util.List listAsList2 = java.util.Arrays.asList(iheVar2, iheVar, iheVar3);
        defpackage.aooh.e(listAsList2, "asList(...)");
        this.r = new defpackage.mwb(acuxVarM5, listAsList2);
        defpackage.adae adaeVarCw6 = defpackage.agab.cw(c().L());
        adaeVarCw6.v();
        adaeVarCw6.r(defpackage.ajsz.cU(new java.lang.String[]{"en-US", "en-GB", "en-*"}));
        adaeVarCw6.o(1759444865);
        adaeVarCw6.u();
        defpackage.adae adaeVarCv6 = defpackage.agab.cv((defpackage.akzz) acuwVar.m());
        adaeVarCv6.i(93389201L);
        adaeVarCv6.j("2da63a45f6e598cc203210739d89c5350c7f5e90");
        java.lang.Object objA6 = aoinVar.a();
        java.util.Objects.toString(objA6);
        adaeVarCv6.k(java.lang.String.valueOf(objA6).concat("/call_assistant_extraction-v5_4-en_gb.zip"));
        adaeVarCv6.l();
        adaeVarCw6.s(adaeVarCv6.h());
        defpackage.acux acuxVarM6 = adaeVarCw6.m();
        java.util.List listAsList3 = java.util.Arrays.asList(iheVar, iheVar3);
        defpackage.aooh.e(listAsList3, "asList(...)");
        this.s = new defpackage.mwb(acuxVarM6, listAsList3);
        defpackage.adae adaeVarCw7 = defpackage.agab.cw(c().L());
        adaeVarCw7.v();
        java.util.List listAsList4 = java.util.Arrays.asList("en-US", "en-AU", "en-*");
        defpackage.aooh.e(listAsList4, "asList(...)");
        adaeVarCw7.r(listAsList4);
        adaeVarCw7.o(1760045842);
        adaeVarCw7.u();
        defpackage.adae adaeVarCv7 = defpackage.agab.cv((defpackage.akzz) acuwVar.m());
        adaeVarCv7.i(109646000L);
        adaeVarCv7.j("6bcb3bd98b1418ad1278d6c302be4605ce583c53");
        java.lang.Object objA7 = aoinVar.a();
        java.util.Objects.toString(objA7);
        adaeVarCv7.k(java.lang.String.valueOf(objA7).concat("/call_assistant_extraction-v5_5-en_au.zip"));
        adaeVarCv7.l();
        adaeVarCw7.s(adaeVarCv7.h());
        defpackage.acux acuxVarM7 = adaeVarCw7.m();
        java.util.List listAsList5 = java.util.Arrays.asList(iheVar, iheVar3);
        defpackage.aooh.e(listAsList5, "asList(...)");
        this.t = new defpackage.mwb(acuxVarM7, listAsList5);
    }

    private static final defpackage.acux c() {
        defpackage.adae adaeVarCw = defpackage.agab.cw(defpackage.acux.a.m());
        adaeVarCw.p("dobby-duplex-files");
        defpackage.adae adaeVarCu = defpackage.agab.cu(defpackage.acuz.a.m());
        adaeVarCu.g();
        adaeVarCu.f();
        adaeVarCu.e(a);
        adaeVarCw.n(adaeVarCu.d());
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        adaeVarCw.q(604800L);
        return adaeVarCw.m();
    }

    @Override // defpackage.mvz
    public final defpackage.acux a() {
        return b().a;
    }

    public final defpackage.mwb b() {
        java.lang.Object objA = this.e.a();
        defpackage.aooh.e(objA, "get(...)");
        if (((java.lang.CharSequence) objA).length() == 0) {
            return c;
        }
        if (((java.lang.Boolean) this.f.a()).booleanValue()) {
            return this.n;
        }
        if (((java.lang.Boolean) this.m.a()).booleanValue()) {
            return ((java.lang.String) this.d.j.a()).equals("hi-IN") ? this.p : this.o;
        }
        if (((java.lang.Boolean) this.g.a()).booleanValue()) {
            return this.r;
        }
        if (((java.lang.Boolean) this.h.a()).booleanValue()) {
            return this.s;
        }
        if (((java.lang.Boolean) this.i.a()).booleanValue()) {
            return this.q;
        }
        if (((java.lang.Boolean) this.j.a()).booleanValue()) {
            return this.r;
        }
        if (((java.lang.Boolean) this.k.a()).booleanValue()) {
            return this.s;
        }
        return ((java.lang.Boolean) this.l.a()).booleanValue() ? this.t : c;
    }
}
