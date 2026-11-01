package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ieq {
    public final android.media.AudioDeviceInfo a;
    public final java.lang.String b;

    public ieq(android.media.AudioDeviceInfo audioDeviceInfo, java.lang.String str) {
        aooh.f(audioDeviceInfo, "audioDeviceInfo");
        aooh.f(str, "displayName");
        this.a = audioDeviceInfo;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ieq) {
            defpackage.ieq ieqVar = (defpackage.ieq) obj;
            if (aooh.n(this.a, ieqVar.a) && aooh.n(this.b, ieqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioDeviceEntry(audioDeviceInfo=" + this.a + ", displayName=" + this.b + ')';
    }
}
