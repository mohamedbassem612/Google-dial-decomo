package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xng implements defpackage.xgk {
    public static final defpackage.xer a = new defpackage.xer(15);
    private final java.lang.String b;

    public xng(java.lang.String str) {
        this.b = str;
    }

    @Override // defpackage.xgk
    public final defpackage.xfz a() {
        return defpackage.xfz.TEST;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xng) && aooh.n(this.b, ((defpackage.xng) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.xgk, defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("com.android.onboarding.tasks.TestTaskInterrupt.VALUE", this.b);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "TestTaskInterrupt(value=" + this.b + ')';
    }
}
