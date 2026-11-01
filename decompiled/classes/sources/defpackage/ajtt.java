package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajtt implements defpackage.ajwe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ajtt(android.content.Context context, java.lang.String str, int i) {
        this.$cid = i;
        this.b = context;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ajtq, java.lang.Object] */
    @Override // defpackage.ajwe
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ajtp ajtpVar = (defpackage.ajtp) this.b;
            return ajtpVar.f.a(new defpackage.ajuk(ajtpVar, this.a));
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            return new defpackage.ajyk((android.content.Context) this.b, (java.lang.String) obj);
        }
        defpackage.ajtc ajtcVar = (defpackage.ajtc) obj;
        defpackage.ajtv ajtvVar = ajtcVar.c;
        java.lang.String strF = ajtcVar.f();
        return new defpackage.ajwz((android.content.Context) this.b, strF);
    }

    public /* synthetic */ ajtt(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
