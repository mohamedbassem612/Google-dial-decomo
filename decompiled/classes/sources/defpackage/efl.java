package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efl extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efl(defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.efl((defpackage.aoln) obj2, 0).b(defpackage.aojh.a);
        }
        if (i != 1) {
            new defpackage.efl((defpackage.aoln) obj2, 2, (char[]) null);
            defpackage.aojh aojhVar = defpackage.aojh.a;
            defpackage.aooc.af(aojhVar);
            return aojhVar;
        }
        new defpackage.efl((defpackage.aoln) obj2, 1, (byte[]) null);
        defpackage.aojh aojhVar2 = defpackage.aojh.a;
        defpackage.aooc.af(aojhVar2);
        return aojhVar2;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aooc.af(obj);
            return java.lang.Boolean.TRUE;
        }
        if (i != 1) {
            defpackage.aooc.af(obj);
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.efl(aolnVar, 2, (char[]) null) : new defpackage.efl(aolnVar, 1, (byte[]) null);
        }
        return new defpackage.efl(aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efl(defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efl(defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
    }
}
