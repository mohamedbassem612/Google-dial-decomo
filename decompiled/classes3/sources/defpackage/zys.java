package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zys implements epb {
    final /* synthetic */ com.google.android.gms.auth.api.signin.internal.SignInHubActivity a;

    public zys(com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity) {
        j$.util.Objects.requireNonNull(signInHubActivity);
        this.a = signInHubActivity;
    }

    public final /* bridge */ /* synthetic */ void a(epl eplVar, java.lang.Object obj) {
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.n, signInHubActivity.o);
        signInHubActivity.finish();
    }

    public final epl c(int i) {
        return new defpackage.zyg(this.a, aade.a());
    }

    public final void b(epl eplVar) {
    }
}
