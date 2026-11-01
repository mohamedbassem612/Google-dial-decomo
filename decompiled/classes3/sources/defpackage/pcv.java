package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pcv extends defpackage.pcz {
    private final defpackage.zmv a;

    public pcv(defpackage.zmv zmvVar) {
        this.a = zmvVar;
    }

    @Override // defpackage.pcz
    public final defpackage.zmv a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pcz) {
            defpackage.pcz pczVar = (defpackage.pcz) obj;
            defpackage.zmv zmvVar = this.a;
            if (zmvVar != null) {
                return zmvVar.equals(pczVar.a());
            }
            if (pczVar.a() == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.zmv zmvVar = this.a;
        return (zmvVar == null ? 0 : zmvVar.hashCode()) ^ 1000003;
    }

    public final java.lang.String toString() {
        return "AudioDeviceSelected{audioDevice=" + java.lang.String.valueOf(this.a) + '}';
    }
}
