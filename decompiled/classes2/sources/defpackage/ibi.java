package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ibi implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ibi(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v76, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [amzg, java.lang.Object] */
    public final ajcq a() {
        int i = 6;
        int i2 = 15;
        int i3 = 4;
        int i4 = 7;
        int i5 = 5;
        int i6 = 3;
        byte[] bArr = null;
        int i7 = 0;
        switch (this.$cid) {
            case 0:
                defpackage.ibk ibkVar = (defpackage.ibk) this.a;
                if (ibkVar.j.orElse((java.lang.Object) null) == this.b) {
                    return ibkVar.a(defpackage.hxe.b, false, false);
                }
                defpackage.ibk.a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "cancel", 113, "CallAudioPlayer.java").v("playback is not current");
                return ajcm.a;
            case 1:
                defpackage.ibk ibkVar2 = (defpackage.ibk) this.a;
                if (ibkVar2.j.isPresent()) {
                    java.lang.Object obj = this.b;
                    if (!((defpackage.ibl) ibkVar2.j.orElseThrow()).a.equals(obj)) {
                        defpackage.ibk.a.b().l("com/android/dialer/audio/impl/callaudioplayer/CallAudioPlayer", "cancelPlaybackOnCall", 127, "CallAudioPlayer.java").y("current playback is not on call %s", obj);
                        return ajcm.a;
                    }
                }
                return ibkVar2.a(defpackage.hxe.b, false, true);
            case 2:
                java.lang.Object obj2 = this.a;
                defpackage.iix iixVar = (defpackage.iix) this.b;
                return aosv.F((aoss) iixVar.e, 0, new huk(iixVar, (igf) obj2, (aoln) null, 18, (char[]) null), 3);
            case 3:
                java.lang.Object obj3 = this.a;
                defpackage.iix iixVar2 = (defpackage.iix) this.b;
                return aosv.F((aoss) iixVar2.e, 0, new huk(iixVar2, (igf) obj3, (aoln) null, 16), 3);
            case 4:
                return aosv.F((aoss) this.b, 0, new defpackage.icr((defpackage.ijk) this.a, (aoln) null, 4, (byte[]) null), 3);
            case 5:
                java.lang.Object obj4 = this.a;
                defpackage.inu inuVar = (defpackage.inu) this.b;
                return aosv.F(inuVar.c, 0, new defpackage.inm(inuVar, (igf) obj4, (aoln) null, 0), 3);
            case 6:
                return aosv.F(((defpackage.inu) this.a).c, 0, new icp((aonj) this.b, (aoln) null, 5, (byte[]) null), 3);
            case 7:
                return aosv.F((aoss) this.b, 0, new defpackage.jeb((izg) this.a, (aoln) null, 15, (char[]) null), 3);
            case 8:
                return aosv.F((aoss) this.b, 0, new defpackage.jlk((aoin) this.a, (aoln) null, 12), 3);
            case 9:
                return aosv.F((aoss) this.b, 0, new defpackage.jlk((amzg) this.a, (aoln) null, 11), 3);
            case 10:
                return ahrv.g(((afpl) this.b.a()).X()).i(new defpackage.ibe(i3), (java.util.concurrent.Executor) this.a);
            case 11:
                java.lang.Object obj5 = this.a;
                defpackage.ldq ldqVar = (defpackage.ldq) obj5;
                if (ldqVar.h.isPresent() && !((ajcq) ldqVar.h.orElseThrow()).isDone()) {
                    defpackage.ldq.a.b().l("com/android/dialer/callscreen/impl/mdd/CallScreenVoicePackDownloader", "downloadNow", 96, "CallScreenVoicePackDownloader.java").v("previous download in progress");
                    return (ajcq) ldqVar.h.orElseThrow();
                }
                j$.util.Optional optionalC = ldqVar.d.c();
                if (!optionalC.isPresent() || ((acve) optionalC.orElseThrow()).equals(acve.a)) {
                    a.bI(defpackage.ldq.a.d(), "manifest file flag is not present", "com/android/dialer/callscreen/impl/mdd/CallScreenVoicePackDownloader", "downloadNow", 'g', "CallScreenVoicePackDownloader.java", zct.b);
                    return aiql.y(new java.lang.Exception("manifest file flag is not present"));
                }
                acve acveVar = (acve) optionalC.orElseThrow();
                if ((acveVar.b & 1) == 0 || acveVar.c.isEmpty()) {
                    a.bI(defpackage.ldq.a.d(), "manifest file flag does not have manifest id", "com/android/dialer/callscreen/impl/mdd/CallScreenVoicePackDownloader", "validate", (char) 158, "CallScreenVoicePackDownloader.java", zct.b);
                } else {
                    int i8 = 2;
                    if ((acveVar.b & 2) != 0) {
                        java.lang.String str = ((acve) optionalC.orElseThrow()).d;
                        android.content.Context context = ldqVar.b;
                        java.util.regex.Pattern pattern = afej.a;
                        afei afeiVar = new afei(context);
                        afeiVar.f("datadownloadmanifest");
                        android.net.Uri uriBuild = afeiVar.a().buildUpon().appendPath(((acve) optionalC.orElseThrow()).c).build();
                        ajcq ajcqVarG = ldqVar.i.get() ? ajcm.a : ahvr.G(new defpackage.kff(ldqVar, str, uriBuild, acxm.c, 3), ldqVar.f);
                        java.lang.Object obj6 = this.b;
                        ahrv ahrvVarG = ahrv.g(ajcqVarG);
                        defpackage.kwa kwaVar = new defpackage.kwa(obj5, uriBuild, i4, bArr);
                        ajct ajctVar = ldqVar.g;
                        ahrv ahrvVarI = ahrvVarG.i(kwaVar, ajctVar);
                        ldu lduVar = ldqVar.e;
                        j$.util.Objects.requireNonNull(lduVar);
                        ahrv ahrvVarI2 = ahrvVarI.i(new defpackage.ldp(lduVar, i7), ajctVar).h(new defpackage.iau(obj5, obj6, i2), ajctVar).i(new defpackage.ldp(obj5, i8), ajctVar);
                        ldqVar.h = j$.util.Optional.of(ahrvVarI2);
                        return ahrvVarI2;
                    }
                    a.bI(defpackage.ldq.a.d(), "manifest file flag does not have file url", "com/android/dialer/callscreen/impl/mdd/CallScreenVoicePackDownloader", "validate", (char) 163, "CallScreenVoicePackDownloader.java", zct.b);
                }
                return aiql.y(new java.lang.Exception("manifest file flag is invalid"));
            case 12:
                return ahvr.H(this.b.d(), new defpackage.lef(i), (java.util.concurrent.Executor) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return ahvr.H(this.b.d(), new defpackage.lef(i5), (java.util.concurrent.Executor) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ahvr.H(this.b.d(), new defpackage.lef(i4), (java.util.concurrent.Executor) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                j$.util.Optional optional = ((lkk) this.a).b;
                optional.isPresent();
                return ((lkr) optional.orElseThrow()).d((java.lang.String) this.b);
            case 16:
                j$.util.Optional optional2 = ((lkk) this.a).b;
                optional2.isPresent();
                return ((lkr) optional2.orElseThrow()).a((java.util.List) this.b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ?? r1 = this.b;
                defpackage.lzt lztVar = (defpackage.lzt) this.a;
                ajcq ajcqVarF = aosv.F(lztVar.a, 0, new defpackage.kqd(lztVar, (aonn) r1, (aoln) null, 13), 3);
                lztVar.c.g(ajcqVarF, 5L, java.util.concurrent.TimeUnit.SECONDS);
                return ajcqVarF;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((defpackage.nzg) this.a).d.G(new defpackage.jsg(this.b, 5));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return aosv.F((aoss) this.b, 0, new defpackage.ogf((tpf) this.a, (aoln) null, 6), 3);
            default:
                aihm aihmVar = new aihm(j$.util.Comparator.-CC.comparing(new defpackage.old(i6)));
                ?? r2 = this.b;
                int size = r2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    aihmVar.n((defpackage.olt) aiql.H((ajcq) r2.get(i9)));
                }
                java.lang.Object obj7 = this.a;
                defpackage.olx olxVar = new defpackage.olx(obj7, aihmVar, i7);
                defpackage.olz olzVar = (defpackage.olz) obj7;
                return ahvr.H(olzVar.d.bl(olxVar), new defpackage.mjl(obj7, i4), olzVar.a);
        }
    }

    public /* synthetic */ ibi(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
