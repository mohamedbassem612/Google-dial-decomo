package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fcg implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ fcg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, rlv] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 2;
        switch (this.$cid) {
            case 0:
                ((alic) obj).r((defpackage.hgt) this.a);
                return;
            case 1:
                android.app.appsearch.AppSearchResult appSearchResultM = mp$.ExternalSyntheticApiModelOutline0.m(obj);
                defpackage.rb rbVar = new defpackage.rb();
                dzk.x(appSearchResultM);
                boolean zM = mp$.ExternalSyntheticApiModelOutline0.m(appSearchResultM);
                java.lang.Object obj2 = this.a;
                if (!zM) {
                    ((dsc) obj2).g(new defpackage.qv(mp$.ExternalSyntheticApiModelOutline0.m(appSearchResultM), mp$.ExternalSyntheticApiModelOutline0.m(appSearchResultM), null));
                    return;
                }
                try {
                    ((dsc) obj2).f(aa$.ExternalSyntheticApiModelOutline1.m(rbVar, mp$.ExternalSyntheticApiModelOutline0.m(appSearchResultM)));
                    return;
                } catch (java.lang.Throwable th) {
                    ((dsc) obj2).g(th);
                    return;
                }
            case 2:
                ((alic) obj).m((java.lang.Exception) this.a);
                return;
            case 3:
                ((aift) this.a).i((defpackage.frf) obj);
                return;
            case 4:
                this.a.add((java.lang.Byte) obj);
                return;
            case 5:
                ((defpackage.iaj) this.a).b();
                throw new java.lang.IllegalStateException("Error in VoiceLibController.startRecording", (java.lang.Throwable) obj);
            case 6:
                defpackage.ibk.a.b().k((java.lang.Throwable) obj).l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "createMediaPlayer", 307, "CallAudioPlayer.java").v("DialerMediaPlayer error");
                java.lang.Object obj3 = this.a;
                ajas ajasVarB = ahqx.b(new defpackage.ibg(obj3, i));
                defpackage.ibk ibkVar = (defpackage.ibk) obj3;
                agsm.i(103, ibkVar.l.e(ajasVarB, ibkVar.d), "failed handling error", new java.lang.Object[0]);
                return;
            case 7:
                ((aigb) this.a).i((defpackage.hkd) obj, spf.a);
                return;
            case 8:
                amoy amoyVar = (amoy) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                amoz amozVar = akzxVar.b;
                amoz amozVar2 = amoz.a;
                j$.util.Objects.requireNonNull(amoyVar);
                alat alatVar = amozVar.c;
                if (!alatVar.c()) {
                    amozVar.c = alad.J(alatVar);
                }
                amozVar.c.add(amoyVar);
                return;
            case 9:
                ((defpackage.lkq) obj).c = (java.lang.String) this.a;
                return;
            case 10:
                ((akzx) this.a).I((defpackage.lgo) obj);
                return;
            case 11:
                ajcq ajcqVar = (ajcq) obj;
                aimz aimzVar = defpackage.mfs.a;
                try {
                    ((defpackage.mho) aiql.H(ajcqVar)).a((akzx) this.a);
                    return;
                } catch (java.util.concurrent.ExecutionException e) {
                    a.bq(defpackage.mfs.a.c(), "public feature dump returned failed future", "com/android/dialer/debug/dump/dumptools/DebugDumper", "mergePublicDumpMessages", (char) 305, "DebugDumper.java", e.getCause(), zct.b);
                    return;
                }
            case 12:
                ((dsd) this.a).b(java.lang.Boolean.valueOf(((java.lang.Integer) obj).intValue() == 2));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((dsd) this.a).b(java.lang.Boolean.valueOf(((java.lang.Integer) obj).intValue() == 2));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.nzi nziVar = (defpackage.nzi) obj;
                akzx akzxVarM = defpackage.nzc.a.m();
                java.lang.String str = nziVar.c;
                akzxVarM.u();
                defpackage.nzc nzcVar = (defpackage.nzc) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                nzcVar.b |= 1;
                nzcVar.c = str;
                if ((nziVar.b & 2) != 0) {
                    defpackage.nzf nzfVar = nziVar.d;
                    if (nzfVar == null) {
                        nzfVar = defpackage.nzf.a;
                    }
                    boolean z = nzfVar.b;
                    akzxVarM.u();
                    defpackage.nzc nzcVar2 = (defpackage.nzc) akzxVarM.b;
                    nzcVar2.b |= 2;
                    nzcVar2.d = z;
                    defpackage.nzf nzfVar2 = nziVar.d;
                    if (nzfVar2 == null) {
                        nzfVar2 = defpackage.nzf.a;
                    }
                    int iAd = mni.ad(nzfVar2.c);
                    if (iAd == 0) {
                        iAd = 1;
                    }
                    akzxVarM.u();
                    defpackage.nzc nzcVar3 = (defpackage.nzc) akzxVarM.b;
                    nzcVar3.f = iAd - 1;
                    nzcVar3.b |= 8;
                }
                if ((nziVar.b & 4) != 0) {
                    defpackage.nzf nzfVar3 = nziVar.e;
                    if (nzfVar3 == null) {
                        nzfVar3 = defpackage.nzf.a;
                    }
                    boolean z2 = nzfVar3.b;
                    akzxVarM.u();
                    defpackage.nzc nzcVar4 = (defpackage.nzc) akzxVarM.b;
                    nzcVar4.b |= 4;
                    nzcVar4.e = z2;
                    defpackage.nzf nzfVar4 = nziVar.e;
                    if (nzfVar4 == null) {
                        nzfVar4 = defpackage.nzf.a;
                    }
                    int iAd2 = mni.ad(nzfVar4.c);
                    int i2 = iAd2 != 0 ? iAd2 : 1;
                    akzxVarM.u();
                    defpackage.nzc nzcVar5 = (defpackage.nzc) akzxVarM.b;
                    nzcVar5.g = i2 - 1;
                    nzcVar5.b |= 16;
                }
                this.a.add((defpackage.nzc) akzxVarM.p());
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((android.view.View) this.a).setVisibility(0);
                return;
            case 16:
                defpackage.olt oltVar = (defpackage.olt) obj;
                java.lang.String str2 = oltVar.b;
                if (str2.equals("")) {
                    return;
                }
                this.a.put(oltVar.a, str2);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                olv olvVar = (olv) obj;
                if (gus.aj(olvVar)) {
                    return;
                }
                this.a.add(olvVar);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.a.n((rmw) obj);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.a.n((rmw) obj);
                return;
            default:
                android.view.View view = (android.view.View) this.a;
                view.setPivotY(view.getHeight());
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
