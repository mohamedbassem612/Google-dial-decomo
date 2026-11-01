package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jfh implements defpackage.jfl {
    public final defpackage.hxe a;
    public final defpackage.hxe b;

    public jfh(defpackage.hxe hxeVar, defpackage.hxe hxeVar2) {
        aooh.f(hxeVar, "disclaimerPlayBackReason");
        this.a = hxeVar;
        this.b = hxeVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jfh) {
            defpackage.jfh jfhVar = (defpackage.jfh) obj;
            if (this.a == jfhVar.a && this.b == jfhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.hxe hxeVar = this.b;
        return iHashCode + (hxeVar == null ? 0 : hxeVar.hashCode());
    }

    public final java.lang.String toString() {
        return "BeeslyDisclaimerPlayFailure(disclaimerPlayBackReason=" + this.a + ", beepPlaybackReason=" + this.b + ')';
    }
}
