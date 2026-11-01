package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lbn implements dxx {
    private final /* synthetic */ int $cid;

    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                akzx akzxVarP = ((defpackage.lbm) obj).p();
                akzxVarP.u();
                defpackage.lbm lbmVar = (defpackage.lbm) akzxVarP.b;
                lbmVar.b |= 1;
                lbmVar.c = true;
                return (defpackage.lbm) akzxVarP.p();
            case 1:
                akzx akzxVarP2 = ((defpackage.jvm) obj).p();
                akzxVarP2.u();
                defpackage.jvm jvmVar = (defpackage.jvm) akzxVarP2.b;
                jvmVar.f = null;
                jvmVar.b &= -2;
                return (defpackage.jvm) akzxVarP2.p();
            case 2:
                long j = defpackage.lee.a;
                akzx akzxVarP3 = ((defpackage.led) obj).p();
                akzxVarP3.u();
                ((defpackage.led) akzxVarP3.b).d = true;
                return (defpackage.led) akzxVarP3.p();
            case 3:
                akzx akzxVarP4 = ((defpackage.led) obj).p();
                alcf alcfVarE = aldi.e(j$.time.Instant.now().toEpochMilli());
                akzxVarP4.u();
                defpackage.led ledVar = (defpackage.led) akzxVarP4.b;
                j$.util.Objects.requireNonNull(alcfVarE);
                ledVar.c = alcfVarE;
                ledVar.b |= 1;
                return (defpackage.led) akzxVarP4.p();
            case 4:
                akzx akzxVarP5 = ((defpackage.lii) obj).p();
                akzxVarP5.u();
                ((defpackage.lii) akzxVarP5.b).g = false;
                return (defpackage.lii) akzxVarP5.p();
            case 5:
                akzx akzxVarP6 = ((defpackage.lii) obj).p();
                akzxVarP6.u();
                ((defpackage.lii) akzxVarP6.b).g = true;
                return (defpackage.lii) akzxVarP6.p();
            case 6:
                akzx akzxVarP7 = ((pvs) obj).p();
                akzxVarP7.u();
                pvs pvsVar = akzxVarP7.b;
                pvsVar.b |= 1;
                pvsVar.c = true;
                return akzxVarP7.p();
            case 7:
                akzx akzxVarP8 = ((qej) obj).p();
                akzxVarP8.u();
                qej qejVar = akzxVarP8.b;
                qejVar.b |= 1;
                qejVar.c = true;
                return akzxVarP8.p();
            case 8:
                akzx akzxVarP9 = ((qer) obj).p();
                akzxVarP9.u();
                qer qerVar = akzxVarP9.b;
                qerVar.b |= 1;
                qerVar.c = true;
                return akzxVarP9.p();
            case 9:
                akzx akzxVarP10 = ((qrx) obj).p();
                akzxVarP10.u();
                qrx qrxVar = akzxVarP10.b;
                qrxVar.b |= 2;
                qrxVar.d = false;
                return akzxVarP10.p();
            case 10:
                akzx akzxVarP11 = ((qrx) obj).p();
                akzxVarP11.u();
                qrx qrxVar2 = akzxVarP11.b;
                qrxVar2.b |= 1;
                qrxVar2.c = false;
                return akzxVarP11.p();
            case 11:
                akzx akzxVarP12 = ((ste) obj).p();
                akzxVarP12.u();
                ste steVar = akzxVarP12.b;
                steVar.b |= 128;
                steVar.f = true;
                return akzxVarP12.p();
            case 12:
                akzx akzxVarP13 = ((suj) obj).p();
                akzxVarP13.u();
                suj sujVar = akzxVarP13.b;
                sujVar.b |= 1;
                sujVar.c = true;
                return akzxVarP13.p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return tkf.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                akzx akzxVarP14 = ((uhl) obj).p();
                akzxVarP14.u();
                akzxVarP14.b.b = true;
                return akzxVarP14.p();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                wpy wpyVar = (wpy) obj;
                int i = wpyVar.i;
                akzx akzxVarP15 = wpyVar.p();
                akzxVarP15.u();
                wpy wpyVar2 = akzxVarP15.b;
                wpyVar2.b |= 64;
                wpyVar2.i = i + 1;
                return akzxVarP15.p();
            default:
                akzx akzxVarP16 = ((wpy) obj).p();
                akzxVarP16.u();
                wpy wpyVar3 = akzxVarP16.b;
                wpyVar3.b |= 64;
                wpyVar3.i = 0;
                return akzxVarP16.p();
        }
    }
}
