package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adau {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static java.lang.String a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new java.lang.String(cArr);
    }

    public static java.security.MessageDigest b() {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
            if (messageDigest == null) {
                return null;
            }
            return messageDigest;
        } catch (java.security.NoSuchAlgorithmException unused) {
        }
    }

    public static java.lang.String c(aogc aogcVar, android.net.Uri uri) {
        java.lang.String strA;
        try {
            affr affrVar = new affr();
            affrVar.b();
            java.io.InputStream inputStream = (java.io.InputStream) aogcVar.M(uri, affrVar);
            try {
                java.security.MessageDigest messageDigestB = b();
                if (messageDigestB == null) {
                    strA = "";
                } else {
                    byte[] bArr = new byte[8192];
                    for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                        messageDigestB.update(bArr, 0, i);
                    }
                    strA = a(messageDigestB.digest());
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return strA;
            } catch (java.lang.Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            adbe.g(e, "%s: Failed to open file, uri = %s", new java.lang.Object[]{"FileValidator", uri});
            return "";
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: acvh */
    public static void d(aogc aogcVar, defpackage.acvr acvrVar, android.net.Uri uri, java.lang.String str) throws acvh {
        long jK;
        try {
            if (!aogcVar.R(uri)) {
                adbe.e("%s: Downloaded file %s is not present at %s", new java.lang.Object[]{"FileValidator", afsq.ap(acvrVar), uri});
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw ygVarB.d();
            }
            int iAe = a.ae(acvrVar.f);
            if (iAe == 0 || iAe != 2) {
                java.lang.String strC = c(aogcVar, uri);
                if (strC.equals(str)) {
                    return;
                }
                try {
                    jK = aogcVar.K(uri);
                } catch (java.io.IOException unused) {
                    jK = -1;
                }
                adbe.e("%s: Downloaded file at uri = %s, expected checksum = %s, computed checksum = %s, size = %s verification failed", new java.lang.Object[]{"FileValidator", uri, str, strC, java.lang.Long.valueOf(jK)});
                yg ygVarB2 = acvh.b();
                ygVarB2.b = defpackage.acvg.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
                java.lang.String str2 = acvrVar.c;
                if (str2 == null) {
                    throw new java.lang.NullPointerException("Null fileId");
                }
                if (str == null) {
                    throw new java.lang.NullPointerException("Null expectedChecksum");
                }
                ygVarB2.c = new defpackage.acuq(str2, str, strC);
                throw ygVarB2.d();
            }
        } catch (java.io.IOException e) {
            adbe.g(e, "%s: Failed to validate download file %s", new java.lang.Object[]{"FileValidator", afsq.ap(acvrVar)});
            yg ygVarB3 = acvh.b();
            ygVarB3.b = defpackage.acvg.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            ygVarB3.c = e;
            throw ygVarB3.d();
        }
    }

    public static boolean e(aogc aogcVar, android.net.Uri uri, java.lang.String str) {
        return c(aogcVar, uri).equals(str);
    }
}
