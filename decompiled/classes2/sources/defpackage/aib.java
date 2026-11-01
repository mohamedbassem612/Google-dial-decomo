package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aib implements aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aib(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r6v17, types: [cal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v35, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) throws aois {
        defpackage.aic aicVar;
        switch (this.$cid) {
            case 0:
                int iOrdinal = ((afr) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        aicVar = (defpackage.aic) this.a;
                        afs afsVar = aicVar.a.b;
                    } else {
                        if (iOrdinal != 2) {
                            throw new aois();
                        }
                        aicVar = (defpackage.aic) this.a;
                    }
                    afs afsVar2 = aicVar.b.b;
                } else {
                    afs afsVar3 = ((defpackage.aic) this.a).a.b;
                }
                return new cqg(cfd.M(0));
            case 1:
                aiv aivVar = (aiv) obj;
                float f = aivVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                float f2 = aivVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                float f3 = aivVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = aivVar.a;
                float f6 = f5 >= 0.0f ? f5 : 0.0f;
                float[] fArr = crp.a;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                return new cqg(cqg.e(cfd.N(f, f2, f4, f6, crp.x), (crn) this.a));
            case 2:
                this.a.a();
                return aojh.a;
            case 3:
                return this.a.a(java.lang.Long.valueOf(((java.lang.Number) obj).longValue() / 1000000));
            case 4:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                cwc cwcVar = (cwc) this.a;
                aosb aosbVar = cwcVar.a;
                if (aosbVar != null) {
                    aosbVar.g(th);
                }
                cwcVar.a = null;
                return aojh.a;
            case 5:
                ((czb) obj).u((czc) this.a, 0, 0, 0.0f);
                return aojh.a;
            case 6:
                ?? r6 = this.a;
                czb czbVar = (czb) obj;
                int iAZ = ajsz.aZ((java.util.List) r6);
                if (iAZ >= 0) {
                    int i = 0;
                    while (true) {
                        czbVar.u((czc) r6.get(i), 0, 0, 0.0f);
                        if (i != iAZ) {
                            i++;
                        }
                    }
                }
                return aojh.a;
            case 7:
                this.a.cancel(false);
                return aojh.a;
            case 8:
                return java.lang.Integer.valueOf(ajsz.au((java.lang.Float) ((aoiu) obj).a, (java.lang.Comparable) this.a));
            case 9:
                java.lang.Object obj2 = ((java.lang.Object[]) this.a)[((java.lang.Number) obj).intValue()];
                if (obj2 != null) {
                    return (java.lang.Byte) obj2;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Byte");
            case 10:
                java.lang.Object obj3 = ((java.lang.Object[]) this.a)[((java.lang.Number) obj).intValue()];
                if (obj3 != null) {
                    return (java.lang.Long) obj3;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Long");
            case 11:
                this.a.cancel(false);
                return aojh.a;
            case 12:
                this.a.cancel(false);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                this.a.cancel(false);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                this.a.cancel(false);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                this.a.cancel(false);
                return aojh.a;
            case 16:
                this.a.cancel(false);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.speech.tts.TextToSpeech textToSpeech = ((hvy) this.a).g;
                if (textToSpeech != null) {
                    textToSpeech.stop();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.hyj.a.b().l("com/android/dialer/audio/audioinjector/audioplayer/LocalAudioPlayer$Companion", "playSuspending$<anonymous>$<anonymous>", 289, "LocalAudioPlayer.kt").y("onCancellation %s", (java.lang.Throwable) obj);
                defpackage.hgt.i((defpackage.oii) this.a);
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((android.speech.tts.TextToSpeech) this.a).setOnUtteranceProgressListener(null);
                return aojh.a;
            default:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
        }
    }
}
