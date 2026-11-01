package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qtg {
    public final boolean a;
    public final j$.util.Optional b;
    public final j$.util.Optional c;
    public final defpackage.pux d;
    public final defpackage.pux e;

    public qtg(boolean z, j$.util.Optional optional, j$.util.Optional optional2, defpackage.pux puxVar, defpackage.pux puxVar2) {
        this.a = z;
        this.b = optional;
        this.c = optional2;
        this.d = puxVar;
        this.e = puxVar2;
    }

    public static defpackage.qtg a(defpackage.qqr qqrVar) {
        j$.util.Optional.empty();
        j$.util.Optional.empty();
        j$.util.Optional optional = qqrVar.k;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null cameraOrientation");
        }
        j$.util.Optional optional2 = qqrVar.l;
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null localVideoTransmitDimensions");
        }
        defpackage.pux puxVar = qqrVar.i;
        if (puxVar == null) {
            throw new java.lang.NullPointerException("Null localVideo");
        }
        defpackage.pux puxVar2 = qqrVar.j;
        if (puxVar2 != null) {
            return new defpackage.qtg(qqrVar.d, optional, optional2, puxVar, puxVar2);
        }
        throw new java.lang.NullPointerException("Null remoteVideo");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qtg) {
            defpackage.qtg qtgVar = (defpackage.qtg) obj;
            if (this.a == qtgVar.a && this.b.equals(qtgVar.b) && this.c.equals(qtgVar.c) && this.d.equals(qtgVar.d) && this.e.equals(qtgVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.pux puxVar = this.e;
        defpackage.pux puxVar2 = this.d;
        j$.util.Optional optional = this.c;
        return "VideoSelectorModel{isLocalVideoOnlyMode=" + this.a + ", cameraOrientation=" + java.lang.String.valueOf(this.b) + ", localVideoTransmitDimensions=" + java.lang.String.valueOf(optional) + ", localVideo=" + java.lang.String.valueOf(puxVar2) + ", remoteVideo=" + java.lang.String.valueOf(puxVar) + '}';
    }

    public qtg() {
        throw null;
    }
}
