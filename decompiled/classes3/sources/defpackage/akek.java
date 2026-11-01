package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akek extends java.lang.Number implements java.lang.Comparable {
    private final java.lang.String a;

    public akek(java.lang.String str) {
        this.a = str;
    }

    private final java.math.BigDecimal a() {
        return defpackage.agwm.k(this.a);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is unsupported");
    }

    private java.lang.Object writeReplace() {
        return a();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a.compareTo(((defpackage.akek) obj).a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return java.lang.Double.parseDouble(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akek) {
            return this.a.equals(((defpackage.akek) obj).a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return java.lang.Float.parseFloat(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return java.lang.Integer.parseInt(this.a);
            } catch (java.lang.NumberFormatException unused) {
                return (int) java.lang.Long.parseLong(this.a);
            }
        } catch (java.lang.NumberFormatException unused2) {
            return a().intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return java.lang.Long.parseLong(this.a);
        } catch (java.lang.NumberFormatException unused) {
            return a().longValue();
        }
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
