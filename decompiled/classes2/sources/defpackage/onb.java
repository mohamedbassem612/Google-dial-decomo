package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onb implements znp {
    private final /* synthetic */ int $cid;
    public final ajct a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public onb(ajct ajctVar, apqr apqrVar, onv onvVar, kjr kjrVar, int i) {
        this.$cid = i;
        this.a = ajctVar;
        this.c = apqrVar;
        this.b = onvVar;
        this.d = kjrVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    public final ajcq ek() {
        if (this.$cid == 0) {
            java.lang.Object obj = this.c;
            apqr apqrVar = (apqr) obj;
            return ahvr.I(ahrv.g(((defpackage.ona) aooc.ar(((afpl) apqrVar.b.a()).Y(), defpackage.ona.class)).ai()).h(new defpackage.mjl(obj, 10), (java.util.concurrent.Executor) apqrVar.c), new defpackage.ocj(this, 2), this.a);
        }
        defpackage.kug kugVar = (defpackage.kug) this.d;
        if (!kugVar.h) {
            kugVar.c();
        }
        ahrv ahrvVarG = ahrv.g(((afpl) this.b).X());
        defpackage.ibe ibeVar = new defpackage.ibe(6);
        ajct ajctVar = this.a;
        return ahrvVarG.i(ibeVar, ajctVar).h(new defpackage.jss(this, 15), ajctVar);
    }

    public onb(defpackage.kug kugVar, afpl afplVar, ajcu ajcuVar, qbe qbeVar, int i) {
        this.$cid = i;
        this.d = kugVar;
        this.b = afplVar;
        this.a = ajcuVar;
        this.c = qbeVar;
    }
}
