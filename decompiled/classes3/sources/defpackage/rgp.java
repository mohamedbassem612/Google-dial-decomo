package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgp {
    public final defpackage.rea a;
    public final defpackage.rgn b;
    public final defpackage.rgt c;
    public final j$.util.OptionalInt d;
    public final j$.util.Optional e;
    public final int f;
    public final int g;

    public rgp(int i, defpackage.rea reaVar, defpackage.rgn rgnVar, defpackage.rgt rgtVar, j$.util.OptionalInt optionalInt, int i2, j$.util.Optional optional) {
        this.g = i;
        this.a = reaVar;
        this.b = rgnVar;
        this.c = rgtVar;
        this.d = optionalInt;
        this.f = i2;
        this.e = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rgp) {
            defpackage.rgp rgpVar = (defpackage.rgp) obj;
            int i = this.g;
            int i2 = rgpVar.g;
            if (i == 0) {
                throw null;
            }
            if (i == i2 && this.a.equals(rgpVar.a) && this.b.equals(rgpVar.b) && this.c.equals(rgpVar.c) && this.d.equals(rgpVar.d)) {
                int i3 = this.f;
                int i4 = rgpVar.f;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4 && this.e.equals(rgpVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        a.aY(i);
        int iHashCode = ((((((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        int i2 = this.f;
        anty.aJ(i2);
        return (((iHashCode * 1000003) ^ i2) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        int i = this.g;
        java.lang.String string = i != 0 ? java.lang.Integer.toString(i - 1) : "null";
        defpackage.rea reaVar = this.a;
        defpackage.rgn rgnVar = this.b;
        defpackage.rgt rgtVar = this.c;
        j$.util.OptionalInt optionalInt = this.d;
        int i2 = this.f;
        j$.util.Optional optional = this.e;
        return "PrimaryFeatureModel{priority=" + string + ", featureControllerKey=" + java.lang.String.valueOf(reaVar) + ", assistantLogoState=" + java.lang.String.valueOf(rgnVar) + ", titleModel=" + java.lang.String.valueOf(rgtVar) + ", bodyTextRes=" + java.lang.String.valueOf(optionalInt) + ", returnToCallButtonStyle=" + pez.bn(i2) + ", transcriptSnippet=" + java.lang.String.valueOf(optional) + '}';
    }

    public rgp() {
        throw null;
    }
}
