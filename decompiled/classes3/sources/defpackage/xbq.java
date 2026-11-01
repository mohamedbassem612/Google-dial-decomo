package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbq extends defpackage.xbr {
    private final int a;
    private final int b;

    public xbq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.xbr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.xbr
    public final int b() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.xbr) {
            defpackage.xbr xbrVar = (defpackage.xbr) obj;
            if (this.a == xbrVar.b() && this.b == xbrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "CallVolumeBeforeMuted{voiceCallVolume=" + this.a + ", bluetoothScoVolume=" + this.b + '}';
    }
}
