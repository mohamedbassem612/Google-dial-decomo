package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class syg implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ syg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0299  */
    /* JADX WARN: Code duplicated, block: B:166:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:170:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:171:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ca  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v12, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v86, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, ucw] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, ucw] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        java.lang.String strH;
        java.lang.String strH2;
        long j;
        aivt aivtVarB;
        j$.util.Optional optionalOf;
        boolean z;
        int i;
        java.util.Map map;
        java.lang.String str;
        int iA = 0;
        defpackage.tdt tdtVar = null;
        switch (this.$cid) {
            case 0:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                j$.util.Optional optional = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.a);
                j$.util.Objects.requireNonNull(arrayList);
                defpackage.rhb rhbVar = new defpackage.rhb(arrayList, 18);
                if (true == optional.isPresent()) {
                    rhbVar.a.add((defpackage.qib) optional.get());
                }
                j$.util.Optional optional2 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b);
                j$.util.Objects.requireNonNull(arrayList);
                defpackage.rhb rhbVar2 = new defpackage.rhb(arrayList, 18);
                if (true == optional2.isPresent()) {
                    rhbVar2.a.add((defpackage.qib) optional2.get());
                }
                return aify.n(arrayList);
            case 1:
                lgj lgjVar = (lgj) aiql.H((java.util.concurrent.Future) this.a);
                j$.util.Optional optional3 = (j$.util.Optional) aiql.H((java.util.concurrent.Future) this.b);
                if (lgjVar != lgj.c && (lgjVar != lgj.d || optional3.isPresent())) {
                    return j$.util.Optional.empty();
                }
                defpackage.qih qihVar = new defpackage.qih();
                qihVar.d();
                qihVar.c();
                qihVar.b();
                return j$.util.Optional.of(qihVar.a());
            case 2:
                return afsq.bX((ajcq) this.a, (ajcq) this.b);
            case 3:
                int i2 = ((tcp) this.a).f;
                tcu tcuVar = (tcu) this.b;
                if (!android.provider.Settings.Secure.putInt(tcuVar.b.getContentResolver(), "dialer_rtt_configuration", i2)) {
                    throw new java.io.IOException("database error");
                }
                tcuVar.c.b();
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                gus.aJ();
                defpackage.tdx tdxVar = new defpackage.tdx((android.content.Context) this.a);
                try {
                    android.database.Cursor cursorQuery = tdxVar.getReadableDatabase().query("rtt_transcript", new java.lang.String[]{"transcript_data"}, "rtt_transcript_id = ?", new java.lang.String[]{(java.lang.String) this.b}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                try {
                                    tdtVar = (defpackage.tdt) alad.B(defpackage.tdt.a, cursorQuery.getBlob(0), akzq.a());
                                } catch (alaz e) {
                                    throw new defpackage.ahzr("Parse failed for RTT transcript", e);
                                }
                            }
                            cursorQuery.close();
                            break;
                        } catch (java.lang.Throwable th) {
                            try {
                                cursorQuery.close();
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    tdxVar.close();
                    return tdtVar;
                } catch (java.lang.Throwable th3) {
                    tdxVar.close();
                    throw th3;
                }
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aimz aimzVar = teb.a;
                aimzVar.b().l("com/android/dialer/rtt/transcript/RttTranscriptUtil", "save", 155, "RttTranscriptUtil.java").v("Saving RTT transcript.");
                gus.aJ();
                defpackage.tdx tdxVar2 = new defpackage.tdx((android.content.Context) this.a);
                android.content.ContentValues contentValues = new android.content.ContentValues();
                java.lang.Object obj = this.b;
                contentValues.put("rtt_transcript_id", ((defpackage.tdt) obj).c);
                contentValues.put("transcript_data", ((akym) obj).i());
                try {
                    try {
                        if (tdxVar2.getWritableDatabase().insert("rtt_transcript", null, contentValues) < 0) {
                            aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/rtt/transcript/RttTranscriptUtil", "save", 171, "RttTranscriptUtil.java").v("Failed to save RTT transcript.");
                        }
                    } finally {
                        tdxVar2.close();
                    }
                    break;
                } catch (android.database.sqlite.SQLiteException e2) {
                    teb.a.c().i(zct.b).k(e2).l("com/android/dialer/rtt/transcript/RttTranscriptUtil", "save", 178, "RttTranscriptUtil.java").v("SqlLite error when saving RTT transcript.");
                }
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int i3 = 0;
                gus.aJ();
                defpackage.tdx tdxVar3 = new defpackage.tdx((android.content.Context) this.a);
                aihb aihbVar = new aihb();
                rsr rsrVar = new rsr();
                rsrVar.aC(new kaw("rtt_transcript_id").aF((java.util.Collection) this.b));
                rsr rsrVarAB = rsrVar.aB();
                android.database.Cursor cursorQuery2 = tdxVar3.getReadableDatabase().query("rtt_transcript", new java.lang.String[]{"rtt_transcript_id"}, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, null, null, null);
                if (cursorQuery2 != null) {
                    while (cursorQuery2.moveToNext()) {
                        try {
                            aihbVar.i(cursorQuery2.getString(i3));
                            i3 = 0;
                        } catch (java.lang.Throwable th4) {
                            try {
                                cursorQuery2.close();
                                throw th4;
                            } catch (java.lang.Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    }
                }
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                tdxVar3.close();
                return aihbVar.h();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.tdx tdxVar4 = new defpackage.tdx((android.content.Context) this.a);
                rsr rsrVar2 = new rsr();
                rsrVar2.aC(new kaw("rtt_transcript_id").aF((java.util.Collection) this.b));
                rsr rsrVarAB2 = rsrVar2.aB();
                teb.a.b().l("com/android/dialer/rtt/transcript/RttTranscriptUtil", "deleteRttTranscript", 201, "RttTranscriptUtil.java").w("num of rows deleted :%d", tdxVar4.getReadableDatabase().delete("rtt_transcript", (java.lang.String) rsrVarAB2.b, (java.lang.String[]) rsrVarAB2.a));
                tdxVar4.close();
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((defpackage.tzk) this.a).c.add((defpackage.amtu) defpackage.tzk.a.getOrDefault(this.b, defpackage.amtu.SONIC_NOT_SET));
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.util.Iterator it = ahvr.aQ((java.util.List) this.b).iterator();
                while (it.hasNext()) {
                    iA += ((udy) this.a).p.a.a((java.util.List) it.next());
                }
                udy.a.b().l("com/android/dialer/spam/composite/CompositeSpam", "batchDeleteCallSpamStatus", 212, "CompositeSpam.java").w("deleted %d rows", iA);
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.util.List listAQ = ahvr.aQ((java.util.List) this.b);
                aift aiftVar = new aift(4);
                java.util.Iterator it2 = listAQ.iterator();
                while (it2.hasNext()) {
                    aiftVar.k(((udy) this.a).p.a.b((java.util.List) it2.next()));
                }
                return (aigf) j$.util.Collection.-EL.stream(aiftVar.h()).collect(aido.b(new defpackage.thw(8), new defpackage.thw(9)));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj2 = this.b;
                defpackage.ucq ucqVar = (defpackage.ucq) this.a;
                udy udyVar = (udy) obj2;
                j$.util.Optional optionalG = udyVar.g(ucqVar);
                if (optionalG.isPresent()) {
                    defpackage.ucu ucuVar = (defpackage.ucu) ((defpackage.taq) optionalG.orElseThrow()).a;
                    int i4 = ucuVar.b;
                    long j2 = (i4 & 1) != 0 ? ucuVar.c : ucqVar.f;
                    if ((i4 & 16) != 0) {
                        strH = ucuVar.f;
                    } else {
                        aivu aivuVar = ucqVar.c;
                        if (aivuVar == null) {
                            aivuVar = aivu.a;
                        }
                        strH = udy.h(aivuVar.g, j2);
                    }
                    strH2 = strH;
                    j = j2;
                } else {
                    j = ucqVar.f;
                    aivu aivuVar2 = ucqVar.c;
                    if (aivuVar2 == null) {
                        aivuVar2 = aivu.a;
                    }
                    strH2 = udy.h(aivuVar2.g, j);
                }
                aivu aivuVar3 = ucqVar.c;
                if (aivuVar3 == null) {
                    aivuVar3 = aivu.a;
                }
                int i5 = aivuVar3.f;
                aivt aivtVarB2 = aivt.b(i5);
                if (aivtVarB2 == null) {
                    aivtVarB2 = aivt.a;
                }
                aivt aivtVar = aivt.b;
                if (aivtVarB2 == aivtVar) {
                    aivtVarB = aivt.b(i5);
                    if (aivtVarB == null) {
                        aivtVarB = aivt.a;
                    }
                    if (aivtVarB == aivtVar) {
                        optionalOf = j$.util.Optional.of(rmw.K);
                    } else if (!aivuVar3.p || aivuVar3.n) {
                        optionalOf = j$.util.Optional.of(rmw.J);
                    } else {
                        optionalOf = j$.util.Optional.of(rmw.I);
                    }
                } else {
                    aivt aivtVarB3 = aivt.b(i5);
                    if (aivtVarB3 == null) {
                        aivtVarB3 = aivt.a;
                    }
                    if (aivtVarB3 != aivt.c) {
                        optionalOf = j$.util.Optional.empty();
                    } else {
                        aivtVarB = aivt.b(i5);
                        if (aivtVarB == null) {
                            aivtVarB = aivt.a;
                        }
                        if (aivtVarB == aivtVar) {
                            optionalOf = j$.util.Optional.of(rmw.K);
                        } else if (aivuVar3.p) {
                            optionalOf = j$.util.Optional.of(rmw.J);
                        } else {
                            optionalOf = j$.util.Optional.of(rmw.J);
                        }
                    }
                }
                defpackage.udv udvVar = new defpackage.udv(udyVar, strH2, j);
                if (true != optionalOf.isPresent()) {
                    return null;
                }
                udvVar.a.h.h((rmw) optionalOf.get(), udvVar.b, udvVar.c);
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return j$.util.Optional.ofNullable(((udy) this.b).p.j(java.lang.String.valueOf(((defpackage.ucq) this.a).f)));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                android.content.Context context = ((uek) this.a).b;
                return new sso(context).a((java.lang.String) this.b, rlt.a(context, (android.telecom.PhoneAccountHandle) null));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj3 = this.a;
                j$.lang.Iterable.-EL.forEach((java.lang.Iterable) this.b, new defpackage.oxs(obj3, 16));
                return ((aigb) obj3).e(true);
            case 15:
                boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                boolean zBooleanValue2 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.b)).booleanValue();
                akzx akzxVarM = defpackage.amou.a.m();
                akzxVarM.u();
                defpackage.amou amouVar = (defpackage.amou) akzxVarM.b;
                amouVar.b |= 1;
                amouVar.c = zBooleanValue;
                akzxVarM.u();
                defpackage.amou amouVar2 = (defpackage.amou) akzxVarM.b;
                amouVar2.b |= 2;
                amouVar2.d = zBooleanValue2;
                return (defpackage.amou) akzxVarM.p();
            case 16:
                uhk uhkVar = (uhk) this.a;
                android.content.Context context2 = uhkVar.h;
                java.lang.String strNormalizeNumber = android.telephony.PhoneNumberUtils.normalizeNumber((java.lang.String) this.b);
                if (!zqz.a(context2, "android.permission.READ_CONTACTS") || android.text.TextUtils.isEmpty(strNormalizeNumber)) {
                    return java.lang.Boolean.FALSE;
                }
                android.database.Cursor cursorB = uhkVar.t.b(android.net.Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, strNormalizeNumber), new java.lang.String[]{"_id"}, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
                if (cursorB != null) {
                    try {
                        if (cursorB.getCount() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (java.lang.Throwable th6) {
                        if (cursorB == null) {
                            throw th6;
                        }
                        try {
                            cursorB.close();
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } else {
                    z = false;
                }
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
                if (cursorB == null) {
                    return boolValueOf;
                }
                cursorB.close();
                return boolValueOf;
            case 17:
                ((uqc) this.b).g((android.net.Uri) this.a, j$.util.Optional.empty());
                return null;
            case 18:
                uqc uqcVar = (uqc) this.b;
                upp uppVarM = uqcVar.m();
                aify aifyVarA = uppVarM.a();
                int size = aifyVarA.size();
                defpackage.upo upoVar = null;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    java.lang.Object obj4 = this.a;
                    if (i6 >= size) {
                        if (upoVar == null) {
                            a.bI(uqc.a.d(), "entry to delete could not be found, returning", "com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "removeSpeedDialUiItem", (char) 247, "SpeedDialUiItemMutator.java", zct.b);
                            return null;
                        }
                        aify aifyVarP = aify.p(upoVar.a);
                        if (!aifyVarP.isEmpty()) {
                            android.database.sqlite.SQLiteDatabase writableDatabase = uppVarM.getWritableDatabase();
                            try {
                                upp.c(writableDatabase, aifyVarP);
                                if (writableDatabase != null) {
                                    writableDatabase.close();
                                }
                            } catch (java.lang.Throwable th8) {
                                if (writableDatabase == null) {
                                    throw th8;
                                }
                                try {
                                    writableDatabase.close();
                                    throw th8;
                                } catch (java.lang.Throwable th9) {
                                    th8.addSuppressed(th9);
                                    throw th8;
                                }
                            }
                        }
                        if (i7 != 1) {
                            return null;
                        }
                        uqc.a.b().l("com/android/dialer/speeddial/loader/SpeedDialUiItemMutator", "unstarContact", 263, "SpeedDialUiItemMutator.java").v("enter");
                        gus.aJ();
                        android.content.ContentValues contentValues2 = new android.content.ContentValues();
                        contentValues2.put("starred", (java.lang.Integer) 0);
                        uqcVar.f.q(android.provider.ContactsContract.Contacts.CONTENT_URI, contentValues2, "_id = ?", new java.lang.String[]{java.lang.Long.toString(((defpackage.upt) obj4).f)});
                        return null;
                    }
                    defpackage.upo upoVar2 = (defpackage.upo) aifyVarA.get(i6);
                    defpackage.upt uptVar = (defpackage.upt) obj4;
                    if (upoVar2.c == uptVar.f) {
                        i7++;
                    }
                    if (j$.util.Objects.equals(upoVar2.a, (uptVar.b & 1) != 0 ? java.lang.Long.valueOf(uptVar.c) : null)) {
                        ahvr.bM(upoVar == null);
                        upoVar = upoVar2;
                    }
                    i6++;
                }
                break;
            case 19:
                aca acaVar = new aca();
                android.net.Uri uri = android.provider.CallLog.Calls.CONTENT_URI;
                java.lang.String[] strArr = defpackage.uqp.c;
                java.lang.String[] strArr2 = {"10"};
                java.lang.Object obj5 = this.b;
                ojo ojoVar = ((defpackage.uqp) obj5).i;
                java.lang.Object obj6 = this.a;
                boolean z2 = ((defpackage.uqo) obj6).b;
                android.database.Cursor cursorB2 = ojoVar.b(uri, strArr, true != z2 ? "number != \"\" AND type = 2 AND duration >= ?" : "number != \"\" AND ((type = 1 OR type = 2) AND duration >= ? OR type = 3)", strArr2, "date DESC");
                if (cursorB2 == null) {
                    return acaVar;
                }
                try {
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    java.util.Map acaVar2 = new aca();
                    int i8 = 0;
                    while (cursorB2.moveToNext() && cursorB2.getPosition() < 300) {
                        java.lang.String strG = defpackage.uqp.g(cursorB2.getString(iA), cursorB2.getString(1));
                        if (android.text.TextUtils.isEmpty(strG)) {
                            i = iA;
                        } else {
                            long j3 = cursorB2.getLong(2);
                            long j4 = epochMilli - j3;
                            i = iA;
                            if (j4 >= 0) {
                                int i9 = cursorB2.getInt(3);
                                double dC = 0.0d;
                                if (i9 == 1) {
                                    map = acaVar2;
                                    defpackage.uqp.i(j4, map, strG, j3);
                                    str = strG;
                                } else if (i9 != 2) {
                                    if (i9 == 3 && z2) {
                                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
                                        if (j4 < 86400000 && (!acaVar2.containsKey(strG) || ((java.lang.Long) acaVar2.get(strG)).longValue() <= j3)) {
                                            double d = ((defpackage.uqo) obj6).a ? 1.0d - (((defpackage.uqp) obj5).d() / 2.0d) : 1.0d;
                                            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.DAYS;
                                            dC = ((d * (1.0d - (j4 / 8.64E7d))) / ((double) (i8 + 1))) + 0.0d;
                                        }
                                    }
                                    map = acaVar2;
                                    str = strG;
                                } else {
                                    map = acaVar2;
                                    defpackage.uqp.i(j4, map, strG, j3);
                                    int i10 = i8 + 1;
                                    dC = defpackage.uqp.c(i8, (defpackage.uqo) obj6);
                                    if (((defpackage.uqo) obj6).a) {
                                        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MINUTES;
                                        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.DAYS;
                                        double d2 = ((j4 / 60000) % 1440) / 60.0d;
                                        dC *= (1.0d - ((defpackage.uqp) obj5).d()) + ((1.0d / (java.lang.Math.exp(java.lang.Math.min(d2, 24.0d - d2) - 4.0d) + 1.0d)) * ((defpackage.uqp) obj5).d());
                                    }
                                    i8 = i10;
                                    str = strG;
                                }
                                defpackage.uqp.h(acaVar, str, dC);
                                acaVar2 = map;
                            } else if (cursorB2.getInt(3) == 2) {
                                defpackage.uqp.h(acaVar, strG, defpackage.uqp.c(i8, (defpackage.uqo) obj6));
                                i8++;
                            }
                            iA = i;
                        }
                        map = acaVar2;
                        acaVar2 = map;
                        iA = i;
                        break;
                    }
                    cursorB2.close();
                    return acaVar;
                } catch (java.lang.Throwable th10) {
                    try {
                        cursorB2.close();
                        throw th10;
                    } catch (java.lang.Throwable th11) {
                        th10.addSuppressed(th11);
                        throw th10;
                    }
                }
            default:
                ?? r1 = this.b;
                ?? r0 = this.a;
                aimz aimzVar2 = defpackage.uqp.a;
                return afsq.bX((ajcq) r0, (ajcq) r1);
        }
    }

    public /* synthetic */ syg(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
