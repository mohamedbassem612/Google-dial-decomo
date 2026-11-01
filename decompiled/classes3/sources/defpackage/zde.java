package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zde {
    public static final aimz a = aimz.i("com/google/android/callingshared/logging/appinfo/AppInfo");
    public final android.content.Context b;
    public final aolr c;
    private final aonj d;

    public zde(android.content.Context context, aolr aolrVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        this.b = context;
        this.c = aolrVar;
        this.d = new aiuo(new defpackage.wbi(this, (aoln) null, 10));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.zdd zddVar;
        if (aolnVar instanceof defpackage.zdd) {
            zddVar = (defpackage.zdd) aolnVar;
            int i = zddVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zddVar.c = i - Integer.MIN_VALUE;
            } else {
                zddVar = new defpackage.zdd(this, aolnVar);
            }
        } else {
            zddVar = new defpackage.zdd(this, aolnVar);
        }
        java.lang.Object objA = zddVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zddVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            zddVar.c = 1;
            objA = this.d.a(zddVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        return ((defpackage.zdc) objA).a;
    }
}
