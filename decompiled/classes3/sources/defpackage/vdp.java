package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vdp implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vdp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.regex.Pattern] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws org.json.JSONException, defpackage.vgv, java.io.IOException {
        j$.util.Optional optionalEmpty;
        int i = 9;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                amsq amsqVar = amsq.a;
                akzx akzxVarM = amsqVar.m();
                vdq vdqVar = (vdq) this.a;
                java.util.Map map = vdqVar.e;
                for (defpackage.amsk amskVar : map.values()) {
                    akzxVarM.u();
                    amsq amsqVar2 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(amskVar);
                    alat alatVar = amsqVar2.k;
                    if (!alatVar.c()) {
                        amsqVar2.k = alad.J(alatVar);
                    }
                    amsqVar2.k.add(amskVar);
                }
                java.util.Map map2 = vdqVar.f;
                for (defpackage.amsj amsjVar : map2.values()) {
                    akzxVarM.u();
                    amsq amsqVar3 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(amsjVar);
                    alat alatVar2 = amsqVar3.l;
                    if (!alatVar2.c()) {
                        amsqVar3.l = alad.J(alatVar2);
                    }
                    amsqVar3.l.add(amsjVar);
                }
                java.util.Map map3 = vdqVar.g;
                java.util.Iterator it = map3.values().iterator();
                while (it.hasNext()) {
                    akzxVarM.bi((defpackage.amsp) it.next());
                }
                map.clear();
                map2.clear();
                map3.clear();
                akzx akzxVarP = vdqVar.b.p();
                akzxVarP.z(akzxVarM.p());
                vdqVar.b = akzxVarP.p();
                ((rlv) vdqVar.c.a()).B(vdqVar.b);
                vdqVar.b = amsqVar;
                return null;
            case 1:
                return java.lang.Boolean.valueOf(((vav) this.a).m.s().size() > 1);
            case 2:
                vea veaVar = (vea) this.a;
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) veaVar.b.getSystemService(android.net.ConnectivityManager.class);
                if (connectivityManager == null) {
                    return java.lang.Boolean.FALSE;
                }
                android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                    return java.lang.Boolean.FALSE;
                }
                android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities != null && (((java.lang.Boolean) veaVar.l.a()).booleanValue() || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0))) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                try {
                    return java.lang.Integer.valueOf(android.provider.Settings.Global.getInt(((vei) this.a).b.getContentResolver(), "boot_count", -1));
                } catch (java.lang.SecurityException e) {
                    a.bq(vei.a.d(), "Failed to get device boot count", "com/android/dialer/voicemail/service/impl/scheduler/VvmTimeProvider", "getBootCount", (char) 166, "VvmTimeProvider.java", e, zct.b);
                    return -1;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ?? r0 = this.a;
                boolean zStartsWith = ((java.lang.String) r0).startsWith("GET");
                ?? Group = r0;
                if (zStartsWith) {
                    java.util.regex.Matcher matcher = vej.b.matcher(r0);
                    if (matcher.find()) {
                        Group = r0;
                        Group = matcher.group(1);
                    }
                }
                Group = r0;
                ahvr.bN(!android.text.TextUtils.isEmpty(Group), "empty message");
                java.util.List listJ = ahzf.d("?").k().j((java.lang.CharSequence) Group);
                ahvr.bR(listJ.size() == 2, "invalid message:%s", aais.aD((java.lang.Object) Group));
                java.lang.String str = (java.lang.String) listJ.get(1);
                aigb aigbVar = new aigb(4);
                for (java.lang.String str2 : ahzf.e("&").a().h(str)) {
                    int iIndexOf = str2.indexOf("=");
                    ahvr.bR(iIndexOf > 0, "equal sign not exist, entry:%s", aais.aD(str2));
                    aigbVar.i(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                }
                aigf aigfVarE = aigbVar.e(true);
                ahvr.bR(!aigfVarE.isEmpty(), "invalid message:%s", aais.aD((java.lang.Object) Group));
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str3 = (java.lang.String) listJ.get(0);
                java.util.List listJ2 = ahzf.d(":").k().j(str3);
                ahvr.bR(listJ2.size() == 2, "invalid message header:%s", aais.aD(str3));
                java.lang.String str4 = (java.lang.String) listJ2.get(0);
                ahvr.bR(!android.text.TextUtils.isEmpty(str4), "invalid message header:%s", aais.aD(str3));
                bundle.putString("srv", str4);
                j$.lang.Iterable.-EL.forEach(aigfVarE.f(), new rh(aigfVarE, bundle, 18, (byte[]) null));
                bundle.putString("pw_len", "7-15");
                return bundle;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.content.Context context = ((defpackage.vfa) this.a).b;
                context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) com.android.dialer.voicemail.service.impl.sms.receiver.AdnMessageReceiver_Receiver.class), 2, 1);
                return java.lang.Boolean.FALSE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return (java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return java.lang.Boolean.valueOf(((android.os.UserManager) this.a).isSystemUser());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                vfo vfoVar = (vfo) this.a;
                vfoVar.g.n(rmw.ax);
                vfoVar.h.f(vfo.b);
                vfoVar.i.i((java.lang.String) null).b(mce.dO);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj = this.a;
                defpackage.vgs vgsVar = (defpackage.vgs) obj;
                j$.util.Optional optionalC = vgsVar.j.b;
                if (true == optionalC.isPresent()) {
                    optionalC = ((defpackage.vjd) optionalC.get()).c();
                    optionalC.getClass();
                }
                java.lang.String str5 = (java.lang.String) optionalC.orElse((java.lang.Object) null);
                if (android.text.TextUtils.isEmpty(str5)) {
                    defpackage.vgs.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "closeNewUserTutorial", 1038, "ImapOperations.java").v("can't close new user tutorial because command is null");
                    zjv.i(vgsVar.h.a(zct.a), mgv.db, aify.p(gus.aw("command is null")), (mhc) null, 0, 28);
                    return null;
                }
                java.lang.String strN = vgsVar.n(14);
                defpackage.vid vidVar = vgsVar.f;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                try {
                    vidVar.a().c(str5);
                    ((defpackage.vgs) obj).k(strN, jElapsedRealtime);
                    zjv.i(((defpackage.vgs) obj).h.a(zct.a), mgv.db, aify.p(gus.aw("N/A")), (mhc) null, 0, 28);
                    return null;
                } catch (java.io.IOException | defpackage.vgv e2) {
                    zjv.i(vgsVar.h.a(zct.a), mgv.db, aify.p(gus.aw(e2.toString())), (mhc) null, 0, 28);
                    throw new defpackage.vgv(e2.toString(), e2);
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj2 = this.a;
                try {
                    long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                    java.lang.String strN2 = ((defpackage.vgs) obj2).n(8);
                    ((defpackage.vgs) obj2).b = ((defpackage.vgs) obj2).m("GREETINGS");
                    aihd aihdVarA = ((defpackage.vgs) obj2).a(((defpackage.vgs) obj2).b.b("1:* NOT DELETED"));
                    if (aihdVarA.isEmpty()) {
                        aimw aimwVarB = defpackage.vgs.a.b();
                        ainp ainpVar = zct.a;
                        aimwVarB.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "fetchActiveVoicemailGreeting", 391, "ImapOperations.java").v("No greeting exist");
                        ((defpackage.vgs) obj2).k(strN2, jElapsedRealtime2);
                        ((defpackage.vgs) obj2).h.a(ainpVar).f(mgv.cV, aify.p(gus.au(0)), gus.ax(false));
                        optionalEmpty = j$.util.Optional.empty();
                    } else {
                        aimw aimwVarB2 = defpackage.vgs.a.b();
                        ainp ainpVar2 = zct.a;
                        aimwVarB2.i(ainpVar2).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "fetchActiveVoicemailGreeting", 404, "ImapOperations.java").w("Total %d greeting(s) fetched.", aihdVarA.size());
                        j$.util.Optional optionalMax = j$.util.Collection.-EL.stream(aihdVarA).filter(new vgb(5)).max(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(i)));
                        ((defpackage.vgs) obj2).h.a(ainpVar2).f(mgv.cV, aify.p(gus.au(aihdVarA.size())), gus.ax(optionalMax.isPresent()));
                        if (optionalMax.isPresent()) {
                            java.lang.Object obj3 = ((defpackage.whl) optionalMax.orElseThrow()).b;
                            defpackage.vhz vhzVarM = ((defpackage.vgs) obj2).m("GREETINGS");
                            defpackage.vhd vhdVar = new defpackage.vhd();
                            vhdVar.add(defpackage.vhc.e);
                            aihd aihdVarA2 = vhzVarM.a(new aile(((defpackage.vhi) obj3).a), vhdVar);
                            vhzVarM.d(true);
                            if (aihdVarA2.isEmpty()) {
                                throw new defpackage.vgv("No greeting audio data", null);
                            }
                            akzc akzcVar = ((defpackage.vgy) ((defpackage.vgs) obj2).h(((defpackage.vgs) obj2).c, (defpackage.vhi) aihdVarA2.k().next()).orElseThrow(new defpackage.rqc(20))).b;
                            defpackage.adrp adrpVarA = defpackage.voy.a();
                            adrpVarA.l(((defpackage.vgs) obj2).g);
                            adrpVarA.k(java.util.concurrent.TimeUnit.SECONDS.toMillis(((defpackage.vhi) obj3).c().longValue()));
                            adrpVarA.b = aify.j(akzcVar);
                            adrpVarA.c = ((defpackage.vhi) obj3).a;
                            defpackage.voy voyVarJ = adrpVarA.j();
                            ((defpackage.vgs) obj2).k(strN2, jElapsedRealtime2);
                            optionalEmpty = j$.util.Optional.of(voyVarJ);
                        } else {
                            ((defpackage.vgs) obj2).k(strN2, jElapsedRealtime2);
                            optionalEmpty = j$.util.Optional.empty();
                        }
                    }
                    j$.util.Optional optional = optionalEmpty;
                    ((defpackage.vgs) obj2).j();
                    return optional;
                } catch (java.lang.Throwable th) {
                    ((defpackage.vgs) obj2).j();
                    throw th;
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj4 = this.a;
                try {
                    long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                    java.lang.String strN3 = ((defpackage.vgs) obj4).n(11);
                    ((defpackage.vgs) obj4).b = ((defpackage.vgs) obj4).m("GREETINGS");
                    aihd aihdVarB = ((defpackage.vgs) obj4).b.b("1:* NOT DELETED");
                    ((defpackage.vgs) obj4).b.g((aihd) j$.util.Collection.-EL.stream(aihdVarB).map(new thy(obj4, 13)).collect(aido.b), new aile("deleted"));
                    ((defpackage.vgs) obj4).k(strN3, jElapsedRealtime3);
                    zjv.i(((defpackage.vgs) obj4).h.a(zct.a), mgv.cY, aify.p(gus.au(aihdVarB.size())), (mhc) null, 0, 28);
                    return null;
                } finally {
                    ((defpackage.vgs) obj4).j();
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.vgs) this.a).m("INBOX");
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj5 = this.a;
                long jElapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                defpackage.vgs vgsVar2 = (defpackage.vgs) obj5;
                java.lang.String strN4 = vgsVar2.n(9);
                try {
                    ((defpackage.vgs) obj5).b = ((defpackage.vgs) obj5).m("GREETINGS");
                    aihd aihdVarB2 = ((defpackage.vgs) obj5).b.b("1:* NOT DELETED");
                    ((defpackage.vgs) obj5).k(strN4, jElapsedRealtime4);
                    ((defpackage.vgs) obj5).h.a(zct.a).f(mgv.cW, aike.a, gus.au(aihdVarB2.size()));
                    return aihdVarB2;
                } finally {
                    vgsVar2.j();
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return java.lang.Boolean.valueOf(zqz.a(((vlm) this.a).b, "android.permission.READ_PHONE_STATE"));
            case 15:
                return java.lang.Boolean.valueOf(zqz.a(((vlm) this.a).b, "android.permission.READ_PHONE_STATE"));
            case 16:
                aimz aimzVar = vma.a;
                org.json.JSONArray jSONArray = new org.json.JSONObject(akzc.t((java.nio.ByteBuffer) ((defpackage.alic) this.a).b).A()).getJSONObject("folder").getJSONObject("attributes").getJSONArray("attribute");
                j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    if (jSONObject.getString("name").equals("VMOccupiedMessages")) {
                        optionalEmpty2 = j$.util.Optional.of(java.lang.Integer.valueOf(jSONObject.getJSONArray("value").getInt(0)));
                    }
                    if (jSONObject.getString("name").equals("VMMessagesQuota")) {
                        optionalEmpty3 = j$.util.Optional.of(java.lang.Integer.valueOf(jSONObject.getJSONArray("value").getInt(0)));
                    }
                }
                if (optionalEmpty2.isPresent() && optionalEmpty3.isPresent()) {
                    return new defpackage.vlv(((java.lang.Integer) optionalEmpty2.orElseThrow()).intValue(), ((java.lang.Integer) optionalEmpty3.orElseThrow()).intValue());
                }
                if (optionalEmpty2.isPresent()) {
                    throw new org.json.JSONException("Missing VMMessagesQuota in json");
                }
                throw new org.json.JSONException("Missing VMOccupiedMessages in json");
            case 17:
                java.lang.Object obj6 = ((defpackage.alic) this.a).b;
                aimz aimzVar2 = vma.a;
                org.json.JSONArray jSONArray2 = new org.json.JSONObject(akzc.t((java.nio.ByteBuffer) obj6).A()).getJSONObject("vvmserviceProfile").getJSONObject("attributes").getJSONArray("attribute");
                int i3 = 0;
                boolean z2 = false;
                boolean z3 = false;
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    org.json.JSONObject jSONObject2 = jSONArray2.getJSONObject(i4);
                    if (jSONObject2.getString("name").equals("vvmon")) {
                        z2 = jSONObject2.getJSONArray("value").getBoolean(0);
                        i3 |= 1;
                    }
                    if (jSONObject2.getString("name").equals("nut")) {
                        z3 = jSONObject2.getJSONArray("value").getBoolean(0);
                        i3 |= 2;
                    }
                }
                if (i3 == 3) {
                    return new defpackage.vlz(z2, z3);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if ((i3 & 1) == 0) {
                    sb.append(" vvmOn");
                }
                if ((i3 & 2) == 0) {
                    sb.append(" newUserTutorialOn");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
            case 18:
                java.lang.Object obj7 = this.a;
                try {
                    java.io.File file = ((defpackage.vol) obj7).d;
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                    try {
                        byte[] bArr = new byte[(int) file.length()];
                        fileInputStream.read(bArr);
                        defpackage.adrp adrpVarA2 = defpackage.voy.a();
                        adrpVarA2.b = aify.n(ajee.m(bArr));
                        adrpVarA2.k(((defpackage.vol) obj7).j);
                        adrpVarA2.l(((defpackage.vol) obj7).l);
                        defpackage.voy voyVarJ2 = adrpVarA2.j();
                        fileInputStream.close();
                        return voyVarJ2;
                    } catch (java.lang.Throwable th2) {
                        try {
                            fileInputStream.close();
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (java.io.IOException e3) {
                    throw new java.io.IOException("Read greeting audio data failed", e3);
                }
            case 19:
                java.lang.Object obj8 = this.a;
                defpackage.vol volVar = (defpackage.vol) obj8;
                volVar.e();
                try {
                    ((defpackage.vol) obj8).o.c();
                    volVar.o.m();
                    volVar.c.c();
                    volVar.c(defpackage.voj.d);
                    return null;
                } catch (java.io.IOException e4) {
                    a.bq(defpackage.vol.a.c(), "failed to prepare media player", "com/android/dialer/voicemail/settings/GreetingRecorder", "startPlayback", (char) 381, "GreetingRecorder.java", e4, zct.b);
                    return null;
                }
            default:
                defpackage.vol volVar2 = (defpackage.vol) this.a;
                android.media.MediaRecorder mediaRecorder = volVar2.e;
                mediaRecorder.setAudioSource(1);
                if (volVar2.k) {
                    mediaRecorder.setOutputFormat(2);
                    mediaRecorder.setAudioEncoder(3);
                    mediaRecorder.setAudioEncodingBitRate(192000);
                    mediaRecorder.setAudioSamplingRate(44100);
                } else {
                    mediaRecorder.setOutputFormat(3);
                    mediaRecorder.setAudioEncoder(1);
                }
                mediaRecorder.setOutputFile(volVar2.d.getAbsolutePath());
                try {
                    mediaRecorder.prepare();
                    volVar2.e.start();
                    volVar2.c.c();
                    volVar2.m = false;
                    volVar2.b(true);
                    volVar2.e();
                    volVar2.c(defpackage.voj.b);
                } catch (java.io.IOException e5) {
                    a.bq(defpackage.vol.a.c(), "failed to prepare media recorder", "com/android/dialer/voicemail/settings/GreetingRecorder", "startRecording", (char) 316, "GreetingRecorder.java", e5, zct.b);
                }
                return null;
        }
    }
}
