package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jhh implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/v2/service/verdict/BeeslyAiCoreContentVerdictWorker");
    public static final java.util.Map b = defpackage.ajsz.aO(new defpackage.aoiu("de-DE", new jhd("Germany", "German")), new defpackage.aoiu("en-IN", new jhd("India", "English")), new defpackage.aoiu("es-ES", new jhd("Spain", "Spanish")), new defpackage.aoiu("fr-CA", new jhd("Canada", "French")), new defpackage.aoiu("fr-FR", new jhd("France", "French")), new defpackage.aoiu("hi-IN", new jhd("India", "Hindi")), new defpackage.aoiu("it-IT", new jhd("Italy", "Italian")), new defpackage.aoiu("ja-JP", new jhd("Japan", "Japanese")));
    public final defpackage.kgl c;
    private final defpackage.aoin d;
    private final defpackage.aoss e;
    private final defpackage.iwc f;
    private final defpackage.rlv g;
    private final defpackage.rxa h;
    private final yuo i;
    private final defpackage.ugs j;
    private final defpackage.tvn k;
    private final jhw l;
    private final defpackage.rsr m;

    public jhh(defpackage.aoin aoinVar, defpackage.aoss aossVar, defpackage.kgl kglVar, defpackage.rsr rsrVar, yuo yuoVar, defpackage.iwc iwcVar, defpackage.rlv rlvVar, defpackage.ugs ugsVar, defpackage.rxa rxaVar, defpackage.tvn tvnVar, jhw jhwVar, defpackage.aazc aazcVar) {
        defpackage.aooh.f(aoinVar, "targetModelVersion");
        defpackage.aooh.f(aossVar, "backgroundScope");
        defpackage.aooh.f(kglVar, "beeslySot");
        defpackage.aooh.f(iwcVar, "localeProvider");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aooh.f(jhwVar, "beeslyVerdictNotifier");
        defpackage.aooh.f(aazcVar, "clock");
        this.d = aoinVar;
        this.e = aossVar;
        this.c = kglVar;
        this.m = rsrVar;
        this.i = yuoVar;
        this.f = iwcVar;
        this.g = rlvVar;
        this.j = ugsVar;
        this.h = rxaVar;
        this.k = tvnVar;
        this.l = jhwVar;
    }

    private final java.lang.Object e(ity ityVar, defpackage.aoln aolnVar) {
        ((defpackage.aimw) a.b().l("com/android/dialer/beesly/impl/v2/service/verdict/BeeslyAiCoreContentVerdictWorker", "cancelMissedCallNotification", 282, "BeeslyAiCoreContentVerdictWorker.kt")).y("Call is classified as SPAM/SCAM by Moirai; cancelling missed call notification", ityVar);
        java.lang.Object objD = this.h.d(ityVar.a, aolnVar);
        return objD != defpackage.aolu.a ? defpackage.aojh.a : objD;
    }

    /* JADX WARN: Failed to calculate best type for var: r10v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private final java.lang.Object f(itc r23, boolean r24, int r25, java.lang.String r26, defpackage.aoln r27) {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.f(itc, boolean, int, java.lang.String, aoln):java.lang.Object");
    }

    private static final int g(defpackage.udj udjVar) {
        int iOrdinal = udjVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        int i = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return 3;
            }
            i = 4;
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new defpackage.aois();
                }
                return 1;
            }
        }
        return i;
    }

    private static final int j(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 3 : 2;
        }
        return 1;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.e, 0, new jhg(workerParameters, this, (defpackage.aoln) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        jhe jheVar;
        if (aolnVar instanceof jhe) {
            jheVar = (jhe) aolnVar;
            int i = jheVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jheVar.c = i - Integer.MIN_VALUE;
            } else {
                jheVar = new jhe(this, aolnVar);
            }
        } else {
            jheVar = new jhe(this, aolnVar);
        }
        java.lang.Object objA = jheVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jheVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.aoin aoinVar = this.d;
            yse yseVar = yse.c;
            java.lang.Integer num = new java.lang.Integer((int) ((java.lang.Number) aoinVar.a()).longValue());
            if (num.intValue() <= 0) {
                num = null;
            }
            yts ytsVar = new yts(yseVar, num, 1);
            yuo yuoVar = this.i;
            jheVar.c = 1;
            objA = yuoVar.a(ytsVar, jheVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        ytw ytwVar = (yty) objA;
        int iY = defpackage.anty.Y(ytwVar);
        if (iY == 0) {
            return ((ytx) ytwVar).a;
        }
        if (iY != 1) {
            throw new defpackage.aois();
        }
        ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.SMALL).l("com/android/dialer/beesly/impl/v2/service/verdict/BeeslyAiCoreContentVerdictWorker", "initializeAiCoreSession", 131, "BeeslyAiCoreContentVerdictWorker.kt")).y("Failed to create AiCore session: %s", ytwVar.a());
        this.g.o(defpackage.rmx.BEESLY_V2_AICORE_SESSION_INITIALIZATION_FAILED);
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0198: MOVE (r5 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:409), block:B:64:0x0190 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:215:0x064e -> B:77:0x0209). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object d(ahdv r24, java.util.List r25, defpackage.aoln r26) {
        /*
            Method dump skipped, instruction units count: 1704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.d(ahdv, java.util.List, aoln):java.lang.Object");
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
