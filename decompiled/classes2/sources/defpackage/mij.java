package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mij {
    public final j$.util.Optional a;
    public final j$.util.Optional b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final j$.util.Optional e;
    public final j$.util.Optional f;
    public final int g;
    public final boolean h;

    public mij(j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4, j$.util.Optional optional5, j$.util.Optional optional6, int i, boolean z) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = i;
        this.h = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mij) {
            defpackage.mij mijVar = (defpackage.mij) obj;
            if (this.a.equals(mijVar.a) && this.b.equals(mijVar.b) && this.c.equals(mijVar.c) && this.d.equals(mijVar.d) && this.e.equals(mijVar.e) && this.f.equals(mijVar.f) && this.g == mijVar.g && this.h == mijVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.f;
        j$.util.Optional optional2 = this.e;
        j$.util.Optional optional3 = this.d;
        j$.util.Optional optional4 = this.c;
        j$.util.Optional optional5 = this.b;
        return "SimInfo{deviceId=" + java.lang.String.valueOf(this.a) + ", imei=" + java.lang.String.valueOf(optional5) + ", meid=" + java.lang.String.valueOf(optional4) + ", iccId=" + java.lang.String.valueOf(optional3) + ", msisdn=" + java.lang.String.valueOf(optional2) + ", eid=" + java.lang.String.valueOf(optional) + ", slot=" + this.g + ", isPrimarySim=" + this.h + '}';
    }

    public mij() {
        throw null;
    }
}
