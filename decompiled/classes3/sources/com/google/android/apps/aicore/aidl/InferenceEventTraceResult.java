package com.google.android.apps.aicore.aidl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class InferenceEventTraceResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xfa(14);
    public final byte[] A;
    public final int B;
    public final int C;
    public final long D;
    public final long E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final long N;
    public final int[] O;
    public final int P;
    public final java.lang.String Q;
    public final byte[] R;
    public final int S;
    public final long T;
    public final byte[] U;
    public final int V;
    public final long[] W;
    public final long X;
    public final long Y;
    public final int Z;
    public final int a;
    public final int aa;
    public final long ab;
    public final long ac;
    public final byte[] ad;
    public final byte[] ae;
    public final long af;
    public final int ag;
    public final long ah;
    public final int ai;
    public final long aj;
    public final long ak;
    public final byte[] al;
    public final int am;
    public final int an;
    public final int ao;
    public final int ap;
    public final long aq;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final int u;
    public final long v;
    public final double w;
    public final double x;
    public final int y;
    public final float z;

    public InferenceEventTraceResult(int i, int i2, int i3, int i4, long j, int i5, int i6, int i7, long j2, long j3, long j4, long j5, long j6, long j7, int i8, int i9, int i10, int i11, boolean z, int i12, long j8, double d, double d2, int i13, float f, byte[] bArr, int i14, int i15, long j9, long j10, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, long j11, long j12, int[] iArr, int i24, java.lang.String str, byte[] bArr2, int i25, long j13, byte[] bArr3, int i26, long[] jArr, long j14, long j15, int i27, int i28, long j16, long j17, byte[] bArr4, byte[] bArr5, long j18, int i29, long j19, int i30, long j20, long j21, byte[] bArr6, int i31, int i32, int i33, int i34, long j22) {
        this.a = i;
        this.b = j12;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = j;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = j5;
        this.n = j6;
        this.o = j7;
        this.p = i8;
        this.q = i9;
        this.r = i10;
        this.s = i11;
        this.t = z;
        this.u = i12;
        this.v = j8;
        this.w = d;
        this.x = d2;
        this.y = i13;
        this.z = f;
        this.A = bArr;
        this.B = i14;
        this.C = i15;
        this.D = j9;
        this.E = j10;
        this.Y = j15;
        this.F = i16;
        this.G = i17;
        this.H = i18;
        this.I = i19;
        this.J = i20;
        this.Z = i27;
        this.aa = i28;
        this.K = i21;
        this.L = i22;
        this.M = i23;
        this.N = j11;
        this.O = iArr;
        this.P = i24;
        this.Q = str;
        this.R = bArr2;
        this.S = i25;
        this.T = j13;
        this.U = bArr3;
        this.V = i26;
        this.W = jArr;
        this.ab = j16;
        this.ac = j17;
        this.X = j14;
        this.ad = bArr4;
        this.ae = bArr5;
        this.af = j18;
        this.ag = i29;
        this.ah = j19;
        this.ai = i30;
        this.aj = j20;
        this.ak = j21;
        this.al = bArr6;
        this.am = i31;
        this.an = i32;
        this.ao = i33;
        this.ap = i34;
        this.aq = j22;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static java.lang.String a(byte[] bArr) {
        defpackage.xqh xqhVar;
        defpackage.ypa ypaVar;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    xqhVar = (defpackage.xqh) alad.B(defpackage.xqh.a, bArr, akzq.a);
                } else {
                    xqhVar = null;
                }
            } catch (alaz unused) {
                return "InvalidProto";
            }
        } else {
            xqhVar = null;
        }
        if (xqhVar == null) {
            return "{}";
        }
        akzx akzxVarP = xqhVar.p();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        int i = 1;
        while (true) {
            int iAP = a.aP(i);
            if (iAP == 0) {
                if (sb.length() > 1) {
                    sb.setLength(sb.length() - 2);
                }
                sb.append('}');
                return sb.toString();
            }
            switch (iAP - 1) {
                case 1:
                    ypaVar = defpackage.ypb.a;
                    break;
                case 2:
                    ypaVar = defpackage.ypb.b;
                    break;
                case 3:
                    ypaVar = defpackage.ypb.e;
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    ypaVar = defpackage.ypb.f;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    ypaVar = defpackage.ypb.d;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    ypaVar = defpackage.ypb.c;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    ypaVar = defpackage.ypb.g;
                    break;
                default:
                    ypaVar = null;
                    break;
            }
            if (ypaVar != null) {
                long jLongValue = ((java.lang.Long) aa$.ExternalSyntheticApiModelOutline1.m(ypaVar.b, akzxVarP)).longValue();
                int iIntValue = ((java.lang.Integer) aa$.ExternalSyntheticApiModelOutline1.m(ypaVar.c, akzxVarP)).intValue();
                if (jLongValue > 0 || iIntValue > 0) {
                    sb.append(ypaVar.a);
                    sb.append(": (");
                    sb.append(jLongValue);
                    sb.append(" ms, count: ");
                    sb.append(iIntValue);
                    sb.append("), ");
                }
            }
            i++;
        }
    }

    public final java.lang.String toString() {
        defpackage.yox yoxVar;
        defpackage.xqi xqiVar;
        defpackage.xqj xqjVar;
        defpackage.yow yowVar;
        aigb aigbVar = new aigb(4);
        aigbVar.i("customerId", java.lang.Integer.valueOf(this.a));
        aigbVar.i("callingUserId", java.lang.Long.valueOf(this.b));
        aigbVar.i("featureType", java.lang.Integer.valueOf(this.c));
        aigbVar.i("featureVariant", java.lang.Integer.valueOf(this.d));
        aigbVar.i("status", java.lang.Integer.valueOf(this.e));
        aigbVar.i("inferenceLatencyTotalMillis", java.lang.Long.valueOf(this.f));
        aigbVar.i("numInputTokens", java.lang.Integer.valueOf(this.g));
        aigbVar.i("numOutputTokens", java.lang.Integer.valueOf(this.h));
        aigbVar.i("numDecodeSteps", java.lang.Integer.valueOf(this.i));
        aigbVar.i("inferenceServiceStartLatencyMillis", java.lang.Long.valueOf(this.j));
        aigbVar.i("inferenceApiCallHandlingLatencyMillis", java.lang.Long.valueOf(this.k));
        aigbVar.i("inferenceInputSafetyCheckLatencyMillis", java.lang.Long.valueOf(this.l));
        aigbVar.i("inferenceInputEncodingLatencyMillis", java.lang.Long.valueOf(this.m));
        aigbVar.i("inferenceOverallOutputLatencyMillis", java.lang.Long.valueOf(this.n));
        aigbVar.i("inferenceOutputSafetyCheckLatencyMillis", java.lang.Long.valueOf(this.o));
        aigbVar.i("inputSafetyCheckPolicyViolationType", java.lang.Integer.valueOf(this.p));
        aigbVar.i("inputSafetyCheckSuggestedActionType", java.lang.Integer.valueOf(this.q));
        aigbVar.i("outputSafetyCheckPolicyViolationType", java.lang.Integer.valueOf(this.r));
        aigbVar.i("outputSafetyCheckSuggestedActionType", java.lang.Integer.valueOf(this.s));
        aigbVar.i("isModelLoaded", java.lang.Boolean.valueOf(this.t));
        aigbVar.i("featureId", java.lang.Integer.valueOf(this.u));
        aigbVar.i("featureVersion", java.lang.Integer.valueOf(this.M));
        aigbVar.i("modelInferenceLatencyMillis", java.lang.Long.valueOf(this.v));
        aigbVar.i("modelLoadingLatencyMillis", java.lang.Long.valueOf(this.aq));
        aigbVar.i("outputTokensPerSecond", java.lang.Double.valueOf(this.w));
        aigbVar.i("inputTokensPerSecond", java.lang.Double.valueOf(this.x));
        aigbVar.i("numSamples", java.lang.Integer.valueOf(this.y));
        aigbVar.i("cannedResponsesRatio", java.lang.Float.valueOf(this.z));
        try {
            yoxVar = (defpackage.yox) alad.B(defpackage.yox.a, this.A, akzq.a());
        } catch (alaz e) {
            android.util.Log.e("InferenceEventTraceResult", "Failed to parse SpeculativeDecodeStatistics proto", e);
            yoxVar = defpackage.yox.a;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{drafter_id: ");
        sb.append(yoxVar.b);
        sb.append(", drafter_time: ");
        akzm akzmVar = yoxVar.d;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        sb.append(akzmVar.b);
        sb.append(", block_efficiency: ");
        sb.append(yoxVar.e);
        sb.append(", drafter_guesses_per_position: ");
        sb.append((java.lang.String) j$.util.Collection.-EL.stream(yoxVar.c).map(new defpackage.wyd(10)).collect(j$.util.stream.Collectors.joining(", ")));
        sb.append('}');
        aigbVar.i("speculativeDecodeStatistics", sb.toString());
        aigbVar.i("numSuffixScoreFiltered", java.lang.Integer.valueOf(this.B));
        aigbVar.i("numPostDeduped", java.lang.Integer.valueOf(this.C));
        aigbVar.i("inferenceStatefulSuspensionLatencyMillis", java.lang.Long.valueOf(this.D));
        aigbVar.i("inferenceStatelessSuspensionLatencyMillis", java.lang.Long.valueOf(this.E));
        aigbVar.i("inferenceTurnWaitingLatencyMillis", java.lang.Long.valueOf(this.Y));
        aigbVar.i("topCannedResponseIndex", java.lang.Integer.valueOf(this.F));
        aigbVar.i("inferenceStatefulSuspensionCount", java.lang.Integer.valueOf(this.G));
        aigbVar.i("inferenceStatefulResumptionCount", java.lang.Integer.valueOf(this.H));
        aigbVar.i("inferenceStatelessSuspensionCount", java.lang.Integer.valueOf(this.I));
        aigbVar.i("inferenceStatelessResumptionCount", java.lang.Integer.valueOf(this.J));
        aigbVar.i("inferenceTurnWaitingStartedCount", java.lang.Integer.valueOf(this.Z));
        aigbVar.i("inferenceTurnWaitingCompletedCount", java.lang.Integer.valueOf(this.aa));
        aigbVar.i("requestKind", java.lang.Integer.valueOf(this.K));
        aigbVar.i("initialQueuePosition", java.lang.Integer.valueOf(this.L));
        aigbVar.i("inferenceStartTimestampMillis", java.lang.Long.valueOf(this.N));
        aigbVar.i("auxiliaryFileTypes", this.O);
        aigbVar.i("callingAppUid", java.lang.Integer.valueOf(this.P));
        aigbVar.i("baseModelPublicVersionName", this.Q);
        try {
            xqiVar = (defpackage.xqi) alad.B(defpackage.xqi.a, this.R, akzq.a());
        } catch (alaz e2) {
            android.util.Log.e("InferenceEventTraceResult", "Failed to parse ErrorDetails proto", e2);
            xqiVar = defpackage.xqi.a;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("{");
        int i = xqiVar.b;
        if (i == 1) {
            defpackage.xqk xqkVar = i == 1 ? (defpackage.xqk) xqiVar.c : defpackage.xqk.a;
            sb2.append("quota_exceeded_details: {quota_type: ");
            int iAe = a.ae(xqkVar.b);
            if (iAe == 0) {
                iAe = 1;
            }
            sb2.append(iAe - 1);
            sb2.append(", quota_scope: ");
            int iAQ = a.aQ(xqkVar.c);
            if (iAQ == 0) {
                iAQ = 1;
            }
            sb2.append(iAQ - 1);
            sb2.append(", quota_check_stage: ");
            int iAQ2 = a.aQ(xqkVar.d);
            if (iAQ2 == 0) {
                iAQ2 = 1;
            }
            sb2.append(iAQ2 - 1);
            sb2.append(", period_seconds: ");
            sb2.append(xqkVar.e);
            sb2.append(", cost_limit: ");
            sb2.append(xqkVar.f);
            sb2.append(", try_again_seconds: ");
            sb2.append(xqkVar.g);
            sb2.append('}');
        }
        sb2.append('}');
        aigbVar.i("errorDetails", sb2.toString());
        aigbVar.i("hintType", java.lang.Integer.valueOf(this.S));
        aigbVar.i("hintLatencyTotalMillis", java.lang.Long.valueOf(this.T));
        try {
            xqjVar = (defpackage.xqj) alad.B(defpackage.xqj.a, this.U, akzq.a());
        } catch (alaz e3) {
            android.util.Log.e("InferenceEventTraceResult", "Failed to parse IntrospectionDetails proto", e3);
            xqjVar = defpackage.xqj.a;
        }
        aigbVar.i("introspectionDetails", "{is_introspection_applied: " + xqjVar.b + '}');
        aigbVar.i("inferenceModelType", java.lang.Integer.valueOf(this.V));
        aigbVar.i("timeToFirstTokenMillisArray", this.W);
        aigbVar.i("nativeStartTimeNanos", java.lang.Long.valueOf(this.X));
        aigbVar.i("timeIntervalFromPreviousFeatureUseMillis", java.lang.Long.valueOf(this.ab));
        aigbVar.i("timeIntervalFromPreviousModelUseMillis", java.lang.Long.valueOf(this.ac));
        aigbVar.i("parallelLoadingLatencyStats", a(this.ad));
        aigbVar.i("serialLoadingLatencyStats", a(this.ae));
        aigbVar.i("safetyModelLoadingLatencyMillis", java.lang.Long.valueOf(this.af));
        aigbVar.i("numImagesPerQuery", java.lang.Integer.valueOf(this.ag));
        aigbVar.i("totalAudioDurationMillis", java.lang.Long.valueOf(this.ah));
        aigbVar.i("audioEncoderCallCount", java.lang.Integer.valueOf(this.ai));
        aigbVar.i("dmabufRssKbAtInferenceStart", java.lang.Long.valueOf(this.aj));
        aigbVar.i("dmabufRssKbAtInferenceCompletion", java.lang.Long.valueOf(this.ak));
        byte[] bArr = this.al;
        if (bArr == null) {
            yowVar = defpackage.yow.a;
        } else {
            try {
                yowVar = (defpackage.yow) alad.B(defpackage.yow.a, bArr, akzq.a());
            } catch (alaz unused) {
                yowVar = defpackage.yow.a;
            }
        }
        aigbVar.i("powerProfileStatistics", "{enabled: " + yowVar.b + ", prefill_power_mode_id: " + yowVar.c + ", decode_power_mode_id: " + yowVar.d + ", power_mode_boosted: " + yowVar.f + ", total_energy_saved_mj: " + yowVar.e + '}');
        aigbVar.i("functionCallingStatus", java.lang.Integer.valueOf(this.am));
        aigbVar.i("sessionStateCacheType", java.lang.Integer.valueOf(this.an));
        aigbVar.i("functionCallingToolSchemaCharacterCount", java.lang.Integer.valueOf(this.ao));
        aigbVar.i("functionCallingDeclaredToolsCount", java.lang.Integer.valueOf(this.ap));
        return "InferenceEventTraceResult\n".concat(ahvr.aF(aigbVar.e(true)));
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.a;
        int iF = aais.f(parcel, 20293);
        aais.l(parcel, 1, i2);
        aais.l(parcel, 2, this.c);
        aais.l(parcel, 3, this.d);
        aais.l(parcel, 4, this.e);
        aais.m(parcel, 5, this.f);
        aais.l(parcel, 6, this.g);
        aais.l(parcel, 7, this.h);
        aais.l(parcel, 8, this.i);
        aais.m(parcel, 9, this.j);
        aais.m(parcel, 10, this.k);
        aais.m(parcel, 11, this.l);
        aais.m(parcel, 12, this.m);
        aais.m(parcel, 13, this.n);
        aais.m(parcel, 14, this.o);
        aais.l(parcel, 15, this.p);
        aais.l(parcel, 16, this.q);
        aais.l(parcel, 17, this.r);
        aais.l(parcel, 18, this.s);
        aais.h(parcel, 19, this.t);
        aais.l(parcel, 20, this.u);
        aais.m(parcel, 21, this.v);
        aais.j(parcel, 22, this.w);
        aais.j(parcel, 23, this.x);
        aais.l(parcel, 24, this.y);
        aais.k(parcel, 25, this.z);
        aais.q(parcel, 26, this.A);
        aais.l(parcel, 27, this.B);
        aais.l(parcel, 28, this.C);
        aais.m(parcel, 29, this.D);
        aais.m(parcel, 30, this.E);
        aais.l(parcel, 31, this.F);
        aais.l(parcel, 32, this.G);
        aais.l(parcel, 33, this.H);
        aais.l(parcel, 34, this.I);
        aais.l(parcel, 35, this.J);
        aais.l(parcel, 36, this.K);
        aais.l(parcel, 37, this.L);
        aais.l(parcel, 38, this.M);
        aais.m(parcel, 39, this.N);
        aais.m(parcel, 40, this.b);
        aais.v(parcel, 41, this.O);
        aais.l(parcel, 42, this.P);
        aais.A(parcel, 43, this.Q);
        aais.q(parcel, 44, this.R);
        aais.l(parcel, 45, this.S);
        aais.m(parcel, 46, this.T);
        aais.q(parcel, 47, this.U);
        aais.l(parcel, 48, this.V);
        long[] jArr = this.W;
        if (jArr != null) {
            int iF2 = aais.f(parcel, 50);
            parcel.writeLongArray(jArr);
            aais.g(parcel, iF2);
        }
        aais.m(parcel, 51, this.X);
        aais.m(parcel, 52, this.Y);
        aais.l(parcel, 53, this.Z);
        aais.l(parcel, 54, this.aa);
        aais.m(parcel, 55, this.ab);
        aais.m(parcel, 56, this.ac);
        aais.q(parcel, 57, this.ad);
        aais.q(parcel, 58, this.ae);
        aais.m(parcel, 59, this.af);
        aais.l(parcel, 60, this.ag);
        aais.m(parcel, 61, this.ah);
        aais.l(parcel, 62, this.ai);
        aais.m(parcel, 63, this.aj);
        aais.m(parcel, 64, this.ak);
        aais.q(parcel, 65, this.al);
        aais.l(parcel, 66, this.am);
        aais.l(parcel, 67, this.an);
        aais.l(parcel, 68, this.ao);
        aais.l(parcel, 69, this.ap);
        aais.m(parcel, 70, this.aq);
        aais.g(parcel, iF);
    }
}
