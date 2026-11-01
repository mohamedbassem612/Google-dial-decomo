package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkm {
    public final java.lang.String a;
    public final defpackage.aify b;
    public final defpackage.albh c;
    public final defpackage.ahkk d;
    public final j$.util.Optional e;
    public final j$.util.Optional f;

    public ahkm(java.lang.String str, defpackage.aify aifyVar, defpackage.albh albhVar, defpackage.ahkk ahkkVar, j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = str;
        this.b = aifyVar;
        this.c = albhVar;
        this.d = ahkkVar;
        this.e = optional;
        this.f = optional2;
    }

    public static defpackage.ahkl a() {
        defpackage.ahkl ahklVar = new defpackage.ahkl(null);
        ahklVar.b = new defpackage.ahkk(1, 2);
        ahklVar.d = (byte) 1;
        return ahklVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahkm) {
            defpackage.ahkm ahkmVar = (defpackage.ahkm) obj;
            if (this.a.equals(ahkmVar.a) && defpackage.ahvr.aP(this.b, ahkmVar.b) && this.c.equals(ahkmVar.c) && this.d.equals(ahkmVar.d) && this.e.equals(ahkmVar.e) && this.f.equals(ahkmVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.f;
        j$.util.Optional optional2 = this.e;
        defpackage.ahkk ahkkVar = this.d;
        defpackage.albh albhVar = this.c;
        return "DataStoreConfig{name=" + this.a + ", migrations=" + java.lang.String.valueOf(this.b) + ", schema=" + java.lang.String.valueOf(albhVar) + ", storage=" + java.lang.String.valueOf(ahkkVar) + ", corruptionHandler=" + java.lang.String.valueOf(optional2) + ", nameSuffix=" + java.lang.String.valueOf(optional) + ", enableTracing=false}";
    }

    public ahkm() {
        throw null;
    }
}
