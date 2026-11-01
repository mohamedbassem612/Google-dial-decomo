package j$.time.zone;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a implements java.io.Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public java.io.Serializable b;

    public a(byte b, java.io.Serializable serializable) {
        this.a = b;
        this.b = serializable;
    }

    public static long a(java.io.ObjectInput objectInput) {
        int i = objectInput.readByte() & 255;
        if (i == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }

    public static j$.time.ZoneOffset b(java.io.ObjectInput objectInput) throws java.io.IOException {
        byte b = objectInput.readByte();
        return b == 127 ? j$.time.ZoneOffset.Q(objectInput.readInt()) : j$.time.ZoneOffset.Q(b * 900);
    }

    public static void c(long j, java.io.ObjectOutput objectOutput) throws java.io.IOException {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j);
        } else {
            int i = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & 255);
            objectOutput.writeByte((i >>> 8) & 255);
            objectOutput.writeByte(i & 255);
        }
    }

    public static void d(j$.time.ZoneOffset zoneOffset, java.io.ObjectOutput objectOutput) throws java.io.IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        objectOutput.writeByte(i);
        if (i == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    private java.lang.Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        java.io.Serializable zoneRules;
        java.io.Serializable serializableA;
        byte b = objectInput.readByte();
        this.a = b;
        if (b != 1) {
            if (b == 2) {
                long jA = a(objectInput);
                j$.time.ZoneOffset zoneOffsetB = b(objectInput);
                j$.time.ZoneOffset zoneOffsetB2 = b(objectInput);
                if (zoneOffsetB.equals(zoneOffsetB2)) {
                    j$.time.g.b("Offsets must not be equal");
                    return;
                }
                zoneRules = new j$.time.zone.b(jA, zoneOffsetB, zoneOffsetB2);
            } else if (b == 3) {
                serializableA = j$.time.zone.d.a(objectInput);
            } else {
                if (b != 100) {
                    throw new java.io.StreamCorruptedException("Unknown serialized type");
                }
                serializableA = new j$.time.zone.ZoneRules(java.util.TimeZone.getTimeZone(objectInput.readUTF()));
            }
            this.b = serializableA;
        }
        int i = objectInput.readInt();
        long[] jArr = j$.time.zone.ZoneRules.i;
        long[] jArr2 = i == 0 ? jArr : new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr2[i2] = a(objectInput);
        }
        int i3 = i + 1;
        j$.time.ZoneOffset[] zoneOffsetArr = new j$.time.ZoneOffset[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            zoneOffsetArr[i4] = b(objectInput);
        }
        int i5 = objectInput.readInt();
        if (i5 != 0) {
            jArr = new long[i5];
        }
        long[] jArr3 = jArr;
        for (int i6 = 0; i6 < i5; i6++) {
            jArr3[i6] = a(objectInput);
        }
        int i7 = i5 + 1;
        j$.time.ZoneOffset[] zoneOffsetArr2 = new j$.time.ZoneOffset[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            zoneOffsetArr2[i8] = b(objectInput);
        }
        int i9 = objectInput.readByte();
        j$.time.zone.d[] dVarArr = i9 == 0 ? j$.time.zone.ZoneRules.j : new j$.time.zone.d[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            dVarArr[i10] = j$.time.zone.d.a(objectInput);
        }
        zoneRules = new j$.time.zone.ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, dVarArr);
        serializableA = zoneRules;
        this.b = serializableA;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b = this.a;
        java.io.Serializable serializable = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                j$.time.zone.b bVar = (j$.time.zone.b) serializable;
                c(bVar.a, objectOutput);
                d(bVar.c, objectOutput);
                d(bVar.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((j$.time.zone.d) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new java.io.InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((j$.time.zone.ZoneRules) serializable).g.getID());
                return;
            }
        }
        j$.time.zone.ZoneRules zoneRules = (j$.time.zone.ZoneRules) serializable;
        j$.time.zone.d[] dVarArr = zoneRules.f;
        long[] jArr = zoneRules.c;
        long[] jArr2 = zoneRules.a;
        objectOutput.writeInt(jArr2.length);
        for (long j : jArr2) {
            c(j, objectOutput);
        }
        for (j$.time.ZoneOffset zoneOffset : zoneRules.b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            c(j2, objectOutput);
        }
        for (j$.time.ZoneOffset zoneOffset2 : zoneRules.e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(dVarArr.length);
        for (j$.time.zone.d dVar : dVarArr) {
            dVar.writeExternal(objectOutput);
        }
    }

    public a() {
    }
}
