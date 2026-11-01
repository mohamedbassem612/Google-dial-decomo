package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acjs extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ defpackage.acjt b;
    final /* synthetic */ akkd c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acjs(defpackage.acjt acjtVar, akkd akkdVar, int i, int i2, aoln aolnVar, int i3) {
        super(2, aolnVar);
        this.$cid = i3;
        this.b = acjtVar;
        this.c = akkdVar;
        this.d = i;
        this.e = i2;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        aolu aoluVar;
        if (this.$cid != 0) {
            aoluVar = aolu.a;
            int i = this.a;
            aooc.af(obj);
            if (i != 0) {
                return obj;
            }
            defpackage.acjt acjtVar = this.b;
            akjk akjkVar = this.c.e;
            if (akjkVar == null) {
                akjkVar = akjk.a;
            }
            java.lang.String str = akjkVar.b == 1 ? (java.lang.String) akjkVar.c : "";
            defpackage.wsk wskVar = acjtVar.c;
            aooh.e(str, "getImageUrl(...)");
            int i2 = this.d;
            int i3 = this.e;
            this.a = 1;
            java.lang.Object objAj = aoov.aj((aolr) wskVar.c, new defpackage.aegz(wskVar, str, i2, i3, null), this);
            if (objAj != aoluVar) {
                return objAj;
            }
        } else {
            aoluVar = aolu.a;
            int i4 = this.a;
            aooc.af(obj);
            if (i4 != 0) {
                return obj;
            }
            akjk akjkVar2 = this.c.e;
            if (akjkVar2 == null) {
                akjkVar2 = akjk.a;
            }
            aooh.e(akjkVar2.b == 1 ? (java.lang.String) akjkVar2.c : "", "getImageUrl(...)");
            this.a = 1;
            aolu adubVar = new adub((java.lang.Object) null);
            if (adubVar != aoluVar) {
                return adubVar;
            }
        }
        return aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return this.$cid != 0 ? new defpackage.acjs(this.b, this.c, this.d, this.e, aolnVar, 1, null) : new defpackage.acjs(this.b, this.c, this.d, this.e, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acjs(defpackage.acjt acjtVar, akkd akkdVar, int i, int i2, aoln aolnVar, int i3, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i3;
        this.b = acjtVar;
        this.c = akkdVar;
        this.d = i;
        this.e = i2;
    }
}
