package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahsy {
    private ahqy a;
    private android.util.SparseArray b;
    private boolean c;
    private float d;
    private boolean e;
    private aify f;
    private byte g;

    public final defpackage.ahsz a() {
        ahqy ahqyVar;
        android.util.SparseArray sparseArray;
        aify aifyVar;
        if (this.g == 7 && (ahqyVar = this.a) != null && (sparseArray = this.b) != null && (aifyVar = this.f) != null) {
            return new defpackage.ahsz(ahqyVar, sparseArray, this.c, this.d, this.e, aifyVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" traceRecord");
        }
        if (this.b == null) {
            sb.append(" spanExtras");
        }
        if ((this.g & 1) == 0) {
            sb.append(" isPartialTrace");
        }
        if ((this.g & 2) == 0) {
            sb.append(" traceSamplingRate");
        }
        if ((this.g & 4) == 0) {
            sb.append(" enableTiktokTraceEmptyCheckFix");
        }
        if (this.f == null) {
            sb.append(" cuiMetadata");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null cuiMetadata");
        }
        this.f = aifyVar;
    }

    public final void c(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 4);
    }

    public final void d(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 1);
    }

    public final void e(android.util.SparseArray sparseArray) {
        if (sparseArray == null) {
            throw new java.lang.NullPointerException("Null spanExtras");
        }
        this.b = sparseArray;
    }

    public final void f(ahqy ahqyVar) {
        if (ahqyVar == null) {
            throw new java.lang.NullPointerException("Null traceRecord");
        }
        this.a = ahqyVar;
    }

    public final void g(float f) {
        this.d = f;
        this.g = (byte) (this.g | 2);
    }
}
