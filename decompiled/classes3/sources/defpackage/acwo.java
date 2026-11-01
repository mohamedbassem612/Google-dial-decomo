package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acwo implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ acwx a;
    public final /* synthetic */ aiwm b;
    public final /* synthetic */ ajcq c;
    public final /* synthetic */ defpackage.acwv d;
    public final /* synthetic */ defpackage.acww e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;

    public /* synthetic */ acwo(acwx acwxVar, long j, aiwm aiwmVar, ajcq ajcqVar, defpackage.acwv acwvVar, defpackage.acww acwwVar, int i, int i2) {
        this.$cid = i2;
        this.a = acwxVar;
        this.f = j;
        this.b = aiwmVar;
        this.c = ajcqVar;
        this.d = acwvVar;
        this.e = acwwVar;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objH;
        int iA;
        if (this.$cid != 0) {
            long jB = aazc.b() - this.f;
            acwx acwxVar = this.a;
            ahvr.E(new defpackage.acwo(acwxVar, this.b, this.c, this.d, this.e, this.g, jB, 0), acwxVar.f);
            return;
        }
        defpackage.acwv acwvVar = this.d;
        try {
            objH = aiql.H(this.c);
            try {
                iA = acwvVar.a(objH);
            } catch (java.lang.Throwable th) {
                th = th;
                if (th instanceof java.util.concurrent.ExecutionException) {
                    th = th.getCause();
                }
                if (th instanceof java.util.concurrent.CancellationException) {
                    iA = 5;
                } else if (th instanceof java.lang.InterruptedException) {
                    iA = 6;
                } else if (th instanceof java.io.IOException) {
                    iA = 7;
                } else if (th instanceof java.lang.IllegalStateException) {
                    iA = 8;
                } else if (th instanceof java.lang.IllegalArgumentException) {
                    iA = 9;
                } else if (th instanceof java.lang.UnsupportedOperationException) {
                    iA = 10;
                } else {
                    iA = th instanceof acvh ? 11 : 4;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            objH = null;
        }
        aiwm aiwmVar = this.b;
        if (objH != null) {
            defpackage.acww acwwVar = this.e;
            akzx akzxVarP = aiwmVar.p();
            akzxVarP.z(acwwVar.a(objH));
            aiwmVar = (aiwm) akzxVarP.p();
        }
        int i = this.g;
        akzx akzxVarM = aiwv.a.m();
        akzxVarM.u();
        aiwv aiwvVar = akzxVarM.b;
        aiwvVar.c = i - 2;
        aiwvVar.b |= 1;
        akzxVarM.u();
        aiwv aiwvVar2 = akzxVarM.b;
        long j = this.f;
        aiwvVar2.d = iA - 2;
        aiwvVar2.b |= 2;
        akzxVarM.u();
        aiwv aiwvVar3 = akzxVarM.b;
        aiwvVar3.b |= 4;
        aiwvVar3.f = j;
        akzxVarM.u();
        aiwv aiwvVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(aiwmVar);
        alat alatVar = aiwvVar4.e;
        if (!alatVar.c()) {
            aiwvVar4.e = alad.J(alatVar);
        }
        acwx acwxVar2 = this.a;
        aiwvVar4.e.add(aiwmVar);
        acwxVar2.b.g(akzxVarM.p());
    }

    public /* synthetic */ acwo(acwx acwxVar, aiwm aiwmVar, ajcq ajcqVar, defpackage.acwv acwvVar, defpackage.acww acwwVar, int i, long j, int i2) {
        this.$cid = i2;
        this.a = acwxVar;
        this.b = aiwmVar;
        this.c = ajcqVar;
        this.d = acwvVar;
        this.e = acwwVar;
        this.g = i;
        this.f = j;
    }
}
