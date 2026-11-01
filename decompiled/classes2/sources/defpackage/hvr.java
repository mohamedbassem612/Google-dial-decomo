package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hvr extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.hvs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvr(defpackage.hvs hvsVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = hvsVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x014e  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        java.lang.Object objD;
        java.lang.Object objD2;
        hvy hvyVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    aooc.af(obj);
                    objD = obj;
                } else if (i != 2) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    objD2 = obj;
                    if (!((java.lang.Boolean) objD2).booleanValue()) {
                        defpackage.hvs.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/TextToSpeechCallEventListener", "onCallActivated$<anonymous>", 60, "TextToSpeechCallEventListener.kt").v("Not an emergency call nor emergency callback. Not initializing audio generator.");
                        return aojh.a;
                    }
                    defpackage.hvs.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/TextToSpeechCallEventListener", "onCallActivated$<anonymous>", 64, "TextToSpeechCallEventListener.kt").v("Attempting to initialize TextToSpeech.");
                    defpackage.hvs hvsVar = this.b;
                    hvsVar.c.b(mce.bJ);
                    hvyVar = hvsVar.f;
                    this.a = 3;
                    if (hvyVar.b(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                this.b.d.a(ajcm.a);
                return aojh.a;
            }
            aooc.af(obj);
            defpackage.hvs.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/TextToSpeechCallEventListener", "onCallActivated$<anonymous>", 52, "TextToSpeechCallEventListener.kt").v("enter");
            defpackage.hvs hvsVar2 = this.b;
            huy huyVar = hvsVar2.b;
            if (huyVar.e.m()) {
                huy.a.b().l("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "shouldShowVoiceAssist", 108, "AssistedEmergencyDialingConstraints.java").v("directBoot");
            } else if (huyVar.b()) {
                accessibilityManager = (android.view.accessibility.AccessibilityManager) huyVar.b.getSystemService(android.view.accessibility.AccessibilityManager.class);
                if (accessibilityManager == null) {
                }
                hgb.c(huy.a.b(), "Voice assist should be shown.", "com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "shouldShowVoiceAssist", (char) 128, "AssistedEmergencyDialingConstraints.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                this.a = 1;
                objD = aosv.D(((defpackage.hvq) aooc.ar(hvsVar2.g.Y(), defpackage.hvq.class)).aG(), this);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                boolean zIsPresent = huyVar.c.a().isPresent();
                if (((java.lang.Boolean) huyVar.d.a()).booleanValue()) {
                    if (zIsPresent) {
                        accessibilityManager = (android.view.accessibility.AccessibilityManager) huyVar.b.getSystemService(android.view.accessibility.AccessibilityManager.class);
                        if (accessibilityManager == null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                            hgb.c(huy.a.b(), "Accessibility mode enabled. Not showing voice assist.", "com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "shouldShowVoiceAssist", '|', "AssistedEmergencyDialingConstraints.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                        } else {
                            hgb.c(huy.a.b(), "Voice assist should be shown.", "com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "shouldShowVoiceAssist", (char) 128, "AssistedEmergencyDialingConstraints.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            this.a = 1;
                            objD = aosv.D(((defpackage.hvq) aooc.ar(hvsVar2.g.Y(), defpackage.hvq.class)).aG(), this);
                            if (objD == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else {
                        zIsPresent = false;
                    }
                }
                huy.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/assistedemergencydialing/impl/AssistedEmergencyDialingConstraints", "shouldShowVoiceAssist", 116, "AssistedEmergencyDialingConstraints.java").J("Not Pixel in the US. Not showing voice assist. enableVoiceAssistOnEmergencyPanel: %b, isSupportedLocale: %b", huyVar.d.a(), zIsPresent);
            }
            defpackage.hvs.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/TextToSpeechCallEventListener", "onCallActivated$<anonymous>", 54, "TextToSpeechCallEventListener.kt").v("Voice assist not enabled. Returning.");
            return aojh.a;
            if (!((java.lang.Boolean) objD).booleanValue()) {
                defpackage.hvs hvsVar3 = this.b;
                this.a = 2;
                objD2 = aosv.D(((defpackage.hvq) aooc.ar(hvsVar3.g.Y(), defpackage.hvq.class)).aH(), this);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objD2).booleanValue()) {
                    defpackage.hvs.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/TextToSpeechCallEventListener", "onCallActivated$<anonymous>", 60, "TextToSpeechCallEventListener.kt").v("Not an emergency call nor emergency callback. Not initializing audio generator.");
                    return aojh.a;
                }
            }
            defpackage.hvs.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/TextToSpeechCallEventListener", "onCallActivated$<anonymous>", 64, "TextToSpeechCallEventListener.kt").v("Attempting to initialize TextToSpeech.");
            defpackage.hvs hvsVar4 = this.b;
            hvsVar4.c.b(mce.bJ);
            hvyVar = hvsVar4.f;
            this.a = 3;
            if (hvyVar.b(this) == aoluVar) {
                return aoluVar;
            }
            this.b.d.a(ajcm.a);
        } catch (java.lang.Exception e) {
            defpackage.hvs.a.c().i(zct.b).k(e).l("com/android/dialer/assistedemergencydialing/impl/tts/TextToSpeechCallEventListener", "onCallActivated$<anonymous>", 78, "TextToSpeechCallEventListener.kt").v("TTS initialization failed.");
            this.b.e.a(qbc.ha);
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.hvr(this.b, aolnVar);
    }
}
