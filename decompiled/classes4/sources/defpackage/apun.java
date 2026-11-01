package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apun {
    private final java.lang.Object a;

    public apun(float f) {
        this.a = java.lang.Float.valueOf(f);
    }

    private final void c(int i) {
        int i2;
        java.lang.Object obj = this.a;
        if (obj instanceof java.lang.Boolean) {
            i2 = 0;
        } else if (obj instanceof java.lang.Long) {
            i2 = 1;
        } else if (obj instanceof java.lang.Float) {
            i2 = 2;
        } else if (obj instanceof java.lang.String) {
            i2 = 3;
        } else {
            if (!(obj instanceof defpackage.apxo)) {
                throw new java.lang.IllegalStateException("Unexpected flag value type: ".concat(java.lang.String.valueOf(obj.getClass().getName())));
            }
            i2 = 4;
        }
        if (i != i2) {
            throw new java.lang.IllegalStateException(a.bf(i2, i, "Attempted to access flag value as ", ", but actual type is "));
        }
    }

    public final java.lang.String a() {
        c(3);
        return (java.lang.String) this.a;
    }

    public final boolean b() {
        c(0);
        return ((java.lang.Boolean) this.a).booleanValue();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public apun(java.lang.Object obj) {
        this.a = obj;
    }

    public apun(boolean z) {
        this.a = java.lang.Boolean.valueOf(z);
    }

    public apun(long j) {
        this.a = java.lang.Long.valueOf(j);
    }
}
