package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ambh implements alis {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/smartnotes/DuplexSummarizer");
    public static final defpackage.alqg b;
    public final ajdd c = new ajdd();
    public final defpackage.ambg d = new defpackage.ambg(this);
    public final java.util.List e = new java.util.ArrayList();
    public final java.util.List f = new java.util.ArrayList();
    public defpackage.alje g;

    static {
        akzx akzxVarM = defpackage.alqg.a.m();
        akzxVarM.u();
        ((defpackage.alqg) akzxVarM.b).b = a.U(2);
        akzxVarM.u();
        ((defpackage.alqg) akzxVarM.b).c = 16000;
        akzxVarM.u();
        ((defpackage.alqg) akzxVarM.b).d = 1;
        b = (defpackage.alqg) akzxVarM.p();
    }

    private final void b() {
        this.g.g();
    }

    public final alir a(java.util.List list) {
        alir alirVarA;
        this.g.e(j$.util.Optional.empty());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                this.g.b((defpackage.alro) it.next());
            } finally {
                b();
            }
        }
        try {
            aimz aimzVar = a;
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/smartnotes/DuplexSummarizer", "processEvents", 142, "DuplexSummarizer.java").v("Waiting for the result");
            alirVarA = (alir) this.c.s();
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/smartnotes/DuplexSummarizer", "processEvents", 144, "DuplexSummarizer.java").v("Process events finished successfully");
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            aliq aliqVar = new aliq();
            aliqVar.b(new defpackage.alio("Failed to get the result", e));
            aify aifyVar = aike.a;
            aliqVar.c(aifyVar);
            aliqVar.d(aifyVar);
            alirVarA = aliqVar.a();
        }
        return alirVarA;
    }
}
