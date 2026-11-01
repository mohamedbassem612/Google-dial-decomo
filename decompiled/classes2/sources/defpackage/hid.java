package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hid implements amyz {
    public final defpackage.hie a;
    private final defpackage.him b;
    private final int c;

    public hid(defpackage.him himVar, defpackage.hie hieVar, int i) {
        this.b = himVar;
        this.a = hieVar;
        this.c = i;
    }

    public final java.lang.Object a() {
        allc alkbVar;
        allv allxVar;
        aljm alkkVar;
        switch (this.c) {
            case 0:
                defpackage.hie hieVar = this.a;
                apjb apjbVar = (apjb) hieVar.e.a();
                aigb aigbVarG = aigf.g(11);
                aigbVarG.i(allh.g, hieVar.m);
                aigbVarG.i(allh.h, hieVar.n);
                aigbVarG.i(allh.i, hieVar.o);
                aigbVarG.i(allh.b, hieVar.p);
                aigbVarG.i(allh.S, hieVar.q);
                aigbVarG.i(allh.R, hieVar.r);
                aigbVarG.i(allh.f, hieVar.u);
                allh allhVar = allh.a;
                amyz amyzVar = hieVar.v;
                aigbVarG.i(allhVar, amyzVar);
                aigbVarG.i(allh.j, hieVar.w);
                aigbVarG.i(allh.k, hieVar.y);
                aigbVarG.i(allh.c, hieVar.z);
                j$.util.Optional optionalOf = j$.util.Optional.of(aigbVarG.e(true));
                amyz amyzVar2 = hieVar.A;
                alkd alkdVar = new alkd(defpackage.achr.h(optionalOf, (aihd) amyzVar2.a()), apjbVar, (aizr) hieVar.a.Bk.a());
                defpackage.him himVar = this.b;
                amyz amyzVar3 = hieVar.k;
                return new aljp(alkdVar, himVar.iI(), (amac) amyzVar3.a(), (aljy) hieVar.c.a(), (alkw) hieVar.d.a(), new aljo(defpackage.achr.g(j$.util.Optional.of(aigf.k(allhVar, amyzVar)), (aihd) amyzVar2.a()), (amac) amyzVar3.a()), (alkf) hieVar.B.a());
            case 1:
                return defpackage.achr.m((alkw) this.a.d.a());
            case 2:
                alkbVar = new alkb((aljy) this.a.c.a());
                return alkbVar;
            case 3:
                return new aljy();
            case 4:
                defpackage.hie hieVar2 = this.a;
                allxVar = new allx((alli) hieVar2.i.a(), (alqf) hieVar2.l.a());
                return allxVar;
            case 5:
                alkbVar = new defpackage.hic(this, 0);
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
                defpackage.hie hieVar3 = this.a;
                alkkVar = new alkk((alli) hieVar3.i.a(), (alqf) hieVar3.l.a(), new aljq());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.hie hieVar4 = this.a;
                return new alkr((alli) hieVar4.i.a(), new aljq(), (amac) hieVar4.k.a(), (alkw) hieVar4.d.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                alkbVar = new alzp(new alzq(1, (byte[]) null), (alli) this.a.i.a(), 1, (byte[]) null);
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.hie hieVar5 = this.a;
                alkkVar = new alvp((alli) hieVar5.i.a(), new aljq(), (alqf) hieVar5.l.a());
                return alkkVar;
            case 16:
                defpackage.hie hieVar6 = this.a;
                allxVar = new allv((alli) hieVar6.i.a(), (allu) hieVar6.s.a());
                return allxVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.hie hieVar7 = this.a;
                alkkVar = new allu((amac) hieVar7.k.a(), (alpg) hieVar7.j.a(), (alqf) hieVar7.l.a());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.hie hieVar8 = this.a;
                alkkVar = new aljm((alli) hieVar8.i.a(), (amac) hieVar8.k.a(), (alkw) hieVar8.d.a());
                return alkkVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return defpackage.achr.i((alli) this.a.i.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                alkbVar = new alku((alli) this.a.i.a());
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                alkbVar = new allc((alli) this.a.i.a());
                return alkbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                aihd aihdVarV = aihd.v(allh.f, allh.h, allh.i, allh.j, allh.R, allh.S, new allh[]{allh.k, allh.b});
                aooc.ap(aihdVarV);
                return aihdVarV;
            default:
                return new alkf();
        }
    }
}
