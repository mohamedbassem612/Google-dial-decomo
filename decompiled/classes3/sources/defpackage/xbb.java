package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xbb implements defpackage.qbb {
    private final /* synthetic */ int $cid;
    public final long a;
    public final java.lang.Object b;
    private final ajct c;

    public xbb(ajct ajctVar, long j, kgl kglVar, int i) {
        this.$cid = i;
        this.c = ajctVar;
        this.a = j;
        this.b = kglVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.qbb
    public final ajcq a() {
        int i = this.$cid;
        java.lang.Object obj = this.b;
        if (i != 0) {
            long j = this.a;
            kgl kglVar = (kgl) obj;
            return ahrv.g(ahvr.ak(new ajcq[]{kglVar.b(j)}).o(new jww(obj, j, 1), (java.util.concurrent.Executor) kglVar.a)).h(new jss(this, 10), this.c);
        }
        long j2 = this.a;
        defpackage.wys wysVar = (defpackage.wys) obj;
        ajcq ajcqVarG = ahvr.G(new lki(obj, j2, 5), wysVar.c);
        ahrv ahrvVarG = ahrv.g(ajcqVarG);
        jwi jwiVar = new jwi(obj, j2, 15);
        ajcu ajcuVar = wysVar.d;
        return ahrv.g(ahrvVarG.i(jwiVar, ajcuVar).i(new defpackage.wkv(ajcqVarG, 20), ajcuVar)).h(new defpackage.wrn(this, 17), this.c);
    }

    @Override // defpackage.qbb
    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.ampl amplVar = (defpackage.ampl) obj;
            akzxVar.u();
            amow amowVar = akzxVar.b;
            amow amowVar2 = amow.a;
            j$.util.Objects.requireNonNull(amplVar);
            amowVar.X = amplVar;
            amowVar.c |= 1048576;
            return;
        }
        defpackage.amoc amocVar = (defpackage.amoc) obj;
        akzxVar.u();
        amow amowVar3 = akzxVar.b;
        amow amowVar4 = amow.a;
        j$.util.Objects.requireNonNull(amocVar);
        amowVar3.U = amocVar;
        amowVar3.c |= 131072;
    }

    public xbb(defpackage.wys wysVar, ajct ajctVar, long j, int i) {
        this.$cid = i;
        this.b = wysVar;
        this.c = ajctVar;
        this.a = j;
    }
}
