package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vyj {
    public final defpackage.uzo a;
    public final j$.util.Optional b;
    public final defpackage.vyi c;
    public final j$.util.Optional d;
    public final j$.util.Optional e;
    public final defpackage.vxy f;

    public vyj(defpackage.uzo uzoVar, j$.util.Optional optional, defpackage.vyi vyiVar, j$.util.Optional optional2, j$.util.Optional optional3, defpackage.vxy vxyVar) {
        this.a = uzoVar;
        this.b = optional;
        this.c = vyiVar;
        this.d = optional2;
        this.e = optional3;
        this.f = vxyVar;
    }

    static defpackage.vyh a() {
        defpackage.vyh vyhVar = new defpackage.vyh();
        vyhVar.c(defpackage.uzo.a);
        vyhVar.c = defpackage.vyi.a;
        vyhVar.b(j$.util.Optional.empty());
        vyhVar.f = new defpackage.vxy(false, false);
        return vyhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vyj) {
            defpackage.vyj vyjVar = (defpackage.vyj) obj;
            if (this.a.equals(vyjVar.a) && this.b.equals(vyjVar.b) && this.c.equals(vyjVar.c) && this.d.equals(vyjVar.d) && this.e.equals(vyjVar.e) && this.f.equals(vyjVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.vxy vxyVar = this.f;
        j$.util.Optional optional = this.e;
        j$.util.Optional optional2 = this.d;
        defpackage.vyi vyiVar = this.c;
        j$.util.Optional optional3 = this.b;
        return "VoicemailModel{voicemailEntry=" + java.lang.String.valueOf(this.a) + ", voicemailErrorModel=" + java.lang.String.valueOf(optional3) + ", expandedState=" + java.lang.String.valueOf(vyiVar) + ", selected=" + java.lang.String.valueOf(optional2) + ", callRecordingPlayerState=" + java.lang.String.valueOf(optional) + ", groupPosition=" + java.lang.String.valueOf(vxyVar) + '}';
    }

    public vyj() {
        throw null;
    }
}
