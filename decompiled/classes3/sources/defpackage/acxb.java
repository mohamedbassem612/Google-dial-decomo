package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxb {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;

    public acxb(long j, int i, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.e = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = 2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acxb) {
            defpackage.acxb acxbVar = (defpackage.acxb) obj;
            if (this.a == acxbVar.a) {
                int i = this.e;
                int i2 = acxbVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b == acxbVar.b && this.c == acxbVar.c && this.d == acxbVar.d) {
                    int i3 = this.f;
                    int i4 = acxbVar.f;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        anty.aJ(i);
        int i2 = this.f;
        anty.aJ(i2);
        int i3 = true != this.b ? 1237 : 1231;
        long j = this.a;
        return ((((((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i3) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ i2;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.f;
        if (i != 1) {
            str = i != 2 ? "null" : "TASK_SCHEDULER_WORK_MANAGER";
        } else {
            str = "TASK_SCHEDULER_UNKNOWN";
        }
        int i2 = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        return "TaskInfo{periodHours=" + this.a + ", networkState=" + agab.cr(i2) + ", requiresBatteryNotLow=" + z3 + ", requiresCharging=" + z2 + ", requiresDeviceIdle=" + z + ", taskScheduler=" + str + '}';
    }

    public acxb() {
        throw null;
    }
}
