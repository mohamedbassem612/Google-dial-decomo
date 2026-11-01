package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class btv implements azz {
    private final defpackage.btt a;

    public btv(defpackage.btt bttVar) {
        this.a = bttVar;
    }

    public final int a(dpf dpfVar) {
        return 0;
    }

    public final int b(dpf dpfVar, dpq dpqVar) {
        return 0;
    }

    public final int c(dpf dpfVar, dpq dpqVar) {
        return 0;
    }

    public final int d(dpf dpfVar) {
        float fC = this.a.d.c();
        if (java.lang.Float.isNaN(fC)) {
            return 0;
        }
        return aooc.t((int) fC, 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.btv) {
            return aooh.n(this.a, ((defpackage.btv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
