package j$.time;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class r implements java.io.Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public java.lang.Object b;

    public r(byte b, java.lang.Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static java.io.Serializable a(byte b, java.io.ObjectInput objectInput) throws java.io.IOException {
        java.io.Serializable pVar;
        switch (b) {
            case 1:
                j$.time.Duration duration = j$.time.Duration.ZERO;
                return j$.time.Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                j$.time.Instant instant = j$.time.Instant.EPOCH;
                return j$.time.Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                j$.time.LocalDate localDate = j$.time.LocalDate.d;
                return j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j$.time.j.S(objectInput);
            case 5:
                j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.c;
                j$.time.LocalDate localDate2 = j$.time.LocalDate.d;
                return j$.time.LocalDateTime.B(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.j.S(objectInput));
            case 6:
                j$.time.LocalDateTime localDateTime2 = j$.time.LocalDateTime.c;
                j$.time.LocalDate localDate3 = j$.time.LocalDate.d;
                j$.time.LocalDateTime localDateTimeB = j$.time.LocalDateTime.B(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.j.S(objectInput));
                j$.time.ZoneOffset zoneOffsetS = j$.time.ZoneOffset.S(objectInput);
                j$.time.ZoneId zoneId = (j$.time.ZoneId) a(objectInput.readByte(), objectInput);
                j$.util.Objects.requireNonNull(localDateTimeB, "localDateTime");
                j$.util.Objects.requireNonNull(zoneOffsetS, "offset");
                j$.util.Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof j$.time.ZoneOffset) || zoneOffsetS.equals(zoneId)) {
                    return new j$.time.ZonedDateTime(localDateTimeB, zoneId, zoneOffsetS);
                }
                j$.time.g.b("ZoneId must match ZoneOffset");
                return null;
            case 7:
                int i = j$.time.w.d;
                return j$.time.ZoneId.z(objectInput.readUTF(), false);
            case 8:
                return j$.time.ZoneOffset.S(objectInput);
            case 9:
                int i2 = j$.time.p.c;
                pVar = new j$.time.p(j$.time.j.S(objectInput), j$.time.ZoneOffset.S(objectInput));
                break;
            case 10:
                int i3 = j$.time.OffsetDateTime.c;
                j$.time.LocalDate localDate4 = j$.time.LocalDate.d;
                pVar = new j$.time.OffsetDateTime(j$.time.LocalDateTime.B(j$.time.LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.j.S(objectInput)), j$.time.ZoneOffset.S(objectInput));
                break;
            case 11:
                int i4 = j$.time.t.b;
                return j$.time.t.r(objectInput.readInt());
            case 12:
                int i5 = j$.time.v.c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                j$.time.temporal.a.YEAR.t(i6);
                j$.time.temporal.a.MONTH_OF_YEAR.t(b2);
                pVar = new j$.time.v(i6, b2);
                break;
            case 13:
                int i7 = j$.time.m.c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                j$.time.k kVarB = j$.time.k.B(b3);
                j$.util.Objects.requireNonNull(kVarB, "month");
                j$.time.temporal.a.DAY_OF_MONTH.t(b4);
                if (b4 > kVarB.z()) {
                    throw new j$.time.DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + kVarB.name());
                }
                pVar = new j$.time.m(kVarB.getValue(), b4);
                break;
                break;
            case 14:
                j$.time.q qVar = j$.time.q.d;
                return j$.time.q.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new java.io.StreamCorruptedException("Unknown serialized type");
        }
        return pVar;
    }

    private java.lang.Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = a(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b = this.a;
        java.lang.Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                j$.time.Duration duration = (j$.time.Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                j$.time.Instant instant = (j$.time.Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                j$.time.LocalDate localDate = (j$.time.LocalDate) obj;
                objectOutput.writeInt(localDate.a);
                objectOutput.writeByte(localDate.b);
                objectOutput.writeByte(localDate.c);
                return;
            case 4:
                ((j$.time.j) obj).Y(objectOutput);
                return;
            case 5:
                j$.time.LocalDateTime localDateTime = (j$.time.LocalDateTime) obj;
                j$.time.LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.Y(objectOutput);
                return;
            case 6:
                j$.time.ZonedDateTime zonedDateTime = (j$.time.ZonedDateTime) obj;
                j$.time.LocalDateTime localDateTime2 = zonedDateTime.a;
                j$.time.LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.Y(objectOutput);
                zonedDateTime.b.T(objectOutput);
                zonedDateTime.c.L(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((j$.time.w) obj).b);
                return;
            case 8:
                ((j$.time.ZoneOffset) obj).T(objectOutput);
                return;
            case 9:
                j$.time.p pVar = (j$.time.p) obj;
                pVar.a.Y(objectOutput);
                pVar.b.T(objectOutput);
                return;
            case 10:
                j$.time.OffsetDateTime offsetDateTime = (j$.time.OffsetDateTime) obj;
                j$.time.LocalDateTime localDateTime3 = offsetDateTime.a;
                j$.time.LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.Y(objectOutput);
                offsetDateTime.b.T(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((j$.time.t) obj).a);
                return;
            case 12:
                j$.time.v vVar = (j$.time.v) obj;
                objectOutput.writeInt(vVar.a);
                objectOutput.writeByte(vVar.b);
                return;
            case 13:
                j$.time.m mVar = (j$.time.m) obj;
                objectOutput.writeByte(mVar.a);
                objectOutput.writeByte(mVar.b);
                return;
            case 14:
                j$.time.q qVar = (j$.time.q) obj;
                objectOutput.writeInt(qVar.a);
                objectOutput.writeInt(qVar.b);
                objectOutput.writeInt(qVar.c);
                return;
            default:
                throw new java.io.InvalidClassException("Unknown serialized type");
        }
    }

    public r() {
    }
}
