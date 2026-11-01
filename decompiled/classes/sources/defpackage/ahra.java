package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahra {
    public final java.lang.String a;
    public final java.util.UUID b;
    public final defpackage.ahqy c;
    public final android.util.SparseArray d;
    public final int e;

    public ahra(java.lang.String str, java.util.UUID uuid, defpackage.ahqy ahqyVar, android.util.SparseArray sparseArray, int i) {
        this.a = str;
        this.b = uuid;
        this.c = ahqyVar;
        this.d = sparseArray;
        this.e = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahra) {
            defpackage.ahra ahraVar = (defpackage.ahra) obj;
            if (this.a.equals(ahraVar.a) && this.b.equals(ahraVar.b) && this.c.equals(ahraVar.c) && this.d.equals(ahraVar.d) && this.e == ahraVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final java.lang.String toString() {
        android.util.SparseArray sparseArray = this.d;
        defpackage.ahqy ahqyVar = this.c;
        return "TraceSnapshot{name=" + this.a + ", rootTraceId=" + java.lang.String.valueOf(this.b) + ", record=" + java.lang.String.valueOf(ahqyVar) + ", spanExtrasSparseArray=" + java.lang.String.valueOf(sparseArray) + ", numUnfinishedSpans=" + this.e + '}';
    }

    public ahra() {
        throw null;
    }
}
