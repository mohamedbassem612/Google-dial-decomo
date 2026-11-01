package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hrw {
    public final j$.util.Optional a;
    public final j$.util.Optional b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;

    public hrw(j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.hrw) {
            defpackage.hrw hrwVar = (defpackage.hrw) obj;
            if (this.a.equals(hrwVar.a) && this.b.equals(hrwVar.b) && this.c.equals(hrwVar.c) && this.d.equals(hrwVar.d)) {
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
        return "Callbacks{onStartCallback=" + java.lang.String.valueOf(this.a) + ", onEndCallback=" + java.lang.String.valueOf(optional3) + ", onCancelCallback=" + java.lang.String.valueOf(optional2) + ", onRepeatCallback=" + java.lang.String.valueOf(optional) + '}';
    }

    public hrw() {
        throw null;
    }
}
