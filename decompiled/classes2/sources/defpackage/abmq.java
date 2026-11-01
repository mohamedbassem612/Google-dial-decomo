package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abmq implements aonj {
    public final /* synthetic */ defpackage.abms a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ defpackage.hwv e;

    public /* synthetic */ abmq(defpackage.abms abmsVar, int i, defpackage.hwv hwvVar, java.lang.String str, long j) {
        this.a = abmsVar;
        this.b = i;
        this.e = hwvVar;
        this.c = str;
        this.d = j;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        dkz dkzVarN = abts.N(this.a.a, ((dps) obj).b);
        dkw dkwVarD = defpackage.hwv.d(this.e, this.c, dkzVarN, this.b, this.d);
        return new defpackage.abmr(dkzVarN, dkwVarD.c(), dkwVarD.l());
    }
}
