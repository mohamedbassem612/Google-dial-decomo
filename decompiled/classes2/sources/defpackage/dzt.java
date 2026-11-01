package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class dzt implements defpackage.dyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.view.ViewConfiguration a;

    public /* synthetic */ dzt(android.view.ViewConfiguration viewConfiguration, int i) {
        this.$cid = i;
        this.a = viewConfiguration;
    }

    @Override // defpackage.dyc
    public final java.lang.Object a() {
        int i = this.$cid;
        android.view.ViewConfiguration viewConfiguration = this.a;
        return i != 0 ? java.lang.Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity()) : java.lang.Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
    }
}
