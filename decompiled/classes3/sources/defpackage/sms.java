package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sms implements ahth {
    public final long a;
    public final boolean b;

    public sms(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sms) {
            defpackage.sms smsVar = (defpackage.sms) obj;
            if (anty.ah(this.a, smsVar.a) && this.b == smsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.a) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "FontColorSelectedEvent(selectedColor=" + cqg.g(this.a) + ", isSmartColorSelected=" + this.b + ')';
    }
}
