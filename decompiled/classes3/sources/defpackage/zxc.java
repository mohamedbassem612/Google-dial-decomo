package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class zxc implements aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ zxc(aada aadaVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.b = aadaVar;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [aann, android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r2v39, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.os.Parcelable, com.google.android.gms.googlehelp.GoogleHelp] */
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        ?? r12;
        switch (this.$cid) {
            case 0:
                defpackage.zxe zxeVar = new defpackage.zxe((zxh) this.a, (zzx) obj2);
                zxb zxbVarV = ((zwz) obj).v();
                android.os.Parcel parcelEP = zxbVarV.eP();
                yld.f(parcelEP, zxeVar);
                yld.d(parcelEP, (android.os.Parcelable) this.b);
                zxbVarV.eR(1, parcelEP);
                return;
            case 1:
                defpackage.zwg zwgVar = (defpackage.zwg) obj;
                aaew zweVar = new defpackage.zwe((defpackage.zwf) this.b, (zzx) obj2);
                defpackage.zwh zwhVar = (defpackage.zwh) zwgVar.v();
                android.content.Context context = ((aagf) zwgVar).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX = aazc.x();
                android.os.Parcel parcelEP2 = zwhVar.eP();
                yld.d(parcelEP2, (android.os.Parcelable) this.a);
                yld.f(parcelEP2, zweVar);
                yld.d(parcelEP2, apiMetadataX);
                zwhVar.eR(1, parcelEP2);
                return;
            case 2:
                aaew zxgVar = new defpackage.zxg((zxh) this.b, (zzx) obj2);
                zxb zxbVarV2 = ((zwz) obj).v();
                android.os.Parcel parcelEP3 = zxbVarV2.eP();
                yld.f(parcelEP3, zxgVar);
                parcelEP3.writeString((java.lang.String) this.a);
                zxbVarV2.eR(3, parcelEP3);
                return;
            case 3:
                ?? r2 = this.b;
                defpackage.zxf zxfVar = new defpackage.zxf((zxh) this.a, (com.google.android.gms.auth.aang.GetTokenRequest) r2, (zzx) obj2);
                zxb zxbVarV3 = ((zwz) obj).v();
                android.os.Parcel parcelEP4 = zxbVarV3.eP();
                yld.f(parcelEP4, zxfVar);
                yld.d(parcelEP4, (android.os.Parcelable) r2);
                zxbVarV3.eR(2, parcelEP4);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.ylo yloVar = new defpackage.ylo((zxn) this.b, (zzx) obj2, 7);
                zxl zxlVarV = ((zxo) obj).v();
                android.os.Parcel parcelEP5 = zxlVarV.eP();
                yld.f(parcelEP5, yloVar);
                parcelEP5.writeString((java.lang.String) this.a);
                zxlVarV.eR(14, parcelEP5);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                try {
                    ((aaag) obj).v().a(new defpackage.aaac((aaaf) this.a, (zzx) obj2), (com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable) this.b);
                    return;
                } catch (android.os.RemoteException | java.lang.RuntimeException e) {
                    android.util.Log.e("ClearcutLoggerApiImpl", "Failed to call logError", e);
                    throw e;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aabp aabpVar = (aabp) obj;
                java.lang.Object obj3 = this.a;
                defpackage.ylo yloVar2 = new defpackage.ylo((aabs) obj3, (zzx) obj2, 8);
                int i = 0;
                try {
                    android.content.Context context2 = ((aada) obj3).b;
                    i = aaiy.b(context2).c(context2.getPackageName(), 0).versionCode;
                    break;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
                ?? r0 = this.b;
                ((com.google.android.gms.cloudmessaging.RegisterRequest) r0).f = i;
                aabq aabqVarV = aabpVar.v();
                android.content.Context context3 = ((aagf) aabpVar).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataY = aazc.y();
                android.os.Parcel parcelEP6 = aabqVarV.eP();
                yld.f(parcelEP6, yloVar2);
                yld.d(parcelEP6, (android.os.Parcelable) r0);
                yld.d(parcelEP6, apiMetadataY);
                aabqVarV.eR(1, parcelEP6);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.aamt aamtVar = (defpackage.aamt) obj;
                defpackage.aame aameVar = aamtVar.a;
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(((defpackage.aams) this.a).l);
                java.lang.Object obj4 = this.b;
                ?? r4 = (com.google.android.gms.googlehelp.GoogleHelp) ((android.content.Intent) obj4).getParcelableExtra("EXTRA_GOOGLE_HELP");
                ((defpackage.aamr) aameVar).a(r4);
                aaoo aaooVar = r4.R;
                j$.util.Objects.requireNonNull(aameVar);
                try {
                    defpackage.aamv aamvVar = (defpackage.aamv) aamtVar.v();
                    defpackage.aamn aamnVar = new defpackage.aamn((defpackage.aamr) aameVar, (android.content.Intent) obj4, weakReference, aaooVar);
                    android.os.Parcel parcelEP7 = aamvVar.eP();
                    yld.d(parcelEP7, (android.os.Parcelable) r4);
                    yld.d(parcelEP7, (android.os.Parcelable) null);
                    yld.f(parcelEP7, aamnVar);
                    aamvVar.eR(2, parcelEP7);
                    return;
                } catch (android.os.RemoteException e2) {
                    android.util.Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e2);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.aamt aamtVar2 = (defpackage.aamt) obj;
                defpackage.aame aameVar2 = aamtVar2.a;
                java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(((defpackage.aams) this.a).l);
                ?? r1 = this.b;
                com.google.android.gms.googlehelp.InProductHelp inProductHelp = (com.google.android.gms.googlehelp.InProductHelp) r1;
                com.google.android.gms.googlehelp.GoogleHelp googleHelp = inProductHelp.a;
                ((defpackage.aamr) aameVar2).a(googleHelp);
                aaoo aaooVar2 = googleHelp.R;
                j$.util.Objects.requireNonNull(aameVar2);
                inProductHelp.a = googleHelp;
                try {
                    defpackage.aamv aamvVar2 = (defpackage.aamv) aamtVar2.v();
                    defpackage.aamo aamoVar = new defpackage.aamo((defpackage.aamr) aameVar2, weakReference2, aaooVar2);
                    android.os.Parcel parcelEP8 = aamvVar2.eP();
                    yld.d(parcelEP8, (android.os.Parcelable) r1);
                    yld.d(parcelEP8, (android.os.Parcelable) null);
                    yld.f(parcelEP8, aamoVar);
                    aamvVar2.eR(17, parcelEP8);
                    return;
                } catch (android.os.RemoteException e3) {
                    android.util.Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e3);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.aaod aaodVar = (defpackage.aaod) obj;
                acxg acxgVar = defpackage.aany.a;
                java.lang.Object obj5 = this.a;
                aafe aafeVarB = ((defpackage.aanx) obj5).b();
                aafc aafcVar = (aafc) j$.util.Objects.requireNonNull(aafeVarB.a);
                boolean zN = aaodVar.N(defpackage.aani.j);
                aec aecVar = aaodVar.a;
                ?? r3 = this.b;
                synchronized (aecVar) {
                    defpackage.aanm aanmVar = (defpackage.aanm) aecVar.get(aafcVar);
                    if (aanmVar == null || zN) {
                        defpackage.aanm aanmVar2 = new defpackage.aanm((defpackage.aanx) obj5);
                        aecVar.put(aafcVar, aanmVar2);
                        r12 = aanmVar2;
                    } else {
                        aanmVar.a.c(aafeVarB);
                        r12 = aanmVar;
                        aanmVar = null;
                    }
                    if (zN) {
                        defpackage.aanv aanvVar = (defpackage.aanv) aaodVar.v();
                        com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = com.google.android.gms.location.internal.LocationReceiver.a(aanmVar, r12, aafcVar.a());
                        aaew aanzVar = new defpackage.aanz(null, (zzx) obj2);
                        android.os.Parcel parcelEP9 = aanvVar.eP();
                        yld.d(parcelEP9, abstractSafeParcelableA);
                        yld.d(parcelEP9, (android.os.Parcelable) r3);
                        yld.f(parcelEP9, aanzVar);
                        aanvVar.eR(88, parcelEP9);
                    } else {
                        ((defpackage.aanv) aaodVar.v()).a(new com.google.android.gms.location.internal.LocationRequestUpdateData(1, new com.google.android.gms.location.internal.LocationRequestInternal((com.google.android.gms.location.LocationRequest) r3, null, false, false, false, false, Long.MAX_VALUE), r12, null, null, new defpackage.aaob((zzx) obj2, r12), aafcVar.a()));
                    }
                    break;
                }
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aapb aapbVar = (aapb) obj;
                int i2 = aapa.a;
                defpackage.ylo yloVar3 = new defpackage.ylo((zzx) obj2, 11, (byte[]) null);
                aaoy aaoyVarV = aapbVar.v();
                android.content.Context context4 = ((aagf) aapbVar).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataY2 = aazc.y();
                android.os.Parcel parcelEP10 = aaoyVarV.eP();
                yld.f(parcelEP10, yloVar3);
                yld.d(parcelEP10, (android.os.Parcelable) this.a);
                yld.d(parcelEP10, (android.os.Parcelable) this.b);
                yld.d(parcelEP10, apiMetadataY2);
                aaoyVarV.eR(1, parcelEP10);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aapn aapnVar = (aapn) obj;
                zzx zzxVar = (zzx) obj2;
                aapg aapmVar = new defpackage.aapm((abce) this.b, zzxVar);
                ?? r5 = this.a;
                try {
                    aaph aaphVarV = aapnVar.v();
                    android.content.Context context5 = ((aagf) aapnVar).b;
                    com.google.android.gms.common.api.ApiMetadata apiMetadataX2 = aazc.x();
                    android.os.Parcel parcelEP11 = aaphVarV.eP();
                    yld.f(parcelEP11, aapmVar);
                    yld.d(parcelEP11, (android.os.Parcelable) r5);
                    yld.d(parcelEP11, apiMetadataX2);
                    aaphVarV.eR(3, parcelEP11);
                    return;
                } catch (android.os.RemoteException unused2) {
                    aais.ax(com.google.android.gms.common.api.Status.c, (java.lang.Object) null, zzxVar);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aapn aapnVar2 = (aapn) obj;
                zzx zzxVar2 = (zzx) obj2;
                aapg aaplVar = new defpackage.aapl((abce) this.a, zzxVar2);
                ?? r6 = this.b;
                try {
                    aaph aaphVarV2 = aapnVar2.v();
                    android.content.Context context6 = ((aagf) aapnVar2).b;
                    com.google.android.gms.common.api.ApiMetadata apiMetadataX3 = aazc.x();
                    android.os.Parcel parcelEP12 = aaphVarV2.eP();
                    yld.f(parcelEP12, aaplVar);
                    yld.d(parcelEP12, (android.os.Parcelable) r6);
                    yld.d(parcelEP12, apiMetadataX3);
                    aaphVarV2.eR(2, parcelEP12);
                    return;
                } catch (android.os.RemoteException unused3) {
                    aais.ax(com.google.android.gms.common.api.Status.c, (java.lang.Object) null, zzxVar2);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.aaqr aaqrVar = (defpackage.aaqr) obj;
                java.lang.Object obj6 = this.b;
                java.lang.Object obj7 = this.a;
                try {
                    defpackage.aaqu aaquVar = (defpackage.aaqu) aaqrVar.v();
                    defpackage.aaqz aaqzVar = new defpackage.aaqz((defpackage.aara) obj7, (android.content.Context) obj6, (zzx) obj2);
                    android.content.Context context7 = ((aagf) aaqrVar).b;
                    com.google.android.gms.common.api.ApiMetadata apiMetadataX4 = aazc.x();
                    android.os.Parcel parcelEP13 = aaquVar.eP();
                    yld.f(parcelEP13, aaqzVar);
                    yld.d(parcelEP13, apiMetadataX4);
                    aaquVar.eR(224705, parcelEP13);
                    return;
                } catch (android.os.RemoteException e4) {
                    ((zzx) obj2).h(e4);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.aaqr aaqrVar2 = (defpackage.aaqr) obj;
                defpackage.aaqu aaquVar2 = (defpackage.aaqu) aaqrVar2.v();
                defpackage.aaqx aaqxVar = new defpackage.aaqx((defpackage.aara) this.a, (aafe) this.b);
                android.content.Context context8 = ((aagf) aaqrVar2).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX5 = aazc.x();
                android.os.Parcel parcelEP14 = aaquVar2.eP();
                yld.f(parcelEP14, aaqxVar);
                yld.d(parcelEP14, apiMetadataX5);
                aaquVar2.eR(224703, parcelEP14);
                return;
            case 15:
                defpackage.aaqr aaqrVar3 = (defpackage.aaqr) obj;
                ?? r7 = this.a;
                java.lang.Object obj8 = this.b;
                try {
                    defpackage.aaqu aaquVar3 = (defpackage.aaqu) aaqrVar3.v();
                    defpackage.aarc aarcVar = new defpackage.aarc((defpackage.aard) obj8, (zzx) obj2);
                    android.content.Context context9 = ((aagf) aaqrVar3).b;
                    com.google.android.gms.common.api.ApiMetadata apiMetadataY3 = aazc.y();
                    android.os.Parcel parcelEP15 = aaquVar3.eP();
                    yld.f(parcelEP15, aarcVar);
                    yld.d(parcelEP15, (android.os.Parcelable) r7);
                    yld.d(parcelEP15, apiMetadataY3);
                    aaquVar3.eR(262101, parcelEP15);
                    return;
                } catch (android.os.RemoteException e5) {
                    ((zzx) obj2).h(e5);
                    return;
                }
            case 16:
                aaqq aaqqVar = (aaqq) obj;
                defpackage.aarj aarjVar = new defpackage.aarj((aarp) this.b, (zzx) obj2);
                aaqs aaqsVarV = aaqqVar.v();
                android.content.Context context10 = ((aagf) aaqqVar).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataY4 = aazc.y();
                android.os.Parcel parcelEP16 = aaqsVarV.eP();
                yld.f(parcelEP16, aarjVar);
                parcelEP16.writeTypedList(this.a);
                yld.d(parcelEP16, apiMetadataY4);
                aaqsVarV.eR(250202, parcelEP16);
                return;
            case 17:
                aaqq aaqqVar2 = (aaqq) obj;
                defpackage.aarn aarnVar = new defpackage.aarn((aarp) this.b, (zzx) obj2);
                aaqs aaqsVarV2 = aaqqVar2.v();
                android.content.Context context11 = ((aagf) aaqqVar2).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX6 = aazc.x();
                android.os.Parcel parcelEP17 = aaqsVarV2.eP();
                yld.f(parcelEP17, aarnVar);
                parcelEP17.writeTypedList(this.a);
                yld.d(parcelEP17, apiMetadataX6);
                aaqsVarV2.eR(250207, parcelEP17);
                return;
            case 18:
                aaqq aaqqVar3 = (aaqq) obj;
                defpackage.aaro aaroVar = new defpackage.aaro((aarp) this.b, (zzx) obj2);
                aaqs aaqsVarV3 = aaqqVar3.v();
                android.content.Context context12 = ((aagf) aaqqVar3).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX7 = aazc.x();
                android.os.Parcel parcelEP18 = aaqsVarV3.eP();
                yld.f(parcelEP18, aaroVar);
                yld.d(parcelEP18, (android.os.Parcelable) this.a);
                yld.d(parcelEP18, apiMetadataX7);
                aaqsVarV3.eR(250208, parcelEP18);
                return;
            case 19:
                aaqq aaqqVar4 = (aaqq) obj;
                defpackage.aark aarkVar = new defpackage.aark((aarp) this.b, (zzx) obj2);
                aaqs aaqsVarV4 = aaqqVar4.v();
                android.content.Context context13 = ((aagf) aaqqVar4).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataY5 = aazc.y();
                android.os.Parcel parcelEP19 = aaqsVarV4.eP();
                yld.f(parcelEP19, aarkVar);
                parcelEP19.writeTypedList(this.a);
                yld.d(parcelEP19, apiMetadataY5);
                aaqsVarV4.eR(250204, parcelEP19);
                return;
            default:
                aaqq aaqqVar5 = (aaqq) obj;
                defpackage.aarl aarlVar = new defpackage.aarl((aarp) this.b, (zzx) obj2);
                aaqs aaqsVarV5 = aaqqVar5.v();
                android.content.Context context14 = ((aagf) aaqqVar5).b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX8 = aazc.x();
                android.os.Parcel parcelEP20 = aaqsVarV5.eP();
                yld.f(parcelEP20, aarlVar);
                yld.d(parcelEP20, (android.os.Parcelable) this.a);
                yld.d(parcelEP20, apiMetadataX8);
                aaqsVarV5.eR(250205, parcelEP20);
                return;
        }
    }

    public /* synthetic */ zxc(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
