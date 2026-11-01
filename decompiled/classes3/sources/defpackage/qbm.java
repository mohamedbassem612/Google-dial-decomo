package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qbm implements zcs {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ aoin a;
    public final /* synthetic */ aoin b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ qbm(aoin aoinVar, aoin aoinVar2, defpackage.qbw qbwVar, int i) {
        this.$cid = i;
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = qbwVar;
    }

    public final boolean a() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.c;
            return pez.y(this.a, this.b, (defpackage.qbw) obj);
        }
        if (i == 1) {
            java.lang.Object obj2 = this.c;
            return pez.y(this.a, this.b, (defpackage.qbw) obj2);
        }
        if (i == 2) {
            java.lang.Object obj3 = this.c;
            return pez.y(this.a, this.b, (defpackage.qbw) obj3);
        }
        if (i == 3) {
            java.lang.Object obj4 = this.c;
            return pez.y(this.a, this.b, (defpackage.qbw) obj4);
        }
        if (i == 4) {
            java.lang.Object obj5 = this.c;
            return pez.y(this.a, this.b, (defpackage.qbw) obj5);
        }
        java.lang.Object obj6 = this.c;
        if (i != 5) {
            if (((defpackage.wca) obj6).a() && !((java.lang.Boolean) this.a.a()).booleanValue() && !((java.lang.Boolean) this.b.a()).booleanValue()) {
                return true;
            }
        } else if (((defpackage.wca) obj6).a() && (((java.lang.Boolean) this.a.a()).booleanValue() || ((java.lang.Boolean) this.b.a()).booleanValue())) {
            return true;
        }
        return false;
    }

    public /* synthetic */ qbm(defpackage.wca wcaVar, aoin aoinVar, aoin aoinVar2, int i) {
        this.$cid = i;
        this.c = wcaVar;
        this.a = aoinVar;
        this.b = aoinVar2;
    }
}
