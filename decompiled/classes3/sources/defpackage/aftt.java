package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public /* synthetic */ class aftt {
    public aftt() {
    }

    public static ajst A(ajfe ajfeVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (ajfeVar == ajfe.d) {
            if (num == null) {
                return defpackage.ajmh.a;
            }
            throw new java.security.GeneralSecurityException("RAW output prefix type cannot have an id requirement");
        }
        if (num == null) {
            throw new java.security.GeneralSecurityException(hgb.i(ajfeVar, "idRequirement must be non-null for ", " type"));
        }
        if (ajfeVar == ajfe.b) {
            return defpackage.ajmh.b(num.intValue());
        }
        if (ajfeVar == ajfe.c || ajfeVar == ajfe.e) {
            return defpackage.ajmh.a(num.intValue());
        }
        throw new java.security.GeneralSecurityException("Unknown OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }

    public static ajfd B(int i) throws java.security.GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return ajfd.a;
        }
        if (i2 == 1) {
            return ajfd.b;
        }
        if (i2 == 2) {
            return ajfd.c;
        }
        if (i2 == 3) {
            return ajfd.d;
        }
        if (i2 == 4) {
            return ajfd.e;
        }
        throw new java.security.GeneralSecurityException("Unknown KeyMaterialType: ".concat(java.lang.Integer.toString(i2)));
    }

    public static ajfe C(int i) throws java.security.GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return ajfe.a;
        }
        if (i2 == 1) {
            return ajfe.b;
        }
        if (i2 == 2) {
            return ajfe.c;
        }
        if (i2 == 3) {
            return ajfe.d;
        }
        if (i2 == 4) {
            return ajfe.e;
        }
        if (i2 == 5) {
            return ajfe.f;
        }
        throw new java.security.GeneralSecurityException("Unknown OutputPrefixType: ".concat(java.lang.Integer.toString(i2)));
    }

    public static int D(ajfd ajfdVar) throws java.security.GeneralSecurityException {
        if (ajfdVar.equals(ajfd.a)) {
            return 2;
        }
        if (ajfdVar.equals(ajfd.b)) {
            return 3;
        }
        if (ajfdVar.equals(ajfd.c)) {
            return 4;
        }
        if (ajfdVar.equals(ajfd.d)) {
            return 5;
        }
        if (ajfdVar.equals(ajfd.e)) {
            return 6;
        }
        throw new java.security.GeneralSecurityException("Unknown KeyMaterialType: ".concat(ajfdVar.f));
    }

    public static int E(ajfe ajfeVar) throws java.security.GeneralSecurityException {
        if (ajfeVar.equals(ajfe.a)) {
            return 2;
        }
        if (ajfeVar.equals(ajfe.b)) {
            return 3;
        }
        if (ajfeVar.equals(ajfe.c)) {
            return 4;
        }
        if (ajfeVar.equals(ajfe.d)) {
            return 5;
        }
        if (ajfeVar.equals(ajfe.e)) {
            return 6;
        }
        if (ajfeVar.equals(ajfe.f)) {
            return 7;
        }
        throw new java.security.GeneralSecurityException("Unknown OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ajmm F(java.util.Map map) {
        java.util.List list = (java.util.List) map.get(ajmm.a);
        java.util.List listUnmodifiableList = list != null ? j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(list)) : java.util.Collections.EMPTY_LIST;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((ajst) entry.getKey()).a() == 5) {
                long jA = ajmm.a(((ajst) entry.getKey()).c());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(((java.util.List) entry.getValue()).size() + listUnmodifiableList.size());
                arrayList2.addAll((java.util.Collection) entry.getValue());
                arrayList2.addAll(listUnmodifiableList);
                arrayList.add(new ajml(jA, j$.util.DesugarCollections.unmodifiableList(arrayList2)));
            }
        }
        j$.util.List.-EL.sort(arrayList, new defpackage.aeov(3));
        long[] jArr = new long[arrayList.size()];
        java.util.List[] listArr = new java.util.List[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((ajml) arrayList.get(i)).a;
            listArr[i] = ((ajml) arrayList.get(i)).b;
        }
        return new ajmm(jArr, listArr, listUnmodifiableList);
    }

    public static void G(ajst ajstVar, java.lang.Object obj, java.util.Map map) throws java.security.GeneralSecurityException {
        j$.util.Objects.requireNonNull(ajstVar, "prefix must be non-null");
        j$.util.Objects.requireNonNull(obj, "primitive must be non-null");
        if (ajstVar.a() != 0 && ajstVar.a() != 5) {
            throw new java.security.GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        ((java.util.List) j$.util.Map.-EL.computeIfAbsent(map, ajstVar, new ailg(5))).add(obj);
    }

    public static byte[] H(java.math.BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new java.lang.IllegalArgumentException("n must not be negative");
    }

    public static byte[] I(java.math.BigInteger bigInteger, int i) throws java.security.GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new java.lang.IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i2 = i + 1;
        if (length > i2) {
            throw new java.security.GeneralSecurityException("integer too large");
        }
        if (length == i2) {
            if (byteArray[0] == 0) {
                return java.util.Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new java.security.GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }

    public static java.security.KeyStore J() throws java.security.GeneralSecurityException {
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }

    public static ajkm K(ajjm ajjmVar) {
        if (ajjmVar == ajjm.a) {
            return new ajkd(16);
        }
        if (ajjmVar == ajjm.b) {
            return new ajkd(32);
        }
        if (ajjmVar == ajjm.c) {
            return new ajke();
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static ajkp L(ajjp ajjpVar) {
        if (ajjpVar == ajjp.f) {
            return new ajkz(new ajyi("HmacSha256"), 0);
        }
        if (ajjpVar == ajjp.a) {
            return ajkz.c(ajsb.a);
        }
        if (ajjpVar == ajjp.b) {
            return ajkz.c(ajsb.b);
        }
        if (ajjpVar == ajjp.c) {
            return ajkz.c(ajsb.c);
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static ajjs M(ajjr ajjrVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajsb ajsbVar;
        byte[] bArr;
        ajst ajstVarB;
        ajyi ajyiVarB;
        ajjp ajjpVar = ajjrVar.a;
        if (ajjpVar.equals(ajjp.f)) {
            byte[] bArrB = ajna.b(32);
            bArrB[0] = (byte) (bArrB[0] | 7);
            int i = bArrB[31] & 63;
            bArrB[31] = (byte) i;
            bArrB[31] = (byte) (i | 128);
            ajyiVarB = ajyi.B(bArrB);
            ajstVarB = ajst.b(defpackage.agmc.ai(bArrB));
        } else {
            ajjp ajjpVar2 = ajjp.a;
            if (ajjpVar.equals(ajjpVar2) || ajjpVar.equals(ajjp.b) || ajjpVar.equals(ajjp.c)) {
                byte[] bArr2 = ajks.a;
                if (ajjpVar == ajjpVar2) {
                    ajsbVar = ajsb.a;
                } else if (ajjpVar == ajjp.b) {
                    ajsbVar = ajsb.b;
                } else {
                    if (ajjpVar != ajjp.c) {
                        throw new java.security.GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                    }
                    ajsbVar = ajsb.c;
                }
                java.security.KeyPair keyPairAp = defpackage.agmc.ap(defpackage.agmc.as(ajsbVar));
                ajsc ajscVar = ajsc.a;
                java.security.spec.ECPoint w = ((java.security.interfaces.ECPublicKey) keyPairAp.getPublic()).getW();
                java.security.spec.EllipticCurve curve = defpackage.agmc.as(ajsbVar).getCurve();
                ajlo.f(w, curve);
                int iAo = defpackage.agmc.ao(curve) + 7;
                int iOrdinal = ajscVar.ordinal();
                int i2 = iAo / 8;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        int i3 = i2 + 1;
                        bArr = new byte[i3];
                        byte[] bArrH = H(w.getAffineX());
                        int length = bArrH.length;
                        java.lang.System.arraycopy(bArrH, 0, bArr, i3 - length, length);
                        bArr[0] = true == w.getAffineY().testBit(0) ? (byte) 3 : (byte) 2;
                    } else {
                        if (iOrdinal != 2) {
                            throw new java.security.GeneralSecurityException("invalid format:".concat(ajscVar.toString()));
                        }
                        int i4 = i2 << 1;
                        bArr = new byte[i4];
                        byte[] bArrH2 = H(w.getAffineX());
                        int length2 = bArrH2.length;
                        if (length2 > i2) {
                            bArrH2 = java.util.Arrays.copyOfRange(bArrH2, length2 - i2, length2);
                        }
                        byte[] bArrH3 = H(w.getAffineY());
                        int length3 = bArrH3.length;
                        if (length3 > i2) {
                            bArrH3 = java.util.Arrays.copyOfRange(bArrH3, length3 - i2, length3);
                        }
                        int length4 = bArrH3.length;
                        java.lang.System.arraycopy(bArrH3, 0, bArr, i4 - length4, length4);
                        int length5 = bArrH2.length;
                        java.lang.System.arraycopy(bArrH2, 0, bArr, i2 - length5, length5);
                    }
                } else {
                    int i5 = i2 + 1;
                    int i6 = (i2 << 1) + 1;
                    bArr = new byte[i6];
                    byte[] bArrH4 = H(w.getAffineX());
                    byte[] bArrH5 = H(w.getAffineY());
                    int length6 = bArrH5.length;
                    java.lang.System.arraycopy(bArrH5, 0, bArr, i6 - length6, length6);
                    int length7 = bArrH4.length;
                    java.lang.System.arraycopy(bArrH4, 0, bArr, i5 - length7, length7);
                    bArr[0] = 4;
                }
                ajstVarB = ajst.b(bArr);
                ajyiVarB = ajyi.B(I(((java.security.interfaces.ECPrivateKey) keyPairAp.getPrivate()).getS(), ajks.b(ajjpVar)));
            } else {
                if (!ajjpVar.equals(ajjp.g)) {
                    throw new java.security.GeneralSecurityException("Unknown KEM ID");
                }
                java.security.Provider providerA = ajll.a();
                if (providerA == null) {
                    throw new java.security.GeneralSecurityException("Can't generate X-Wing key as Conscrypt is not available");
                }
                try {
                    java.security.KeyPair keyPairGenerateKeyPair = java.security.KeyPairGenerator.getInstance("XWING", providerA).generateKeyPair();
                    java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("XWING", providerA);
                    ajst ajstVarB2 = ajst.b(keyFactory.getKeySpec(keyPairGenerateKeyPair.getPublic(), ajkq.class).getEncoded());
                    ajyiVarB = ajyi.B(keyFactory.getKeySpec(keyPairGenerateKeyPair.getPrivate(), ajkq.class).getEncoded());
                    ajstVarB = ajstVarB2;
                } catch (java.lang.Exception e) {
                    throw new java.security.GeneralSecurityException("Can't generate X-Wing key", e);
                }
            }
        }
        return ajjs.ar(ajju.ap(ajjrVar, ajstVarB, num), ajyiVarB);
    }

    public static ajjk N(ajjj ajjjVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.spec.ECParameterSpec eCParameterSpec;
        ajjf ajjfVar = ajjjVar.b;
        if (ajjfVar == ajjf.a) {
            eCParameterSpec = ajlo.a;
        } else if (ajjfVar == ajjf.b) {
            eCParameterSpec = ajlo.b;
        } else {
            if (ajjfVar != ajjf.c) {
                throw new java.security.GeneralSecurityException("Unsupported curve type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajjfVar))));
            }
            eCParameterSpec = ajlo.c;
        }
        java.security.KeyPair keyPairAp = defpackage.agmc.ap(eCParameterSpec);
        return ajjk.ar(ajjl.aq(ajjjVar, ((java.security.interfaces.ECPublicKey) keyPairAp.getPublic()).getW(), num), new ajyi(((java.security.interfaces.ECPrivateKey) keyPairAp.getPrivate()).getS()));
    }

    public static long O(byte[] bArr, int i) {
        return ((long) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24))) & 4294967295L;
    }

    public static void P(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static ajng Q(ajnk ajnkVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarA;
        if (ajnkVar.a != ajyiVar.j()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (ajnkVar.dU() && num == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ajnkVar.dU() && num != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ajnj ajnjVar = ajnkVar.c;
        if (ajnjVar == ajnj.d) {
            ajstVarA = defpackage.ajmh.a;
        } else if (ajnjVar == ajnj.c || ajnjVar == ajnj.b) {
            ajstVarA = defpackage.ajmh.a(num.intValue());
        } else {
            if (ajnjVar != ajnj.a) {
                throw new java.lang.IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajnjVar))));
            }
            ajstVarA = defpackage.ajmh.b(num.intValue());
        }
        return new ajng(ajnkVar, ajyiVar, ajstVarA, num);
    }

    public static ajyi R(ajjo ajjoVar) {
        if (ajjoVar == ajjo.a) {
            return new ajyi("HmacSha256");
        }
        if (ajjoVar == ajjo.b) {
            return new ajyi("HmacSha384");
        }
        if (ajjoVar == ajjo.c) {
            return new ajyi("HmacSha512");
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static ajis S(ajiw ajiwVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        if (ajiwVar == null) {
            throw new java.lang.IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (ajiwVar.a != ajyiVar.j()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (ajiwVar.dU() && num == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ajiwVar.dU() && num != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ajiv ajivVar = ajiwVar.b;
        if (ajivVar == ajiv.c) {
            ajstVarB = defpackage.ajmh.a;
        } else if (ajivVar == ajiv.b) {
            ajstVarB = defpackage.ajmh.a(num.intValue());
        } else {
            if (ajivVar != ajiv.a) {
                throw new java.lang.IllegalStateException("Unknown AesSivParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajivVar))));
            }
            ajstVarB = defpackage.ajmh.b(num.intValue());
        }
        return new ajis(ajiwVar, ajyiVar, ajstVarB, num);
    }

    public static ajgn T(ajgq ajgqVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        if (ajgqVar.a != ajyiVar.j()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (ajgqVar.dU() && num == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ajgqVar.dU() && num != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ajgp ajgpVar = ajgqVar.b;
        if (ajgpVar == ajgp.c) {
            ajstVarB = defpackage.ajmh.a;
        } else if (ajgpVar == ajgp.b) {
            ajstVarB = defpackage.ajmh.a(num.intValue());
        } else {
            if (ajgpVar != ajgp.a) {
                throw new java.lang.IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajgpVar))));
            }
            ajstVarB = defpackage.ajmh.b(num.intValue());
        }
        return new ajgn(ajgqVar, ajyiVar, ajstVarB, num);
    }

    public static ajgi U(ajgm ajgmVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        if (ajgmVar.a != ajyiVar.j()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (ajgmVar.dU() && num == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ajgmVar.dU() && num != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ajgl ajglVar = ajgmVar.d;
        if (ajglVar == ajgl.c) {
            ajstVarB = defpackage.ajmh.a;
        } else if (ajglVar == ajgl.b) {
            ajstVarB = defpackage.ajmh.a(num.intValue());
        } else {
            if (ajglVar != ajgl.a) {
                throw new java.lang.IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajglVar))));
            }
            ajstVarB = defpackage.ajmh.b(num.intValue());
        }
        return new ajgi(ajgmVar, ajyiVar, ajstVarB, num);
    }

    public static ajgd V(ajgh ajghVar, ajyi ajyiVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        if (ajghVar.a != ajyiVar.j()) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        if (ajghVar.dU() && num == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ajghVar.dU() && num != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ajgg ajggVar = ajghVar.d;
        if (ajggVar == ajgg.c) {
            ajstVarB = defpackage.ajmh.a;
        } else if (ajggVar == ajgg.b) {
            ajstVarB = defpackage.ajmh.a(num.intValue());
        } else {
            if (ajggVar != ajgg.a) {
                throw new java.lang.IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajggVar))));
            }
            ajstVarB = defpackage.ajmh.b(num.intValue());
        }
        return new ajgd(ajghVar, ajyiVar, ajstVarB, num);
    }

    public static ajfx W(ajgc ajgcVar, ajyi ajyiVar, ajyi ajyiVar2, java.lang.Integer num) throws java.security.GeneralSecurityException {
        ajst ajstVarB;
        if (ajgcVar == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters");
        }
        if (ajgcVar.a != ajyiVar.j()) {
            throw new java.security.GeneralSecurityException("AES key size mismatch");
        }
        if (ajgcVar.b != ajyiVar2.j()) {
            throw new java.security.GeneralSecurityException("HMAC key size mismatch");
        }
        if (ajgcVar.dU() && num == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ajgcVar.dU() && num != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ajgb ajgbVar = ajgcVar.e;
        if (ajgbVar == ajgb.c) {
            ajstVarB = defpackage.ajmh.a;
        } else if (ajgbVar == ajgb.b) {
            ajstVarB = defpackage.ajmh.a(num.intValue());
        } else {
            if (ajgbVar != ajgb.a) {
                throw new java.lang.IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajgbVar))));
            }
            ajstVarB = defpackage.ajmh.b(num.intValue());
        }
        return new ajfx(ajgcVar, ajyiVar, ajyiVar2, ajstVarB, num);
    }

    private static boolean c(java.lang.String str) {
        return (str == null || android.text.TextUtils.isEmpty(str)) ? false : true;
    }

    public static void d(float f, float[] fArr) {
        float f2 = f + f;
        if (f <= 0.5f) {
            fArr[0] = 1.0f - f2;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = f2 - 1.0f;
        }
    }

    public static float e(android.content.ContentResolver contentResolver) {
        return android.provider.Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static boolean f() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return (str != null ? str.toLowerCase(java.util.Locale.ENGLISH) : "").equals("meizu");
    }

    public static boolean g(android.widget.EditText editText) {
        return editText.getInputType() != 0;
    }

    public static android.graphics.RectF h(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view) {
        if (view == null) {
            return new android.graphics.RectF();
        }
        if (tabLayout.w || !(view instanceof defpackage.agco)) {
            return new android.graphics.RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        defpackage.agco agcoVar = (defpackage.agco) view;
        android.view.View[] viewArr = {agcoVar.a, agcoVar.b, null};
        int right = 0;
        int left = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            android.view.View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                if (z) {
                    left = java.lang.Math.min(left, view2.getLeft());
                    right = java.lang.Math.max(right, view2.getRight());
                } else {
                    left = view2.getLeft();
                    right = view2.getRight();
                }
                z = true;
            }
        }
        int i2 = right - left;
        android.view.View[] viewArr2 = {agcoVar.a, agcoVar.b, null};
        int bottom = 0;
        int top = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            android.view.View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                if (z2) {
                    top = java.lang.Math.min(top, view3.getTop());
                    bottom = java.lang.Math.max(bottom, view3.getBottom());
                } else {
                    top = view3.getTop();
                    bottom = view3.getBottom();
                }
                z2 = true;
            }
        }
        int i4 = bottom - top;
        int iE = (int) agab.E(agcoVar.getContext(), 24);
        if (i2 < iE) {
            i2 = iE;
        }
        int left2 = (agcoVar.getLeft() + agcoVar.getRight()) / 2;
        int top2 = (agcoVar.getTop() + agcoVar.getBottom()) / 2;
        int i5 = i2 / 2;
        return new android.graphics.RectF(left2 - i5, top2 - (i4 / 2), left2 + i5, (left2 / 2) + top2);
    }

    public static android.graphics.Typeface j(android.content.res.Configuration configuration, android.graphics.Typeface typeface) {
        if (android.os.Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return ft$.ExternalSyntheticApiModelOutline0.m(typeface, dzk.B(ft$.ExternalSyntheticApiModelOutline0.m(typeface) + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void k(android.widget.TextView textView, agii agiiVar) {
        java.lang.String strK;
        boolean z;
        java.lang.Object obj;
        android.graphics.Typeface typefaceCreate;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int iB;
        int iB2;
        java.lang.Object obj4 = agiiVar.b;
        android.content.Context context = textView.getContext();
        if (obj4 != null) {
            defpackage.agfx agfxVar = (defpackage.agfx) obj4;
            if (defpackage.agfz.i(context).v(agfxVar) && (iB2 = defpackage.agfz.i(context).b(context, agfxVar)) != 0) {
                textView.setTextColor(iB2);
            }
        }
        java.lang.Enum r0 = agiiVar.c;
        if (r0 != null) {
            defpackage.agfx agfxVar2 = (defpackage.agfx) r0;
            if (defpackage.agfz.i(context).v(agfxVar2) && !p(textView) && (iB = defpackage.agfz.i(context).b(context, agfxVar2)) != 0) {
                textView.setLinkTextColor(iB);
            }
        }
        java.lang.Object obj5 = agiiVar.d;
        if (obj5 != null) {
            defpackage.agfx agfxVar3 = (defpackage.agfx) obj5;
            if (defpackage.agfz.i(context).v(agfxVar3)) {
                float fA = defpackage.agfz.i(context).a(context, agfxVar3, 0.0f);
                if (fA > 0.0f) {
                    textView.setTextSize(0, fA);
                }
            }
        }
        if (defpackage.agfz.t(context) && (obj3 = agiiVar.e) != null) {
            defpackage.agfx agfxVar4 = (defpackage.agfx) obj3;
            if (defpackage.agfz.i(context).v(agfxVar4)) {
                float fA2 = defpackage.agfz.i(context).a(context, agfxVar4, 0.0f);
                if (fA2 > 0.0f) {
                    ft$.ExternalSyntheticApiModelOutline0.m(textView, java.lang.Math.round(fA2));
                }
            }
        }
        java.lang.Object obj6 = agiiVar.k;
        android.graphics.Typeface typefaceM = null;
        if (obj6 != null) {
            defpackage.agfx agfxVar5 = (defpackage.agfx) obj6;
            if (defpackage.agfz.i(context).v(agfxVar5)) {
                strK = defpackage.agfz.i(context).k(context, agfxVar5);
                if (c(strK)) {
                    z = true;
                }
            } else {
                strK = null;
            }
            z = false;
        } else {
            strK = null;
            z = false;
        }
        java.lang.Object obj7 = agiiVar.f;
        if (obj7 != null) {
            defpackage.agfx agfxVar6 = (defpackage.agfx) obj7;
            if (defpackage.agfz.i(context).v(agfxVar6) && !z) {
                typefaceM = android.graphics.Typeface.create(defpackage.agfz.i(context).k(context, agfxVar6), 0);
            }
        }
        if (defpackage.agfz.r(context) && (obj2 = agiiVar.g) != null) {
            defpackage.agfx agfxVar7 = (defpackage.agfx) obj2;
            if (defpackage.agfz.i(context).v(agfxVar7) && !z) {
                int iC = defpackage.agfz.i(context).c(context, agfxVar7, 400);
                if (typefaceM == null) {
                    typefaceM = textView.getTypeface();
                }
                typefaceM = ft$.ExternalSyntheticApiModelOutline0.m(typefaceM, iC, false);
            }
        }
        if (typefaceM != null) {
            textView.setTypeface(typefaceM);
        }
        if (c(strK)) {
            try {
                textView.setFontVariationSettings(strK);
            } catch (java.lang.Exception e) {
                android.util.Log.e("TextViewPartnerStyler", "Failed to set font variation settings: ".concat(java.lang.String.valueOf(e.getMessage())));
            }
        }
        if ((textView instanceof com.google.android.setupdesign.view.RichTextView) && (obj = agiiVar.h) != null) {
            defpackage.agfx agfxVar8 = (defpackage.agfx) obj;
            if (defpackage.agfz.i(context).v(agfxVar8) && (typefaceCreate = android.graphics.Typeface.create(defpackage.agfz.i(context).k(context, agfxVar8), 0)) != null) {
                com.google.android.setupdesign.view.RichTextView.a = typefaceCreate;
            }
        }
        l(textView, agiiVar);
        textView.setGravity(agiiVar.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    public static void l(android.widget.TextView textView, agii agiiVar) {
        int iA;
        int iA2;
        java.lang.Object obj = agiiVar.i;
        if (obj == null && agiiVar.j == null) {
            return;
        }
        android.content.Context context = textView.getContext();
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            if (obj != null) {
                defpackage.agfx agfxVar = (defpackage.agfx) obj;
                if (defpackage.agfz.i(context).v(agfxVar)) {
                    iA = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f);
                } else {
                    iA = layoutParams2.topMargin;
                }
            } else {
                iA = layoutParams2.topMargin;
            }
            java.lang.Object obj2 = agiiVar.j;
            if (obj2 != null) {
                defpackage.agfx agfxVar2 = (defpackage.agfx) obj2;
                if (defpackage.agfz.i(context).v(agfxVar2)) {
                    iA2 = (int) defpackage.agfz.i(context).a(context, agfxVar2, 0.0f);
                } else {
                    iA2 = layoutParams2.bottomMargin;
                }
            } else {
                iA2 = layoutParams2.bottomMargin;
            }
            layoutParams2.setMargins(layoutParams2.leftMargin, iA, layoutParams2.rightMargin, iA2);
            textView.setLayoutParams(layoutParams);
        }
    }

    public static int m(android.content.Context context) {
        java.lang.String strK = defpackage.agfz.i(context).k(context, defpackage.agfx.CONFIG_LAYOUT_GRAVITY);
        if (strK == null) {
            return 0;
        }
        java.lang.String lowerCase = strK.toLowerCase(java.util.Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1364013995) {
            return (iHashCode == 109757538 && lowerCase.equals("start")) ? 8388611 : 0;
        }
        return lowerCase.equals("center") ? 17 : 0;
    }

    public static com.google.android.setupcompat.internal.TemplateLayout n(android.app.Activity activity) {
        android.view.View viewFindViewById;
        if (activity == null || (viewFindViewById = activity.findViewById(2131429050)) == null) {
            return null;
        }
        return (com.google.android.setupcompat.internal.TemplateLayout) viewFindViewById.getParent();
    }

    public static boolean o(android.view.View view) {
        android.app.Activity activityD;
        if (view == null) {
            return false;
        }
        if (view instanceof defpackage.agfh) {
            return ((defpackage.agfh) view).e();
        }
        android.content.Context context = view.getContext();
        if (!defpackage.agfz.i(context).o()) {
            return false;
        }
        try {
            xtq xtqVar = defpackage.agfh.c;
            activityD = defpackage.agfz.d(context);
            if (activityD != null) {
                try {
                    com.google.android.setupcompat.internal.TemplateLayout templateLayoutN = n(activityD);
                    if (templateLayoutN instanceof defpackage.agfh) {
                        return ((defpackage.agfh) templateLayoutN).e();
                    }
                } catch (java.lang.ClassCastException | java.lang.IllegalArgumentException unused) {
                }
            }
        } catch (java.lang.ClassCastException | java.lang.IllegalArgumentException unused2) {
            activityD = null;
        }
        boolean zX = activityD != null ? x(activityD.getIntent()) : false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970543});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        return zX || z;
    }

    public static boolean p(android.view.View view) {
        android.content.Context context = view.getContext();
        try {
            xtq xtqVar = defpackage.agfh.c;
            android.app.Activity activityD = defpackage.agfz.d(context);
            com.google.android.setupcompat.internal.TemplateLayout templateLayoutN = n(activityD);
            return templateLayoutN instanceof com.google.android.setupdesign.GlifLayout ? ((com.google.android.setupdesign.GlifLayout) templateLayoutN).d() : defpackage.agfz.y(activityD);
        } catch (java.lang.ClassCastException | java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    public static void q(android.view.View view) {
        int paddingEnd;
        if (view != null) {
            android.content.Context context = view.getContext();
            defpackage.agfz agfzVarI = defpackage.agfz.i(context);
            defpackage.agfx agfxVar = defpackage.agfx.CONFIG_LAYOUT_MARGIN_START;
            boolean zV = agfzVarI.v(agfxVar);
            defpackage.agfz agfzVarI2 = defpackage.agfz.i(context);
            defpackage.agfx agfxVar2 = defpackage.agfx.CONFIG_LAYOUT_MARGIN_END;
            boolean zV2 = agfzVarI2.v(agfxVar2);
            if (o(view)) {
                if (!zV) {
                    if (!zV2) {
                        return;
                    } else {
                        zV2 = true;
                    }
                }
                android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970673, 2130970672});
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                int iA = zV ? ((int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f)) - dimensionPixelSize : view.getPaddingStart();
                if (zV2) {
                    paddingEnd = ((int) defpackage.agfz.i(context).a(context, agfxVar2, 0.0f)) - dimensionPixelSize2;
                    if (view.getId() == 2131429100) {
                        paddingEnd = ((int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f)) - dimensionPixelSize2;
                    }
                } else {
                    paddingEnd = view.getPaddingEnd();
                    if (view.getId() == 2131429100) {
                        paddingEnd = view.getPaddingStart();
                    }
                }
                if (iA == view.getPaddingStart() && paddingEnd == view.getPaddingEnd()) {
                    return;
                }
                if (view.getId() != 2131429100) {
                    view.setPadding(iA, view.getPaddingTop(), paddingEnd, view.getPaddingBottom());
                    return;
                }
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : new android.view.ViewGroup.MarginLayoutParams(layoutParams);
                marginLayoutParams.setMargins(iA, marginLayoutParams.topMargin, paddingEnd, marginLayoutParams.bottomMargin);
            }
        }
    }

    public static int r(android.content.Context context) {
        int iA;
        int dimension = (int) context.getResources().getDimension(2131167558);
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_BACK_BUTTON_ICON_SIZE;
        return (!agfzVarI.v(agfxVar) || (iA = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f)) <= 0) ? dimension : (context.getResources().getDimensionPixelSize(2131167562) - context.getResources().getDimensionPixelSize(2131167559)) + iA;
    }

    public static int s(android.content.Context context, defpackage.agfx agfxVar, int i) {
        return defpackage.agfz.i(context).v(agfxVar) ? (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f) : i;
    }

    public static void t(android.widget.ImageView imageView, android.widget.FrameLayout frameLayout) {
        int i;
        if (imageView == null || frameLayout == null) {
            return;
        }
        android.content.Context context = imageView.getContext();
        int iM = m(context);
        if (iM != 0 && ((!defpackage.agfz.t(context) || defpackage.agfz.A(context)) && (imageView.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams))) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = iM;
            imageView.setLayoutParams(layoutParams);
        }
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_ICON_SIZE;
        int i2 = 0;
        if (agfzVarI.v(agfxVar)) {
            boolean z = imageView instanceof com.airbnb.lottie.LottieAnimationView;
            if (!z) {
                imageView.getViewTreeObserver().addOnPreDrawListener(new jvi(imageView, 4));
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = (int) defpackage.agfz.i(context).a(context, agfxVar, 0.0f);
            if (z) {
                layoutParams2.width = layoutParams2.height;
            } else {
                layoutParams2.width = -2;
            }
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > (drawable.getIntrinsicHeight() << 1)) {
                int dimension = (int) context.getResources().getDimension(2131167703);
                if (layoutParams2.height > dimension) {
                    i2 = layoutParams2.height - dimension;
                    layoutParams2.height = dimension;
                }
                if (z) {
                    layoutParams2.width = (int) ((layoutParams2.height * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight());
                }
            } else if (z && drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) {
                layoutParams2.width = (int) ((layoutParams2.height * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight());
            }
            imageView.setLayoutParams(layoutParams2);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        defpackage.agfz agfzVarI2 = defpackage.agfz.i(context);
        defpackage.agfx agfxVar2 = defpackage.agfx.CONFIG_ICON_MARGIN_TOP;
        if (agfzVarI2.v(agfxVar2) && (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
            int iA = (int) defpackage.agfz.i(context).a(context, agfxVar2, 0.0f);
            if (defpackage.agfz.t(context)) {
                i = iA + (i2 / 2);
                int iA2 = (int) defpackage.agfz.i(context).a(context, agfxVar, (int) context.getResources().getDimension(2131167671));
                int iR = r(context);
                if (iR > iA2 && iA2 > 0) {
                    i += (iR - iA2) / 2;
                }
            } else {
                i = iA + i2;
            }
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public static void u(com.google.android.setupcompat.internal.TemplateLayout templateLayout) {
        android.widget.LinearLayout linearLayout;
        android.view.Window window;
        android.view.WindowManager.LayoutParams attributes;
        defpackage.aghu aghuVar = (defpackage.aghu) templateLayout.j(defpackage.aghu.class);
        if (aghuVar == null || aghuVar.a() == null || aghuVar.a().getVisibility() != 0) {
            return;
        }
        android.content.Context context = templateLayout.getContext();
        aooh.e(context, "getContext(...)");
        android.view.View viewG = templateLayout.g(2131429104);
        android.view.View viewG2 = templateLayout.g(2131429047);
        android.widget.FrameLayout frameLayout = viewG2 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) viewG2 : null;
        if (viewG != null) {
            if (frameLayout == null) {
                android.view.View viewG3 = templateLayout.g(2131429050);
                frameLayout = viewG3 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) viewG3 : null;
            }
            if (frameLayout != null) {
                if (!aooh.n(viewG.getParent(), frameLayout)) {
                    android.view.ViewParent parent = viewG.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(viewG);
                    }
                    frameLayout.addView(viewG);
                }
                defpackage.agfz agfzVarI = defpackage.agfz.i(context);
                int iA = (int) agfzVarI.a(context, defpackage.agfx.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM, 0.0f);
                int iA2 = (int) agfzVarI.a(context, defpackage.agfx.CONFIG_LAYOUT_MARGIN_START, 0.0f);
                defpackage.aggf aggfVar = (defpackage.aggf) templateLayout.j(defpackage.aggf.class);
                if (!defpackage.agfz.J(context)) {
                    if (defpackage.agfz.A(context) && aggfVar != null) {
                        aggfVar.h();
                    }
                    android.app.Activity activityD = defpackage.agfz.d(templateLayout.getContext());
                    boolean z = activityD == null || (window = activityD.getWindow()) == null || (attributes = window.getAttributes()) == null || (attributes.softInputMode & 240) != 48;
                    int i = dzs.a;
                    eax eaxVarA = dzl.a(templateLayout);
                    int i2 = eaxVarA != null ? eaxVarA.f(true != z ? 519 : 527).e : 0;
                    if (aggfVar != null && (linearLayout = aggfVar.f) != null && linearLayout.getVisibility() != 8) {
                        iA += i2;
                    } else if (i2 > 0) {
                        iA = 0;
                    }
                }
                android.view.ViewGroup.LayoutParams layoutParams = viewG.getLayoutParams();
                android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                }
                if (layoutParams2.gravity != 8388691 || layoutParams2.getMarginStart() != iA2 || layoutParams2.bottomMargin != iA) {
                    layoutParams2.gravity = 8388691;
                    layoutParams2.setMarginStart(iA2);
                    layoutParams2.setMarginEnd(0);
                    layoutParams2.topMargin = 0;
                    layoutParams2.bottomMargin = iA;
                    viewG.setLayoutParams(layoutParams2);
                }
                android.widget.LinearLayout linearLayout2 = aggfVar != null ? aggfVar.f : null;
                if (linearLayout2 != null) {
                    defpackage.aggf.f(viewG, linearLayout2);
                    viewG.setAccessibilityTraversalBefore(linearLayout2.getId());
                }
            }
        }
    }

    public static void v(android.text.Spannable spannable, java.lang.Object obj, java.lang.Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        for (java.lang.Object obj2 : objArr) {
            spannable.setSpan(obj2, spanStart, spanEnd, 0);
        }
    }

    public static void w(android.content.Intent intent, android.content.Intent intent2) {
        intent2.putExtra("wizardBundle", intent.getBundleExtra("wizardBundle"));
        intent2.putExtra("pendingActivityMetadata", intent.getBundleExtra("pendingActivityMetadata"));
        for (java.lang.String str : java.util.Arrays.asList("firstRun", "deferredSetup", "preDeferredSetup", "portalSetup", "isSetupFlow", "isSuwSuggestedActionFlow")) {
            intent2.putExtra(str, intent.getBooleanExtra(str, false));
        }
        intent2.putExtra("suw_lifecycle", intent.getIntExtra("suw_lifecycle", 0));
        intent2.putExtra("theme", intent.getStringExtra("theme"));
    }

    public static boolean x(android.content.Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra("isSetupFlow", false);
        }
        return false;
    }

    public static boolean y(android.content.Context context) {
        return android.provider.Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 0) == 1;
    }

    public static boolean z(android.content.Context context) {
        android.content.res.Configuration configuration = context.getResources().getConfiguration();
        return (configuration.keyboard == 1 || configuration.hardKeyboardHidden == 2) ? false : true;
    }

    public void i(com.google.android.material.tabs.TabLayout tabLayout, android.view.View view, android.view.View view2, float f, android.graphics.drawable.Drawable drawable) {
        android.graphics.RectF rectFH = h(tabLayout, view);
        android.graphics.RectF rectFH2 = h(tabLayout, view2);
        drawable.setBounds(afpc.b((int) rectFH.left, (int) rectFH2.left, f), drawable.getBounds().top, afpc.b((int) rectFH.right, (int) rectFH2.right, f), drawable.getBounds().bottom);
    }

    public aftt(byte[] bArr) {
    }

    public void b(java.lang.Object obj) {
    }

    public void a(java.lang.Object obj, int i) {
    }
}
