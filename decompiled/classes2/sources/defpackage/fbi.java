package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fbi {
    public final android.media.AudioTrack a;
    public final android.os.Handler b;
    public android.media.AudioRouting$OnRoutingChangedListener c;
    public final rai d;

    public fbi(android.media.AudioTrack audioTrack, rai raiVar) {
        this.a = audioTrack;
        this.d = raiVar;
        android.os.Handler handlerAh = eum.ah();
        this.b = handlerAh;
        android.media.AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = new android.media.AudioRouting$OnRoutingChangedListener() { // from class: fbg
            public final void onRoutingChanged(final android.media.AudioRouting audioRouting) {
                final defpackage.fbi fbiVar = this.a;
                if (fbiVar.c != null) {
                    defpackage.hgu.aD().execute(new java.lang.Runnable() { // from class: fbh
                        @Override // java.lang.Runnable
                        public final void run() {
                            android.media.AudioDeviceInfo audioDeviceInfoM = fh$.ExternalSyntheticApiModelOutline0.m(audioRouting);
                            if (audioDeviceInfoM != null) {
                                defpackage.fbi fbiVar2 = fbiVar;
                                fbiVar2.b.post(new defpackage.esz(fbiVar2, audioDeviceInfoM, 13, null));
                            }
                        }
                    });
                }
            }
        };
        this.c = audioRouting$OnRoutingChangedListener;
        fh$.ExternalSyntheticApiModelOutline0.m(audioTrack, audioRouting$OnRoutingChangedListener, handlerAh);
    }
}
