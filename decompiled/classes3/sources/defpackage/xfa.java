package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xfa implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public xfa(int i) {
        this.$cid = i;
    }

    public static final com.google.android.apps.aicore.aidl.InferenceEventTraceResult a(android.os.Parcel parcel) {
        int iK = aais.K(parcel);
        int I = 0;
        long jL = -1;
        long jL2 = -1;
        long jL3 = -1;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        boolean zAb = false;
        int I7 = 0;
        int I8 = 0;
        int I9 = 0;
        int I10 = 0;
        int I11 = 0;
        int I12 = 0;
        int I13 = 0;
        int I14 = 0;
        int I15 = 0;
        int I16 = 0;
        int I17 = 0;
        int I18 = 0;
        int I19 = 0;
        int I20 = 0;
        int I21 = 0;
        int I22 = 0;
        int I23 = 0;
        int I24 = 0;
        int I25 = 0;
        int I26 = 0;
        byte[] bArrAc = null;
        int[] iArrAd = null;
        byte[] bArrAc2 = null;
        byte[] bArrAc3 = null;
        long[] jArrAe = null;
        byte[] bArrAc4 = null;
        byte[] bArrAc5 = null;
        byte[] bArrAc6 = null;
        long jL4 = 0;
        long jL5 = 0;
        long jL6 = 0;
        long jL7 = 0;
        long jL8 = 0;
        long jL9 = 0;
        long jL10 = 0;
        long jL11 = 0;
        long jL12 = 0;
        long jL13 = 0;
        long jL14 = 0;
        long jL15 = 0;
        long jL16 = 0;
        long jL17 = 0;
        long jL18 = 0;
        long jL19 = 0;
        long jL20 = 0;
        int I27 = -1;
        int I28 = -1;
        int I29 = -1;
        java.lang.String strU = "unknown";
        float fH = 0.0f;
        double dG = 0.0d;
        double dG2 = 0.0d;
        int I30 = 0;
        int I31 = 0;
        int I32 = 0;
        int I33 = 0;
        int I34 = 0;
        long jL21 = 0;
        long jL22 = 0;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            int i2 = I2;
            switch ((char) i) {
                case 1:
                    I2 = aais.I(parcel, i);
                    continue;
                case 2:
                    I = aais.I(parcel, i);
                    break;
                case 3:
                    I30 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    I31 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    jL21 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    I32 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    I33 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    I34 = aais.I(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    jL22 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    jL4 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    jL5 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    jL6 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    jL7 = aais.L(parcel, i);
                    break;
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    jL8 = aais.L(parcel, i);
                    break;
                case 15:
                    I3 = aais.I(parcel, i);
                    break;
                case 16:
                    I4 = aais.I(parcel, i);
                    break;
                case 17:
                    I5 = aais.I(parcel, i);
                    break;
                case 18:
                    I6 = aais.I(parcel, i);
                    break;
                case 19:
                    zAb = aais.ab(parcel, i);
                    break;
                case 20:
                    I7 = aais.I(parcel, i);
                    break;
                case 21:
                    jL9 = aais.L(parcel, i);
                    break;
                case 22:
                    dG = aais.G(parcel, i);
                    break;
                case 23:
                    dG2 = aais.G(parcel, i);
                    break;
                case 24:
                    I8 = aais.I(parcel, i);
                    break;
                case 25:
                    fH = aais.H(parcel, i);
                    break;
                case 26:
                    bArrAc = aais.ac(parcel, i);
                    break;
                case 27:
                    I9 = aais.I(parcel, i);
                    break;
                case 28:
                    I10 = aais.I(parcel, i);
                    break;
                case 29:
                    jL10 = aais.L(parcel, i);
                    break;
                case 30:
                    jL11 = aais.L(parcel, i);
                    break;
                case 31:
                    I27 = aais.I(parcel, i);
                    break;
                case ' ':
                    I11 = aais.I(parcel, i);
                    break;
                case '!':
                    I12 = aais.I(parcel, i);
                    break;
                case '\"':
                    I13 = aais.I(parcel, i);
                    break;
                case '#':
                    I14 = aais.I(parcel, i);
                    break;
                case '$':
                    I15 = aais.I(parcel, i);
                    break;
                case '%':
                    I28 = aais.I(parcel, i);
                    break;
                case '&':
                    I16 = aais.I(parcel, i);
                    break;
                case '\'':
                    jL12 = aais.L(parcel, i);
                    break;
                case '(':
                    jL13 = aais.L(parcel, i);
                    break;
                case ')':
                    iArrAd = aais.ad(parcel, i);
                    break;
                case '*':
                    I17 = aais.I(parcel, i);
                    break;
                case '+':
                    strU = aais.U(parcel, i);
                    break;
                case ',':
                    bArrAc2 = aais.ac(parcel, i);
                    break;
                case '-':
                    I29 = aais.I(parcel, i);
                    break;
                case '.':
                    jL14 = aais.L(parcel, i);
                    break;
                case '/':
                    bArrAc3 = aais.ac(parcel, i);
                    break;
                case '0':
                    I18 = aais.I(parcel, i);
                    break;
                case '1':
                default:
                    aais.aa(parcel, i);
                    break;
                case '2':
                    jArrAe = aais.ae(parcel, i);
                    break;
                case '3':
                    jL15 = aais.L(parcel, i);
                    break;
                case '4':
                    jL16 = aais.L(parcel, i);
                    break;
                case '5':
                    I19 = aais.I(parcel, i);
                    break;
                case '6':
                    I20 = aais.I(parcel, i);
                    break;
                case '7':
                    jL17 = aais.L(parcel, i);
                    break;
                case '8':
                    jL18 = aais.L(parcel, i);
                    break;
                case '9':
                    bArrAc4 = aais.ac(parcel, i);
                    break;
                case ':':
                    bArrAc5 = aais.ac(parcel, i);
                    break;
                case ';':
                    jL19 = aais.L(parcel, i);
                    break;
                case '<':
                    I21 = aais.I(parcel, i);
                    break;
                case '=':
                    jL20 = aais.L(parcel, i);
                    break;
                case '>':
                    I22 = aais.I(parcel, i);
                    break;
                case '?':
                    jL = aais.L(parcel, i);
                    break;
                case '@':
                    jL2 = aais.L(parcel, i);
                    break;
                case 'A':
                    bArrAc6 = aais.ac(parcel, i);
                    break;
                case 'B':
                    I23 = aais.I(parcel, i);
                    break;
                case 'C':
                    I24 = aais.I(parcel, i);
                    break;
                case 'D':
                    I25 = aais.I(parcel, i);
                    break;
                case 'E':
                    I26 = aais.I(parcel, i);
                    break;
                case 'F':
                    jL3 = aais.L(parcel, i);
                    break;
            }
            I2 = i2;
        }
        aais.Y(parcel, iK);
        return new com.google.android.apps.aicore.aidl.InferenceEventTraceResult(I2, I, I30, I31, jL21, I32, I33, I34, jL22, jL4, jL5, jL6, jL7, jL8, I3, I4, I5, I6, zAb, I7, jL9, dG, dG2, I8, fH, bArrAc, I9, I10, jL10, jL11, I27, I11, I12, I13, I14, I15, I28, I16, jL12, jL13, iArrAd, I17, strU, bArrAc2, I29, jL14, bArrAc3, I18, jArrAe, jL15, jL16, I19, I20, jL17, jL18, bArrAc4, bArrAc5, jL19, I21, jL20, I22, jL, jL2, bArrAc6, I23, I24, I25, I26, jL3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object workerForegroundPriorityConfig;
        java.lang.Object aiCoreException;
        boolean zAb = false;
        int I = 0;
        int I2 = 0;
        int I3 = 0;
        java.util.ArrayList arrayListX = null;
        java.util.ArrayList arrayListX2 = null;
        java.util.ArrayList arrayListX3 = null;
        java.util.ArrayList arrayListX4 = null;
        com.google.android.apps.aicore.aidl.LLMAudio lLMAudio = null;
        byte[] bArrAc = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails quotaExceededErrorDetails = null;
        java.util.ArrayList arrayListX5 = null;
        java.lang.String strU = null;
        java.lang.String strU2 = null;
        java.lang.String strU3 = null;
        java.util.ArrayList arrayListX6 = null;
        com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = null;
        java.lang.String strU4 = null;
        switch (this.$cid) {
            case 0:
                aooh.f(parcel, "parcel");
                int i = parcel.readInt();
                java.util.ArrayList arrayList = new java.util.ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.CREATOR.createFromParcel(parcel));
                }
                workerForegroundPriorityConfig = new com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig(arrayList);
                return workerForegroundPriorityConfig;
            case 1:
                aooh.f(parcel, "parcel");
                return new com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority(parcel.readInt(), parcel.readInt());
            case 2:
                java.lang.ClassLoader classLoader = com.android.voicemail.impl.sms.VvmMessage.class.getClassLoader();
                defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
                aliqVar.w((android.telecom.PhoneAccountHandle) parcel.readParcelable(classLoader));
                aliqVar.c = parcel.readString();
                aliqVar.b = parcel.readBundle(classLoader);
                return aliqVar.v();
            case 3:
                int iK = aais.K(parcel);
                int I4 = 0;
                int I5 = 0;
                int I6 = 0;
                int I7 = 0;
                java.lang.String strU5 = null;
                java.lang.String strU6 = null;
                java.lang.String strU7 = null;
                int I8 = 0;
                while (parcel.dataPosition() < iK) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            strU5 = aais.U(parcel, i3);
                            break;
                        case 2:
                            strU6 = aais.U(parcel, i3);
                            break;
                        case 3:
                            I4 = aais.I(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            I5 = aais.I(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            I6 = aais.I(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            I3 = aais.I(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            I8 = aais.I(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            strU7 = aais.U(parcel, i3);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            I7 = aais.I(parcel, i3);
                            break;
                        default:
                            aais.aa(parcel, i3);
                            break;
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.android.apps.aicore.aidl.AIFeature(strU5, strU6, I4, I5, I6, I3, I8, strU7, I7);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK2 = aais.K(parcel);
                int I9 = 0;
                java.lang.String strU8 = null;
                com.google.android.apps.aicore.aidl.RetryDetails retryDetails = null;
                com.google.android.apps.aicore.aidl.InferenceErrorDetails inferenceErrorDetails = null;
                int I10 = 0;
                while (parcel.dataPosition() < iK2) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c == 1) {
                        I10 = aais.I(parcel, i4);
                    } else if (c == 2) {
                        I9 = aais.I(parcel, i4);
                    } else if (c == 3) {
                        strU8 = aais.U(parcel, i4);
                    } else if (c == 4) {
                        retryDetails = (com.google.android.apps.aicore.aidl.RetryDetails) aais.O(parcel, i4, com.google.android.apps.aicore.aidl.RetryDetails.CREATOR);
                    } else if (c != 5) {
                        aais.aa(parcel, i4);
                    } else {
                        inferenceErrorDetails = (com.google.android.apps.aicore.aidl.InferenceErrorDetails) aais.O(parcel, i4, com.google.android.apps.aicore.aidl.InferenceErrorDetails.CREATOR);
                    }
                }
                aais.Y(parcel, iK2);
                aiCoreException = new com.google.android.apps.aicore.aidl.AiCoreException(I10, I9, strU8, retryDetails, inferenceErrorDetails);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK3 = aais.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        aais.aa(parcel, i5);
                    } else {
                        arrayListX = aais.X(parcel, i5, com.google.android.apps.aicore.aidl.CitationSource.CREATOR);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.apps.aicore.aidl.CitationMetadata(arrayListX);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK4 = aais.K(parcel);
                int I11 = 0;
                java.lang.String strU9 = null;
                while (parcel.dataPosition() < iK4) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        I2 = aais.I(parcel, i6);
                    } else if (c2 == 2) {
                        I11 = aais.I(parcel, i6);
                    } else if (c2 == 3) {
                        strU4 = aais.U(parcel, i6);
                    } else if (c2 != 4) {
                        aais.aa(parcel, i6);
                    } else {
                        strU9 = aais.U(parcel, i6);
                    }
                }
                aais.Y(parcel, iK4);
                workerForegroundPriorityConfig = new com.google.android.apps.aicore.aidl.CitationSource(I2, I11, strU4, strU9);
                return workerForegroundPriorityConfig;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK5 = aais.K(parcel);
                com.google.android.apps.aicore.aidl.AiCoreException aiCoreException2 = null;
                while (parcel.dataPosition() < iK5) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        I = aais.I(parcel, i7);
                    } else if (c3 == 2) {
                        inferenceEventTraceResult = (com.google.android.apps.aicore.aidl.InferenceEventTraceResult) aais.O(parcel, i7, com.google.android.apps.aicore.aidl.InferenceEventTraceResult.CREATOR);
                    } else if (c3 != 3) {
                        aais.aa(parcel, i7);
                    } else {
                        aiCoreException2 = (com.google.android.apps.aicore.aidl.AiCoreException) aais.O(parcel, i7, com.google.android.apps.aicore.aidl.AiCoreException.CREATOR);
                    }
                }
                aais.Y(parcel, iK5);
                workerForegroundPriorityConfig = new com.google.android.apps.aicore.aidl.FailedResult(I, inferenceEventTraceResult, aiCoreException2);
                return workerForegroundPriorityConfig;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK6 = aais.K(parcel);
                long jL = 0;
                int I12 = 0;
                int I13 = 0;
                android.os.Bundle bundleM = null;
                double dG = 0.0d;
                boolean zAb2 = false;
                java.lang.String strU10 = null;
                while (parcel.dataPosition() < iK6) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            I12 = aais.I(parcel, i8);
                            break;
                        case 2:
                            strU10 = aais.U(parcel, i8);
                            break;
                        case 3:
                            zAb2 = aais.ab(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            I13 = aais.I(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            dG = aais.G(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            arrayListX6 = aais.X(parcel, i8, com.google.android.apps.aicore.aidl.FunctionArgsValue.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            jL = aais.L(parcel, i8);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            bundleM = aais.M(parcel, i8);
                            break;
                        default:
                            aais.aa(parcel, i8);
                            break;
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.apps.aicore.aidl.FunctionArgsValue(I12, strU10, zAb2, I13, dG, arrayListX6, jL, bundleM);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK7 = aais.K(parcel);
                android.os.Bundle bundleM2 = null;
                java.lang.String strU11 = null;
                while (parcel.dataPosition() < iK7) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        strU3 = aais.U(parcel, i9);
                    } else if (c4 == 2) {
                        bundleM2 = aais.M(parcel, i9);
                    } else if (c4 != 3) {
                        aais.aa(parcel, i9);
                    } else {
                        strU11 = aais.U(parcel, i9);
                    }
                }
                aais.Y(parcel, iK7);
                workerForegroundPriorityConfig = new com.google.android.apps.aicore.aidl.FunctionCall(strU3, bundleM2, strU11);
                return workerForegroundPriorityConfig;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK8 = aais.K(parcel);
                java.lang.String strU12 = null;
                com.google.android.apps.aicore.aidl.ResponseSchema responseSchema = null;
                com.google.android.apps.aicore.aidl.ResponseSchema responseSchema2 = null;
                while (parcel.dataPosition() < iK8) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        strU2 = aais.U(parcel, i10);
                    } else if (c5 == 2) {
                        strU12 = aais.U(parcel, i10);
                    } else if (c5 == 3) {
                        responseSchema = (com.google.android.apps.aicore.aidl.ResponseSchema) aais.O(parcel, i10, com.google.android.apps.aicore.aidl.ResponseSchema.CREATOR);
                    } else if (c5 != 4) {
                        aais.aa(parcel, i10);
                    } else {
                        responseSchema2 = (com.google.android.apps.aicore.aidl.ResponseSchema) aais.O(parcel, i10, com.google.android.apps.aicore.aidl.ResponseSchema.CREATOR);
                    }
                }
                aais.Y(parcel, iK8);
                workerForegroundPriorityConfig = new com.google.android.apps.aicore.aidl.FunctionDeclaration(strU2, strU12, responseSchema, responseSchema2);
                return workerForegroundPriorityConfig;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK9 = aais.K(parcel);
                java.lang.String strU13 = null;
                android.os.Bundle bundleM3 = null;
                while (parcel.dataPosition() < iK9) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        strU = aais.U(parcel, i11);
                    } else if (c6 == 2) {
                        strU13 = aais.U(parcel, i11);
                    } else if (c6 != 3) {
                        aais.aa(parcel, i11);
                    } else {
                        bundleM3 = aais.M(parcel, i11);
                    }
                }
                aais.Y(parcel, iK9);
                workerForegroundPriorityConfig = new com.google.android.apps.aicore.aidl.FunctionResponse(strU, strU13, bundleM3);
                return workerForegroundPriorityConfig;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK10 = aais.K(parcel);
                while (parcel.dataPosition() < iK10) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        aais.aa(parcel, i12);
                    } else {
                        arrayListX5 = aais.X(parcel, i12, com.google.android.apps.aicore.aidl.FunctionDeclaration.CREATOR);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.apps.aicore.aidl.FunctionTools(arrayListX5);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK11 = aais.K(parcel);
                while (parcel.dataPosition() < iK11) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        aais.aa(parcel, i13);
                    } else {
                        quotaExceededErrorDetails = (com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails) aais.O(parcel, i13, com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails.CREATOR);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.apps.aicore.aidl.InferenceErrorDetails(quotaExceededErrorDetails);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return a(parcel);
            case 15:
                int iK12 = aais.K(parcel);
                java.lang.String strU14 = null;
                while (parcel.dataPosition() < iK12) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        parcelFileDescriptor = (android.os.ParcelFileDescriptor) aais.O(parcel, i14, android.os.ParcelFileDescriptor.CREATOR);
                    } else if (c7 != 2) {
                        aais.aa(parcel, i14);
                    } else {
                        strU14 = aais.U(parcel, i14);
                    }
                }
                aais.Y(parcel, iK12);
                workerForegroundPriorityConfig = new com.google.android.apps.aicore.aidl.LLMAudio(parcelFileDescriptor, strU14);
                return workerForegroundPriorityConfig;
            case 16:
                int iK13 = aais.K(parcel);
                java.lang.String strU15 = null;
                while (parcel.dataPosition() < iK13) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        bArrAc = aais.ac(parcel, i15);
                    } else if (c8 != 2) {
                        aais.aa(parcel, i15);
                    } else {
                        strU15 = aais.U(parcel, i15);
                    }
                }
                aais.Y(parcel, iK13);
                workerForegroundPriorityConfig = new com.google.android.apps.aicore.aidl.LLMBlob(bArrAc, strU15);
                return workerForegroundPriorityConfig;
            case 17:
                int iK14 = aais.K(parcel);
                int I14 = 0;
                int I15 = 0;
                java.lang.String strU16 = null;
                android.graphics.Bitmap bitmap = null;
                android.os.ParcelFileDescriptor parcelFileDescriptor2 = null;
                com.google.android.apps.aicore.aidl.LLMBlob lLMBlob = null;
                android.os.ParcelFileDescriptor parcelFileDescriptor3 = null;
                com.google.android.apps.aicore.aidl.FunctionCall functionCall = null;
                com.google.android.apps.aicore.aidl.FunctionResponse functionResponse = null;
                com.google.android.apps.aicore.aidl.FunctionTools functionTools = null;
                while (parcel.dataPosition() < iK14) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            I14 = aais.I(parcel, i16);
                            break;
                        case 2:
                            strU16 = aais.U(parcel, i16);
                            break;
                        case 3:
                            bitmap = (android.graphics.Bitmap) aais.O(parcel, i16, android.graphics.Bitmap.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            I15 = aais.I(parcel, i16);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) aais.O(parcel, i16, android.os.ParcelFileDescriptor.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            zAb = aais.ab(parcel, i16);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            lLMAudio = (com.google.android.apps.aicore.aidl.LLMAudio) aais.O(parcel, i16, com.google.android.apps.aicore.aidl.LLMAudio.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            lLMBlob = (com.google.android.apps.aicore.aidl.LLMBlob) aais.O(parcel, i16, com.google.android.apps.aicore.aidl.LLMBlob.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            parcelFileDescriptor3 = (android.os.ParcelFileDescriptor) aais.O(parcel, i16, android.os.ParcelFileDescriptor.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            functionCall = (com.google.android.apps.aicore.aidl.FunctionCall) aais.O(parcel, i16, com.google.android.apps.aicore.aidl.FunctionCall.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                            functionResponse = (com.google.android.apps.aicore.aidl.FunctionResponse) aais.O(parcel, i16, com.google.android.apps.aicore.aidl.FunctionResponse.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            functionTools = (com.google.android.apps.aicore.aidl.FunctionTools) aais.O(parcel, i16, com.google.android.apps.aicore.aidl.FunctionTools.CREATOR);
                            break;
                        default:
                            aais.aa(parcel, i16);
                            break;
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.apps.aicore.aidl.LLMMessage(I14, strU16, bitmap, I15, parcelFileDescriptor2, zAb, lLMAudio, lLMBlob, parcelFileDescriptor3, functionCall, functionResponse, functionTools);
            case 18:
                int iK15 = aais.K(parcel);
                int I16 = 0;
                boolean zAb3 = false;
                android.os.ParcelFileDescriptor parcelFileDescriptor4 = null;
                android.os.IBinder iBinderN = null;
                while (parcel.dataPosition() < iK15) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 1) {
                        arrayListX4 = aais.X(parcel, i17, com.google.android.apps.aicore.aidl.LLMMessage.CREATOR);
                    } else if (c9 == 2) {
                        parcelFileDescriptor4 = (android.os.ParcelFileDescriptor) aais.O(parcel, i17, android.os.ParcelFileDescriptor.CREATOR);
                    } else if (c9 == 3) {
                        I16 = aais.I(parcel, i17);
                    } else if (c9 == 4) {
                        iBinderN = aais.N(parcel, i17);
                    } else if (c9 != 5) {
                        aais.aa(parcel, i17);
                    } else {
                        zAb3 = aais.ab(parcel, i17);
                    }
                }
                aais.Y(parcel, iK15);
                aiCoreException = new com.google.android.apps.aicore.aidl.LLMPrefixParam(arrayListX4, parcelFileDescriptor4, I16, iBinderN, zAb3);
                break;
            case 19:
                int iK16 = aais.K(parcel);
                float fH = 0.0f;
                float fH2 = 0.0f;
                int I17 = 0;
                java.lang.String strU17 = null;
                android.os.Bundle bundleM4 = null;
                com.google.android.apps.aicore.aidl.CitationMetadata citationMetadata = null;
                while (parcel.dataPosition() < iK16) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            strU17 = aais.U(parcel, i18);
                            break;
                        case 2:
                            fH = aais.H(parcel, i18);
                            break;
                        case 3:
                            I17 = aais.I(parcel, i18);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            fH2 = aais.H(parcel, i18);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            bundleM4 = aais.M(parcel, i18);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            citationMetadata = (com.google.android.apps.aicore.aidl.CitationMetadata) aais.O(parcel, i18, com.google.android.apps.aicore.aidl.CitationMetadata.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            arrayListX3 = aais.X(parcel, i18, com.google.android.apps.aicore.aidl.FunctionCall.CREATOR);
                            break;
                        default:
                            aais.aa(parcel, i18);
                            break;
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.apps.aicore.aidl.LLMReply(strU17, fH, I17, fH2, bundleM4, citationMetadata, arrayListX3);
            default:
                int iK17 = aais.K(parcel);
                com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult2 = null;
                com.google.android.apps.aicore.aidl.LegionResultMetadata legionResultMetadata = null;
                java.util.ArrayList arrayListX7 = null;
                while (parcel.dataPosition() < iK17) {
                    int i19 = parcel.readInt();
                    char c10 = (char) i19;
                    if (c10 == 1) {
                        arrayListX2 = aais.X(parcel, i19, com.google.android.apps.aicore.aidl.LLMReply.CREATOR);
                    } else if (c10 == 2) {
                        inferenceEventTraceResult2 = (com.google.android.apps.aicore.aidl.InferenceEventTraceResult) aais.O(parcel, i19, com.google.android.apps.aicore.aidl.InferenceEventTraceResult.CREATOR);
                    } else if (c10 == 3) {
                        legionResultMetadata = (com.google.android.apps.aicore.aidl.LegionResultMetadata) aais.O(parcel, i19, com.google.android.apps.aicore.aidl.LegionResultMetadata.CREATOR);
                    } else if (c10 != 4) {
                        aais.aa(parcel, i19);
                    } else {
                        arrayListX7 = aais.X(parcel, i19, com.google.android.apps.aicore.aidl.LLMReply.CREATOR);
                    }
                }
                aais.Y(parcel, iK17);
                workerForegroundPriorityConfig = new com.google.android.apps.aicore.aidl.LLMResult(arrayListX2, inferenceEventTraceResult2, legionResultMetadata, arrayListX7);
                return workerForegroundPriorityConfig;
        }
        return aiCoreException;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriorityConfig[i];
            case 1:
                return new com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority[i];
            case 2:
                return new com.android.voicemail.impl.sms.VvmMessage[i];
            case 3:
                return new com.google.android.apps.aicore.aidl.AIFeature[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.apps.aicore.aidl.AiCoreException[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.apps.aicore.aidl.CitationMetadata[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.apps.aicore.aidl.CitationSource[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.apps.aicore.aidl.FailedResult[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.apps.aicore.aidl.FunctionArgsValue[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.apps.aicore.aidl.FunctionCall[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.apps.aicore.aidl.FunctionDeclaration[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.apps.aicore.aidl.FunctionResponse[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.apps.aicore.aidl.FunctionTools[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.apps.aicore.aidl.InferenceErrorDetails[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.apps.aicore.aidl.InferenceEventTraceResult[i];
            case 15:
                return new com.google.android.apps.aicore.aidl.LLMAudio[i];
            case 16:
                return new com.google.android.apps.aicore.aidl.LLMBlob[i];
            case 17:
                return new com.google.android.apps.aicore.aidl.LLMMessage[i];
            case 18:
                return new com.google.android.apps.aicore.aidl.LLMPrefixParam[i];
            case 19:
                return new com.google.android.apps.aicore.aidl.LLMReply[i];
            default:
                return new com.google.android.apps.aicore.aidl.LLMResult[i];
        }
    }
}
