package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lly implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lly(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lvu */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v69, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v70, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v45, types: [aiii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        boolean z = false;
        final int i = 1;
        switch (this.$cid) {
            case 0:
                android.net.Uri uri = android.net.Uri.parse(((acuh) this.b).d);
                try {
                    aogc aogcVar = ((llz) this.a).d;
                    defpackage.llu lluVar = defpackage.llu.a;
                    return j$.util.Optional.of((defpackage.llu) aogcVar.M(uri, new affq(alad.M(defpackage.llu.class))));
                } catch (java.io.IOException e) {
                    hgb.g(llz.a.d(), "unable to read and parse TtsLanguagePack from %s", uri, "com/android/dialer/callscreen/impl/tts/client/TtsRepository", "parseLanguagePack", (char) 248, "TtsRepository.java", e, zct.b);
                    return j$.util.Optional.empty();
                }
            case 1:
                return new defpackage.lhr((j$.util.Optional) aiql.H((java.util.concurrent.Future) this.a), (lhs) aiql.H((java.util.concurrent.Future) this.b));
            case 2:
                aify aifyVar = (aify) j$.util.Collection.-EL.stream((java.util.Collection) this.a).map(new defpackage.kle(17)).filter(new defpackage.jvr(20)).collect(aido.a);
                akzx akzxVar = (akzx) this.b;
                akzxVar.u();
                defpackage.lqj lqjVar = (defpackage.lqj) akzxVar.b;
                defpackage.lqj lqjVar2 = defpackage.lqj.a;
                alat alatVar = lqjVar.b;
                if (!alatVar.c()) {
                    lqjVar.b = alad.J(alatVar);
                }
                akyl.i(aifyVar, lqjVar.b);
                return j$.util.Optional.of((defpackage.lqj) akzxVar.p());
            case 3:
                java.lang.Object obj = this.a;
                java.lang.Object obj2 = this.b;
                try {
                    android.database.Cursor cursorB = ((lvv) obj2).e.b((android.net.Uri) obj, new java.lang.String[]{"_id"}, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
                    if (cursorB != null) {
                        try {
                            if (cursorB.moveToFirst()) {
                                long j = cursorB.getLong(0);
                                cursorB.close();
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                rsr rsrVar = new rsr(new kaw("contact_id").aI("=", java.lang.Long.valueOf(j)));
                                rsrVar.aC(new kaw("account_type").aI("=", "com.google"));
                                rsr rsrVarAB = rsrVar.aB();
                                android.database.Cursor cursorB2 = ((lvv) obj2).e.b(android.provider.ContactsContract.RawContacts.CONTENT_URI, new java.lang.String[]{"_id", "account_type"}, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, (java.lang.String) null);
                                try {
                                    if (cursorB2 == null) {
                                        throw new lvu("null cursor from raw contact IDs");
                                    }
                                    cursorB2.moveToFirst();
                                    while (!cursorB2.isAfterLast()) {
                                        arrayList.add(java.lang.Long.valueOf(cursorB2.getLong(0)));
                                        cursorB2.moveToNext();
                                    }
                                    cursorB2.close();
                                    java.util.Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(android.provider.ContactsContract.RawContacts.CONTENT_URI, ((java.lang.Long) it.next()).longValue());
                                        android.content.Intent intent = new android.content.Intent();
                                        intent.setAction("com.google.android.gms.people.sync.focus.SYNC_HIGH_RES_PHOTO");
                                        intent.setComponent(lvv.b);
                                        intent.setDataAndType(uriWithAppendedId, "vnd.android.cursor.item/raw_contact");
                                        intent.addFlags(1);
                                        try {
                                            lvv.a.b().l("com/android/dialer/contacts/hiresphoto/HighResolutionPhotoRequesterImpl", "requestInternal", 103, "HighResolutionPhotoRequesterImpl.java").y("requesting photo for %s", uriWithAppendedId);
                                            ((lvv) obj2).c.sendBroadcast(intent);
                                        } catch (java.lang.IllegalStateException | java.lang.SecurityException e2) {
                                            throw new lvu(e2);
                                        }
                                    }
                                    return null;
                                } catch (java.lang.Throwable th) {
                                    if (cursorB2 == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorB2.close();
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
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
                    }
                    throw new lvu("cannot get contact ID");
                } catch (lvu e3) {
                    a.bq(lvv.a.c(), "request failed", "com/android/dialer/contacts/hiresphoto/HighResolutionPhotoRequesterImpl", "request", 'X', "HighResolutionPhotoRequesterImpl.java", e3, zct.b);
                    return null;
                }
            case 4:
                return new defpackage.lzl(((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue(), (wgi) aiql.H((java.util.concurrent.Future) this.b));
            case 5:
                aqan aqanVar = (aqan) ((mef) this.a).d.orElseThrow(new defpackage.iaz(16));
                float[] fArr = new float[15600];
                for (int i2 = 0; i2 < 15600; i2++) {
                    fArr[i2] = ((short[]) this.b)[i2] / 32768.0f;
                }
                float[][] fArr2 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 527);
                aqanVar.b(fArr, fArr2);
                return aify.n(defpackage.ajee.k(fArr2[0]));
            case 6:
                aimz aimzVar = defpackage.mfs.a;
                java.lang.Object obj3 = this.b;
                j$.lang.Iterable.-EL.forEach((java.lang.Iterable) this.a, new defpackage.fcg(obj3, 11));
                return (defpackage.mhj) ((akzx) obj3).p();
            case 7:
                akzx akzxVar2 = ((defpackage.mjm) this.a).e;
                j$.util.Objects.requireNonNull(akzxVar2);
                defpackage.lwx lwxVar = new defpackage.lwx(akzxVar2, 4);
                j$.util.Optional optional = (j$.util.Optional) this.b;
                if (true != optional.isPresent()) {
                    return null;
                }
                java.lang.String str = (java.lang.String) optional.get();
                akzx akzxVar3 = (akzx) lwxVar.a;
                akzxVar3.u();
                defpackage.mit mitVar = (defpackage.mit) akzxVar3.b;
                defpackage.mit mitVar2 = defpackage.mit.a;
                j$.util.Objects.requireNonNull(str);
                mitVar.b |= 4;
                mitVar.f = str;
                return null;
            case 8:
                ?? r0 = this.b;
                defpackage.mjm mjmVar = (defpackage.mjm) this.a;
                mjmVar.e.L(mjmVar.b(r0));
                return null;
            case 9:
                akzx akzxVar4 = ((defpackage.mjm) this.a).e;
                akzxVar4.u();
                defpackage.mit mitVar3 = (defpackage.mit) akzxVar4.b;
                defpackage.mit mitVar4 = defpackage.mit.a;
                java.lang.Object obj4 = this.b;
                j$.util.Objects.requireNonNull(obj4);
                mitVar3.b |= 1;
                mitVar3.d = (java.lang.String) obj4;
                return akzxVar4;
            case 10:
                java.util.HashSet hashSet = new java.util.HashSet();
                ailj ailjVarK = ((aihd) this.b).k();
                while (ailjVarK.hasNext()) {
                    j$.util.Optional optional2 = (j$.util.Optional) aiql.H((ajcq) ailjVarK.next());
                    j$.util.Objects.requireNonNull(hashSet);
                    defpackage.lwx lwxVar2 = new defpackage.lwx(hashSet, 9);
                    if (true == optional2.isPresent()) {
                        lwxVar2.a.add((android.telecom.PhoneAccount) optional2.get());
                    }
                }
                final java.lang.Object obj5 = this.a;
                defpackage.nwb.a.b().l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isDsdaAvailableOnAndroidVAndLater", 153, "DualSimDualActiveImpl.java").w("activeCallPhoneAccounts size = %d", hashSet.size());
                return java.lang.Boolean.valueOf(!ahvr.bq(hashSet, new ahyp() { // from class: adbm
                    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.Collection] */
                    public final boolean a(java.lang.Object obj6) {
                        int i3 = i;
                        if (i3 == 0) {
                            acvy acvyVar = (acvy) obj6;
                            int i4 = adbo.d;
                            acvy acvyVar2 = (acvy) obj5;
                            acwb acwbVar = acvyVar2.c;
                            if (acwbVar == null) {
                                acwbVar = acwb.a;
                            }
                            acwb acwbVar2 = acvyVar.c;
                            if (acwbVar2 == null) {
                                acwbVar2 = acwb.a;
                            }
                            if (!acwbVar.equals(acwbVar2) || acvyVar2.f != acvyVar.f || acvyVar2.d != acvyVar.d) {
                                return false;
                            }
                        } else {
                            if (i3 != 1) {
                                return j$.util.Collection.-EL.stream((java.util.Collection) obj5).anyMatch(new abdh((java.util.zip.ZipEntry) obj6, 7));
                            }
                            android.telecom.PhoneAccount phoneAccount = (android.telecom.PhoneAccount) obj6;
                            if (!mp$.ExternalSyntheticApiModelOutline1.m(phoneAccount)) {
                                return false;
                            }
                            if (mp$.ExternalSyntheticApiModelOutline1.m(phoneAccount).contains(obj5)) {
                                return false;
                            }
                            defpackage.nwb.a.b().l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isDsdaAvailableOnAndroidVAndLater", 170, "DualSimDualActiveImpl.java").y("Candidate blocked by active account: %s", phoneAccount.getAccountHandle());
                        }
                        return true;
                    }
                }));
            case 11:
                defpackage.nzj nzjVar = defpackage.nzj.a;
                return j$.util.Optional.of((defpackage.nzj) ((defpackage.nzm) this.b).g.M((android.net.Uri) this.a, new affq(alad.M(defpackage.nzj.class))));
            case 12:
                defpackage.nzu nzuVar = new defpackage.nzu(this.a, 14);
                j$.util.Optional optional3 = ((defpackage.omy) this.b).b;
                if (true != optional3.isPresent()) {
                    return optional3;
                }
                java.lang.Object obj6 = optional3.get();
                java.lang.Object obj7 = nzuVar.a;
                pmm pmmVar = new pmm();
                pmmVar.e(pms.e);
                pmmVar.d((java.lang.Integer) obj6);
                pmmVar.b(((android.content.Context) obj7).getText(2132018733).toString());
                return j$.util.Optional.ofNullable(pmmVar.a());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aimz aimzVar2 = onw.a;
                aidf aidfVar = new aidf((byte[]) null);
                for (java.util.Map.Entry entry : this.a.i()) {
                    ?? r2 = this.b;
                    if (((java.lang.Boolean) ((aigf) aiql.H((java.util.concurrent.Future) r2)).get(entry.getKey())).booleanValue()) {
                        aidfVar.t(entry.getKey(), entry.getValue());
                    }
                }
                return aidfVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.oqt oqtVarB = defpackage.oqt.b(((defpackage.oqs) this.b).c);
                if (oqtVarB == null) {
                    oqtVarB = defpackage.oqt.DIALER_HATS_EVENT_TYPE_UNKNOWN;
                }
                java.util.Map map = ((oqi) this.a).k;
                map.put(oqtVarB, java.lang.Integer.valueOf(((java.lang.Integer) j$.util.Map.-EL.getOrDefault(map, oqtVarB, 0)).intValue() + 1));
                oqi.a.b().l("com/android/dialer/hats/DialerHatsEventProcessor", "storeEvent", 247, "DialerHatsEventProcessor.java").y("Recorded HaTS event of type = %s", oqtVarB);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.util.Iterator it2 = this.b.iterator();
                while (true) {
                    java.lang.Object obj8 = this.a;
                    if (!it2.hasNext()) {
                        return ((aift) obj8).h();
                    }
                    aify aifyVar2 = (aify) aiql.H((ajcq) it2.next());
                    if (aifyVar2 != null) {
                        ((aift) obj8).k(aifyVar2);
                    }
                }
                break;
            case 16:
                return (java.lang.Integer) j$.util.Map.-EL.getOrDefault(((oqi) this.a).k, this.b, 0);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((oqi) this.a).k.keySet().removeAll(this.b);
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue() && !((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue()) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((qba) this.b).d.remove(this.a);
                return null;
            default:
                return java.lang.Boolean.valueOf(((qdo) this.a).f.remove(this.b));
        }
    }

    public /* synthetic */ lly(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
