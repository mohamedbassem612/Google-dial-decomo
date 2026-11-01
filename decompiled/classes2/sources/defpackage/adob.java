package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adob {
    public final adoa a;
    public final defpackage.adog b;
    public final int c;
    public final j$.util.Optional d;
    public final j$.util.Optional e;

    public adob(adoa adoaVar, defpackage.adog adogVar, int i, j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = adoaVar;
        if (adogVar == null) {
            throw new java.lang.NullPointerException("Null callType");
        }
        this.b = adogVar;
        this.c = i;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null asrModel");
        }
        this.d = optional;
        this.e = optional2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adob) {
            defpackage.adob adobVar = (defpackage.adob) obj;
            if (this.a.equals(adobVar.a) && this.b.equals(adobVar.b) && this.c == adobVar.c && this.d.equals(adobVar.d) && this.e.equals(adobVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.e;
        j$.util.Optional optional2 = this.d;
        defpackage.adog adogVar = this.b;
        return "AvatarSessionOptions{channel=" + this.a.toString() + ", callType=" + adogVar.toString() + ", audioMode=" + this.c + ", asrModel=" + optional2.toString() + ", downlinkAudioStreamListener=" + optional.toString() + '}';
    }

    public adob() {
        throw null;
    }
}
