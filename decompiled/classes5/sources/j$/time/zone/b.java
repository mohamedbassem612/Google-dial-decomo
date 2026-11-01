package j$.time.zone;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b implements java.lang.Comparable, java.io.Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    public final long a;
    public final j$.time.LocalDateTime b;
    public final j$.time.ZoneOffset c;
    public final j$.time.ZoneOffset d;

    public b(long j, j$.time.ZoneOffset zoneOffset, j$.time.ZoneOffset zoneOffset2) {
        this.a = j;
        this.b = j$.time.LocalDateTime.C(j, 0, zoneOffset);
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.zone.a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return java.lang.Long.compare(this.a, ((j$.time.zone.b) obj).a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j$.time.zone.b) {
            j$.time.zone.b bVar = (j$.time.zone.b) obj;
            if (this.a == bVar.a && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.d.getTotalSeconds() > this.c.getTotalSeconds();
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ this.c.b) ^ java.lang.Integer.rotateLeft(this.d.b, 16);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transition[");
        sb.append(h() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }

    public b(j$.time.LocalDateTime localDateTime, j$.time.ZoneOffset zoneOffset, j$.time.ZoneOffset zoneOffset2) {
        this.a = localDateTime.toEpochSecond(zoneOffset);
        this.b = localDateTime;
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }
}
