package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xmk extends defpackage.xmq {
    private final android.os.PersistableBundle a;

    public xmk(android.os.PersistableBundle persistableBundle) {
        this.a = persistableBundle;
    }

    @Override // defpackage.xnh
    public defpackage.xhn b() {
        throw null;
    }

    @Override // defpackage.xnh
    public /* bridge */ /* synthetic */ defpackage.xmq e(defpackage.xhi xhiVar) {
        throw null;
    }

    @Override // defpackage.xnh
    public final boolean h() {
        return true;
    }

    @Override // defpackage.xmq, defpackage.xnh, defpackage.xpa
    @com.android.onboarding.contracts.annotations.InternalOnboardingApi
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = super.toPersistableBundle();
        persistableBundle.putPersistableBundle("com.android.onboarding.task.RESULT", this.a);
        defpackage.xfh.i(persistableBundle, "com.android.onboarding.task.LAST_METADATA", b());
        return persistableBundle;
    }
}
