package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ivo implements abwm {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/duplexgenerator/BeeslyDuplexGeneratorListener");
    private final aoin b;
    private final zjx c;

    public ivo(aoin aoinVar, zjx zjxVar) {
        aooh.f(aoinVar, "enableCallNotesGenerationWithLowBattery");
        aooh.f(zjxVar, "workManager");
        this.b = aoinVar;
        this.c = zjxVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(ahbq ahbqVar, aoln aolnVar) {
        java.lang.Object objB;
        return (ahbqVar.b.isEmpty() || (objB = b(aolnVar)) != aolu.a) ? aojh.a : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ivn ivnVar;
        if (aolnVar instanceof defpackage.ivn) {
            ivnVar = (defpackage.ivn) aolnVar;
            int i = ivnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ivnVar.c = i - Integer.MIN_VALUE;
            } else {
                ivnVar = new defpackage.ivn(this, aolnVar);
            }
        } else {
            ivnVar = new defpackage.ivn(this, aolnVar);
        }
        java.lang.Object obj = ivnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ivnVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/beesly/impl/duplexgenerator/BeeslyDuplexGeneratorListener", "scheduleCallActions", 32, "BeeslyDuplexGeneratorListener.kt").v("Scheduling Beesly call actions generation");
            java.lang.Boolean bool = (java.lang.Boolean) this.b.a();
            aimz aimzVar = ivx.a;
            aooh.c(bool);
            boolean zBooleanValue = bool.booleanValue();
            aguv aguvVarA = aguz.a(ivx.class);
            java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
            java.util.Objects.toString(uuidRandomUUID);
            aguvVarA.f(new aguy("com.android.dialer.beesly.impl.duplexgenerator.BeeslyDuplexGeneratorWorker".concat(java.lang.String.valueOf(uuidRandomUUID)), 2));
            aguvVarA.e(new aile("com.android.dialer.beesly.impl.duplexgenerator.BeeslyDuplexGeneratorWorker"));
            grl grlVar = new grl();
            grlVar.e = !zBooleanValue;
            aguvVarA.b(grlVar.a());
            ajcq ajcqVarB = this.c.b(aguvVarA.a());
            ivnVar.c = 1;
            if (aosv.D(ajcqVarB, ivnVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
