package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class faj extends android.media.AudioDeviceCallback {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ defpackage.fam a;

    public faj(defpackage.fam famVar) {
        j$.util.Objects.requireNonNull(famVar);
        this.a = famVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        defpackage.fam famVar = this.a;
        j$.util.Objects.requireNonNull(famVar);
        eum.af(famVar.b, new defpackage.drn(famVar, 12));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        eum.af(this.a.b, new defpackage.esz(this, audioDeviceInfoArr, 10));
    }
}
