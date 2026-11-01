package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yor extends defpackage.ymr implements defpackage.ymj {
    private static final java.lang.String h = "yor";
    private final j$.util.Optional i;

    private yor(defpackage.ymd ymdVar, defpackage.ymk ymkVar, defpackage.yml ymlVar) {
        super(ymdVar, ymkVar, ymlVar);
        this.i = j$.util.Optional.empty();
    }

    public static ynh h(com.google.android.apps.aicore.aidl.LegionResultMetadata legionResultMetadata) {
        if (legionResultMetadata == null) {
            return null;
        }
        defpackage.amdx amdxVar = new defpackage.amdx();
        amdxVar.k(legionResultMetadata.a);
        return amdxVar.j();
    }

    public static defpackage.yor i(defpackage.yot yotVar) {
        return new defpackage.yor(yotVar.a, yotVar.c, yotVar.b);
    }

    @Override // defpackage.ymr
    public final /* synthetic */ defpackage.ylj c(java.lang.Object obj, java.lang.Object obj2, defpackage.yng yngVar) {
        aify aifyVar;
        defpackage.ylu yluVar = (defpackage.ylu) obj;
        defpackage.yop yopVar = (defpackage.yop) obj2;
        aify aifyVar2 = yopVar.a;
        ahvr.bZ(!aifyVar2.isEmpty(), "Invalid SummarizationRequest: Neither messages nor batchMessages is set.");
        aifyVar2.isEmpty();
        defpackage.ymb ymbVar = new defpackage.ymb();
        ymbVar.b(aike.a);
        ymbVar.i();
        ymbVar.g(3);
        ymbVar.f(3);
        ymbVar.e(500);
        ymbVar.d();
        ymbVar.a(3);
        ymbVar.c(123);
        ymbVar.h = com.google.android.apps.aicore.aidl.SummarizationArguments.a(new java.util.HashMap());
        ymbVar.h();
        ymbVar.i = com.google.android.apps.aicore.aidl.UserProperties.a;
        ymbVar.i();
        ymbVar.g(yopVar.b);
        ymbVar.f(yopVar.c);
        ymbVar.e(yopVar.d);
        ymbVar.d();
        ymbVar.a(yopVar.e);
        ymbVar.c(yopVar.f);
        ymbVar.h();
        defpackage.ymm ymmVar = yopVar.h;
        ymbVar.i = new com.google.android.apps.aicore.aidl.UserProperties(false);
        defpackage.ylj ylhVar = null;
        if (aifyVar2.isEmpty()) {
            new aift(4);
            throw null;
        }
        aift aiftVar = new aift(4);
        int size = aifyVar2.size();
        for (int i = 0; i < size; i++) {
            aiftVar.i(new com.google.android.apps.aicore.aidl.SummarizationMessage(((defpackage.yon) aifyVar2.get(i)).a));
        }
        ymbVar.b(aiftVar.h());
        aigf aigfVar = yopVar.g.a;
        if (!aigfVar.isEmpty()) {
            ymbVar.h = com.google.android.apps.aicore.aidl.SummarizationArguments.a(aigfVar);
        }
        if (ymbVar.j == -1 && (aifyVar = ymbVar.a) != null) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelable summarizationRequest = new com.google.android.apps.aicore.aidl.SummarizationRequest(aifyVar, ymbVar.b, ymbVar.c, ymbVar.d, ymbVar.e, ymbVar.f, ymbVar.g, ymbVar.h, ymbVar.i);
            defpackage.ylo yloVar = new defpackage.ylo(this, yngVar, 4);
            android.os.Parcel parcelEP = yluVar.eP();
            yld.d(parcelEP, summarizationRequest);
            yld.f(parcelEP, yloVar);
            android.os.Parcel parcelEQ = yluVar.eQ(3, parcelEP);
            android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
                ylhVar = iInterfaceQueryLocalInterface instanceof defpackage.ylj ? (defpackage.ylj) iInterfaceQueryLocalInterface : new defpackage.ylh(strongBinder);
            }
            parcelEQ.recycle();
            return ylhVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (ymbVar.a == null) {
            sb.append(" messages");
        }
        if ((ymbVar.j & 1) == 0) {
            sb.append(" temperature");
        }
        if ((ymbVar.j & 2) == 0) {
            sb.append(" topK");
        }
        if ((ymbVar.j & 4) == 0) {
            sb.append(" targetReplyLengthMin");
        }
        if ((ymbVar.j & 8) == 0) {
            sb.append(" targetReplyLengthMax");
        }
        if ((ymbVar.j & 16) == 0) {
            sb.append(" safetyClassificationMode");
        }
        if ((ymbVar.j & 32) == 0) {
            sb.append(" bulletPointNum");
        }
        if ((ymbVar.j & 64) == 0) {
            sb.append(" rgnSeed");
        }
        if ((ymbVar.j & 128) == 0) {
            sb.append(" overrideRequestKind");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ymr
    public final /* synthetic */ defpackage.ylj f(java.lang.Object obj, defpackage.ylr ylrVar) {
        defpackage.ylj ylhVar;
        defpackage.ylu yluVar = (defpackage.ylu) obj;
        android.os.Parcel parcelEQ = yluVar.eQ(4, yluVar.eP());
        int i = parcelEQ.readInt();
        parcelEQ.recycle();
        if (i <= 0) {
            android.util.Log.w(h, "Ignoring prepareInferenceEngine because service is older than V2");
            ylrVar.a(3);
            return new defpackage.yli();
        }
        android.os.Parcel parcelEP = yluVar.eP();
        yld.f(parcelEP, ylrVar);
        android.os.Parcel parcelEQ2 = yluVar.eQ(5, parcelEP);
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
        defpackage.ylu yluVar;
        this.i.isPresent();
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = this.c.a();
        android.os.Parcel parcelEP = ylfVar.eP();
        yld.d(parcelEP, abstractSafeParcelableA);
        android.os.Parcel parcelEQ = ylfVar.eQ(6, parcelEP);
        android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
        if (strongBinder == null) {
            yluVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationService");
            yluVar = iInterfaceQueryLocalInterface instanceof defpackage.ylu ? (defpackage.ylu) iInterfaceQueryLocalInterface : new defpackage.ylu(strongBinder);
        }
        parcelEQ.recycle();
        return yluVar;
    }
}
