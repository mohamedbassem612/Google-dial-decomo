package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class exq implements defpackage.etl {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ exq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v45, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.etl
    public final void a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                erg ergVar = (erg) obj;
                int i = defpackage.eyc.C;
                boolean z = ((defpackage.eza) this.a).h;
                ergVar.P(z);
                ergVar.f(z);
                break;
            case 1:
                int i2 = defpackage.eyc.C;
                ((erg) obj).j((defpackage.eqw) this.a);
                break;
            case 2:
                int i3 = defpackage.eyc.C;
                defpackage.eza ezaVar = (defpackage.eza) this.a;
                ((erg) obj).r(ezaVar.m, ezaVar.f);
                break;
            case 3:
                int i4 = defpackage.eyc.C;
                ((erg) obj).n(((defpackage.eza) this.a).f);
                break;
            case 4:
                int i5 = defpackage.eyc.C;
                defpackage.eza ezaVar2 = (defpackage.eza) this.a;
                ((erg) obj).l(ezaVar2.m, ezaVar2.n);
                break;
            case 5:
                int i6 = defpackage.eyc.C;
                ((erg) obj).o(((defpackage.eza) this.a).o);
                break;
            case 6:
                ((erg) obj).b(((defpackage.eyc) this.a).p);
                break;
            case 7:
                int i7 = defpackage.eyc.C;
                ((erg) obj).g(((defpackage.eza) this.a).k());
                break;
            case 8:
                int i8 = defpackage.eyc.C;
                ((erg) obj).m(((defpackage.eza) this.a).p);
                break;
            case 9:
                int i9 = defpackage.eyc.C;
                ((erg) obj).q(((defpackage.eza) this.a).g);
                break;
            case 10:
                int i10 = defpackage.eyc.C;
                ((erg) obj).p(((defpackage.eza) this.a).g);
                break;
            case 11:
                int i11 = defpackage.eyc.C;
                ((erg) obj).y(((defpackage.eza) this.a).j.d);
                break;
            case 12:
                int i12 = defpackage.exy.b;
                ((erg) obj).c((defpackage.est) this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((erg) obj).j(((defpackage.exy) this.a).a.q);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                int i13 = defpackage.exy.b;
                ((erg) obj).k((defpackage.eqy) this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                int i14 = defpackage.exy.b;
                ((erg) obj).d((java.util.List) this.a);
                break;
            case 16:
                int i15 = defpackage.exy.b;
                ((erg) obj).z((defpackage.ery) this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((defpackage.fad) obj).o = ((defpackage.ffq) this.a).a;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((defpackage.fad) obj).m = (defpackage.erb) this.a;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.fad fadVar = (defpackage.fad) obj;
                int i16 = fadVar.q;
                defpackage.exc excVar = (defpackage.exc) this.a;
                fadVar.q = i16 + excVar.g;
                fadVar.r += excVar.e;
                break;
            default:
                defpackage.fad fadVar2 = (defpackage.fad) obj;
                alic alicVar = fadVar2.u;
                java.lang.Object obj2 = this.a;
                if (alicVar != null) {
                    defpackage.eqg eqgVar = (defpackage.eqg) alicVar.b;
                    if (eqgVar.w == -1) {
                        defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
                        defpackage.ery eryVar = (defpackage.ery) obj2;
                        eqfVar.t = eryVar.b;
                        eqfVar.u = eryVar.c;
                        fadVar2.u = new alic(new defpackage.eqg(eqfVar), (java.lang.String) alicVar.c);
                    }
                }
                defpackage.ery eryVar2 = (defpackage.ery) obj2;
                int i17 = eryVar2.b;
                int i18 = eryVar2.c;
                float f = eryVar2.d;
                break;
        }
    }
}
