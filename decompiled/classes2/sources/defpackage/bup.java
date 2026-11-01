package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bup implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public bup(alg algVar, int i) {
        this.$cid = i;
        this.a = algVar;
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [dat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [aomy, java.lang.Object] */
    public final java.lang.Object a() {
        cbb cbbVar;
        switch (this.$cid) {
            case 0:
                ((defpackage.but) this.a).a();
                return java.lang.Boolean.TRUE;
            case 1:
                this.a.a();
                return java.lang.Boolean.TRUE;
            case 2:
                aosb aosbVar = ((defpackage.but) this.a).a;
                if (aosbVar.h()) {
                    aosbVar.w(defpackage.bvc.b);
                }
                return aojh.a;
            case 3:
                ayy ayyVar = defpackage.bwh.a;
                return ((vx) this.a).a.a();
            case 4:
                ayy ayyVar2 = defpackage.bwh.a;
                return (cxi) this.a.a();
            case 5:
                return ((alg) this.a).h();
            case 6:
                return ((alg) this.a).h();
            case 7:
                cfo.w((dat) this.a);
                return aojh.a;
            case 8:
                ((cbt) this.a).am();
                return null;
            case 9:
                ((cbt) this.a).am();
                return null;
            case 10:
                ((cpg) this.a).b();
                return aojh.a;
            case 11:
                java.lang.Object obj = this.a;
                aojh aojhVar = aojh.a;
                ((ctz) obj).d.b(aojhVar);
                return aojhVar;
            case 12:
                cxq cxqVar = (cxq) this.a;
                if (!cxqVar.a() && (cbbVar = cxqVar.g) != null) {
                    cbbVar.m();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                dab dabVar = (dab) this.a;
                dabVar.a = false;
                java.util.HashSet hashSet = new java.util.HashSet();
                adq adqVar = dabVar.d;
                if (adqVar != null) {
                    java.lang.Object[] objArr = adqVar.a;
                    int i = adqVar.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        dbk dbkVar = (dbk) objArr[i2];
                        defpackage.oq oqVar = (defpackage.oq) dabVar.d().c(i2);
                        cmv cmvVar = dbkVar.v.f;
                        if (cmvVar.D) {
                            dab.e(cmvVar, oqVar, hashSet);
                        }
                    }
                    adqVar.l();
                    adq adqVar2 = dabVar.e;
                    if (adqVar2 != null) {
                        adqVar2.l();
                    }
                }
                adq adqVar3 = dabVar.b;
                if (adqVar3 != null) {
                    java.lang.Object[] objArr2 = adqVar3.a;
                    int i3 = adqVar3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        daj dajVar = (daj) objArr2[i4];
                        defpackage.oq oqVar2 = (defpackage.oq) dabVar.c().c(i4);
                        if (((cmv) dajVar).D) {
                            dab.e(dajVar, oqVar2, hashSet);
                        }
                    }
                    adqVar3.l();
                    adq adqVar4 = dabVar.c;
                    if (adqVar4 != null) {
                        adqVar4.l();
                    }
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((daj) it.next()).A();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((daj) this.a).A();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                daa daaVar = ((daj) this.a).a;
                if (daaVar == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                }
                daaVar.d();
                return aojh.a;
            case 16:
                ((defpackage.cny) this.a).e();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((dgc) this.a).a.a();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                doj dojVar = (doj) this.a;
                if (dojVar.a() == 9205357640488583168L || cpp.d(dojVar.a())) {
                    return null;
                }
                return dojVar.a.b(dojVar.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Float.valueOf(((dol) this.a).b);
            default:
                java.lang.Object obj2 = this.a;
                defpackage.dqc dqcVar = (defpackage.dqc) obj2;
                if (dqcVar.f && dqcVar.isAttachedToWindow() && dqcVar.c.getParent() == obj2) {
                    dqcVar.i().a.c(obj2, defpackage.dqc.a, dqcVar.e);
                }
                return aojh.a;
        }
    }

    public /* synthetic */ bup(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
