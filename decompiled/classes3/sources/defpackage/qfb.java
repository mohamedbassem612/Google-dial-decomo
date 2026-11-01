package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qfb implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qfb(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v67, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v72, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        defpackage.spc spcVar;
        int i = 1;
        switch (this.$cid) {
            case 0:
                android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
                android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
                java.lang.Object obj = this.b;
                java.lang.Object obj2 = this.a;
                try {
                    android.telecom.Call.RttCall rttCallM = rs$.ExternalSyntheticApiModelOutline0.m(((defpackage.qfd) obj2).b);
                    ahvr.ci(rttCallM);
                    rs$.ExternalSyntheticApiModelOutline0.m(rttCallM, (java.lang.String) obj);
                    mni.aK(((defpackage.qfd) obj2).e, mfy.es);
                    return null;
                } finally {
                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                }
            case 1:
                java.util.Set set = ((qdo) this.a).f;
                java.lang.Object obj3 = this.b;
                boolean zIsEmpty = set.isEmpty();
                set.add(obj3);
                return java.lang.Boolean.valueOf(zIsEmpty);
            case 2:
                defpackage.qga qgaVar = (defpackage.qga) this.a;
                android.content.Intent intent = new android.content.Intent("android.intent.action.CALL", qgaVar.b);
                j$.util.Optional optional = qgaVar.c;
                if (optional.isPresent()) {
                    intent.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", (android.os.Parcelable) optional.orElseThrow());
                }
                ((defpackage.qgc) this.b).c.c(intent);
                return null;
            case 3:
                ((qmt) this.b).e().b(mce.am);
                ((android.telecom.InCallService) this.a).stopForeground(true);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.rce rceVar = defpackage.rcf.a;
                boolean zEquals = ((alad) this.b).equals(defpackage.rcf.a(defpackage.qtr.MORE_MENU));
                akzx akzxVarM = defpackage.qtw.a.m();
                defpackage.qug qugVar = defpackage.qug.BUTTON_MORE;
                akzxVarM.u();
                defpackage.qtw qtwVar = (defpackage.qtw) akzxVarM.b;
                qtwVar.c = qugVar.H;
                qtwVar.b |= 1;
                android.content.Context context = (android.content.Context) this.a;
                java.lang.String string = context.getString(2132019070);
                akzxVarM.u();
                defpackage.qtw qtwVar2 = (defpackage.qtw) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                qtwVar2.b |= 4;
                qtwVar2.e = string;
                akzxVarM.u();
                defpackage.qtw qtwVar3 = (defpackage.qtw) akzxVarM.b;
                qtwVar3.b |= 2;
                qtwVar3.d = 2131231976;
                java.lang.String string2 = zEquals ? context.getString(2132019053) : context.getString(2132019054);
                akzxVarM.u();
                defpackage.qtw qtwVar4 = (defpackage.qtw) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                qtwVar4.b |= 8;
                qtwVar4.f = string2;
                akzxVarM.u();
                defpackage.qtw qtwVar5 = (defpackage.qtw) akzxVarM.b;
                qtwVar5.b |= 32;
                qtwVar5.h = zEquals;
                akzxVarM.u();
                defpackage.qtw qtwVar6 = (defpackage.qtw) akzxVarM.b;
                qtwVar6.b |= 16;
                qtwVar6.g = true;
                return j$.util.Optional.of((defpackage.qtw) akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                akzx akzxVarM2 = defpackage.qtw.a.m();
                defpackage.qug qugVar2 = defpackage.qug.BUTTON_DIALPAD;
                akzxVarM2.u();
                defpackage.qtw qtwVar7 = (defpackage.qtw) akzxVarM2.b;
                qtwVar7.c = qugVar2.H;
                qtwVar7.b |= 1;
                android.content.Context context2 = (android.content.Context) this.a;
                java.lang.String string3 = context2.getString(2132019065);
                akzxVarM2.u();
                defpackage.qtw qtwVar8 = (defpackage.qtw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string3);
                qtwVar8.b |= 4;
                qtwVar8.e = string3;
                akzxVarM2.u();
                defpackage.qtw qtwVar9 = (defpackage.qtw) akzxVarM2.b;
                qtwVar9.b |= 2;
                qtwVar9.d = 2131231950;
                java.lang.String string4 = context2.getString(2132019065);
                akzxVarM2.u();
                defpackage.qtw qtwVar10 = (defpackage.qtw) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string4);
                qtwVar10.b |= 8;
                qtwVar10.f = string4;
                akzxVarM2.u();
                defpackage.qtw qtwVar11 = (defpackage.qtw) akzxVarM2.b;
                qtwVar11.b |= 16;
                qtwVar11.g = true;
                defpackage.rcd rcdVarB = defpackage.rcd.b(((defpackage.rce) this.b).c);
                if (rcdVarB == null) {
                    rcdVarB = defpackage.rcd.EMPTY;
                }
                boolean z = rcdVarB == defpackage.rcd.DIALPAD;
                akzxVarM2.u();
                defpackage.qtw qtwVar12 = (defpackage.qtw) akzxVarM2.b;
                qtwVar12.b |= 32;
                qtwVar12.h = z;
                return j$.util.Optional.of((defpackage.qtw) akzxVarM2.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.rak rakVar = (defpackage.rak) this.b;
                if (rakVar.c) {
                    defpackage.rak.a.b().l("com/android/dialer/incall/voice/service/VoiceAnimationPlayerImpl", "playAnimation", 51, "VoiceAnimationPlayerImpl.java").v("current animation is still playing, playAnimationRequest is denied");
                    return java.lang.Boolean.FALSE;
                }
                rakVar.b = j$.util.Optional.of(this.a);
                rakVar.e.a(ajcm.a);
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.rap rapVar = (defpackage.rap) this.a;
                defpackage.rce rceVar2 = rapVar.l;
                defpackage.rcd rcdVarB2 = defpackage.rcd.b(rceVar2.c);
                if (rcdVarB2 == null) {
                    rcdVarB2 = defpackage.rcd.EMPTY;
                }
                java.lang.Object obj4 = this.b;
                if (rcdVarB2 == obj4) {
                    obj4 = defpackage.rcd.EMPTY;
                }
                java.lang.Object obj5 = obj4;
                akzx akzxVarP = rceVar2.p();
                akzxVarP.u();
                defpackage.rce rceVar3 = (defpackage.rce) akzxVarP.b;
                rceVar3.c = ((defpackage.rcd) obj5).e;
                rceVar3.b |= 1;
                rapVar.l = (defpackage.rce) akzxVarP.p();
                rapVar.p.a(ajcm.a);
                return obj5;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (((java.lang.Boolean) ((j$.util.Optional) this.b).orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                aike aikeVar = defpackage.reh.a;
                int i2 = aikeVar.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    java.lang.Object obj6 = this.a;
                    defpackage.reg regVar = (defpackage.reg) aikeVar.get(i3);
                    if (j$.util.Collection.-EL.stream(regVar.a).allMatch(new defpackage.ree(obj6, i))) {
                        ahvr.cc(!optionalEmpty.isPresent(), "%s matches multiple rules", ((aihd) obj6).toString());
                        optionalEmpty = j$.util.Optional.of(regVar);
                    }
                }
                return true != optionalEmpty.isPresent() ? optionalEmpty : j$.util.Optional.ofNullable(((defpackage.reg) optionalEmpty.get()).b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.io.File file = new java.io.File((java.lang.String) this.b);
                if (!file.exists() && !file.mkdir()) {
                    throw new java.lang.AssertionError(java.lang.String.format("Failed to make path: %s ", file));
                }
                java.lang.Object obj7 = this.a;
                ipc.bi(file);
                java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream((java.io.InputStream) obj7);
                try {
                    byte[] bArr = new byte[16385];
                    while (true) {
                        java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            zipInputStream.close();
                            return file.getAbsolutePath();
                        }
                        java.lang.String name = nextEntry.getName();
                        java.io.File file2 = new java.io.File(file, name);
                        if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                            throw new java.util.zip.ZipException("Illegal name: ".concat(java.lang.String.valueOf(name)));
                        }
                        if (!nextEntry.isDirectory()) {
                            if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
                                throw new java.lang.AssertionError(java.lang.String.format("Failed to make path: %s ", file2.getParentFile()));
                            }
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                            while (true) {
                                try {
                                    int i4 = zipInputStream.read(bArr);
                                    if (i4 != -1) {
                                        fileOutputStream.write(bArr, 0, i4);
                                    } else {
                                        fileOutputStream.close();
                                    }
                                } catch (java.lang.Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                                try {
                                    zipInputStream.close();
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    th.addSuppressed(th3);
                                    throw th;
                                }
                            }
                        }
                        if (!file2.exists() && !file2.mkdirs()) {
                            throw new java.lang.AssertionError(java.lang.String.format("Failed to make path: %s ", file2));
                        }
                        zipInputStream.closeEntry();
                    }
                } catch (java.lang.Throwable th4) {
                    zipInputStream.close();
                    throw th4;
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return adnp.f(((hkd) aiql.H((java.util.concurrent.Future) this.a)).c, (java.lang.String) ((j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b)).orElseThrow());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aify aifyVar = (aify) aiql.H((java.util.concurrent.Future) this.a);
                if (aifyVar != null) {
                    return new defpackage.rvs(aifyVar, (defpackage.ruu) ((j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b)).orElse((java.lang.Object) null));
                }
                throw new java.lang.NullPointerException("Null prefDataList");
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj8 = this.a;
                rwo rwoVar = (rwo) obj8;
                android.content.Context context3 = rwoVar.b;
                aihd aihdVarA = rwoVar.a();
                ?? r13 = this.b;
                if (rwu.h(context3, aihdVarA, (java.util.Set) r13) && aihdVarA.equals(rwoVar.b())) {
                    return null;
                }
                rwo.a.b().l("com/android/dialer/notification/channel/NotificationChannelManagerCompat", "deleteObsoleteChannels", 170, "NotificationChannelManagerCompat.java").I("doing an expensive initialization of all notification channels, desired channel IDs: %s, existing channel IDs: %s", aihdVarA, (java.lang.Object) r13);
                ailj ailjVarK = ((aihd) r13).k();
                while (ailjVarK.hasNext()) {
                    java.lang.String str = (java.lang.String) ailjVarK.next();
                    if (!aihdVarA.contains(str)) {
                        try {
                            da$.ExternalSyntheticApiModelOutline1.m(((rwo) obj8).d, str);
                        } catch (java.lang.SecurityException e) {
                            rwo.a.d().k(e).l("com/android/dialer/notification/channel/NotificationChannelManagerCompat", "deleteObsoleteChannels", 179, "NotificationChannelManagerCompat.java").y("deleteObsoleteChannels failed for channel %s", str);
                        }
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj9 = this.a;
                try {
                    return (defpackage.spl) ((spw) this.b).i(new aile(obj9)).get(obj9);
                } catch (spv e2) {
                    a.bq(spw.a.c(), "querying blocked numbers failed", "com/android/dialer/phonelookup/blockednumber/SystemBlockedNumberPhoneLookupContributor", "lookup", 'W', "SystemBlockedNumberPhoneLookupContributor.java", e2, zct.b);
                    akzx akzxVarM3 = defpackage.spl.a.m();
                    akzxVarM3.u();
                    defpackage.spl splVar = (defpackage.spl) akzxVarM3.b;
                    splVar.c = 2;
                    splVar.b |= 1;
                    return (defpackage.spl) akzxVarM3.p();
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.String str2 = ((hkd) this.a).c;
                gus.aJ();
                return sqe.i(defpackage.rxe.a(((sqe) this.b).a, android.net.Uri.parse("content://" + defpackage.rxe.c + "/lookup"), android.telephony.PhoneNumberUtils.stripSeparators(str2), new java.lang.String[]{"system"}));
            case 15:
                rsr rsrVar = new rsr();
                rsrVar.aC(new kaw("normalized_number").aI("=", this.b));
                rsr rsrVarAB = rsrVar.aB();
                android.database.Cursor cursorB = ((sqf) this.a).b.b(sro.a, new java.lang.String[]{"phone_lookup_info"}, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, (java.lang.String) null);
                try {
                    if (cursorB == null) {
                        sqf.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/phonelookup/cnap/CnapPhoneLookupContributor", "lookup", 123, "CnapPhoneLookupContributor.java").v("null cursor");
                        return defpackage.spc.a;
                    }
                    if (cursorB.moveToFirst()) {
                        ahvr.bY(cursorB.getCount() == 1);
                        try {
                            defpackage.spn spnVar = (defpackage.spn) alad.y(defpackage.spn.a, cursorB.getBlob(cursorB.getColumnIndexOrThrow("phone_lookup_info")));
                            sqf.a.b().l("com/android/dialer/phonelookup/cnap/CnapPhoneLookupContributor", "lookup", 147, "CnapPhoneLookupContributor.java").v("returning existing CNAP phone lookup info");
                            defpackage.spc spcVar2 = spnVar.i;
                            if (spcVar2 == null) {
                                spcVar2 = defpackage.spc.a;
                            }
                            spcVar = spcVar2;
                        } catch (alaz e3) {
                            throw new java.lang.IllegalStateException((java.lang.Throwable) e3);
                        }
                    } else {
                        sqf.a.b().l("com/android/dialer/phonelookup/cnap/CnapPhoneLookupContributor", "lookup", 128, "CnapPhoneLookupContributor.java").v("empty cursor");
                        spcVar = defpackage.spc.a;
                    }
                    cursorB.close();
                    return spcVar;
                } catch (java.lang.Throwable th5) {
                    if (cursorB == null) {
                        throw th5;
                    }
                    try {
                        cursorB.close();
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            case 16:
                android.content.Context context4 = (android.content.Context) this.a;
                return new sso(context4).a(defpackage.ura.b((android.telecom.Call.Details) this.b), rlt.a(context4, (android.telecom.PhoneAccountHandle) null));
            case 17:
                java.lang.Object obj10 = this.b;
                aenj aenjVar = sqw.b;
                sqw sqwVar = (sqw) obj10;
                ruc rucVar = sqwVar.e;
                rucVar.j(aenjVar);
                java.lang.Object obj11 = this.a;
                try {
                    java.lang.String str3 = ((hkd) obj11).c;
                    if (android.text.TextUtils.isEmpty(str3)) {
                        sqw.a.b().l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "lookupInternal", 131, "SingleNumberLookup.java").v("empty number");
                        java.util.HashSet hashSet = new java.util.HashSet();
                        sqwVar.e.m(sqw.b);
                        return hashSet;
                    }
                    java.lang.String str4 = ((hkd) obj11).h;
                    java.util.Set setA = ((sqw) obj10).a(str3, str4);
                    if (setA.isEmpty()) {
                        ailk ailkVarY = ((sqw) obj10).d.a(str3, ((hkd) obj11).d).y(0);
                        while (ailkVarY.hasNext()) {
                            setA = ((sqw) obj10).a((java.lang.String) ailkVarY.next(), str4);
                            if (!setA.isEmpty()) {
                                sqw.a.b().l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "lookupInternal", 148, "SingleNumberLookup.java").v("returning result for phone number variation");
                            }
                        }
                    } else {
                        sqw.a.b().l("com/android/dialer/phonelookup/cp2/SingleNumberLookup", "lookupInternal", 139, "SingleNumberLookup.java").v("returning result from internal lookup");
                    }
                    rucVar.m(aenjVar);
                    return setA;
                } catch (java.lang.Throwable th7) {
                    sqwVar.e.m(sqw.b);
                    throw th7;
                }
            case 18:
                akzx akzxVarM4 = defpackage.sph.a.m();
                boolean zE = ((srs) this.b).a.e(((hkd) this.a).c);
                akzxVarM4.u();
                defpackage.sph sphVar = (defpackage.sph) akzxVarM4.b;
                sphVar.b |= 1;
                sphVar.c = zE;
                return (defpackage.sph) akzxVarM4.p();
            case 19:
                return srv.i((ssm) this.b, (hkd) this.a);
            default:
                defpackage.svn svnVar = new defpackage.svn((java.lang.String) this.b);
                android.net.Uri uri = defpackage.svk.a;
                aooh.e(uri, "CONTENT_URI_USER_SIM_PREFERENCE");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("dialednumber", svnVar.a);
                return j$.util.Optional.ofNullable(((defpackage.svm) this.a).g.c(new ojp(uri, "bestsim", bundle)));
        }
    }

    public /* synthetic */ qfb(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
