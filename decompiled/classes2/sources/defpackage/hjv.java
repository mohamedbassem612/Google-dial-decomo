package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hjv implements amyz {
    public final defpackage.hjw a;
    private final defpackage.him b;
    private final int c;

    public hjv(defpackage.him himVar, defpackage.hjw hjwVar, int i) {
        this.b = himVar;
        this.a = hjwVar;
        this.c = i;
    }

    public final java.lang.Object a() {
        allc alkbVar;
        allv allxVar;
        aljm alkkVar;
        switch (this.c) {
            case 0:
                defpackage.hjw hjwVar = this.a;
                apjb apjbVar = (apjb) hjwVar.e.a();
                aigb aigbVarG = aigf.g(12);
                aigbVarG.i(allh.g, hjwVar.m);
                aigbVarG.i(allh.h, hjwVar.n);
                aigbVarG.i(allh.i, hjwVar.o);
                aigbVarG.i(allh.b, hjwVar.p);
                aigbVarG.i(allh.w, hjwVar.q);
                aigbVarG.i(allh.x, hjwVar.r);
                aigbVarG.i(allh.m, hjwVar.s);
                aigbVarG.i(allh.f, hjwVar.v);
                allh allhVar = allh.a;
                amyz amyzVar = hjwVar.w;
                aigbVarG.i(allhVar, amyzVar);
                aigbVarG.i(allh.j, hjwVar.x);
                aigbVarG.i(allh.k, hjwVar.z);
                aigbVarG.i(allh.c, hjwVar.A);
                j$.util.Optional optionalOf = j$.util.Optional.of(aigbVarG.e(true));
                amyz amyzVar2 = hjwVar.B;
                alkd alkdVar = new alkd(defpackage.achr.h(optionalOf, (aihd) amyzVar2.a()), apjbVar, (aizr) hjwVar.a.Bk.a());
                defpackage.him himVar = this.b;
                amyz amyzVar3 = hjwVar.k;
                return new aljp(alkdVar, himVar.iI(), (amac) amyzVar3.a(), (aljy) hjwVar.c.a(), (alkw) hjwVar.d.a(), new aljo(defpackage.achr.g(j$.util.Optional.of(aigf.k(allhVar, amyzVar)), (aihd) amyzVar2.a()), (amac) amyzVar3.a()), (alkf) hjwVar.C.a());
            case 1:
                return defpackage.achr.m((alkw) this.a.d.a());
            case 2:
                alkbVar = new alkb((aljy) this.a.c.a());
                return alkbVar;
            case 3:
                return new aljy();
            case 4:
                defpackage.hjw hjwVar2 = this.a;
                allxVar = new allx((alli) hjwVar2.i.a(), (alqf) hjwVar2.l.a());
                return allxVar;
            case 5:
                alkbVar = new defpackage.hic(this, 5);
                return alkbVar;
            case 6:
                return new xtq((short[]) null);
            case 7:
                return new apjb((aizr) this.b.Bk.a(), new xtq((aljg) this.a.a.Bm.a()), (byte[]) null);
            case 8:
                alkbVar = new alqf((amac) this.a.k.a());
                return alkbVar;
            case 9:
                alkbVar = new amac((alpg) this.a.j.a());
                return alkbVar;
            case 10:
                return new alpg();
            case 11:
                alkbVar = new alkg((alli) this.a.i.a());
                return alkbVar;
            case 12:
                defpackage.hjw hjwVar3 = this.a;
                alkkVar = new alkk((alli) hjwVar3.i.a(), (alqf) hjwVar3.l.a(), new aljq());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.hjw hjwVar4 = this.a;
                return new alkr((alli) hjwVar4.i.a(), new aljq(), (amac) hjwVar4.k.a(), (alkw) hjwVar4.d.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                alkbVar = new alzp(new alzq(0), (alli) this.a.i.a(), 0);
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.hjw hjwVar5 = this.a;
                alkkVar = new alzs(new alvv((alli) hjwVar5.i.a(), allh.x.name()), new aljq(), (alqf) hjwVar5.l.a());
                return alkkVar;
            case 16:
                defpackage.hjw hjwVar6 = this.a;
                allxVar = new alvs((alli) hjwVar6.i.a(), (alqf) hjwVar6.l.a());
                return allxVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.hjw hjwVar7 = this.a;
                allxVar = new allv((alli) hjwVar7.i.a(), (allu) hjwVar7.t.a());
                return allxVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.hjw hjwVar8 = this.a;
                alkkVar = new allu((amac) hjwVar8.k.a(), (alpg) hjwVar8.j.a(), (alqf) hjwVar8.l.a());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.hjw hjwVar9 = this.a;
                alkkVar = new aljm((alli) hjwVar9.i.a(), (amac) hjwVar9.k.a(), (alkw) hjwVar9.d.a());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                return defpackage.achr.i((alli) this.a.i.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                alkbVar = new alku((alli) this.a.i.a());
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                alkbVar = new allc((alli) this.a.i.a());
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                aihd aihdVarV = aihd.v(allh.b, allh.f, allh.h, allh.i, allh.j, allh.k, new allh[]{allh.c, allh.g, allh.w, allh.x, allh.m});
                aooc.ap(aihdVarV);
                return aihdVarV;
            default:
                return new alkf();
        }
    }
}
