package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ase {
    public final long a;
    public final long b;
    public final boolean c = false;

    public ase(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final defpackage.ase a(defpackage.ase aseVar) {
        return new defpackage.ase(mni.bl(this.a, aseVar.a), java.lang.Math.max(this.b, aseVar.b));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ase) {
            defpackage.ase aseVar = (defpackage.ase) obj;
            if (this.a == aseVar.a && this.b == aseVar.b) {
                boolean z = aseVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "MouseWheelScrollDelta(value=" + cpm.c(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
