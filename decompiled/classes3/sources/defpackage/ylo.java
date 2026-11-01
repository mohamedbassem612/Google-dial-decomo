package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ylo extends ylc implements android.os.IInterface {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(defpackage.ymy ymyVar, int i) {
        super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback");
        this.$cid = i;
        j$.util.Objects.requireNonNull(ymyVar);
        this.a = ymyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, yng] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, yng] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yng] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, yng] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, yng] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, yng] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, yng] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, yng] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, yng] */
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        java.lang.Object obj;
        defpackage.aaqe aaqeVar;
        ynh ynhVarJ = null;
        defpackage.aaol aaolVar = null;
        defpackage.akvs akvqVar = null;
        defpackage.ylf ylfVar = null;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    com.google.android.apps.aicore.aidl.FailedResult failedResult = (com.google.android.apps.aicore.aidl.FailedResult) yld.a(parcel, com.google.android.apps.aicore.aidl.FailedResult.CREATOR);
                    yld.c(parcel);
                    this.a.b(failedResult.a, failedResult.c);
                    return true;
                }
                com.google.android.apps.aicore.aidl.LLMResult lLMResult = (com.google.android.apps.aicore.aidl.LLMResult) yld.a(parcel, com.google.android.apps.aicore.aidl.LLMResult.CREATOR);
                yld.c(parcel);
                aift aiftVar = new aift(4);
                aify aifyVar = lLMResult.a;
                int size = aifyVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    com.google.android.apps.aicore.aidl.LLMReply lLMReply = (com.google.android.apps.aicore.aidl.LLMReply) aifyVar.get(i3);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.List<com.google.android.apps.aicore.aidl.FunctionCall> list = lLMReply.g;
                    if (list != null) {
                        for (com.google.android.apps.aicore.aidl.FunctionCall functionCall : list) {
                            aigb aigbVar = new aigb(4);
                            aigf aigfVarA = functionCall.a();
                            if (aigfVarA != null) {
                                ailj ailjVarK = aigfVarA.e().k();
                                while (ailjVarK.hasNext()) {
                                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                                    aigbVar.i((java.lang.String) entry.getKey(), defpackage.yoa.i((com.google.android.apps.aicore.aidl.FunctionArgsValue) entry.getValue()));
                                }
                            }
                            defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
                            aliqVar.r(aikj.b);
                            java.lang.String str = functionCall.a;
                            if (str == null) {
                                throw new java.lang.NullPointerException("Null name");
                            }
                            aliqVar.a = str;
                            aliqVar.c = functionCall.c;
                            aliqVar.r(aigbVar.e(true));
                            java.lang.Object obj2 = aliqVar.a;
                            if (obj2 == null || (obj = aliqVar.b) == null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                if (aliqVar.a == null) {
                                    sb.append(" name");
                                }
                                if (aliqVar.b == null) {
                                    sb.append(" args");
                                }
                                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
                            }
                            arrayList.add(new defpackage.yob((java.lang.String) obj2, (java.lang.String) aliqVar.c, (aigf) obj));
                        }
                    }
                    aiftVar.i(defpackage.ynl.a(lLMReply.a, lLMReply.d, lLMReply.c, defpackage.ynq.h(lLMReply.f), arrayList));
                }
                aift aiftVar2 = new aift(4);
                aify aifyVar2 = lLMResult.d;
                if (aifyVar2 != null) {
                    int size2 = aifyVar2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        com.google.android.apps.aicore.aidl.LLMReply lLMReply2 = (com.google.android.apps.aicore.aidl.LLMReply) aifyVar2.get(i4);
                        aiftVar2.i(defpackage.ynl.a(lLMReply2.a, lLMReply2.d, lLMReply2.c, defpackage.ynq.h(lLMReply2.f), aike.a));
                    }
                }
                aify aifyVarH = aiftVar.h();
                com.google.android.apps.aicore.aidl.InferenceEventTraceResult inferenceEventTraceResult = lLMResult.b;
                com.google.android.apps.aicore.aidl.LegionResultMetadata legionResultMetadata = lLMResult.c;
                int i5 = defpackage.ynq.h;
                if (legionResultMetadata != null) {
                    defpackage.amdx amdxVar = new defpackage.amdx();
                    amdxVar.k(legionResultMetadata.a);
                    ynhVarJ = amdxVar.j();
                }
                this.a.c(new defpackage.ynp(aify.n(aifyVarH), inferenceEventTraceResult, ynhVarJ, aify.n(aiftVar2.h())));
                return true;
            case 1:
                if (i == 2) {
                    android.os.IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAICoreService");
                        ylfVar = iInterfaceQueryLocalInterface instanceof defpackage.ylf ? (defpackage.ylf) iInterfaceQueryLocalInterface : new defpackage.ylf(strongBinder);
                    }
                    yld.c(parcel);
                    ((defpackage.ymx) this.a).g(ylfVar);
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                int i6 = parcel.readInt();
                java.lang.String string = parcel.readString();
                yld.c(parcel);
                if (i6 == 1) {
                    i2 = 601;
                } else if (i6 == 2) {
                    i2 = 604;
                } else if (i6 == 3) {
                    i2 = 607;
                }
                ((defpackage.ymx) this.a).c(new defpackage.ymi(4, i2, "AiCore service is not connected. Service provider failure: ".concat(java.lang.String.valueOf(string)), null));
                return true;
            case 2:
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    int i7 = parcel.readInt();
                    yld.c(parcel);
                    this.a.a(i7);
                    return true;
                }
                com.google.android.apps.aicore.aidl.SmartReplyResult smartReplyResult = (com.google.android.apps.aicore.aidl.SmartReplyResult) yld.a(parcel, com.google.android.apps.aicore.aidl.SmartReplyResult.CREATOR);
                yld.c(parcel);
                aift aiftVar3 = new aift(4);
                aify aifyVar3 = smartReplyResult.a;
                int size3 = aifyVar3.size();
                while (i2 < size3) {
                    com.google.android.apps.aicore.aidl.SmartReplyReplyEntry smartReplyReplyEntry = (com.google.android.apps.aicore.aidl.SmartReplyReplyEntry) aifyVar3.get(i2);
                    aiftVar3.i(new defpackage.yoj(smartReplyReplyEntry.a, smartReplyReplyEntry.c, smartReplyReplyEntry.b));
                    i2++;
                }
                this.a.c(defpackage.yog.a(aiftVar3.h(), smartReplyResult.b));
                return true;
            case 3:
                if (i != 2) {
                    if (i == 3) {
                        int i8 = parcel.readInt();
                        yld.c(parcel);
                        this.a.a(i8);
                        return true;
                    }
                    return false;
                }
                com.google.android.apps.aicore.aidl.SuggestedTextResult suggestedTextResult = (com.google.android.apps.aicore.aidl.SuggestedTextResult) yld.a(parcel, com.google.android.apps.aicore.aidl.SuggestedTextResult.CREATOR);
                yld.c(parcel);
                aift aiftVar4 = new aift(4);
                aify aifyVar4 = suggestedTextResult.a;
                int size4 = aifyVar4.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    aiftVar4.i(new defpackage.yoj(((com.google.android.apps.aicore.aidl.SuggestedTextReply) aifyVar4.get(i9)).a, 0.0f, 0));
                }
                this.a.c(defpackage.yog.a(aiftVar4.h(), suggestedTextResult.b));
                return true;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    int i10 = parcel.readInt();
                    yld.c(parcel);
                    this.a.a(i10);
                    return true;
                }
                com.google.android.apps.aicore.aidl.SummarizationResult summarizationResult = (com.google.android.apps.aicore.aidl.SummarizationResult) yld.a(parcel, com.google.android.apps.aicore.aidl.SummarizationResult.CREATOR);
                yld.c(parcel);
                aify aifyVar5 = summarizationResult.d;
                int i11 = 12;
                if (aifyVar5 == null) {
                    aift aiftVar5 = new aift(4);
                    aify aifyVar6 = summarizationResult.a;
                    int size5 = aifyVar6.size();
                    for (int i12 = 0; i12 < size5; i12++) {
                        com.google.android.apps.aicore.aidl.LLMReply lLMReply3 = (com.google.android.apps.aicore.aidl.LLMReply) aifyVar6.get(i12);
                        aiftVar5.i(new defpackage.you(lLMReply3.a, lLMReply3.d));
                    }
                    this.a.c(new defpackage.yoq(aify.n(aify.x(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparing(new defpackage.wyd(i11))), aiftVar5.h())), null, summarizationResult.c, summarizationResult.b, defpackage.yor.h(summarizationResult.e)));
                    return true;
                }
                aift aiftVar6 = new aift(4);
                int size6 = aifyVar5.size();
                int i13 = 0;
                while (i13 < size6) {
                    com.google.android.apps.aicore.aidl.SummarizationBatchReply summarizationBatchReply = (com.google.android.apps.aicore.aidl.SummarizationBatchReply) aifyVar5.get(i13);
                    aift aiftVar7 = new aift(4);
                    aify aifyVar7 = summarizationBatchReply.a;
                    int size7 = aifyVar7.size();
                    for (int i14 = i2; i14 < size7; i14++) {
                        com.google.android.apps.aicore.aidl.LLMReply lLMReply4 = (com.google.android.apps.aicore.aidl.LLMReply) aifyVar7.get(i14);
                        aiftVar7.i(new defpackage.you(lLMReply4.a, lLMReply4.d));
                    }
                    aify aifyVarN = aify.n(aify.x(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparing(new defpackage.wyd(i11))), aiftVar7.h()));
                    java.lang.String str2 = summarizationBatchReply.b;
                    if (str2 == null) {
                        throw new java.lang.NullPointerException("Null batchSignature");
                    }
                    if (aifyVarN == null) {
                        throw new java.lang.IllegalStateException("Missing required properties:".concat(" summaries"));
                    }
                    aiftVar6.i(new defpackage.yol(aifyVarN, str2));
                    i13++;
                    i2 = 0;
                }
                this.a.c(new defpackage.yoq(aike.a, aify.n(aiftVar6.h()), summarizationResult.c, summarizationResult.b, defpackage.yor.h(summarizationResult.e)));
                return true;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                if (i == 2) {
                    android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                    yld.c(parcel);
                    defpackage.akvr akvrVar = ((defpackage.adsr) this.a).c;
                    if (strongBinder2 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.oslo.service.serviceinterface.aidl.IOsloService");
                        akvqVar = iInterfaceQueryLocalInterface2 instanceof defpackage.akvs ? (defpackage.akvs) iInterfaceQueryLocalInterface2 : new defpackage.akvq(strongBinder2);
                    }
                    synchronized (akvrVar.b) {
                        akvrVar.a = akvqVar;
                        akvrVar.d(5);
                        break;
                    }
                    defpackage.tck.a.b().l("com/android/dialer/ringing/OsloAction$OsloConnectionListener", "onConnected", 140, "OsloAction.java").v("ConnectionListener.onConnected");
                } else {
                    if (i != 3) {
                        return false;
                    }
                    android.os.Bundle bundle = (android.os.Bundle) yld.a(parcel, android.os.Bundle.CREATOR);
                    yld.c(parcel);
                    java.lang.String string2 = bundle.getString("error_message", null);
                    java.lang.String string3 = bundle.getString("package_to_be_updated");
                    if (string3 != null) {
                        defpackage.sns.o(string2, string3);
                    } else {
                        defpackage.sns.n(string2);
                    }
                }
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (i != 1) {
                    return false;
                }
                byte[] bArrCreateByteArray = parcel.createByteArray();
                yld.c(parcel);
                try {
                    ((zzx) this.a).i(new aakj(true, true, alad.B(ajdq.a, bArrCreateByteArray, akzq.a()).b));
                    break;
                } catch (java.lang.NullPointerException | alaz e) {
                    android.util.Log.e("DuoStateFetcher", "Error getting Meet registered.", e);
                    ((zzx) this.a).i(new aakj(true, true, false));
                }
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                if (i != 2) {
                    return false;
                }
                com.google.android.gms.common.api.Status statusA = yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String string4 = parcel.readString();
                yld.c(parcel);
                aais.ax(statusA, string4, (zzx) this.a);
                return true;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (i != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status statusA2 = yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String string5 = parcel.readString();
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                aais.ax(statusA2, string5, (zzx) this.a);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (i == 1) {
                    parcel.readString();
                    yld.c(parcel);
                    ((aafe) this.a).b(new defpackage.aaly(this, 0));
                } else if (i == 2) {
                    parcel.readString();
                    yld.c(parcel);
                    ((aafe) this.a).b(new defpackage.aaly(this, 2, (char[]) null));
                } else if (i == 3) {
                    aafe aafeVar = (aafe) this.a;
                    aafeVar.b(new defpackage.aaoc(this, aafeVar, 1));
                } else {
                    if (i != 4) {
                        return false;
                    }
                    yld.g(parcel);
                    parcel.readString();
                    yld.c(parcel);
                    ((aafe) this.a).b(new defpackage.aaly(this, 1, (byte[]) null));
                }
                return true;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                if (i != 1) {
                    return false;
                }
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    aaolVar = iInterfaceQueryLocalInterface3 instanceof defpackage.aaol ? (defpackage.aaol) iInterfaceQueryLocalInterface3 : new defpackage.aaol(strongBinder3);
                }
                yld.c(parcel);
                defpackage.uzx uzxVar = new defpackage.uzx(aaolVar);
                java.lang.Object obj3 = this.a;
                aimz aimzVar = jxw.a;
                aimzVar.b().l("com/android/dialer/calllocation/ui/LocationViewPeer", "setMap$<anonymous>", 193, "LocationViewPeer.kt").v("retrieved google map");
                jxt jxtVar = (jxt) obj3;
                jxw jxwVar = (jxw) jxtVar.a;
                defpackage.uzx uzxVar2 = jxwVar.f;
                java.lang.Object obj4 = jxtVar.b;
                if (uzxVar2 != null) {
                    aimzVar.b().l("com/android/dialer/calllocation/ui/LocationViewPeer", "setMap$<anonymous>", 195, "LocationViewPeer.kt").v("Map was already set. Returning early.");
                    jxwVar.a((jxp) obj4);
                } else {
                    android.widget.FrameLayout frameLayout = jxwVar.c;
                    aaoh aaohVar = jxwVar.d;
                    frameLayout.addView(aaohVar);
                    jxwVar.f = uzxVar;
                    jxwVar.a((jxp) obj4);
                    if (((java.lang.Boolean) jxwVar.b.a()).booleanValue()) {
                        jxwVar.e(uzxVar);
                    }
                    aaohVar.setVisibility(0);
                    aaohVar.setClipToOutline(true);
                    android.view.View childAt = aaohVar.getChildAt(0);
                    if (childAt instanceof android.view.ViewGroup) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) childAt;
                        int childCount = viewGroup.getChildCount();
                        for (int i15 = 1; i15 < childCount; i15++) {
                            viewGroup.getChildAt(i15).setVisibility(8);
                        }
                    }
                    java.lang.Object obj5 = jxtVar.c;
                    jxwVar.c();
                    java.lang.String str3 = (java.lang.String) obj5;
                    jxwVar.e.i(str3).b(mce.bH);
                    defpackage.qbe qbeVarD = jxwVar.d(str3);
                    if (qbeVarD != null) {
                        qbeVarD.a(qbc.gN);
                    }
                }
                parcel2.writeNoException();
                return true;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (i != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status statusA3 = yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.mdisync.internal.SyncResult syncResult = (com.google.android.gms.mdisync.internal.SyncResult) yld.a(parcel, com.google.android.gms.mdisync.internal.SyncResult.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadataA = yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                aais.aw(statusA3, statusA3.c() ? syncResult.a : null, (zzx) this.a, apiMetadataA);
                return true;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                if (i != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status statusA4 = yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                int i16 = parcel.readInt();
                com.google.android.gms.common.api.ApiMetadata apiMetadataA2 = yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                aooh.f(statusA4, "status");
                aais.aw(statusA4, java.lang.Integer.valueOf(i16), (zzx) this.a, apiMetadataA2);
                return true;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (i != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status statusA5 = yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                aooh.f(statusA5, "status");
                if (bArrCreateByteArray2 != null) {
                    try {
                        aaqeVar = (defpackage.aaqe) alad.y(defpackage.aaqe.a, bArrCreateByteArray2);
                    } catch (alaz unused) {
                        ((zzx) this.a).h(new aacw(new com.google.android.gms.common.api.Status(8, "Protocol Buffer Parse Failed", (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null)));
                    }
                } else {
                    aaqeVar = null;
                }
                aais.ax(statusA5, aaqeVar, (zzx) this.a);
                return true;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                if (i != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status statusA6 = yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult readSignalResult = (com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult) yld.a(parcel, com.google.android.libraries.abuse.hades.signals.gmsclient.ReadSignalResult.CREATOR);
                yld.c(parcel);
                aooh.f(statusA6, "status");
                aooh.f(readSignalResult, "result");
                aais.ax(statusA6, readSignalResult, (zzx) this.a);
                return true;
            case 15:
                if (i != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status statusA7 = yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.c(parcel);
                aooh.f(statusA7, "status");
                aais.ax(statusA7, aojh.a, (zzx) this.a);
                return true;
            default:
                if (i == 1) {
                    com.google.android.setupcompat.restore.restoreprogress.RestoreProgressUiData restoreProgressUiData = (com.google.android.setupcompat.restore.restoreprogress.RestoreProgressUiData) yld.a(parcel, com.google.android.setupcompat.restore.restoreprogress.RestoreProgressUiData.CREATOR);
                    yld.c(parcel);
                    aooh.f(restoreProgressUiData, "uiData");
                    xtq xtqVar = defpackage.aghd.d;
                    java.util.Objects.toString(restoreProgressUiData);
                    xtqVar.w("onProgressUpdated called with RestoreProgressUiData: ".concat(java.lang.String.valueOf(restoreProgressUiData)));
                    ((aowj) this.a).b(restoreProgressUiData);
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(defpackage.ynq ynqVar, defpackage.yng yngVar, int i) {
        super("com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback");
        this.$cid = i;
        this.a = yngVar;
        j$.util.Objects.requireNonNull(ynqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(defpackage.yoh yohVar, defpackage.yng yngVar, int i) {
        super("com.google.android.apps.aicore.aidl.ISmartReplyResultCallback");
        this.$cid = i;
        this.a = yngVar;
        j$.util.Objects.requireNonNull(yohVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(defpackage.yok yokVar, defpackage.yng yngVar, int i) {
        super("com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback");
        this.$cid = i;
        this.a = yngVar;
        j$.util.Objects.requireNonNull(yokVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(defpackage.yor yorVar, defpackage.yng yngVar, int i) {
        super("com.google.android.apps.aicore.aidl.ISummarizationResultCallback");
        this.$cid = i;
        this.a = yngVar;
        j$.util.Objects.requireNonNull(yorVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(zxn zxnVar, zzx zzxVar, int i) {
        super("com.google.android.gms.auth.account.data.IGetStringValueCallback");
        this.$cid = i;
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(zxnVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(aabs aabsVar, zzx zzxVar, int i) {
        super("com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
        this.$cid = i;
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aabsVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(zzx zzxVar, int i) {
        super("com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback");
        this.$cid = i;
        this.a = zzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(defpackage.aalz aalzVar, aafe aafeVar, int i) {
        super("com.google.android.gms.feedback.internal.IFeedbackCallbacks");
        this.$cid = i;
        this.a = aafeVar;
        j$.util.Objects.requireNonNull(aalzVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(defpackage.aaog aaogVar, jxt jxtVar, int i) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
        this.$cid = i;
        this.a = jxtVar;
        j$.util.Objects.requireNonNull(aaogVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(zzx zzxVar, int i, byte[] bArr) {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        this.$cid = i;
        this.a = zzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(zzx zzxVar, int i, char[] cArr) {
        super("com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback");
        this.$cid = i;
        this.a = zzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(zzx zzxVar, int i, short[] sArr) {
        super("com.google.android.gms.onboardingconsent.internal.IGetConsentCallback");
        this.$cid = i;
        this.a = zzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(zzx zzxVar, int i, int[] iArr) {
        super("com.google.android.libraries.abuse.hades.signals.gmsclient.internal.IReadSignalCallback");
        this.$cid = i;
        this.a = zzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(zzx zzxVar, int i, boolean[] zArr) {
        super("com.google.android.libraries.abuse.hades.signals.gmsclient.internal.IStatusCallback");
        this.$cid = i;
        this.a = zzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(defpackage.adsr adsrVar, int i) {
        super("com.google.android.apps.motionsense.api.IMotionSenseBridgeListener");
        this.$cid = i;
        j$.util.Objects.requireNonNull(adsrVar);
        this.a = adsrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylo(aows aowsVar, int i) {
        super("com.google.android.setupcompat.restore.restoreprogress.IRestoreProgressCallback");
        this.$cid = i;
        this.a = aowsVar;
    }
}
