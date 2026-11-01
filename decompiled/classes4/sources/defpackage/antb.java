package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class antb {
    private static final defpackage.anpb a = new defpackage.anta(null, true);

    private antb() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    public static anph a(android.os.Parcel parcel, defpackage.anlw anlwVar) throws anqx {
        int i = parcel.readInt();
        if (i == 0) {
            return new anph();
        }
        java.lang.Object[] objArr = new java.lang.Object[i << 1];
        int i2 = 0;
        int iDataPosition = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = parcel.readInt();
            int i5 = i2 + 4;
            byte[] bArrC = c(parcel, i4, i5);
            int i6 = i5 + i4;
            int i7 = i3 << 1;
            objArr[i7] = bArrC;
            int i8 = parcel.readInt();
            i2 = i6 + 4;
            if (i8 == -1) {
                anrq anrqVar = (anrq) anlwVar.a(defpackage.ansf.i);
                if (!anrqVar.b) {
                    throw new anqx(anqw.f.f("Parcelable metadata values not allowed"), (anph) null);
                }
                int iDataPosition2 = parcel.dataPosition();
                try {
                    android.os.Parcelable parcelable = parcel.readParcelable(defpackage.antb.class.getClassLoader());
                    if (parcelable == null) {
                        throw new anqx(anqw.k.f("Read null parcelable in metadata"), (anph) null);
                    }
                    defpackage.anpb anpbVar = a;
                    java.nio.charset.Charset charset = annu.a;
                    objArr[i7 + 1] = new defpackage.anpe(anpbVar, parcelable);
                    iDataPosition += parcel.dataPosition() - iDataPosition2;
                    int i9 = anrqVar.c;
                    if (iDataPosition > 32768) {
                        throw new anqx(anqw.h.f("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)"), (anph) null);
                    }
                } catch (android.util.AndroidRuntimeException e) {
                    throw new anqx(anqw.k.e(e).f("Failure reading parcelable in metadata"), (anph) null);
                }
            } else {
                if (i8 < 0) {
                    throw new anqx(anqw.k.f("Unrecognized metadata sentinel"), (anph) null);
                }
                byte[] bArrC2 = c(parcel, i8, i2);
                i2 += i8;
                objArr[i7 + 1] = bArrC2;
            }
        }
        java.nio.charset.Charset charset2 = annu.a;
        return new anph(i, objArr);
    }

    public static void b(android.os.Parcel parcel, anph anphVar) {
        int i;
        int length;
        int i2;
        if (anphVar != null) {
            java.nio.charset.Charset charset = annu.a;
            i = anphVar.e;
        } else {
            i = 0;
        }
        if (i == 0) {
            parcel.writeInt(0);
            return;
        }
        java.nio.charset.Charset charset2 = annu.a;
        java.lang.Object[] objArr = new java.lang.Object[anphVar.a()];
        for (int i3 = 0; i3 < anphVar.e; i3++) {
            int i4 = i3 << 1;
            objArr[i4] = anphVar.j(i3);
            int i5 = i4 + 1;
            java.lang.Object objD = anphVar.d(i3);
            if (!(objD instanceof byte[])) {
                objD = ((defpackage.anpe) objD).b();
            }
            objArr[i5] = objD;
        }
        parcel.writeInt(i);
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i6 << 1;
            byte[] bArr = (byte[]) objArr[i7];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            java.lang.Object obj = objArr[i7 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (obj instanceof defpackage.antm) {
                parcel.writeInt(-1);
                ((defpackage.antm) obj).a(parcel);
            } else {
                byte[] bArrB = defpackage.ansm.b();
                try {
                    java.io.InputStream inputStream = (java.io.InputStream) obj;
                    int i8 = 0;
                    while (true) {
                        length = bArrB.length;
                        if (i8 >= length || (i2 = inputStream.read(bArrB, i8, length - i8)) == -1) {
                            break;
                        } else {
                            i8 += i2;
                        }
                    }
                    if (i8 == length) {
                        throw new anqx(anqw.h.f("Metadata value too large"), (anph) null);
                    }
                    parcel.writeInt(i8);
                    if (i8 > 0) {
                        parcel.writeByteArray(bArrB, 0, i8);
                    }
                    defpackage.ansm.a(bArrB);
                } catch (java.lang.Throwable th) {
                    defpackage.ansm.a(bArrB);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    private static byte[] c(android.os.Parcel parcel, int i, int i2) throws anqx {
        if (i2 + i > 8192) {
            throw new anqx(anqw.h.f("Metadata too large"), (anph) null);
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
