package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pfh {
    public final j$.util.Optional a;
    public final boolean b;
    public final boolean c;
    public final j$.util.Optional d;

    public pfh(j$.util.Optional optional, boolean z, boolean z2, j$.util.Optional optional2) {
        this.a = optional;
        this.b = z;
        this.c = z2;
        this.d = optional2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pfh) {
            defpackage.pfh pfhVar = (defpackage.pfh) obj;
            if (this.a.equals(pfhVar.a) && this.b == pfhVar.b && this.c == pfhVar.c && this.d.equals(pfhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.d;
        return "BubbleModel{callId=" + java.lang.String.valueOf(this.a) + ", showCallEndedMessage=" + this.b + ", shouldShow=" + this.c + ", bubbleInfo=" + java.lang.String.valueOf(optional) + '}';
    }

    public pfh() {
        throw null;
    }
}
