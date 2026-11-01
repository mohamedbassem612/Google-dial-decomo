package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nut extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(abgq abgqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abgqVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((nok) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((owz) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((tru) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((tru) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                c(obj, (aoln) obj2).b(aojh.a);
                return null;
            case 10:
                return c((achw) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((achw) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((achw) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((ahck) obj, (aoln) obj2).b(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                aoss aossVar = (aoss) this.b;
                defpackage.nuu nuuVar = (defpackage.nuu) this.a;
                nto ntoVar = new nto(nuuVar, (aoln) null, 6);
                if (((java.lang.Boolean) nuuVar.b.a()).booleanValue()) {
                    return aoov.an(aossVar, (aolr) null, 0, new defpackage.nuh((aonn) ntoVar, (aoln) null, 4, (char[]) null), 3);
                }
                aimz aimzVar = zih.a;
                return aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.nuh((aoln) null, (aonn) ntoVar, 3, (byte[]) null));
            case 1:
                aooc.af(obj);
                kaw kawVarAO = gus.aO(((nok) this.b).p());
                java.lang.Object obj2 = this.a;
                aooh.f(obj2, "value");
                akzx akzxVar = (akzx) kawVarAO.a;
                akzxVar.u();
                nok nokVar = akzxVar.b;
                j$.util.Objects.requireNonNull(obj2);
                nokVar.e = (nog) obj2;
                nokVar.b |= 2;
                return kawVarAO.D();
            case 2:
                aooc.af(obj);
                defpackage.heq heqVarAM = pez.aM(((owz) this.b).p());
                java.lang.Object obj3 = this.a;
                aooh.f(obj3, "value");
                akzx akzxVar2 = (akzx) heqVarAM.a;
                akzxVar2.u();
                akzxVar2.b.b = ((owy) obj3).a();
                return heqVarAM.N();
            case 3:
                aooc.af(obj);
                aoss aossVar2 = (aoss) this.b;
                rpa rpaVar = (rpa) this.a;
                rpaVar.e(ahvr.ag(aossVar2, rpaVar.m, new roy(rpaVar, (aoln) null, 0)));
                return aojh.a;
            case 4:
                aooc.af(obj);
                tvn tvnVarI = ttj.i(((tru) this.b).p());
                tvnVarI.e((trt) this.a);
                return tvnVarI.d();
            case 5:
                aooc.af(obj);
                tvn tvnVarI2 = ttj.i(((tru) this.b).p());
                java.lang.Object obj4 = this.a;
                aooh.f(obj4, "value");
                akzx akzxVar3 = (akzx) tvnVarI2.a;
                akzxVar3.u();
                tru truVar = akzxVar3.b;
                j$.util.Objects.requireNonNull(obj4);
                truVar.d = (trs) obj4;
                truVar.b |= 1;
                return tvnVarI2.d();
            case 6:
                aooc.af(obj);
                aoss aossVar3 = (aoss) this.b;
                wts wtsVar = (wts) this.a;
                wtsVar.e = aoov.am(aossVar3, 0, new ung(wtsVar, (aoln) null, 7), 3);
                return aojh.a;
            case 7:
                aooc.af(obj);
                aoss aossVar4 = (aoss) this.b;
                abgq abgqVar = (abgq) this.a;
                aoov.an(aossVar4, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 4, (int[]) null), 3);
                aoov.an(aossVar4, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 5, (boolean[]) null), 3);
                aoov.an(aossVar4, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 6, (float[]) null), 3);
                aoov.an(aossVar4, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 7, (byte[][]) null), 3);
                if (abgqVar.i) {
                    aoov.an(aossVar4, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 8, (char[][]) null), 3);
                }
                aoov.an(aossVar4, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 9, (short[][]) null), 3);
                aoov.an(aossVar4, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 10, (int[][]) null), 3);
                aoov.an(aossVar4, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 11, (boolean[][]) null), 3);
                return aojh.a;
            case 8:
                aooc.af(obj);
                aoss aossVar5 = (aoss) this.b;
                abgq abgqVar2 = (abgq) this.a;
                aoov.an(aossVar5, (aolr) null, 0, new abgk(abgqVar2, (aoln) null, 12, (float[][]) null), 3);
                aoov.an(aossVar5, (aolr) null, 0, new abgk(abgqVar2, (aoln) null, 13, (byte[][][]) null), 3);
                return aojh.a;
            case 9:
                aooc.af(obj);
                if (this.b != null) {
                    return null;
                }
                java.lang.Object obj5 = this.a;
                java.util.Objects.toString(obj5);
                throw new java.lang.IllegalStateException("Data not present for ".concat(java.lang.String.valueOf(obj5)));
            case 10:
                aooc.af(obj);
                adae adaeVarY = abrz.y(((achw) this.b).p());
                java.lang.Object obj6 = this.a;
                aooh.f(obj6, "value");
                akzx akzxVar4 = (akzx) adaeVarY.a;
                akzxVar4.u();
                achw achwVar = akzxVar4.b;
                j$.util.Objects.requireNonNull(obj6);
                achwVar.c = (alcf) obj6;
                achwVar.b |= 1;
                return adaeVarY.B();
            case 11:
                aooc.af(obj);
                adae adaeVarY2 = abrz.y(((achw) this.b).p());
                java.lang.Object obj7 = this.a;
                aooh.f(obj7, "value");
                akzx akzxVar5 = (akzx) adaeVarY2.a;
                akzxVar5.u();
                achw achwVar2 = akzxVar5.b;
                j$.util.Objects.requireNonNull(obj7);
                achwVar2.d = (alcf) obj7;
                achwVar2.b |= 2;
                return adaeVarY2.B();
            case 12:
                aooc.af(obj);
                adae adaeVarY3 = abrz.y(((achw) this.b).p());
                java.lang.Object obj8 = this.a;
                aooh.f(obj8, "value");
                akzx akzxVar6 = (akzx) adaeVarY3.a;
                akzxVar6.u();
                achw achwVar3 = akzxVar6.b;
                j$.util.Objects.requireNonNull(obj8);
                achwVar3.e = (alcf) obj8;
                achwVar3.b |= 4;
                return adaeVarY3.B();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                aoss aossVar6 = (aoss) this.b;
                adws adwsVar = (adws) this.a;
                aoov.an(aossVar6, (aolr) null, 0, new abvk(adwsVar, (aoln) null, 3), 3);
                return aoov.an(aossVar6, (aolr) null, 0, new acbt(adwsVar, (aoln) null, 18), 3);
            default:
                aooc.af(obj);
                ((ahde) this.a).b((ahck) this.b);
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                defpackage.nut nutVar = new defpackage.nut((defpackage.nuu) this.a, aolnVar, 0);
                nutVar.b = obj;
                return nutVar;
            case 1:
                defpackage.nut nutVar2 = new defpackage.nut((nog) this.a, aolnVar, 1);
                nutVar2.b = obj;
                return nutVar2;
            case 2:
                defpackage.nut nutVar3 = new defpackage.nut((owy) this.a, aolnVar, 2);
                nutVar3.b = obj;
                return nutVar3;
            case 3:
                defpackage.nut nutVar4 = new defpackage.nut((rpa) this.a, aolnVar, 3);
                nutVar4.b = obj;
                return nutVar4;
            case 4:
                defpackage.nut nutVar5 = new defpackage.nut((trt) this.a, aolnVar, 4);
                nutVar5.b = obj;
                return nutVar5;
            case 5:
                defpackage.nut nutVar6 = new defpackage.nut((trs) this.a, aolnVar, 5);
                nutVar6.b = obj;
                return nutVar6;
            case 6:
                defpackage.nut nutVar7 = new defpackage.nut((wts) this.a, aolnVar, 6);
                nutVar7.b = obj;
                return nutVar7;
            case 7:
                defpackage.nut nutVar8 = new defpackage.nut((abgq) this.a, aolnVar, 7);
                nutVar8.b = obj;
                return nutVar8;
            case 8:
                defpackage.nut nutVar9 = new defpackage.nut((abgq) this.a, aolnVar, 8, (byte[]) null);
                nutVar9.b = obj;
                return nutVar9;
            case 9:
                defpackage.nut nutVar10 = new defpackage.nut(this.a, aolnVar, 9);
                nutVar10.b = obj;
                return nutVar10;
            case 10:
                defpackage.nut nutVar11 = new defpackage.nut((alcf) this.a, aolnVar, 10);
                nutVar11.b = obj;
                return nutVar11;
            case 11:
                defpackage.nut nutVar12 = new defpackage.nut((alcf) this.a, aolnVar, 11, (byte[]) null);
                nutVar12.b = obj;
                return nutVar12;
            case 12:
                defpackage.nut nutVar13 = new defpackage.nut((alcf) this.a, aolnVar, 12, (char[]) null);
                nutVar13.b = obj;
                return nutVar13;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.nut nutVar14 = new defpackage.nut((adws) this.a, aolnVar, 13);
                nutVar14.b = obj;
                return nutVar14;
            default:
                defpackage.nut nutVar15 = new defpackage.nut((ahde) this.a, aolnVar, 14);
                nutVar15.b = obj;
                return nutVar15;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(abgq abgqVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = abgqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(adws adwsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = adwsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(ahde ahdeVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ahdeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(alcf alcfVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = alcfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(alcf alcfVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = alcfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(alcf alcfVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = alcfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(java.lang.Object obj, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(nog nogVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nogVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(defpackage.nuu nuuVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = nuuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(owy owyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = owyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(rpa rpaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rpaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(trs trsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = trsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(trt trtVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = trtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nut(wts wtsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = wtsVar;
    }
}
