package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class agoh {
    private final int a;

    public agoh(int i) {
        this.a = i;
    }

    public abstract android.os.Bundle a();

    public final android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("state_account_state_type", this.a - 1);
        return bundle;
    }
}
