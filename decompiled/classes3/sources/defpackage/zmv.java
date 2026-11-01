package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmv {
    public final defpackage.zmw a;
    public final j$.util.Optional b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;

    public zmv(defpackage.zmw zmwVar, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3) {
        this.a = zmwVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zmv) {
            defpackage.zmv zmvVar = (defpackage.zmv) obj;
            if (this.a.equals(zmvVar.a) && this.b.equals(zmvVar.b) && this.c.equals(zmvVar.c) && this.d.equals(zmvVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.d;
        j$.util.Optional optional2 = this.c;
        j$.util.Optional optional3 = this.b;
        return "CallAudioDevice{audioRoute=" + java.lang.String.valueOf(this.a) + ", bluetoothDevice=" + java.lang.String.valueOf(optional3) + ", name=" + java.lang.String.valueOf(optional2) + ", selected=" + java.lang.String.valueOf(optional) + '}';
    }

    public zmv() {
        throw null;
    }
}
