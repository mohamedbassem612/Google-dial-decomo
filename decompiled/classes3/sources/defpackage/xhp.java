package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xhp {
    protected /* synthetic */ xhp() {
    }

    private static java.lang.String A(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new java.lang.IllegalArgumentException(a.bj(i, "Unknown content digest algorthm: "));
    }

    private static java.nio.ByteBuffer B(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer.remaining() < 4) {
            throw new java.io.IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return afsq.bO(byteBuffer, i);
        }
        throw new java.io.IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    private static void C(java.util.Map map, java.nio.channels.FileChannel fileChannel, long j, long j2, long j3, java.nio.ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new java.lang.SecurityException("No digests provided");
        }
        defpackage.xqn xqnVar = new defpackage.xqn(fileChannel, 0L, j);
        defpackage.xqn xqnVar2 = new defpackage.xqn(fileChannel, j2, j3 - j2);
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        afsq.bN(byteBufferDuplicate);
        int iPosition = byteBufferDuplicate.position() + 16;
        if (j < 0 || j > 4294967295L) {
            throw new java.lang.IllegalArgumentException(a.bz(j, "uint32 value of out range: "));
        }
        byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
        defpackage.xql xqlVar = new defpackage.xql(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        java.util.Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrF = F(iArr, new defpackage.xqm[]{xqnVar, xqnVar2, xqlVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!java.security.MessageDigest.isEqual((byte[]) map.get(java.lang.Integer.valueOf(i3)), bArrF[i2])) {
                    throw new java.lang.SecurityException(A(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (java.security.DigestException e) {
            throw new java.lang.SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] D(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new java.io.IOException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new java.io.IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }

    private static java.security.cert.X509Certificate[] E(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.security.cert.CertificateFactory certificateFactory) throws java.io.IOException {
        java.lang.String str;
        android.util.Pair pairCreate;
        java.nio.ByteBuffer byteBufferB = B(byteBuffer);
        java.nio.ByteBuffer byteBufferB2 = B(byteBuffer);
        byte[] bArrD = D(byteBuffer);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArrD2 = null;
        byte[] bArrD3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferB2.hasRemaining()) {
            i2++;
            try {
                java.nio.ByteBuffer byteBufferB3 = B(byteBufferB2);
                if (byteBufferB3.remaining() < 8) {
                    throw new java.lang.SecurityException("Signature record too short");
                }
                int i3 = byteBufferB3.getInt();
                arrayList.add(java.lang.Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iZ = z(i3);
                    int iZ2 = z(i);
                    if (iZ == 1 || iZ2 != 1) {
                    }
                }
                bArrD3 = D(byteBufferB3);
                i = i3;
            } catch (java.io.IOException | java.nio.BufferUnderflowException e) {
                throw new java.lang.SecurityException(a.bj(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new java.lang.SecurityException("No signatures found");
            }
            throw new java.lang.SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = android.util.Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = android.util.Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = android.util.Pair.create("SHA256withRSA/PSS", new java.security.spec.PSSParameterSpec("SHA-256", "MGF1", java.security.spec.MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = android.util.Pair.create("SHA512withRSA/PSS", new java.security.spec.PSSParameterSpec("SHA-512", "MGF1", java.security.spec.MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = android.util.Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = android.util.Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
            }
        } else {
            pairCreate = android.util.Pair.create("SHA256withDSA", null);
        }
        java.lang.String str2 = (java.lang.String) pairCreate.first;
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec = (java.security.spec.AlgorithmParameterSpec) pairCreate.second;
        try {
            java.security.PublicKey publicKeyGeneratePublic = java.security.KeyFactory.getInstance(str).generatePublic(new java.security.spec.X509EncodedKeySpec(bArrD));
            java.security.Signature signature = java.security.Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferB);
            if (!signature.verify(bArrD3)) {
                throw new java.lang.SecurityException(java.lang.String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferB.clear();
            java.nio.ByteBuffer byteBufferB4 = B(byteBufferB);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i4 = 0;
            while (byteBufferB4.hasRemaining()) {
                i4++;
                try {
                    java.nio.ByteBuffer byteBufferB5 = B(byteBufferB4);
                    if (byteBufferB5.remaining() < 8) {
                        throw new java.io.IOException("Record too short");
                    }
                    int i5 = byteBufferB5.getInt();
                    arrayList2.add(java.lang.Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrD2 = D(byteBufferB5);
                    }
                } catch (java.io.IOException | java.nio.BufferUnderflowException e2) {
                    throw new java.io.IOException(a.bj(i4, "Failed to parse digest record #"), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new java.lang.SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZ3 = z(i);
            byte[] bArr = (byte[]) map.put(java.lang.Integer.valueOf(iZ3), bArrD2);
            if (bArr != null && !java.security.MessageDigest.isEqual(bArr, bArrD2)) {
                throw new java.lang.SecurityException(A(iZ3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            java.nio.ByteBuffer byteBufferB6 = B(byteBufferB);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i6 = 0;
            while (byteBufferB6.hasRemaining()) {
                i6++;
                byte[] bArrD4 = D(byteBufferB6);
                try {
                    arrayList3.add(new defpackage.xqq((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(bArrD4)), bArrD4));
                } catch (java.security.cert.CertificateException e3) {
                    throw new java.lang.SecurityException(a.bj(i6, "Failed to decode certificate #"), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new java.lang.SecurityException("No certificates listed");
            }
            if (java.util.Arrays.equals(bArrD, ((java.security.cert.X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (java.security.cert.X509Certificate[]) arrayList3.toArray(new java.security.cert.X509Certificate[arrayList3.size()]);
            }
            throw new java.lang.SecurityException("Public key mismatch between certificate and signature record");
        } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.spec.InvalidKeySpecException e4) {
            throw new java.lang.SecurityException(a.bk(str2, "Failed to verify ", " signature"), e4);
        }
    }

    private static byte[][] F(int[] iArr, defpackage.xqm[] xqmVarArr) throws java.security.DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2 = 0;
        long jA = 0;
        while (true) {
            j = 1048576;
            if (i2 >= 3) {
                break;
            }
            jA += (xqmVarArr[i2].a() + 1048575) / 1048576;
            i2++;
        }
        if (jA >= 2097151) {
            throw new java.security.DigestException(a.bz(jA, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i3 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i3 >= length) {
                break;
            }
            int i4 = (int) jA;
            byte[] bArr2 = new byte[(y(iArr[i3]) * i4) + 5];
            bArr2[0] = 90;
            G(i4, bArr2);
            bArr[i3] = bArr2;
            i3++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        java.security.MessageDigest[] messageDigestArr = new java.security.MessageDigest[length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            java.lang.String strA = A(iArr[i5]);
            try {
                messageDigestArr[i5] = java.security.MessageDigest.getInstance(strA);
            } catch (java.security.NoSuchAlgorithmException e) {
                throw new java.lang.RuntimeException(strA.concat(" digest not supported"), e);
            }
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i6 < i; i = 3) {
            defpackage.xqm xqmVar = xqmVarArr[i6];
            int i9 = i6;
            long jA2 = xqmVar.a();
            long j2 = 0;
            while (jA2 > 0) {
                char c2 = c;
                int i10 = i7;
                int iMin = (int) java.lang.Math.min(jA2, j);
                G(iMin, bArr3);
                for (int i11 = 0; i11 < length; i11++) {
                    messageDigestArr[i11].update(bArr3);
                }
                try {
                    xqmVar.b(messageDigestArr, j2, iMin);
                    int i12 = 0;
                    while (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        byte[] bArr4 = bArr[i12];
                        int iY = y(i13);
                        defpackage.xqm xqmVar2 = xqmVar;
                        java.security.MessageDigest messageDigest = messageDigestArr[i12];
                        long j3 = jA2;
                        int iDigest = messageDigest.digest(bArr4, (i10 * iY) + 5, iY);
                        if (iDigest != iY) {
                            throw new java.lang.RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i12++;
                        xqmVar = xqmVar2;
                        jA2 = j3;
                    }
                    defpackage.xqm xqmVar3 = xqmVar;
                    long j4 = iMin;
                    j2 += j4;
                    i7 = i10 + 1;
                    jA2 -= j4;
                    c = c2;
                    xqmVar = xqmVar3;
                    j = 1048576;
                } catch (java.io.IOException e2) {
                    throw new java.security.DigestException(a.bf(i8, i10, "Failed to digest chunk #", " of section #"), e2);
                }
            }
            i8++;
            i6 = i9 + 1;
            j = 1048576;
        }
        byte[][] bArr5 = new byte[iArr.length][];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            byte[] bArr6 = bArr[i14];
            java.lang.String strA2 = A(i15);
            try {
                bArr5[i14] = java.security.MessageDigest.getInstance(strA2).digest(bArr6);
            } catch (java.security.NoSuchAlgorithmException e3) {
                throw new java.lang.RuntimeException(strA2.concat(" digest not supported"), e3);
            }
        }
        return bArr5;
    }

    private static void G(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long a(android.content.Context context) {
        aooh.f(context, "<this>");
        j$.util.Objects.checkIndex(0, 3);
        if (context != 0) {
            if (context instanceof defpackage.xhx) {
                return ((defpackage.xhx) context).d();
            }
            if (context instanceof android.app.Activity) {
                return b((android.app.Activity) context);
            }
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long b(android.app.Activity activity) {
        aooh.f(activity, "<this>");
        if (activity instanceof defpackage.xhx) {
            return ((defpackage.xhx) activity).d();
        }
        android.content.Intent intent = activity.getIntent();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        activity.setIntent(intent);
        android.content.Intent intent2 = activity.getIntent();
        aooh.e(intent2, "getIntent(...)");
        return c(intent2);
    }

    public static long c(android.content.Intent intent) {
        aooh.f(intent, "<this>");
        long longExtra = intent.getLongExtra("com.android.onboarding.ONBOARDING_NODE_ID", -1L);
        if (longExtra != -1) {
            return longExtra;
        }
        long jC = defpackage.xfc.c();
        intent.putExtra("com.android.onboarding.ONBOARDING_NODE_ID", jC);
        return jC;
    }

    public static long d(android.os.BaseBundle baseBundle) {
        aooh.f(baseBundle, "<this>");
        long j = baseBundle.getLong("com.android.onboarding.ONBOARDING_NODE_ID", -1L);
        if (j != -1) {
            return j;
        }
        long jC = defpackage.xfc.c();
        baseBundle.putLong("com.android.onboarding.ONBOARDING_NODE_ID", jC);
        return jC;
    }

    public static java.lang.String e(defpackage.xhu xhuVar) {
        java.lang.String nodeComponent = xhuVar.getNodeComponent();
        aooh.f(nodeComponent, "<this>");
        aooh.f(nodeComponent, "missingDelimiterValue");
        int iW = aoov.w(nodeComponent, "/", 0, false);
        if (iW == -1) {
            return nodeComponent;
        }
        java.lang.String strSubstring = nodeComponent.substring(0, iW);
        aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static java.lang.String f(defpackage.xhu xhuVar) {
        java.lang.String strD = aoov.D(xhuVar.getNodeComponent(), "/", aoov.D(xhuVar.getNodeComponent(), ".", ""));
        if (true == aoov.H(strD)) {
            strD = null;
        }
        if (strD != null) {
            return strD;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    public static defpackage.xmm g(defpackage.xib xibVar, long j, defpackage.xhl xhlVar, defpackage.xmn xmnVar) {
        aooh.f(xibVar, "nodeRef");
        aooh.f(xmnVar, "failureReason");
        return new defpackage.xmm(defpackage.xml.a, xibVar, j, null, null, xhlVar, xmnVar);
    }

    public static /* synthetic */ defpackage.xmm h(defpackage.xjz xjzVar, defpackage.xhl xhlVar, defpackage.xmn xmnVar, int i) {
        if ((i & 8) != 0) {
            xmnVar = defpackage.xmn.UNSPECIFIED;
        }
        aooh.f(xjzVar, "nodeRef");
        aooh.f(xmnVar, "failureReason");
        return g(xjzVar, xjzVar.d(), xhlVar, xmnVar);
    }

    public static int i(defpackage.xjz xjzVar) {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(defpackage.xff.c(xjzVar)), java.lang.Long.valueOf(xjzVar.d())});
    }

    public static boolean j(defpackage.xjz xjzVar, defpackage.xjz xjzVar2) {
        aooh.f(xjzVar, "<this>");
        return defpackage.xff.d(xjzVar, xjzVar2) && xjzVar.d() == xjzVar2.d();
    }

    public static long k(java.nio.ByteBuffer byteBuffer, int i) {
        return ((long) byteBuffer.getInt(i)) & 4294967295L;
    }

    public static android.util.Pair l(java.io.RandomAccessFile randomAccessFile, int i) throws java.io.IOException {
        int i2;
        long length = randomAccessFile.length();
        if (length >= 22) {
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(((int) java.lang.Math.min(i, (-22) + length)) + 22);
            byteBufferAllocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            long jCapacity = length - ((long) byteBufferAllocate.capacity());
            randomAccessFile.seek(jCapacity);
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            afsq.bN(byteBufferAllocate);
            int iCapacity = byteBufferAllocate.capacity();
            if (iCapacity < 22) {
                i2 = -1;
                break;
            }
            int i3 = iCapacity - 22;
            int iMin = java.lang.Math.min(i3, 65535);
            int i4 = 0;
            while (true) {
                if (i4 >= iMin) {
                    i2 = -1;
                    break;
                }
                i2 = i3 - i4;
                if (byteBufferAllocate.getInt(i2) == 101010256 && ((char) byteBufferAllocate.getShort(i2 + 20)) == i4) {
                    break;
                }
                i4++;
            }
            if (i2 != -1) {
                byteBufferAllocate.position(i2);
                java.nio.ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
                byteBufferSlice.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                return android.util.Pair.create(byteBufferSlice, java.lang.Long.valueOf(jCapacity + ((long) i2)));
            }
        }
        return null;
    }

    public static java.security.cert.X509Certificate[][] m(java.nio.channels.FileChannel fileChannel, defpackage.xqo xqoVar) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
            try {
                java.nio.ByteBuffer byteBufferB = B(xqoVar.a);
                int i = 0;
                while (byteBufferB.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(E(B(byteBufferB), map, certificateFactory));
                    } catch (java.io.IOException | java.lang.SecurityException | java.nio.BufferUnderflowException e) {
                        throw new java.lang.SecurityException(a.bs(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new java.lang.SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new java.lang.SecurityException("No content digests found");
                }
                C(map, fileChannel, xqoVar.b, xqoVar.c, xqoVar.d, xqoVar.e);
                return (java.security.cert.X509Certificate[][]) arrayList.toArray(new java.security.cert.X509Certificate[arrayList.size()][]);
            } catch (java.io.IOException e2) {
                throw new java.lang.SecurityException("Failed to read list of signers", e2);
            }
        } catch (java.security.cert.CertificateException e3) {
            throw new java.lang.RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    public static android.os.PersistableBundle n(defpackage.xpe xpeVar) {
        return defpackage.xpo.g(xpeVar.a());
    }

    public static void o(int i, int i2, int i3, j$.time.Duration duration, boolean z, int i4, int i5) {
        defpackage.yqm.b(a.S(i3), a.R(i4), defpackage.yoy.a(duration.toMillis()), i - 2, i2, a.T(true != z ? 4 : 3), i5);
    }

    public static void p(j$.time.Duration duration, int i, int i2) {
        defpackage.yqm.b(a.S(3), a.R(i), defpackage.yoy.a(duration.toMillis()), 0, 0, a.T(i == 5 ? 4 : 3), i2);
    }

    public static /* synthetic */ java.lang.String q(int i) {
        switch (i) {
            case 1:
                return "STRINGVALUE";
            case 2:
                return "BOOLVALUE";
            case 3:
                return "INTVALUE";
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return "DOUBLEVALUE";
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return "LISTVALUE";
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return "LONGVALUE";
            default:
                return "MAPVALUE";
        }
    }

    public static void r(ahzp ahzpVar, int i, int i2, defpackage.ync yncVar, int i3, int i4) {
        o(i, i2, 5, defpackage.ypf.a(yncVar.a, new defpackage.ypf(ahzpVar)), yncVar.b, i3, i4);
    }

    public static void s(java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static com.google.android.apps.aicore.aidl.FunctionArgsValue t(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcelable.Creator creator = com.google.android.apps.aicore.aidl.FunctionArgsValue.CREATOR;
        byte[] byteArray = bundle.getByteArray(str);
        ahvr.ci(byteArray);
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            return (com.google.android.apps.aicore.aidl.FunctionArgsValue) ((com.google.android.apps.aicore.aidl.Bundleable) creator.createFromParcel(parcelObtain));
        } finally {
            parcelObtain.recycle();
        }
    }

    public static /* synthetic */ aigf u(android.os.Bundle bundle) {
        aigb aigbVar = new aigb(4);
        for (java.lang.String str : bundle.keySet()) {
            com.google.android.apps.aicore.aidl.ResponseSchema responseSchema = com.google.android.apps.aicore.aidl.FunctionArgsValue.a;
            com.google.android.apps.aicore.aidl.FunctionArgsValue functionArgsValueT = t(bundle, str);
            if (functionArgsValueT != null) {
                aigbVar.i(str, functionArgsValueT);
            }
        }
        return aigbVar.e(true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static boolean v(defpackage.ykv ykvVar) throws aois {
        aooh.f(ykvVar, "<this>");
        if (aooh.n(ykvVar, defpackage.yku.a)) {
            return false;
        }
        if (ykvVar instanceof defpackage.ykt) {
            return ((defpackage.ykt) ykvVar).a;
        }
        throw new aois();
    }

    public static boolean w(defpackage.ykv ykvVar) {
        aooh.f(ykvVar, "<this>");
        return aooh.n(ykvVar, defpackage.yku.a);
    }

    public static void x(java.util.List list, emp empVar, cav cavVar, int i) {
        int i2;
        aooh.f(list, "permissions");
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(1533427666);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(list) : cbtVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        int i5 = 0;
        if (cbtVarB.H((i4 & 19) != 18, i4 & 1)) {
            int i6 = i4 & 14;
            emp empVar2 = emp.ON_RESUME;
            if (i6 != 4 && ((i4 & 8) == 0 || !cbtVarB.B(list))) {
                z = false;
            }
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (z || objR == cau.a) {
                objR = new defpackage.ykw(empVar2, list, i5);
                cbtVar.ab(objR);
            }
            emv emvVar = (emv) objR;
            ems emsVarP = ((emx) cbtVarB.e(eom.a)).P();
            boolean zD = cbtVarB.D(emsVarP) | cbtVarB.D(emvVar);
            java.lang.Object objR2 = cbtVar.R();
            if (zD || objR2 == cau.a) {
                objR2 = new uph(emsVarP, emvVar, 14, (byte[]) null);
                cbtVar.ab(objR2);
            }
            cbp.b(emsVarP, emvVar, (aonj) objR2, cbtVarB);
            empVar = empVar2;
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new slz(list, empVar, i, 10);
        }
    }

    private static int y(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new java.lang.IllegalArgumentException(a.bj(i, "Unknown content digest algorthm: "));
    }

    private static int z(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            break;
                        case 258:
                        case 260:
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException("Unknown signature algorithm: 0x".concat(java.lang.String.valueOf(java.lang.Long.toHexString(i))));
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public xhp(byte[] bArr) {
    }
}
