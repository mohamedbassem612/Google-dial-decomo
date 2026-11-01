package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class wn {
    public int a;
    public java.lang.Object b;
    public java.lang.Object c = j$.util.Optional.empty();

    public wn() {
    }

    public final defpackage.amdq a() {
        java.lang.Object obj;
        int i = this.a;
        if (i != 0 && (obj = this.b) != null) {
            return new defpackage.amdq((j$.util.Optional) this.c, i, (aify) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == 0) {
            sb.append(" status");
        }
        if (this.b == null) {
            sb.append(" singleLayerResults");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null selectedCorrection");
        }
        this.c = optional;
    }

    public final void c(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null singleLayerResults");
        }
        this.b = aifyVar;
    }

    public final void d(int i) {
        if (i == 0) {
            throw new java.lang.NullPointerException("Null status");
        }
        this.a = i;
    }

    public final defpackage.amea e() {
        int i;
        java.lang.Object obj = this.b;
        if (obj != null && (i = this.a) != 0) {
            return new defpackage.amea((j$.util.Optional) this.c, (aify) obj, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" cacheSegments");
        }
        if (this.a == 0) {
            sb.append(" status");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null cacheSegments");
        }
        this.b = aifyVar;
    }

    public final void g(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null maybeAmCacheCorrection");
        }
        this.c = optional;
    }

    public wn(byte[] bArr) {
    }
}
