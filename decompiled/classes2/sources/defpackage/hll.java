package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hll implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hll(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v68, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v70, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v86, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [aoss, java.lang.Object] */
    public final java.lang.Object a() {
        java.lang.Object intent;
        nf nfVarFc;
        vol volVar = null;
        switch (this.$cid) {
            case 0:
                return (java.lang.Boolean) this.a.a();
            case 1:
                j$.util.Optional optionalG = ((zjm) this.a).g();
                aooh.e(optionalG, "getFeature(...)");
                return (kgz) aooh.q(optionalG);
            case 2:
                return (java.lang.Boolean) this.a.a();
            case 3:
                java.lang.Object obj = this.a;
                ahok ahokVarF = ((defpackage.hqa) obj).a.f(69, "CarPhoneAccountSelectionListener.onDismissed");
                try {
                    pqm pqmVar = ((defpackage.hqa) obj).b;
                    if (pqmVar.a() == zpo.h) {
                        agsm.i(71, pqmVar.f(), "failed to disconnect call", new java.lang.Object[0]);
                        break;
                    }
                    ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahokVarF, th);
                        throw th2;
                    }
                }
            case 4:
                intent = new android.content.Intent((android.content.Intent) this.a);
                break;
            case 5:
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(urg.c(((defpackage.ifq) this.a).b, 2130969105));
                intent = gradientDrawable;
                break;
            case 6:
                defpackage.krt.aU().r(defpackage.zb.i((android.view.View) this.a).J(), "FermatSummaryDisclaimerBottomSheetFragment");
                return aojh.a;
            case 7:
                az azVarG = ((defpackage.iyi) this.a).b.G();
                if (azVarG != null && (nfVarFc = azVarG.fc()) != null) {
                    nfVarFc.e();
                }
                return aojh.a;
            case 8:
                vol volVar2 = ((defpackage.izm) this.a).f;
                if (volVar2 == null) {
                    aooh.j("greetingRecorder");
                } else {
                    volVar = volVar2;
                }
                return java.lang.Long.valueOf(volVar.j);
            case 9:
                vol volVar3 = ((defpackage.izm) this.a).f;
                if (volVar3 == null) {
                    aooh.j("greetingRecorder");
                } else {
                    volVar = volVar3;
                }
                volVar.k();
                return aojh.a;
            case 10:
                vol volVar4 = ((defpackage.izm) this.a).f;
                if (volVar4 == null) {
                    aooh.j("greetingRecorder");
                } else {
                    volVar = volVar4;
                }
                fh$.ExternalSyntheticApiModelOutline0.m$1(volVar.e);
                volVar.c.d();
                volVar.m = true;
                return aojh.a;
            case 11:
                vol volVar5 = ((defpackage.izm) this.a).f;
                if (volVar5 == null) {
                    aooh.j("greetingRecorder");
                } else {
                    volVar = volVar5;
                }
                if (volVar.b.d() == voj.b && volVar.m) {
                    fh$.ExternalSyntheticApiModelOutline0.m(volVar.e);
                    volVar.c.c();
                    volVar.m = false;
                }
                return aojh.a;
            case 12:
                defpackage.izm izmVar = (defpackage.izm) this.a;
                izmVar.d.o(rmx.xL);
                vol volVar6 = izmVar.f;
                if (volVar6 == null) {
                    aooh.j("greetingRecorder");
                } else {
                    volVar = volVar6;
                }
                volVar.f();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.izm izmVar2 = (defpackage.izm) this.a;
                vol volVar7 = izmVar2.f;
                if (volVar7 == null) {
                    aooh.j("greetingRecorder");
                    volVar7 = null;
                }
                volVar7.k();
                izmVar2.d.o(rmx.xK);
                agtj agtjVar = izmVar2.c;
                defpackage.jkq jkqVar = izmVar2.h;
                vol volVar8 = izmVar2.f;
                if (volVar8 == null) {
                    aooh.j("greetingRecorder");
                    volVar8 = null;
                }
                java.lang.String absolutePath = volVar8.d.getAbsolutePath();
                aooh.e(absolutePath, "getGreetingFilePath(...)");
                vol volVar9 = izmVar2.f;
                if (volVar9 == null) {
                    aooh.j("greetingRecorder");
                } else {
                    volVar = volVar9;
                }
                int i = volVar.j;
                aooh.f(absolutePath, "tmpFileAbsolutePath");
                agtjVar.i(new zoe(aosv.F((aoss) jkqVar.d, 0, new defpackage.kgx(jkqVar, absolutePath, i, (aoln) null, 1), 3)), izmVar2.g);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                a.E((ccp) this.a, true);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                a.E((ccp) this.a, false);
                return aojh.a;
            case 16:
                return java.lang.Long.valueOf((long) ((java.lang.Number) ((aii) this.a).d()).floatValue());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((defpackage.izs) this.a).a.a();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((defpackage.izs) this.a).b.a();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Float.valueOf(a.G((cer) this.a));
            default:
                return java.lang.Long.valueOf((long) ((java.lang.Number) ((aii) this.a).d()).floatValue());
        }
        return intent;
    }
}
