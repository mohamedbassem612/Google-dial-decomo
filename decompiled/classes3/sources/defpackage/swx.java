package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class swx {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/audio/VolumeChangeDetector");
    public final ojo b;
    public final defpackage.swy c;
    public final android.media.AudioManager d;

    public swx(android.media.AudioManager audioManager, ojo ojoVar, defpackage.swy swyVar) {
        this.b = ojoVar;
        this.d = audioManager;
        this.c = swyVar;
    }

    public final void a() {
        aimz aimzVar = a;
        aimw aimwVarL = aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/audio/VolumeChangeDetector", "stopDetecting", 54, "VolumeChangeDetector.java");
        android.media.AudioManager audioManager = this.d;
        aimwVarL.z("unmuting call stream, call volume:%d, ringer:%d", audioManager.getStreamVolume(0), audioManager.getStreamVolume(2));
        audioManager.adjustStreamVolume(0, 100, 0);
        aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/audio/VolumeChangeDetector", "stopDetecting", 60, "VolumeChangeDetector.java").w("call volume:%d, after unmuting call stream", audioManager.getStreamVolume(0));
        agwz agwzVar = this.c;
        aooh.f(agwzVar, "observer");
        this.b.a.getContentResolver().unregisterContentObserver(agwzVar);
    }
}
