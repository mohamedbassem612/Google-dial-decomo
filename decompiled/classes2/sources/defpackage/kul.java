package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kul {
    public final defpackage.hxw a;
    public final defpackage.hxw b;

    public kul(defpackage.hxw hxwVar, defpackage.hxw hxwVar2) {
        this.a = hxwVar;
        this.b = hxwVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kul) {
            defpackage.kul kulVar = (defpackage.kul) obj;
            if (aooh.n(this.a, kulVar.a) && aooh.n(this.b, kulVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallRecordingDisclosure(startingAudio=" + this.a + ", endingAudio=" + this.b + ')';
    }
}
