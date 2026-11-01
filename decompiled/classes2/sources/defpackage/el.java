package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class el implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    public /* synthetic */ el(ajwr ajwrVar, int i, agxi agxiVar, agxf agxfVar, int i2) {
        this.$cid = i2;
        this.b = ajwrVar;
        this.a = i;
        this.c = agxiVar;
        this.d = agxfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [agye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aajq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [agxi, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ?? r3 = this.c;
            ((defpackage.em) this.d).b.execute(new defpackage.el(this, this.a, (java.util.List) r3, defpackage.ev.a(new defpackage.ek(this.b, r3)), 1));
            return;
        }
        if (i == 1) {
            defpackage.em emVar = (defpackage.em) ((defpackage.el) this.d).d;
            if (emVar.f == this.a) {
                ?? r1 = this.b;
                java.lang.Object obj = this.c;
                emVar.d = r1;
                emVar.e = j$.util.DesugarCollections.unmodifiableList((java.util.List) r1);
                ((defpackage.es) obj).b(emVar.a);
                emVar.a();
                return;
            }
            return;
        }
        if (i != 2) {
            java.lang.Object obj2 = ((ajwr) this.b).a;
            agxm agxmVar = new agxm();
            afec.c();
            ((agyj) obj2).b((agxi) this.c, (agye) this.d, agxmVar, ahyn.h(java.lang.Integer.valueOf(this.a)));
            return;
        }
        gat gatVar = (gat) this.c;
        aais.al((android.os.Handler) gatVar.c);
        java.lang.Object obj3 = gatVar.b;
        aagf aagfVar = (aagf) obj3;
        boolean zO = aagfVar.o();
        java.lang.Object obj4 = this.b;
        ?? r6 = this.d;
        if (zO) {
            gat.F((aajq) r6, (aagp) obj3, (zzx) obj4);
            return;
        }
        if (aagfVar.p()) {
            gatVar.G((aajq) r6, (zzx) obj4);
            return;
        }
        if (this.a - 1 != 0) {
            aajt aajtVar = (aajt) gatVar.e;
            ((zzx) obj4).h(aehj.bY(aajtVar.b.c() ? new com.google.android.gms.common.api.Status(8, "GmsClient is disconnected with SUCCESS connection status.", (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null) : aajtVar.b));
            return;
        }
        gatVar.G((aajq) r6, (zzx) obj4);
        int iL = aagfVar.d.l(aagfVar.b, 12800000);
        if (iL == 0) {
            aagfVar.m(new aagc(aagfVar));
        } else {
            aagfVar.J(1, (android.os.IInterface) null, -1);
            aagfVar.F(new aagc(aagfVar), iL, (android.app.PendingIntent) null);
        }
    }

    public el(defpackage.el elVar, int i, java.util.List list, defpackage.es esVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = list;
        this.c = esVar;
        this.d = elVar;
    }

    public el(defpackage.em emVar, java.util.List list, java.util.List list2, int i, int i2) {
        this.$cid = i2;
        this.b = list;
        this.c = list2;
        this.a = i;
        this.d = emVar;
    }

    public /* synthetic */ el(gat gatVar, int i, aajq aajqVar, zzx zzxVar, int i2) {
        this.$cid = i2;
        this.c = gatVar;
        this.a = i;
        this.d = aajqVar;
        this.b = zzxVar;
    }
}
