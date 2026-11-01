package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class swy extends agwz {
    private static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/audio/VolumeContentObserver");
    private final defpackage.tcl b;
    private final android.media.AudioManager c;
    private final ood d;

    public swy(android.media.AudioManager audioManager, ajct ajctVar, ahpz ahpzVar, defpackage.tcl tclVar, ood oodVar) {
        super(ahpzVar, "VolumeContentObserver", ajctVar);
        this.b = tclVar;
        this.c = audioManager;
        this.d = oodVar;
    }

    public final void a(boolean z, android.net.Uri uri) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/audio/VolumeContentObserver", "traceWrappedOnChange", 48, "VolumeContentObserver.java").K("begin - selfChange:%b, uri:%s", z, uri);
        if (uri.toString().contains("content://settings/system/volume_voice_")) {
            aimw aimwVarL = aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/audio/VolumeContentObserver", "traceWrappedOnChange", 51, "VolumeContentObserver.java");
            android.media.AudioManager audioManager = this.c;
            aimwVarL.z("call volume:%d, ringer volume:%d, we will now silence the ringer and mute the voice stream", audioManager.getStreamVolume(0), audioManager.getStreamVolume(2));
            audioManager.adjustStreamVolume(0, -100, 0);
            this.b.a();
            this.d.a();
            aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/audio/VolumeContentObserver", "traceWrappedOnChange", 61, "VolumeContentObserver.java").z("call volume:%d, ringer volume:%d after muting the call stream and stopping dialer initiated-ringing", audioManager.getStreamVolume(0), audioManager.getStreamVolume(2));
        }
    }
}
