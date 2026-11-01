package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xkg implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public xkg(int i) {
        this.$cid = i;
    }

    public static final com.android.onboarding.pending.PendingActivityContract a(android.os.Parcel parcel) {
        aooh.f(parcel, "parcel");
        java.lang.Object objCreateFromParcel = android.content.Intent.CREATOR.createFromParcel(parcel);
        aooh.e(objCreateFromParcel, "createFromParcel(...)");
        return new com.android.onboarding.pending.PendingActivityContract((android.content.Intent) objCreateFromParcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Object quotaExceededErrorDetails;
        float fH = 0.0f;
        int I = 0;
        boolean zAb = false;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        int I5 = 0;
        int I6 = 0;
        int I7 = 0;
        int I8 = 0;
        java.lang.String strU = null;
        java.util.ArrayList arrayListX = null;
        android.os.IBinder iBinderN = null;
        java.lang.String strU2 = null;
        java.util.ArrayList arrayListX2 = null;
        java.util.ArrayList arrayListX3 = null;
        java.util.ArrayList arrayListW = null;
        java.util.ArrayList arrayListX4 = null;
        java.util.ArrayList arrayListX5 = null;
        java.lang.String strU3 = null;
        java.lang.String strU4 = null;
        java.util.ArrayList arrayListX6 = null;
        java.util.ArrayList arrayListW2 = null;
        java.lang.String strU5 = null;
        switch (this.$cid) {
            case 0:
                return a(parcel);
            case 1:
                int iK = aais.K(parcel);
                while (parcel.dataPosition() < iK) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        aais.aa(parcel, i);
                    } else {
                        strU = aais.U(parcel, i);
                    }
                }
                aais.Y(parcel, iK);
                return new com.google.android.apps.aicore.aidl.LegionResultMetadata(strU);
            case 2:
                int iK2 = aais.K(parcel);
                float fH2 = 0.0f;
                float fH3 = 0.0f;
                int I9 = 0;
                int I10 = 0;
                float fH4 = 0.0f;
                int I11 = 0;
                while (parcel.dataPosition() < iK2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            I9 = aais.I(parcel, i2);
                            break;
                        case 2:
                            I11 = aais.I(parcel, i2);
                            break;
                        case 3:
                            I10 = aais.I(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            fH2 = aais.H(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            fH4 = aais.H(parcel, i2);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            fH3 = aais.H(parcel, i2);
                            break;
                        default:
                            aais.aa(parcel, i2);
                            break;
                    }
                }
                aais.Y(parcel, iK2);
                quotaExceededErrorDetails = new com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails(I9, I11, I10, fH2, fH4, fH3);
                break;
            case 3:
                int iK3 = aais.K(parcel);
                while (parcel.dataPosition() < iK3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        aais.aa(parcel, i3);
                    } else {
                        I = aais.I(parcel, i3);
                    }
                }
                aais.Y(parcel, iK3);
                return new com.google.android.apps.aicore.aidl.RetryDetails(I);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int iK4 = aais.K(parcel);
                while (parcel.dataPosition() < iK4) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c == 1) {
                        strU5 = aais.U(parcel, i4);
                    } else if (c == 2) {
                        I8 = aais.I(parcel, i4);
                    } else if (c != 3) {
                        aais.aa(parcel, i4);
                    } else {
                        fH = aais.H(parcel, i4);
                    }
                }
                aais.Y(parcel, iK4);
                return new com.google.android.apps.aicore.aidl.SmartReplyReplyEntry(strU5, I8, fH);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int iK5 = aais.K(parcel);
                com.google.android.apps.aicore.aidl.UserProperties userProperties = null;
                while (parcel.dataPosition() < iK5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        arrayListW2 = aais.W(parcel, i5);
                    } else if (c2 == 2) {
                        I7 = aais.I(parcel, i5);
                    } else if (c2 != 3) {
                        aais.aa(parcel, i5);
                    } else {
                        userProperties = (com.google.android.apps.aicore.aidl.UserProperties) aais.O(parcel, i5, com.google.android.apps.aicore.aidl.UserProperties.CREATOR);
                    }
                }
                aais.Y(parcel, iK5);
                return new com.google.android.apps.aicore.aidl.SmartReplyRequest(arrayListW2, I7, userProperties);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iK6 = aais.K(parcel);
                com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = null;
                while (parcel.dataPosition() < iK6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        arrayListX6 = aais.X(parcel, i6, com.google.android.apps.aicore.aidl.SmartReplyReplyEntry.CREATOR);
                    } else if (c3 != 2) {
                        aais.aa(parcel, i6);
                    } else {
                        inferenceEventTraceResult = (com.google.android.apps.aicore.aidl.InferenceEventTraceResult) aais.O(parcel, i6, com.google.android.apps.aicore.aidl.InferenceEventTraceResult.CREATOR);
                    }
                }
                aais.Y(parcel, iK6);
                return new com.google.android.apps.aicore.aidl.SmartReplyResult(arrayListX6, inferenceEventTraceResult);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int iK7 = aais.K(parcel);
                java.lang.String strU6 = null;
                while (parcel.dataPosition() < iK7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        strU4 = aais.U(parcel, i7);
                    } else if (c4 != 2) {
                        aais.aa(parcel, i7);
                    } else {
                        strU6 = aais.U(parcel, i7);
                    }
                }
                aais.Y(parcel, iK7);
                return new com.google.android.apps.aicore.aidl.SuggestedTextMessage(strU4, strU6);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                int iK8 = aais.K(parcel);
                while (parcel.dataPosition() < iK8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        strU3 = aais.U(parcel, i8);
                    } else if (c5 != 2) {
                        aais.aa(parcel, i8);
                    } else {
                        I6 = aais.I(parcel, i8);
                    }
                }
                aais.Y(parcel, iK8);
                return new com.google.android.apps.aicore.aidl.SuggestedTextReply(strU3, I6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int iK9 = aais.K(parcel);
                while (parcel.dataPosition() < iK9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        arrayListX5 = aais.X(parcel, i9, com.google.android.apps.aicore.aidl.SuggestedTextMessage.CREATOR);
                    } else if (c6 != 2) {
                        aais.aa(parcel, i9);
                    } else {
                        I5 = aais.I(parcel, i9);
                    }
                }
                aais.Y(parcel, iK9);
                return new com.google.android.apps.aicore.aidl.SuggestedTextRequest(arrayListX5, I5);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int iK10 = aais.K(parcel);
                com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult2 = null;
                while (parcel.dataPosition() < iK10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        arrayListX4 = aais.X(parcel, i10, com.google.android.apps.aicore.aidl.SuggestedTextReply.CREATOR);
                    } else if (c7 != 2) {
                        aais.aa(parcel, i10);
                    } else {
                        inferenceEventTraceResult2 = (com.google.android.apps.aicore.aidl.InferenceEventTraceResult) aais.O(parcel, i10, com.google.android.apps.aicore.aidl.InferenceEventTraceResult.CREATOR);
                    }
                }
                aais.Y(parcel, iK10);
                return new com.google.android.apps.aicore.aidl.SuggestedTextResult(arrayListX4, inferenceEventTraceResult2);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int iK11 = aais.K(parcel);
                java.util.ArrayList arrayListW3 = null;
                while (parcel.dataPosition() < iK11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        arrayListW = aais.W(parcel, i11);
                    } else if (c8 != 2) {
                        aais.aa(parcel, i11);
                    } else {
                        arrayListW3 = aais.W(parcel, i11);
                    }
                }
                aais.Y(parcel, iK11);
                return new com.google.android.apps.aicore.aidl.SummarizationArguments(arrayListW, arrayListW3);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int iK12 = aais.K(parcel);
                java.lang.String strU7 = null;
                com.google.android.apps.aicore.aidl.SummarizationArguments summarizationArguments = null;
                while (parcel.dataPosition() < iK12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        arrayListX3 = aais.X(parcel, i12, com.google.android.apps.aicore.aidl.SummarizationMessage.CREATOR);
                    } else if (c9 == 2) {
                        strU7 = aais.U(parcel, i12);
                    } else if (c9 != 3) {
                        aais.aa(parcel, i12);
                    } else {
                        summarizationArguments = (com.google.android.apps.aicore.aidl.SummarizationArguments) aais.O(parcel, i12, com.google.android.apps.aicore.aidl.SummarizationArguments.CREATOR);
                    }
                }
                aais.Y(parcel, iK12);
                return new com.google.android.apps.aicore.aidl.SummarizationBatchMessage(arrayListX3, strU7, summarizationArguments);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                int iK13 = aais.K(parcel);
                java.lang.String strU8 = null;
                while (parcel.dataPosition() < iK13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        arrayListX2 = aais.X(parcel, i13, com.google.android.apps.aicore.aidl.LLMReply.CREATOR);
                    } else if (c10 == 2) {
                        strU8 = aais.U(parcel, i13);
                    } else if (c10 != 3) {
                        aais.aa(parcel, i13);
                    } else {
                        I4 = aais.I(parcel, i13);
                    }
                }
                aais.Y(parcel, iK13);
                return new com.google.android.apps.aicore.aidl.SummarizationBatchReply(arrayListX2, strU8, I4);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                int iK14 = aais.K(parcel);
                while (parcel.dataPosition() < iK14) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        aais.aa(parcel, i14);
                    } else {
                        strU2 = aais.U(parcel, i14);
                    }
                }
                aais.Y(parcel, iK14);
                return new com.google.android.apps.aicore.aidl.SummarizationMessage(strU2);
            case 15:
                int iK15 = aais.K(parcel);
                int I12 = 0;
                int I13 = 0;
                int I14 = 0;
                int I15 = 0;
                int I16 = 0;
                int I17 = 0;
                java.util.ArrayList arrayListX7 = null;
                android.os.IBinder iBinderN2 = null;
                com.google.android.apps.aicore.aidl.SummarizationArguments summarizationArguments2 = null;
                java.util.ArrayList arrayListX8 = null;
                com.google.android.apps.aicore.aidl.UserProperties userProperties2 = null;
                while (parcel.dataPosition() < iK15) {
                    int i15 = parcel.readInt();
                    float f = fH;
                    switch ((char) i15) {
                        case 1:
                            arrayListX7 = aais.X(parcel, i15, com.google.android.apps.aicore.aidl.SummarizationMessage.CREATOR);
                            break;
                        case 2:
                            fH = aais.H(parcel, i15);
                            continue;
                        case 3:
                            I12 = aais.I(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            I13 = aais.I(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            I3 = aais.I(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            iBinderN = aais.N(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            I14 = aais.I(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            I15 = aais.I(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            iBinderN2 = aais.N(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            I16 = aais.I(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                            summarizationArguments2 = (com.google.android.apps.aicore.aidl.SummarizationArguments) aais.O(parcel, i15, com.google.android.apps.aicore.aidl.SummarizationArguments.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                            I17 = aais.I(parcel, i15);
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                            arrayListX8 = aais.X(parcel, i15, com.google.android.apps.aicore.aidl.SummarizationBatchMessage.CREATOR);
                            break;
                        case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                            userProperties2 = (com.google.android.apps.aicore.aidl.UserProperties) aais.O(parcel, i15, com.google.android.apps.aicore.aidl.UserProperties.CREATOR);
                            break;
                        default:
                            aais.aa(parcel, i15);
                            break;
                    }
                    fH = f;
                }
                aais.Y(parcel, iK15);
                quotaExceededErrorDetails = new com.google.android.apps.aicore.aidl.SummarizationRequest(arrayListX7, fH, I12, I13, I3, iBinderN, I14, I15, iBinderN2, I16, summarizationArguments2, I17, arrayListX8, userProperties2);
                break;
            case 16:
                int iK16 = aais.K(parcel);
                float fH5 = 1.0f;
                com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult3 = null;
                java.util.ArrayList arrayListX9 = null;
                com.google.android.apps.aicore.aidl.LegionResultMetadata legionResultMetadata = null;
                while (parcel.dataPosition() < iK16) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        arrayListX = aais.X(parcel, i16, com.google.android.apps.aicore.aidl.LLMReply.CREATOR);
                    } else if (c11 == 2) {
                        inferenceEventTraceResult3 = (com.google.android.apps.aicore.aidl.InferenceEventTraceResult) aais.O(parcel, i16, com.google.android.apps.aicore.aidl.InferenceEventTraceResult.CREATOR);
                    } else if (c11 == 3) {
                        fH5 = aais.H(parcel, i16);
                    } else if (c11 == 4) {
                        arrayListX9 = aais.X(parcel, i16, com.google.android.apps.aicore.aidl.SummarizationBatchReply.CREATOR);
                    } else if (c11 != 5) {
                        aais.aa(parcel, i16);
                    } else {
                        legionResultMetadata = (com.google.android.apps.aicore.aidl.LegionResultMetadata) aais.O(parcel, i16, com.google.android.apps.aicore.aidl.LegionResultMetadata.CREATOR);
                    }
                }
                aais.Y(parcel, iK16);
                return new com.google.android.apps.aicore.aidl.SummarizationResult(arrayListX, inferenceEventTraceResult3, fH5, arrayListX9, legionResultMetadata);
            case 17:
                int iK17 = aais.K(parcel);
                while (parcel.dataPosition() < iK17) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        aais.aa(parcel, i17);
                    } else {
                        I2 = aais.I(parcel, i17);
                    }
                }
                aais.Y(parcel, iK17);
                return new com.google.android.apps.aicore.aidl.ThinkingConfig(I2);
            case 18:
                int iK18 = aais.K(parcel);
                while (parcel.dataPosition() < iK18) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        aais.aa(parcel, i18);
                    } else {
                        zAb = aais.ab(parcel, i18);
                    }
                }
                aais.Y(parcel, iK18);
                return new com.google.android.apps.aicore.aidl.UserProperties(zAb);
            case 19:
                return new com.google.android.flexbox.FlexboxLayout.LayoutParams(parcel);
            default:
                return new com.google.android.flexbox.FlexboxLayoutManager.LayoutParams(parcel);
        }
        return quotaExceededErrorDetails;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new com.android.onboarding.pending.PendingActivityContract[i];
            case 1:
                return new com.google.android.apps.aicore.aidl.LegionResultMetadata[i];
            case 2:
                return new com.google.android.apps.aicore.aidl.QuotaExceededErrorDetails[i];
            case 3:
                return new com.google.android.apps.aicore.aidl.RetryDetails[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.android.apps.aicore.aidl.SmartReplyReplyEntry[i];
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new com.google.android.apps.aicore.aidl.SmartReplyRequest[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new com.google.android.apps.aicore.aidl.SmartReplyResult[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new com.google.android.apps.aicore.aidl.SuggestedTextMessage[i];
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new com.google.android.apps.aicore.aidl.SuggestedTextReply[i];
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new com.google.android.apps.aicore.aidl.SuggestedTextRequest[i];
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new com.google.android.apps.aicore.aidl.SuggestedTextResult[i];
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new com.google.android.apps.aicore.aidl.SummarizationArguments[i];
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new com.google.android.apps.aicore.aidl.SummarizationBatchMessage[i];
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new com.google.android.apps.aicore.aidl.SummarizationBatchReply[i];
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new com.google.android.apps.aicore.aidl.SummarizationMessage[i];
            case 15:
                return new com.google.android.apps.aicore.aidl.SummarizationRequest[i];
            case 16:
                return new com.google.android.apps.aicore.aidl.SummarizationResult[i];
            case 17:
                return new com.google.android.apps.aicore.aidl.ThinkingConfig[i];
            case 18:
                return new com.google.android.apps.aicore.aidl.UserProperties[i];
            case 19:
                return new com.google.android.flexbox.FlexboxLayout.LayoutParams[i];
            default:
                return new com.google.android.flexbox.FlexboxLayoutManager.LayoutParams[i];
        }
    }
}
