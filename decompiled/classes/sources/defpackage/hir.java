package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hir implements defpackage.amyz {
    public final him a;
    public final defpackage.his b;
    public final defpackage.hkh c;
    private final int d;
    private final defpackage.hkg e;

    public hir(him himVar, defpackage.hkh hkhVar, defpackage.hkg hkgVar, defpackage.his hisVar, int i) {
        this.a = himVar;
        this.c = hkhVar;
        this.e = hkgVar;
        this.b = hisVar;
        this.d = i;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        lzm agzxVar;
        kjd isrVar;
        switch (this.d) {
            case 0:
                return ahez.a(((defpackage.aheg) this.b.a).a(), ahez.b);
            case 1:
                defpackage.his hisVar = this.b;
                him himVar = this.a;
                agzxVar = new agzx(hisVar.a, (defpackage.aogc) himVar.fo.a(), (defpackage.ajcu) himVar.aN.a());
                return agzxVar;
            case 2:
                return new defpackage.ucm(this.b.a, this.a.a.cl(), (defpackage.ahyn) new defpackage.ahys(new ahtc()));
            case 3:
                defpackage.aw awVar = this.b.a;
                j$.util.Objects.requireNonNull(awVar);
                return new defpackage.agtm(new defpackage.aeur(awVar, 2), awVar, awVar.P());
            case 4:
                return new defpackage.ajwr(this.b.a, (defpackage.ajcu) this.a.aN.a());
            case 5:
                defpackage.his hisVar2 = this.b;
                uzx uzxVar = (uzx) hisVar2.h.a();
                him himVar2 = this.a;
                defpackage.aogc aogcVar = (defpackage.aogc) himVar2.fo.a();
                defpackage.ajcu ajcuVar = (defpackage.ajcu) himVar2.aN.a();
                defpackage.aw awVar2 = hisVar2.a;
                return new agzk(new agzn(new agzh(awVar2, uzxVar, ajcuVar), uzxVar, aogcVar, ajcuVar, awVar2));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aw awVar3 = this.b.a;
                return uzx.aX(awVar3, awVar3);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                him himVar3 = this.a;
                defpackage.zzx zzxVarPv = himVar3.pv();
                him.iM();
                defpackage.ajcu ajcuVar2 = (defpackage.ajcu) himVar3.aN.a();
                defpackage.aolr aolrVar = (defpackage.aolr) himVar3.bn.a();
                defpackage.ahwt ahwtVar = defpackage.ahwt.a;
                return achr.l(zzxVarPv, ajcuVar2, aolrVar, ahwtVar, (defpackage.ahyn) himVar3.i.a(), ahwtVar);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                him himVar4 = this.a;
                jmu jmuVar = jmu.b;
                hip hipVar = himVar4.a;
                return defpackage.aigf.l(jmuVar, hipVar.bQ(), jmu.c, hipVar.bN());
            case 9:
                return new rai(this, (short[]) null, (byte[]) null);
            case 10:
                return new rai(this, (byte[]) null, (byte[]) null, (byte[]) null);
            case 11:
                return new rai(this, (char[]) null, (byte[]) null);
            case 12:
                him himVar5 = this.a;
                kof kofVar = kof.d;
                hip hipVar2 = himVar5.a;
                return defpackage.aigf.m(kofVar, hipVar2.bu(), kof.a, hipVar2.by(), kof.b, hipVar2.bE());
            case 13:
                hip hipVar3 = this.a.a;
                return defpackage.aihd.r(defpackage.afsq.cL(hipVar3.id), defpackage.afsq.cL(hipVar3.ie));
            case 14:
                return new rai(this, (byte[]) null, (char[]) null);
            case 15:
                him himVar6 = this.a;
                agzxVar = new lbo(himVar6.tj(), (defpackage.ajct) himVar6.r.a(), (defpackage.ajct) himVar6.L.a());
                return agzxVar;
            case 16:
                him himVar7 = this.a;
                return new voc(himVar7.s, himVar7.fy);
            case 17:
                defpackage.aolr aolrVar2 = (defpackage.aolr) this.c.d.a();
                defpackage.his hisVar3 = this.b;
                if (aolrVar2 == null) {
                    defpackage.aooh.i("mainImmediateContext");
                }
                defpackage.aw awVar4 = hisVar3.a;
                if (awVar4 == null) {
                    defpackage.aooh.i("fragment");
                }
                defpackage.ems emsVarP = awVar4.P();
                defpackage.aooh.e(emsVarP, "<get-lifecycle>(...)");
                return defpackage.afsq.M(aolrVar2, emsVarP);
            case 18:
                him himVar8 = this.b.b;
                lnv lnvVar = new lnv((defpackage.ojo) himVar8.oF.a(), (defpackage.ajct) himVar8.r.a(), (defpackage.ajct) himVar8.L.a(), (defpackage.lvs) himVar8.oS.a());
                uzx uzxVar2 = new uzx((defpackage.ahpz) himVar8.bb.a(), (byte[]) null, (byte[]) null);
                him himVar9 = this.a;
                return new lnx(lnvVar, uzxVar2, (defpackage.rlv) himVar9.fq.a(), (defpackage.gpd) himVar9.fD.a());
            case 19:
                return new rai(this, (short[]) null);
            case 20:
                return new rai(this, (byte[]) null, (byte[]) null);
            case 21:
                return new rai(this, (char[]) null);
            case 22:
                him himVar10 = this.a;
                agzxVar = new lzm(himVar10.mX(), himVar10.a.cf(), (defpackage.ajct) himVar10.r.a());
                return agzxVar;
            case 23:
                him himVar11 = this.a;
                android.content.Context context = (android.content.Context) himVar11.s.a();
                defpackage.ajct ajctVar = (defpackage.ajct) himVar11.r.a();
                hip hipVar4 = himVar11.a;
                him himVar12 = hipVar4.a;
                j$.util.Optional optionalFS = himVar11.fS();
                defpackage.zjm zjmVarCa = hipVar4.ca();
                defpackage.zjm zjmVarMV = himVar11.mV();
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                omt omtVar = new omt(himVar12.bg());
                if (optionalEmpty == null) {
                    defpackage.aooh.i("optionalFeature");
                }
                defpackage.zjm zjmVar = new defpackage.zjm(optionalEmpty, j$.util.Optional.of(omtVar));
                defpackage.zjm zjmVarMK = himVar11.mK();
                defpackage.amyz amyzVar = himVar11.LS;
                defpackage.amyz amyzVar2 = hipVar4.aJ;
                defpackage.rsr rsrVarSa = himVar11.sa();
                defpackage.zjm zjmVarCg = hipVar4.cg();
                defpackage.teb tebVarCd = himVar11.cd();
                defpackage.his hisVar4 = this.b;
                him himVar13 = hisVar4.b;
                return new lzv(context, ajctVar, optionalFS, zjmVarCa, zjmVarMV, zjmVar, zjmVarMK, amyzVar, amyzVar2, rsrVarSa, zjmVarCg, tebVarCd, new kfg((defpackage.ojo) himVar13.oF.a(), (defpackage.ajct) himVar13.r.a()), new ifb((android.content.Context) himVar13.s.a(), (defpackage.aoss) himVar13.cb.a(), himVar13.sa(), himVar13.pC), new jyn(himVar13.jq(), (defpackage.aolr) himVar13.ca.a(), (defpackage.aoss) himVar13.cb.a(), new defpackage.zzx(hisVar4.z)), himVar11.oT, himVar11.mZ(), himVar11.pC);
            case 24:
                hip hipVar5 = this.a.a;
                him himVar14 = hipVar5.a;
                defpackage.iqm iqmVarE = himVar14.E();
                defpackage.amyz amyzVar3 = hipVar5.gp;
                if (amyzVar3 == null) {
                    defpackage.aooh.i("impl");
                }
                defpackage.zjm zjmVar2 = new defpackage.zjm((defpackage.aoin) amyzVar3, (defpackage.zcs) new hle(iqmVarE, 16));
                defpackage.khr khrVarAa = himVar14.aa();
                defpackage.amyz amyzVar4 = himVar14.FK;
                if (amyzVar4 == null) {
                    defpackage.aooh.i("haloCallDetailsDataIntegration");
                }
                return defpackage.aihd.s(zjmVar2, new defpackage.zjm((defpackage.aoin) amyzVar4, (defpackage.zcs) new jnz(khrVarAa, 5)), new defpackage.zjm((defpackage.aoin) hipVar5.cT, (defpackage.zcs) new defpackage.vkc(2)));
            case 25:
                him himVar15 = this.a;
                return new lzs(himVar15.a.cu(), (defpackage.ahbv) himVar15.fg.a(), himVar15.mZ());
            case 26:
                return new rai(this, (byte[]) null);
            case 27:
                him himVar16 = this.a;
                lzi lziVar = lzi.a;
                hip hipVar6 = himVar16.a;
                him himVar17 = hipVar6.a;
                defpackage.khr khrVarAa2 = himVar17.aa();
                defpackage.amyz amyzVar5 = hipVar6.ir;
                if (amyzVar5 == null) {
                    defpackage.aooh.i("haloCallDetailsCallButtonIntegration");
                }
                defpackage.zjm zjmVar3 = new defpackage.zjm((defpackage.aoin) new jsp(amyzVar5, 6), (defpackage.zcs) new jnz(khrVarAa2, 6));
                lzi lziVar2 = lzi.b;
                defpackage.khr khrVarAa3 = himVar17.aa();
                defpackage.amyz amyzVar6 = hipVar6.ir;
                if (amyzVar6 == null) {
                    defpackage.aooh.i("haloCallDetailsCallButtonIntegration");
                }
                return defpackage.aigf.l(lziVar, zjmVar3, lziVar2, new defpackage.zjm((defpackage.aoin) new jsp(amyzVar6, 7), (defpackage.zcs) new jnz(khrVarAa3, 7)));
            case 28:
                return new rai(this);
            case 29:
                defpackage.his hisVar5 = this.b;
                him himVar18 = this.a;
                mla mlaVarAp = hisVar5.ap();
                hip hipVar7 = himVar18.a;
                return new mlm(mlaVarAp, (mjk) hipVar7.iv.a(), (defpackage.ssq) himVar18.qE.a(), himVar18.sZ(), (defpackage.ahpz) himVar18.bb.a(), (mlq) hisVar5.F.a(), (mku) hisVar5.G.a(), (defpackage.aoss) himVar18.cb.a(), (defpackage.apni) himVar18.eY.a(), hipVar7.iw);
            case 30:
                defpackage.his hisVar6 = this.b;
                return new mlq(hisVar6.ap(), hisVar6.ao(), (defpackage.rlv) this.a.fq.a());
            case 31:
                defpackage.his hisVar7 = this.b;
                return new mku(hisVar7.ap(), hisVar7.ao(), (defpackage.aoss) this.a.cb.a());
            case 32:
                return new mkw(this.b.ap());
            case 33:
                defpackage.his hisVar8 = this.b;
                return new mlp(hisVar8.ap(), (mlm) hisVar8.H.a());
            case 34:
                return new mkt(this.b.ap());
            case 35:
                return new now((defpackage.aoss) this.a.cb.a());
            case 36:
                defpackage.ems emsVarP2 = this.b.a.P();
                if (emsVarP2 == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return emsVarP2;
            case 37:
                defpackage.his hisVar9 = this.b;
                return new oyl(hisVar9.a, hisVar9.aL());
            case 38:
                hip hipVar8 = this.a.a;
                defpackage.mnk mnkVarAE = hipVar8.a.aE();
                defpackage.amyz amyzVar7 = hipVar8.iO;
                if (amyzVar7 == null) {
                    defpackage.aooh.i("dobbyAnswerFragmentCreationListener");
                }
                return new defpackage.aile(new defpackage.zjm((defpackage.aoin) new mzq(amyzVar7, 3), (defpackage.zcs) new mzr(mnkVarAE, 2)));
            case 39:
                hip hipVar9 = this.a.a;
                him himVar19 = hipVar9.a;
                defpackage.amyz amyzVar8 = hipVar9.iP;
                himVar19.bC();
                defpackage.zjm zjmVarCM = defpackage.afsq.cM(j$.util.Optional.of(new defpackage.ttj((defpackage.aoss) himVar19.cb.a())), j$.util.Optional.of(new defpackage.hrc(6)));
                if (amyzVar8 == null) {
                    defpackage.aooh.i("impl");
                }
                j$.util.Optional optionalG = zjmVarCM.g();
                defpackage.aooh.e(optionalG, "getFeature(...)");
                return new defpackage.aile(new defpackage.zjm((defpackage.aoin) amyzVar8, (defpackage.zcs) new len(optionalG, 19)));
            case 40:
                return new pnr((defpackage.zpm) this.a.fn.a());
            case 41:
                return new abtr((defpackage.aazc) this.a.l.a(), this.b.a);
            case 42:
                return new rfv(this.b.a);
            case 43:
                defpackage.his hisVar10 = this.b;
                defpackage.aigb aigbVar = new defpackage.aigb(9);
                him himVar20 = hisVar10.b;
                aigbVar.i(quo.l, himVar20.jM());
                aigbVar.i(quo.n, himVar20.jL());
                aigbVar.i(quo.r, puk.s());
                aigbVar.i(quo.q, himVar20.lu());
                aigbVar.i(quo.b, himVar20.mq());
                aigbVar.i(quo.k, himVar20.ma());
                aigbVar.i(quo.f, himVar20.mr());
                aigbVar.i(quo.d, sgg.i());
                aigbVar.i(quo.m, himVar20.mt());
                return aigbVar.e(true);
            case 44:
                defpackage.his hisVar11 = this.b;
                defpackage.aigb aigbVar2 = new defpackage.aigb(6);
                aigbVar2.i(qtr.g, new defpackage.zjm((defpackage.aoin) new defpackage.kuq(5), (defpackage.zcs) new defpackage.vkc(2)));
                aigbVar2.i(qtr.e, new defpackage.zjm((defpackage.aoin) new defpackage.kuq(7), (defpackage.zcs) new defpackage.vkc(2)));
                aigbVar2.i(qtr.d, new defpackage.zjm((defpackage.aoin) new defpackage.kuq(8), (defpackage.zcs) new defpackage.vkc(2)));
                him himVar21 = hisVar11.b.a.a;
                aigbVar2.i(qtr.c, new defpackage.zjm((defpackage.aoin) new defpackage.kuq(4), (defpackage.zcs) new odv(himVar21.aX(), 14)));
                aigbVar2.i(qtr.f, new defpackage.zjm((defpackage.aoin) new defpackage.kuq(9), (defpackage.zcs) new defpackage.vkc(2)));
                qtr qtrVar = qtr.b;
                defpackage.tzc tzcVarCt = himVar21.ct();
                j$.util.Objects.requireNonNull(tzcVarCt);
                aigbVar2.i(qtrVar, new defpackage.zjm((defpackage.aoin) new defpackage.kuq(12), (defpackage.zcs) new tmw(tzcVarCt, 14)));
                return aigbVar2.e(true);
            case 45:
                him himVar22 = this.a;
                defpackage.vkc vkcVar = new defpackage.vkc(2);
                hip hipVar10 = himVar22.a;
                defpackage.zjm zjmVar4 = new defpackage.zjm((defpackage.aoin) hipVar10.jf, (defpackage.zcs) vkcVar);
                defpackage.zjm zjmVar5 = new defpackage.zjm((defpackage.aoin) hipVar10.jh, (defpackage.zcs) new defpackage.vkc(2));
                defpackage.zjm zjmVar6 = new defpackage.zjm((defpackage.aoin) new defpackage.rmg(hipVar10.ji, 19), (defpackage.zcs) new defpackage.sxz(hipVar10.a.cb(), 2));
                defpackage.hkh hkhVar = this.c;
                return defpackage.aihd.v(zjmVar4, zjmVar5, zjmVar6, new defpackage.zjm((defpackage.aoin) new defpackage.jrm(hkhVar.G, 10), (defpackage.zcs) new defpackage.vkc(2)), new defpackage.zjm((defpackage.aoin) hkhVar.H, (defpackage.zcs) new defpackage.vkc(2)), new defpackage.zjm((defpackage.aoin) this.b.V, (defpackage.zcs) new defpackage.vkc(2)), new defpackage.zjm[0]);
            case 46:
                return new defpackage.jml((defpackage.az) this.e.j.a());
            case 47:
                defpackage.his hisVar12 = this.b;
                him himVar23 = hisVar12.b;
                defpackage.rnz rnzVar = defpackage.rnz.CLEAR_CALL_HISTORY_NAV_MENU_KEY;
                defpackage.rlv rlvVar = (defpackage.rlv) himVar23.fq.a();
                defpackage.aw awVar5 = hisVar12.a;
                defpackage.zjm zjmVar7 = new defpackage.zjm((defpackage.aoin) new defpackage.jrm(new defpackage.lxl(awVar5, rlvVar, 1), 8), (defpackage.zcs) new defpackage.vkc(2));
                defpackage.rnz rnzVar2 = defpackage.rnz.CONTACTS_NAV_MENU_KEY;
                defpackage.zjm zjmVar8 = new defpackage.zjm((defpackage.aoin) new defpackage.jrm(new defpackage.lxl(hisVar12.aj(), (defpackage.rlv) himVar23.fq.a(), 0), 12), (defpackage.zcs) new defpackage.vkc(2));
                defpackage.rnz rnzVar3 = defpackage.rnz.HELP_AND_FEEDBACK_NAV_MENU_KEY;
                defpackage.rlv rlvVar2 = (defpackage.rlv) himVar23.fq.a();
                android.content.Context context2 = (android.content.Context) himVar23.s.a();
                defpackage.ahim ahimVar = (defpackage.ahim) hisVar12.X.a();
                hisVar12.dI();
                return defpackage.aigf.n(rnzVar, zjmVar7, rnzVar2, zjmVar8, rnzVar3, new defpackage.zjm((defpackage.aoin) new defpackage.jrm(new defpackage.lxl(rlvVar2, new defpackage.omd(context2, ahimVar, himVar23.a.jz), 2), 15), (defpackage.zcs) new defpackage.vkc(2)), defpackage.rnz.SETTINGS_NAV_MENU_KEY, new defpackage.zjm((defpackage.aoin) new defpackage.rmg(new defpackage.rwd((defpackage.rlv) himVar23.fq.a(), awVar5, himVar23.re()), 5), (defpackage.zcs) new defpackage.vkc(2)));
            case 48:
                defpackage.hkg hkgVar = this.e;
                defpackage.his hisVar13 = this.b;
                agzxVar = new defpackage.ahim(hkgVar.a(), hisVar13.a, (defpackage.agtj) hisVar13.f.a(), defpackage.ahwt.a, this.a.a.jx);
                return agzxVar;
            case 49:
                hip hipVar11 = this.a.a;
                return defpackage.aihd.v(hipVar11.bW(), hipVar11.bV(), hipVar11.bU(), hipVar11.bF(), hipVar11.br(), hipVar11.bv(), hipVar11.bs(), hipVar11.bt(), hipVar11.bA(), hipVar11.bM(), hipVar11.bR(), hipVar11.bX());
            case 50:
                defpackage.his hisVar14 = this.b;
                uzx uzxVar3 = new uzx(new uzx((defpackage.ahpz) hisVar14.b.bb.a()));
                ahhr ahhrVar = (ahhr) this.a.a.gk.a();
                defpackage.aw awVar6 = hisVar14.a;
                defpackage.ahvr.cl(awVar6.X(), "Fragment %s was not attached to a host", awVar6);
                agzxVar = new defpackage.ahhp(new jhx(uzxVar3, new zlk(awVar6, 13), 19, (byte[]) null), new ahho(awVar6, ahhrVar), true);
                return agzxVar;
            case 51:
                him himVar24 = this.a;
                return new defpackage.vwb((defpackage.aoss) himVar24.cb.a(), (defpackage.aazc) himVar24.l.a());
            case 52:
                him himVar25 = this.a;
                stf stfVar = stf.d;
                hip hipVar12 = himVar25.a;
                him himVar26 = hipVar12.a;
                defpackage.zjm zjmVar9 = new defpackage.zjm((defpackage.aoin) new omm(new osb(hipVar12.kk, (defpackage.rlv) himVar26.fq.a(), himVar26.be(), 1), 12), (defpackage.zcs) new defpackage.vkc(2));
                stf stfVar2 = stf.f;
                defpackage.zjm zjmVar10 = new defpackage.zjm((defpackage.aoin) new omm(new oqq((defpackage.rlv) himVar26.fq.a(), himVar26.be()), 13), (defpackage.zcs) new defpackage.vkc(2));
                stf stfVar3 = stf.e;
                osa osaVar = new osa(2);
                osb osbVar = new osb(new defpackage.zjm(j$.util.Optional.of(new defpackage.pez()), j$.util.Optional.of(new osa(0))), (defpackage.rlv) himVar26.fq.a(), himVar26.be(), 0);
                j$.util.Objects.requireNonNull(osaVar);
                return defpackage.aigf.m(stfVar, zjmVar9, stfVar2, zjmVar10, stfVar3, new defpackage.zjm((defpackage.aoin) new omm(osbVar, 14), (defpackage.zcs) new hqc(5)));
            case 53:
                hip hipVar13 = this.a.a;
                return defpackage.aihd.u(hipVar13.bw(), hipVar13.bB(), hipVar13.bS(), hipVar13.bH(), hipVar13.bx());
            case 54:
                return new defpackage.vwb((defpackage.aogc) this.a.fo.a());
            case 55:
                defpackage.his hisVar15 = this.b;
                him himVar27 = this.a;
                return new abtr(hisVar15.a, (defpackage.rlv) himVar27.fq.a(), (defpackage.nwu) himVar27.va.a(), (defpackage.gpd) himVar27.fD.a(), himVar27.oV());
            case 56:
                return new com.android.dialer.xatu.impl.ui.XatuSnackbarBehavior();
            case 57:
                defpackage.hkg hkgVar2 = this.b.ao;
                him himVar28 = hkgVar2.b;
                android.content.Context context3 = (android.content.Context) himVar28.s.a();
                android.accounts.AccountManager accountManager = (android.accounts.AccountManager) ((android.content.Context) himVar28.a.a.s.a()).getSystemService("account");
                if (accountManager != null) {
                    return new zoe(defpackage.aigf.k("google", new apjb(new defpackage.ucm(context3, new zoe(new defpackage.ucm(accountManager, (java.util.concurrent.Executor) himVar28.L.a(), (defpackage.agth) himVar28.qb.a())), (defpackage.agoo) himVar28.tw.a()), hkgVar2.a())));
                }
                throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 58:
                defpackage.his hisVar16 = this.b;
                him himVar29 = this.a;
                isrVar = new isr(hisVar16.cZ(), (android.content.Context) himVar29.s.a(), himVar29.mV(), hisVar16.dH(), j$.util.Optional.of(new defpackage.wsc(null)), himVar29.jC(), (defpackage.rlv) himVar29.fq.a(), (defpackage.isj) himVar29.vA.a(), himVar29.bV, himVar29.E(), himVar29.ac(), himVar29.oX(), (defpackage.aoss) himVar29.cb.a(), new jid((defpackage.rlv) hisVar16.b.fq.a()), (defpackage.kgl) himVar29.pv.a(), himVar29.Pa, himVar29.ox(), himVar29.qS());
                return isrVar;
            case 59:
                defpackage.his hisVar17 = this.b;
                him himVar30 = this.a;
                return new kvp(hisVar17.cZ(), hisVar17.dG(), himVar30.oX(), hisVar17.a, (defpackage.gpd) himVar30.fD.a(), 0);
            case 60:
                defpackage.his hisVar18 = this.b;
                him himVar31 = this.a;
                isrVar = new kjd(hisVar18.cZ(), (defpackage.rlv) himVar31.fq.a(), j$.util.Optional.of(new defpackage.wsc(null)), himVar31.jC(), himVar31.my(), hisVar18.dG(), himVar31.mV(), himVar31.oX(), (defpackage.aoss) himVar31.cb.a(), himVar31.fS(), himVar31.qS(), himVar31.iI, himVar31.Es, himVar31.pC);
                return isrVar;
            case 61:
                him himVar32 = this.a;
                return new kvk((android.content.Context) himVar32.s.a(), (defpackage.rlv) himVar32.fq.a(), this.b.a, himVar32.mK());
            case 62:
                him himVar33 = this.a;
                return new lca((android.content.Context) himVar33.s.a(), (defpackage.rlv) himVar33.fq.a(), himVar33.fS(), (defpackage.az) this.e.j.a());
            default:
                defpackage.aolr aolrVar3 = (defpackage.aolr) this.a.bn.a();
                defpackage.his hisVar19 = this.b;
                if (aolrVar3 == null) {
                    defpackage.aooh.i("mainContext");
                }
                defpackage.aw awVar7 = hisVar19.a;
                if (awVar7 == null) {
                    defpackage.aooh.i("fragment");
                }
                defpackage.ems emsVarP3 = awVar7.P();
                defpackage.aooh.e(emsVarP3, "<get-lifecycle>(...)");
                return defpackage.afsq.M(aolrVar3, emsVarP3);
        }
    }
}
