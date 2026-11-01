package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acms implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ acms(int i, aonj aonjVar, cei ceiVar, ccp ccpVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.d = aonjVar;
        this.c = ceiVar;
        this.b = ccpVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [aonn, java.lang.Object] */
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            int i2 = this.a;
            java.lang.Object obj = this.d;
            new defpackage.acms(this.b, this.c, obj, i2, 3).a();
            return aojh.a;
        }
        if (i == 1) {
            java.lang.Object obj2 = this.c;
            int i3 = this.a;
            ((cei) obj2).h(i3);
            a.E((ccp) this.b, false);
            this.d.a(java.lang.Integer.valueOf(i3));
            return aojh.a;
        }
        if (i == 2) {
            java.lang.Object obj3 = this.c;
            java.lang.Object obj4 = this.b;
            if (obj4 == null) {
                ((defpackage.acmd) obj3).a.h();
            } else if (aooh.n(((defpackage.acmd) obj3).a.c(), obj4)) {
                ((defpackage.acmd) obj4).a.i(obj3);
            } else {
                this.d.a(java.lang.Integer.valueOf(this.a), "CVE is already removed from parent");
            }
            return aojh.a;
        }
        if (i != 3) {
            int i4 = this.a;
            java.lang.Object obj5 = this.d;
            this.b.t((erh) this.c, (erh) obj5, i4);
            return aojh.a;
        }
        java.lang.Object obj6 = this.c;
        java.lang.Object obj7 = this.b;
        if (obj7 == null) {
            ((defpackage.acmd) obj6).a.g();
        } else {
            java.lang.Object objC = ((defpackage.acmd) obj6).a.c();
            if (objC != null) {
                int i5 = this.a;
                ?? r6 = this.d;
                if (aooh.n(objC, obj7)) {
                    r6.a(java.lang.Integer.valueOf(i5), "CVE is already linked to the same parent");
                } else {
                    r6.a(java.lang.Integer.valueOf(i5), "CVE is already linked to a different parent");
                }
            } else {
                ((defpackage.acmd) obj7).a.d(obj6);
            }
        }
        return aojh.a;
    }

    public /* synthetic */ acms(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = i;
    }
}
