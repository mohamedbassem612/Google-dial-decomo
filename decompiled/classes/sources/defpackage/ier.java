package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ier implements android.media.AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ defpackage.apnt a;

    public ier(defpackage.apnt apntVar) {
        this.a = apntVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        int i2;
        if (i == -2) {
            i2 = 3;
        } else if (i != -1) {
            i2 = 1;
            if (i == 1) {
                i2 = 2;
            }
        } else {
            i2 = 4;
        }
        this.a.m(i2);
    }
}
