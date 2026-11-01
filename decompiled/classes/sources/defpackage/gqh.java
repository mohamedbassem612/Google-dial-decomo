package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gqh implements defpackage.gqg {
    private final defpackage.gre b = defpackage.gus.J();

    public /* synthetic */ gqh() {
        new java.util.ArrayList(new defpackage.aojv(new java.lang.Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    @Override // defpackage.gqg
    public final defpackage.gqe a(android.app.Activity activity) {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        return defpackage.gus.I().a(activity, this.b);
    }

    @Override // defpackage.gqg
    public final defpackage.gqe b(android.content.Context context) {
        defpackage.aooh.f(context, "context");
        return defpackage.gus.I().d(context);
    }

    @Override // defpackage.gqg
    public final defpackage.gqe c(android.app.Activity activity) {
        defpackage.aooh.f(activity, "activity");
        return defpackage.gus.I().b(activity, this.b);
    }
}
