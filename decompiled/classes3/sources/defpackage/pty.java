package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pty {
    public final defpackage.zpo a;
    public final defpackage.zmx b;
    public final android.telecom.DisconnectCause c;
    public final defpackage.zcy d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public pty(defpackage.zpo zpoVar, defpackage.zmx zmxVar, android.telecom.DisconnectCause disconnectCause, int i, defpackage.zcy zcyVar, boolean z, boolean z2, boolean z3) {
        this.a = zpoVar;
        this.b = zmxVar;
        this.c = disconnectCause;
        this.h = i;
        this.d = zcyVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        android.telecom.DisconnectCause disconnectCause;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pty) {
            defpackage.pty ptyVar = (defpackage.pty) obj;
            if (this.a.equals(ptyVar.a) && this.b.equals(ptyVar.b) && ((disconnectCause = this.c) != null ? disconnectCause.equals(ptyVar.c) : ptyVar.c == null)) {
                int i = this.h;
                int i2 = ptyVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.d.equals(ptyVar.d) && this.e == ptyVar.e && this.f == ptyVar.f && this.g == ptyVar.g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        android.telecom.DisconnectCause disconnectCause = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (disconnectCause == null ? 0 : disconnectCause.hashCode())) * 1000003;
        int i = this.h;
        anty.aJ(i);
        return ((((((((iHashCode2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.h;
        android.telecom.DisconnectCause disconnectCause = this.c;
        defpackage.zmx zmxVar = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        java.lang.String strValueOf2 = java.lang.String.valueOf(zmxVar);
        java.lang.String strValueOf3 = java.lang.String.valueOf(disconnectCause);
        if (i != 1) {
            str = i != 2 ? "null" : "RTT_DEACTIVATED";
        } else {
            str = "RTT_ACTIVATED";
        }
        defpackage.zcy zcyVar = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        return "CallStateSnapshot{telecomState=" + strValueOf + ", interceptionMode=" + strValueOf2 + ", disconnectCause=" + strValueOf3 + ", rttState=" + str + ", videoState=" + java.lang.String.valueOf(zcyVar) + ", sentVideoRequestState=" + z + ", receivedVideoRequest=" + z2 + ", isSimulatedRinging=" + z3 + '}';
    }

    public pty() {
        throw null;
    }
}
