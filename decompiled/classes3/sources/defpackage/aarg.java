package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aarg implements aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aarg(aada aadaVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.b = aadaVar;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.os.Parcelable, java.lang.Object] */
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                aaqq aaqqVar = (aaqq) obj;
                defpackage.aarm aarmVar = new defpackage.aarm((aarp) this.a, (zzx) obj2);
                aaqs aaqsVarV = aaqqVar.v();
                android.content.Context context = ((aagf) aaqqVar).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX = aazc.x();
                android.os.Parcel parcelEP = aaqsVarV.eP();
                yld.f(parcelEP, aarmVar);
                parcelEP.writeTypedList(this.b);
                yld.d(parcelEP, apiMetadataX);
                aaqsVarV.eR(250206, parcelEP);
                break;
            case 1:
                aaqq aaqqVar2 = (aaqq) obj;
                defpackage.aari aariVar = new defpackage.aari((aarp) this.b, (zzx) obj2);
                aaqs aaqsVarV2 = aaqqVar2.v();
                android.content.Context context2 = ((aagf) aaqqVar2).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataY = aazc.y();
                android.os.Parcel parcelEP2 = aaqsVarV2.eP();
                yld.f(parcelEP2, aariVar);
                yld.d(parcelEP2, (android.os.Parcelable) this.a);
                yld.d(parcelEP2, apiMetadataY);
                aaqsVarV2.eR(250201, parcelEP2);
                break;
            case 2:
                int i = aata.a;
                aate aateVar = new aate((zzx) obj2);
                aatf aatfVarV = ((aatg) obj).v();
                android.os.Parcel parcelEP3 = aatfVarV.eP();
                yld.f(parcelEP3, aateVar);
                parcelEP3.writeString((java.lang.String) this.a);
                parcelEP3.writeByteArray((byte[]) this.b);
                aatfVarV.eR(20, parcelEP3);
                break;
            case 3:
                defpackage.aavc aavcVar = (defpackage.aavc) obj;
                aaew aavaVar = new defpackage.aava((defpackage.aavb) this.b, (zzx) obj2);
                defpackage.aauy aauyVar = (defpackage.aauy) aavcVar.v();
                android.content.Context context3 = ((aagf) aavcVar).b;
                byte[] bArrI = ((akym) this.a).i();
                com.google.android.gms.common.api.ApiMetadata apiMetadataX2 = aazc.x();
                android.os.Parcel parcelEP4 = aauyVar.eP();
                yld.f(parcelEP4, aavaVar);
                parcelEP4.writeByteArray(bArrI);
                yld.d(parcelEP4, apiMetadataX2);
                aauyVar.eR(1, parcelEP4);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.aayc aaycVar = (defpackage.aayc) obj;
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                try {
                    defpackage.aaxg aaxgVar = new defpackage.aaxg();
                    defpackage.aaxn aaxnVar = (defpackage.aaxn) aaycVar.v();
                    defpackage.aaxw aaxwVar = new defpackage.aaxw(new defpackage.aaxr((defpackage.aawd) obj4, (zzx) obj2, 1, (char[]) null), aaxgVar, new defpackage.aawt((defpackage.aawd) obj4, (java.lang.String) obj3));
                    android.os.Parcel parcelEP5 = aaxnVar.eP();
                    yld.f(parcelEP5, aaxwVar);
                    yld.f(parcelEP5, aaxgVar);
                    parcelEP5.writeString((java.lang.String) obj3);
                    aaxnVar.eR(35, parcelEP5);
                } catch (android.os.RemoteException e) {
                    ((zzx) obj2).h(e);
                    return;
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.aaxs aaxsVar = new defpackage.aaxs((defpackage.aawd) this.a, (zzx) obj2);
                defpackage.aaxn aaxnVar2 = (defpackage.aaxn) ((defpackage.aayc) obj).v();
                android.os.Parcel parcelEP6 = aaxnVar2.eP();
                yld.f(parcelEP6, aaxsVar);
                parcelEP6.writeString((java.lang.String) this.b);
                aaxnVar2.eR(67, parcelEP6);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.ylo yloVar = new defpackage.ylo((zzx) obj2, 14, (int[]) null);
                defpackage.abcd abcdVar = (defpackage.abcd) ((abch) obj).v();
                android.os.Parcel parcelEP7 = abcdVar.eP();
                yld.d(parcelEP7, (android.os.Parcelable) this.a);
                parcelEP7.writeString("has_verdict");
                yld.d(parcelEP7, (android.os.Parcelable) this.b);
                yld.f(parcelEP7, yloVar);
                abcdVar.eR(3, parcelEP7);
                break;
            default:
                defpackage.ylo yloVar2 = new defpackage.ylo((zzx) obj2, 15, (boolean[]) null);
                defpackage.abcd abcdVar2 = (defpackage.abcd) ((abch) obj).v();
                android.os.Parcel parcelEP8 = abcdVar2.eP();
                yld.d(parcelEP8, (android.os.Parcelable) this.a);
                parcelEP8.writeString("has_verdict");
                yld.d(parcelEP8, (android.os.Parcelable) this.b);
                yld.f(parcelEP8, yloVar2);
                abcdVar2.eR(2, parcelEP8);
                break;
        }
    }

    public /* synthetic */ aarg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
