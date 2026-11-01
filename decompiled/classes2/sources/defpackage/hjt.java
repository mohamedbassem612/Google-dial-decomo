package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hjt implements amyz {
    public final defpackage.hju a;
    private final defpackage.him b;
    private final int c;

    public hjt(defpackage.him himVar, defpackage.hju hjuVar, int i) {
        this.b = himVar;
        this.a = hjuVar;
        this.c = i;
    }

    public final java.lang.Object a() {
        amci amczVar;
        alzp hicVar;
        switch (this.c) {
            case 0:
                defpackage.hju hjuVar = this.a;
                apjb apjbVar = (apjb) hjuVar.f.a();
                j$.util.Optional optionalOf = j$.util.Optional.of(aigf.n(allh.G, hjuVar.r, allh.F, hjuVar.t, allh.j, hjuVar.u, allh.E, hjuVar.v));
                amyz amyzVar = hjuVar.w;
                alkd alkdVar = new alkd(defpackage.achr.h(optionalOf, (aihd) amyzVar.a()), apjbVar, (aizr) hjuVar.a.Bk.a());
                defpackage.him himVar = this.b;
                amyz amyzVar2 = hjuVar.l;
                return new aljp(alkdVar, himVar.iI(), (amac) amyzVar2.a(), (aljy) hjuVar.c.a(), (alkw) hjuVar.e.a(), new aljo(defpackage.achr.g(j$.util.Optional.empty(), (aihd) amyzVar.a()), (amac) amyzVar2.a()), (alkf) hjuVar.x.a());
            case 1:
                return defpackage.achr.m((alkw) this.a.e.a());
            case 2:
                defpackage.hju hjuVar2 = this.a;
                amczVar = new amcz((aljy) hjuVar2.c.a(), (alzu) hjuVar2.d.a());
                return amczVar;
            case 3:
                return new aljy();
            case 4:
                return new alzu();
            case 5:
                defpackage.hju hjuVar3 = this.a;
                return new amfe((alli) hjuVar3.j.a(), aigf.k(amch.b, (amcg) hjuVar3.q.a()), (amci) hjuVar3.n.a());
            case 6:
                hicVar = new defpackage.hic(this, 4);
                return hicVar;
            case 7:
                return new xtq((short[]) null);
            case 8:
                return new apjb((aizr) this.b.Bk.a(), new xtq((aljg) this.a.a.Bn.a()), (byte[]) null);
            case 9:
                defpackage.hju hjuVar4 = this.a;
                amyz amyzVar3 = hjuVar4.o;
                aigf aigfVarL = aigf.l(amdd.b, (amdf) amyzVar3.a(), amdd.a, (amdf) hjuVar4.p.a());
                defpackage.him himVar2 = this.b;
                return defpackage.achr.j(aigfVarL, (amey) himVar2.Tj.a(), (aizr) himVar2.Bk.a(), (amac) hjuVar4.l.a(), (alpg) hjuVar4.k.a(), (alqf) hjuVar4.m.a(), (amci) hjuVar4.n.a());
            case 10:
                amey ameyVar = (amey) this.b.Tj.a();
                defpackage.hju hjuVar5 = this.a;
                return defpackage.achr.k(ameyVar, (amac) hjuVar5.l.a(), (amci) hjuVar5.n.a());
            case 11:
                hicVar = new amac((alpg) this.a.k.a());
                return hicVar;
            case 12:
                return new alpg();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.hju hjuVar6 = this.a;
                amczVar = new amci((alpg) hjuVar6.k.a(), (alqf) hjuVar6.m.a());
                return amczVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                hicVar = new alqf((amac) this.a.l.a());
                return hicVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new amdu();
            case 16:
                defpackage.hju hjuVar7 = this.a;
                return new amfh((alli) hjuVar7.j.a(), (alzw) hjuVar7.s.a(), (alzu) hjuVar7.d.a(), (amcz) hjuVar7.e.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                hicVar = new alzw((amad) this.a.d.a());
                return hicVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                hicVar = new aljw(new amfj(0), (alli) this.a.j.a());
                return hicVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                hicVar = new alzp(new amfi(), (alli) this.a.j.a(), 2, (char[]) null);
                return hicVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                aihd aihdVarT = aihd.t(allh.E, allh.j, allh.F, allh.G);
                aooc.ap(aihdVarT);
                return aihdVarT;
            default:
                return new alkf();
        }
    }
}
