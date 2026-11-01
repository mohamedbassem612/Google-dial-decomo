package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ync {
    public final defpackage.ypf a;
    public final boolean b;

    public ync(defpackage.ypf ypfVar, boolean z) {
        this.a = ypfVar;
        this.b = z;
    }

    public static defpackage.ync a(defpackage.ymd ymdVar) {
        if (!(ymdVar instanceof defpackage.yna)) {
            return new defpackage.ync(new defpackage.ypf(ahwr.a), false);
        }
        defpackage.yna ynaVar = (defpackage.yna) ymdVar;
        return new defpackage.ync(new defpackage.ypf(ynaVar.g), ynaVar.m());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ync) {
            defpackage.ync yncVar = (defpackage.ync) obj;
            if (this.a.equals(yncVar.a) && this.b == yncVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "ApiCallContext{startTime=" + this.a.toString() + ", isServiceOriginallyBound=" + this.b + '}';
    }

    public ync() {
        throw null;
    }
}
