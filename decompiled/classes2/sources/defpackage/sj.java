package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sj extends defpackage.rm {
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final defpackage.si e;
    public final defpackage.se f;
    public final defpackage.sg g;
    public final defpackage.sh h;
    public final java.lang.String i;
    private final defpackage.sf j;
    private final boolean k;
    private java.lang.Integer l;

    public sj(java.lang.String str, int i, int i2, java.lang.String str2, defpackage.si siVar, defpackage.se seVar, defpackage.sg sgVar, defpackage.sh shVar, java.lang.String str3, defpackage.sf sfVar, boolean z) {
        this.a = (java.lang.String) j$.util.Objects.requireNonNull(str);
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = siVar;
        this.f = seVar;
        this.g = sgVar;
        this.h = shVar;
        this.i = (java.lang.String) j$.util.Objects.requireNonNull(str3);
        this.j = sfVar;
        this.k = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sj) {
            defpackage.sj sjVar = (defpackage.sj) obj;
            if (j$.util.Objects.equals(this.a, sjVar.a) && j$.util.Objects.equals(this.i, sjVar.i) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(sjVar.b)) && j$.util.Objects.equals(java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(sjVar.c)) && j$.util.Objects.equals(this.d, sjVar.d) && j$.util.Objects.equals(this.e, sjVar.e) && j$.util.Objects.equals(this.f, sjVar.f) && j$.util.Objects.equals(this.g, sjVar.g) && j$.util.Objects.equals(this.h, sjVar.h) && j$.util.Objects.equals(this.j, sjVar.j) && this.k == sjVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer numValueOf = this.l;
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(j$.util.Objects.hash(new java.lang.Object[]{this.a, this.i, java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.j, java.lang.Boolean.valueOf(this.k)}));
            this.l = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final java.lang.String toString() {
        return "{name: " + this.a + ", description: " + this.i + ", dataType: " + this.b + ", cardinality: " + this.c + ", schemaType: " + this.d + ", stringIndexingConfigParcel: " + this.e + ", documentIndexingConfigParcel: " + this.f + ", integerIndexingConfigParcel: " + this.g + ", joinableConfigParcel: " + this.h + ", embeddingIndexingConfigParcel: " + this.j + ", isScoringEnabled: " + this.k + '}';
    }
}
