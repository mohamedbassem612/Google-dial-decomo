package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class adpl {
    public final boolean a;
    public final boolean b;

    public adpl(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adpl) {
            defpackage.adpl adplVar = (defpackage.adpl) obj;
            if (this.a == adplVar.a && this.b == adplVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "MuteStreamsSettings{isVoiceCallStreamMuteSupported=" + this.a + ", isBluetoothScoStreamMuteSupported=" + this.b + '}';
    }

    public adpl() {
        throw null;
    }
}
