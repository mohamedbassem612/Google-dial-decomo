package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class shq {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/patrick/impl/storage/PatrickCp2Storage");
    private final defpackage.ojo b;

    public shq(defpackage.ojo ojoVar) {
        if (ojoVar == null) {
            defpackage.aooh.i("contentResolver");
        }
        this.b = ojoVar;
    }

    private static final defpackage.rsr h() {
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("mimetype").aI("=", "vnd.android.cursor.item/calling_card"));
        rsrVar.aC(new defpackage.kaw("is_primary").aI("=", "1"));
        return rsrVar.aB();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object a(long j, defpackage.aoln aolnVar) throws java.io.IOException {
        shi shiVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof shi) {
            shiVar = (shi) aolnVar;
            int i = shiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shiVar.c = i - Integer.MIN_VALUE;
            } else {
                shiVar = new shi(this, aolnVar);
            }
        } else {
            shiVar = new shi(this, aolnVar);
        }
        java.lang.Object obj = shiVar.a;
        java.lang.Object num = defpackage.aolu.a;
        int i2 = shiVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(shiVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(791, "PatrickCp2Storage_delete");
            try {
                defpackage.rsr rsrVar = new defpackage.rsr();
                rsrVar.aC(new defpackage.kaw("raw_contact_id").aI("=", new java.lang.Long(j)));
                rsrVar.aC(new defpackage.kaw("mimetype").aI("=", "vnd.android.cursor.item/calling_card"));
                defpackage.rsr rsrVarAB = rsrVar.aB();
                defpackage.ojo ojoVar = this.b;
                android.net.Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
                defpackage.aooh.e(uri, "CONTENT_URI");
                defpackage.ajcq ajcqVarE = ojoVar.e(uri, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a);
                shiVar.d = ahoqVarZ;
                shiVar.c = 1;
                java.lang.Object objD = defpackage.aosv.D(ajcqVarE, shiVar);
                if (objD != num) {
                    obj = objD;
                    ahoqVar = ahoqVarZ;
                }
                return num;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = shiVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        num = new java.lang.Integer(((java.lang.Number) obj).intValue());
        defpackage.ajsz.ak(ahoqVar, null);
        return num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object b(long j, defpackage.aoln aolnVar) throws java.io.IOException {
        shj shjVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof shj) {
            shjVar = (shj) aolnVar;
            int i = shjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shjVar.c = i - Integer.MIN_VALUE;
            } else {
                shjVar = new shj(this, aolnVar);
            }
        } else {
            shjVar = new shj(this, aolnVar);
        }
        java.lang.Object obj = shjVar.a;
        java.lang.Object num = defpackage.aolu.a;
        int i2 = shjVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(shjVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(792, "PatrickCp2Storage_deleteByContact");
            try {
                defpackage.rsr rsrVar = new defpackage.rsr();
                rsrVar.aC(new defpackage.kaw("contact_id").aI("=", new java.lang.Long(j)));
                rsrVar.aC(new defpackage.kaw("mimetype").aI("=", "vnd.android.cursor.item/calling_card"));
                defpackage.rsr rsrVarAB = rsrVar.aB();
                defpackage.ojo ojoVar = this.b;
                android.net.Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
                defpackage.aooh.e(uri, "CONTENT_URI");
                defpackage.ajcq ajcqVarE = ojoVar.e(uri, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a);
                shjVar.d = ahoqVarZ;
                shjVar.c = 1;
                java.lang.Object objD = defpackage.aosv.D(ajcqVarE, shjVar);
                if (objD != num) {
                    obj = objD;
                    ahoqVar = ahoqVarZ;
                }
                return num;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = shjVar.d;
        try {
            defpackage.aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        num = new java.lang.Integer(((java.lang.Number) obj).intValue());
        defpackage.ajsz.ak(ahoqVar, null);
        return num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.io.IOException {
        shk shkVar;
        java.lang.Throwable th;
        ?? r14;
        java.lang.RuntimeException runtimeException;
        defpackage.ahoq ahoqVar;
        java.lang.Object obj;
        if (aolnVar instanceof shk) {
            shkVar = (shk) aolnVar;
            int i = shkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shkVar.c = i - Integer.MIN_VALUE;
            } else {
                shkVar = new shk(this, aolnVar);
            }
        } else {
            shkVar = new shk(this, aolnVar);
        }
        shk shkVar2 = shkVar;
        java.lang.Object obj2 = shkVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = shkVar2.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj2);
                if (!defpackage.ahvr.R(shkVar2.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(793, "PatrickCp2Storage_fetchContactsWithPatrickData");
                try {
                    defpackage.rsr rsrVarH = h();
                    try {
                        defpackage.ojo ojoVar = this.b;
                        android.net.Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
                        defpackage.aooh.e(uri, "CONTENT_URI");
                        java.lang.Object obj3 = rsrVarH.b;
                        java.lang.Object obj4 = rsrVarH.a;
                        shl shlVar = shl.a;
                        shkVar2.d = ahoqVarZ;
                        shkVar2.c = 1;
                        java.lang.Object objI = ojoVar.i(uri, new java.lang.String[]{"raw_contact_id", "display_name", "photo_uri", "data1", "lookup"}, (java.lang.String) obj3, (java.lang.String[]) obj4, "display_name ASC, is_super_primary DESC", shlVar, shkVar2);
                        obj = aoluVar;
                        if (objI != aoluVar) {
                            obj2 = objI;
                            ahoqVar = ahoqVarZ;
                        }
                        return obj;
                    } catch (java.lang.RuntimeException e) {
                        runtimeException = e;
                        ((defpackage.aimw) ((defpackage.aimw) a.d()).k(runtimeException).l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchContactsWithPatrickData$<anonymous>", 238, "PatrickCp2Storage.kt")).v("fetchPatrickIdForContact failed");
                        throw runtimeException;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r14 = ahoqVarZ;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        defpackage.ajsz.ak(r14, th);
                        throw th3;
                    }
                }
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = shkVar2.d;
            try {
                defpackage.aooc.af(obj2);
            } catch (java.lang.RuntimeException e2) {
                runtimeException = e2;
                ((defpackage.aimw) ((defpackage.aimw) a.d()).k(runtimeException).l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchContactsWithPatrickData$<anonymous>", 238, "PatrickCp2Storage.kt")).v("fetchPatrickIdForContact failed");
                throw runtimeException;
            }
            defpackage.aify aifyVar = (defpackage.aify) obj2;
            ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchContactsWithPatrickData$<anonymous>", 241, "PatrickCp2Storage.kt")).w("Found %d raw contacts in CP2 with CallingCard data", aifyVar.size());
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj5 : aifyVar) {
                if (hashSet.add(new java.lang.Long(((sib) obj5).a))) {
                    arrayList.add(obj5);
                }
            }
            defpackage.ajsz.ak(ahoqVar, null);
            obj = arrayList;
            return obj;
        } catch (java.lang.Throwable th4) {
            th = th4;
            this = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:12:0x0032, B:25:0x00ad, B:26:0x00af, B:28:0x00b6, B:29:0x00cb, B:37:0x00db, B:38:0x00f4), top: B:47:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:12:0x0032, B:25:0x00ad, B:26:0x00af, B:28:0x00b6, B:29:0x00cb, B:37:0x00db, B:38:0x00f4), top: B:47:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object d(long j, defpackage.aoln aolnVar) throws java.io.IOException {
        shm shmVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        long j2;
        defpackage.aify aifyVar;
        if (aolnVar instanceof shm) {
            shmVar = (shm) aolnVar;
            int i = shmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                shmVar.d = i - Integer.MIN_VALUE;
            } else {
                shmVar = new shm(this, aolnVar);
            }
        } else {
            shmVar = new shm(this, aolnVar);
        }
        shm shmVar2 = shmVar;
        java.lang.Object objI = shmVar2.b;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = shmVar2.d;
        if (i2 == 0) {
            defpackage.aooc.af(objI);
            if (!defpackage.ahvr.R(shmVar2.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(794, "PatrickCp2Storage_fetchPatrickIdForContact");
            try {
                defpackage.rsr rsrVar = new defpackage.rsr(new defpackage.kaw("contact_id").aI("=", java.lang.Long.valueOf(j)));
                rsrVar.aC(h());
                defpackage.rsr rsrVarAB = rsrVar.aB();
                try {
                    defpackage.ojo ojoVar = this.b;
                    android.net.Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
                    defpackage.aooh.e(uri, "CONTENT_URI");
                    java.lang.Object obj2 = rsrVarAB.b;
                    java.lang.Object obj3 = rsrVarAB.a;
                    bbb bbbVar = bbb.n;
                    shmVar2.e = ahoqVarZ;
                    j2 = j;
                    shmVar2.a = j2;
                    shmVar2.d = 1;
                    objI = ojoVar.i(uri, new java.lang.String[]{"data1"}, (java.lang.String) obj2, (java.lang.String[]) obj3, "is_super_primary DESC", bbbVar, shmVar2);
                    if (objI != obj) {
                        ahoqVar = ahoqVarZ;
                        aifyVar = (defpackage.aify) objI;
                        if (aifyVar.isEmpty()) {
                            ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForContact$<anonymous>", 99, "PatrickCp2Storage.kt")).x("No Calling Card Data entry found for the provided contact id: %d", j2);
                            obj = null;
                        } else {
                            obj = (java.lang.Long) defpackage.ajsz.bE(aifyVar);
                        }
                        defpackage.ajsz.ak(ahoqVar, null);
                    }
                } catch (java.lang.RuntimeException e) {
                    e = e;
                    ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForContact$<anonymous>", 93, "PatrickCp2Storage.kt")).v("fetchCallingCardDataIdForContact failed");
                    throw e;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = shmVar2.a;
            ahoqVar = shmVar2.e;
            try {
                try {
                    defpackage.aooc.af(objI);
                    j2 = j3;
                    aifyVar = (defpackage.aify) objI;
                    if (aifyVar.isEmpty()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForContact$<anonymous>", 99, "PatrickCp2Storage.kt")).x("No Calling Card Data entry found for the provided contact id: %d", j2);
                        obj = null;
                    } else {
                        obj = (java.lang.Long) defpackage.ajsz.bE(aifyVar);
                    }
                    defpackage.ajsz.ak(ahoqVar, null);
                } catch (java.lang.RuntimeException e2) {
                    e = e2;
                    ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForContact$<anonymous>", 93, "PatrickCp2Storage.kt")).v("fetchCallingCardDataIdForContact failed");
                    throw e;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th4;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:12:0x0032, B:25:0x00ad, B:26:0x00af, B:28:0x00b6, B:29:0x00cb, B:37:0x00db, B:38:0x00f4), top: B:47:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:12:0x0032, B:25:0x00ad, B:26:0x00af, B:28:0x00b6, B:29:0x00cb, B:37:0x00db, B:38:0x00f4), top: B:47:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object e(long j, defpackage.aoln aolnVar) throws java.io.IOException {
        shn shnVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        long j2;
        defpackage.aify aifyVar;
        if (aolnVar instanceof shn) {
            shnVar = (shn) aolnVar;
            int i = shnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                shnVar.d = i - Integer.MIN_VALUE;
            } else {
                shnVar = new shn(this, aolnVar);
            }
        } else {
            shnVar = new shn(this, aolnVar);
        }
        shn shnVar2 = shnVar;
        java.lang.Object objI = shnVar2.b;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = shnVar2.d;
        if (i2 == 0) {
            defpackage.aooc.af(objI);
            if (!defpackage.ahvr.R(shnVar2.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(795, "PatrickCp2Storage_fetchPatrickIdForRawContact");
            try {
                defpackage.rsr rsrVar = new defpackage.rsr(new defpackage.kaw("raw_contact_id").aI("=", java.lang.Long.valueOf(j)));
                rsrVar.aC(h());
                defpackage.rsr rsrVarAB = rsrVar.aB();
                try {
                    defpackage.ojo ojoVar = this.b;
                    android.net.Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
                    defpackage.aooh.e(uri, "CONTENT_URI");
                    java.lang.Object obj2 = rsrVarAB.b;
                    java.lang.Object obj3 = rsrVarAB.a;
                    bbb bbbVar = bbb.o;
                    shnVar2.e = ahoqVarZ;
                    j2 = j;
                    shnVar2.a = j2;
                    shnVar2.d = 1;
                    objI = ojoVar.i(uri, new java.lang.String[]{"data1"}, (java.lang.String) obj2, (java.lang.String[]) obj3, "is_super_primary DESC", bbbVar, shnVar2);
                    if (objI != obj) {
                        ahoqVar = ahoqVarZ;
                        aifyVar = (defpackage.aify) objI;
                        if (aifyVar.isEmpty()) {
                            ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForRawContact$<anonymous>", 130, "PatrickCp2Storage.kt")).x("No Calling Card Data entry found for raw contact id: %d", j2);
                            obj = null;
                        } else {
                            obj = (java.lang.Long) defpackage.ajsz.bE(aifyVar);
                        }
                        defpackage.ajsz.ak(ahoqVar, null);
                    }
                } catch (java.lang.RuntimeException e) {
                    e = e;
                    ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForRawContact$<anonymous>", 126, "PatrickCp2Storage.kt")).v("fetchCallingCardDataIdForContact failed");
                    throw e;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = shnVar2.a;
            ahoqVar = shnVar2.e;
            try {
                try {
                    defpackage.aooc.af(objI);
                    j2 = j3;
                    aifyVar = (defpackage.aify) objI;
                    if (aifyVar.isEmpty()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForRawContact$<anonymous>", 130, "PatrickCp2Storage.kt")).x("No Calling Card Data entry found for raw contact id: %d", j2);
                        obj = null;
                    } else {
                        obj = (java.lang.Long) defpackage.ajsz.bE(aifyVar);
                    }
                    defpackage.ajsz.ak(ahoqVar, null);
                } catch (java.lang.RuntimeException e2) {
                    e = e2;
                    ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForRawContact$<anonymous>", 126, "PatrickCp2Storage.kt")).v("fetchCallingCardDataIdForContact failed");
                    throw e;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th4;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final java.lang.Object f(android.net.Uri uri, defpackage.aoln aolnVar) throws java.io.IOException {
        sho shoVar;
        java.lang.Throwable th;
        ?? r13;
        java.lang.RuntimeException runtimeException;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof sho) {
            shoVar = (sho) aolnVar;
            int i = shoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shoVar.c = i - Integer.MIN_VALUE;
            } else {
                shoVar = new sho(this, aolnVar);
            }
        } else {
            shoVar = new sho(this, aolnVar);
        }
        sho shoVar2 = shoVar;
        java.lang.Object obj = shoVar2.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = shoVar2.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                if (!defpackage.ahvr.R(shoVar2.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(796, "PatrickCp2Storage_fetchPatrickIdForRawContact");
                try {
                    defpackage.rsr rsrVarH = h();
                    try {
                        java.lang.Object obj3 = rsrVarH.b;
                        java.lang.Object obj4 = rsrVarH.a;
                        bbb bbbVar = bbb.p;
                        shoVar2.d = ahoqVarZ;
                        shoVar2.c = 1;
                        java.lang.Object objI = this.b.i(uri, new java.lang.String[]{"data1"}, (java.lang.String) obj3, (java.lang.String[]) obj4, "is_super_primary DESC", bbbVar, shoVar2);
                        if (objI != obj2) {
                            obj = objI;
                            ahoqVar = ahoqVarZ;
                        }
                        return obj2;
                    } catch (java.lang.RuntimeException e) {
                        runtimeException = e;
                        ((defpackage.aimw) ((defpackage.aimw) a.d()).k(runtimeException).l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForRawContact$<anonymous>", 158, "PatrickCp2Storage.kt")).v("fetchCallingCardDataIdForRawContact failed");
                        throw runtimeException;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r13 = ahoqVarZ;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        defpackage.ajsz.ak(r13, th);
                        throw th3;
                    }
                }
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = shoVar2.d;
            try {
                defpackage.aooc.af(obj);
            } catch (java.lang.RuntimeException e2) {
                runtimeException = e2;
                ((defpackage.aimw) ((defpackage.aimw) a.d()).k(runtimeException).l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForRawContact$<anonymous>", 158, "PatrickCp2Storage.kt")).v("fetchCallingCardDataIdForRawContact failed");
                throw runtimeException;
            }
            defpackage.aify aifyVar = (defpackage.aify) obj;
            if (aifyVar.isEmpty()) {
                ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "fetchPatrickIdForRawContact$<anonymous>", 162, "PatrickCp2Storage.kt")).v("No Calling Card entry found for the provided Uri");
                obj2 = null;
            } else {
                obj2 = (java.lang.Long) defpackage.ajsz.bE(aifyVar);
            }
            defpackage.ajsz.ak(ahoqVar, null);
            return obj2;
        } catch (java.lang.Throwable th4) {
            th = th4;
            this = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x017a  */
    /* JADX WARN: Code duplicated, block: B:38:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final java.lang.Object g(long j, long j2, defpackage.aoln aolnVar) throws java.io.IOException {
        shp shpVar;
        defpackage.ahoq ahoqVarZ;
        java.lang.Object objD;
        defpackage.aolu aoluVar;
        boolean z;
        java.lang.Object objG;
        defpackage.ahoq ahoqVar;
        boolean z2;
        java.lang.Throwable th;
        long j3 = j;
        long j4 = j2;
        if (aolnVar instanceof shp) {
            shpVar = (shp) aolnVar;
            int i = shpVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                shpVar.e = i - Integer.MIN_VALUE;
            } else {
                shpVar = new shp(this, aolnVar);
            }
        } else {
            shpVar = new shp(this, aolnVar);
        }
        java.lang.Object obj = shpVar.c;
        defpackage.aolu aoluVar2 = defpackage.aolu.a;
        int i2 = shpVar.e;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(shpVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoqVarZ = defpackage.ahvr.Z(797, "PatrickCp2Storage_upsert");
            try {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                shp shpVar2 = shpVar;
                contentValues.put("data1", new java.lang.Long(j4));
                contentValues.put("is_super_primary", new java.lang.Integer(1));
                contentValues.put("is_primary", new java.lang.Integer(1));
                defpackage.rsr rsrVar = new defpackage.rsr();
                rsrVar.aC(new defpackage.kaw("raw_contact_id").aI("=", new java.lang.Long(j3)));
                rsrVar.aC(new defpackage.kaw("mimetype").aI("=", "vnd.android.cursor.item/calling_card"));
                defpackage.rsr rsrVarAB = rsrVar.aB();
                defpackage.ojo ojoVar = this.b;
                android.net.Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
                defpackage.aooh.e(uri, "CONTENT_URI");
                defpackage.ajcq ajcqVarF = ojoVar.f(uri, contentValues, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a);
                shpVar = shpVar2;
                shpVar.f = ahoqVarZ;
                shpVar.a = j3;
                shpVar.b = j4;
                shpVar.e = 1;
                objD = defpackage.aosv.D(ajcqVarF, shpVar);
                aoluVar = aoluVar2;
                if (objD != aoluVar) {
                }
                return aoluVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = shpVar.f;
            try {
                defpackage.aooc.af(obj);
                objG = obj;
                z = true;
                if (objG != null) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                defpackage.ajsz.ak(ahoqVar, null);
                return boolValueOf;
            } catch (java.lang.Throwable th3) {
                th = th3;
                ahoqVarZ = ahoqVar;
                th = th;
                try {
                    throw th;
                } catch (java.lang.Throwable th4) {
                    defpackage.ajsz.ak(ahoqVarZ, th);
                    throw th4;
                }
            }
        }
        long j5 = shpVar.b;
        long j6 = shpVar.a;
        defpackage.ahoq ahoqVar2 = shpVar.f;
        try {
            defpackage.aooc.af(obj);
            j4 = j5;
            j3 = j6;
            ahoqVarZ = ahoqVar2;
            aoluVar = aoluVar2;
            objD = obj;
        } catch (java.lang.Throwable th5) {
            th = th5;
            ahoqVarZ = ahoqVar2;
            throw th;
        }
        if (((java.lang.Number) objD).intValue() <= 0) {
            defpackage.aolu aoluVar3 = aoluVar;
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            shp shpVar3 = shpVar;
            contentValues2.put("raw_contact_id", new java.lang.Long(j3));
            contentValues2.put("mimetype", "vnd.android.cursor.item/calling_card");
            z = true;
            contentValues2.put("is_super_primary", new java.lang.Integer(1));
            contentValues2.put("is_primary", new java.lang.Integer(1));
            contentValues2.put("data1", new java.lang.Long(j4));
            ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "upsert$<anonymous>", 68, "PatrickCp2Storage.kt")).x("Creating a new entry for raw contact ID: %d", j3);
            defpackage.ojo ojoVar2 = this.b;
            android.net.Uri uri2 = android.provider.ContactsContract.Data.CONTENT_URI;
            defpackage.aooh.e(uri2, "CONTENT_URI");
            shpVar3.f = ahoqVarZ;
            shpVar3.e = 2;
            objG = ojoVar2.g(uri2, contentValues2, shpVar3);
            aoluVar = aoluVar3;
            if (objG != aoluVar) {
                ahoqVar = ahoqVarZ;
                if (objG != null) {
                    z2 = z;
                } else {
                    z2 = false;
                }
            }
            return aoluVar;
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/patrick/impl/storage/PatrickCp2Storage", "upsert$<anonymous>", 56, "PatrickCp2Storage.kt")).x("Data entry for raw contact with ID %d updated", j3);
        ahoqVar = ahoqVarZ;
        z2 = true;
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z2);
        defpackage.ajsz.ak(ahoqVar, null);
        return boolValueOf2;
    }
}
