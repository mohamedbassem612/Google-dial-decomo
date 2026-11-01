package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pu extends defpackage.rm {
    public final float[] a;
    public final java.lang.String b;
    private java.lang.Integer c;

    public pu(float[] fArr, java.lang.String str) {
        dzk.x(fArr);
        dzk.x(str);
        if (fArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Embedding values cannot be empty.");
        }
        this.a = fArr;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.pu)) {
            defpackage.pu puVar = (defpackage.pu) obj;
            if (java.util.Arrays.equals(this.a, puVar.a) && this.b.equals(puVar.b) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer numValueOf = this.c;
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.a)), this.b, null}));
            this.c = numValueOf;
        }
        return numValueOf.intValue();
    }
}
