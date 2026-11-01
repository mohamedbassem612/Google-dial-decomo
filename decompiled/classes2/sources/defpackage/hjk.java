package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hjk implements amyz {
    public final defpackage.hjl a;
    private final defpackage.him b;
    private final int c;

    public hjk(defpackage.him himVar, defpackage.hjl hjlVar, int i) {
        this.b = himVar;
        this.a = hjlVar;
        this.c = i;
    }

    public final java.lang.Object a() {
        allc alkbVar;
        allv alkvVar;
        aljm alkkVar;
        switch (this.c) {
            case 0:
                defpackage.hjl hjlVar = this.a;
                apjb apjbVar = (apjb) hjlVar.e.a();
                aigb aigbVarG = aigf.g(15);
                aigbVarG.i(allh.l, hjlVar.m);
                aigbVarG.i(allh.g, hjlVar.n);
                aigbVarG.i(allh.h, hjlVar.o);
                aigbVarG.i(allh.i, hjlVar.p);
                aigbVarG.i(allh.b, hjlVar.q);
                aigbVarG.i(allh.n, hjlVar.r);
                aigbVarG.i(allh.o, hjlVar.s);
                aigbVarG.i(allh.q, hjlVar.t);
                aigbVarG.i(allh.r, hjlVar.u);
                aigbVarG.i(allh.p, hjlVar.x);
                aigbVarG.i(allh.f, hjlVar.z);
                allh allhVar = allh.a;
                amyz amyzVar = hjlVar.A;
                aigbVarG.i(allhVar, amyzVar);
                aigbVarG.i(allh.j, hjlVar.B);
                aigbVarG.i(allh.k, hjlVar.D);
                aigbVarG.i(allh.c, hjlVar.E);
                j$.util.Optional optionalOf = j$.util.Optional.of(aigbVarG.e(true));
                amyz amyzVar2 = hjlVar.F;
                alkd alkdVar = new alkd(defpackage.achr.h(optionalOf, (aihd) amyzVar2.a()), apjbVar, (aizr) hjlVar.a.Bk.a());
                defpackage.him himVar = this.b;
                amyz amyzVar3 = hjlVar.k;
                return new aljp(alkdVar, himVar.iI(), (amac) amyzVar3.a(), (aljy) hjlVar.c.a(), (alkw) hjlVar.d.a(), new aljo(defpackage.achr.g(j$.util.Optional.of(aigf.k(allhVar, amyzVar)), (aihd) amyzVar2.a()), (amac) amyzVar3.a()), (alkf) hjlVar.G.a());
            case 1:
                return defpackage.achr.m((alkw) this.a.d.a());
            case 2:
                alkbVar = new alkb((aljy) this.a.c.a());
                return alkbVar;
            case 3:
                return new aljy();
            case 4:
                defpackage.hjl hjlVar2 = this.a;
                alkvVar = new alkv((alli) hjlVar2.i.a(), (alkw) hjlVar2.d.a(), (amac) hjlVar2.k.a(), (alqf) hjlVar2.l.a(), (alpi) this.b.Tk.a());
                return alkvVar;
            case 5:
                alkbVar = new defpackage.hic(this, 2);
                return alkbVar;
            case 6:
                return new xtq((short[]) null);
            case 7:
                return new apjb((aizr) this.b.Bk.a(), new xtq((aljg) this.a.a.Bm.a()), (byte[]) null);
            case 8:
                alkbVar = new amac((alpg) this.a.j.a());
                return alkbVar;
            case 9:
                return new alpg();
            case 10:
                alkbVar = new alqf((amac) this.a.k.a());
                return alkbVar;
            case 11:
                defpackage.hjl hjlVar3 = this.a;
                alkvVar = new allx((alli) hjlVar3.i.a(), (alqf) hjlVar3.l.a());
                return alkvVar;
            case 12:
                alkbVar = new alkg((alli) this.a.i.a());
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.hjl hjlVar4 = this.a;
                alkkVar = new alkk((alli) hjlVar4.i.a(), (alqf) hjlVar4.l.a(), new aljq());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.hjl hjlVar5 = this.a;
                return new alkr((alli) hjlVar5.i.a(), new aljq(), (amac) hjlVar5.k.a(), (alkw) hjlVar5.d.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                alkbVar = new alyv(new alyw(0), (alli) this.a.i.a());
                return alkbVar;
            case 16:
                defpackage.hjl hjlVar6 = this.a;
                alkvVar = new alza((alli) hjlVar6.i.a(), (alqf) hjlVar6.l.a());
                return alkvVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                alkvVar = new alzd((alli) this.a.i.a(), new aljq());
                return alkvVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                alkbVar = new alzf((alli) this.a.i.a());
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.hjl hjlVar7 = this.a;
                alkvVar = new alzi((alli) hjlVar7.i.a(), (allu) hjlVar7.v.a());
                return alkvVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                defpackage.hjl hjlVar8 = this.a;
                alkkVar = new allu((amac) hjlVar8.k.a(), (alpg) hjlVar8.j.a(), (alqf) hjlVar8.l.a());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                defpackage.hjl hjlVar9 = this.a;
                alkvVar = new allv((alli) hjlVar9.i.a(), (allu) hjlVar9.v.a());
                return alkvVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                defpackage.hjl hjlVar10 = this.a;
                alkkVar = new aljm((alli) hjlVar10.i.a(), (amac) hjlVar10.k.a(), (alkw) hjlVar10.d.a());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                return defpackage.achr.i((alli) this.a.i.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                alkbVar = new alku((alli) this.a.i.a());
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                alkbVar = new allc((alli) this.a.i.a());
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                aihd aihdVarV = aihd.v(allh.b, allh.f, allh.h, allh.i, allh.j, allh.o, new allh[]{allh.p, allh.n, allh.k, allh.c, allh.g, allh.l, allh.q, allh.r});
                aooc.ap(aihdVarV);
                return aihdVarV;
            default:
                return new alkf();
        }
    }
}
