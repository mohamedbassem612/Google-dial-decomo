package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public /* synthetic */ class gfz {
    public gfz() {
    }

    public static java.lang.Object b(defpackage.gfy gfyVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        if (gfyVar.r() && gfyVar.t() && gfyVar.s()) {
            return aonjVar.a(aolnVar);
        }
        return aolnVar.u().get(defpackage.aovp.b) == null ? aonjVar.a(aolnVar) : c(gfyVar, aonjVar, aolnVar);
    }

    public static java.lang.Object c(defpackage.gfy gfyVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        defpackage.efu efuVar = new defpackage.efu(aonjVar, (defpackage.aoln) null, 4);
        defpackage.gge ggeVar = (defpackage.gge) aolnVar.u().get(defpackage.gge.b);
        defpackage.aolo aoloVar = ggeVar != null ? ggeVar.a : null;
        return aoloVar != null ? defpackage.aoov.aj(aoloVar, efuVar, aolnVar) : j(gfyVar, efuVar, aolnVar);
    }

    public static defpackage.gfv d(android.content.Context context, java.lang.Class cls, java.lang.String str) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (str == null || defpackage.aoov.H(str)) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (defpackage.aooh.n(str, ":memory:")) {
            throw new java.lang.IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new defpackage.gfv(context, cls, str);
    }

    static /* synthetic */ void e() {
        throw new java.lang.IllegalStateException("NOP delegate should never be called");
    }

    public static defpackage.aoxh f(defpackage.aonn aonnVar) {
        return defpackage.aoov.aD(new defpackage.aowy(new defpackage.efu(aonnVar, (defpackage.aoln) null, 3, (char[]) null)), -2);
    }

    public static defpackage.gdo g(java.lang.Object obj, int[] iArr, int i, int i2) {
        defpackage.aooh.f(iArr, "originalPageOffsets");
        return new defpackage.gdo(iArr, defpackage.ajsz.aY(obj), i, defpackage.ajsz.aY(java.lang.Integer.valueOf(i2)));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b8 -> B:26:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object h(defpackage.gdo r12, defpackage.aono r13, defpackage.aoln r14) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfz.h(gdo, aono, aoln):java.lang.Object");
    }

    public static void i(java.util.List list, java.lang.Object obj, defpackage.gdo gdoVar, defpackage.gdo gdoVar2, int i, int i2) {
        defpackage.aooh.f(list, "<this>");
        int[] iArrCm = gdoVar != null ? gdoVar.a : null;
        int[] iArr = gdoVar2 != null ? gdoVar2.a : null;
        if (iArrCm == null) {
            if (iArr == null) {
                throw new java.lang.IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
            }
            iArrCm = iArr;
        } else if (iArr != null) {
            int[] iArrCz = defpackage.ajsz.cz(iArrCm, iArr);
            defpackage.aooh.f(iArrCz, "<this>");
            defpackage.aooh.f(iArrCz, "<this>");
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.ajsz.aL(iArrCz.length));
            defpackage.aooh.f(iArrCz, "<this>");
            for (int i3 : iArrCz) {
                linkedHashSet.add(java.lang.Integer.valueOf(i3));
            }
            iArrCm = defpackage.ajsz.cm(defpackage.ajsz.bW(defpackage.ajsz.bZ(linkedHashSet)));
        }
        defpackage.aooh.f(list, "<this>");
        defpackage.aooh.f(iArrCm, "originalPageOffsets");
        if (obj != null) {
            list.add(g(obj, iArrCm, i, i2));
        }
    }

    private static java.lang.Object j(defpackage.gfy gfyVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
        aoscVar.z();
        try {
            java.util.concurrent.Executor executor = gfyVar.d;
            if (executor == null) {
                defpackage.aooh.j("internalTransactionExecutor");
                executor = null;
            }
            executor.execute(new defpackage.gsb((defpackage.aosb) aoscVar, gfyVar, aonnVar, 1));
        } catch (java.util.concurrent.RejectedExecutionException e) {
            aoscVar.g(new java.lang.IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        java.lang.Object objK = aoscVar.k();
        if (objK == defpackage.aolu.a && aolnVar == null) {
            defpackage.aooh.i("frame");
        }
        return objK;
    }

    public void a(defpackage.gip gipVar) {
        throw null;
    }

    public gfz(byte[] bArr) {
    }
}
