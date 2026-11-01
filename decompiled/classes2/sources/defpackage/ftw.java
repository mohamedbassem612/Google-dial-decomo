package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftw implements defpackage.ftx {
    private final java.util.List a;
    private final defpackage.fmk[] c;
    private boolean d;
    private int e;
    private int f;
    private final java.lang.String b = "video/mp2t";
    private long g = -9223372036854775807L;

    public ftw(java.util.List list) {
        this.a = list;
        this.c = new defpackage.fmk[list.size()];
    }

    private final boolean g(defpackage.etx etxVar, int i) {
        if (etxVar.d() == 0) {
            return false;
        }
        if (etxVar.n() != i) {
            this.d = false;
        }
        this.e--;
        return this.d;
    }

    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        if (this.d) {
            if (this.e != 2 || g(etxVar, 32)) {
                if (this.e != 1 || g(etxVar, 0)) {
                    int i = etxVar.c;
                    int iD = etxVar.d();
                    for (defpackage.fmk fmkVar : this.c) {
                        etxVar.Q(i);
                        fmkVar.b(etxVar, iD);
                    }
                    this.f += iD;
                }
            }
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        int i = 0;
        while (true) {
            defpackage.fmk[] fmkVarArr = this.c;
            if (i >= fmkVarArr.length) {
                return;
            }
            ils ilsVar = (ils) this.a.get(i);
            fvbVar.c();
            defpackage.fmk fmkVarR = fllVar.r(fvbVar.a(), 3);
            defpackage.eqf eqfVar = new defpackage.eqf();
            eqfVar.a = fvbVar.b();
            eqfVar.a(this.b);
            eqfVar.c("application/dvbsubs");
            eqfVar.q = java.util.Collections.singletonList(ilsVar.a);
            eqfVar.d = (java.lang.String) ilsVar.b;
            fmkVarR.p(new defpackage.eqg(eqfVar));
            fmkVarArr[i] = fmkVarR;
            i++;
        }
    }

    @Override // defpackage.ftx
    public final void d() {
        if (this.d) {
            ahvr.bY(this.g != -9223372036854775807L);
            for (defpackage.fmk fmkVar : this.c) {
                fmkVar.d(this.g, 1, this.f, 0, null);
            }
            this.d = false;
        }
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        if ((i & 4) != 0) {
            this.d = true;
            this.g = j;
            this.f = 0;
            this.e = 2;
        }
    }

    @Override // defpackage.ftx
    public final void f() {
        this.d = false;
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void c() {
    }
}
