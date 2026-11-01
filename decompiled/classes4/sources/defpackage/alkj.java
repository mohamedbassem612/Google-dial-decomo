package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alkj {
    public final defpackage.almy a;
    public final akzx b;

    public alkj(akzx akzxVar, defpackage.almy almyVar) {
        if (akzxVar == null) {
            throw new java.lang.NullPointerException("Null flowSignalsEventBuilder");
        }
        this.b = akzxVar;
        if (almyVar == null) {
            throw new java.lang.NullPointerException("Null triggeringExtractionEvent");
        }
        this.a = almyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alkj) {
            defpackage.alkj alkjVar = (defpackage.alkj) obj;
            if (this.b.equals(alkjVar.b) && this.a.equals(alkjVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.almy almyVar = this.a;
        return "FlowSignalData{flowSignalsEventBuilder=" + this.b.toString() + ", triggeringExtractionEvent=" + almyVar.toString() + '}';
    }

    public alkj() {
        throw null;
    }
}
