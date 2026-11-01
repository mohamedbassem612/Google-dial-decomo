package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fch implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;

    public /* synthetic */ fch(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [fcw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                ((alic) obj).k();
                return;
            case 1:
                ((alic) obj).l(3);
                return;
            case 2:
                ((defpackage.kvt) obj).a.a();
                return;
            case 3:
                ((java.util.concurrent.ExecutorService) obj).shutdown();
                return;
            case 4:
                int i = defpackage.hrs.l;
                return;
            case 5:
                int i2 = defpackage.hrs.l;
                return;
            case 6:
                int i3 = defpackage.hrs.l;
                return;
            case 7:
                int i4 = defpackage.hrs.l;
                return;
            case 8:
                int i5 = defpackage.hrs.l;
                return;
            case 9:
                defpackage.hyx hyxVar = (defpackage.hyx) obj;
                ((defpackage.hyy) hyxVar.a).b((defpackage.hzh) hyxVar.b.getKey());
                return;
            case 10:
                defpackage.aazb aazbVar = (defpackage.aazb) obj;
                try {
                    aazbVar.eS(5, aazbVar.eP());
                    return;
                } catch (android.os.RemoteException e) {
                    throw new java.lang.IllegalStateException("Error in VoiceLibController.stopRecording()", e);
                }
            case 11:
                defpackage.aazb aazbVar2 = (defpackage.aazb) obj;
                try {
                    if (aazbVar2.a() < 2) {
                        defpackage.iao.a.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl", "stopAudioInjectionImpl", 181, "VoiceLibControllerImpl.java").w("AudioService doesn't support stopAudioInjection, current version = %d", aazbVar2.a());
                    } else {
                        android.os.Parcel parcelEP = aazbVar2.eP();
                        parcelEP.writeInt(0);
                        aazbVar2.eS(7, parcelEP);
                    }
                    return;
                } catch (android.os.RemoteException e2) {
                    a.bq(defpackage.iao.a.c(), "Exception in stopping audio injection", "com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl", "stopAudioInjectionImpl", (char) 190, "VoiceLibControllerImpl.java", e2, zct.b);
                    return;
                }
            case 12:
                akzx akzxVar = (akzx) obj;
                akzxVar.u();
                ampl amplVar = akzxVar.b;
                ampl amplVar2 = ampl.a;
                amplVar.b |= 1;
                amplVar.c = true;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                akzx akzxVar2 = (akzx) obj;
                akzxVar2.u();
                ampl amplVar3 = akzxVar2.b;
                ampl amplVar4 = ampl.a;
                amplVar3.b |= 2;
                amplVar3.d = true;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                akzx akzxVar3 = (akzx) obj;
                akzxVar3.u();
                ampl amplVar5 = akzxVar3.b;
                ampl amplVar6 = ampl.a;
                amplVar5.b |= 4;
                amplVar5.e = true;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                akzx akzxVar4 = (akzx) obj;
                akzxVar4.u();
                ampl amplVar7 = akzxVar4.b;
                ampl amplVar8 = ampl.a;
                amplVar7.b |= 16;
                amplVar7.g = true;
                return;
            case 16:
                akzx akzxVar5 = (akzx) obj;
                akzxVar5.u();
                ampl amplVar9 = akzxVar5.b;
                ampl amplVar10 = ampl.a;
                amplVar9.b |= 32;
                amplVar9.h = true;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                akzx akzxVar6 = (akzx) obj;
                akzxVar6.u();
                ampl amplVar11 = akzxVar6.b;
                ampl amplVar12 = ampl.a;
                amplVar11.b |= 8;
                amplVar11.f = true;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                akzx akzxVar7 = (akzx) obj;
                akzxVar7.u();
                ampl amplVar13 = akzxVar7.b;
                ampl amplVar14 = ampl.a;
                amplVar13.b |= 64;
                amplVar13.i = true;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                akzx akzxVar8 = (akzx) obj;
                akzxVar8.u();
                ampl amplVar15 = akzxVar8.b;
                ampl amplVar16 = ampl.a;
                amplVar15.b |= 128;
                amplVar15.j = true;
                return;
            default:
                ((android.widget.TextView) obj).setVisibility(8);
                return;
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
