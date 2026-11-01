package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bhq implements defpackage.biw {
    public final android.view.View a;
    public final aomy b;
    public android.view.ActionMode f;
    public java.lang.Runnable g;
    public java.lang.Runnable h;
    private final nf i = new nf((char[]) null, (byte[]) null, (byte[]) null);
    public final clk c = new clk(new defpackage.bgf(this, 5));
    public final aonj d = new defpackage.bgf(this, 6);
    public final aonj e = new defpackage.bgf(this, 7);

    public bhq(android.view.View view, aomy aomyVar) {
        this.a = view;
        this.b = aomyVar;
    }

    public final java.lang.Object a(java.lang.Object obj, aonj aonjVar, aomy aomyVar) {
        aoot aootVar = new aoot();
        this.c.c(obj, aonjVar, new defpackage.ny(aootVar, aomyVar, 10, null));
        java.lang.Object obj2 = aootVar.a;
        if (obj2 != null) {
            return obj2;
        }
        aooh.j("result");
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.biw
    public final java.lang.Object b(defpackage.biv bivVar, aoln aolnVar) {
        defpackage.bho bhoVar;
        if (aolnVar instanceof defpackage.bho) {
            bhoVar = (defpackage.bho) aolnVar;
            int i = bhoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bhoVar.c = i - Integer.MIN_VALUE;
            } else {
                bhoVar = new defpackage.bho(this, aolnVar);
            }
        } else {
            bhoVar = new defpackage.bho(this, aolnVar);
        }
        java.lang.Object obj = bhoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = bhoVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            nf nfVar = this.i;
            defpackage.bhp bhpVar = new defpackage.bhp(this, bivVar, (aoln) null, 0);
            bhoVar.c = 1;
            if (nf.S(nfVar, bhpVar, bhoVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
