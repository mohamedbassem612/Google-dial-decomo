package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lkh implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ lkh(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                wad wadVar = (wad) obj;
                wadVar.e(new wab(wadVar, this.a, (aoln) null));
                return;
            }
            defpackage.aazb aazbVar = (defpackage.aazb) obj;
            boolean z = this.a;
            try {
                defpackage.iao.a.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl", "setMicrophoneAudioIgnoredImpl", 281, "VoiceLibControllerImpl.java").y("set microphone audio ignored to %b", java.lang.Boolean.valueOf(z));
                android.os.Parcel parcelEP = aazbVar.eP();
                java.lang.ClassLoader classLoader = yld.a;
                parcelEP.writeInt(z ? 1 : 0);
                aazbVar.eS(3, parcelEP);
                return;
            } catch (android.os.RemoteException e) {
                throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Can not set mic audio ignored to %b", java.lang.Boolean.valueOf(z)), e);
            }
        }
        defpackage.lkq lkqVar = (defpackage.lkq) obj;
        lkqVar.c = "";
        if (this.a) {
            lkqVar.b = null;
            defpackage.ljx ljxVar = lkqVar.g;
            if (ljxVar != null) {
                defpackage.ljz ljzVar = ljxVar.d;
                if (ljzVar == null) {
                    ljzVar = defpackage.ljz.a;
                }
                lkk.f(ljzVar);
                lkqVar.g = null;
            }
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
