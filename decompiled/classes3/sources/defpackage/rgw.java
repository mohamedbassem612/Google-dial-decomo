package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgw {
    public final java.lang.String a;
    public final defpackage.rgp b;

    public rgw(java.lang.String str, defpackage.rgp rgpVar) {
        this.a = str;
        this.b = rgpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rgw) {
            defpackage.rgw rgwVar = (defpackage.rgw) obj;
            if (this.a.equals(rgwVar.a) && this.b.equals(rgwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VoiceFeatureTakeoverModel{callId=" + this.a + ", primaryFeatureModel=" + java.lang.String.valueOf(this.b) + '}';
    }

    public rgw() {
        throw null;
    }
}
