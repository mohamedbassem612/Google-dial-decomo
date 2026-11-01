package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynq extends defpackage.ymr implements defpackage.ymj {
    public static final /* synthetic */ int h = 0;
    private static final java.lang.String i = "ynq";
    private final j$.util.Optional j;

    public ynq(defpackage.ymd ymdVar, defpackage.ymk ymkVar, defpackage.yml ymlVar) {
        super(ymdVar, ymkVar, ymlVar);
        ymdVar.j();
        this.j = j$.util.Optional.empty();
    }

    public static defpackage.yni h(com.google.android.apps.aicore.aidl.CitationMetadata citationMetadata) {
        if (citationMetadata == null) {
            return null;
        }
        return new defpackage.yni(aify.n((java.util.List) j$.util.Collection.-EL.stream(citationMetadata.a).map(new defpackage.wyd(11)).collect(aido.a)));
    }

    @Override // defpackage.ymr
    public final /* synthetic */ defpackage.ylj c(java.lang.Object obj, java.lang.Object obj2, defpackage.yng yngVar) {
        com.google.android.apps.aicore.aidl.FunctionTools functionTools;
        aify aifyVar;
        aify aifyVar2;
        defpackage.ylj ylhVar;
        defpackage.yng ymoVar = yngVar;
        defpackage.ylp ylpVar = (defpackage.ylp) obj;
        defpackage.ynn ynnVar = (defpackage.ynn) obj2;
        aify aifyVar3 = ynnVar.a;
        char c = 3;
        if (j$.util.Collection.-EL.stream(aifyVar3).anyMatch(new defpackage.wrm(11)) && this.c.d != 12) {
            android.util.Log.w(i, "Audio input is only supported for LEGION features");
            ymoVar.a(3);
            return new defpackage.yli();
        }
        android.os.Parcelable.Creator creator = com.google.android.apps.aicore.aidl.LLMRequest.CREATOR;
        defpackage.ylx ylxVar = new defpackage.ylx();
        ylxVar.h();
        ylxVar.g();
        ylxVar.e();
        ylxVar.b(aike.a);
        ylxVar.a(123);
        ylxVar.k = com.google.android.apps.aicore.aidl.UserProperties.a;
        ylxVar.f();
        ylxVar.c(1.0f);
        ylxVar.d();
        ylxVar.n = null;
        defpackage.yno ynoVar = ynnVar.l;
        if (ynoVar != null) {
            ylxVar.m = ynoVar.a();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        aift aiftVar = new aift(4);
        new java.util.ArrayList();
        int size = aifyVar3.size();
        int i2 = 0;
        while (i2 < size) {
            com.google.android.apps.aicore.aidl.LLMMessage lLMMessage = new com.google.android.apps.aicore.aidl.LLMMessage(0, ((defpackage.ynk) aifyVar3.get(i2)).a, null, 0, null, false, null, null, null, null, null, null);
            char c2 = c;
            int i3 = lLMMessage.d;
            switch (i3) {
                case 0:
                    ahvr.ci(lLMMessage.b);
                    break;
                case 1:
                    ahvr.ci(lLMMessage.c);
                    break;
                case 2:
                    ahvr.ci(lLMMessage.e);
                    break;
                case 3:
                    ahvr.ci(lLMMessage.g);
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    ahvr.ci(lLMMessage.h);
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    ahvr.ci(lLMMessage.i);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    ahvr.ci(lLMMessage.j);
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    ahvr.ci(lLMMessage.k);
                    break;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    ahvr.ci(lLMMessage.l);
                    int i4 = lLMMessage.a;
                    if (i4 != 2) {
                        throw new java.lang.IllegalArgumentException(a.bj(i4, "Tools can only be set for SYSTEM messages, but got role: "));
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException(a.bj(i3, "Unknown type: "));
            }
            aiftVar.i(lLMMessage);
            i2++;
            c = c2;
        }
        if (bundle.hasFileDescriptors()) {
            ylxVar.i = bundle;
        }
        ylxVar.a = aify.n(aiftVar.h());
        ylxVar.b = ynnVar.b;
        short s = ylxVar.o;
        ylxVar.o = (short) (s | 1);
        ylxVar.c = ynnVar.c;
        ylxVar.o = (short) (s | 3);
        ylxVar.c(ynnVar.d);
        ylxVar.b(ynnVar.e);
        ylxVar.e = ynnVar.f;
        short s2 = ylxVar.o;
        ylxVar.o = (short) (s2 | 4);
        ylxVar.f = ynnVar.g;
        ylxVar.o = (short) (s2 | 12);
        ylxVar.g = ynnVar.i;
        ylxVar.o = (short) (s2 | 28);
        ylxVar.h = ynnVar.h;
        ylxVar.o = (short) (s2 | 60);
        ylxVar.h();
        ylxVar.g();
        ylxVar.e();
        ylxVar.a(ynnVar.j);
        defpackage.ymm ymmVar = ynnVar.k;
        ylxVar.k = new com.google.android.apps.aicore.aidl.UserProperties(false);
        ylxVar.f();
        ylxVar.d();
        aify aifyVar4 = ynnVar.m.b;
        if (aifyVar4.isEmpty()) {
            functionTools = null;
        } else {
            aift aiftVar2 = new aift(4);
            if (aifyVar4.size() > 0) {
                throw null;
            }
            functionTools = new com.google.android.apps.aicore.aidl.FunctionTools(aiftVar2.h());
        }
        ylxVar.n = functionTools;
        if (ylxVar.o == 8191 && (aifyVar = ylxVar.a) != null && (aifyVar2 = ylxVar.d) != null) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelable lLMRequest = new com.google.android.apps.aicore.aidl.LLMRequest(aifyVar, ylxVar.b, ylxVar.c, aifyVar2, ylxVar.e, ylxVar.f, ylxVar.g, ylxVar.h, ylxVar.i, ylxVar.j, ylxVar.k, ylxVar.l, ylxVar.m, ylxVar.n);
            boolean z = ((ylb) ylpVar).a instanceof android.os.Binder;
            if (z) {
                ymoVar = new defpackage.ymo(this, ymoVar, lLMRequest);
            }
            try {
                defpackage.ylo yloVar = new defpackage.ylo(this, ymoVar, 0);
                android.os.Parcel parcelEP = ylpVar.eP();
                yld.d(parcelEP, lLMRequest);
                yld.f(parcelEP, yloVar);
                android.os.Parcel parcelEQ = ylpVar.eQ(6, parcelEP);
                android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
                if (strongBinder == null) {
                    ylhVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
                    ylhVar = iInterfaceQueryLocalInterface instanceof defpackage.ylj ? (defpackage.ylj) iInterfaceQueryLocalInterface : new defpackage.ylh(strongBinder);
                }
                parcelEQ.recycle();
                return ylhVar;
            } finally {
                if (!z) {
                    defpackage.xhp.s(lLMRequest);
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (ylxVar.a == null) {
            sb.append(" messages");
        }
        if ((ylxVar.o & 1) == 0) {
            sb.append(" temperature");
        }
        if ((ylxVar.o & 2) == 0) {
            sb.append(" topK");
        }
        if (ylxVar.d == null) {
            sb.append(" stopTokensList");
        }
        if ((ylxVar.o & 4) == 0) {
            sb.append(" targetReplyLengthMin");
        }
        if ((ylxVar.o & 8) == 0) {
            sb.append(" targetReplyLengthMax");
        }
        if ((ylxVar.o & 16) == 0) {
            sb.append(" applySafetyFilter");
        }
        if ((ylxVar.o & 32) == 0) {
            sb.append(" numSamples");
        }
        if ((ylxVar.o & 64) == 0) {
            sb.append(" preferredImageWidth");
        }
        if ((ylxVar.o & 128) == 0) {
            sb.append(" preferredImageHeight");
        }
        if ((ylxVar.o & 256) == 0) {
            sb.append(" rngSeed");
        }
        if ((ylxVar.o & 512) == 0) {
            sb.append(" overrideRequestKind");
        }
        if ((ylxVar.o & 1024) == 0) {
            sb.append(" numSoftTokens");
        }
        if ((ylxVar.o & 2048) == 0) {
            sb.append(" topP");
        }
        if ((ylxVar.o & 4096) == 0) {
            sb.append(" enableThinking");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ymr
    public final /* synthetic */ defpackage.ylj f(java.lang.Object obj, defpackage.ylr ylrVar) {
        defpackage.ylj ylhVar;
        defpackage.ylp ylpVar = (defpackage.ylp) obj;
        android.os.Parcel parcelEQ = ylpVar.eQ(4, ylpVar.eP());
        int i2 = parcelEQ.readInt();
        parcelEQ.recycle();
        if (i2 <= 0) {
            android.util.Log.w(i, "Ignoring prepareInferenceEngine because service is older than V2");
            ylrVar.a(3);
            return new defpackage.yli();
        }
        android.os.Parcel parcelEP = ylpVar.eP();
        yld.f(parcelEP, ylrVar);
        android.os.Parcel parcelEQ2 = ylpVar.eQ(5, parcelEP);
        android.os.IBinder strongBinder = parcelEQ2.readStrongBinder();
        if (strongBinder == null) {
            ylhVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
            ylhVar = iInterfaceQueryLocalInterface instanceof defpackage.ylj ? (defpackage.ylj) iInterfaceQueryLocalInterface : new defpackage.ylh(strongBinder);
        }
        parcelEQ2.recycle();
        return ylhVar;
    }

    @Override // defpackage.ymr
    public final /* bridge */ /* synthetic */ java.lang.Object g(defpackage.ylf ylfVar) {
        defpackage.ylp ylpVar;
        this.j.isPresent();
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = this.c.a();
        android.os.Parcel parcelEP = ylfVar.eP();
        yld.d(parcelEP, abstractSafeParcelableA);
        android.os.Parcel parcelEQ = ylfVar.eQ(5, parcelEP);
        android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
        if (strongBinder == null) {
            ylpVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMService");
            ylpVar = iInterfaceQueryLocalInterface instanceof defpackage.ylp ? (defpackage.ylp) iInterfaceQueryLocalInterface : new defpackage.ylp(strongBinder);
        }
        parcelEQ.recycle();
        return ylpVar;
    }
}
