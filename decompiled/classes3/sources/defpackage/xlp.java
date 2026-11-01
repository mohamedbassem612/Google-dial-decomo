package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xlp extends defpackage.xne {
    private static final xtq j;
    private final int a;

    static {
        int i = defpackage.xox.a;
        j = new xtq("DiagnosisProviderTask", (byte[]) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlp(defpackage.xhu xhuVar, int i) {
        super(new defpackage.xln(xhuVar));
        aooh.f(xhuVar, "component");
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xmb
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object eq(defpackage.xll xllVar, aoln aolnVar) {
        defpackage.xlo xloVar;
        if (aolnVar instanceof defpackage.xlo) {
            xloVar = (defpackage.xlo) aolnVar;
            int i = xloVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xloVar.c = i - Integer.MIN_VALUE;
            } else {
                xloVar = new defpackage.xlo(this, aolnVar);
            }
        } else {
            xloVar = new defpackage.xlo(this, aolnVar);
        }
        java.lang.Object obj = xloVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xloVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            xtq xtqVar = j;
            xtqVar.c("Collecting diagnostic information");
            j$.time.Duration duration = xllVar.a;
            if (duration != null) {
                xtqVar.c(a.bg(duration, "Delaying for ", " before execution"));
                long millis = duration.toMillis();
                xloVar.c = 1;
                if (aosv.j(millis, xloVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return new defpackage.xlm(this.a);
    }
}
