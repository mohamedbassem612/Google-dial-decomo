package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vjx implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vjx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Object, java.util.Collection] */
    public final ajcq a(java.lang.Object obj) {
        java.lang.String string;
        ajcq ajcqVarE;
        ajcq ajcqVarZ;
        ajcq ajcqVarZ2;
        int i = 10;
        int i2 = 13;
        int i3 = 3;
        int i4 = 2;
        int i5 = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                vpq vpqVar = ((defpackage.vjy) this.a).b;
                defpackage.voy voyVar = (defpackage.voy) this.c;
                return vpqVar.d((android.telecom.PhoneAccountHandle) obj2, voyVar.e, voyVar.c);
            case 1:
                defpackage.vyh vyhVarA = defpackage.vps.a();
                vyhVarA.e((aihd) j$.util.Collection.-EL.stream(((defpackage.vpj) obj).g).map(new defpackage.vga(6)).collect(aido.b));
                defpackage.aliq aliqVar = new defpackage.aliq(null, null, null);
                defpackage.voy voyVar2 = (defpackage.voy) this.c;
                aliqVar.A(voyVar2.e);
                android.net.Uri uri = voyVar2.d;
                string = uri != null ? uri.toString() : "";
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                aliqVar.y(string);
                long j = voyVar2.b;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                aliqVar.z(j$.util.OptionalLong.of(j / 1000));
                vyhVarA.f(aify.p(aliqVar.x()));
                return ((defpackage.vjy) obj4).b.f((android.telecom.PhoneAccountHandle) obj3, vyhVarA.d());
            case 2:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((vbu) optionalOfNullable.get()).r);
                }
                java.lang.String str = (java.lang.String) optionalOfNullable.orElse((java.lang.Object) null);
                if (android.text.TextUtils.isEmpty(str)) {
                    a.bI(defpackage.vko.a.c().m(aioa.b), "voicemailManagementGateway url unknown", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3Provisioner", "subscribe", (char) 144, "Vvm3Provisioner.java", zct.a);
                    return aiql.z(anar.t(defpackage.vbw.VOICE_MESSAGING_GATEWAY_URL_UNKNOWN));
                }
                java.lang.Object obj5 = this.a;
                java.lang.Object obj6 = this.c;
                defpackage.vgm vgmVar = ((defpackage.veo) obj5).e;
                if (vgmVar == null) {
                    vgmVar = defpackage.vgm.a;
                }
                java.lang.Object obj7 = this.b;
                if (str == null) {
                    ajcqVarE = aiql.y(new defpackage.vcv(defpackage.vbw.SELF_PROVISIONING_GATEWAY_CONNECTION_FAILED, "voicemailManagementGateway url unknown", (java.lang.Throwable) null));
                } else {
                    defpackage.vkj vkjVar = ((defpackage.vko) obj6).d;
                    java.net.CookieHandler.setDefault(new java.net.CookieManager());
                    ahru ahruVarB = ahru.b(vkjVar.j.v(vgmVar));
                    defpackage.vgf vgfVar = new defpackage.vgf(vkjVar, obj7, 7);
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService = vkjVar.c;
                    ahru ahruVarD = ahruVarB.d(vgfVar, scheduledExecutorService);
                    defpackage.vgf vgfVar2 = new defpackage.vgf(vkjVar, obj7, 8);
                    java.util.concurrent.Executor executor = vkjVar.b;
                    ajcqVarE = ahruVarD.d(vgfVar2, executor).a(defpackage.vis.class, new kwb(19), scheduledExecutorService).d(new defpackage.vgc((java.lang.Object) vkjVar, (android.telecom.PhoneAccountHandle) obj7, str, 5), executor).e();
                }
                return ahvr.I(ajcqVarE, new defpackage.vkn(obj6, obj7, 0), ((defpackage.vko) obj6).e);
            case 3:
                defpackage.vyh vyhVarA2 = defpackage.vps.a();
                vyhVarA2.e((aihd) j$.util.Collection.-EL.stream(((defpackage.vpj) obj).g).map(new defpackage.vga(7)).collect(aido.b));
                defpackage.aliq aliqVar2 = new defpackage.aliq(null, null, null);
                defpackage.voy voyVar3 = (defpackage.voy) this.c;
                aliqVar2.A(voyVar3.e);
                android.net.Uri uri2 = voyVar3.d;
                string = uri2 != null ? uri2.toString() : "";
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                aliqVar2.y(string);
                long j2 = voyVar3.b;
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
                aliqVar2.z(j$.util.OptionalLong.of(j2 / 1000));
                vyhVarA2.f(aify.p(aliqVar2.x()));
                return ((vlf) obj9).e.f((android.telecom.PhoneAccountHandle) obj8, vyhVarA2.d());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj10 = this.b;
                vpq vpqVar2 = ((vlf) this.a).e;
                defpackage.voy voyVar4 = (defpackage.voy) this.c;
                return vpqVar2.d((android.telecom.PhoneAccountHandle) obj10, voyVar4.e, voyVar4.c);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.vld vldVar = (defpackage.vld) obj;
                java.lang.String str2 = vldVar.a;
                defpackage.vmd vmdVar = vldVar.b;
                defpackage.adrp adrpVarA = defpackage.voy.a();
                adrpVarA.c = str2;
                java.lang.Object obj11 = this.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj11;
                adrpVarA.l(phoneAccountHandle);
                adrpVarA.b = aify.n(ajee.m(vmdVar.b.D()));
                adrpVarA.k(((defpackage.vme) ((j$.util.Optional) ((defpackage.vlr) aiql.H((java.util.concurrent.Future) this.c)).a.orElseThrow()).orElseThrow()).a.orElseThrow(new defpackage.vjq(3)));
                defpackage.voy voyVarJ = adrpVarA.j();
                java.lang.Object obj12 = this.a;
                vlf vlfVar = (vlf) obj12;
                ahrv ahrvVarG = ahrv.g(vlfVar.e.c(phoneAccountHandle));
                defpackage.vjx vjxVar = new defpackage.vjx(obj12, voyVarJ, obj11, 3, (byte[]) null);
                ajct ajctVar = vlfVar.c;
                return ahrvVarG.i(vjxVar, ajctVar).i(new defpackage.vjx(obj12, obj11, voyVarJ, 4), ajctVar).h(new defpackage.vfw(voyVarJ, i2), ajctVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.net.Uri uri3 = android.net.Uri.parse(((defpackage.vcm) this.a).b);
                vmc vmcVar = ((vlm) this.c).c;
                ahrv ahrvVarG2 = ahrv.g(vmcVar.f.f(uri3));
                defpackage.vjx vjxVar2 = new defpackage.vjx(vmcVar, uri3, (java.lang.String) obj, 15);
                ajct ajctVar2 = vmcVar.i;
                return ahrvVarG2.i(vjxVar2, ajctVar2).i(new defpackage.vjx(vmcVar, uri3, this.b, 16, (char[]) null), ajctVar2).h(new defpackage.vlk(i2), ajctVar2).e(defpackage.vcx.class, new defpackage.vlk(14), ajctVar2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.String str3 = (java.lang.String) obj;
                try {
                    org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put("vvmserviceProfile", new org.json.JSONObject().put("attributes", new org.json.JSONObject().put("attribute", new org.json.JSONArray().put(new org.json.JSONObject().put("name", "PWD").put("value", new org.json.JSONArray().put(this.c))).put(new org.json.JSONObject().put("name", "OLD_PWD").put("value", new org.json.JSONArray().put(this.a))))));
                    java.lang.Object obj13 = this.b;
                    byte[] bytes = jSONObjectPut.toString().getBytes();
                    defpackage.ajzk ajzkVar = new defpackage.ajzk();
                    ajzkVar.d("PUT");
                    vlc vlcVar = ((vlm) obj13).g;
                    vls vlsVar = vlcVar.c;
                    ajzkVar.f(vlsVar.j.q(str3));
                    ajzkVar.e("application/json", java.nio.ByteBuffer.wrap(bytes));
                    ajzkVar.b(defpackage.ajzj.a("content-length"), java.lang.String.valueOf(bytes.length));
                    ahrv ahrvVarG3 = ahrv.g(vlsVar.e.a(new defpackage.ajzm(ajzkVar)));
                    defpackage.vju vjuVar = new defpackage.vju(16);
                    ajct ajctVar3 = vlcVar.b;
                    return ahrvVarG3.h(vjuVar, ajctVar3).i(new defpackage.vkn(vlcVar, str3, 4, null), ajctVar3);
                } catch (org.json.JSONException e) {
                    throw new defpackage.vmh(e);
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.vmd vmdVar2 = (defpackage.vmd) obj;
                aimw aimwVarL = vmc.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "downloadAudio", 470, "RestVvmSyncService.java");
                akzc akzcVar = vmdVar2.b;
                aimwVarL.w("Downloaded voicemail with size: %d bytes", akzcVar.c());
                java.lang.String str4 = vmdVar2.a;
                java.lang.Object obj14 = this.b;
                java.lang.Object obj15 = this.c;
                vmc vmcVar2 = (vmc) obj15;
                return ahrv.g(vmcVar2.f.i((android.net.Uri) obj14, akzcVar, str4)).h(new icy(obj15, obj14, this.a, 18, (boolean[]) null), vmcVar2.i);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ?? r1 = this.c;
                java.lang.Object obj16 = this.b;
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((java.util.Collection) r1);
                java.lang.Object obj17 = this.a;
                return ahvr.M((java.lang.Iterable) stream.map(new defpackage.phs(obj17, obj16, (java.lang.Boolean) obj, 10, (byte[]) null)).collect(aido.a)).h(new defpackage.vlk(17), ((vmc) obj17).i);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj18 = this.a;
                vmc vmcVar3 = (vmc) obj18;
                return ahvr.I(vmcVar3.e.b((java.lang.String) this.c), new defpackage.vkn(obj18, this.b, i2), vmcVar3.i);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(((defpackage.vfg) this.b).d).map(new defpackage.vga(15));
                j$.util.stream.Collector collector = aido.a;
                java.util.List list = (java.util.List) map.collect(collector);
                vmc.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "markServerVoicemailsAsRead", 247, "RestVvmSyncService.java").w("Mark %d server voicemails as read", list.size());
                if (list.isEmpty()) {
                    return ajcm.a;
                }
                java.lang.Object obj19 = this.a;
                if (list.isEmpty()) {
                    vls.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmGateway", "markVoicemailsAsRead", 326, "RestVvmGateway.java").v("voicemail list to mark as read is empty");
                    ajcqVarZ = aiql.z(aike.a);
                } else {
                    vls vlsVar2 = ((vmc) obj19).e;
                    java.lang.Iterable iterableBf = ahvr.bf((java.lang.Iterable) j$.util.Collection.-EL.stream(list).map(new defpackage.vga(13)).collect(collector), ((java.lang.Long) vlsVar2.h.a()).intValue());
                    ajcq ajcqVarN = ahvr.N(aike.a);
                    java.util.Iterator it = iterableBf.iterator();
                    while (it.hasNext()) {
                        java.util.List list2 = (java.util.List) it.next();
                        tvn tvnVar = vlsVar2.j;
                        try {
                            org.json.JSONArray jSONArray = new org.json.JSONArray();
                            java.util.Iterator it2 = list2.iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                java.lang.Object obj20 = this.c;
                                if (zHasNext) {
                                    jSONArray.put(new org.json.JSONObject().put("resourceURL", java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/objects/%s", tvnVar.o(), obj20, (java.lang.String) it2.next())));
                                    it = it;
                                } else {
                                    java.util.Iterator it3 = it;
                                    ajcqVarN = ajcqVarN.i(new defpackage.vkn(vlsVar2, vls.d(java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/objects/operations/bulkUpdate", tvnVar.o(), obj20), new org.json.JSONObject().put("bulkUpdate", new org.json.JSONObject().put("objects", new org.json.JSONObject().put("objectReference", jSONArray)).put("operation", "AddFlag").put("flags", new org.json.JSONObject().put("flag", new org.json.JSONArray().put("\\Seen")))).toString(), "POST"), 9, null), vlsVar2.d);
                                    it = it3;
                                }
                            }
                        } catch (org.json.JSONException e2) {
                            throw new defpackage.vmh(e2);
                        }
                    }
                    ajcqVarZ = ajcqVarN;
                }
                return ahvr.H(ajcqVarZ, new defpackage.vmb(list, i5), ((vmc) obj19).i);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aimw aimwVarL2 = vmc.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "deleteVoicemailsInServerAndThenInLocal", 295, "RestVvmSyncService.java");
                aify aifyVar = ((defpackage.vfg) this.b).f;
                aimwVarL2.w("Delete %d voicemail pairs in local & server", aifyVar.size());
                if (aifyVar.isEmpty()) {
                    return ajcm.a;
                }
                java.lang.Object obj21 = this.a;
                aify aifyVar2 = (aify) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.vga(15)).map(new defpackage.vga(16)).collect(aido.a);
                if (aifyVar2.isEmpty()) {
                    vls.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmGateway", "deleteObjects", 280, "RestVvmGateway.java").v("voicemail list to delete is empty");
                    ajcqVarZ2 = aiql.z(aike.a);
                } else {
                    vls vlsVar3 = ((vmc) obj21).e;
                    java.lang.Iterable<java.util.List> iterableBf2 = ahvr.bf(aifyVar2, ((java.lang.Long) vlsVar3.i.a()).intValue());
                    ajcq ajcqVarN2 = ahvr.N(aike.a);
                    for (java.util.List list3 : iterableBf2) {
                        tvn tvnVar2 = vlsVar3.j;
                        try {
                            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                            java.util.Iterator it4 = list3.iterator();
                            while (true) {
                                boolean zHasNext2 = it4.hasNext();
                                int i6 = i5;
                                java.lang.Object obj22 = this.c;
                                if (zHasNext2) {
                                    java.lang.String str5 = (java.lang.String) it4.next();
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    int i7 = i4;
                                    java.lang.Object[] objArr = new java.lang.Object[i3];
                                    objArr[i6] = tvnVar2.o();
                                    objArr[1] = obj22;
                                    objArr[i7] = str5;
                                    jSONArray2.put(jSONObject.put("resourceURL", java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/objects/%s", objArr)));
                                    i5 = i6;
                                    i4 = i7;
                                } else {
                                    int i8 = i4;
                                    java.lang.String string2 = new org.json.JSONObject().put("bulkDelete", new org.json.JSONObject().put("objects", new org.json.JSONObject().put("objectReference", jSONArray2))).toString();
                                    java.lang.Object[] objArr2 = new java.lang.Object[i8];
                                    objArr2[i6] = tvnVar2.o();
                                    objArr2[1] = obj22;
                                    ajcqVarN2 = ajcqVarN2.i(new defpackage.vkn(vlsVar3, vls.d(java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/objects/operations/bulkDelete", objArr2), string2, "DELETE"), 10, null), vlsVar3.d);
                                    i5 = i6;
                                    i3 = 3;
                                    i4 = 2;
                                }
                            }
                        } catch (org.json.JSONException e3) {
                            throw new defpackage.vmh(e3);
                        }
                    }
                    ajcqVarZ2 = ajcqVarN2;
                }
                return ahvr.I(ajcqVarZ2, new defpackage.vkn(obj21, aifyVar, 12, null), ((vmc) obj21).i);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aimw aimwVarL3 = vmc.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "downloadVoicemails", 334, "RestVvmSyncService.java");
                aify aifyVar3 = ((defpackage.vfg) this.a).b;
                aimwVarL3.w("Download %d server voicemails", aifyVar3.size());
                if (aifyVar3.isEmpty()) {
                    return ajcm.a;
                }
                java.lang.Object obj23 = this.b;
                java.lang.Object obj24 = this.c;
                vmc vmcVar4 = (vmc) obj24;
                vln vlnVar = vmcVar4.g;
                return ahvr.I(!vlnVar.q() ? ahvr.H(vlnVar.g((android.telecom.PhoneAccountHandle) obj23), new defpackage.vfp(obj24, obj23, i2), vmcVar4.j) : ahrv.g(vlnVar.g((android.telecom.PhoneAccountHandle) obj23)).i(new defpackage.vge(obj24, 17), vmcVar4.i).h(new defpackage.vfp(obj24, obj23, 14), vmcVar4.j), new defpackage.vjx(obj24, aifyVar3, obj23, 9, (byte[]) null), vmcVar4.i);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    a.bI(vmc.a.d(), "REST VVM Sync requested for disabled account, ignoring", "com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "sync", (char) 127, "RestVvmSyncService.java", zct.b);
                    return aiql.z(vmc.b);
                }
                java.lang.Object obj25 = this.b;
                java.lang.Object obj26 = this.c;
                java.lang.Object obj27 = this.a;
                vmc vmcVar5 = (vmc) obj27;
                vmcVar5.l.n(rmw.aN);
                java.lang.String str6 = (java.lang.String) obj26;
                ajcq ajcqVarC = vmcVar5.e.c(str6, aike.a, j$.util.Optional.empty(), 0);
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) obj25;
                ajcq ajcqVarE2 = vmcVar5.f.e(phoneAccountHandle2);
                ahda ahdaVarAf = ahvr.af(new ajcq[]{ajcqVarE2, ajcqVarC});
                uej uejVar = new uej(vmcVar5, ajcqVarE2, ajcqVarC, phoneAccountHandle2, str6, 4);
                ajct ajctVar4 = vmcVar5.i;
                return ahdaVarAf.f(uejVar, ajctVar4).i(new defpackage.vjx(obj27, obj25, obj26, i), ajctVar4).h(new defpackage.vmb(obj27, i3), ajctVar4).e(defpackage.vcx.class, new defpackage.vlk(15), ajctVar4);
            case 15:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional.isPresent()) {
                    java.lang.Object obj28 = this.c;
                    java.lang.Object obj29 = this.a;
                    java.lang.String str7 = ((defpackage.vdg) optional.orElseThrow()).c;
                    vls vlsVar4 = ((vmc) obj29).e;
                    java.lang.String str8 = java.lang.String.format("https://%s/phone20/mStoreRelay/oemclient/nms/v1/ums/%s/objects/%s", vlsVar4.j.o(), obj28, str7);
                    defpackage.ajzk ajzkVar2 = new defpackage.ajzk();
                    ajzkVar2.d("GET");
                    ajzkVar2.f(str8);
                    ahrv ahrvVarG4 = ahrv.g(vlsVar4.e(new defpackage.ajzm(ajzkVar2), 9));
                    vma vmaVar = vlsVar4.f;
                    j$.util.Objects.requireNonNull(vmaVar);
                    return ahrvVarG4.h(new defpackage.vfw(vmaVar, 20), vlsVar4.d);
                }
                vmc.a.d().i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "downloadAudioByUri", 175, "RestVvmSyncService.java").y("Can't find local voicemail with uri: %s", this.b);
                defpackage.vbx vbxVar = defpackage.vbx.SYNC_MAILBOX_CORRUPT;
                java.lang.String str9 = "REST VVM failure reason: " + vbxVar.a();
                akzx akzxVarM = vcp.a.m();
                akzxVarM.u();
                vcp vcpVar = akzxVarM.b;
                vcpVar.c = java.lang.Integer.valueOf(vbxVar.a());
                vcpVar.b = 2;
                throw new defpackage.vcv(akzxVarM.p(), str9, (java.lang.Throwable) null);
            case 16:
                return ((vmc) this.c).b(((defpackage.vmf) obj).f, (android.net.Uri) this.b, (android.telecom.PhoneAccountHandle) this.a);
            case 17:
                return ((vmi) this.a).g.a((java.lang.String) this.c, (android.telecom.PhoneAccountHandle) this.b);
            case 18:
                java.lang.Object obj30 = this.c;
                java.lang.Object obj31 = this.b;
                return ((vpq) this.a).e((android.telecom.PhoneAccountHandle) obj31, new defpackage.phs(obj31, obj30, (java.lang.String) obj, 11, (char[]) null));
            case 19:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                defpackage.vqt vqtVar = (defpackage.vqt) this.a;
                vda vdaVar = (vda) vqtVar.c.g().orElseThrow();
                java.lang.Object obj32 = this.b;
                android.telecom.PhoneAccountHandle phoneAccountHandle3 = (android.telecom.PhoneAccountHandle) obj32;
                ajcq ajcqVarI = ahrv.g(vdaVar.a(phoneAccountHandle3)).i(new defpackage.vmq(obj32, i2), vqtVar.b);
                ajcq ajcqVarA = optional2.isPresent() ? vqtVar.a(phoneAccountHandle3, (java.lang.String) optional2.orElseThrow(), (java.lang.String) optional2.orElseThrow()) : aiql.z(0);
                defpackage.vrl vrlVar = (defpackage.vrl) this.c;
                ajcq ajcqVarK = vrlVar.d.k();
                return ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarA, ajcqVarK}).o(new kxy(optional2, ajcqVarA, ajcqVarI, vqtVar, ajcqVarK, 8), vrlVar.c);
            default:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj33 = this.b;
                if (!zBooleanValue) {
                    a.bt(vvl.a.c().m(aioa.b), "voicemail transcription not available for %s", obj33, "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailFullscreenPromoDataServiceImpl", "declineTranscriptionPromo", (char) 297, "VoicemailFullscreenPromoDataServiceImpl.java", zct.b);
                    return ajcm.a;
                }
                java.lang.Object obj34 = this.c;
                vvl vvlVar = (vvl) this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle4 = (android.telecom.PhoneAccountHandle) obj33;
                return ahvr.ak(new ajcq[]{vvlVar.e.x(vvlVar.b, phoneAccountHandle4, false), vvlVar.i(phoneAccountHandle4, (java.lang.String) obj34), vvlVar.h(phoneAccountHandle4)}).o(new defpackage.vnc(2), vvlVar.c);
        }
    }

    public /* synthetic */ vjx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ vjx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ vjx(vlm vlmVar, java.lang.String str, java.lang.String str2, int i) {
        this.$cid = i;
        this.b = vlmVar;
        this.a = str;
        this.c = str2;
    }

    public /* synthetic */ vjx(defpackage.vrl vrlVar, defpackage.vqt vqtVar, android.telecom.PhoneAccountHandle phoneAccountHandle, int i) {
        this.$cid = i;
        this.c = vrlVar;
        this.a = vqtVar;
        this.b = phoneAccountHandle;
    }
}
