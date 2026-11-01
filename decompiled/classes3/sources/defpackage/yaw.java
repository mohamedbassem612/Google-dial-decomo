package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yaw implements defpackage.xug {
    static final byte[] a = "Exif\u0000\u0000".getBytes(java.nio.charset.Charset.forName("UTF-8"));
    static final byte[] b = "MPF".getBytes(java.nio.charset.Charset.forName("UTF-8"));
    private static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static boolean g(int i) {
        return i == 1751476579 || i == 1751476600 || i == 1751479907 || i == 1751479928 || i == 1835623985 || i == 1836279345;
    }

    private static final com.bumptech.glide.load.ImageHeaderParser$ImageType h(defpackage.yau yauVar) {
        try {
            int iA = yauVar.a();
            if (iA == 65496) {
                return com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iA << 8) | yauVar.d();
            if (iD == 4671814) {
                return com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | yauVar.d();
            if (iD2 == -1991225785) {
                yauVar.c(21L);
                try {
                    return yauVar.d() >= 3 ? com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A : com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG;
                } catch (defpackage.yat unused) {
                    return com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                yauVar.c(4L);
                if (((yauVar.a() << 16) | yauVar.a()) != 1464156752) {
                    return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iA2 = (yauVar.a() << 16) | yauVar.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP;
                    }
                    yauVar.c(4L);
                    return (yauVar.d() & 8) != 0 ? com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A : com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP;
                }
                yauVar.c(4L);
                short sD = yauVar.d();
                if ((sD & 2) != 0) {
                    return com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sD & 16) != 0 ? com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A : com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP;
            }
            if (((yauVar.a() << 16) | yauVar.a()) != 1718909296) {
                return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iA3 = (yauVar.a() << 16) | yauVar.a();
            if (iA3 == 1635150195) {
                return com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            boolean z = iA3 == 1635150182;
            boolean zG = g(iA3);
            yauVar.c(4L);
            int i2 = iD2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int iA4 = (yauVar.a() << 16) | yauVar.a();
                    if (iA4 == 1635150195) {
                        return com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z = true;
                    } else if (g(iA4)) {
                        zG = true;
                    }
                    i2 -= 4;
                }
            }
            if (z) {
                return com.bumptech.glide.load.ImageHeaderParser$ImageType.AVIF;
            }
            return zG ? com.bumptech.glide.load.ImageHeaderParser$ImageType.HEIF : com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
        } catch (defpackage.yat unused2) {
            return com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    private static final boolean i(byte[] bArr, int i, byte[] bArr2) {
        boolean z = bArr2 != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
        }
        return z;
    }

    private static final int j(defpackage.yau yauVar, int i) {
        short sD;
        int iA;
        long j;
        long jC;
        do {
            short sD2 = yauVar.d();
            if (sD2 != 255) {
                if (!android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                android.util.Log.d("DfltImageHeaderParser", a.bj(sD2, "Unknown segmentId="));
                return -1;
            }
            sD = yauVar.d();
            if (sD == 218) {
                return -1;
            }
            if (sD == 217) {
                if (!android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                android.util.Log.d("DfltImageHeaderParser", a.bs(i, "Found MARKER_EOI in ", " segment"));
                return -1;
            }
            iA = yauVar.a() - 2;
            if (sD == i) {
                return iA;
            }
            j = iA;
            jC = yauVar.c(j);
        } while (jC == j);
        if (!android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
            return -1;
        }
        android.util.Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sD) + ", wanted to skip: " + iA + ", but actually skipped: " + jC);
        return -1;
    }

    private static final int k(defpackage.yau yauVar, defpackage.xxt xxtVar) {
        java.nio.ByteOrder byteOrder;
        short sT;
        try {
            int iA = yauVar.a();
            if ((iA & 65496) != 65496 && iA != 19789 && iA != 18761) {
                if (!android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                android.util.Log.d("DfltImageHeaderParser", a.bj(iA, "Parser doesn't handle magic number: "));
                return -1;
            }
            int iJ = j(yauVar, 225);
            if (iJ == -1) {
                if (!android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                android.util.Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                return -1;
            }
            byte[] bArr = (byte[]) xxtVar.a(iJ, byte[].class);
            try {
                int iB = yauVar.b(bArr, iJ);
                if (iB != iJ) {
                    if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                        android.util.Log.d("DfltImageHeaderParser", a.bf(iB, iJ, "Unable to read exif segment data, length: ", ", actually read: "));
                    }
                } else if (i(bArr, iJ, a)) {
                    java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.BIG_ENDIAN).limit(iJ);
                    short sT2 = defpackage.xff.t(6, byteBuffer);
                    if (sT2 != 18761) {
                        if (sT2 != 19789 && android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                            android.util.Log.d("DfltImageHeaderParser", a.bj(sT2, "Unknown endianness = "));
                        }
                        byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
                    } else {
                        byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
                    }
                    byteBuffer.order(byteOrder);
                    int iS = defpackage.xff.s(10, byteBuffer);
                    short sT3 = defpackage.xff.t(iS + 6, byteBuffer);
                    for (int i = 0; i < sT3; i++) {
                        int i2 = iS + 8 + (i * 12);
                        if (defpackage.xff.t(i2, byteBuffer) == 274) {
                            short sT4 = defpackage.xff.t(i2 + 2, byteBuffer);
                            if (sT4 > 0 && sT4 <= 12) {
                                int iS2 = defpackage.xff.s(i2 + 4, byteBuffer);
                                if (iS2 >= 0) {
                                    if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        android.util.Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=274 formatCode=" + ((int) sT4) + " componentCount=" + iS2);
                                    }
                                    int i3 = iS2 + c[sT4];
                                    if (i3 <= 4) {
                                        int i4 = i2 + 8;
                                        if (i4 >= 0 && i4 <= byteBuffer.remaining()) {
                                            if (i3 >= 0 && i3 + i4 <= byteBuffer.remaining()) {
                                                sT = defpackage.xff.t(i4, byteBuffer);
                                                xxtVar.c(bArr);
                                                return sT;
                                            }
                                            if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                                                android.util.Log.d("DfltImageHeaderParser", a.bj(274, "Illegal number of bytes for TI tag data tagType="));
                                            }
                                        } else if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            android.util.Log.d("DfltImageHeaderParser", a.bf(274, i4, "Illegal tagValueOffset=", " tagType="));
                                        }
                                    } else if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        android.util.Log.d("DfltImageHeaderParser", a.bj(sT4, "Got byte count > 4, not orientation, continuing, formatCode="));
                                    }
                                } else if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    android.util.Log.d("DfltImageHeaderParser", "Negative tiff component count");
                                }
                            } else if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                                android.util.Log.d("DfltImageHeaderParser", a.bj(sT4, "Got invalid format code = "));
                            }
                        }
                    }
                } else if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                    android.util.Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                }
                sT = -1;
                xxtVar.c(bArr);
                return sT;
            } catch (java.lang.Throwable th) {
                xxtVar.c(bArr);
                throw th;
            }
        } catch (defpackage.yat unused) {
            return -1;
        }
    }

    private static final boolean l(defpackage.yau yauVar, defpackage.xxt xxtVar) {
        if (h(yauVar) == com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG) {
            int iJ = j(yauVar, 226);
            while (iJ > 0) {
                byte[] bArr = (byte[]) xxtVar.a(iJ, byte[].class);
                try {
                    int iB = yauVar.b(bArr, iJ);
                    if (iB != iJ) {
                        if (android.util.Log.isLoggable("DfltImageHeaderParser", 3)) {
                            android.util.Log.d("DfltImageHeaderParser", a.bf(iB, iJ, "Unable to read APP2 segment data, length: ", ", actually read: "));
                        }
                    } else if (i(bArr, iJ, b)) {
                        xxtVar.c(bArr);
                        return true;
                    }
                    xxtVar.c(bArr);
                    iJ = j(yauVar, 226);
                } catch (java.lang.Throwable th) {
                    xxtVar.c(bArr);
                    throw th;
                }
            }
            if (android.util.Log.isLoggable("DfltImageHeaderParser", 2)) {
                android.util.Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
            }
        }
        return false;
    }

    @Override // defpackage.xug
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType a(java.io.InputStream inputStream) {
        return h(new defpackage.yav(inputStream, 0));
    }

    @Override // defpackage.xug
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType b(java.nio.ByteBuffer byteBuffer) {
        return h(new defpackage.yav(byteBuffer, 1));
    }

    @Override // defpackage.xug
    public final int c(java.io.InputStream inputStream, defpackage.xxt xxtVar) {
        defpackage.yav yavVar = new defpackage.yav(inputStream, 0);
        anty.aI(xxtVar, "Argument must not be null");
        return k(yavVar, xxtVar);
    }

    @Override // defpackage.xug
    public final int d(java.nio.ByteBuffer byteBuffer, defpackage.xxt xxtVar) {
        return k(new defpackage.yav(byteBuffer, 1), xxtVar);
    }

    @Override // defpackage.xug
    public final boolean e(java.io.InputStream inputStream, defpackage.xxt xxtVar) {
        return l(new defpackage.yav(inputStream, 0), xxtVar);
    }

    @Override // defpackage.xug
    public final boolean f(java.nio.ByteBuffer byteBuffer, defpackage.xxt xxtVar) {
        return l(new defpackage.yav(byteBuffer, 1), xxtVar);
    }
}
