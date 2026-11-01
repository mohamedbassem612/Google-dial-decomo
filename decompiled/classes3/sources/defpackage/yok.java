package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yok extends defpackage.ymr {
    public yok(defpackage.ymd ymdVar, defpackage.ymk ymkVar, defpackage.yml ymlVar) {
        super(ymdVar, ymkVar, ymlVar);
    }

    @Override // defpackage.ymr
    public final /* synthetic */ defpackage.ylj c(java.lang.Object obj, java.lang.Object obj2, defpackage.yng yngVar) {
        defpackage.ylj ylhVar;
        defpackage.ylt yltVar = (defpackage.ylt) obj;
        aift aiftVar = new aift(4);
        aify aifyVar = ((defpackage.yof) obj2).a;
        int size = aifyVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.yoe yoeVar = (defpackage.yoe) aifyVar.get(i);
            java.lang.String str = yoeVar.b;
            aiftVar.i(new com.google.android.apps.aicore.aidl.SuggestedTextMessage("User1", yoeVar.a));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelable suggestedTextRequest = new com.google.android.apps.aicore.aidl.SuggestedTextRequest(aiftVar.h(), 1);
        defpackage.ylo yloVar = new defpackage.ylo(this, yngVar, 3);
        android.os.Parcel parcelEP = yltVar.eP();
        yld.d(parcelEP, suggestedTextRequest);
        yld.f(parcelEP, yloVar);
        android.os.Parcel parcelEQ = yltVar.eQ(2, parcelEP);
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
        defpackage.ylt yltVar = (defpackage.ylt) obj;
        android.os.Parcel parcelEP = yltVar.eP();
        yld.f(parcelEP, ylrVar);
        android.os.Parcel parcelEQ = yltVar.eQ(4, parcelEP);
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
    public final /* bridge */ /* synthetic */ java.lang.Object g(defpackage.ylf ylfVar) {
        defpackage.ylt yltVar;
        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = this.c.a();
        android.os.Parcel parcelEP = ylfVar.eP();
        yld.d(parcelEP, abstractSafeParcelableA);
        android.os.Parcel parcelEQ = ylfVar.eQ(16, parcelEP);
        android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
        if (strongBinder == null) {
            yltVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISuggestedTextService");
            yltVar = iInterfaceQueryLocalInterface instanceof defpackage.ylt ? (defpackage.ylt) iInterfaceQueryLocalInterface : new defpackage.ylt(strongBinder);
        }
        parcelEQ.recycle();
        return yltVar;
    }
}
