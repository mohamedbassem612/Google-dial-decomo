package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anle implements defpackage.anld {
    private static final aeyr a;
    private static final aeyr b;

    static {
        adag adagVar = defpackage.anju.b;
        a = adagVar.v("12", true);
        b = adagVar.v("11", true);
    }

    @Override // defpackage.anld
    public final boolean a(android.content.Context context) {
        return ((java.lang.Boolean) a.fa(context)).booleanValue();
    }

    @Override // defpackage.anld
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fa(context)).booleanValue();
    }
}
