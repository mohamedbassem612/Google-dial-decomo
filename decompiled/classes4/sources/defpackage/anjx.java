package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anjx implements defpackage.anjw {
    private static final aeyr a;
    private static final aeyr b;
    private static final aeyr c;

    static {
        adag adagVar = defpackage.anju.b;
        a = adagVar.u("7", "SURVEYS");
        b = adagVar.v("9", false);
        c = adagVar.v("6", true);
    }

    @Override // defpackage.anjw
    public final java.lang.String a(android.content.Context context) {
        return (java.lang.String) a.fa(context);
    }

    @Override // defpackage.anjw
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fa(context)).booleanValue();
    }

    @Override // defpackage.anjw
    public final boolean c(android.content.Context context) {
        return ((java.lang.Boolean) c.fa(context)).booleanValue();
    }
}
