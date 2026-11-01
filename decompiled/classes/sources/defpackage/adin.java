package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class adin {
    public static final defpackage.adin f = new defpackage.adil(com.google.android.libraries.micore.superpacks.base.BasePriority.a, 0, 0, 0, 0, 0);

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract com.google.android.libraries.micore.superpacks.base.BasePriority f();

    public final boolean g(boolean z) {
        int iC = c();
        if (iC == 1) {
            return true;
        }
        if (iC == 2) {
            return false;
        }
        return z;
    }

    public java.lang.String toString() {
        return "{" + defpackage.adik.a(c(), b(), d(), a()) + ", " + defpackage.adik.g(e()) + ", p " + f().toString() + '}';
    }
}
