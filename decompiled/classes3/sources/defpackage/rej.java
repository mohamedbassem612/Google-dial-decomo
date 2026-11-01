package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rej {
    public final defpackage.rea a;
    public final j$.util.OptionalInt b;
    public final int c;
    public final j$.util.OptionalInt d;

    public rej(defpackage.rea reaVar, j$.util.OptionalInt optionalInt, int i, j$.util.OptionalInt optionalInt2) {
        this.a = reaVar;
        this.b = optionalInt;
        this.c = i;
        this.d = optionalInt2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rej) {
            defpackage.rej rejVar = (defpackage.rej) obj;
            if (this.a.equals(rejVar.a) && this.b.equals(rejVar.b) && this.c == rejVar.c && this.d.equals(rejVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.OptionalInt optionalInt = this.d;
        j$.util.OptionalInt optionalInt2 = this.b;
        return "ActivationChip{featureControllerKey=" + java.lang.String.valueOf(this.a) + ", iconRes=" + java.lang.String.valueOf(optionalInt2) + ", primaryTextRes=" + this.c + ", secondaryTextRes=" + java.lang.String.valueOf(optionalInt) + '}';
    }

    public rej() {
        throw null;
    }
}
