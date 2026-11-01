package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uex {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/inapp/SpamDatabaseUtils");
    public final defpackage.ueu b;
    public final defpackage.rlv c;
    public final defpackage.ajct d;
    public final defpackage.ajct e;
    public final defpackage.uft f;
    public final defpackage.ugs g;
    public final defpackage.tvn h;
    public final defpackage.aogc i;
    private final android.content.Context j;
    private final defpackage.aaiz k;
    private final defpackage.oko l;
    private final defpackage.uhs m;

    public uex(defpackage.ueu ueuVar, defpackage.uhs uhsVar, defpackage.aogc aogcVar, defpackage.rlv rlvVar, android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aaiz aaizVar, defpackage.oko okoVar, defpackage.uft uftVar, defpackage.ugs ugsVar, defpackage.tvn tvnVar) {
        this.b = ueuVar;
        this.m = uhsVar;
        this.i = aogcVar;
        this.c = rlvVar;
        this.j = context;
        this.d = ajctVar;
        this.e = ajctVar2;
        this.k = aaizVar;
        this.l = okoVar;
        this.f = uftVar;
        this.g = ugsVar;
        this.h = tvnVar;
    }

    public static defpackage.udj b(int i) {
        if (i == 0) {
            return defpackage.udj.SPAM_STATUS_NOT_SPAM;
        }
        if (i == 1) {
            return defpackage.udj.SPAM_STATUS_SPAM;
        }
        if (i == 2) {
            return defpackage.udj.DOBBY_DO_NOT_SCREEN;
        }
        if (i == 3) {
            return defpackage.udj.SPAM_STATUS_UNKNOWN;
        }
        throw new java.lang.UnsupportedOperationException(defpackage.a.bj(i, "unsupported status: "));
    }

    public static int e(int i) {
        int i2 = i - 2;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        throw new java.lang.UnsupportedOperationException("unrecognized verdict");
    }

    public final android.database.Cursor a(java.util.Collection collection) {
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("number").aF(collection));
        defpackage.rsr rsrVarAB = rsrVar.aB();
        java.lang.Object obj = rsrVarAB.b;
        java.lang.String[] strArr = (java.lang.String[]) rsrVarAB.a;
        return this.b.f("client_spam_table", null, (java.lang.String) obj, strArr);
    }

    public final defpackage.aigf c(java.util.List list) {
        defpackage.aigf aigfVarE;
        android.database.Cursor cursorA = a(list);
        try {
            if (cursorA == null) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getUserSpamListStatus", 381, "SpamDatabaseUtils.java")).v("null cursor returned");
                return defpackage.aikj.b;
            }
            if (cursorA.moveToFirst()) {
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("number");
                int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("spam_status");
                int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("created");
                int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("client_meta_data");
                do {
                    java.lang.String string = cursorA.getString(columnIndexOrThrow);
                    defpackage.ahvr.bY(!cursorA.isNull(columnIndexOrThrow3));
                    long j = cursorA.getLong(columnIndexOrThrow3);
                    uei ueiVar = uei.a;
                    try {
                        if (cursorA.getBlob(columnIndexOrThrow4) != null) {
                            ueiVar = (uei) defpackage.alad.B(ueiVar, cursorA.getBlob(columnIndexOrThrow4), defpackage.akzq.a());
                        }
                    } catch (defpackage.alaz e) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getUserSpamListStatus", 413, "SpamDatabaseUtils.java")).v("Invalid ClientMetaData protobuf.");
                    }
                    int i = cursorA.getInt(columnIndexOrThrow2);
                    defpackage.akzx akzxVarM = defpackage.udm.a.m();
                    defpackage.udj udjVarB = b(i);
                    akzxVarM.u();
                    defpackage.udm udmVar = (defpackage.udm) akzxVarM.b;
                    udmVar.d = udjVarB.f;
                    udmVar.b |= 2;
                    akzxVarM.u();
                    defpackage.udm udmVar2 = (defpackage.udm) akzxVarM.b;
                    udmVar2.b |= 1;
                    udmVar2.c = j;
                    int iAR = defpackage.a.aR(ueiVar.c);
                    if (iAR == 0) {
                        iAR = 1;
                    }
                    int iE = e(iAR);
                    akzxVarM.u();
                    defpackage.udm udmVar3 = (defpackage.udm) akzxVarM.b;
                    udmVar3.i = iE - 1;
                    udmVar3.b |= 128;
                    int iAR2 = defpackage.a.aR(ueiVar.d);
                    if (iAR2 == 0) {
                        iAR2 = 1;
                    }
                    int iE2 = e(iAR2);
                    akzxVarM.u();
                    defpackage.udm udmVar4 = (defpackage.udm) akzxVarM.b;
                    udmVar4.j = iE2 - 1;
                    udmVar4.b |= 256;
                    aigbVar.i(string, (defpackage.udm) akzxVarM.r());
                } while (cursorA.moveToNext());
                aigfVarE = aigbVar.e(true);
            } else {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getUserSpamListStatus", 386, "SpamDatabaseUtils.java")).v("empty cursor returned");
                aigfVarE = defpackage.aikj.b;
            }
            cursorA.close();
            return aigfVarE;
        } catch (java.lang.Throwable th) {
            if (cursorA == null) {
                throw th;
            }
            try {
                cursorA.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    public final long d(java.lang.String str, int i, aivs aivsVar) {
        uei ueiVar;
        defpackage.akzx akzxVarL;
        int i2;
        int i3;
        int iAQ;
        int iAQ2;
        int i4;
        int i5;
        int iAQ3;
        int iAQ4;
        int i6;
        int i7;
        uei ueiVarB;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("number", str);
        contentValues.put("spam_status", java.lang.Integer.valueOf(i));
        contentValues.put("created", java.lang.Long.valueOf(epochMilli));
        defpackage.rsr rsrVarAI = new defpackage.kaw("number").aI("=", str);
        try {
            android.database.Cursor cursorF = this.b.f("client_spam_table", null, (java.lang.String) rsrVarAI.b, (java.lang.String[]) rsrVarAI.a);
            try {
                if (cursorF == null) {
                    ueiVar = uei.a;
                } else {
                    if (cursorF.moveToFirst()) {
                        int columnIndex = cursorF.getColumnIndex("client_meta_data");
                        if (cursorF.getBlob(columnIndex) != null) {
                            ueiVarB = defpackage.alad.B(uei.a, cursorF.getBlob(columnIndex), defpackage.akzq.a());
                        } else {
                            cursorF.close();
                            ueiVar = uei.a;
                        }
                    } else {
                        ueiVarB = uei.a;
                    }
                    cursorF.close();
                    ueiVar = ueiVarB;
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
                ueiVar = uei.a;
                akzxVarL = ueiVar.L();
                i2 = 3;
                if ((aivsVar.b & 1) != 0) {
                    iAQ4 = defpackage.a.aQ(i5);
                    if (iAQ4 == 0) {
                        iAQ4 = 1;
                    }
                    i6 = iAQ4 - 1;
                    if (i6 != 0) {
                        i7 = 2;
                    } else if (i6 != 1) {
                        i7 = 4;
                    } else {
                        i7 = 3;
                    }
                    akzxVarL.u();
                    akzxVarL.b.c = defpackage.a.T(i7);
                }
                if ((aivsVar.b & 4) != 0) {
                    iAQ2 = defpackage.a.aQ(i3);
                    if (iAQ2 == 0) {
                        iAQ2 = 1;
                    }
                    i4 = iAQ2 - 1;
                    if (i4 != 0) {
                        i2 = 2;
                    } else if (i4 != 1) {
                        i2 = 4;
                    }
                    akzxVarL.u();
                    akzxVarL.b.d = defpackage.a.T(i2);
                }
                defpackage.ueu ueuVar = this.b;
                defpackage.alcf alcfVarE = defpackage.aldi.e(j$.time.Instant.now().toEpochMilli());
                akzxVarL.u();
                uei ueiVar2 = akzxVarL.b;
                j$.util.Objects.requireNonNull(alcfVarE);
                ueiVar2.e = alcfVarE;
                ueiVar2.b |= 1;
                contentValues.put("client_meta_data", akzxVarL.r().i());
                return ueuVar.e(contentValues);
            }
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).l("com/android/dialer/spam/inapp/SpamDatabaseUtils", "getClientMetaDataForNumber", (char) 931, "SpamDatabaseUtils.java")).v("failed to get current ClientMetaData");
        }
        akzxVarL = ueiVar.L();
        i2 = 3;
        if ((aivsVar.b & 1) != 0 && (iAQ3 = defpackage.a.aQ((i5 = aivsVar.c))) != 0 && iAQ3 != 1) {
            iAQ4 = defpackage.a.aQ(i5);
            if (iAQ4 == 0) {
                iAQ4 = 1;
            }
            i6 = iAQ4 - 1;
            if (i6 != 0) {
                i7 = 2;
            } else if (i6 != 1) {
                i7 = 4;
            } else {
                i7 = 3;
            }
            akzxVarL.u();
            akzxVarL.b.c = defpackage.a.T(i7);
        }
        if ((aivsVar.b & 4) != 0 && (iAQ = defpackage.a.aQ((i3 = aivsVar.g))) != 0 && iAQ != 1) {
            iAQ2 = defpackage.a.aQ(i3);
            if (iAQ2 == 0) {
                iAQ2 = 1;
            }
            i4 = iAQ2 - 1;
            if (i4 != 0) {
                i2 = 2;
            } else if (i4 != 1) {
                i2 = 4;
            }
            akzxVarL.u();
            akzxVarL.b.d = defpackage.a.T(i2);
        }
        defpackage.ueu ueuVar2 = this.b;
        defpackage.alcf alcfVarE2 = defpackage.aldi.e(j$.time.Instant.now().toEpochMilli());
        akzxVarL.u();
        uei ueiVar3 = akzxVarL.b;
        j$.util.Objects.requireNonNull(alcfVarE2);
        ueiVar3.e = alcfVarE2;
        ueiVar3.b |= 1;
        contentValues.put("client_meta_data", akzxVarL.r().i());
        return ueuVar2.e(contentValues);
    }

    public final defpackage.ajcq f(defpackage.akzx akzxVar) {
        return defpackage.ahvr.H(this.m.a(), new uev(akzxVar, 3), this.e);
    }

    public final defpackage.ajcq g(defpackage.akzx akzxVar) {
        defpackage.ajcq ajcqVarA = this.f.a(akzxVar.b.g);
        defpackage.ubc ubcVar = new defpackage.ubc(15);
        defpackage.ajct ajctVar = this.e;
        return defpackage.ahrv.g(defpackage.ahvr.H(defpackage.ahvr.H(ajcqVarA, ubcVar, ajctVar), new uev(akzxVar, 4), ajctVar)).h(new tzs(this, akzxVar, 9, (byte[]) null), this.d).h(new uev(akzxVar, 0), ajctVar);
    }

    public final void h(defpackage.akzx akzxVar) {
        java.lang.String str = akzxVar.b.g;
        defpackage.aca acaVar = new defpackage.aca();
        acaVar.put("phone_number", str);
        acaVar.put("current_global_blacklist_version ", "-1");
        java.lang.String strA = this.k.a("dialer_spam_report", acaVar);
        akzxVar.u();
        aivu aivuVar = akzxVar.b;
        j$.util.Objects.requireNonNull(strA);
        aivuVar.b |= 2;
        aivuVar.e = strA;
        akzxVar.u();
        aivu aivuVar2 = akzxVar.b;
        j$.util.Objects.requireNonNull("-1");
        aivuVar2.b |= 512;
        aivuVar2.l = "-1";
        java.lang.String strValueOf = java.lang.String.valueOf(defpackage.ueu.a(this.j));
        akzxVar.u();
        aivu aivuVar3 = akzxVar.b;
        j$.util.Objects.requireNonNull(strValueOf);
        aivuVar3.b |= 1024;
        aivuVar3.m = strValueOf;
        defpackage.akzx akzxVarM = defpackage.alcf.a.m();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j$.time.Instant.now().toEpochMilli() / 3600000);
        akzxVarM.u();
        ((defpackage.alcf) akzxVarM.b).b = seconds;
        akzxVar.u();
        aivu aivuVar4 = akzxVar.b;
        defpackage.alcf alcfVar = (defpackage.alcf) akzxVarM.r();
        j$.util.Objects.requireNonNull(alcfVar);
        aivuVar4.h = alcfVar;
        aivuVar4.b |= 16;
        defpackage.oko okoVar = this.l;
        if (okoVar.z().isPresent()) {
            java.lang.String str2 = (java.lang.String) okoVar.z().orElseThrow(new rqc(6));
            akzxVar.u();
            aivu aivuVar5 = akzxVar.b;
            j$.util.Objects.requireNonNull(str2);
            aivuVar5.b |= 128;
            aivuVar5.j = str2;
        }
        if (okoVar.x().isPresent()) {
            java.lang.String str3 = (java.lang.String) okoVar.x().orElseThrow(new rqc(6));
            akzxVar.u();
            aivu aivuVar6 = akzxVar.b;
            j$.util.Objects.requireNonNull(str3);
            aivuVar6.b |= 256;
            aivuVar6.k = str3;
        }
    }
}
