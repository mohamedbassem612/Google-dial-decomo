package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lct implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;

    public /* synthetic */ lct(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                defpackage.lkq lkqVar = (defpackage.lkq) obj;
                defpackage.ljy ljyVar = lkqVar.g.c;
                if (ljyVar == null) {
                    ljyVar = defpackage.ljy.a;
                }
                akzx akzxVarP = ljyVar.p();
                akzxVarP.u();
                defpackage.ljy ljyVar2 = (defpackage.ljy) akzxVarP.b;
                ljyVar2.b |= 2;
                ljyVar2.d = true;
                defpackage.ljy ljyVar3 = (defpackage.ljy) akzxVarP.p();
                akzx akzxVarP2 = lkqVar.g.p();
                akzxVarP2.u();
                defpackage.ljx ljxVar = (defpackage.ljx) akzxVarP2.b;
                j$.util.Objects.requireNonNull(ljyVar3);
                ljxVar.c = ljyVar3;
                ljxVar.b |= 1;
                lkqVar.g = (defpackage.ljx) akzxVarP2.p();
                break;
            case 1:
                java.io.File file = (java.io.File) obj;
                aimz aimzVar = lbl.a;
                try {
                    j$.nio.file.Files.delete(j$.io.FileRetargetClass.toPath(file));
                } catch (java.io.IOException e) {
                    hgb.g(lbl.a.c(), "Cannot delete recording file %s", j$.io.FileRetargetClass.toPath(file), "com/android/dialer/callrecording/impl/storage/CallRecordingInfoStorageAsyncSqlite", "deleteOrphanedCallRecordingsOlderThan", (char) 483, "CallRecordingInfoStorageAsyncSqlite.java", e, zct.b);
                    return;
                }
                break;
            case 2:
                ((defpackage.lkq) obj).d = true;
                break;
            case 3:
                aimz aimzVar2 = defpackage.lgi.a;
                ((defpackage.ibs) ((rai) obj).a).b();
                break;
            case 4:
                defpackage.lkq lkqVar2 = (defpackage.lkq) obj;
                defpackage.ljx ljxVar2 = lkqVar2.g;
                if (ljxVar2 != null) {
                    defpackage.ljz ljzVar = ljxVar2.d;
                    if (ljzVar == null) {
                        ljzVar = defpackage.ljz.a;
                    }
                    lkk.f(ljzVar);
                }
                lkqVar2.g = null;
                break;
            case 5:
                ((defpackage.pfd) ((apqr) obj).a(defpackage.pfd.class)).ad().g.set(true);
                break;
            case 6:
                ((tcl) ((aprf) obj).a).a();
                break;
            case 7:
                ((defpackage.pya) obj).a();
                break;
            case 8:
                ((defpackage.pya) obj).c();
                break;
            case 9:
                ((defpackage.pya) obj).b();
                break;
            case 10:
                ((defpackage.pya) obj).d();
                break;
            case 11:
                ((com.android.dialer.widget.logoview.LogoView) obj).c(wew.j);
                break;
            case 12:
                com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) obj;
                if (!lottieAnimationView.s() && lottieAnimationView.c.c() != 1.0f) {
                    lottieAnimationView.o(1.0f, true);
                    break;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((com.android.dialer.widget.logoview.LogoView) obj).c(wew.n);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((com.airbnb.lottie.LottieAnimationView) obj).e();
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                akzx akzxVar = (akzx) obj;
                akzxVar.u();
                amrf amrfVar = akzxVar.b;
                amrf amrfVar2 = amrf.a;
                amrfVar.b |= 2;
                amrfVar.d = true;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                akzx akzxVar2 = (akzx) obj;
                akzxVar2.u();
                amrf amrfVar3 = akzxVar2.b;
                amrf amrfVar4 = amrf.a;
                amrfVar3.b |= 1;
                amrfVar3.c = true;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                akzx akzxVar3 = (akzx) obj;
                akzxVar3.u();
                amry amryVar = akzxVar3.b;
                amry amryVar2 = amry.a;
                amryVar.b |= 32;
                amryVar.h = true;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                akzx akzxVar4 = (akzx) obj;
                akzxVar4.u();
                amry amryVar3 = akzxVar4.b;
                amry amryVar4 = amry.a;
                amryVar3.b |= 64;
                amryVar3.i = true;
                break;
            default:
                akzx akzxVar5 = (akzx) obj;
                akzxVar5.u();
                amry amryVar5 = akzxVar5.b;
                amry amryVar6 = amry.a;
                amryVar5.b |= 8;
                amryVar5.f = true;
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
