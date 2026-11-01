package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iwg implements defpackage.ahlb {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/mdd/BeeslyMddDownloadSynclet");
    private final defpackage.aoss b;
    private final defpackage.ish c;
    private final defpackage.rlv d;
    private final defpackage.iwk e;
    private final defpackage.iqm f;
    private final defpackage.ivi g;
    private final defpackage.jdk h;
    private final defpackage.zzx i;
    private final defpackage.rsr j;

    public iwg(defpackage.aoss aossVar, defpackage.rsr rsrVar, defpackage.ish ishVar, defpackage.rlv rlvVar, defpackage.iwk iwkVar, defpackage.iqm iqmVar, defpackage.ivi iviVar, defpackage.zzx zzxVar, defpackage.jdk jdkVar) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(ishVar, "beeslySingletonAudioPrismConfigProvider");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        this.b = aossVar;
        this.j = rsrVar;
        this.c = ishVar;
        this.d = rlvVar;
        this.e = iwkVar;
        this.f = iqmVar;
        this.g = iviVar;
        this.i = zzxVar;
        this.h = jdkVar;
    }

    @Override // defpackage.ahlb
    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.b, 0, new defpackage.icp(this, (defpackage.aoln) null, 10), 3);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x014f  */
    /* JADX WARN: Code duplicated, block: B:56:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:? A[LOOP:0: B:63:0x0193->B:80:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0182 -> B:68:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0184 -> B:63:0x0193). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.aoln r12) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwg.b(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        iwf iwfVar;
        if (aolnVar instanceof iwf) {
            iwfVar = (iwf) aolnVar;
            int i = iwfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwfVar.c = i - Integer.MIN_VALUE;
            } else {
                iwfVar = new iwf(this, aolnVar);
            }
        } else {
            iwfVar = new iwf(this, aolnVar);
        }
        java.lang.Object objB = iwfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = iwfVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            defpackage.ish ishVar = this.c;
            iwfVar.c = 1;
            objB = ishVar.b(iwfVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        defpackage.igs igsVar = ((defpackage.igf) objB).f;
        if (igsVar == null) {
            igsVar = defpackage.igs.a;
        }
        defpackage.alat alatVar = igsVar.c;
        defpackage.aooh.e(alatVar, "getModelConfigList(...)");
        for (java.lang.Object obj : alatVar) {
            if (defpackage.igq.a(((igr) obj).b) == defpackage.igq.c) {
                return obj;
            }
        }
        return null;
    }
}
