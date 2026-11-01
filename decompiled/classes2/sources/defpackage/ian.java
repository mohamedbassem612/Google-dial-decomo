package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ian implements android.content.ServiceConnection {
    public final java.util.function.Consumer a;
    public volatile java.lang.Runnable b;
    private final ajcu c;

    public ian(ajcu ajcuVar, java.util.function.Consumer consumer) {
        this.c = ajcuVar;
        this.a = consumer;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.aazb aazbVar;
        defpackage.iao.a.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl$VoiceLibServiceConnection", "onServiceConnected", 61, "VoiceLibControllerImpl.java").v("Audio service connected");
        byte[] bArr = null;
        if (iBinder == null) {
            aazbVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.ipc.IAudioService");
            aazbVar = iInterfaceQueryLocalInterface instanceof defpackage.aazb ? (defpackage.aazb) iInterfaceQueryLocalInterface : new defpackage.aazb(iBinder);
        }
        agsm.i(96, ahvr.E(new defpackage.gra(this, aazbVar, 18, bArr), this.c), "Failed to run audio task", new java.lang.Object[0]);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        defpackage.iao.a.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl$VoiceLibServiceConnection", "onServiceDisconnected", 80, "VoiceLibControllerImpl.java").v("Audio service disconnected");
    }
}
