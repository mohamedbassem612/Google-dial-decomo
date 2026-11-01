package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ykr implements defpackage.yks {
    public final java.lang.String a;
    private final android.content.Context b;
    private final android.app.Activity c;
    private final ccp d;

    public ykr(java.lang.String str, android.content.Context context, android.app.Activity activity) {
        aooh.f(str, "permission");
        aooh.f(context, "context");
        aooh.f(activity, "activity");
        this.a = str;
        this.b = context;
        this.c = activity;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(d(), cdu.c);
    }

    private final defpackage.ykv d() {
        android.content.Context context = this.b;
        aooh.f(context, "<this>");
        java.lang.String str = this.a;
        aooh.f(str, "permission");
        if (dvx.c(context, str) == 0) {
            return defpackage.yku.a;
        }
        android.app.Activity activity = this.c;
        aooh.f(activity, "<this>");
        aooh.f(str, "permission");
        return new defpackage.ykt(dus.b(activity, str));
    }

    @Override // defpackage.yks
    public final defpackage.ykv a() {
        return (defpackage.ykv) this.d.a();
    }

    @Override // defpackage.yks
    public final java.lang.String b() {
        return this.a;
    }

    public final void c() {
        this.d.b(d());
    }
}
