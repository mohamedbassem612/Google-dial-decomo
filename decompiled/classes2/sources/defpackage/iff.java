package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iff implements ahth {
    public final android.media.AudioDeviceInfo a;

    public iff(android.media.AudioDeviceInfo audioDeviceInfo) {
        aooh.f(audioDeviceInfo, "audioDevice");
        this.a = audioDeviceInfo;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.iff) && aooh.n(this.a, ((defpackage.iff) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioDeviceSelectedEvent(audioDevice=" + this.a + ')';
    }
}
