package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rqy implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public rqy(android.view.View view, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = view;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0281  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27, types: [aoin, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.rdd rddVar;
        int i;
        defpackage.qax qaxVarAh = null;
        switch (this.$cid) {
            case 0:
                ((defpackage.rqz) this.b).d((android.view.View) this.a);
                return;
            case 1:
                java.lang.String str = ((defpackage.rcc) this.a).a;
                aooh.e(str, "getCallId(...)");
                j$.util.Optional optionalE = ((defpackage.rdk) this.b).G.e(str);
                aooh.e(optionalE, "get(...)");
                defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
                if (apqrVar != null && (rddVar = (defpackage.rdd) apqrVar.a(defpackage.rdd.class)) != null) {
                    qaxVarAh = rddVar.ah();
                }
                if (qaxVarAh != null) {
                    j$.util.Optional optional = qaxVarAh.t;
                    defpackage.puo puoVar = new defpackage.puo(qaxVarAh, 15);
                    if (true == optional.isPresent()) {
                        ((defpackage.qax) puoVar.a).e.p((aeun) optional.get(), ruc.aJ);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((defpackage.rqz) this.b).d((android.view.View) this.a);
                return;
            case 3:
                ((defpackage.rri) this.b).d((android.view.View) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.rri) this.b).d((android.view.View) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj = this.a;
                try {
                    android.content.Context context = ((suh) this.b).b;
                    for (android.telecom.PhoneAccountHandle phoneAccountHandle : defpackage.sns.x(context).dO().s()) {
                        j$.util.Optional optionalH = defpackage.sns.x(context).bd().h(phoneAccountHandle);
                        if (optionalH.isPresent()) {
                            java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                            java.lang.String iccId = ((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getIccId();
                            int subscriptionId = ((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getSubscriptionId();
                            android.content.ContentValues contentValues = new android.content.ContentValues();
                            contentValues.put("preferred_phone_account_id", java.lang.Integer.valueOf(subscriptionId));
                            rsr rsrVar = new rsr();
                            rsrVar.aC(new kaw("preferred_phone_account_component_name").aI("=", strFlattenToString));
                            rsrVar.aC(new kaw("preferred_phone_account_id").aI("LIKE", iccId + '%'));
                            rsr rsrVarAB = rsrVar.aB();
                            suh.a.b().l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "migrateIccIdToSubIdInternal", 167, "PreferredSimDatabaseHelper.java").y("has preferred sim row updated: %b", java.lang.Boolean.valueOf(((android.database.sqlite.SQLiteDatabase) obj).update("preferred_sim", contentValues, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a) != 0));
                        } else {
                            suh.a.d().i(zct.b).l("com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "migrateIccIdToSubIdInternal", 144, "PreferredSimDatabaseHelper.java").v("missing subscription info");
                        }
                        break;
                    }
                    return;
                } catch (java.lang.SecurityException e) {
                    a.bq(suh.a.c(), "cannot read phone accounts", "com/android/dialer/preferredsim/impl/PreferredSimDatabaseHelper", "migrateIccIdToSubIdInternal", (char) 170, "PreferredSimDatabaseHelper.java", e, zct.b);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj2 = this.b;
                defpackage.szs szsVar = (defpackage.szs) this.a;
                szsVar.y = j$.util.Optional.of(obj2);
                szsVar.E.a(ajcm.a);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.view.animation.Interpolator interpolator = defpackage.tji.a;
                ((android.widget.LinearLayout) this.a).setVisibility(8);
                ((com.google.android.material.card.MaterialCardView) this.b).getLayoutParams().height = -2;
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.tzx) this.a).c.e((defpackage.uab) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.uei ueiVar = defpackage.uei.a;
                kaw kawVar = new kaw("number");
                java.lang.Object obj3 = this.b;
                rsr rsrVarAI = kawVar.aI("=", obj3);
                try {
                    ueu ueuVar = ((uex) this.a).b;
                    android.database.Cursor cursorF = ueuVar.f("client_spam_table", (java.lang.String[]) null, (java.lang.String) rsrVarAI.b, (java.lang.String[]) rsrVarAI.a);
                    if (cursorF != null) {
                        try {
                            if (cursorF.moveToFirst()) {
                                int columnIndex = cursorF.getColumnIndex("client_meta_data");
                                int columnIndex2 = cursorF.getColumnIndex("spam_status");
                                if (cursorF.getBlob(columnIndex) != null) {
                                    ueiVar = (defpackage.uei) alad.B(ueiVar, cursorF.getBlob(columnIndex), akzq.a());
                                }
                                i = cursorF.getInt(columnIndex2);
                            } else {
                                i = 3;
                            }
                        } catch (java.lang.Throwable th) {
                            if (cursorF == null) {
                                throw th;
                            }
                            try {
                                cursorF.close();
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        i = 3;
                    }
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("number", (java.lang.String) obj3);
                    contentValues2.put("spam_status", java.lang.Integer.valueOf(i));
                    contentValues2.put("created", java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
                    akzx akzxVarP = ueiVar.p();
                    akzxVarP.u();
                    ((defpackage.uei) akzxVarP.b).d = a.T(3);
                    contentValues2.put("client_meta_data", ((defpackage.uei) akzxVarP.p()).i());
                    if (ueuVar.e(contentValues2) == -1) {
                        uex.a.d().l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "storeSharpieVerdict", 870, "SpamDatabaseUtils.java").v("failed to store sharpie verdict");
                        break;
                    }
                    if (cursorF != null) {
                        cursorF.close();
                        return;
                    }
                    return;
                } catch (java.lang.Exception e2) {
                    a.by(uex.a.d(), "failed to store sharpie verdict", "com/android/dialer/spam/inapp/SpamDatabaseUtils", "storeSharpieVerdict", (char) 874, "SpamDatabaseUtils.java", e2);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((uqc) this.a).h((java.util.List) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ahqx.l(((defpackage.uye) this.b).a, (android.content.Intent) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aimw aimwVarL = vfn.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmAccountState", "sendClearLegacyVoicemailNotificationBroadcast", 415, "OmtpVvmAccountState.java");
                ?? r2 = this.a;
                aimwVarL.y("Sending broadcast to clear legacy voicemail notification for %s", (java.lang.Object) r2);
                android.content.Intent intent = new android.content.Intent("com.android.voicemail.VoicemailClient.ACTION_SHOW_VOICEMAIL_NOTIFICATION");
                android.content.Context context2 = ((vfn) this.b).b;
                intent.setPackage(context2.getPackageName());
                intent.putExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE", (android.os.Parcelable) r2);
                intent.putExtra("android.telephony.extra.NOTIFICATION_COUNT", 0);
                context2.sendBroadcast(intent);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aimw aimwVarL2 = vfo.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmActivation", "sendClearLegacyVoicemailNotificationBroadcast", 359, "OmtpVvmActivation.java");
                ?? r3 = this.a;
                aimwVarL2.y("Sending broadcast to clear legacy voicemail notification for %s", (java.lang.Object) r3);
                android.content.Intent intent2 = new android.content.Intent("com.android.voicemail.VoicemailClient.ACTION_SHOW_VOICEMAIL_NOTIFICATION");
                android.content.Context context3 = ((vfo) this.b).d;
                intent2.setPackage(context3.getPackageName());
                intent2.putExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE", (android.os.Parcelable) r3);
                intent2.putExtra("android.telephony.extra.NOTIFICATION_COUNT", 0);
                context3.sendBroadcast(intent2);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.vke) this.b).b.i((android.telecom.PhoneAccountHandle) this.a).W((android.telephony.VisualVoicemailSmsFilterSettings) null);
                return;
            case 15:
                vmi.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/VvmActivation", "sendClearLegacyVoicemailNotificationBroadcast", 158, "VvmActivation.java").v("Sending broadcast to clear legacy voicemail notification.");
                android.content.Intent intent3 = new android.content.Intent("com.android.voicemail.VoicemailClient.ACTION_SHOW_VOICEMAIL_NOTIFICATION");
                android.content.Context context4 = ((vmi) this.b).c;
                intent3.setPackage(context4.getPackageName());
                intent3.putExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE", (android.os.Parcelable) this.a);
                intent3.putExtra("android.telephony.extra.NOTIFICATION_COUNT", 0);
                context4.sendBroadcast(intent3);
                return;
            case 16:
                ((vmi) this.b).l.m((android.telecom.PhoneAccountHandle) this.a);
                return;
            case 17:
                for (defpackage.vpc vpcVar : ((tvn) this.b).a) {
                    java.lang.Object obj4 = this.a;
                    if (vpcVar.f.equals(obj4)) {
                        vpcVar.A.s(aiql.z((java.lang.Object) null), new agxj("voicemail_settings_store_data_source_key"));
                    }
                }
                return;
            case 18:
                vnk.a.b().l("com/android/dialer/voicemail/service/sodatranscribe/impl/TranscriptionBackfillWork", "backfillUntranscribedVoicemails", 44, "TranscriptionBackfillWork.java").v("start soda transcription backfill work");
                aimz aimzVar = defpackage.vnl.a;
                vnk vnkVar = (vnk) this.b;
                zjm zjmVar = vnkVar.d;
                android.content.Context context5 = (android.content.Context) zjmVar.a.a();
                context5.getClass();
                ojo ojoVar = (ojo) zjmVar.b.a();
                ojoVar.getClass();
                android.net.Uri uriBuildSourceUri = android.provider.VoicemailContract.Voicemails.buildSourceUri(context5.getPackageName());
                ahvr.ci(uriBuildSourceUri);
                gus.aJ();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.database.Cursor cursorB = ojoVar.b(uriBuildSourceUri, defpackage.vnl.b, "(transcription is NULL OR transcription = '') AND transcription_state=?", new java.lang.String[]{"0"}, (java.lang.String) null);
                try {
                    if (cursorB != null) {
                        while (cursorB.moveToNext()) {
                            arrayList.add(android.content.ContentUris.withAppendedId(uriBuildSourceUri, cursorB.getLong(0)));
                        }
                    } else {
                        defpackage.vnl.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/sodatranscribe/impl/TranscriptionDbAccessor", "getUntranscribedVoicemails", 111, "TranscriptionDbAccessor.java").v("query failed.");
                    }
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    vnk.a.b().l("com/android/dialer/voicemail/service/sodatranscribe/impl/TranscriptionBackfillWork", "backfillUntranscribedVoicemails", 48, "TranscriptionBackfillWork.java").w("found %d untranscribed voicemails", arrayList.size());
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        vnkVar.c.b((android.net.Uri) it.next(), (android.telecom.PhoneAccountHandle) this.a, true);
                    }
                    return;
                } catch (java.lang.Throwable th3) {
                    if (cursorB == null) {
                        throw th3;
                    }
                    try {
                        cursorB.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case 19:
                ((vva) this.a).d.m((agwz) this.b);
                return;
            default:
                lop lopVarE = new jyn(((vvl) this.b).b, (android.telecom.PhoneAccountHandle) this.a).e();
                lopVarE.c("dialer_feature_version_acknowledged", 2);
                lopVarE.a();
                return;
        }
    }

    public rqy(java.lang.Object obj, android.view.View view, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = view;
    }

    public /* synthetic */ rqy(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ rqy(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
