package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oad {
    public final android.location.Location a;
    public final j$.util.Optional b;

    public oad(android.location.Location location, j$.util.Optional optional) {
        aooh.f(location, "location");
        aooh.f(optional, "address");
        this.a = location;
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.oad) {
            defpackage.oad oadVar = (defpackage.oad) obj;
            if (aooh.n(this.a, oadVar.a) && aooh.n(this.b, oadVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LocationWithAddress(location=" + this.a + ", address=" + this.b + ')';
    }
}
