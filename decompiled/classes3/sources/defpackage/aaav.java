package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aaav implements aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aaav(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.os.Parcelable, java.lang.Object] */
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                int i = defpackage.aaax.a;
                defpackage.aaaz aaazVar = (defpackage.aaaz) ((defpackage.aaay) obj).v();
                defpackage.zyp zypVar = new defpackage.zyp((zzx) obj2, 2);
                android.os.Parcel parcelEP = aaazVar.eP();
                yld.d(parcelEP, (android.os.Parcelable) this.a);
                yld.f(parcelEP, zypVar);
                aaazVar.eS(2, parcelEP);
                break;
            case 1:
                defpackage.zyc zycVar = new defpackage.zyc((abce) this.a, (zzx) obj2);
                zyb zybVarV = ((zxz) obj).v();
                android.os.Parcel parcelEP2 = zybVarV.eP();
                yld.f(parcelEP2, zycVar);
                zybVarV.eR(3, parcelEP2);
                break;
            case 2:
                int i2 = defpackage.aahz.a;
                defpackage.aahv aahvVar = (defpackage.aahv) ((defpackage.aaht) obj).v();
                android.os.Parcel parcelEP3 = aahvVar.eP();
                yld.d(parcelEP3, (android.os.Parcelable) this.a);
                aahvVar.eS(1, parcelEP3);
                ((zzx) obj2).i((java.lang.Object) null);
                break;
            case 3:
                int i3 = defpackage.aaib.a;
                defpackage.aahx aahxVar = (defpackage.aahx) ((defpackage.aahu) obj).v();
                android.os.Parcel parcelEP4 = aahxVar.eP();
                yld.d(parcelEP4, (android.os.Parcelable) this.a);
                aahxVar.eS(1, parcelEP4);
                ((zzx) obj2).i((java.lang.Object) null);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int i4 = aaid.a;
                defpackage.aahw aahwVar = (defpackage.aahw) ((aaie) obj).v();
                android.os.Parcel parcelEP5 = aahwVar.eP();
                yld.d(parcelEP5, (android.os.Parcelable) this.a);
                aahwVar.eS(1, parcelEP5);
                ((zzx) obj2).i((java.lang.Object) null);
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aapz aapzVar = (aapz) obj;
                aaqa aaqaVarV = aapzVar.v();
                defpackage.ylo yloVar = new defpackage.ylo((zzx) obj2, 13, (short[]) null);
                android.content.Context context = ((aagf) aapzVar).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataY = aazc.y();
                android.os.Parcel parcelEP6 = aaqaVarV.eP();
                parcelEP6.writeString((java.lang.String) this.a);
                yld.f(parcelEP6, yloVar);
                yld.d(parcelEP6, apiMetadataY);
                aaqaVarV.eR(3, parcelEP6);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aapz aapzVar2 = (aapz) obj;
                aaqa aaqaVarV2 = aapzVar2.v();
                java.lang.Object obj3 = this.a;
                java.lang.String str = ((defpackage.aaqe) obj3).c;
                byte[] bArrI = ((akym) obj3).i();
                aaew aaqbVar = new defpackage.aaqb((zzx) obj2);
                android.content.Context context2 = ((aagf) aapzVar2).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX = aazc.x();
                android.os.Parcel parcelEP7 = aaqaVarV2.eP();
                parcelEP7.writeString(str);
                parcelEP7.writeByteArray(bArrI);
                yld.f(parcelEP7, aaqbVar);
                yld.d(parcelEP7, apiMetadataX);
                aaqaVarV2.eR(2, parcelEP7);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.aasa aasaVar = (defpackage.aasa) obj;
                defpackage.aaru aaruVar = (defpackage.aaru) aasaVar.v();
                android.content.Context context3 = ((aagf) aasaVar).b;
                aaruVar.a((defpackage.aart) this.a, true, 1, aazc.x());
                ((zzx) obj2).g((java.lang.Object) null);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.aasa aasaVar2 = (defpackage.aasa) obj;
                defpackage.aaru aaruVar2 = (defpackage.aaru) aasaVar2.v();
                android.content.Context context4 = ((aagf) aasaVar2).b;
                aaruVar2.a((defpackage.aart) this.a, false, 0, aazc.x());
                ((zzx) obj2).g(java.lang.Boolean.TRUE);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.aaqr aaqrVar = (defpackage.aaqr) obj;
                defpackage.aaqu aaquVar = (defpackage.aaqu) aaqrVar.v();
                defpackage.aaqy aaqyVar = new defpackage.aaqy((defpackage.aara) this.a, (zzx) obj2);
                android.content.Context context5 = ((aagf) aaqrVar).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX2 = aazc.x();
                android.os.Parcel parcelEP8 = aaquVar.eP();
                yld.f(parcelEP8, aaqyVar);
                yld.d(parcelEP8, apiMetadataX2);
                aaquVar.eR(224704, parcelEP8);
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.aaqr aaqrVar2 = (defpackage.aaqr) obj;
                java.lang.Object obj4 = this.a;
                try {
                    defpackage.aaqu aaquVar2 = (defpackage.aaqu) aaqrVar2.v();
                    defpackage.aaqw aaqwVar = new defpackage.aaqw((defpackage.aara) obj4, (zzx) obj2);
                    android.content.Context context6 = ((aagf) aaqrVar2).b;
                    com.google.android.gms.common.api.ApiMetadata apiMetadataX3 = aazc.x();
                    android.os.Parcel parcelEP9 = aaquVar2.eP();
                    yld.f(parcelEP9, aaqwVar);
                    yld.d(parcelEP9, apiMetadataX3);
                    aaquVar2.eR(224702, parcelEP9);
                } catch (android.os.RemoteException e) {
                    ((zzx) obj2).h(e);
                    return;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                int i5 = aata.a;
                aate aateVar = new aate((zzx) obj2);
                aatf aatfVarV = ((aatg) obj).v();
                android.os.Parcel parcelEP10 = aatfVarV.eP();
                yld.f(parcelEP10, aateVar);
                parcelEP10.writeTypedArray((android.os.Parcelable[]) this.a, 0);
                aatfVarV.eR(19, parcelEP10);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int i6 = aata.a;
                aate aateVar2 = new aate((zzx) obj2);
                aatf aatfVarV2 = ((aatg) obj).v();
                android.os.Parcel parcelEP11 = aatfVarV2.eP();
                yld.f(parcelEP11, aateVar2);
                parcelEP11.writeString("com.google.android.dialer.directboot#com.google.android.dialer");
                parcelEP11.writeString(null);
                parcelEP11.writeString("");
                parcelEP11.writeString((java.lang.String) this.a);
                aatfVarV2.eR(23, parcelEP11);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj5 = this.a;
                ((aavs) obj).N(((aada) obj5).e.a, (defpackage.zyp) null, new defpackage.aavh((abce) obj5, (zzx) obj2));
                break;
            default:
                defpackage.aayc aaycVar = (defpackage.aayc) obj;
                java.lang.Object obj6 = this.a;
                try {
                    defpackage.aaws aawsVar = new defpackage.aaws((defpackage.aawt) obj6, (zzx) obj2);
                    defpackage.aaxn aaxnVar = (defpackage.aaxn) aaycVar.v();
                    java.lang.String str2 = ((defpackage.aawt) obj6).a;
                    android.os.Parcel parcelEP12 = aaxnVar.eP();
                    yld.f(parcelEP12, aawsVar);
                    parcelEP12.writeString(str2);
                    aaxnVar.eR(117, parcelEP12);
                } catch (android.os.RemoteException e2) {
                    ((zzx) obj2).h(e2);
                }
                break;
        }
    }
}
