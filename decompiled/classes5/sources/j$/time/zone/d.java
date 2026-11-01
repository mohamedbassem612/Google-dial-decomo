package j$.time.zone;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class d implements java.io.Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final j$.time.k a;
    public final byte b;
    public final j$.time.DayOfWeek c;
    public final j$.time.j d;
    public final boolean e;
    public final j$.time.zone.c f;
    public final j$.time.ZoneOffset g;
    public final j$.time.ZoneOffset h;
    public final j$.time.ZoneOffset i;

    public d(j$.time.k kVar, int i, j$.time.DayOfWeek dayOfWeek, j$.time.j jVar, boolean z, j$.time.zone.c cVar, j$.time.ZoneOffset zoneOffset, j$.time.ZoneOffset zoneOffset2, j$.time.ZoneOffset zoneOffset3) {
        this.a = kVar;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = jVar;
        this.e = z;
        this.f = cVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static j$.time.zone.d a(java.io.ObjectInput objectInput) throws java.io.IOException {
        int i;
        j$.time.j jVarT;
        j$.time.ZoneOffset zoneOffsetQ;
        int totalSeconds;
        int i2 = objectInput.readInt();
        j$.time.k kVarB = j$.time.k.B(i2 >>> 28);
        int i3 = ((264241152 & i2) >>> 22) - 32;
        int i4 = (3670016 & i2) >>> 19;
        j$.time.DayOfWeek dayOfWeekR = i4 == 0 ? null : j$.time.DayOfWeek.r(i4);
        int i5 = (507904 & i2) >>> 14;
        j$.time.zone.c cVar = j$.time.zone.c.values()[(i2 & 12288) >>> 12];
        int i6 = (i2 & 4080) >>> 4;
        int i7 = (i2 & 12) >>> 2;
        int i8 = i2 & 3;
        if (i5 == 31) {
            long j = objectInput.readInt();
            j$.time.j jVar = j$.time.j.e;
            j$.time.temporal.a.SECOND_OF_DAY.t(j);
            int i9 = (int) (j / 3600);
            i = i5;
            long j2 = j - ((long) (i9 * 3600));
            int i10 = (int) (j2 / 60);
            jVarT = j$.time.j.t(i9, i10, (int) (j2 - ((long) (i10 * 60))), 0);
        } else {
            i = i5;
            int i11 = i % 24;
            j$.time.j jVar2 = j$.time.j.e;
            j$.time.temporal.a.HOUR_OF_DAY.t(i11);
            jVarT = j$.time.j.h[i11];
        }
        j$.time.j jVar3 = jVarT;
        j$.time.ZoneOffset zoneOffsetQ2 = i6 == 255 ? j$.time.ZoneOffset.Q(objectInput.readInt()) : j$.time.ZoneOffset.Q((i6 - 128) * 900);
        if (i7 == 3) {
            zoneOffsetQ = j$.time.ZoneOffset.Q(objectInput.readInt());
        } else {
            zoneOffsetQ = j$.time.ZoneOffset.Q((i7 * 1800) + zoneOffsetQ2.getTotalSeconds());
        }
        j$.time.ZoneOffset zoneOffset = zoneOffsetQ;
        if (i8 == 3) {
            totalSeconds = objectInput.readInt();
        } else {
            totalSeconds = (i8 * 1800) + zoneOffsetQ2.getTotalSeconds();
        }
        j$.time.ZoneOffset zoneOffsetQ3 = j$.time.ZoneOffset.Q(totalSeconds);
        boolean z = i == 24;
        j$.util.Objects.requireNonNull(kVarB, "month");
        j$.util.Objects.requireNonNull(jVar3, "time");
        j$.util.Objects.requireNonNull(cVar, "timeDefnition");
        j$.util.Objects.requireNonNull(zoneOffsetQ2, "standardOffset");
        j$.util.Objects.requireNonNull(zoneOffset, "offsetBefore");
        j$.util.Objects.requireNonNull(zoneOffsetQ3, "offsetAfter");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            j$.time.g.b("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        } else if (z && !jVar3.equals(j$.time.j.g)) {
            j$.time.g.b("Time must be midnight when end of day flag is true");
        } else {
            if (jVar3.d == 0) {
                return new j$.time.zone.d(kVarB, i3, dayOfWeekR, jVar3, z, cVar, zoneOffsetQ2, zoneOffset, zoneOffsetQ3);
            }
            j$.time.g.b("Time's nano-of-second must be zero");
        }
        return null;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.zone.a((byte) 3, this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j$.time.zone.d) {
            j$.time.zone.d dVar = (j$.time.zone.d) obj;
            if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f == dVar.f && this.d.equals(dVar.d) && this.e == dVar.e && this.g.equals(dVar.g) && this.h.equals(dVar.h) && this.i.equals(dVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iU = ((this.d.U() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        j$.time.DayOfWeek dayOfWeek = this.c;
        return (((this.f.ordinal() + (iU + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2))) ^ this.g.b) ^ this.h.b) ^ this.i.b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionRule[");
        j$.time.ZoneOffset zoneOffset = this.i;
        int i = zoneOffset.b;
        j$.time.ZoneOffset zoneOffset2 = this.h;
        sb.append(i - zoneOffset2.b > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset2);
        sb.append(" to ");
        sb.append(zoneOffset);
        sb.append(", ");
        j$.time.k kVar = this.a;
        byte b = this.b;
        j$.time.DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            sb.append(kVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(kVar.name());
        } else if (b < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(kVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(kVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b;
        j$.time.j jVar = this.d;
        boolean z = this.e;
        int iU = z ? 86400 : jVar.U();
        int totalSeconds = this.g.getTotalSeconds();
        j$.time.ZoneOffset zoneOffset = this.h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        j$.time.ZoneOffset zoneOffset2 = this.i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        if (iU % 3600 == 0) {
            b = z ? (byte) 24 : jVar.a;
        } else {
            b = 31;
        }
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        j$.time.DayOfWeek dayOfWeek = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            objectOutput.writeInt(iU);
        }
        if (i == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }
}
