package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adqp implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ adqp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object[] objArr = {((defpackage.adqh) this.b).a()};
            defpackage.ahvr.ay(objArr, 1);
            return ((defpackage.aogc) this.a).Z(new defpackage.aike(objArr, 1));
        }
        if (i != 1) {
            return ((defpackage.aogc) this.a).aa(((defpackage.adqh) this.b).c.c);
        }
        java.lang.Object obj = ((defpackage.ahbv) this.a).f;
        java.lang.Object obj2 = this.b;
        j$.util.Optional optionalS = defpackage.zjm.s((defpackage.zjm) obj, (android.telecom.PhoneAccountHandle) obj2);
        defpackage.okr okrVar = new defpackage.okr(obj2, 5);
        if (true == optionalS.isPresent()) {
            optionalS = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(!((defpackage.vcg) optionalS.get()).r((android.telecom.PhoneAccountHandle) okrVar.a)));
        }
        return (java.lang.Boolean) optionalS.orElse(java.lang.Boolean.FALSE);
    }
}
