package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iao {
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl");
    public final android.content.Context b;
    public final agsm c;
    public final ajcu d;
    private final ajcu e;

    public iao(android.content.Context context, agsm agsmVar, ajcu ajcuVar, ajcu ajcuVar2) {
        this.b = context;
        this.c = agsmVar;
        this.e = ajcuVar;
        this.d = ajcuVar2;
    }

    public final void a(java.util.function.Consumer consumer) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl", "bindToAudioServiceAndRun", 102, "VoiceLibControllerImpl.java").v("Bind to audio service");
        defpackage.ian ianVar = new defpackage.ian(this.e, consumer);
        ianVar.b = new defpackage.gra(this, ianVar, 17);
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.google.android.apps.tycho");
        intent.setAction("com.google.android.ims.AUDIO_SERVICE");
        android.content.Context context = this.b;
        if (context.bindService(intent, ianVar, 1)) {
            return;
        }
        aimzVar.c().m(aioa.c).l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl", "bindToAudioServiceAndRun", 112, "VoiceLibControllerImpl.java").v("Failed to bind to audio service");
        context.unbindService(ianVar);
        throw new java.lang.IllegalStateException("Unable to bind to audio service");
    }
}
