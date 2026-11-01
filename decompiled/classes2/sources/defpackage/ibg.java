package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ibg implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ibg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r15v41, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v52, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v84, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v88, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v97, types: [amzg, java.lang.Object] */
    public final ajcq a() {
        ajcq ajcqVarZ;
        int i = 1;
        int i2 = 9;
        int i3 = 3;
        int i4 = 0;
        switch (this.$cid) {
            case 0:
                return ((defpackage.ibk) this.a).a(defpackage.hxe.a, false, false);
            case 1:
                defpackage.hzb hzbVar = (defpackage.hzb) this.a;
                defpackage.hzg hzgVar = hzbVar.g;
                int i5 = hzbVar.f;
                if (hzgVar.c.size() >= i5) {
                    ajcqVarZ = aiql.z(hzgVar.a(i5));
                } else {
                    ahvr.bY(!hzgVar.d.isPresent());
                    hzgVar.d = j$.util.Optional.of(new ajdd());
                    hzgVar.e = i5;
                    ajcqVarZ = (ajcq) hzgVar.d.orElseThrow();
                }
                if (hzbVar.i.isPresent()) {
                    hzbVar.g.b();
                }
                return ajcqVarZ;
            case 2:
                return ((defpackage.ibk) this.a).a(defpackage.hxe.c, false, false);
            case 3:
                return ((defpackage.ibk) ((defpackage.ibp) this.a).a).a(defpackage.hxe.d, false, false);
            case 4:
                java.lang.Object obj = this.a;
                defpackage.ibo iboVar = (defpackage.ibo) obj;
                java.lang.Boolean bool = iboVar.d;
                if (bool != null) {
                    return aiql.z(bool);
                }
                int i6 = 8;
                return ahvr.H(ahvr.F(new defpackage.hkx(obj, i6), iboVar.b), new defpackage.hup(obj, i6), iboVar.c);
            case 5:
                java.lang.Object obj2 = this.a;
                defpackage.ibs ibsVar = (defpackage.ibs) obj2;
                zpm zpmVar = ibsVar.j;
                j$.util.Objects.requireNonNull(zpmVar);
                defpackage.hkx hkxVar = new defpackage.hkx(zpmVar, i2);
                ajct ajctVar = ibsVar.b;
                return ahvr.H(ahvr.I(ajctVar.eU(hkxVar), new defpackage.ibe(i3), ajctVar), new defpackage.hup(obj2, i2), ajctVar);
            case 6:
                ztf ztfVarB = ztf.b(((spn) this.a).f);
                if (ztfVarB == null) {
                    ztfVarB = ztf.a;
                }
                return aiql.z(ztfVarB == ztf.b ? j$.util.Optional.of(new qij(qik.a)) : j$.util.Optional.empty());
            case 7:
                java.lang.Object obj3 = this.a;
                jst jstVar = (jst) obj3;
                return ahvr.H(jstVar.d.a(), new defpackage.jss(obj3, i4), jstVar.b);
            case 8:
                java.lang.Object obj4 = this.a;
                defpackage.kww kwwVar = (defpackage.kww) obj4;
                if (!kwwVar.e.isPresent()) {
                    return kwwVar.a();
                }
                ahrv ahrvVarJ = ahrv.g((ajcq) kwwVar.e.orElseThrow()).j(((java.lang.Long) kwwVar.b.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, kwwVar.d);
                defpackage.jvq jvqVar = new defpackage.jvq(19);
                ajct ajctVar2 = kwwVar.c;
                return ahrvVarJ.e(java.lang.Throwable.class, jvqVar, ajctVar2).i(new defpackage.kxm(obj4, i), ajctVar2);
            case 9:
                uss ussVar = (uss) this.a;
                return aosv.F((aoss) ussVar.a, 0, new defpackage.ogf(ussVar, (aoln) null, 9), 3);
            case 10:
                java.lang.Object obj5 = this.a;
                defpackage.lem lemVar = (defpackage.lem) obj5;
                lemVar.f = lemVar.c.a();
                if (!lemVar.f.isPresent()) {
                    defpackage.lem.a.b().l("com/android/dialer/callscreen/impl/service/CallScreenAudioPreparer", "prepareCallAudioForListening", 60, "CallScreenAudioPreparer.java").v("audio route not found.");
                    return ajcm.a;
                }
                ajcq ajcqVarB = lemVar.b.b();
                aihd aihdVar = defpackage.lgi.b;
                j$.util.Objects.requireNonNull(aihdVar);
                return ahvr.H(ahvr.H(ajcqVarB, new defpackage.lgd(aihdVar, 2), ajbm.a), new defpackage.kxn(obj5, 14), lemVar.e);
            case 11:
                ?? r15 = this.a;
                ahoq ahoqVarW = ahvr.W(274, "CallScreenProducerModule_produceCallScreenActionButtonInNotification");
                try {
                    ajcq ajcqVarD = r15.d();
                    ahoqVarW.a(ajcqVarD);
                    ahoqVarW.close();
                    return ajcqVarD;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 12:
                return ((defpackage.ljs) this.a).f(true);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj6 = this.a;
                ljb ljbVar = (ljb) obj6;
                ljbVar.v = false;
                android.speech.SpeechRecognizer speechRecognizer = ljbVar.d;
                if (speechRecognizer == null) {
                    ljb.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "endSpeechRecognition", 187, "SodaSpeechRecognizer.java").v("Speech recognition not in progress so nothing to end.");
                    return ajcm.a;
                }
                speechRecognizer.setRecognitionListener(new defpackage.liw(ljbVar.d));
                ljbVar.d.stopListening();
                ljbVar.d = null;
                try {
                    ((ljb) obj6).p[0].close();
                    ((ljb) obj6).p[1].close();
                    break;
                } catch (java.io.IOException e) {
                    a.bq(ljb.a.c(), "Unable to close ParcelFileDescriptors.", "com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "endSpeechRecognition", (char) 207, "SodaSpeechRecognizer.java", e, zct.b);
                }
                ljb.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer", "endSpeechRecognition", 209, "SodaSpeechRecognizer.java").v("Ended Speech Recognition");
                return ajcm.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.lny lnyVar = (defpackage.lny) this.a;
                return aosv.F(lnyVar.b, 0, new defpackage.jrb(lnyVar, (aoln) null, 12), 3);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.lzt lztVar = (defpackage.lzt) this.a;
                return aosv.F(lztVar.a, 0, new defpackage.jrb(lztVar, (aoln) null, 17), 3);
            case 16:
                return aiql.z(j$.util.Optional.ofNullable(this.a.a()));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return this.a.d();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.nza nzaVar = (defpackage.nza) this.a;
                return nzaVar.b.d(nzaVar.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.Object obj7 = this.a;
                defpackage.omo omoVar = (defpackage.omo) obj7;
                oju ojuVar = omoVar.a;
                j$.util.Objects.requireNonNull(ojuVar);
                return ahvr.P(new defpackage.omj(ojuVar, i3), omoVar.b).h(new defpackage.mjl(obj7, i2), omoVar.c);
            default:
                return this.a.d();
        }
    }
}
