package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class smd implements aono {
    private final /* synthetic */ int $cid;
    public static final defpackage.smd g = new defpackage.smd(6);
    public static final defpackage.smd f = new defpackage.smd(5);
    public static final defpackage.smd e = new defpackage.smd(4);
    public static final defpackage.smd d = new defpackage.smd(3);
    public static final defpackage.smd c = new defpackage.smd(2);
    public static final defpackage.smd b = new defpackage.smd(1);
    public static final defpackage.smd a = new defpackage.smd(0);

    public smd(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            cav cavVar = (cav) obj2;
            ((java.lang.Number) obj3).intValue();
            cavVar.u(-1953972046);
            aku akuVar = new aku(1.0f, 1500.0f, new dpi(0.4f));
            cavVar.o();
            return akuVar;
        }
        if (i == 1) {
            csj csjVar = (csj) obj;
            long j = ((cpm) obj2).a;
            long j2 = ((cqg) obj3).a;
            buc bucVar = buc.a;
            den.R(csjVar, j2, csjVar.dl(4.0f) / 2.0f, j, (den) null, 120);
            return aojh.a;
        }
        if (i == 2) {
            cav cavVar2 = (cav) obj2;
            ((java.lang.Number) obj3).intValue();
            cavVar2.u(-985243360);
            aku akuVar2 = new aku(1.0f, 1500.0f, (java.lang.Object) null);
            cavVar2.o();
            return akuVar2;
        }
        if (i == 3) {
            cav cavVar3 = (cav) obj2;
            ((java.lang.Number) obj3).intValue();
            cavVar3.u(-985243360);
            aku akuVar3 = new aku(1.0f, 1500.0f, (java.lang.Object) null);
            cavVar3.o();
            return akuVar3;
        }
        if (i == 4) {
            cav cavVar4 = (cav) obj2;
            ((java.lang.Number) obj3).intValue();
            cavVar4.u(-781456724);
            aku akuVar4 = new aku(1.0f, 1500.0f, (java.lang.Object) null);
            cavVar4.o();
            return akuVar4;
        }
        if (i != 5) {
            java.lang.Throwable th = (java.lang.Throwable) obj;
            aojh aojhVar = (aojh) obj2;
            aooh.f(th, "cause");
            aooh.f(aojhVar, "event");
            aooh.f((aolr) obj3, "<unused var>");
            ahdl.a.d().k(th).l("com/google/apps/tiktok/experiments/phenotype/TimedProcessReaperPoller", "waitUntilIdle$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 154, "TimedProcessReaperPoller.kt").y("Failed to log reaper skipped event %s", aojhVar);
            return aojh.a;
        }
        cav cavVar5 = (cav) obj2;
        ((java.lang.Number) obj3).intValue();
        cavVar5.u(-781456724);
        aku akuVar5 = new aku(1.0f, 1500.0f, (java.lang.Object) null);
        cavVar5.o();
        return akuVar5;
    }
}
