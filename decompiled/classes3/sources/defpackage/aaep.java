package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaep {
    public final aadx a;
    public final com.google.android.gms.common.Feature b;

    public aaep(aadx aadxVar, com.google.android.gms.common.Feature feature) {
        this.a = aadxVar;
        this.b = feature;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aaep)) {
            return false;
        }
        defpackage.aaep aaepVar = (defpackage.aaep) obj;
        return j$.util.Objects.equals(this.a, aaepVar.a) && j$.util.Objects.equals(this.b, aaepVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aehj.bX("key", this.a, arrayList);
        aehj.bX("feature", this.b, arrayList);
        return aehj.bW(arrayList, this);
    }
}
