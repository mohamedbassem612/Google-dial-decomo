package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uwl implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ uwl(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v54, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v45, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        boolean z = false;
        defpackage.voy voyVarJ = null;
        switch (this.$cid) {
            case 0:
                akzx akzxVarM = amry.a.m();
                akzxVarM.u();
                amry amryVar = akzxVarM.b;
                java.lang.Object obj = this.b;
                j$.util.Objects.requireNonNull(obj);
                amryVar.b |= 1;
                amryVar.c = (java.lang.String) obj;
                return ((akzx) j$.util.Map.-EL.getOrDefault(((defpackage.uwp) this.a).b, obj, akzxVarM)).p();
            case 1:
                return java.lang.Boolean.valueOf(((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue() && ((java.lang.Integer) aiql.H((java.util.concurrent.Future) this.b)).intValue() <= 1);
            case 2:
                aigf aigfVar = (aigf) this.a;
                ailj ailjVarK = aigfVar.f().k();
                while (ailjVarK.hasNext()) {
                    java.lang.Object obj2 = this.b;
                    defpackage.uty utyVar = (defpackage.uty) ailjVarK.next();
                    boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) aigfVar.get(utyVar))).booleanValue();
                    boolean zBooleanValue2 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) ((aigf) obj2).get(utyVar))).booleanValue();
                    if (zBooleanValue) {
                        if (!zBooleanValue2) {
                            return java.lang.Boolean.FALSE;
                        }
                        z = true;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                java.lang.Object obj3 = this.a;
                boolean zBooleanValue3 = ((java.lang.Boolean) ((uzp) obj3).d.a()).booleanValue();
                for (java.util.Map.Entry entry : this.b.entrySet()) {
                    try {
                        android.content.ContentValues contentValues = (android.content.ContentValues) entry.getValue();
                        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) defpackage.sos.a(contentValues.getAsString("phone_account_component_name"), contentValues.getAsString("phone_account_id")).orElse((java.lang.Object) null);
                        java.lang.String str = alad.B(hkd.a, contentValues.getAsByteArray("number"), akzq.a()).c;
                        if (zBooleanValue3 ? ((uzp) obj3).b.A(phoneAccountHandle, str) : ((uzp) obj3).b.i.isVoiceMailNumber(phoneAccountHandle, str)) {
                            contentValues.put("is_voicemail_call", (java.lang.Integer) 1);
                            contentValues.put("voicemail_call_tag", (java.lang.String) ((uzp) obj3).c.i(phoneAccountHandle).B().orElse((java.lang.Object) null));
                        } else {
                            contentValues.put("is_voicemail_call", (java.lang.Integer) 0);
                        }
                    } catch (java.lang.Throwable th) {
                        a.bq(uzp.a.c(), "VoicemailDataSource.fill failed", "com/android/dialer/voicemail/calllog/VoicemailDataSource", "fill", (char) 153, "VoicemailDataSource.java", th, zct.b);
                        ((android.content.ContentValues) entry.getValue()).put("is_voicemail_call", (java.lang.Integer) 0);
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optionalH = ((defpackage.vah) this.b).c.h((android.telecom.PhoneAccountHandle) this.a);
                return optionalH.isPresent() ? j$.util.Optional.of(java.lang.Integer.valueOf(((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getSimSlotIndex())) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((val) this.b).i.j((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((val) this.b).j.i((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((val) this.b).i.k((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((vav) this.b).m.k((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((vav) this.b).m.j((android.telecom.PhoneAccountHandle) this.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ojo ojoVarAZ = ((vbi) agab.aH((android.content.Context) ((zjm) this.b).a, vbi.class)).aZ();
                java.lang.Object obj4 = this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj4;
                rsr rsrVarD = zjm.D(phoneAccountHandle2.getComponentName().flattenToString(), phoneAccountHandle2.getId());
                java.lang.Object obj5 = rsrVarD.b;
                java.lang.Object obj6 = rsrVarD.a;
                android.net.Uri uri = defpackage.vbk.a;
                android.database.Cursor cursorB = ojoVarAZ.b(uri, (java.lang.String[]) null, (java.lang.String) obj5, (java.lang.String[]) obj6, (java.lang.String) null);
                if (cursorB == null) {
                    return null;
                }
                try {
                    if (cursorB.moveToNext()) {
                        android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(uri, cursorB.getLong(cursorB.getColumnIndexOrThrow("_id")));
                        long j = cursorB.getInt(cursorB.getColumnIndexOrThrow("duration"));
                        defpackage.adrp adrpVarA = defpackage.voy.a();
                        adrpVarA.l((android.telecom.PhoneAccountHandle) obj4);
                        adrpVarA.k(j);
                        adrpVarA.d = uriWithAppendedId;
                        voyVarJ = adrpVarA.j();
                        break;
                    }
                    cursorB.close();
                    return voyVarJ;
                } catch (java.lang.Throwable th2) {
                    try {
                        cursorB.close();
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return java.lang.Boolean.valueOf(!((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue() && ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue());
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return afsq.bX((ajcq) this.a, (ajcq) this.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return java.lang.Boolean.valueOf(((aogc) this.a).ar((java.lang.Iterable) this.b));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj7 = this.b;
                java.lang.String str2 = ((defpackage.amsk) obj7).c;
                java.lang.Object obj8 = this.a;
                defpackage.amsk amskVar = defpackage.amsk.a;
                java.util.Map map = ((vdq) obj8).e;
                akzx akzxVarP = ((defpackage.amsk) j$.util.Map.-EL.getOrDefault(map, str2, amskVar)).p();
                akzxVarP.z((alad) obj7);
                map.put(str2, (defpackage.amsk) akzxVarP.p());
                return null;
            case 15:
                java.lang.Object obj9 = this.b;
                java.lang.String str3 = ((defpackage.amsj) obj9).c;
                java.lang.Object obj10 = this.a;
                defpackage.amsj amsjVar = defpackage.amsj.a;
                java.util.Map map2 = ((vdq) obj10).f;
                akzx akzxVarP2 = ((defpackage.amsj) j$.util.Map.-EL.getOrDefault(map2, str3, amsjVar)).p();
                akzxVarP2.z((alad) obj9);
                map2.put(str3, (defpackage.amsj) akzxVarP2.p());
                return null;
            case 16:
                akzx akzxVarM2 = amsq.a.m();
                akzx akzxVarM3 = defpackage.amsn.a.m();
                akzx akzxVarM4 = defpackage.amsl.a.m();
                akzxVarM4.u();
                defpackage.amsl amslVar = (defpackage.amsl) akzxVarM4.b;
                java.lang.Object obj11 = this.b;
                j$.util.Objects.requireNonNull(obj11);
                amslVar.e = obj11;
                amslVar.d = 2;
                akzxVarM3.u();
                defpackage.amsn amsnVar = (defpackage.amsn) akzxVarM3.b;
                defpackage.amsl amslVar2 = (defpackage.amsl) akzxVarM4.p();
                j$.util.Objects.requireNonNull(amslVar2);
                amsnVar.c = amslVar2;
                amsnVar.b = 2;
                akzxVarM2.u();
                amsq amsqVar = akzxVarM2.b;
                defpackage.amsn amsnVar2 = (defpackage.amsn) akzxVarM3.p();
                j$.util.Objects.requireNonNull(amsnVar2);
                amsqVar.e = amsnVar2;
                amsqVar.b |= 8;
                amsq amsqVarP = akzxVarM2.p();
                vdq vdqVar = (vdq) this.a;
                akzx akzxVarP3 = vdqVar.b.p();
                akzxVarP3.z(amsqVarP);
                vdqVar.b = akzxVarP3.p();
                return null;
            case 17:
                java.lang.Object obj12 = this.b;
                defpackage.amsp amspVar = (defpackage.amsp) obj12;
                java.lang.String str4 = amspVar.c;
                akzx akzxVarP4 = ((alad) obj12).p();
                java.lang.String str5 = amspVar.c;
                java.lang.Object obj13 = this.a;
                defpackage.amsp amspVar2 = defpackage.amsp.a;
                java.util.Map map3 = ((vdq) obj13).g;
                akzxVarP4.z((defpackage.amsp) j$.util.Map.-EL.getOrDefault(map3, str5, amspVar2));
                map3.put(str4, (defpackage.amsp) akzxVarP4.p());
                return null;
            case 18:
                vdq vdqVar2 = (vdq) this.a;
                akzx akzxVarP5 = vdqVar2.b.p();
                akzxVarP5.z((alad) this.b);
                vdqVar2.b = akzxVarP5.p();
                return null;
            case 19:
                akzx akzxVarM5 = amsq.a.m();
                akzxVarM5.bi((defpackage.amsp) ((akzx) this.b).p());
                ((rlv) ((vee) this.a).c.a()).B(akzxVarM5.p());
                return null;
            default:
                vew vewVar = (vew) this.b;
                if (vewVar.e.isPresent()) {
                    java.lang.Object obj14 = this.a;
                    defpackage.vev vevVar = (defpackage.vev) vewVar.e.orElseThrow();
                    if (aa$.ExternalSyntheticApiModelOutline1.m$1(vevVar.b, obj14)) {
                        vevVar.a.b(obj14);
                        return java.lang.Boolean.TRUE;
                    }
                    vew.a.b().l("com/android/dialer/voicemail/service/impl/sms/VvmSmsDispatcherImpl", "dispatchOmtpSmsMessage", 152, "VvmSmsDispatcherImpl.java").v("listener exists, but sms is not filtered");
                }
                return java.lang.Boolean.FALSE;
        }
    }

    public /* synthetic */ uwl(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
