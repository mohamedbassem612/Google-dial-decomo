package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a extends j$.time.b implements java.io.Serializable {
    public static final j$.time.a c;
    private static final long serialVersionUID = 6740630888130243051L;
    public final j$.time.ZoneId b;

    static {
        java.lang.System.currentTimeMillis();
        c = new j$.time.a(j$.time.ZoneOffset.UTC);
    }

    public a(j$.time.ZoneId zoneId) {
        this.b = zoneId;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof j$.time.a)) {
            return false;
        }
        return this.b.equals(((j$.time.a) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() + 1;
    }

    public final java.lang.String toString() {
        return j$.desugar.sun.nio.fs.h.a("SystemClock[", java.lang.String.valueOf(this.b), "]");
    }
}
