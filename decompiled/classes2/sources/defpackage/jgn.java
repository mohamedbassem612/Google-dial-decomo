package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jgn extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(aeok aeokVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = aeokVar;
    }

    /* JADX WARN: Type inference failed for: r3v65, types: [aoin, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return new defpackage.jgn((defpackage.jgp) this.a, (aoln) obj, 0).b(aojh.a);
            case 1:
                return new defpackage.jgn((aii) this.a, (aoln) obj, 1).b(aojh.a);
            case 2:
                return new defpackage.jgn((jyu) this.a, (aoln) obj, 2).b(aojh.a);
            case 3:
                return new defpackage.jgn((jyu) this.a, (aoln) obj, 3, (byte[]) null).b(aojh.a);
            case 4:
                return new defpackage.jgn((defpackage.nbn) this.a, (aoln) obj, 4).b(aojh.a);
            case 5:
                return new defpackage.jgn((defpackage.nbn) this.a, (aoln) obj, 5, (byte[]) null).b(aojh.a);
            case 6:
                return new defpackage.jgn((defpackage.nmo) this.a, (aoln) obj, 6).b(aojh.a);
            case 7:
                return new defpackage.jgn((j$.util.Optional) this.a, (aoln) obj, 7).b(aojh.a);
            case 8:
                return new defpackage.jgn((defpackage.nmo) this.a, (aoln) obj, 8, (byte[]) null).b(aojh.a);
            case 9:
                return new defpackage.jgn((defpackage.nmo) this.a, (aoln) obj, 9, (char[]) null).b(aojh.a);
            case 10:
                return new defpackage.jgn((tpf) this.a, (aoln) obj, 10).b(aojh.a);
            case 11:
                return new defpackage.jgn((defpackage.now) this.a, (aoln) obj, 11).b(aojh.a);
            case 12:
                return new defpackage.jgn((defpackage.now) this.a, (aoln) obj, 12, (byte[]) null).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.jgn((defpackage.now) this.a, (aoln) obj, 13, (char[]) null).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.jgn((aeok) this.a, (aoln) obj, 14).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.jgn((zlr) this.a, (aoln) obj, 15).b(aojh.a);
            case 16:
                return new defpackage.jgn((aoin) this.a, (aoln) obj, 16).b(aojh.a);
            default:
                return new defpackage.jgn((tsg) this.a, (aoln) obj, 17).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v58, types: [aoin, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                ((defpackage.jgp) this.a).j();
                defpackage.jgp.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/beesly/impl/v2/service/session/BeeslySodaListener", "onOtherSodaEvent$<anonymous>", 64, "BeeslySodaListener.kt").v("Received other soda event");
                return aojh.a;
            case 1:
                aooc.af(obj);
                ((aii) this.a).h();
                return aojh.a;
            case 2:
                aooc.af(obj);
                ((jyu) this.a).d = java.lang.Boolean.FALSE;
                return aojh.a;
            case 3:
                aooc.af(obj);
                ((jyu) this.a).d = java.lang.Boolean.TRUE;
                return aojh.a;
            case 4:
                aooc.af(obj);
                ((defpackage.nbn) this.a).j = null;
                return aojh.a;
            case 5:
                aooc.af(obj);
                ((defpackage.nbn) this.a).j = null;
                return aojh.a;
            case 6:
                aooc.af(obj);
                int iOrdinal = ((defpackage.nmo) this.a).ordinal();
                if (iOrdinal == 7 || iOrdinal == 8) {
                    return ouk.b;
                }
                return null;
            case 7:
                aooc.af(obj);
                return aooh.q((j$.util.Optional) this.a);
            case 8:
                aooc.af(obj);
                int iOrdinal2 = ((defpackage.nmo) this.a).ordinal();
                if (iOrdinal2 == 3 || iOrdinal2 == 4 || iOrdinal2 == 5 || iOrdinal2 == 6 || iOrdinal2 == 11 || iOrdinal2 == 14 || iOrdinal2 == 15) {
                    return pzp.e;
                }
                return null;
            case 9:
                aooc.af(obj);
                if (((defpackage.nmo) this.a).ordinal() == 8) {
                    return oue.c;
                }
                defpackage.nfw.b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/service/DobbyProducerModule", "produceDobbySummaryCenterFragmentKey$<anonymous>", 500, "DobbyProducerModule.kt").v("Not ringing active session");
                return null;
            case 10:
                aooc.af(obj);
                return ((tpf) this.a).d;
            case 11:
                aooc.af(obj);
                return ((defpackage.now) this.a).c;
            case 12:
                aooc.af(obj);
                return ((defpackage.now) this.a).a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooc.af(obj);
                return ((defpackage.now) this.a).b;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((aeok) this.a).a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aooc.af(obj);
                java.lang.Object obj2 = this.a;
                java.util.Set set = tna.a;
                tth tthVarB = tth.b(((zlr) obj2).m().c);
                if (tthVarB == null) {
                    tthVarB = tth.i;
                }
                if (!set.contains(tthVarB)) {
                    return null;
                }
                akzx akzxVarM = png.a.m();
                aooh.f(akzxVarM, "builder");
                pnf pnfVar = pnf.d;
                akzxVarM.u();
                akzxVarM.b.e = pnfVar.a();
                akzxVarM.u();
                png pngVar = akzxVarM.b;
                pngVar.c = 7;
                pngVar.d = 2131231601;
                akzxVarM.u();
                png pngVar2 = akzxVarM.b;
                pngVar2.b |= 2;
                pngVar2.g = 2132019096;
                png pngVarP = akzxVarM.p();
                aooh.e(pngVarP, "build(...)");
                return pngVarP;
            case 16:
                aooc.af(obj);
                return ((tpf) this.a.a()).d;
            default:
                aooc.af(obj);
                ((tsg) this.a).d();
                return aojh.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(aii aiiVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = aiiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(aoin aoinVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = aoinVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(j$.util.Optional optional, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = optional;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.jgp jgpVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = jgpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(jyu jyuVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = jyuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(jyu jyuVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = jyuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.nbn nbnVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nbnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.nbn nbnVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nbnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.nmo nmoVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nmoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.nmo nmoVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nmoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.nmo nmoVar, aoln aolnVar, int i, char[] cArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nmoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.now nowVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nowVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.now nowVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nowVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(defpackage.now nowVar, aoln aolnVar, int i, char[] cArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = nowVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(tpf tpfVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = tpfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(tsg tsgVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = tsgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgn(zlr zlrVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = zlrVar;
    }
}
