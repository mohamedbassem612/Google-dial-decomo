package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class adkd {
    public static defpackage.adkc g() {
        defpackage.adkc adkcVar = new defpackage.adkc();
        adkcVar.e(0L);
        adkcVar.b(0);
        adkcVar.d(1);
        adkcVar.a = com.google.android.libraries.micore.superpacks.base.BasePriority.a;
        return adkcVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract com.google.android.libraries.micore.superpacks.base.BasePriority d();

    public abstract defpackage.adhw e();

    public int f() {
        throw null;
    }

    public java.lang.String toString() {
        return "{" + e().toString() + ": " + c() + " bytes}";
    }
}
