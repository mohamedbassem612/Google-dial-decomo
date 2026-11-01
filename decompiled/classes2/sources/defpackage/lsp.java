package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lsp extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsp(boolean z, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = z;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return new defpackage.lsp(this.a, (aoln) obj, 1, null).b(aojh.a);
        }
        return new defpackage.lsp(this.a, (aoln) obj, 0).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid != 0) {
            aooc.af(obj);
            if (this.a) {
                return pdw.c;
            }
            return null;
        }
        aooc.af(obj);
        if (this.a) {
            return pmq.b;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsp(boolean z, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.a = z;
    }
}
