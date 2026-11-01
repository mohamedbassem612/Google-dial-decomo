package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ovy implements defpackage.ackv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ aoin a;
    public final /* synthetic */ aoss b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ovy(aoin aoinVar, aoss aossVar, defpackage.ovw ovwVar, aazc aazcVar, int i) {
        this.$cid = i;
        this.a = aoinVar;
        this.b = aossVar;
        this.c = ovwVar;
        this.d = aazcVar;
    }

    public final /* synthetic */ ajcq a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return b();
        }
        if (i == 1) {
            return b();
        }
        if (i != 2) {
            return b();
        }
        return b();
    }

    @Override // defpackage.ackv
    public final ajcq b() {
        int i = this.$cid;
        if (i == 0) {
            if (!((java.lang.Boolean) this.a.a()).booleanValue()) {
                return aiql.z(defpackage.abxl.L("ANY_ANSWERED_INCOMING_CALL_IN_LAST_24_HOURS", 0));
            }
            java.lang.Object obj = this.d;
            return aosv.F(this.b, 0, new ohh((defpackage.ovw) this.c, (aazc) obj, (aoln) null, 9), 3);
        }
        if (i == 1) {
            java.lang.Object obj2 = this.d;
            return aosv.F(this.b, 0, new jnq((jnn) this.c, this.a, (ifb) obj2, (aoln) null, 0), 3);
        }
        aoin aoinVar = this.a;
        if (i != 2) {
            if (!((java.lang.Boolean) aoinVar.a()).booleanValue() || !((smx) this.d).a()) {
                return aiql.z(defpackage.abxl.L("HAS_MY_CALLING_CARD", 0));
            }
            return aosv.F(this.b, 0, new defpackage.roy((defpackage.sfa) this.c, (aoln) null, 17), 3);
        }
        if (!((java.lang.Boolean) aoinVar.a()).booleanValue() || !((smx) this.d).a()) {
            return aiql.z(defpackage.abxl.L("MY_CALLING_CARD_AVAILABLE", 0));
        }
        return aosv.F(this.b, 0, new defpackage.roy((sah) this.c, (aoln) null, 18), 3);
    }

    public /* synthetic */ ovy(aoin aoinVar, smx smxVar, aoss aossVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = aoinVar;
        this.d = smxVar;
        this.b = aossVar;
        this.c = obj;
    }

    public /* synthetic */ ovy(aoss aossVar, jnn jnnVar, aoin aoinVar, ifb ifbVar, int i) {
        this.$cid = i;
        this.b = aossVar;
        this.c = jnnVar;
        this.a = aoinVar;
        this.d = ifbVar;
    }
}
