package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hwi implements aoxi {
    final /* synthetic */ aoot a;
    final /* synthetic */ aoss b;
    final /* synthetic */ defpackage.hwj c;

    public hwi(aoot aootVar, aoss aossVar, defpackage.hwj hwjVar) {
        this.a = aootVar;
        this.b = aossVar;
        this.c = hwjVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(defpackage.hwa hwaVar, aoln aolnVar) throws aois {
        defpackage.hwh hwhVar;
        defpackage.hxf hxfVar;
        if (aolnVar instanceof defpackage.hwh) {
            hwhVar = (defpackage.hwh) aolnVar;
            int i = hwhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hwhVar.c = i - Integer.MIN_VALUE;
            } else {
                hwhVar = new defpackage.hwh(this, aolnVar);
            }
        } else {
            hwhVar = new defpackage.hwh(this, aolnVar);
        }
        java.lang.Object obj = hwhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hwhVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            int iOrdinal = hwaVar.ordinal();
            if (iOrdinal == 0) {
                defpackage.hwj.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioPlayer", "startUiSignalReceiver$<anonymous>$<anonymous>", 151, "VoiceAssistAudioPlayer.kt").v("Signal received: Start audio");
                aoub aoubVar = (aoub) this.a.a;
                if (aoubVar != null) {
                    hwhVar.c = 1;
                    if (aooc.T(aoubVar, hwhVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                aoot aootVar = this.a;
                aimz aimzVar = zih.a;
                aootVar.a = aoov.al(this.b, zih.b.plus(aols.a), 1, new defpackage.dqx((aoln) null, this.c, 9, (byte[]) null));
            } else {
                if (iOrdinal != 1) {
                    throw new aois();
                }
                defpackage.hwj.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioPlayer", "startUiSignalReceiver$<anonymous>$<anonymous>", 167, "VoiceAssistAudioPlayer.kt").v("Signal received: Stop audio");
                defpackage.hwj hwjVar = this.c;
                if ((hwjVar.l instanceof defpackage.hwc) && (hxfVar = hwjVar.g) != null) {
                    hxfVar.d();
                }
                aoub aoubVar2 = (aoub) this.a.a;
                if (aoubVar2 != null) {
                    hwhVar.c = 2;
                    if (aooc.T(aoubVar2, hwhVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                defpackage.hwj.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioPlayer", "startUiSignalReceiver$<anonymous>$<anonymous>", 174, "VoiceAssistAudioPlayer.kt").v("Audio playback stopped.");
            }
        } else if (i2 == 1) {
            aooc.af(obj);
            aoot aootVar2 = this.a;
            aimz aimzVar2 = zih.a;
            aootVar2.a = aoov.al(this.b, zih.b.plus(aols.a), 1, new defpackage.dqx((aoln) null, this.c, 9, (byte[]) null));
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            defpackage.hwj.a.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioPlayer", "startUiSignalReceiver$<anonymous>$<anonymous>", 174, "VoiceAssistAudioPlayer.kt").v("Audio playback stopped.");
        }
        return aojh.a;
    }
}
