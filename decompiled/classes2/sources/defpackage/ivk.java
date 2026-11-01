package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ivk {
    public final defpackage.ivm a;
    public final defpackage.hxf b;

    public ivk(defpackage.ivm ivmVar, defpackage.hxf hxfVar) {
        aooh.f(ivmVar, "disclaimerType");
        aooh.f(hxfVar, "playbackSession");
        this.a = ivmVar;
        this.b = hxfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ivk) {
            defpackage.ivk ivkVar = (defpackage.ivk) obj;
            if (this.a == ivkVar.a && aooh.n(this.b, ivkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "DisclaimerPlaybackSession(disclaimerType=" + this.a + ", playbackSession=" + this.b + ')';
    }
}
