package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ayn implements azz {
    private final azz a;
    private final int b;

    public ayn(azz azzVar, int i) {
        this.a = azzVar;
        this.b = i;
    }

    public final int a(dpf dpfVar) {
        if ((this.b & 32) != 0) {
            return this.a.a(dpfVar);
        }
        return 0;
    }

    public final int b(dpf dpfVar, dpq dpqVar) {
        if ((this.b & (dpqVar == dpq.a ? 8 : 2)) != 0) {
            return this.a.b(dpfVar, dpqVar);
        }
        return 0;
    }

    public final int c(dpf dpfVar, dpq dpqVar) {
        if ((this.b & (dpqVar == dpq.a ? 4 : 1)) != 0) {
            return this.a.c(dpfVar, dpqVar);
        }
        return 0;
    }

    public final int d(dpf dpfVar) {
        if ((this.b & 16) != 0) {
            return this.a.d(dpfVar);
        }
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ayn) {
            defpackage.ayn aynVar = (defpackage.ayn) obj;
            if (aooh.n(this.a, aynVar.a) && this.b == aynVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.b;
        if ((i & 9) == 9) {
            defpackage.bad.a(sb, "Start");
        }
        if ((i & 10) == 10) {
            defpackage.bad.a(sb, "Left");
        }
        if ((i & 16) == 16) {
            defpackage.bad.a(sb, "Top");
        }
        if ((i & 6) == 6) {
            defpackage.bad.a(sb, "End");
        }
        if ((i & 5) == 5) {
            defpackage.bad.a(sb, "Right");
        }
        if ((i & 32) == 32) {
            defpackage.bad.a(sb, "Bottom");
        }
        return "(" + this.a + " only " + a.bp((byte) 41, sb.toString(), "WindowInsetsSides(") + ')';
    }
}
