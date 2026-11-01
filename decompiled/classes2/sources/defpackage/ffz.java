package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ffz implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ffz(aift aiftVar, aift aiftVar2, int i) {
        this.$cid = i;
        this.b = aiftVar;
        this.c = aiftVar2;
        this.a = "{...}";
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [aajq, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.fga) obj).N(0, (defpackage.ffu) ((alic) this.a).b, (defpackage.ffl) this.b, (defpackage.ffq) this.c);
            return;
        }
        if (i == 1) {
            ((defpackage.fga) obj).O(0, (defpackage.ffu) ((alic) this.a).b, (defpackage.ffl) this.b, (defpackage.ffq) this.c);
            return;
        }
        int i2 = 2;
        if (i == 2) {
            agsm.i(505, ahvr.E(new defpackage.opo((defpackage.znb) obj, this.a, this.b, i2), ((pti) this.c).a), "failed sending onConnectionEvent", new java.lang.Object[0]);
            return;
        }
        if (i != 3) {
            defpackage.aisu aisuVar = (defpackage.aisu) obj;
            ((aift) this.b).i(aisuVar.toString());
            ((aift) this.c).i(java.lang.Boolean.valueOf(!aisuVar.c((java.lang.String) this.a)));
            return;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        gat gatVar = (gat) this.c;
        aais.al((android.os.Handler) gatVar.c);
        boolean zC = status.c();
        java.lang.Object obj2 = this.a;
        if (zC) {
            gat.F((aajq) this.b, (aagp) gatVar.b, (zzx) obj2);
        } else {
            ((zzx) obj2).h(aehj.bY(status));
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ ffz(alic alicVar, defpackage.ffl fflVar, defpackage.ffq ffqVar, int i) {
        this.$cid = i;
        this.a = alicVar;
        this.b = fflVar;
        this.c = ffqVar;
    }

    public /* synthetic */ ffz(gat gatVar, aajq aajqVar, zzx zzxVar, int i) {
        this.$cid = i;
        this.c = gatVar;
        this.b = aajqVar;
        this.a = zzxVar;
    }

    public /* synthetic */ ffz(pti ptiVar, java.lang.String str, android.os.Bundle bundle, int i) {
        this.$cid = i;
        this.c = ptiVar;
        this.a = str;
        this.b = bundle;
    }
}
