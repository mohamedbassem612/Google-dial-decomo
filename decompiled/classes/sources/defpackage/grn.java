package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class grn {
    public static final defpackage.grn a = new defpackage.grn(defpackage.gsi.a);
    public final defpackage.gsi b;
    public final defpackage.gyf c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final long i;
    public final java.util.Set j;

    public grn(defpackage.grn grnVar) {
        if (grnVar == null) {
            defpackage.aooh.i("other");
        }
        this.d = grnVar.d;
        this.e = grnVar.e;
        this.c = grnVar.c;
        this.b = grnVar.b;
        this.f = grnVar.f;
        this.g = grnVar.g;
        this.j = grnVar.j;
        this.h = grnVar.h;
        this.i = grnVar.i;
    }

    public final android.net.NetworkRequest a() {
        return (android.net.NetworkRequest) this.c.b;
    }

    public final boolean b() {
        return !this.j.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && defpackage.aooh.n(getClass(), obj.getClass())) {
            defpackage.grn grnVar = (defpackage.grn) obj;
            if (this.d == grnVar.d && this.e == grnVar.e && this.f == grnVar.f && this.g == grnVar.g && this.h == grnVar.h && this.i == grnVar.i && defpackage.aooh.n(a(), grnVar.a()) && this.b == grnVar.b) {
                return defpackage.aooh.n(this.j, grnVar.j);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.i;
        java.util.Set set = this.j;
        long j2 = this.h;
        int iHashCode2 = ((((((((((((iHashCode + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + set.hashCode();
        android.net.NetworkRequest networkRequestA = a();
        return (iHashCode2 * 31) + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Constraints{requiredNetworkType=" + this.b + ", requiresCharging=" + this.d + ", requiresDeviceIdle=" + this.e + ", requiresBatteryNotLow=" + this.f + ", requiresStorageNotLow=" + this.g + ", contentTriggerUpdateDelayMillis=" + this.h + ", contentTriggerMaxDelayMillis=" + this.i + ", contentUriTriggers=" + this.j + ", }";
    }

    public grn(defpackage.gsi gsiVar) {
        defpackage.aoke aokeVar = defpackage.aoke.a;
        this.c = new defpackage.gyf(null);
        this.b = gsiVar;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = -1L;
        this.i = -1L;
        this.j = aokeVar;
    }

    public grn(defpackage.gyf gyfVar, defpackage.gsi gsiVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, java.util.Set set) {
        if (gyfVar == null) {
            defpackage.aooh.i("requiredNetworkRequestCompat");
        }
        if (gsiVar == null) {
            defpackage.aooh.i("requiredNetworkType");
        }
        if (set == null) {
            defpackage.aooh.i("contentUriTriggers");
        }
        this.c = gyfVar;
        this.b = gsiVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = j2;
        this.j = set;
    }
}
