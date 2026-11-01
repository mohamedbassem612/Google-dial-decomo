package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jgj extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgj(aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            bool.booleanValue();
            return c(bool, (aoln) obj2).b(aojh.a);
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        bool2.booleanValue();
        return c(bool2, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid == 0) {
            aooc.af(obj);
            return java.lang.Boolean.valueOf(this.a);
        }
        boolean z = this.a;
        aooc.af(obj);
        return java.lang.Boolean.valueOf(!z);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            defpackage.jgj jgjVar = new defpackage.jgj(aolnVar, 1, null);
            jgjVar.a = ((java.lang.Boolean) obj).booleanValue();
            return jgjVar;
        }
        defpackage.jgj jgjVar2 = new defpackage.jgj(aolnVar, 0);
        jgjVar2.a = ((java.lang.Boolean) obj).booleanValue();
        return jgjVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgj(aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}
