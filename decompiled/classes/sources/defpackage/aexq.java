package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexq implements java.lang.Comparable {
    final long a;
    final java.lang.String b;
    public final int c;
    public final long d;
    public final java.lang.Object e;
    private final java.lang.RuntimeException f;

    public aexq(long j, java.lang.String str, int i, long j2, java.lang.Object obj) {
        if ((j == 0) != (str != null)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = j2;
        this.e = obj;
        java.lang.RuntimeException runtimeException = null;
        if (i == 5) {
            if (obj == null) {
                this.f = new java.lang.NullPointerException("Null stringOrBytes");
                return;
            } else if (!(obj instanceof byte[]) && !(obj instanceof defpackage.akzc)) {
                runtimeException = new java.lang.RuntimeException("Wrong stringOrBytes type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
            }
        }
        this.f = runtimeException;
    }

    public final java.lang.Object a() {
        if (this.c != 5) {
            throw new java.lang.IllegalStateException();
        }
        java.lang.Object obj = this.e;
        obj.getClass();
        return obj;
    }

    public final java.lang.Object b() {
        int i = this.c;
        if (i == 0) {
            return java.lang.Boolean.FALSE;
        }
        if (i == 1) {
            return java.lang.Boolean.TRUE;
        }
        if (i == 2) {
            return java.lang.Long.valueOf(this.d);
        }
        if (i == 3) {
            return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(this.d));
        }
        if (i == 4) {
            java.lang.Object obj = this.e;
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new java.lang.AssertionError("Impossible, this was validated when parsed or created");
        }
        java.lang.Object obj2 = this.e;
        obj2.getClass();
        try {
            return obj2 instanceof byte[] ? (byte[]) obj2 : ((defpackage.akzc) obj2).D();
        } catch (java.lang.Throwable th) {
            java.lang.RuntimeException runtimeException = this.f;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    public final java.lang.String c() {
        java.lang.String str = this.b;
        return str == null ? java.lang.Long.toString(this.a) : str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        java.lang.String str;
        defpackage.aexq aexqVar = (defpackage.aexq) obj;
        long j = aexqVar.a;
        long j2 = this.a;
        int iCompare = java.lang.Long.compare(j2, j);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j2 != 0) {
            return 0;
        }
        java.lang.String str2 = this.b;
        if (str2 == null || (str = aexqVar.b) == null) {
            throw null;
        }
        return str2.compareTo(str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aexq) {
            defpackage.aexq aexqVar = (defpackage.aexq) obj;
            if (this.a == aexqVar.a && j$.util.Objects.equals(this.b, aexqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a), this.b});
    }

    public final java.lang.String toString() {
        return c() + ':' + b().toString();
    }
}
