package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class acri implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ acri(aciv acivVar, defpackage.bwj bwjVar, ccp ccpVar, int i) {
        this.$cid = i;
        this.a = acivVar;
        this.c = bwjVar;
        this.b = ccpVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [eri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [erg, java.lang.Object] */
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            j$.util.Map.-EL.remove((java.util.Map) ((vqy) this.b).c, this.a, this.c);
            return aojh.a;
        }
        if (i == 1) {
            ((aciv) this.a).d.a();
            a.B((ccp) this.b);
            ((defpackage.bwj) this.c).b();
            return aojh.a;
        }
        java.lang.Object obj = this.c;
        if (i == 2) {
            return ((zzx) this.a).s(((agoo) this.b).f((com.google.apps.tiktok.account.AccountId) obj).b);
        }
        this.b.M((defpackage.eri) this.a, (defpackage.erf) obj);
        return aojh.a;
    }

    public /* synthetic */ acri(agoo agooVar, com.google.apps.tiktok.account.AccountId accountId, zzx zzxVar, int i) {
        this.$cid = i;
        this.b = agooVar;
        this.c = accountId;
        this.a = zzxVar;
    }

    public /* synthetic */ acri(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
