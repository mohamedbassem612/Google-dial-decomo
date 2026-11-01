package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nie implements defpackage.nig {
    public final defpackage.hxe a;
    public final int b;

    public nie(defpackage.hxe hxeVar, int i) {
        aooh.f(hxeVar, "endedReason");
        this.a = hxeVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nie) {
            defpackage.nie nieVar = (defpackage.nie) obj;
            if (this.a == nieVar.a && this.b == nieVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "Completed(endedReason=" + this.a + ", audioLengthMills=" + this.b + ')';
    }
}
