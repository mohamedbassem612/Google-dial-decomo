package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adzv {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public adzv(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adzv) {
            defpackage.adzv adzvVar = (defpackage.adzv) obj;
            if (this.a == adzvVar.a && this.b == adzvVar.b && this.c == adzvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((defpackage.anty.L(this.a) * 31) + defpackage.anty.L(this.b)) * 31) + defpackage.anty.L(this.c);
    }

    public final java.lang.String toString() {
        return "DeliveryAddressCreationConfig(withRegistrationId=" + this.a + ", withFetchOnlyId=" + this.b + ", withAndroidId=" + this.c + ')';
    }

    public adzv() {
        this(false, false, false);
    }
}
