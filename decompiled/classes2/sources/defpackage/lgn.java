package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lgn {
    private static final aimz i = aimz.i("com/android/dialer/callscreen/impl/service/ChipProcessor");
    public final ucr a;
    public final defpackage.lgg b;
    public final zdl c;
    public final java.util.concurrent.Executor d;
    public final defpackage.lgi e;
    public final defpackage.ldn f;
    public final long g;
    public final aazc h;
    private final android.content.Context j;
    private final defpackage.lgv k;
    private final afpl l;

    public lgn(android.content.Context context, afpl afplVar, ajct ajctVar, ucr ucrVar, defpackage.lgv lgvVar, defpackage.lgg lggVar, zdl zdlVar, defpackage.lgi lgiVar, defpackage.ldn ldnVar, long j, aazc aazcVar) {
        this.j = context;
        this.a = ucrVar;
        this.k = lgvVar;
        this.b = lggVar;
        this.c = zdlVar;
        this.l = afplVar;
        this.d = new ajdc(ajctVar);
        this.e = lgiVar;
        this.f = ldnVar;
        this.g = j;
        this.h = aazcVar;
    }

    public final ajcq a(java.util.List list, int i2) {
        ahrv ahrvVarC;
        if (i2 == list.size()) {
            return ajcm.a;
        }
        defpackage.lln llnVar = (defpackage.lln) list.get(i2);
        if (llnVar == defpackage.lln.REPORT_SPAM) {
            ajcq ajcqVarBl = ((defpackage.lgm) aooc.ar(this.l.Y(), defpackage.lgm.class)).bl();
            java.lang.String strA = rlt.a(this.j, (android.telecom.PhoneAccountHandle) null);
            ahrv ahrvVarG = ahrv.g(ajcqVarBl);
            defpackage.kwa kwaVar = new defpackage.kwa(this, strA, 9);
            java.util.concurrent.Executor executor = this.d;
            ahrvVarC = ahrvVarG.i(kwaVar, executor).h(new defpackage.lgd(this, 3), executor);
        } else if (llnVar == defpackage.lln.END_CALL) {
            ahrvVarC = this.k.c(defpackage.lgq.c);
        } else {
            a.bt(i.d(), "unrecognized chipAction: %s", llnVar.name(), "com/android/dialer/callscreen/impl/service/ChipProcessor", "runCurrentAction", (char) 144, "ChipProcessor.java", zct.b);
            ahrvVarC = ajcm.a;
        }
        return ahvr.I(ahrvVarC, new defpackage.lgl((java.lang.Object) this, list, i2, 0), this.d);
    }
}
