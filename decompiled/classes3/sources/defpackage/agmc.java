package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agmc {
    public agmc() {
    }

    public static defpackage.agja A(defpackage.agja agjaVar, aonj aonjVar) {
        defpackage.agki agkiVar = new defpackage.agki(agjaVar);
        aonjVar.a(agkiVar);
        return agkiVar.c();
    }

    public static defpackage.agjc B(defpackage.agjc agjcVar, aonj aonjVar) {
        defpackage.agkj agkjVar = new defpackage.agkj(agjcVar);
        aonjVar.a(agkjVar);
        return new defpackage.agjc(agkjVar.a, agkjVar.b, agkjVar.c, agkjVar.d, agkjVar.e, agkjVar.f, agkjVar.g, agkjVar.h, agkjVar.i, agkjVar.j, agkjVar.k, agkjVar.l, agkjVar.m, agkjVar.n, agkjVar.o, agkjVar.p, agkjVar.q, agkjVar.r, agkjVar.s, agkjVar.t);
    }

    public static defpackage.agjm C(defpackage.agjm agjmVar, aonj aonjVar) {
        defpackage.agkm agkmVar = new defpackage.agkm(agjmVar);
        aonjVar.a(agkmVar);
        return new defpackage.agjm(agkmVar.a, agkmVar.b, agkmVar.c, agkmVar.d, agkmVar.e, agkmVar.f, agkmVar.g, agkmVar.h, agkmVar.i, agkmVar.j, agkmVar.k, agkmVar.l, agkmVar.m);
    }

    public static defpackage.agjn D(defpackage.agjn agjnVar, aonj aonjVar) {
        defpackage.agkn agknVar = new defpackage.agkn(agjnVar);
        aonjVar.a(agknVar);
        return agknVar.a();
    }

    public static defpackage.agjo E(defpackage.agjo agjoVar, aonj aonjVar) {
        defpackage.agko agkoVar = new defpackage.agko(agjoVar);
        aonjVar.a(agkoVar);
        return agkoVar.a();
    }

    public static defpackage.agjp F(defpackage.agjp agjpVar, aonj aonjVar) {
        defpackage.agkq agkqVar = new defpackage.agkq(agjpVar);
        aonjVar.a(agkqVar);
        return new defpackage.agjp(agkqVar.b, agkqVar.a, agkqVar.c, agkqVar.d);
    }

    public static defpackage.agjq G(defpackage.agjq agjqVar, aonj aonjVar) {
        defpackage.agkp agkpVar = new defpackage.agkp(agjqVar);
        aonjVar.a(agkpVar);
        return new defpackage.agjq(agkpVar.a, agkpVar.b, agkpVar.c, agkpVar.d, agkpVar.e, agkpVar.f);
    }

    public static defpackage.agjs H(defpackage.agjs agjsVar, aonj aonjVar) {
        defpackage.agkq agkqVar = new defpackage.agkq(agjsVar);
        aonjVar.a(agkqVar);
        return new defpackage.agjs(agkqVar.a, agkqVar.b, agkqVar.c, agkqVar.d);
    }

    public static defpackage.agjw I(aonj aonjVar) {
        defpackage.agjw agjwVar = new defpackage.agjw();
        aonjVar.a(agjwVar);
        return agjwVar;
    }

    public static defpackage.agjj J(defpackage.agix agixVar) {
        return agixVar == defpackage.agix.b ? defpackage.agjj.c : defpackage.agjj.b;
    }

    public static java.lang.Object K(java.util.Map map, defpackage.aglv aglvVar, java.lang.Object obj) {
        aooh.f(aglvVar, "key");
        if (!map.containsKey(aglvVar)) {
            return obj;
        }
        aooh.f(aglvVar, "key");
        return map.get(aglvVar);
    }

    public static void L(defpackage.agiw agiwVar, java.util.Map map) {
        defpackage.aglm aglmVar = new defpackage.aglm(agiwVar.a);
        map.put(aglmVar.c, java.lang.Float.valueOf(agiwVar.b));
        map.put(aglmVar.d, java.lang.Float.valueOf(agiwVar.c));
        map.put(aglmVar.e, java.lang.Float.valueOf(agiwVar.d));
        map.put(aglmVar.f, java.lang.Float.valueOf(agiwVar.e));
        map.put(aglmVar.g, java.lang.Float.valueOf(agiwVar.f));
        map.put(aglmVar.h, java.lang.Integer.valueOf(agiwVar.j));
        map.put(aglmVar.k, java.lang.Float.valueOf(agiwVar.g));
        map.put(aglmVar.i, java.lang.Float.valueOf(agiwVar.i));
        map.put(aglmVar.j, java.lang.Float.valueOf(agiwVar.h));
        map.put(aglmVar.b, java.lang.Float.valueOf(agiwVar.k));
        map.put(aglmVar.l, java.lang.Float.valueOf(agiwVar.l));
    }

    public static void M(boolean z) {
        defpackage.agiz.a.b(java.lang.Boolean.valueOf(z));
    }

    public static void N(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (a(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || a(b3) || a(b4)) {
            throw new java.lang.IllegalArgumentException("Invalid UTF-8");
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static void O(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static void P(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!a(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!a(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!a(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!a(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!a(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid UTF-8");
    }

    public static void Q(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new java.lang.IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (a(b2)) {
            throw new java.lang.IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean R(byte b) {
        return b >= 0;
    }

    public static boolean S(byte b) {
        return b < -16;
    }

    public static boolean T(byte b) {
        return b < -32;
    }

    public static java.lang.String U(java.lang.String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean V(android.os.Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(b("gcm.n.e")));
    }

    public static android.os.Bundle W(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        for (java.lang.String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public static java.lang.Integer X(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String strAa = aa(str, bundle);
        if (!android.text.TextUtils.isEmpty(strAa)) {
            try {
                return java.lang.Integer.valueOf(java.lang.Integer.parseInt(strAa));
            } catch (java.lang.NumberFormatException unused) {
                android.util.Log.w("NotificationParams", "Couldn't parse value of " + U(str) + '(' + strAa + ") into an int");
            }
        }
        return null;
    }

    public static java.lang.String Y(android.content.res.Resources resources, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String[] strArr;
        java.lang.String strAa = aa(str2.concat("_loc_key"), bundle);
        if (android.text.TextUtils.isEmpty(strAa)) {
            return null;
        }
        int identifier = resources.getIdentifier(strAa, "string", str);
        if (identifier == 0) {
            android.util.Log.w("NotificationParams", U(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        org.json.JSONArray jSONArrayAb = ab(str2.concat("_loc_args"), bundle);
        if (jSONArrayAb == null) {
            strArr = null;
        } else {
            int length = jSONArrayAb.length();
            strArr = new java.lang.String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayAb.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (java.util.MissingFormatArgumentException e) {
            android.util.Log.w("NotificationParams", "Missing format argument for " + U(str2) + ": " + java.util.Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public static java.lang.String Z(android.content.res.Resources resources, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String strAa = aa(str2, bundle);
        return android.text.TextUtils.isEmpty(strAa) ? Y(resources, str, str2, bundle) : strAa;
    }

    private static boolean a(byte b) {
        return b > -65;
    }

    public static byte[] aA(byte[] bArr) {
        if (bArr.length != 16) {
            throw new java.lang.IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (b | ((bArr[i2] >> 7) & 1));
            }
            i = i2;
        }
        bArr2[15] = (byte) (bArr2[15] ^ ((byte) ((bArr[0] >> 7) & 135)));
        return bArr2;
    }

    public static ajnn aB(ajnr ajnrVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarA;
        if (ajnrVar.a != ajyiVar.j()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (ajnrVar.dU() && num == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ajnrVar.dU() && num != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ajnq ajnqVar = ajnrVar.c;
        if (ajnqVar == ajnq.d) {
            ajstVarA = defpackage.ajmh.a;
        } else if (ajnqVar == ajnq.c || ajnqVar == ajnq.b) {
            ajstVarA = defpackage.ajmh.a(num.intValue());
        } else {
            if (ajnqVar != ajnq.a) {
                throw new java.lang.IllegalStateException("Unknown HmacParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajnqVar))));
            }
            ajstVarA = defpackage.ajmh.b(num.intValue());
        }
        return new ajnn(ajnrVar, ajyiVar, ajstVarA, num);
    }

    public static java.lang.String aa(java.lang.String str, android.os.Bundle bundle) {
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            java.lang.String strB = b(str);
            if (bundle.containsKey(strB)) {
                str = strB;
            }
        }
        return bundle.getString(str);
    }

    public static org.json.JSONArray ab(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String strAa = aa(str, bundle);
        if (!android.text.TextUtils.isEmpty(strAa)) {
            try {
                return new org.json.JSONArray(strAa);
            } catch (org.json.JSONException unused) {
                android.util.Log.w("NotificationParams", "Malformed JSON for key " + U(str) + ": " + strAa + ", falling back to default");
            }
        }
        return null;
    }

    public static boolean ac(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String strAa = aa(str, bundle);
        return "1".equals(strAa) || java.lang.Boolean.parseBoolean(strAa);
    }

    public static void ad(dva dvaVar, defpackage.ajxn ajxnVar) {
        if (ajxnVar != null) {
            try {
                aaum aaumVar = ajxnVar.c;
                aais.as(aaumVar);
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) aazc.u(aaumVar, 5L, java.util.concurrent.TimeUnit.SECONDS);
                dvaVar.l(bitmap);
                duy duyVar = new duy();
                duyVar.a = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.f(bitmap);
                duyVar.b = true;
                dvaVar.o(duyVar);
            } catch (java.lang.InterruptedException unused) {
                android.util.Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                ajxnVar.close();
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.ExecutionException e) {
                android.util.Log.w("FirebaseMessaging", "Failed to download image: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(e.getCause()))));
            } catch (java.util.concurrent.TimeoutException unused2) {
                android.util.Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                ajxnVar.close();
            }
        }
    }

    public static /* synthetic */ boolean ae() {
        return android.util.Log.isLoggable("FirebaseMessaging", 3);
    }

    public static java.lang.String af(akff akffVar) {
        aooh.f(akffVar, "<this>");
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(akffVar.q);
        aooh.e(localeForLanguageTag, "forLanguageTag(...)");
        java.lang.String languageTag = new java.util.Locale.Builder().setLanguage(localeForLanguageTag.getLanguage()).setRegion(localeForLanguageTag.getCountry()).build().toLanguageTag();
        aooh.e(languageTag, "toLanguageTag(...)");
        return languageTag;
    }

    public static java.lang.Long ag(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            return java.lang.Long.valueOf(java.nio.ByteBuffer.wrap(messageDigest.digest()).getLong());
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static byte[] ah(byte[] bArr, byte[] bArr2) throws java.security.InvalidKeyException {
        int i;
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, 32);
        int i2 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        int i3 = bArrCopyOf[31] & 127;
        bArrCopyOf[31] = (byte) i3;
        bArrCopyOf[31] = (byte) (i3 | 64);
        byte[][] bArr3 = defpackage.ajlm.a;
        if (bArr2.length != 32) {
            throw new java.security.InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = java.util.Arrays.copyOf(bArr2, 32);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i4 = 0; i4 < 7; i4++) {
            byte[][] bArr4 = defpackage.ajlm.a;
            if (java.security.MessageDigest.isEqual(bArr4[i4], bArrCopyOf2)) {
                throw new java.security.InvalidKeyException("Banned public key: ".concat(am(bArr4[i4])));
            }
        }
        int[] iArr = defpackage.ajlp.a;
        int i5 = 10;
        long[] jArr2 = new long[10];
        int i6 = 0;
        while (true) {
            i = 8;
            if (i6 >= i5) {
                break;
            }
            int i7 = defpackage.ajlp.a[i6];
            int i8 = bArrCopyOf2[i7] & 255;
            jArr2[i6] = ((((((long) i8) | (((long) (bArrCopyOf2[i7 + 1] & 255)) << 8)) | ((bArrCopyOf2[i7 + 2] & 255) << 16)) | (((long) (bArrCopyOf2[i7 + 3] & 255)) << 24)) >> defpackage.ajlp.b[i6]) & ((long) defpackage.ajlp.c[i6 & 1]);
            i6++;
            i5 = 10;
            i2 = i2;
        }
        int i9 = i2;
        int i10 = 19;
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        jArr4[i9] = 1;
        long[] jArr5 = new long[19];
        jArr5[i9] = 1;
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[i9] = 1;
        long[] jArr9 = new long[19];
        long[] jArr10 = new long[19];
        jArr10[i9] = 1;
        java.lang.System.arraycopy(jArr2, i9, jArr3, i9, 10);
        int i11 = 0;
        while (i11 < 32) {
            int i12 = bArrCopyOf[31 - i11] & 255;
            long[] jArr11 = jArr10;
            long[] jArr12 = jArr9;
            long[] jArr13 = jArr8;
            long[] jArr14 = jArr7;
            long[] jArr15 = jArr6;
            long[] jArr16 = jArr5;
            int i13 = 0;
            while (i13 < i) {
                int i14 = (i12 >> (7 - i13)) & 1;
                defpackage.ajlm.a(jArr16, jArr3, i14);
                defpackage.ajlm.a(jArr15, jArr4, i14);
                byte[] bArr5 = bArrCopyOf;
                long[] jArrCopyOf = java.util.Arrays.copyOf(jArr16, 10);
                long[] jArr17 = new long[i10];
                int i15 = i11;
                long[] jArr18 = new long[i10];
                int i16 = i12;
                long[] jArr19 = new long[i10];
                int i17 = i13;
                long[] jArr20 = new long[i10];
                long[] jArr21 = jArr;
                long[] jArr22 = new long[i10];
                long[] jArr23 = new long[i10];
                long[] jArr24 = new long[i10];
                defpackage.ajlp.i(jArr16, jArr16, jArr15);
                defpackage.ajlp.h(jArr15, jArrCopyOf, jArr15);
                long[] jArrCopyOf2 = java.util.Arrays.copyOf(jArr3, 10);
                defpackage.ajlp.i(jArr3, jArr3, jArr4);
                defpackage.ajlp.h(jArr4, jArrCopyOf2, jArr4);
                defpackage.ajlp.b(jArr20, jArr3, jArr15);
                defpackage.ajlp.b(jArr22, jArr16, jArr4);
                defpackage.ajlp.e(jArr20);
                defpackage.ajlp.d(jArr20);
                defpackage.ajlp.e(jArr22);
                defpackage.ajlp.d(jArr22);
                long[] jArr25 = jArr3;
                java.lang.System.arraycopy(jArr20, 0, jArrCopyOf2, 0, 10);
                defpackage.ajlp.i(jArr20, jArr20, jArr22);
                defpackage.ajlp.h(jArr22, jArrCopyOf2, jArr22);
                defpackage.ajlp.g(jArr24, jArr20);
                defpackage.ajlp.g(jArr23, jArr22);
                defpackage.ajlp.b(jArr22, jArr23, jArr2);
                defpackage.ajlp.e(jArr22);
                defpackage.ajlp.d(jArr22);
                java.lang.System.arraycopy(jArr24, 0, jArr14, 0, 10);
                java.lang.System.arraycopy(jArr22, 0, jArr13, 0, 10);
                defpackage.ajlp.g(jArr18, jArr16);
                defpackage.ajlp.g(jArr19, jArr15);
                defpackage.ajlp.b(jArr12, jArr18, jArr19);
                defpackage.ajlp.e(jArr12);
                defpackage.ajlp.d(jArr12);
                defpackage.ajlp.h(jArr19, jArr18, jArr19);
                java.util.Arrays.fill(jArr17, 10, 18, 0L);
                defpackage.ajlp.f(jArr17, jArr19, 121665L);
                defpackage.ajlp.d(jArr17);
                defpackage.ajlp.i(jArr17, jArr17, jArr18);
                long[] jArr26 = jArr11;
                defpackage.ajlp.b(jArr26, jArr19, jArr17);
                defpackage.ajlp.e(jArr26);
                defpackage.ajlp.d(jArr26);
                defpackage.ajlm.a(jArr12, jArr14, i14);
                defpackage.ajlm.a(jArr26, jArr13, i14);
                i13 = i17 + 1;
                long[] jArr27 = jArr13;
                jArr13 = jArr4;
                jArr4 = jArr27;
                long[] jArr28 = jArr12;
                jArr12 = jArr16;
                jArr16 = jArr28;
                jArr11 = jArr15;
                jArr3 = jArr14;
                i11 = i15;
                i12 = i16;
                jArr = jArr21;
                jArr14 = jArr25;
                i10 = 19;
                i = 8;
                jArr15 = jArr26;
                bArrCopyOf = bArr5;
            }
            i11++;
            jArr5 = jArr16;
            jArr6 = jArr15;
            jArr7 = jArr14;
            jArr8 = jArr13;
            jArr9 = jArr12;
            i10 = 19;
            i = 8;
            jArr10 = jArr11;
            bArrCopyOf = bArrCopyOf;
        }
        long[] jArr29 = jArr;
        long[] jArr30 = new long[10];
        long[] jArr31 = new long[10];
        long[] jArr32 = new long[10];
        long[] jArr33 = new long[10];
        long[] jArr34 = new long[10];
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[10];
        long[] jArr39 = new long[10];
        long[] jArr40 = jArr3;
        long[] jArr41 = new long[10];
        defpackage.ajlp.g(jArr31, jArr6);
        defpackage.ajlp.g(jArr41, jArr31);
        defpackage.ajlp.g(jArr39, jArr41);
        defpackage.ajlp.a(jArr32, jArr39, jArr6);
        defpackage.ajlp.a(jArr33, jArr32, jArr31);
        defpackage.ajlp.g(jArr39, jArr33);
        defpackage.ajlp.a(jArr34, jArr39, jArr32);
        defpackage.ajlp.g(jArr39, jArr34);
        defpackage.ajlp.g(jArr41, jArr39);
        defpackage.ajlp.g(jArr39, jArr41);
        defpackage.ajlp.g(jArr41, jArr39);
        defpackage.ajlp.g(jArr39, jArr41);
        defpackage.ajlp.a(jArr35, jArr39, jArr34);
        defpackage.ajlp.g(jArr39, jArr35);
        defpackage.ajlp.g(jArr41, jArr39);
        for (int i18 = 2; i18 < 10; i18 += 2) {
            defpackage.ajlp.g(jArr39, jArr41);
            defpackage.ajlp.g(jArr41, jArr39);
        }
        defpackage.ajlp.a(jArr36, jArr41, jArr35);
        defpackage.ajlp.g(jArr39, jArr36);
        defpackage.ajlp.g(jArr41, jArr39);
        for (int i19 = 2; i19 < 20; i19 += 2) {
            defpackage.ajlp.g(jArr39, jArr41);
            defpackage.ajlp.g(jArr41, jArr39);
        }
        defpackage.ajlp.a(jArr39, jArr41, jArr36);
        defpackage.ajlp.g(jArr41, jArr39);
        defpackage.ajlp.g(jArr39, jArr41);
        for (int i20 = 2; i20 < 10; i20 += 2) {
            defpackage.ajlp.g(jArr41, jArr39);
            defpackage.ajlp.g(jArr39, jArr41);
        }
        defpackage.ajlp.a(jArr37, jArr39, jArr35);
        defpackage.ajlp.g(jArr39, jArr37);
        defpackage.ajlp.g(jArr41, jArr39);
        for (int i21 = 2; i21 < 50; i21 += 2) {
            defpackage.ajlp.g(jArr39, jArr41);
            defpackage.ajlp.g(jArr41, jArr39);
        }
        defpackage.ajlp.a(jArr38, jArr41, jArr37);
        defpackage.ajlp.g(jArr41, jArr38);
        defpackage.ajlp.g(jArr39, jArr41);
        for (int i22 = 2; i22 < 100; i22 += 2) {
            defpackage.ajlp.g(jArr41, jArr39);
            defpackage.ajlp.g(jArr39, jArr41);
        }
        defpackage.ajlp.a(jArr41, jArr39, jArr38);
        defpackage.ajlp.g(jArr39, jArr41);
        defpackage.ajlp.g(jArr41, jArr39);
        for (int i23 = 2; i23 < 50; i23 += 2) {
            defpackage.ajlp.g(jArr39, jArr41);
            defpackage.ajlp.g(jArr41, jArr39);
        }
        defpackage.ajlp.a(jArr39, jArr41, jArr37);
        defpackage.ajlp.g(jArr41, jArr39);
        defpackage.ajlp.g(jArr39, jArr41);
        defpackage.ajlp.g(jArr41, jArr39);
        defpackage.ajlp.g(jArr39, jArr41);
        defpackage.ajlp.g(jArr41, jArr39);
        defpackage.ajlp.a(jArr30, jArr41, jArr33);
        defpackage.ajlp.a(jArr29, jArr5, jArr30);
        long[] jArr42 = new long[10];
        long[] jArr43 = new long[10];
        long[] jArr44 = new long[11];
        long[] jArr45 = new long[11];
        long[] jArr46 = new long[11];
        defpackage.ajlp.a(jArr42, jArr2, jArr29);
        defpackage.ajlp.i(jArr43, jArr2, jArr29);
        long[] jArr47 = new long[10];
        jArr47[0] = 486662;
        defpackage.ajlp.i(jArr45, jArr43, jArr47);
        defpackage.ajlp.a(jArr45, jArr45, jArr4);
        defpackage.ajlp.i(jArr45, jArr45, jArr40);
        defpackage.ajlp.a(jArr45, jArr45, jArr42);
        defpackage.ajlp.a(jArr45, jArr45, jArr40);
        defpackage.ajlp.f(jArr44, jArr45, 4L);
        defpackage.ajlp.d(jArr44);
        defpackage.ajlp.a(jArr45, jArr42, jArr4);
        defpackage.ajlp.h(jArr45, jArr45, jArr4);
        defpackage.ajlp.a(jArr46, jArr43, jArr40);
        defpackage.ajlp.i(jArr45, jArr45, jArr46);
        defpackage.ajlp.g(jArr45, jArr45);
        if (java.security.MessageDigest.isEqual(defpackage.ajlp.j(jArr44), defpackage.ajlp.j(jArr45))) {
            return defpackage.ajlp.j(jArr29);
        }
        throw new java.lang.IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(am(bArr2)));
    }

    public static byte[] ai(byte[] bArr) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return ah(bArr, bArr2);
    }

    public static void aj(java.nio.ByteBuffer byteBuffer, long j) throws java.security.GeneralSecurityException {
        if (j < 0 || j >= 4294967296L) {
            throw new java.security.GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j);
    }

    public static boolean ak() {
        return "The Android Project".equals(java.lang.System.getProperty("java.vendor"));
    }

    public static byte[] al(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws java.security.GeneralSecurityException {
        javax.crypto.Mac mac = (javax.crypto.Mac) ajse.b.a(str);
        if (i > mac.getMacLength() * 255) {
            throw new java.security.GeneralSecurityException("size too large");
        }
        if (bArr2.length == 0) {
            mac.init(new javax.crypto.spec.SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new javax.crypto.spec.SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new javax.crypto.spec.SecretKeySpec(mac.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr3);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i4 = i3 + length;
            if (i4 >= i) {
                java.lang.System.arraycopy(bArrDoFinal, 0, bArr4, i3, i - i3);
                return bArr4;
            }
            java.lang.System.arraycopy(bArrDoFinal, 0, bArr4, i3, length);
            i2++;
            i3 = i4;
        }
    }

    public static java.lang.String am(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length << 1);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return sb.toString();
    }

    public static byte[] an(java.lang.String str) {
        if ((str.length() & 1) != 0) {
            throw new java.lang.IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            int iDigit = java.lang.Character.digit(str.charAt(i2), 16);
            int iDigit2 = java.lang.Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new java.lang.IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }

    public static int ao(java.security.spec.EllipticCurve ellipticCurve) {
        return ajlo.d(ellipticCurve).subtract(java.math.BigInteger.ONE).bitLength();
    }

    public static java.security.KeyPair ap(java.security.spec.ECParameterSpec eCParameterSpec) {
        java.security.KeyPairGenerator keyPairGenerator = (java.security.KeyPairGenerator) ajse.d.a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static java.security.interfaces.ECPrivateKey aq(ajsb ajsbVar, byte[] bArr) throws java.security.NoSuchAlgorithmException {
        return (java.security.interfaces.ECPrivateKey) ((java.security.KeyFactory) ajse.e.a("EC")).generatePrivate(new java.security.spec.ECPrivateKeySpec(new java.math.BigInteger(1, bArr), as(ajsbVar)));
    }

    public static java.security.interfaces.ECPublicKey ar(java.security.spec.ECParameterSpec eCParameterSpec, ajsc ajscVar, byte[] bArr) {
        return (java.security.interfaces.ECPublicKey) ((java.security.KeyFactory) ajse.e.a("EC")).generatePublic(new java.security.spec.ECPublicKeySpec(at(eCParameterSpec.getCurve(), ajscVar, bArr), eCParameterSpec));
    }

    public static java.security.spec.ECParameterSpec as(ajsb ajsbVar) throws java.security.NoSuchAlgorithmException {
        int iOrdinal = ajsbVar.ordinal();
        if (iOrdinal == 0) {
            return ajlo.a;
        }
        if (iOrdinal == 1) {
            return ajlo.b;
        }
        if (iOrdinal == 2) {
            return ajlo.c;
        }
        throw new java.security.NoSuchAlgorithmException("curve not implemented:".concat(ajsbVar.toString()));
    }

    public static java.security.spec.ECPoint at(java.security.spec.EllipticCurve ellipticCurve, ajsc ajscVar, byte[] bArr) throws java.security.GeneralSecurityException {
        int iAo = (ao(ellipticCurve) + 7) / 8;
        int iOrdinal = ajscVar.ordinal();
        boolean z = false;
        if (iOrdinal == 0) {
            int length = bArr.length;
            if (length != (iAo << 1) + 1) {
                throw new java.security.GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new java.security.GeneralSecurityException("invalid point format");
            }
            int i = iAo + 1;
            java.security.spec.ECPoint eCPoint = new java.security.spec.ECPoint(new java.math.BigInteger(1, java.util.Arrays.copyOfRange(bArr, 1, i)), new java.math.BigInteger(1, java.util.Arrays.copyOfRange(bArr, i, length)));
            ajlo.f(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new java.security.GeneralSecurityException("invalid format:".concat(ajscVar.toString()));
            }
            int i2 = iAo << 1;
            int length2 = bArr.length;
            if (length2 != i2) {
                throw new java.security.GeneralSecurityException("invalid point size");
            }
            java.security.spec.ECPoint eCPoint2 = new java.security.spec.ECPoint(new java.math.BigInteger(1, java.util.Arrays.copyOf(bArr, iAo)), new java.math.BigInteger(1, java.util.Arrays.copyOfRange(bArr, iAo, length2)));
            ajlo.f(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        int i3 = iAo + 1;
        java.math.BigInteger bigIntegerD = ajlo.d(ellipticCurve);
        int length3 = bArr.length;
        if (length3 != i3) {
            throw new java.security.GeneralSecurityException("compressed point has wrong length");
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                throw new java.security.GeneralSecurityException("invalid format");
            }
            z = true;
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, java.util.Arrays.copyOfRange(bArr, 1, length3));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(bigIntegerD) >= 0) {
            throw new java.security.GeneralSecurityException("x is out of range");
        }
        return new java.security.spec.ECPoint(bigInteger, c(bigInteger, z, ellipticCurve));
    }

    public static byte[] au(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey) throws java.security.GeneralSecurityException {
        try {
            if (!ajlo.g(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new java.security.GeneralSecurityException("invalid public key spec");
            }
            java.security.spec.ECPoint w = eCPublicKey.getW();
            ajlo.f(w, eCPrivateKey.getParams().getCurve());
            java.security.PublicKey publicKeyGeneratePublic = ((java.security.KeyFactory) ajse.e.a("EC")).generatePublic(new java.security.spec.ECPublicKeySpec(w, eCPrivateKey.getParams()));
            javax.crypto.KeyAgreement keyAgreement = (javax.crypto.KeyAgreement) ajse.c.a("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                java.security.spec.EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(ajlo.d(curve)) >= 0) {
                    throw new java.security.GeneralSecurityException("shared secret is out of range");
                }
                c(bigInteger, true, curve);
                return bArrGenerateSecret;
            } catch (java.lang.IllegalStateException e) {
                throw new java.security.GeneralSecurityException(e);
            }
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException e2) {
            throw new java.security.GeneralSecurityException(e2);
        }
    }

    public static void av(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new java.lang.IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static byte[] aw(byte[]... bArr) throws java.security.GeneralSecurityException {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i2];
                int i3 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    java.lang.System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i2 > Integer.MAX_VALUE - length2) {
                throw new java.security.GeneralSecurityException("exceeded size limit");
            }
            i2 += length2;
            i++;
        }
    }

    public static byte[] ax(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return ay(bArr, 0, bArr2, length);
        }
        throw new java.lang.IllegalArgumentException("The lengths of x and y should match.");
    }

    public static byte[] ay(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr.length - i2 < i || bArr2.length - i2 < 0) {
            throw new java.lang.IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
        }
        return bArr3;
    }

    public static byte[] az(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new java.lang.IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, 16);
        bArrCopyOf[length] = -128;
        return bArrCopyOf;
    }

    private static java.lang.String b(java.lang.String str) {
        return str.startsWith("gcm.n.") ? str.replace("gcm.n.", "gcm.notification.") : str;
    }

    private static java.math.BigInteger c(java.math.BigInteger bigInteger, boolean z, java.security.spec.EllipticCurve ellipticCurve) throws java.security.GeneralSecurityException {
        java.math.BigInteger bigIntegerModPow;
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigIntegerD = ajlo.d(ellipticCurve);
        java.math.BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerD);
        if (bigIntegerD.signum() != 1) {
            throw new java.security.InvalidAlgorithmParameterException("p must be positive");
        }
        java.math.BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerD);
        if (bigIntegerMod2.equals(java.math.BigInteger.ZERO)) {
            bigInteger2 = java.math.BigInteger.ZERO;
        } else {
            if (bigIntegerD.testBit(0) && bigIntegerD.testBit(1)) {
                bigIntegerModPow = bigIntegerMod2.modPow(bigIntegerD.add(java.math.BigInteger.ONE).shiftRight(2), bigIntegerD);
            } else {
                bigIntegerModPow = null;
                if (bigIntegerD.testBit(0) && !bigIntegerD.testBit(1)) {
                    java.math.BigInteger bigIntegerAdd = java.math.BigInteger.ONE;
                    java.math.BigInteger bigIntegerShiftRight = bigIntegerD.subtract(java.math.BigInteger.ONE).shiftRight(1);
                    int i = 0;
                    while (true) {
                        java.math.BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerD);
                        if (bigIntegerMod3.equals(java.math.BigInteger.ZERO)) {
                            bigInteger2 = bigIntegerAdd;
                        } else {
                            java.math.BigInteger bigIntegerModPow2 = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerD);
                            if (bigIntegerModPow2.add(java.math.BigInteger.ONE).equals(bigIntegerD)) {
                                java.math.BigInteger bigIntegerShiftRight2 = bigIntegerD.add(java.math.BigInteger.ONE).shiftRight(1);
                                java.math.BigInteger bigIntegerMod4 = java.math.BigInteger.ONE;
                                java.math.BigInteger bigInteger3 = bigIntegerAdd;
                                for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                    java.math.BigInteger bigIntegerMultiply = bigInteger3.multiply(bigIntegerMod4);
                                    java.math.BigInteger bigIntegerMod5 = bigInteger3.multiply(bigInteger3).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerD).multiply(bigIntegerMod3)).mod(bigIntegerD);
                                    java.math.BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerD);
                                    if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                        java.math.BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerD);
                                        bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerD);
                                        bigInteger3 = bigIntegerMod7;
                                    } else {
                                        bigInteger3 = bigIntegerMod5;
                                        bigIntegerMod4 = bigIntegerMod6;
                                    }
                                }
                                bigIntegerModPow = bigInteger3;
                            } else {
                                if (!bigIntegerModPow2.equals(java.math.BigInteger.ONE)) {
                                    throw new java.security.InvalidAlgorithmParameterException("p is not prime");
                                }
                                bigIntegerAdd = bigIntegerAdd.add(java.math.BigInteger.ONE);
                                i++;
                                if (i == 128 && !bigIntegerD.isProbablePrime(80)) {
                                    throw new java.security.InvalidAlgorithmParameterException("p is not prime");
                                }
                            }
                        }
                    }
                }
            }
            if (bigIntegerModPow != null && bigIntegerModPow.multiply(bigIntegerModPow).mod(bigIntegerD).compareTo(bigIntegerMod2) != 0) {
                throw new java.security.GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger2 = bigIntegerModPow;
        }
        return z != bigInteger2.testBit(0) ? bigIntegerD.subtract(bigInteger2).mod(bigIntegerD) : bigInteger2;
    }

    public static com.google.android.wizardmanager.WizardActionDependency g(java.lang.String str, defpackage.agme agmeVar, defpackage.agmg agmgVar, java.lang.Integer num) {
        aooh.f(str, "actionId");
        aooh.f(agmeVar, "type");
        aooh.f(agmgVar, "requirementType");
        return new com.google.android.wizardmanager.WizardActionDependency(agmeVar, defpackage.agmf.ACTION, str, aokc.a, agmgVar, num, null);
    }

    public static com.google.android.wizardmanager.WizardActionDependency h(java.util.List list, defpackage.agme agmeVar) {
        aooh.f(list, "children");
        aooh.f(agmeVar, "type");
        return new com.google.android.wizardmanager.WizardActionDependency(agmeVar, defpackage.agmf.ALL_OF, null, list, null, null, 48, null);
    }

    public static com.google.android.wizardmanager.WizardActionDependency i(java.util.List list, defpackage.agme agmeVar) {
        aooh.f(list, "children");
        aooh.f(agmeVar, "type");
        return new com.google.android.wizardmanager.WizardActionDependency(agmeVar, defpackage.agmf.ANY_OF, null, list, null, null, 48, null);
    }

    public static com.google.android.wizardmanager.WizardActionDependency j(com.google.android.wizardmanager.WizardActionDependency wizardActionDependency, defpackage.agme agmeVar) {
        aooh.f(wizardActionDependency, "child");
        aooh.f(agmeVar, "type");
        return new com.google.android.wizardmanager.WizardActionDependency(agmeVar, defpackage.agmf.NOT, null, ajsz.aY(wizardActionDependency), null, null, 48, null);
    }

    public static /* synthetic */ com.google.android.wizardmanager.WizardActionDependency k(java.lang.String str, defpackage.agme agmeVar, defpackage.agmg agmgVar, int i) {
        if ((i & 2) != 0) {
            agmeVar = defpackage.agme.EXECUTION;
        }
        if ((i & 4) != 0) {
            agmgVar = defpackage.agmg.COMPLETED;
        }
        return g(str, agmeVar, agmgVar, null);
    }

    public static float l(float f) {
        return (float) (((double) f) * 0.017453292519943295d);
    }

    public static float m(float f, float f2, float f3, float f4) {
        float f5 = f3 * 0.5f;
        float f6 = f2 - f5;
        float f7 = f2 * f;
        float f8 = f5 + f4;
        float f9 = f6 - f4;
        return f8 <= f9 ? aooc.s(f7, f8, f9) : f7;
    }

    public static boolean n(java.util.Map map) {
        defpackage.agle agleVar = defpackage.agln.a;
        defpackage.agle agleVar2 = defpackage.agln.L;
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        if (((java.lang.Number) K(map, agleVar2, fValueOf)).floatValue() > 0.0f || ((java.lang.Number) K(map, defpackage.agln.aS, fValueOf)).floatValue() > 0.0f) {
            return true;
        }
        if (((java.lang.Number) K(map, defpackage.agln.t, fValueOf)).floatValue() > 0.0f && ((java.lang.Number) K(map, defpackage.agln.y, fValueOf)).floatValue() > 0.0f && ((java.lang.Number) K(map, defpackage.agln.w, fValueOf)).floatValue() > 0.0f) {
            return true;
        }
        if (((java.lang.Number) K(map, defpackage.agln.F, fValueOf)).floatValue() <= 0.0f || ((java.lang.Number) K(map, defpackage.agln.H, fValueOf)).floatValue() <= 0.0f || ((java.lang.Number) K(map, defpackage.agln.G, fValueOf)).floatValue() <= 0.0f) {
            return ((java.lang.Number) K(map, defpackage.agln.I, fValueOf)).floatValue() > 0.0f && ((java.lang.Number) K(map, defpackage.agln.K, fValueOf)).floatValue() > 0.0f && ((java.lang.Number) K(map, defpackage.agln.J, fValueOf)).floatValue() > 0.0f;
        }
        return true;
    }

    public static boolean o(android.content.Intent intent) {
        aooh.f(intent, "intent");
        return intent.hasExtra("tiktok_account_operation_contexts");
    }

    public static void p(java.lang.String str) {
        android.util.Log.d("WizardManager", q(str));
    }

    public static java.lang.String q(java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = java.lang.Thread.currentThread().getStackTrace()[4];
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 9 + stackTraceElement.getMethodName().length() + stackTraceElement.getFileName().length() + 4);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            char cCharAt = "m b [f:n]".charAt(i);
            if (cCharAt == 'b') {
                sb.append(str);
                z = true;
            } else if (cCharAt == 'f') {
                sb.append(stackTraceElement.getFileName());
            } else if (cCharAt == 'm') {
                java.lang.String methodName = stackTraceElement.getMethodName();
                if (methodName.equalsIgnoreCase(str.substring(0, str.indexOf(32)))) {
                    while (true) {
                        int i2 = i + 1;
                        if (i2 >= 9 || !java.lang.Character.isWhitespace("m b [f:n]".charAt(i2))) {
                            break;
                        }
                        i = i2;
                    }
                } else {
                    sb.append(methodName);
                }
            } else if (cCharAt != 'n') {
                sb.append(cCharAt);
            } else {
                sb.append(stackTraceElement.getLineNumber());
            }
            i++;
        }
        if (!z) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.util.List r(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(j$.util.Objects.requireNonNull(obj));
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static java.lang.Object s(defpackage.aglv aglvVar, java.lang.Object obj, java.lang.Object obj2, float f) throws aois {
        long jM;
        long jM2;
        long jH;
        cpm cqgVar;
        aooh.f(aglvVar, "uniform");
        j$.util.Objects.checkIndex(0, 12);
        if (aglvVar != null) {
            if (aglvVar instanceof defpackage.agle) {
                return java.lang.Float.valueOf(((1.0f - f) * ((java.lang.Float) obj).floatValue()) + (f * ((java.lang.Float) obj2).floatValue()));
            }
            if (aglvVar instanceof defpackage.agli) {
                float f2 = 1.0f - f;
                long j = ((cpm) obj).a;
                long j2 = ((cpm) obj2).a;
                cqgVar = new cpm((((long) java.lang.Float.floatToRawIntBits((java.lang.Float.intBitsToFloat((int) (j >> 32)) * f2) + (java.lang.Float.intBitsToFloat((int) (j2 >> 32)) * f))) << 32) | (((long) java.lang.Float.floatToRawIntBits((f2 * java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + (f * java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L))))) & 4294967295L));
            } else if (aglvVar instanceof defpackage.agkx) {
                int iT = t(obj);
                if (iT == 0) {
                    jM = ((cqg) obj).a;
                } else {
                    if (iT != 1) {
                        java.lang.Class<?> cls = obj.getClass();
                        aopu[] aopuVarArr = aoou.a;
                        throw new java.lang.IllegalArgumentException("Unsupported start color type: ".concat(java.lang.String.valueOf(new aooa(cls).c())));
                    }
                    jM = cfd.M(((java.lang.Number) obj).intValue());
                }
                int iT2 = t(obj2);
                if (iT2 == 0) {
                    jM2 = ((cqg) obj2).a;
                } else {
                    if (iT2 != 1) {
                        java.lang.Class<?> cls2 = obj2.getClass();
                        aopu[] aopuVarArr2 = aoou.a;
                        throw new java.lang.IllegalArgumentException("Unsupported end color type: ".concat(java.lang.String.valueOf(new aooa(cls2).c())));
                    }
                    jM2 = cfd.M(((java.lang.Number) obj2).intValue());
                }
                float fA = cqg.a(jM);
                float fA2 = cqg.a(jM2);
                if (fA == 0.0f && fA2 == 0.0f) {
                    jH = cfd.M(0);
                } else if (fA == 0.0f) {
                    jH = cqg.h(jM2, fA2 * f);
                } else {
                    jH = fA2 == 0.0f ? cqg.h(jM, fA * (1.0f - f)) : cfd.Q(jM, jM2, f);
                }
                cqgVar = new cqg(jH);
            } else {
                if (aglvVar instanceof defpackage.aglc) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    int length = fArr.length;
                    if (length != fArr2.length) {
                        throw new java.lang.IllegalArgumentException("FloatArray sizes must match");
                    }
                    float[] fArr3 = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr3[i] = ((1.0f - f) * fArr[i]) + (fArr2[i] * f);
                    }
                    return fArr3;
                }
                if ((aglvVar instanceof defpackage.agkw) || (aglvVar instanceof defpackage.aglg) || (aglvVar instanceof defpackage.aglf) || (aglvVar instanceof defpackage.aglh) || (aglvVar instanceof defpackage.aglk) || (aglvVar instanceof defpackage.agll) || (aglvVar instanceof defpackage.aglu)) {
                    java.lang.String strConcat = "Linear interpolation (lerp) is not supported for IntUniforms. Uniform name: ".concat(aglvVar.a());
                    android.util.Log.w("UniformInterpolators", strConcat);
                    throw new java.lang.IllegalArgumentException(strConcat);
                }
            }
            return cqgVar;
        }
        throw new aois();
    }

    public static /* synthetic */ int t(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj instanceof cqg) {
            return 0;
        }
        return obj instanceof java.lang.Integer ? 1 : -2;
    }

    public static void u(boolean z, java.util.List list, java.lang.String str, java.lang.String str2, boolean z2) {
        if (!z2) {
            str2 = "vec4(0.0)";
        } else if (z) {
            str2 = "vec4(toLinearSrgb(" + str2 + ".rgb), " + str2 + ".a)";
        }
        list.add("    vec4 " + str + " = " + str2 + ';');
    }

    public static void v(java.lang.StringBuilder sb, java.lang.String str, java.lang.String str2) {
        sb.append(aoov.l("\n                finalColor = calculateBorderLight(finalColor, mainSdf, center, yFractEnergy,\n                    " + str2 + ", blurredSdfMask * ripple,\n                    inBorderLightAlpha" + str + ", inBorderLightTopBlurRadius" + str + ",\n                    inBorderLightBottomBlurRadius" + str + ",\n                    inBorderLightTopIntensity" + str + ", inBorderLightBottomIntensity" + str + ",\n                    inBorderLightStrokeWidth" + str + ",\n                    inBorderLightDistortionSpeed" + str + ", inBorderLightDistortionFrequency" + str + ",\n                    inBorderLightDistortionAmplitude" + str + ",\n                    borderLightColor" + str + "\n                    ,inBorderLightHdrBoost" + str + " // copybara: internal\n                    );\n                "));
        sb.append('\n');
    }

    public static java.lang.String w(java.lang.String str) {
        return a.bD(defpackage.agjr.a(str), str, "\n            ", "\n            float calculateShape(vec2 p, vec2 size, vec4 cornerRadius) {\n                return ", "(calculateRotation(p), size / 2.0, cornerRadius);\n            }\n            ");
    }

    public static java.lang.String x(java.lang.String str) {
        return aoov.l("\n            uniform float inBorderLightAlpha" + str + ";\n            uniform float inBorderLightTopBlurRadius" + str + ";\n            uniform float inBorderLightBottomBlurRadius" + str + ";\n            uniform float inBorderLightTopIntensity" + str + ";\n            uniform float inBorderLightBottomIntensity" + str + ";\n            uniform float inBorderLightStrokeWidth" + str + ";\n            uniform float inBorderLightDistortionSpeed" + str + ";\n            uniform float inBorderLightDistortionFrequency" + str + ";\n            uniform float inBorderLightDistortionAmplitude" + str + ";\n            uniform float inBorderLightHdrBoost" + str + "; // copybara: internal\n            layout(color) uniform vec4 inBorderLightColor" + str + ";\n\n            ");
    }

    public static defpackage.agiw y(defpackage.agiw agiwVar, aonj aonjVar) {
        defpackage.agkb agkbVar = new defpackage.agkb(agiwVar);
        aonjVar.a(agkbVar);
        return agkbVar.a();
    }

    public static defpackage.agiy z(defpackage.agiy agiyVar, aonj aonjVar) {
        defpackage.agkf agkfVar = new defpackage.agkf(agiyVar);
        aonjVar.a(agkfVar);
        return agkfVar.a();
    }

    public agmc(byte[] bArr) {
    }
}
