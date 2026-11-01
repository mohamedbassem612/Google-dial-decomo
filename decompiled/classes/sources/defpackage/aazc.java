package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aazc {
    private static defpackage.ahbq a;

    public aazc() {
    }

    public static synchronized defpackage.ahbq A(android.content.Context context) {
        defpackage.ahbq ahbqVar;
        ahbqVar = a;
        if (ahbqVar == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("DG");
            handlerThread.start();
            defpackage.aanh aanhVar = new defpackage.aanh(handlerThread.getLooper());
            android.content.Context applicationContext = context.getApplicationContext();
            defpackage.aajt aajtVar = new defpackage.aajt();
            defpackage.gat gatVar = new defpackage.gat(aanhVar, new defpackage.aajs(applicationContext, aanhVar.getLooper(), aajtVar, aajtVar), aajtVar);
            j$.util.Objects.requireNonNull(aanhVar);
            defpackage.ahbq ahbqVar2 = new defpackage.ahbq(gatVar, new defpackage.aajr(aanhVar, 0), new defpackage.aaju(context), defpackage.aiyy.j());
            a = ahbqVar2;
            ahbqVar = ahbqVar2;
        }
        return ahbqVar;
    }

    public static java.lang.Object B(defpackage.abwo abwoVar, afpl afplVar, defpackage.abwn abwnVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(defpackage.aour.a, new abwp(afplVar, abwoVar, abwnVar, (defpackage.aoln) null), aolnVar);
    }

    private static java.lang.Object C(defpackage.aaum aaumVar) throws java.util.concurrent.ExecutionException {
        if (aaumVar.k()) {
            return aaumVar.g();
        }
        if (aaumVar.i()) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        throw new java.util.concurrent.ExecutionException(aaumVar.f());
    }

    public static java.util.Map a(android.content.ContentResolver contentResolver, java.lang.String[] strArr, aays aaysVar) throws defpackage.aayt {
        android.net.Uri uri = defpackage.aayn.b;
        android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new defpackage.aayt("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new defpackage.aayt("ContentProvider query returned null cursor");
                    }
                    java.util.Map mapA = aaysVar.a(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        mapA.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new defpackage.aayt("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return mapA;
                } catch (java.lang.Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th3;
            }
        } catch (android.os.RemoteException e) {
            throw new defpackage.aayt(e);
        }
    }

    public static long b() {
        return defpackage.abdt.a ? android.os.SystemClock.elapsedRealtimeNanos() : android.os.SystemClock.elapsedRealtime() * 1000000;
    }

    public static j$.time.Duration c() {
        return j$.time.Duration.ofMillis(android.os.SystemClock.uptimeMillis());
    }

    public static boolean d(android.content.Context context) {
        android.net.Uri uri = defpackage.abcn.a;
        int i = context.getApplicationInfo().uid;
        return (i == -1 || android.os.Build.FINGERPRINT.equals("robolectric") || context.checkUriPermission(defpackage.abcn.a, 0, i, 1) != 0) ? false : true;
    }

    public static defpackage.ajcq e(defpackage.aaum aaumVar) {
        final defpackage.abze abzeVar = new defpackage.abze(aaumVar);
        aaumVar.n(defpackage.ajbm.INSTANCE, new defpackage.aaug() { // from class: abzd
            @Override // defpackage.aaug
            public final void a(defpackage.aaum aaumVar2) {
                boolean z = ((defpackage.aauq) aaumVar2).c;
                defpackage.abze abzeVar2 = abzeVar;
                if (z) {
                    abzeVar2.cancel(false);
                    return;
                }
                if (aaumVar2.k()) {
                    abzeVar2.o(aaumVar2.g());
                    return;
                }
                java.lang.Exception excF = aaumVar2.f();
                if (excF == null) {
                    throw new java.lang.IllegalStateException();
                }
                abzeVar2.p(excF);
            }
        });
        return abzeVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: all -> 0x015a, TryCatch #1 {all -> 0x015a, blocks: (B:14:0x0039, B:55:0x0140, B:51:0x0121, B:53:0x0128, B:57:0x014c, B:58:0x0153, B:19:0x0058, B:46:0x0103, B:42:0x00e5, B:44:0x00eb, B:50:0x0117, B:48:0x010f, B:49:0x0116, B:22:0x0070), top: B:73:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010f A[Catch: all -> 0x015a, TryCatch #1 {all -> 0x015a, blocks: (B:14:0x0039, B:55:0x0140, B:51:0x0121, B:53:0x0128, B:57:0x014c, B:58:0x0153, B:19:0x0058, B:46:0x0103, B:42:0x00e5, B:44:0x00eb, B:50:0x0117, B:48:0x010f, B:49:0x0116, B:22:0x0070), top: B:73:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9, types: [abwx, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b8 -> B:71:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0101 -> B:46:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013e -> B:55:0x0140). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object f(defpackage.abwx r11, java.util.List r12, java.util.List r13, java.util.List r14, defpackage.aoln r15) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazc.f(abwx, java.util.List, java.util.List, java.util.List, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object g(defpackage.abwx abwxVar, java.lang.String str, defpackage.aoln aolnVar) throws java.io.IOException {
        defpackage.abwu abwuVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof defpackage.abwu) {
            abwuVar = (defpackage.abwu) aolnVar;
            int i = abwuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abwuVar.c = i - Integer.MIN_VALUE;
            } else {
                abwuVar = new defpackage.abwu(abwxVar, aolnVar);
            }
        } else {
            abwuVar = new defpackage.abwu(abwxVar, aolnVar);
        }
        java.lang.Object obj = abwuVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = abwuVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!defpackage.ahvr.R(abwuVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1244, "getAllData", defpackage.ahot.a, true);
            try {
                defpackage.giv gioVar = new defpackage.gio(defpackage.a.bx(str, "SELECT * FROM "));
                abwuVar.d = ahoqVarX;
                abwuVar.c = 1;
                java.lang.Object objC = abwxVar.c(gioVar, abwuVar);
                if (objC != obj2) {
                    obj = objC;
                    ahoqVar = ahoqVarX;
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarX;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = abwuVar.d;
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
        obj2 = (java.util.List) obj;
        defpackage.ajsz.ak(ahoqVar, null);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ java.lang.Object h(defpackage.abwx abwxVar, java.lang.String str, java.lang.String str2, java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aoln aolnVar) throws java.io.IOException {
        abwv abwvVar;
        java.lang.Throwable th;
        defpackage.ahoq ahoqVar;
        if (aolnVar instanceof abwv) {
            abwvVar = (abwv) aolnVar;
            int i = abwvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abwvVar.c = i - Integer.MIN_VALUE;
            } else {
                abwvVar = new abwv(abwxVar, aolnVar);
            }
        } else {
            abwvVar = new abwv(abwxVar, aolnVar);
        }
        java.lang.Object obj2 = abwvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = abwvVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoqVar = abwvVar.d;
            try {
                defpackage.aooc.af(obj2);
                defpackage.ajsz.ak(ahoqVar, null);
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    defpackage.ajsz.ak(ahoqVar, th);
                    throw th3;
                }
            }
        }
        defpackage.aooc.af(obj2);
        if (!defpackage.ahvr.R(abwvVar.u())) {
            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1245, "getData_one");
        try {
            defpackage.gio gioVar = new defpackage.gio(defpackage.a.bD(str2, str, "SELECT * FROM ", " WHERE ", " = ?"), new java.lang.Object[]{((defpackage.abxa) aonjVar.a(obj)).a()});
            abwvVar.d = ahoqVarZ;
            abwvVar.c = 1;
            java.lang.Object objH = abwxVar.h(gioVar, abwvVar);
            if (objH == aoluVar) {
                return aoluVar;
            }
            obj2 = objH;
            ahoqVar = ahoqVarZ;
            defpackage.ajsz.ak(ahoqVar, null);
            return obj2;
        } catch (java.lang.Throwable th4) {
            th = th4;
            ahoqVar = ahoqVarZ;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093 A[Catch: all -> 0x012e, TryCatch #3 {all -> 0x012e, blocks: (B:27:0x008d, B:29:0x0093, B:31:0x00e6, B:32:0x00f9), top: B:55:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6 A[Catch: all -> 0x012e, LOOP:0: B:30:0x00e4->B:31:0x00e6, LOOP_END, TryCatch #3 {all -> 0x012e, blocks: (B:27:0x008d, B:29:0x0093, B:31:0x00e6, B:32:0x00f9), top: B:55:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0114 -> B:14:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object i(defpackage.abwx r17, java.lang.String r18, java.lang.String r19, java.util.Set r20, defpackage.aonj r21, defpackage.aoln r22) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazc.i(abwx, java.lang.String, java.lang.String, java.util.Set, aonj, aoln):java.lang.Object");
    }

    public static java.lang.Object j(defpackage.abwo abwoVar, java.util.List list, defpackage.abwn abwnVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(defpackage.aour.a, new defpackage.abwq(list, abwoVar, abwnVar, null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static java.lang.Object k(java.util.Map map, java.util.List list, defpackage.aoln aolnVar) {
        defpackage.abwr abwrVar;
        ?? r6;
        ?? r5;
        if (aolnVar instanceof defpackage.abwr) {
            abwrVar = (defpackage.abwr) aolnVar;
            int i = abwrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                abwrVar.d = i - Integer.MIN_VALUE;
            } else {
                abwrVar = new defpackage.abwr(aolnVar);
            }
        } else {
            abwrVar = new defpackage.abwr(aolnVar);
        }
        java.lang.Object objL = abwrVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = abwrVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objL);
            abwrVar.a = map;
            abwrVar.b = map;
            abwrVar.d = 1;
            objL = l(map, list, abwrVar);
            if (objL == aoluVar) {
                return aoluVar;
            }
            r6 = map;
            r5 = map;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj = abwrVar.b;
            java.lang.Object obj2 = abwrVar.a;
            defpackage.aooc.af(objL);
            r6 = obj;
            r5 = obj2;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.Map) objL).entrySet()) {
            if (!defpackage.aooh.n(r5.get(entry.getKey()), entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (r6 == 0) {
            defpackage.aooh.i("currentData");
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(defpackage.ajsz.aL(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), abxl.c(r6.get(entry2.getKey()), entry2.getValue()));
        }
        return new defpackage.ahbq(linkedHashMap2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v6, types: [aonn, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:23:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object l(java.util.Map r7, java.util.List r8, defpackage.aoln r9) {
        /*
            boolean r0 = r9 instanceof defpackage.abws
            if (r0 == 0) goto L13
            r0 = r9
            abws r0 = (defpackage.abws) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            abws r0 = new abws
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            aolu r1 = defpackage.aolu.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            aola r7 = r0.h
            java.lang.Object r8 = r0.c
            java.lang.Object r2 = r0.b
            aola r4 = r0.g
            aola r5 = r0.f
            java.lang.Object r6 = r0.a
            defpackage.aooc.af(r9)
            goto L80
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            defpackage.aooc.af(r9)
            int r9 = r8.size()
            aola r2 = new aola
            r2.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
            r5 = r2
            r2 = r8
            r8 = r7
            r7 = r5
        L4f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r2.next()
            afpl r9 = (afpl) r9
            java.lang.Object r4 = r9.b
            java.lang.Object r6 = r7.get(r4)
            if (r6 != 0) goto L67
            java.lang.Object r6 = r8.get(r4)
        L67:
            java.lang.Object r9 = r9.a
            r0.a = r8
            r0.f = r5
            r0.g = r7
            r0.b = r2
            r0.c = r4
            r0.h = r7
            r0.e = r3
            java.lang.Object r9 = r9.a(r6, r0)
            if (r9 == r1) goto L91
            r6 = r8
            r8 = r4
            r4 = r7
        L80:
            r7.put(r8, r9)
            r7 = r4
            r8 = r6
            goto L4f
        L86:
            if (r5 != 0) goto L8d
            java.lang.String r7 = "builder"
            defpackage.aooh.i(r7)
        L8d:
            java.util.Map r1 = r5.e()
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazc.l(java.util.Map, java.util.List, aoln):java.lang.Object");
    }

    public static defpackage.abwo m(java.lang.String str, java.lang.String str2, defpackage.abwx abwxVar, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, defpackage.aeza aezaVar) {
        if (abwxVar == null) {
            defpackage.aooh.i("dao");
        }
        return new defpackage.abxi(str, str2, abwxVar, aonjVar, aonjVar2, new defpackage.dkm(11), new defpackage.rou(9), aezaVar);
    }

    public static defpackage.abwo n(java.lang.String str, java.lang.String str2, defpackage.abwx abwxVar, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, defpackage.aonn aonnVar, defpackage.aonj aonjVar3, defpackage.aeza aezaVar) {
        if (abwxVar == null) {
            defpackage.aooh.i("dao");
        }
        return new defpackage.abxi(str, str2, abwxVar, aonjVar, aonjVar2, aonnVar, aonjVar3, aezaVar);
    }

    public static defpackage.abwo o(java.lang.String str, defpackage.abwx abwxVar, defpackage.aonj aonjVar, defpackage.aeza aezaVar) {
        if (abwxVar == null) {
            defpackage.aooh.i("dao");
        }
        return m(str, "call_creation_time_millis", abwxVar, aonjVar, defpackage.abxg.a, aezaVar);
    }

    public static defpackage.abwo p(java.lang.String str, java.lang.String str2, defpackage.abwx abwxVar, defpackage.aonj aonjVar, defpackage.aeza aezaVar) {
        if (abwxVar == null) {
            defpackage.aooh.i("dao");
        }
        return m(str, str2, abwxVar, aonjVar, defpackage.abxh.a, aezaVar);
    }

    @java.lang.Deprecated
    public static defpackage.aaum q(java.util.concurrent.Executor executor, java.util.concurrent.Callable callable) {
        defpackage.aais.at(executor, "Executor must not be null");
        defpackage.aauq aauqVar = new defpackage.aauq();
        executor.execute(new defpackage.an(aauqVar, callable, 19));
        return aauqVar;
    }

    public static defpackage.aaum r(java.lang.Exception exc) {
        defpackage.aauq aauqVar = new defpackage.aauq();
        aauqVar.r(exc);
        return aauqVar;
    }

    public static defpackage.aaum s(java.lang.Object obj) {
        defpackage.aauq aauqVar = new defpackage.aauq();
        aauqVar.s(obj);
        return aauqVar;
    }

    public static java.lang.Object t(defpackage.aaum aaumVar) throws java.lang.InterruptedException {
        defpackage.aais.am("Must not be called on the main application thread");
        defpackage.aais.ar();
        if (aaumVar.j()) {
            return C(aaumVar);
        }
        defpackage.aaus aausVar = new defpackage.aaus();
        java.util.concurrent.Executor executor = defpackage.aaup.b;
        aaumVar.p(executor, aausVar);
        aaumVar.o(executor, aausVar);
        aaumVar.l(executor, aausVar);
        aausVar.a.await();
        return C(aaumVar);
    }

    public static java.lang.Object u(defpackage.aaum aaumVar, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        defpackage.aais.am("Must not be called on the main application thread");
        defpackage.aais.ar();
        if (timeUnit == null) {
            throw new java.lang.NullPointerException("TimeUnit must not be null");
        }
        if (aaumVar.j()) {
            return C(aaumVar);
        }
        defpackage.aaus aausVar = new defpackage.aaus();
        java.util.concurrent.Executor executor = defpackage.aaup.b;
        aaumVar.p(executor, aausVar);
        aaumVar.o(executor, aausVar);
        aaumVar.l(executor, aausVar);
        if (aausVar.a.await(j, timeUnit)) {
            return C(aaumVar);
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
    }

    public static java.util.concurrent.ExecutorService v(int i, java.util.concurrent.ThreadFactory threadFactory) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static java.util.concurrent.ExecutorService w(int i) {
        return v(i, new defpackage.aanf(0));
    }

    public static com.google.android.gms.common.api.ApiMetadata x() {
        defpackage.aazc aazcVar = defpackage.aamz.b;
        com.google.android.gms.common.api.ComplianceOptions complianceOptions = new com.google.android.gms.common.api.ComplianceOptions(-1, -1, 0, true);
        android.os.Parcelable.Creator creator = com.google.android.gms.common.api.ApiMetadata.CREATOR;
        return defpackage.aais.aB(complianceOptions, false, null, false);
    }

    public static com.google.android.gms.common.api.ApiMetadata y() {
        com.google.android.gms.common.api.ApiMetadata apiMetadataX = x();
        return defpackage.aais.aB(apiMetadataX.b, true, apiMetadataX.d, apiMetadataX.e);
    }

    public static java.lang.Object z(java.lang.Class cls, java.lang.String str, defpackage.acxg... acxgVarArr) {
        int length = acxgVarArr.length;
        java.lang.Class<?>[] clsArr = new java.lang.Class[length];
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i = 0; i < acxgVarArr.length; i++) {
            defpackage.acxg acxgVar = acxgVarArr[i];
            acxgVar.getClass();
            clsArr[i] = (java.lang.Class) acxgVar.b;
            objArr[i] = acxgVarArr[i].a;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public aazc(byte[] bArr) {
    }
}
