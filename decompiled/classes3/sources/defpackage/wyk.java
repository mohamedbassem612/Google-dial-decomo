package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wyk implements defpackage.wyj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wyk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, wyh] */
    /* JADX WARN: Type inference failed for: r4v13, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, wyh] */
    @Override // defpackage.wyj
    public final defpackage.wyi a(int i) {
        aify aifyVarQ;
        int i2 = this.$cid;
        if (i2 == 0) {
            return defpackage.wyi.a(((java.lang.Integer) this.a.a(i).get(0)).intValue());
        }
        if (i2 == 1) {
            return defpackage.wyi.b(((java.lang.Integer) this.a.a(i).get(1)).intValue(), "GB");
        }
        int i3 = i - 1;
        if (i3 == 0) {
            aifyVarQ = aify.q(2131951692, 2131951693);
        } else if (i3 != 1) {
            aifyVarQ = i3 != 2 ? aify.p(2131951695) : aify.p(2131951691);
        } else {
            aifyVarQ = aify.p(2131951694);
        }
        if (i3 != 0) {
            return defpackage.wyi.a(((java.lang.Integer) aifyVarQ.get(0)).intValue());
        }
        java.lang.String str = (java.lang.String) this.a.a();
        int iHashCode = str.hashCode();
        if (iHashCode != 2715) {
            if (iHashCode == 2716 && str.equals("V2")) {
                return defpackage.wyi.b(((java.lang.Integer) aifyVarQ.get(1)).intValue(), "V2");
            }
        } else if (str.equals("V1")) {
            return defpackage.wyi.b(((java.lang.Integer) aifyVarQ.get(0)).intValue(), "V1");
        }
        return defpackage.wyi.a(((java.lang.Integer) aifyVarQ.get(0)).intValue());
    }
}
