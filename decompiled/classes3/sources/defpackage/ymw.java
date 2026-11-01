package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ymw implements defpackage.ymz {
    @Override // defpackage.ymz
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.String str = defpackage.yna.a;
        aift aiftVar = new aift(4);
        ylb ylbVar = (ylb) obj;
        android.os.Parcel parcelEQ = ylbVar.eQ(2, ylbVar.eP());
        com.google.android.apps.aicore.aidl.AIFeature[] aIFeatureArr = (com.google.android.apps.aicore.aidl.AIFeature[]) parcelEQ.createTypedArray(com.google.android.apps.aicore.aidl.AIFeature.CREATOR);
        parcelEQ.recycle();
        for (com.google.android.apps.aicore.aidl.AIFeature aIFeature : aIFeatureArr) {
            aiftVar.i(defpackage.ymk.b(aIFeature));
        }
        return aiftVar.h();
    }
}
