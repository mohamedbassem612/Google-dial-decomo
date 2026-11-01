package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aaps implements aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aaps(long j, j$.time.Instant instant, int i) {
        this.$cid = i;
        this.a = j;
        this.b = instant;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [android.os.Parcelable, java.lang.Object] */
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            aapw aapwVar = (aapw) obj;
            defpackage.ylo yloVar = new defpackage.ylo((zzx) obj2, 12, (char[]) null);
            aapr aaprVarV = aapwVar.v();
            android.content.Context context = ((aagf) aapwVar).b;
            long epochMilli = ((j$.time.Instant) this.b).toEpochMilli();
            com.google.android.gms.common.api.ApiMetadata apiMetadataX = aazc.x();
            android.os.Parcel parcelEP = aaprVarV.eP();
            yld.f(parcelEP, yloVar);
            parcelEP.writeLong(this.a);
            parcelEP.writeLong(epochMilli);
            yld.d(parcelEP, apiMetadataX);
            aaprVarV.eR(2, parcelEP);
            return;
        }
        if (i != 1) {
            aapw aapwVar2 = (aapw) obj;
            aaew aaptVar = new defpackage.aapt((zzx) obj2);
            aapr aaprVarV2 = aapwVar2.v();
            android.content.Context context2 = ((aagf) aapwVar2).b;
            long epochMilli2 = ((j$.time.Instant) this.b).toEpochMilli();
            com.google.android.gms.common.api.ApiMetadata apiMetadataX2 = aazc.x();
            android.os.Parcel parcelEP2 = aaprVarV2.eP();
            yld.f(parcelEP2, aaptVar);
            parcelEP2.writeLong(this.a);
            parcelEP2.writeLong(epochMilli2);
            yld.d(parcelEP2, apiMetadataX2);
            aaprVarV2.eR(1, parcelEP2);
            return;
        }
        defpackage.aalz aalzVar = (defpackage.aalz) obj;
        long j = this.a;
        ?? r7 = this.b;
        try {
            aaoo.n((android.os.Bundle) r7);
            defpackage.aamb aambVar = (defpackage.aamb) aalzVar.v();
            android.os.Parcel parcelEP3 = aambVar.eP();
            yld.d(parcelEP3, (android.os.Parcelable) r7);
            parcelEP3.writeLong(j);
            aambVar.eR(4, parcelEP3);
            ((zzx) obj2).i((java.lang.Object) null);
        } catch (java.lang.Exception e) {
            android.util.Log.e("gF_FeedbackClient", "Requesting to save the async feedback psd failed!", e);
            ((zzx) obj2).h(new android.os.RemoteException("Internall Error: Failed to start feedback"));
        }
    }

    public /* synthetic */ aaps(android.os.Bundle bundle, long j, int i) {
        this.$cid = i;
        this.b = bundle;
        this.a = j;
    }
}
