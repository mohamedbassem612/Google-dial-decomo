package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lvx implements defpackage.tem {
    public static final aimz a = aimz.i("com/android/dialer/contactsearch/ContactSearchDataSource");
    private final thu b;
    private final aoss c;
    private final rlv d;
    private final tek e;
    private tei f;
    private final aoxh g;
    private final apdp h;

    public lvx(thu thuVar, ojo ojoVar, aoss aossVar, aazc aazcVar, rlv rlvVar) {
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aazcVar, "clock");
        aooh.f(rlvVar, "loggingBindings");
        this.b = thuVar;
        this.c = aossVar;
        this.d = rlvVar;
        this.e = tek.b;
        this.h = new apdp();
        android.net.Uri uri = android.provider.ContactsContract.Contacts.CONTENT_URI;
        aooh.e(uri, "CONTENT_URI");
        this.g = aoov.at(new gdc(ojoVar.k(uri), new defpackage.ill((aoln) null, 2, (char[]) null), 8), aossVar, new aozg(5000L, Long.MAX_VALUE));
    }

    @Override // defpackage.tem
    public final tek a() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0116 A[Catch: all -> 0x0186, TryCatch #1 {all -> 0x0186, blocks: (B:53:0x010e, B:55:0x0116, B:58:0x013f), top: B:87:0x010e, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c A[Catch: Exception -> 0x01a2, LOOP:0: B:60:0x0166->B:62:0x016c, LOOP_END, TryCatch #4 {Exception -> 0x01a2, blocks: (B:14:0x0040, B:59:0x0151, B:60:0x0166, B:62:0x016c, B:63:0x0180, B:65:0x0187, B:66:0x018a, B:50:0x00ea, B:73:0x0193, B:74:0x0196, B:25:0x007b, B:27:0x0083, B:32:0x0090, B:34:0x0095, B:36:0x00a1, B:75:0x0197, B:76:0x019e, B:33:0x0093, B:77:0x019f, B:71:0x0191, B:53:0x010e, B:55:0x0116, B:58:0x013f), top: B:89:0x0028, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    public final java.lang.Object b(tei teiVar, aoln aolnVar) throws java.lang.Exception {
        defpackage.lvw lvwVar;
        java.lang.Throwable th;
        ?? r5;
        long jElapsedRealtime;
        int i;
        amrg amrgVar;
        java.io.Closeable closeable;
        thv thvVar;
        int i2;
        aike aikeVar;
        tei teiVar2;
        long j;
        amrg amrgVar2;
        apdp apdpVar;
        java.util.ArrayList arrayList;
        ailk ailkVarY;
        tei teiVar3 = teiVar;
        if (aolnVar instanceof defpackage.lvw) {
            lvwVar = (defpackage.lvw) aolnVar;
            int i3 = lvwVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lvwVar.f = i3 - Integer.MIN_VALUE;
            } else {
                lvwVar = new defpackage.lvw(this, aolnVar);
            }
        } else {
            lvwVar = new defpackage.lvw(this, aolnVar);
        }
        java.lang.Object objD = lvwVar.d;
        tgl tglVar = aolu.a;
        int i4 = lvwVar.f;
        try {
            try {
                if (i4 == 0) {
                    aooc.af(objD);
                    java.lang.String str = teiVar3.a;
                    if (str.length() == 0) {
                        return tgj.a;
                    }
                    jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    int i5 = teiVar3.c;
                    i = i5 == 2 ? 1 : 0;
                    amrg amrgVar3 = i != 0 ? amrg.b : amrg.c;
                    if (!ahvr.R(lvwVar.u())) {
                        throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                    }
                    java.io.Closeable closeableZ = ahvr.Z(321, "ContactSearchDataSource_performSearch");
                    int i6 = i5 - 1;
                    try {
                        thu thuVar = this.b;
                        if (i6 != 0) {
                            ajcq ajcqVarB = thuVar.b(str);
                            lvwVar.g = teiVar3;
                            lvwVar.h = amrgVar3;
                            lvwVar.a = closeableZ;
                            lvwVar.b = jElapsedRealtime;
                            lvwVar.c = i;
                            lvwVar.f = 2;
                            objD = aosv.D(ajcqVarB, lvwVar);
                            if (objD != tglVar) {
                                amrgVar = amrgVar3;
                                closeable = closeableZ;
                                thvVar = (thv) objD;
                            }
                        } else {
                            ajcq ajcqVarA = thuVar.a(str);
                            lvwVar.g = teiVar3;
                            lvwVar.h = amrgVar3;
                            lvwVar.a = closeableZ;
                            lvwVar.b = jElapsedRealtime;
                            lvwVar.c = i;
                            lvwVar.f = 1;
                            objD = aosv.D(ajcqVarA, lvwVar);
                            if (objD != tglVar) {
                                amrgVar = amrgVar3;
                                closeable = closeableZ;
                                thvVar = (thv) objD;
                            }
                        }
                        return tglVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r5 = closeableZ;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            ajsz.ak((java.io.Closeable) r5, th);
                            throw th3;
                        }
                    }
                }
                if (i4 == 1) {
                    int i7 = lvwVar.c;
                    jElapsedRealtime = lvwVar.b;
                    closeable = (java.io.Closeable) lvwVar.a;
                    amrgVar = lvwVar.h;
                    tei teiVar4 = lvwVar.g;
                    aooc.af(objD);
                    i = i7;
                    teiVar3 = teiVar4;
                    thvVar = (thv) objD;
                } else if (i4 == 2) {
                    int i8 = lvwVar.c;
                    jElapsedRealtime = lvwVar.b;
                    closeable = (java.io.Closeable) lvwVar.a;
                    amrgVar = lvwVar.h;
                    tei teiVar5 = lvwVar.g;
                    aooc.af(objD);
                    i = i8;
                    teiVar3 = teiVar5;
                    thvVar = (thv) objD;
                } else {
                    if (i4 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = lvwVar.c;
                    j = lvwVar.b;
                    apdpVar = lvwVar.j;
                    aikeVar = lvwVar.i;
                    amrgVar2 = lvwVar.h;
                    teiVar2 = lvwVar.g;
                    aooc.af(objD);
                }
                try {
                    if (!aooh.n(teiVar2, this.f)) {
                        this.f = teiVar2;
                        vqu vquVarK = akky.K(amrh.a.m());
                        vquVarK.aq((int) (android.os.SystemClock.elapsedRealtime() - j));
                        vquVarK.ar(teiVar2.a.length());
                        vquVarK.as(aikeVar.d);
                        vquVarK.au(1 == i2);
                        vquVarK.at(amrgVar2);
                        vquVarK.av();
                        this.d.s(vquVarK.ap());
                    }
                    apdpVar.d();
                    aooh.c(aikeVar);
                    arrayList = new java.util.ArrayList(ajsz.bl(aikeVar, 10));
                    ailkVarY = aikeVar.y(0);
                    while (ailkVarY.hasNext()) {
                        tin tinVar = (tin) ailkVarY.next();
                        aooh.f(tinVar, "cp2PhoneEntry");
                        arrayList.add(new defpackage.lxb(tinVar));
                    }
                    tglVar = new tgl(arrayList);
                    return tglVar;
                } catch (java.lang.Throwable th4) {
                    apdpVar.d();
                    throw th4;
                }
                java.io.Closeable closeable2 = closeable;
                tei teiVar6 = teiVar3;
                i2 = i;
                amrg amrgVar4 = amrgVar;
                ajsz.ak(closeable2, (java.lang.Throwable) null);
                aikeVar = thvVar.a;
                apdp apdpVar2 = this.h;
                lvwVar.g = teiVar6;
                lvwVar.h = amrgVar4;
                lvwVar.a = thvVar;
                lvwVar.i = aikeVar;
                lvwVar.j = apdpVar2;
                lvwVar.b = jElapsedRealtime;
                lvwVar.c = i2;
                lvwVar.f = 3;
                if (apdpVar2.b(lvwVar) != tglVar) {
                    teiVar2 = teiVar6;
                    j = jElapsedRealtime;
                    amrgVar2 = amrgVar4;
                    apdpVar = apdpVar2;
                    if (!aooh.n(teiVar2, this.f)) {
                        this.f = teiVar2;
                        vqu vquVarK2 = akky.K(amrh.a.m());
                        vquVarK2.aq((int) (android.os.SystemClock.elapsedRealtime() - j));
                        vquVarK2.ar(teiVar2.a.length());
                        vquVarK2.as(aikeVar.d);
                        vquVarK2.au(1 == i2);
                        vquVarK2.at(amrgVar2);
                        vquVarK2.av();
                        this.d.s(vquVarK2.ap());
                    }
                    apdpVar.d();
                    aooh.c(aikeVar);
                    arrayList = new java.util.ArrayList(ajsz.bl(aikeVar, 10));
                    ailkVarY = aikeVar.y(0);
                    while (ailkVarY.hasNext()) {
                        tin tinVar2 = (tin) ailkVarY.next();
                        aooh.f(tinVar2, "cp2PhoneEntry");
                        arrayList.add(new defpackage.lxb(tinVar2));
                    }
                    tglVar = new tgl(arrayList);
                }
                return tglVar;
            } catch (java.lang.Throwable th5) {
                th = th5;
                r5 = i4;
            }
        } catch (java.lang.Exception e) {
            if (e instanceof java.util.concurrent.CancellationException) {
                throw e;
            }
            a.d().k(e).l("com/android/dialer/contactsearch/ContactSearchDataSource", "performSearch", 129, "ContactsSearchDataSource.kt").v("Failed to obtain contacts");
            return new tgi(e);
        }
    }

    @Override // defpackage.tem
    public final aoxh c(tei teiVar) {
        aooh.f(teiVar, "query");
        return aoyc.a(this.g, new defpackage.kqd(this, teiVar, (aoln) null, 10));
    }
}
