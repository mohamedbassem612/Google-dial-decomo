package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vez implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vez(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0651  */
    /* JADX WARN: Code duplicated, block: B:134:0x06b2 A[Catch: all -> 0x0765, TryCatch #0 {all -> 0x0765, blocks: (B:126:0x0674, B:127:0x0689, B:129:0x069e, B:132:0x06a7, B:133:0x06ad, B:135:0x06ba, B:137:0x0720, B:138:0x0730, B:139:0x0737, B:134:0x06b2, B:140:0x0738), top: B:196:0x0674 }] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.lang.Throwable {
        defpackage.vgs vgsVar;
        defpackage.vgs vgsVar2;
        aikn aiknVarH;
        java.lang.String strI;
        j$.util.Optional optionalEmpty;
        j$.util.Optional optionalOfNullable;
        j$.util.Optional optionalH;
        int i = 10;
        int i2 = 16;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                final int intExtra = ((android.content.Intent) this.b).getIntExtra("android.telephony.extra.SUBSCRIPTION_INDEX", -1);
                ahvr.bN(intExtra != -1, "invalid subscription id");
                final defpackage.vfa vfaVar = (defpackage.vfa) this.a;
                return (android.telecom.PhoneAccountHandle) j$.util.Collection.-EL.stream(vfaVar.h.t()).filter(new java.util.function.Predicate() { // from class: vey
                    @Override // java.util.function.Predicate
                    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ java.util.function.Predicate negate() {
                        return j$.util.function.Predicate.-CC.$default$negate(this);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return vfaVar.i.b((android.telecom.PhoneAccountHandle) obj) == intExtra;
                    }
                }).findFirst().orElseThrow(new defpackage.rqc(i));
            case 1:
                android.content.Intent intent = (android.content.Intent) this.b;
                android.telephony.SmsMessage[] messagesFromIntent = android.provider.Telephony.Sms.Intents.getMessagesFromIntent(intent);
                ahvr.bN(messagesFromIntent != null, "missing sms messages");
                aify aifyVarP = aify.p(gus.au(messagesFromIntent.length));
                java.lang.Object obj = this.a;
                ((defpackage.vfa) obj).j.d(obj.getClass(), intent, aifyVarP);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                j$.util.DesugarArrays.stream(messagesFromIntent).forEach(new defpackage.vel(sb, 8));
                if (sb.length() != 0) {
                    return sb.toString();
                }
                throw new java.lang.IllegalArgumentException("no valid sms messages");
            case 2:
                vfn vfnVar = (vfn) this.a;
                ailj ailjVarK = vfnVar.j.e().k();
                while (ailjVarK.hasNext()) {
                    ((rsr) ailjVarK.next()).z((android.telecom.PhoneAccountHandle) this.b);
                }
                vfnVar.f.o(rmx.gm);
                return null;
            case 3:
                okj okjVar = ((vfn) this.a).e;
                int iB = okjVar.b((android.telecom.PhoneAccountHandle) this.b);
                if (iB == -1) {
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.valueOf(okjVar.a() == iB);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((vfn) this.a).i((android.telecom.PhoneAccountHandle) this.b);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return java.lang.Boolean.valueOf(((vfu) this.a).r((android.telecom.PhoneAccountHandle) this.b));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                oko okoVar = ((vgg) this.a).k;
                return java.lang.Boolean.valueOf(!okoVar.aa() || ((android.os.PersistableBundle) okoVar.i((android.telecom.PhoneAccountHandle) this.b).s().orElseThrow(new defpackage.rqc(i2))).getBoolean("VVMIgnoreDataRoaming"));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return vgl.d((j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b), (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.a));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return j$.util.Optional.ofNullable((vbu) ((aigf) ((vgl) this.a).c.eZ()).get(this.b));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj2 = this.b;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                defpackage.vgs vgsVar3 = (defpackage.vgs) obj2;
                java.lang.String strN = vgsVar3.n(5);
                aihb aihbVar = new aihb();
                java.lang.Object obj3 = this.a;
                try {
                    ((defpackage.vgs) obj2).b = ((defpackage.vgs) obj2).m("INBOX");
                    aihd aihdVarA = ((defpackage.vgs) obj2).a((aihd) obj3);
                    if (aihdVarA.isEmpty()) {
                        aiknVarH = aikn.a;
                        vgsVar2 = vgsVar3;
                    } else {
                        ailj ailjVarK2 = aihdVarA.k();
                        while (ailjVarK2.hasNext()) {
                            defpackage.whl whlVar = (defpackage.whl) ailjVarK2.next();
                            java.lang.Object obj4 = whlVar.b;
                            if (whlVar.a != null) {
                                defpackage.vhd vhdVar = new defpackage.vhd();
                                vhdVar.add(whlVar.a);
                                aihd aihdVarA2 = ((defpackage.vgs) obj2).b.a(new aile(((defpackage.vhi) obj4).a), vhdVar);
                                if (aihdVarA2.isEmpty()) {
                                    strI = null;
                                } else {
                                    strI = defpackage.vgs.i(((defpackage.vgs) obj2).c, (defpackage.vhi) aihdVarA2.k().next());
                                }
                            } else {
                                strI = null;
                            }
                            long time = ((defpackage.vhi) whlVar.b).e().getTime();
                            com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[] addressArrG = ((defpackage.vhi) whlVar.b).g();
                            if (addressArrG != null) {
                                int i4 = i3;
                                int length = addressArrG.length;
                                if (length > 0) {
                                    vgsVar = vgsVar3;
                                    if (length != 1) {
                                        try {
                                            hgb.j(defpackage.vgs.a.d(), "More than one from addresses found. Using the first one.", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getNumber", (char) 684, "ImapOperations.java", zct.b, zct.a);
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            vgsVar.j();
                                            throw th;
                                        }
                                    }
                                    java.lang.String strSubstring = addressArrG[i4].c;
                                    int iIndexOf = strSubstring.indexOf(64);
                                    int iIndexOf2 = strSubstring.indexOf(61);
                                    if (iIndexOf != -1) {
                                        strSubstring = strSubstring.substring(i4, iIndexOf);
                                    }
                                    if (iIndexOf2 != -1) {
                                        strSubstring = strSubstring.substring(iIndexOf2 + 1);
                                    }
                                    optionalEmpty = j$.util.Optional.of(strSubstring);
                                } else {
                                    vgsVar = vgsVar3;
                                    optionalEmpty = j$.util.Optional.empty();
                                }
                            } else {
                                vgsVar = vgsVar3;
                                optionalEmpty = j$.util.Optional.empty();
                            }
                            boolean zContains = java.util.Arrays.asList(((defpackage.vhi) whlVar.b).h()).contains("seen");
                            j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(((defpackage.vhi) whlVar.b).c());
                            defpackage.vgw vgwVar = new defpackage.vgw();
                            vgwVar.g(((defpackage.vhi) whlVar.b).a);
                            vgwVar.b(time);
                            vgwVar.d((java.lang.String) optionalEmpty.orElse(""));
                            vgwVar.f(((defpackage.vgs) obj2).g);
                            vgwVar.h(((defpackage.vgs) obj2).c.getPackageName());
                            vgwVar.e(zContains);
                            vgwVar.c(((java.lang.Long) optionalOfNullable2.orElse(0L)).longValue());
                            j$.util.Optional optionalOfNullable3 = j$.util.Optional.ofNullable(strI);
                            if (optionalOfNullable3 == null) {
                                throw new java.lang.NullPointerException("Null transcription");
                            }
                            vgwVar.a = optionalOfNullable3;
                            aihbVar.i(vgwVar.a());
                            aihdVarA = aihdVarA;
                            vgsVar3 = vgsVar;
                            i3 = 0;
                        }
                        vgsVar2 = vgsVar3;
                        ((defpackage.vgs) obj2).k(strN, jElapsedRealtime);
                        ((defpackage.vgs) obj2).h.a(zct.a).f(mgv.cS, aike.a, gus.au(aihdVarA.size()));
                        aiknVarH = aihbVar.h();
                    }
                    aikn aiknVar = aiknVarH;
                    vgsVar2.j();
                    return aiknVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    vgsVar = vgsVar3;
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj5 = this.b;
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                defpackage.vgs vgsVar4 = (defpackage.vgs) obj5;
                java.lang.String strN2 = vgsVar4.n(17);
                ?? r0 = this.a;
                try {
                    defpackage.yzr yzrVar = new defpackage.yzr(((defpackage.vgs) obj5).f);
                    aigb aigbVar = new aigb(4);
                    yzrVar.a = ((defpackage.vid) yzrVar.b).a();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(new defpackage.vio("INBOX"));
                    j$.util.Collection.-EL.stream((java.util.Collection) r0).forEach(new defpackage.vel(arrayList, 9));
                    ((defpackage.vhy) yzrVar.a).g("GETMETADATA", (defpackage.vih[]) j$.util.Collection.-EL.stream(arrayList).toArray(new via(0)));
                    for (defpackage.vil vilVar : ((defpackage.vhy) yzrVar.a).d()) {
                        if (vilVar.q()) {
                            if (!vilVar.k(0, "OK", false)) {
                                throw new defpackage.vgv("getMetadata unexpected status code: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(vilVar.n()))), null);
                            }
                            aigf aigfVarE = aigbVar.e(true);
                            ((defpackage.vgs) obj5).k(strN2, jElapsedRealtime2);
                            zjv.i(((defpackage.vgs) obj5).h.a(zct.a), mgv.dg, aify.p(gus.aw("N/A")), (mhc) null, 0, 28);
                            return aigfVarE;
                        }
                        if (!vilVar.p(0, "METADATA")) {
                            throw new defpackage.vgv("getMetadata unexpected response", null);
                        }
                        defpackage.vij vijVarH = vilVar.h(2);
                        if (vijVarH.e() % 2 != 0) {
                            throw new defpackage.vgv("getMetadata unexpected response size. The attribute count should more than 2.", null);
                        }
                        for (int i5 = 0; i5 < vijVarH.e(); i5 += 2) {
                            aigbVar.i(vijVarH.j(i5).b().replace("\"", ""), vijVarH.f(i5 + 1));
                        }
                    }
                    throw new defpackage.vgv("Missing status response", null);
                } catch (java.io.IOException | defpackage.vgv e) {
                    aimw aimwVarK = defpackage.vgs.a.c().i(zct.b).k(e);
                    ainp ainpVar = zct.a;
                    aimwVarK.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getMetadata", 1378, "ImapOperations.java").v("Failed to getMetadata");
                    zjv.i(vgsVar4.h.a(ainpVar), mgv.dg, aify.p(gus.aw(e.toString())), (mhc) null, 0, 28);
                    return aikj.b;
                }
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj6 = this.b;
                long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                defpackage.vgs vgsVar5 = (defpackage.vgs) obj6;
                java.lang.String strN3 = vgsVar5.n(3);
                aile aileVar = new aile("deleted");
                aify aifyVar = (aify) this.a;
                vgsVar5.l(aifyVar, aileVar);
                vgsVar5.k(strN3, jElapsedRealtime3);
                zjv.i(vgsVar5.h.a(zct.a), mgv.cQ, aify.p(gus.au(aifyVar.size())), (mhc) null, 0, 28);
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj7 = this.b;
                java.lang.Object obj8 = this.a;
                try {
                    long jElapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                    java.lang.String strN4 = ((defpackage.vgs) obj7).n(4);
                    ((defpackage.vgs) obj7).b = ((defpackage.vgs) obj7).m("INBOX");
                    aihd aihdVarB = ((defpackage.vgs) obj7).b.b((java.lang.String) obj8);
                    ((defpackage.vgs) obj7).k(strN4, jElapsedRealtime4);
                    ((defpackage.vgs) obj7).h.a(zct.a).f(mgv.cR, aike.a, gus.au(aihdVarB.size()));
                    return aihdVarB;
                } finally {
                    ((defpackage.vgs) obj7).j();
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj9 = this.b;
                long jElapsedRealtime5 = android.os.SystemClock.elapsedRealtime();
                defpackage.vgs vgsVar6 = (defpackage.vgs) obj9;
                java.lang.String strN5 = vgsVar6.n(10);
                ?? r1 = this.a;
                try {
                    ((defpackage.vgs) obj9).b = ((defpackage.vgs) obj9).m("GREETINGS");
                    ((defpackage.vgs) obj9).b.g((aihd) j$.util.Collection.-EL.stream((java.util.Collection) r1).map(new thy(obj9, 12)).collect(aido.b), new aile("deleted"));
                    ((defpackage.vgs) obj9).k(strN5, jElapsedRealtime5);
                    zjv.i(((defpackage.vgs) obj9).h.a(zct.a), mgv.cX, aify.p(gus.au(((aihd) r1).size())), (mhc) null, 0, 28);
                    return null;
                } finally {
                    vgsVar6.j();
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj10 = this.b;
                defpackage.vgs vgsVar7 = (defpackage.vgs) obj10;
                defpackage.vgi vgiVar = vgsVar7.j;
                java.lang.Object obj11 = this.a;
                if (!vgiVar.f()) {
                    vgsVar7.h.a(zct.a).f(mgv.cU, aify.p(gus.aw("useCarrierTranscription flag is not enabled")), gus.ax(false));
                    return j$.util.Optional.empty();
                }
                try {
                    long jElapsedRealtime6 = android.os.SystemClock.elapsedRealtime();
                    java.lang.String strN6 = ((defpackage.vgs) obj10).n(7);
                    ((defpackage.vgs) obj10).b = ((defpackage.vgs) obj10).m("INBOX");
                    aihd aihdVarA3 = ((defpackage.vgs) obj10).a(new aile(obj11));
                    if (aihdVarA3.isEmpty()) {
                        ((defpackage.vgs) obj10).k(strN6, jElapsedRealtime6);
                        ((defpackage.vgs) obj10).h.a(zct.a).f(mgv.cU, aify.p(gus.aw("Message structure is empty")), gus.ax(false));
                        optionalOfNullable = j$.util.Optional.empty();
                    } else {
                        defpackage.whl whlVar2 = (defpackage.whl) aihdVarA3.k().next();
                        if (whlVar2.a == null) {
                            ((defpackage.vgs) obj10).k(strN6, jElapsedRealtime6);
                            ((defpackage.vgs) obj10).h.a(zct.a).f(mgv.cU, aify.p(gus.aw("Transcription body part is null")), gus.ax(false));
                            optionalOfNullable = j$.util.Optional.empty();
                        } else {
                            defpackage.vhd vhdVar2 = new defpackage.vhd();
                            vhdVar2.add(whlVar2.a);
                            aihd aihdVarA4 = ((defpackage.vgs) obj10).b.a(new aile(((defpackage.vhi) whlVar2.b).a), vhdVar2);
                            if (aihdVarA4.isEmpty()) {
                                throw new defpackage.vgv("Unable to fetch transcription", null);
                            }
                            optionalOfNullable = j$.util.Optional.ofNullable(defpackage.vgs.i(((defpackage.vgs) obj10).c, (defpackage.vhi) aihdVarA4.k().next()));
                            ((defpackage.vgs) obj10).k(strN6, jElapsedRealtime6);
                            ((defpackage.vgs) obj10).h.a(zct.a).f(mgv.cU, aify.p(gus.aw("N/A")), gus.ax(optionalOfNullable.isPresent()));
                        }
                    }
                    vgsVar7.j();
                    return optionalOfNullable;
                } catch (java.lang.Throwable th3) {
                    vgsVar7.j();
                    throw th3;
                }
            case 15:
                java.lang.Object obj12 = this.b;
                defpackage.vgs vgsVar8 = (defpackage.vgs) obj12;
                j$.util.Optional optionalOfNullable4 = vgsVar8.j.b;
                boolean zIsPresent = optionalOfNullable4.isPresent();
                java.lang.Object obj13 = this.a;
                if (true == zIsPresent) {
                    optionalOfNullable4 = j$.util.Optional.ofNullable(((defpackage.vjd) optionalOfNullable4.get()).g());
                }
                java.lang.String str = (java.lang.String) optionalOfNullable4.orElse((java.lang.Object) null);
                if (android.text.TextUtils.isEmpty(str)) {
                    defpackage.vgs.a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "changeVoicemailTuiLanguage", 996, "ImapOperations.java").v("can't change voicemail tui language because command is null");
                    zjv.i(vgsVar8.h.a(zct.a), mgv.da, aify.p(gus.aw("command is null")), (mhc) null, 0, 28);
                    return null;
                }
                java.lang.String strN7 = vgsVar8.n(13);
                defpackage.vid vidVar = vgsVar8.f;
                long jElapsedRealtime7 = android.os.SystemClock.elapsedRealtime();
                try {
                    vidVar.a().c(java.lang.String.format(java.util.Locale.US, str, obj13));
                    ((defpackage.vgs) obj12).k(strN7, jElapsedRealtime7);
                    zjv.i(((defpackage.vgs) obj12).h.a(zct.a), mgv.da, aify.p(gus.aw("N/A")), (mhc) null, 0, 28);
                    return null;
                } catch (java.io.IOException | defpackage.vgv e2) {
                    aimw aimwVarK2 = defpackage.vgs.a.c().i(zct.b).k(e2);
                    ainp ainpVar2 = zct.a;
                    aimwVarK2.i(ainpVar2).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "changeVoicemailTuiLanguage", 1022, "ImapOperations.java").v("change TUI language failed");
                    zjv.i(vgsVar8.h.a(ainpVar2), mgv.da, aify.p(gus.aw(e2.toString())), (mhc) null, 0, 28);
                    return null;
                }
            case 16:
                java.lang.Object obj14 = this.b;
                long jElapsedRealtime8 = android.os.SystemClock.elapsedRealtime();
                defpackage.vgs vgsVar9 = (defpackage.vgs) obj14;
                java.lang.String strN8 = vgsVar9.n(2);
                aile aileVar2 = new aile("seen");
                aify aifyVar2 = (aify) this.a;
                vgsVar9.l(aifyVar2, aileVar2);
                vgsVar9.k(strN8, jElapsedRealtime8);
                zjv.i(vgsVar9.h.a(zct.a), mgv.cP, aify.p(gus.au(aifyVar2.size())), (mhc) null, 0, 28);
                return null;
            case 17:
                java.lang.Object obj15 = this.b;
                java.lang.Object obj16 = this.a;
                try {
                    long jElapsedRealtime9 = android.os.SystemClock.elapsedRealtime();
                    java.lang.String strN9 = ((defpackage.vgs) obj15).n(6);
                    ((defpackage.vgs) obj15).b = ((defpackage.vgs) obj15).m("INBOX");
                    defpackage.vhd vhdVar3 = new defpackage.vhd();
                    vhdVar3.add(defpackage.vhc.e);
                    aihd aihdVarA5 = ((defpackage.vgs) obj15).b.a(new aile(obj16), vhdVar3);
                    if (aihdVarA5.isEmpty()) {
                        defpackage.vgs.a.d().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "fetchVoicemailPayload", 747, "ImapOperations.java").v("Empty payload found");
                        ((defpackage.vgs) obj15).h.a(zct.a).f(mgv.cT, aike.a, gus.ax(false));
                        optionalH = j$.util.Optional.empty();
                    } else {
                        optionalH = ((defpackage.vgs) obj15).h(((defpackage.vgs) obj15).c, (defpackage.vhi) aihdVarA5.k().next());
                        ((defpackage.vgs) obj15).k(strN9, jElapsedRealtime9);
                        ((defpackage.vgs) obj15).h.a(zct.a).f(mgv.cT, aike.a, gus.ax(optionalH.isPresent()));
                    }
                    return optionalH;
                } finally {
                    ((defpackage.vgs) obj15).j();
                }
            case 18:
                return j$.util.Collection.-EL.stream(((defpackage.vjr) this.a).d.t()).filter(new defpackage.ree(this.b, i2)).findAny();
            case 19:
                j$.util.Optional optionalV = ((defpackage.vkj) this.a).f.i((android.telecom.PhoneAccountHandle) this.b).v();
                return true == optionalV.isPresent() ? j$.util.Optional.ofNullable(defpackage.vkj.f((java.lang.String) optionalV.get())) : optionalV;
            default:
                return java.lang.Boolean.valueOf(((vli) this.a).l((android.telecom.PhoneAccountHandle) this.b));
        }
    }

    public /* synthetic */ vez(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
