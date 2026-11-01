package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yoh extends defpackage.ymr implements defpackage.ymj {
    public static final /* synthetic */ int h = 0;
    private static final java.lang.String i = "yoh";

    public yoh(defpackage.ymd ymdVar, defpackage.ymk ymkVar, defpackage.yml ymlVar) {
        super(ymdVar, ymkVar, ymlVar);
    }

    @Override // defpackage.ymr
    public final /* synthetic */ defpackage.ylj c(java.lang.Object obj, java.lang.Object obj2, defpackage.yng yngVar) {
        defpackage.ylj ylhVar;
        defpackage.yls ylsVar = (defpackage.yls) obj;
        defpackage.yof yofVar = (defpackage.yof) obj2;
        aift aiftVar = new aift(4);
        aify aifyVar = yofVar.a;
        int size = aifyVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            aiftVar.i(((defpackage.yoe) aifyVar.get(i2)).a);
        }
        aify aifyVarH = aiftVar.h();
        defpackage.ymm ymmVar = yofVar.b;
        com.google.android.gms.common.internal.safeparcel.SafeParcelable smartReplyRequest = new com.google.android.apps.aicore.aidl.SmartReplyRequest(aifyVarH, 1, new com.google.android.apps.aicore.aidl.UserProperties(false));
        defpackage.ylo yloVar = new defpackage.ylo(this, yngVar, 2);
        android.os.Parcel parcelEP = ylsVar.eP();
        yld.d(parcelEP, smartReplyRequest);
        yld.f(parcelEP, yloVar);
        android.os.Parcel parcelEQ = ylsVar.eQ(3, parcelEP);
        android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
        if (strongBinder == null) {
            ylhVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
            ylhVar = iInterfaceQueryLocalInterface instanceof defpackage.ylj ? (defpackage.ylj) iInterfaceQueryLocalInterface : new defpackage.ylh(strongBinder);
        }
        parcelEQ.recycle();
        return ylhVar;
    }

    @Override // defpackage.ymr
    public final /* synthetic */ defpackage.ylj f(java.lang.Object obj, defpackage.ylr ylrVar) {
        defpackage.ylj ylhVar;
        defpackage.yls ylsVar = (defpackage.yls) obj;
        android.os.Parcel parcelEQ = ylsVar.eQ(4, ylsVar.eP());
        int i2 = parcelEQ.readInt();
        parcelEQ.recycle();
        if (i2 <= 0) {
            android.util.Log.w(i, "Ignoring prepareInferenceEngine because service is older than V2");
            ylrVar.a(3);
            return new defpackage.yli();
        }
        android.os.Parcel parcelEP = ylsVar.eP();
        yld.f(parcelEP, ylrVar);
        android.os.Parcel parcelEQ2 = ylsVar.eQ(5, parcelEP);
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
        defpackage.yls ylsVar;
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = this.c.a();
        android.os.Parcel parcelEP = ylfVar.eP();
        yld.d(parcelEP, abstractSafeParcelableA);
        android.os.Parcel parcelEQ = ylfVar.eQ(8, parcelEP);
        android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
        if (strongBinder == null) {
            ylsVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISmartReplyService");
            ylsVar = iInterfaceQueryLocalInterface instanceof defpackage.yls ? (defpackage.yls) iInterfaceQueryLocalInterface : new defpackage.yls(strongBinder);
        }
        parcelEQ.recycle();
        return ylsVar;
    }
}
