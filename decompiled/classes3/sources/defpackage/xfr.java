package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xfr extends defpackage.xfp {
    /* JADX INFO: renamed from: performParseResult, reason: collision with other method in class */
    public final void m58performParseResult(androidx.activity.result.ActivityResult activityResult) {
        aooh.f(activityResult, "result");
    }

    @Override // defpackage.xfp
    public final androidx.activity.result.ActivityResult performSetResult(aojh aojhVar) {
        aooh.f(aojhVar, "result");
        return new androidx.activity.result.ActivityResult(0, (android.content.Intent) null);
    }

    @Override // defpackage.xfp
    public /* bridge */ /* synthetic */ java.lang.Object performParseResult(androidx.activity.result.ActivityResult activityResult) {
        m58performParseResult(activityResult);
        return aojh.a;
    }
}
