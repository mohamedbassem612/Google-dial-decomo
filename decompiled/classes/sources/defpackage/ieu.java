package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ieu extends android.media.AudioDeviceCallback {
    final /* synthetic */ defpackage.iez a;

    public ieu(defpackage.iez iezVar) {
        this.a = iezVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        defpackage.aooh.f(audioDeviceInfoArr, "addedDevices");
        defpackage.aimw aimwVar = (defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer$audioDeviceCallback$<anonymous>", "onAudioDevicesAdded", 180, "AudioPlayer.kt");
        java.util.ArrayList arrayList = new java.util.ArrayList(audioDeviceInfoArr.length);
        for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(java.lang.Integer.valueOf(audioDeviceInfo.getType()));
        }
        aimwVar.y("audio devices added: %s", defpackage.ajsz.cr(arrayList, ",", null, null, null, 62));
        defpackage.iez iezVar = this.a;
        if (iezVar.l == null) {
            iezVar.o();
            break;
        }
        for (android.media.AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfoArr) {
            java.util.List list = defpackage.iep.a;
            android.media.AudioDeviceInfo audioDeviceInfo3 = iezVar.l;
            defpackage.aooh.c(audioDeviceInfo3);
            defpackage.aooh.f(audioDeviceInfo2, "<this>");
            defpackage.aooh.f(audioDeviceInfo3, "other");
            if (defpackage.kcq.I(audioDeviceInfo2) && defpackage.kcq.J(audioDeviceInfo2) < defpackage.kcq.J(audioDeviceInfo3)) {
                iezVar.o();
                break;
            }
        }
        iezVar.r.s(defpackage.ajcm.a, defpackage.iep.d);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        defpackage.aooh.f(audioDeviceInfoArr, "removedDevices");
        defpackage.aimw aimwVar = (defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer$audioDeviceCallback$<anonymous>", "onAudioDevicesRemoved", 196, "AudioPlayer.kt");
        java.util.ArrayList arrayList = new java.util.ArrayList(audioDeviceInfoArr.length);
        for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            arrayList.add(java.lang.Integer.valueOf(audioDeviceInfo.getType()));
        }
        aimwVar.y("audio devices removed: %s", defpackage.ajsz.cr(arrayList, ",", null, null, null, 62));
        defpackage.iez iezVar = this.a;
        if (defpackage.ajsz.cY(audioDeviceInfoArr, iezVar.l)) {
            iezVar.o();
        }
        iezVar.r.s(defpackage.ajcm.a, defpackage.iep.d);
    }
}
