package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class nfp implements zka {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nfp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final boolean a() {
        switch (this.$cid) {
            case 0:
                return afsq.cv((mnk) this.a);
            case 1:
                return afsq.cv((mnk) this.a);
            case 2:
                return afsq.cv((mnk) this.a);
            case 3:
                return afsq.cv((mnk) this.a);
            case 4:
                if (this.a != defpackage.nmo.BAM) {
                    return false;
                }
                break;
            case 5:
                if (this.a != defpackage.nmo.BAM) {
                    return false;
                }
                break;
            case 6:
                java.lang.Object obj = this.a;
                aooh.f(obj, "<this>");
                return ((defpackage.ocf) obj).a();
            case 7:
                java.lang.Object obj2 = this.a;
                aooh.f(obj2, "<this>");
                return ((j$.util.Optional) obj2).isPresent();
            case 8:
                return ((defpackage.omy) this.a).b.isPresent();
            case 9:
                return ((one) this.a).a();
            case 10:
                return ((jvt) this.a).a();
            case 11:
                aooh.f(this.a, "<this>");
                break;
            case 12:
                aooh.f(this.a, "<this>");
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ((swq) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((swq) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj3 = this.a;
                java.util.Set set = tna.a;
                return afsq.ch((tkk) obj3);
            case 16:
                java.util.Set set2 = tna.a;
                return ((tkk) this.a).a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Object obj4 = this.a;
                java.util.Set set3 = tna.a;
                return afsq.ch((tkk) obj4);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Object obj5 = this.a;
                java.util.Set set4 = tna.a;
                return afsq.ch((tkk) obj5);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj6 = this.a;
                java.util.Set set5 = tna.a;
                return afsq.ch((tkk) obj6);
            default:
                java.lang.Object obj7 = this.a;
                java.util.Set set6 = tna.a;
                return afsq.ch((tkk) obj7);
        }
        return true;
    }
}
