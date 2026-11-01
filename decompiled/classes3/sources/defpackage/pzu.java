package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzu {
    public final java.lang.String a;
    public final defpackage.pzp b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final j$.util.Optional f;

    public pzu(java.lang.String str, defpackage.pzp pzpVar, boolean z, boolean z2, boolean z3, j$.util.Optional optional) {
        this.a = str;
        this.b = pzpVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pzu) {
            defpackage.pzu pzuVar = (defpackage.pzu) obj;
            if (this.a.equals(pzuVar.a) && this.b.equals(pzuVar.b) && this.c == pzuVar.c && this.d == pzuVar.d && this.e == pzuVar.e && this.f.equals(pzuVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.f;
        return "InCallScreenHostModel{callId=" + this.a + ", selectedScreenKey=" + java.lang.String.valueOf(this.b) + ", allowOrientationChange=" + this.c + ", allowBackNavigation=" + this.d + ", keepScreenOn=" + this.e + ", outgoingCallRequestId=" + java.lang.String.valueOf(optional) + '}';
    }

    public pzu() {
        throw null;
    }
}
