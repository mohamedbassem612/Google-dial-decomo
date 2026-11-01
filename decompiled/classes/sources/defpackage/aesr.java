package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aesr {
    public final defpackage.aenj a;
    public final boolean b;
    private final java.lang.String c;

    public aesr(java.lang.String str, defpackage.aenj aenjVar, boolean z) {
        this.c = str;
        this.a = aenjVar;
        this.b = z;
    }

    static defpackage.aesr a(android.app.Activity activity) {
        return new defpackage.aesr(null, new defpackage.aenj(activity.getClass().getName()), true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public final java.lang.String b() throws ahzr {
        defpackage.aenj aenjVar = this.a;
        if (aenjVar != null) {
            return aenjVar.a;
        }
        java.lang.String str = this.c;
        defpackage.ahvr.bG(str, new java.lang.Object[0]);
        return str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aesr)) {
            return false;
        }
        defpackage.aesr aesrVar = (defpackage.aesr) obj;
        return b().equals(aesrVar.b()) && this.b == aesrVar.b;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) ^ (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "MeasurementKey{rawStringEventName=" + this.c + ", noPiiEventName=" + java.lang.String.valueOf(this.a) + ", isActivity=" + this.b + '}';
    }

    public aesr() {
        throw null;
    }
}
