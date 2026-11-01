package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hjj implements amyz {
    public final defpackage.him a;
    public final defpackage.hkr b;
    private final int c;

    public hjj(defpackage.him himVar, defpackage.hkr hkrVar, int i) {
        this.a = himVar;
        this.b = hkrVar;
        this.c = i;
    }

    public final java.lang.Object a() {
        defpackage.mtp ojoVar;
        java.util.Set setSingleton;
        sgf veeVar;
        switch (this.c) {
            case 0:
                defpackage.him himVar = this.a;
                rai raiVar = (rai) himVar.bA.a();
                ajct ajctVar = (ajct) himVar.as.a();
                defpackage.hkr hkrVar = this.b;
                com.google.apps.tiktok.account.AccountId accountIdL = hkrVar.l();
                ahdp ahdpVar = (ahdp) hkrVar.d.a();
                defpackage.him himVar2 = hkrVar.b;
                agqo agqoVar = new agqo((ajwr) himVar2.bE.a(), hkrVar.l(), (ajct) himVar2.as.a());
                ahbz ahbzVar = (ahbz) himVar.AG.a();
                aigf aigfVar = aikj.b;
                aikn aiknVar = aikn.a;
                agoo agooVar = (agoo) himVar.tw.a();
                zzx zzxVarOY = himVar.oY();
                aooh.f(raiVar, "factory");
                aooh.f(ajctVar, "blockingExecutor");
                aooh.f(ahdpVar, "userCommitterFactory");
                aooh.f(ahbzVar, "updater");
                aooh.f(aiknVar, "flagRecorders");
                aooh.f(agooVar, "accountDataService");
                return raiVar.o(ahav.b, new agkc(agqoVar, 13), ajctVar, aigfVar, ahdt.a, new ahdu(ahdpVar, 0), new adot(ahbzVar, accountIdL, 20, (byte[]) null), new defpackage.acri(agooVar, accountIdL, zzxVarOY, 2), aiknVar);
            case 1:
                return new defpackage.hjh(this);
            case 2:
                return this.b.o();
            case 3:
                defpackage.him himVar3 = this.a;
                return new jbm((android.content.Context) himVar3.s.a(), (aolr) himVar3.bg.a(), (ecx) himVar3.hi.a(), (zjs) himVar3.cn.a(), this.b.E(), defpackage.him.nk(), himVar3.hj, himVar3.bd(), himVar3.be(), himVar3.N(), himVar3.ic, himVar3.id, himVar3.ie, himVar3.f4if, himVar3.ig, himVar3.ih, himVar3.ii, himVar3.ij);
            case 4:
                defpackage.hkr hkrVar2 = this.b;
                aigb aigbVarG = aigf.g(8);
                vcs vcsVar = vcs.c;
                defpackage.hkr hkrVar3 = hkrVar2.Q;
                aigbVarG.i(vcsVar, vfz.k(hkrVar3.e()));
                aigbVarG.i(vcs.d, vfz.l(hkrVar3.e()));
                aigbVarG.i(vcs.e, vfz.m(hkrVar3.e()));
                aigbVarG.i(vcs.f, vfz.n(hkrVar3.e()));
                aigbVarG.i(vcs.g, vfz.j(hkrVar3.e()));
                aigbVarG.i(vcs.h, vfz.o(hkrVar3.e()));
                aigbVarG.i(vcs.i, vfz.p(hkrVar3.e()));
                vcs vcsVar2 = vcs.b;
                defpackage.him himVar4 = hkrVar3.b;
                vlh vlhVarDe = himVar4.de();
                android.content.Context context = (android.content.Context) himVar4.s.a();
                ajct ajctVar2 = (ajct) himVar4.as.a();
                ajct ajctVar3 = (ajct) himVar4.r.a();
                android.content.Context context2 = (android.content.Context) himVar4.s.a();
                java.lang.Object objGF = himVar4.gF();
                vls vlsVar = (vls) objGF;
                vmc vmcVar = new vmc(context2, vlsVar, hkrVar3.d(), (vze) hkrVar3.t(), hkrVar3.j(), hkrVar3.i(), (ajct) himVar4.r.a(), (ajct) himVar4.as.a(), (ajcu) himVar4.aN.a(), (rlv) himVar4.fq.a(), himVar4.dT(), (rsr) hkrVar3.q(), himVar4.be(), (ruc) himVar4.eK.a());
                java.lang.Object objR = hkrVar3.r();
                android.content.Context context3 = (android.content.Context) himVar4.s.a();
                ajct ajctVar4 = (ajct) himVar4.r.a();
                tvn tvnVar = (tvn) himVar4.Di.a();
                java.lang.Object objT = hkrVar3.t();
                java.lang.Object objGF2 = himVar4.gF();
                vli vliVarI = hkrVar3.i();
                vmg vmgVar = (vmg) hkrVar3.r();
                vmi vmiVar = new vmi(context3, ajctVar4, tvnVar, (vze) objT, (vls) objGF2, vliVarI, vmgVar, hkrVar3.C(), (ruc) himVar4.eK.a());
                android.content.Context context4 = (android.content.Context) himVar4.s.a();
                ajct ajctVar5 = (ajct) himVar4.r.a();
                tvn tvnVar2 = (tvn) himVar4.Di.a();
                java.lang.Object objT2 = hkrVar3.t();
                vmg vmgVar2 = (vmg) objR;
                aigbVarG.i(vcsVar2, vfz.r(vlhVarDe, new vlm(context, ajctVar2, ajctVar3, vmcVar, vmgVar2, vmiVar, new ahbv(context4, ajctVar5, tvnVar2, (vze) objT2, (vls) himVar4.gF(), hkrVar3.i(), hkrVar3.d()), himVar4.dd(), hkrVar3.E(), (vlc) himVar4.gE(), (vze) hkrVar3.t(), (rlv) himVar4.fq.a(), himVar4.bd(), himVar4.be(), (gpd) himVar4.fD.a(), himVar4.BD)));
                return aigbVarG.e(true);
            case 5:
                defpackage.hkr hkrVar4 = this.b;
                defpackage.him himVar5 = hkrVar4.b;
                aigb aigbVarG2 = aigf.g(7);
                aigbVarG2.i(vcs.g, himVar5.jW());
                aigbVarG2.i(vcs.c, himVar5.kP());
                aigbVarG2.i(vcs.d, himVar5.lA());
                vcs vcsVar3 = vcs.e;
                defpackage.hkr hkrVar5 = hkrVar4.Q;
                aigbVarG2.i(vcsVar3, zjm.h(hkrVar5.f));
                aigbVarG2.i(vcs.f, zjm.h(hkrVar5.g));
                aigbVarG2.i(vcs.h, himVar5.lX());
                aigbVarG2.i(vcs.i, himVar5.lY());
                return aigbVarG2.e(true);
            case 6:
                return new vjv(this.b.f(), (ajct) this.a.r.a(), 1);
            case 7:
                return new vjv(this.b.f(), (ajct) this.a.r.a(), 0);
            case 8:
                defpackage.hkr hkrVar6 = this.b;
                return aigf.m(vcs.g, anar.z(hkrVar6.i), vcs.h, zjm.h(hkrVar6.k), vcs.i, zjm.h(hkrVar6.k));
            case 9:
                defpackage.hkr hkrVar7 = this.b;
                defpackage.him himVar6 = this.a;
                return new vjj(hkrVar7.g(), (vjm) himVar6.CG.a(), hkrVar7.h(), (aolr) himVar6.ca.a(), (aoss) himVar6.cb.a(), (rlv) himVar6.fq.a());
            case 10:
                defpackage.hkr hkrVar8 = this.b;
                defpackage.him himVar7 = hkrVar8.b;
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) himVar7.r.a();
                ajct ajctVar6 = (ajct) himVar7.as.a();
                vgj vgjVarF = hkrVar8.f();
                defpackage.hgw hgwVar = new defpackage.hgw();
                rsr rsrVarPt = himVar7.pt();
                zrw zrwVarDT = himVar7.dT();
                android.content.Context context5 = (android.content.Context) himVar7.s.a();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = (java.util.concurrent.ScheduledExecutorService) himVar7.r.a();
                ajct ajctVar7 = (ajct) himVar7.as.a();
                java.lang.Object objGR = himVar7.gR();
                agsm agsmVar = (agsm) himVar7.aT.a();
                oko okoVarBe = himVar7.be();
                android.content.Context context6 = (android.content.Context) himVar7.s.a();
                himVar7.be();
                vkj vkjVar = new vkj(scheduledExecutorService, ajctVar6, vgjVarF, hgwVar, rsrVarPt, zrwVarDT, new vix(context5, scheduledExecutorService2, ajctVar7, (viu) objGR, agsmVar, okoVarBe, new vaf(context6, himVar7.bd(), (ahbv) hkrVar8.j.a(), (aoss) himVar7.cb.a()), himVar7.CA, himVar7.Cz, himVar7.CB, himVar7.Ch), himVar7.bd(), himVar7.be(), himVar7.tc(), himVar7.CP);
                defpackage.him himVar8 = this.a;
                return sgg.g(vkjVar, hkrVar8.g(), (ajct) himVar8.r.a(), (rlv) himVar8.fq.a(), (vgl) himVar8.Cp.a(), (vdc) himVar8.Cu.a(), himVar8.CL.a(), hkrVar8.h());
            case 11:
                defpackage.hkr hkrVar9 = this.b;
                defpackage.him himVar9 = this.a;
                return new ahbv(hkrVar9.E(), hkrVar9.F(), (ajct) himVar9.L.a(), (ajct) himVar9.r.a(), (ajct) himVar9.as.a(), (aogc) himVar9.sL.a(), (mgu) himVar9.ch.a());
            case 12:
                defpackage.hkr hkrVar10 = this.b;
                defpackage.him himVar10 = hkrVar10.b;
                aigb aigbVarG3 = aigf.g(7);
                aigbVarG3.i(vcs.g, himVar10.jV());
                vcs vcsVar4 = vcs.c;
                defpackage.hkr hkrVar11 = hkrVar10.Q;
                aigbVarG3.i(vcsVar4, zjm.h(hkrVar11.m));
                aigbVarG3.i(vcs.d, zjm.h(hkrVar11.m));
                aigbVarG3.i(vcs.e, zjm.h(hkrVar11.m));
                aigbVarG3.i(vcs.f, zjm.h(hkrVar11.m));
                aigbVarG3.i(vcs.h, zjm.h(hkrVar11.m));
                aigbVarG3.i(vcs.i, zjm.h(hkrVar11.m));
                return aigbVarG3.e(true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.hkr hkrVar12 = this.b;
                defpackage.him himVar11 = this.a;
                return new vke(hkrVar12.G(), hkrVar12.f(), (ajct) himVar11.as.a(), (ajcu) himVar11.r.a(), himVar11.be());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.him himVar12 = this.a;
                android.content.Context context7 = (android.content.Context) himVar12.s.a();
                defpackage.hkr hkrVar13 = this.b;
                defpackage.him himVar13 = hkrVar13.b;
                apni apniVarQq = himVar13.qq();
                android.content.Context context8 = (android.content.Context) himVar13.s.a();
                ajct ajctVar8 = (ajct) himVar13.as.a();
                ojoVar = new ojo(context7, new aogc(apniVarQq, context8, ajctVar8, (byte[][]) null), himVar12.qt(), himVar12.nr(), himVar12.oq(), himVar12.oE);
                return ojoVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.him himVar14 = this.a;
                ahqj ahqjVar = (ahqj) himVar14.E.a();
                com.google.apps.tiktok.account.AccountId accountId = this.b.a;
                ahda ahdaVarNQ = himVar14.nQ();
                if (accountId == null) {
                    setSingleton = java.util.Collections.EMPTY_SET;
                } else {
                    ahou ahouVarB = ahou.b();
                    defpackage.agmq.a(ahouVarB, accountId);
                    setSingleton = java.util.Collections.singleton(ahouVarB.f());
                }
                aooc.ap(setSingleton);
                return achn.s(ahqjVar, ahdaVarNQ, aihd.o(setSingleton));
            case 16:
                return new defpackage.hji(this, 0);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.him himVar15 = this.a;
                android.content.Context context9 = (android.content.Context) himVar15.s.a();
                defpackage.hkr hkrVar14 = this.b;
                java.lang.Object objT3 = hkrVar14.t();
                okj okjVarBd = himVar15.bd();
                ajct ajctVar9 = (ajct) himVar15.r.a();
                zjs zjsVar = (zjs) himVar15.cn.a();
                sou souVar = (sou) himVar15.vr.a();
                defpackage.him himVar16 = hkrVar14.b;
                android.content.Context context10 = (android.content.Context) himVar16.s.a();
                hkrVar14.t();
                return new vup(context9, (vze) objT3, okjVarBd, ajctVar9, zjsVar, souVar, new tvn(context10));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.hkr hkrVar15 = this.b;
                aigb aigbVarG4 = aigf.g(8);
                vcs vcsVar5 = vcs.c;
                defpackage.him himVar17 = hkrVar15.b;
                aigbVarG4.i(vcsVar5, himVar17.lC());
                aigbVarG4.i(vcs.d, himVar17.lD());
                aigbVarG4.i(vcs.e, himVar17.lE());
                aigbVarG4.i(vcs.f, himVar17.lF());
                aigbVarG4.i(vcs.h, himVar17.lG());
                aigbVarG4.i(vcs.i, himVar17.lH());
                aigbVarG4.i(vcs.g, himVar17.lB());
                vcs vcsVar6 = vcs.b;
                defpackage.hkr hkrVar16 = hkrVar15.Q;
                aigbVarG4.i(vcsVar6, vfz.s(hkrVar16.b.de(), hkrVar16.j()));
                return aigbVarG4.e(true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.hkr hkrVar17 = this.b;
                aigb aigbVarG5 = aigf.g(8);
                vcs vcsVar7 = vcs.c;
                defpackage.hkr hkrVar18 = hkrVar17.Q;
                aigbVarG5.i(vcsVar7, vfz.e(hkrVar18.p()));
                aigbVarG5.i(vcs.d, vfz.d(hkrVar18.p()));
                aigbVarG5.i(vcs.e, vfz.f(hkrVar18.p()));
                aigbVarG5.i(vcs.f, vfz.g(hkrVar18.p()));
                aigbVarG5.i(vcs.g, jsl.s(hkrVar18.p()));
                aigbVarG5.i(vcs.h, vfz.h(hkrVar18.p()));
                aigbVarG5.i(vcs.i, vfz.i(hkrVar18.p()));
                aigbVarG5.i(vcs.b, vfz.q(hkrVar18.b.de(), hkrVar18.i()));
                return aigbVarG5.e(true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                defpackage.him himVar18 = this.a;
                java.lang.Object objGQ = himVar18.gQ();
                zjx zjxVar = (zjx) himVar18.kO.a();
                vea veaVar = (vea) himVar18.Dm.a();
                defpackage.hkr hkrVar19 = this.b;
                aogc aogcVar = (aogc) objGQ;
                veeVar = new vee(aogcVar, zjxVar, veaVar, hkrVar19.G(), (gpd) hkrVar19.u(), himVar18.fq, j$.util.Optional.empty(), (ajct) himVar18.r.a(), himVar18.Dn, himVar18.Do, (zzx) himVar18.gq(), himVar18.kN);
                return veeVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                return aihd.r(zjm.h(this.b.x), this.a.kT());
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                defpackage.hkr hkrVar20 = this.b;
                defpackage.him himVar19 = hkrVar20.b;
                return new defpackage.jrn(new defpackage.jrp((uhs) himVar19.iu.a(), himVar19.mF(), (aoss) himVar19.cb.a(), hkrVar20.B(), hkrVar20.c()), hkrVar20.c(), (aogc) this.a.fo.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                defpackage.hkr hkrVar21 = this.b;
                defpackage.him himVar20 = hkrVar21.b;
                aigb aigbVarG6 = aigf.g(27);
                aigbVarG6.i(rvc.j, himVar20.jU());
                aigbVarG6.i(rvc.k, himVar20.ka());
                aigbVarG6.i(rvc.e, himVar20.kc());
                aigbVarG6.i(rvc.l, himVar20.km());
                aigbVarG6.i(rvc.n, himVar20.ky());
                aigbVarG6.i(rvc.m, himVar20.kC());
                aigbVarG6.i(rvc.y, himVar20.kn());
                rvc rvcVar = rvc.o;
                defpackage.hkr hkrVar22 = hkrVar21.Q;
                aigbVarG6.i(rvcVar, defpackage.irr.m(hkrVar22.A(), hkrVar22.A));
                aigbVarG6.i(rvc.c, zjm.h(hkrVar22.B));
                aigbVarG6.i(rvc.z, himVar20.lr());
                aigbVarG6.i(rvc.r, himVar20.jY());
                defpackage.him himVar21 = hkrVar22.b;
                aigbVarG6.i(rvc.J, defpackage.irr.l(himVar21.E(), afsq.cM(j$.util.Optional.of(new mnp((android.content.Context) himVar21.s.a(), himVar21.td(), himVar21.aG(), himVar21.ps(), (zpm) himVar21.fn.a(), himVar21.aF(), (mtd) himVar21.FG.a(), himVar21.aO(), hkrVar22.b(), (aoss) himVar21.cb.a(), (kaw) himVar21.FH.a())), j$.util.Optional.of(himVar21.aE())), himVar21.wz));
                aigbVarG6.i(rvc.b, defpackage.lhj.i(himVar21.al(), hkrVar22.C));
                aigbVarG6.i(rvc.F, himVar20.kL());
                aigbVarG6.i(rvc.q, himVar20.kQ());
                aigbVarG6.i(rvc.B, himVar20.kX());
                aigbVarG6.i(rvc.E, himVar20.lb());
                aigbVarG6.i(rvc.h, himVar20.ly());
                aigbVarG6.i(rvc.H, sgg.l(new hrc(6), hkrVar22.D));
                aigbVarG6.i(rvc.M, himVar20.lN());
                aigbVarG6.i(rvc.d, himVar20.lS());
                aigbVarG6.i(rvc.C, himVar20.lZ());
                aigbVarG6.i(rvc.x, himVar20.lz());
                aigbVarG6.i(rvc.u, himVar20.lM());
                aigbVarG6.i(rvc.N, himVar20.lP());
                aigbVarG6.i(rvc.v, himVar20.mb());
                aigbVarG6.i(rvc.g, himVar20.mi());
                return aigbVarG6.e(true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                defpackage.him himVar22 = this.a;
                android.content.Context context11 = (android.content.Context) himVar22.s.a();
                amyz amyzVar = himVar22.oD;
                ajct ajctVar10 = (ajct) himVar22.L.a();
                ajct ajctVar11 = (ajct) himVar22.r.a();
                defpackage.hkr hkrVar23 = this.b;
                defpackage.him himVar23 = hkrVar23.b;
                sqv sqvVar = new sqv((ajct) himVar23.L.a(), (ajct) himVar23.r.a(), (ojo) hkrVar23.p.a());
                android.content.Context context12 = (android.content.Context) himVar23.s.a();
                ajct ajctVar12 = (ajct) himVar23.L.a();
                ssr ssrVar = (ssr) himVar23.oH.a();
                ruc rucVar = (ruc) himVar23.eK.a();
                return new sqo(context11, amyzVar, ajctVar10, ajctVar11, sqvVar, new sqw(context12, ajctVar12, ssrVar, rucVar, (ojo) hkrVar23.p.a(), himVar23.be(), himVar23.nD(), (rlv) himVar23.fq.a()), (ipc) himVar22.gm());
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                defpackage.him himVar24 = this.a;
                veeVar = new defpackage.kzi((android.content.Context) himVar24.s.a(), (ajct) himVar24.r.a(), this.b.A());
                return veeVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                defpackage.him himVar25 = this.a;
                veeVar = new sgf((android.content.Context) himVar25.s.a(), this.b.c(), (ajct) himVar25.r.a(), 1);
                return veeVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new defpackage.mmt(this.b.D(), 1);
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                defpackage.him himVar26 = this.a;
                android.content.Context context13 = (android.content.Context) himVar26.s.a();
                defpackage.hkr hkrVar24 = this.b;
                shq shqVar = new shq((ojo) hkrVar24.p.a());
                defpackage.him himVar27 = hkrVar24.b;
                return new sgf(context13, new sah(new sin(shqVar, (aolr) himVar27.ca.a(), himVar27.bE(), new sjy((android.content.Context) himVar27.s.a(), himVar27.oX(), (ojo) hkrVar24.p.a(), (aazc) himVar27.l.a(), (ahhp) himVar27.rU.a(), (rlv) himVar27.fq.a(), (aolr) himVar27.bg.a(), (aolr) himVar27.bY.a(), himVar27.ts, himVar27.tt, himVar27.tu, himVar27.eh()), himVar27.tt, (agpq) himVar27.rx.a())), (aoss) himVar26.cb.a(), 0);
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                defpackage.hkr hkrVar25 = this.b;
                return aigf.k(ruv.a, defpackage.lhj.j(hkrVar25.b.az(), hkrVar25.F));
            case 30:
                defpackage.him himVar28 = this.a;
                return new defpackage.lyt((android.content.Context) himVar28.s.a(), (aoss) himVar28.cb.a(), this.b.a());
            case 31:
                return agwm.b(this.b.H);
            case 32:
                defpackage.hkr hkrVar26 = this.b;
                aigf aigfVar2 = aikj.b;
                defpackage.him himVar29 = hkrVar26.b;
                return new agrx(aigfVar2, new agqo((ajwr) himVar29.bE.a(), hkrVar26.l(), (ajct) himVar29.L.a()), (ajct) this.a.L.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                defpackage.him himVar30 = this.b.b;
                aile aileVar = himVar30.ix() ? new aile((akxm) himVar30.Aw.a()) : aikn.a;
                aooc.ap(aileVar);
                return aihd.o(aileVar);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                defpackage.him himVar31 = this.a;
                android.content.Context context14 = (android.content.Context) himVar31.s.a();
                mnl mnlVarAF = himVar31.aF();
                rlv rlvVar = (rlv) himVar31.fq.a();
                j$.util.Optional optionalOf = j$.util.Optional.of(new wsc((byte[]) null));
                defpackage.hkr hkrVar27 = this.b;
                defpackage.him himVar32 = hkrVar27.b;
                ojoVar = new defpackage.mtp(context14, mnlVarAF, rlvVar, optionalOf, afsq.cM(j$.util.Optional.of(new defpackage.irl((ish) himVar32.ya.a(), himVar32.E(), (kgl) himVar32.pv.a(), (jbm) hkrVar27.w.a(), himVar32.K(), himVar32.L(), (ita) himVar32.Gi.a(), defpackage.him.nk(), (android.content.Context) himVar32.s.a(), (kaw) himVar32.FH.a())), j$.util.Optional.of(himVar32.E())), himVar31.iI, himVar31.Es);
                return ojoVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                defpackage.hkr hkrVar28 = this.b;
                aigb aigbVarG7 = aigf.g(10);
                yse yseVar = yse.j;
                defpackage.him himVar33 = hkrVar28.b;
                aigbVarG7.i(yseVar, himVar33.mo());
                aigbVarG7.i(yse.k, himVar33.mn());
                aigbVarG7.i(yse.l, himVar33.mp());
                yse yseVar2 = yse.b;
                defpackage.hkr hkrVar29 = hkrVar28.Q;
                defpackage.him himVar34 = hkrVar29.b;
                aigbVarG7.i(yseVar2, defpackage.irr.h(himVar34.E(), hkrVar29.K));
                aigbVarG7.i(yse.c, defpackage.irr.i(himVar34.E(), hkrVar29.L));
                aigbVarG7.i(yse.m, himVar33.me());
                aigbVarG7.i(yse.e, himVar33.ml());
                aigbVarG7.i(yse.f, defpackage.lhj.k(himVar34.io, hkrVar29.M));
                aigbVarG7.i(yse.i, defpackage.lhj.l(himVar34.iI, hkrVar29.N));
                aigbVarG7.i(yse.d, himVar33.mm());
                return aigbVarG7.e(true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                jbm jbmVar = (jbm) this.b.w.a();
                defpackage.him himVar35 = this.a;
                return new irq(jbmVar, (kpa) himVar35.bT.a(), himVar35.E());
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                defpackage.him himVar36 = this.a;
                return new defpackage.jcz(himVar36.il, himVar36.E(), (jbm) this.b.w.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return new defpackage.nki(this.b.b(), this.a.wU);
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                return new defpackage.nkk(this.b.b(), this.a.iI);
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                defpackage.hkr hkrVar30 = this.b;
                defpackage.him himVar37 = hkrVar30.b;
                aigb aigbVarG8 = aigf.g(15);
                aigbVarG8.i(ztb.j, himVar37.jZ());
                aigbVarG8.i(ztb.n, himVar37.kY());
                aigbVarG8.i(ztb.o, himVar37.kU());
                ztb ztbVar = ztb.h;
                defpackage.hkr hkrVar31 = hkrVar30.Q;
                aigbVarG8.i(ztbVar, anar.z(hkrVar31.O));
                aigbVarG8.i(ztb.i, himVar37.kB());
                aigbVarG8.i(ztb.l, himVar37.lI());
                aigbVarG8.i(ztb.m, himVar37.lJ());
                aigbVarG8.i(ztb.b, himVar37.lL());
                aigbVarG8.i(ztb.c, himVar37.lK());
                aigbVarG8.i(ztb.d, himVar37.lw());
                aigbVarG8.i(ztb.g, anar.z(hkrVar31.P));
                aigbVarG8.i(ztb.e, himVar37.mg());
                aigbVarG8.i(ztb.f, himVar37.mf());
                aigbVarG8.i(ztb.k, himVar37.mh());
                aigbVarG8.i(ztb.p, himVar37.mj());
                return aigbVarG8.e(true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                defpackage.him himVar38 = this.a;
                android.content.Context context15 = (android.content.Context) himVar38.s.a();
                aoss aossVar = (aoss) himVar38.cb.a();
                zjs zjsVar2 = (zjs) himVar38.cn.a();
                defpackage.hkr hkrVar32 = this.b;
                defpackage.him himVar39 = hkrVar32.b;
                return new nwn(context15, aossVar, zjsVar2, new suf((ajct) himVar39.L.a(), (ajcu) himVar39.r.a(), himVar39.dT(), (zjs) himVar39.cn.a(), (ojo) hkrVar32.p.a(), himVar39.oO()), (rlv) himVar38.fq.a());
            default:
                return new szh(this.b.D());
        }
    }
}
