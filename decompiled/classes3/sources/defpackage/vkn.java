package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vkn implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vkn(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v127, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, java.util.Collection] */
    public final ajcq a(java.lang.Object obj) {
        java.lang.Object objE;
        int i = 3;
        int i2 = 7;
        int i3 = 19;
        int i4 = 18;
        int i5 = 4;
        int i6 = 1;
        switch (this.$cid) {
            case 0:
                return ((defpackage.vko) this.a).c((android.telecom.PhoneAccountHandle) this.b);
            case 1:
                return ((defpackage.vko) this.a).f.b((android.telecom.PhoneAccountHandle) this.b, (java.lang.String) obj, 4);
            case 2:
                return ((defpackage.vko) this.a).c((android.telecom.PhoneAccountHandle) this.b);
            case 3:
                final defpackage.ree reeVar = new defpackage.ree(this.b, 17);
                vku vkuVar = (vku) this.a;
                final long jLongValue = ((java.lang.Long) vkuVar.h.a()).longValue();
                final vew vewVar = vkuVar.e;
                defpackage.vet vetVar = new defpackage.vet(vewVar, 2);
                java.util.concurrent.Executor executor = vewVar.c;
                return ahru.b(ahvr.E(vetVar, executor)).d(new ajba() { // from class: veu
                    public final ajbg a(ajyk ajykVar, java.lang.Object obj2) {
                        final vew vewVar2 = vewVar;
                        ajykVar.o(new defpackage.viw(vewVar2, 1), vewVar2.c);
                        final java.util.function.Predicate predicate = reeVar;
                        return new ajbg(ahrv.g(dff.m(new dsf() { // from class: ver
                            public final java.lang.Object a(dsd dsdVar) {
                                j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.vev(predicate, dsdVar));
                                vew vewVar3 = vewVar2;
                                vewVar3.e = optionalOf;
                                vew.a.b().l("com/android/dialer/voicemail/service/impl/sms/VvmSmsDispatcherImpl", "getOmtpSmsMessage", 87, "VvmSmsDispatcherImpl.java").w("add sms listener: %d", java.lang.System.identityHashCode(vewVar3.e.orElseThrow(new defpackage.rqc(9))));
                                return "VvmSmsDispatcher.getVisualVoicemailSms";
                            }
                        })).j(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS, vewVar2.b));
                    }
                }, executor).a(java.util.concurrent.TimeoutException.class, new kwb(12), vewVar.b).e();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                vcr vcrVar = (vcr) obj;
                if (vcrVar.b != 1) {
                    return aiql.z(vcrVar);
                }
                java.lang.Object obj2 = this.b;
                try {
                    org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put("vvmserviceProfile", new org.json.JSONObject().put("attributes", new org.json.JSONObject().put("attribute", new org.json.JSONArray().put(new org.json.JSONObject().put("name", "nut").put("value", new org.json.JSONArray().put("false"))))));
                    vlc vlcVar = (vlc) obj2;
                    vls vlsVar = vlcVar.c;
                    java.lang.Object obj3 = this.a;
                    java.lang.String string = jSONObjectPut.toString();
                    defpackage.ajzk ajzkVar = new defpackage.ajzk();
                    ajzkVar.d("PUT");
                    ajzkVar.f(vlsVar.j.q((java.lang.String) obj3));
                    ajzkVar.e("application/json", java.nio.ByteBuffer.wrap(string.getBytes()));
                    ajzkVar.b(defpackage.ajzj.a("content-length"), java.lang.String.valueOf(string.getBytes().length));
                    return ahvr.H(ahrv.g(vlsVar.e(new defpackage.ajzm(ajzkVar), 2)).h(new defpackage.vlk(9), vlsVar.d), new defpackage.vfw(vcrVar, 12), vlcVar.b);
                } catch (org.json.JSONException e) {
                    throw new defpackage.vmh(e);
                }
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                vmc vmcVar = ((vlm) this.a).c;
                java.lang.Object obj4 = this.b;
                return ahrv.g(vmcVar.h.d((android.telecom.PhoneAccountHandle) obj4)).i(new defpackage.vjx(vmcVar, (java.lang.String) obj, obj4, 14, (byte[]) null), vmcVar.i);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((vlm) this.a).d.a((java.lang.String) obj, (android.telecom.PhoneAccountHandle) this.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.String strN = tvn.n(false);
                defpackage.ajzk ajzkVar2 = new defpackage.ajzk();
                ajzkVar2.d("PUT");
                ahbv ahbvVar = ((vlm) this.a).m;
                vls vlsVar2 = (vls) ahbvVar.f;
                ajzkVar2.f(vlsVar2.j.q((java.lang.String) obj));
                ajzkVar2.e("application/json", java.nio.ByteBuffer.wrap(strN.getBytes()));
                ajzkVar2.b(defpackage.ajzj.a("content-length"), java.lang.String.valueOf(strN.getBytes().length));
                ahrv ahrvVarG = ahrv.g(ahrv.g(vlsVar2.e(new defpackage.ajzm(ajzkVar2), 2)).h(new defpackage.vlk(12), vlsVar2.d));
                java.lang.Object obj5 = this.b;
                defpackage.vkn vknVar = new defpackage.vkn(ahbvVar, obj5, 17);
                ?? r3 = ahbvVar.c;
                return ahrvVarG.i(vknVar, (java.util.concurrent.Executor) r3).i(new defpackage.vkn(ahbvVar, obj5, i4), (java.util.concurrent.Executor) r3).h(new defpackage.vmj(0), (java.util.concurrent.Executor) r3).e(defpackage.vcx.class, new defpackage.vmj(2), (java.util.concurrent.Executor) r3);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.String str = (java.lang.String) obj;
                vlf vlfVar = ((vlm) this.a).f;
                vls vlsVar3 = vlfVar.b;
                try {
                    org.json.JSONObject jSONObjectPut2 = new org.json.JSONObject().put("selectionCriteria", new org.json.JSONObject().put("maxEntries", 3).put("searchScope", new org.json.JSONObject().put("resourceURL", java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/folders/c1a7c823-fdd1-4857-8d44-b315444d2a83", vlsVar3.j.o(), str))).put("sortCriteria", new org.json.JSONObject().put("criterion", new org.json.JSONArray().put(new org.json.JSONObject().put("type", "Date").put("order", "Descending")))));
                    java.lang.Object obj6 = this.b;
                    ahrv ahrvVarG2 = ahrv.g(vlsVar3.e(new defpackage.ajzm(vls.d(vlsVar3.j.p(str), jSONObjectPut2.toString(), "POST")), 4));
                    defpackage.vfw vfwVar = new defpackage.vfw(vlsVar3, i4);
                    ajct ajctVar = vlsVar3.d;
                    ahrv ahrvVarH = ahrv.g(ahrvVarG2.h(vfwVar, ajctVar)).h(new defpackage.vlk(i5), ajctVar);
                    ahrv ahrvVarG3 = ahrv.g(ahrvVarH);
                    defpackage.vge vgeVar = new defpackage.vge(vlfVar, 11);
                    ajct ajctVar2 = vlfVar.c;
                    return ahrvVarG3.i(vgeVar, ajctVar2).i(new defpackage.vjx(vlfVar, obj6, ahrvVarH, 5), ajctVar2).h(new defpackage.vfw(vlfVar, 14), ajctVar2).e(defpackage.vle.class, new defpackage.vju(17), ajctVar2).f(java.lang.Exception.class, new defpackage.vge(vlfVar, 12), ajctVar2);
                } catch (org.json.JSONException e2) {
                    throw new defpackage.vmh(e2);
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.ajzm ajzmVar = new defpackage.ajzm((defpackage.ajzk) this.a);
                vls vlsVar4 = (vls) this.b;
                ahrv ahrvVarG4 = ahrv.g(vlsVar4.e(ajzmVar, 5));
                defpackage.vlk vlkVar = new defpackage.vlk(i2);
                ajct ajctVar3 = vlsVar4.d;
                return ahrvVarG4.h(vlkVar, ajctVar3).h(new defpackage.vfw((aify) obj, i3), ajctVar3);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.ajzm ajzmVar2 = new defpackage.ajzm((defpackage.ajzk) this.a);
                vls vlsVar5 = (vls) this.b;
                ahrv ahrvVarG5 = ahrv.g(vlsVar5.e(ajzmVar2, 6));
                defpackage.vlk vlkVar2 = new defpackage.vlk(i);
                ajct ajctVar4 = vlsVar5.d;
                return ahrvVarG5.h(vlkVar2, ajctVar4).h(new defpackage.vmb((aify) obj, i6), ajctVar4);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((vmc) this.a).a(((defpackage.vfg) this.b).a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aihd aihdVarO = aihd.o((aify) obj);
                int size = aihdVarO.size();
                ?? r4 = this.a;
                aify aifyVar = (aify) r4;
                if (size != aifyVar.size()) {
                    vmc.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "deleteVoicemailsInServerAndThenInLocal", 318, "RestVvmSyncService.java").z("Actual deleted server voicemails are different from requested: %d/%d", aihdVarO.size(), aifyVar.size());
                }
                return ((vmc) this.b).a((aify) j$.util.Collection.-EL.stream((java.util.Collection) r4).map(new defpackage.vga(14)).filter(new defpackage.ree(aihdVarO, i4)).collect(aido.a));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.vlv vlvVar = (defpackage.vlv) ((defpackage.vlr) obj).a.orElseThrow();
                akzx akzxVarM = vzi.a.m();
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.b;
                java.lang.String id = phoneAccountHandle.getId();
                akzxVarM.u();
                vzi vziVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(id);
                vziVar.b |= 8;
                vziVar.f = id;
                java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
                akzxVarM.u();
                vzi vziVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(strFlattenToString);
                vziVar2.b |= 4;
                vziVar2.e = strFlattenToString;
                vmc vmcVar2 = (vmc) this.a;
                java.lang.String packageName = vmcVar2.d.getPackageName();
                akzxVarM.u();
                vzi vziVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(packageName);
                vziVar3.b |= 1;
                vziVar3.c = packageName;
                int i7 = vlvVar.a;
                akzxVarM.u();
                vzi vziVar4 = akzxVarM.b;
                vziVar4.b |= 256;
                vziVar4.k = i7;
                int i8 = vlvVar.b;
                akzxVarM.u();
                vzi vziVar5 = akzxVarM.b;
                vziVar5.b |= 512;
                vziVar5.l = i8;
                return vmcVar2.p.e(akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.vlr vlrVar = (defpackage.vlr) obj;
                j$.util.Optional optional = vlrVar.b;
                if (optional.isPresent()) {
                    return aiql.z(new defpackage.vlr(j$.util.Optional.empty(), j$.util.Optional.of((vcp) optional.orElseThrow())));
                }
                if (((defpackage.vlz) vlrVar.a.orElseThrow()).a) {
                    return ((vmg) this.b).d.b((java.lang.String) this.a);
                }
                defpackage.vbs vbsVar = defpackage.vbs.STATUS_CHECK_NEEDS_ACTIVATION;
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                akzx akzxVarM2 = vcp.a.m();
                akzxVarM2.u();
                vcp vcpVar = akzxVarM2.b;
                vcpVar.c = java.lang.Integer.valueOf(vbsVar.a());
                vcpVar.b = 1;
                return aiql.z(new defpackage.vlr(optionalEmpty, j$.util.Optional.of(akzxVarM2.p())));
            case 15:
                vmi.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/VvmActivation", "clearMwilNotification", 146, "VvmActivation.java").v("Clear MWI notification.");
                java.lang.Object obj7 = this.b;
                java.lang.Object obj8 = this.a;
                vmi vmiVar = (vmi) obj8;
                j$.util.Optional optionalG = vmiVar.k.g();
                defpackage.vdj vdjVar = new defpackage.vdj(obj7, 13);
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(((val) optionalG.get()).a((android.telecom.PhoneAccountHandle) vdjVar.a));
                }
                idf idfVar = new idf(obj8, obj7, 5, (byte[]) null);
                if (true != optionalG.isPresent()) {
                    java.lang.Object obj9 = idfVar.b;
                    objE = ahvr.E(new defpackage.rqy(obj9, idfVar.a, 15), ((vmi) obj9).d);
                } else {
                    objE = optionalG.get();
                }
                defpackage.rqy rqyVar = new defpackage.rqy(obj8, obj7, 16);
                ajct ajctVar5 = vmiVar.d;
                return ahvr.ak(new ajcq[]{(ajcq) objE, ahvr.E(rqyVar, ajctVar5)}).p(new defpackage.vfm(obj8, obj7, i2), ajctVar5);
            case 16:
                akzx akzxVarM3 = vzi.a.m();
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) this.b;
                java.lang.String id2 = phoneAccountHandle2.getId();
                akzxVarM3.u();
                vzi vziVar6 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(id2);
                vziVar6.b |= 8;
                vziVar6.f = id2;
                java.lang.String strFlattenToString2 = phoneAccountHandle2.getComponentName().flattenToString();
                akzxVarM3.u();
                vzi vziVar7 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(strFlattenToString2);
                vziVar7.b |= 4;
                vziVar7.e = strFlattenToString2;
                vmi vmiVar2 = (vmi) this.a;
                java.lang.String packageName2 = vmiVar2.c.getPackageName();
                akzxVarM3.u();
                vzi vziVar8 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(packageName2);
                vziVar8.b |= 1;
                vziVar8.c = packageName2;
                akzxVarM3.u();
                vzi vziVar9 = akzxVarM3.b;
                j$.util.Objects.requireNonNull("vvm_type_rest");
                vziVar9.b |= 2;
                vziVar9.d = "vvm_type_rest";
                akzxVarM3.u();
                vzi vziVar10 = akzxVarM3.b;
                vziVar10.b |= 512;
                vziVar10.l = -1;
                akzxVarM3.u();
                vzi vziVar11 = akzxVarM3.b;
                vziVar11.b |= 256;
                vziVar11.k = -1;
                akzxVarM3.u();
                vzi vziVar12 = akzxVarM3.b;
                vziVar12.b |= 32;
                vziVar12.h = 4;
                akzxVarM3.u();
                vzi vziVar13 = akzxVarM3.b;
                vziVar13.b |= 64;
                vziVar13.i = 0;
                akzxVarM3.u();
                vzi vziVar14 = akzxVarM3.b;
                vziVar14.b |= 128;
                vziVar14.j = 0;
                return ahvr.I(vmiVar2.j.e(akzxVarM3.p()), new defpackage.vge((java.lang.Exception) obj, i4), vmiVar2.d);
            case 17:
                akzx akzxVarM4 = vzi.a.m();
                java.lang.Object obj10 = this.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) obj10;
                java.lang.String id3 = phoneAccountHandle3.getId();
                akzxVarM4.u();
                vzi vziVar15 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(id3);
                vziVar15.b |= 8;
                vziVar15.f = id3;
                java.lang.String strFlattenToString3 = phoneAccountHandle3.getComponentName().flattenToString();
                akzxVarM4.u();
                vzi vziVar16 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(strFlattenToString3);
                vziVar16.b |= 4;
                vziVar16.e = strFlattenToString3;
                java.lang.Object obj11 = this.a;
                ahbv ahbvVar2 = (ahbv) obj11;
                java.lang.String packageName3 = ((android.content.Context) ahbvVar2.e).getPackageName();
                akzxVarM4.u();
                vzi vziVar17 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(packageName3);
                vziVar17.b |= 1;
                vziVar17.c = packageName3;
                akzxVarM4.u();
                vzi vziVar18 = akzxVarM4.b;
                vziVar18.b |= 4096;
                vziVar18.m = false;
                akzxVarM4.u();
                vzi vziVar19 = akzxVarM4.b;
                vziVar19.b |= 32;
                vziVar19.h = 1;
                akzxVarM4.u();
                vzi vziVar20 = akzxVarM4.b;
                vziVar20.b |= 64;
                vziVar20.i = 1;
                akzxVarM4.u();
                vzi vziVar21 = akzxVarM4.b;
                vziVar21.b |= 128;
                vziVar21.j = 1;
                return ahrv.g(((vze) ahbvVar2.d).e(akzxVarM4.p())).i(new defpackage.vkn(obj11, obj10, i3), (java.util.concurrent.Executor) ahbvVar2.c);
            case 18:
                return ((vdo) ((ahbv) this.a).a).b((android.telecom.PhoneAccountHandle) this.b);
            case 19:
                ahbv ahbvVar3 = (ahbv) this.a;
                java.lang.Object obj12 = ahbvVar3.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle4 = (android.telecom.PhoneAccountHandle) this.b;
                ((tvn) obj12).m(phoneAccountHandle4);
                return ((vli) ahbvVar3.g).m(phoneAccountHandle4, false);
            default:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                idc idcVar = new idc(this.a, this.b, 19, (byte[]) null);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(ahvr.H(((vcg) optionalOfNullable.get()).h((android.telecom.PhoneAccountHandle) idcVar.a), new defpackage.vmj(4), (java.util.concurrent.Executor) ((ahbv) idcVar.b).g));
                }
                return (ajcq) optionalOfNullable.orElse(aiql.z(java.lang.Boolean.FALSE));
        }
    }

    public /* synthetic */ vkn(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
