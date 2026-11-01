package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class bdq {
    public abstract defpackage.aodd c();

    public final int d() {
        return c().b;
    }

    public final java.lang.Object e(int i) {
        defpackage.apnb apnbVarB = c().b(i);
        return ((defpackage.bdp) apnbVarB.c).b().a(java.lang.Integer.valueOf(i - apnbVarB.b));
    }

    public final java.lang.Object f(int i) {
        java.lang.Object objA;
        defpackage.apnb apnbVarB = c().b(i);
        int i2 = i - apnbVarB.b;
        defpackage.aonj aonjVarA = ((defpackage.bdp) apnbVarB.c).a();
        return (aonjVarA == null || (objA = aonjVarA.a(java.lang.Integer.valueOf(i2))) == null) ? new androidx.compose.foundation.lazy.layout.DefaultLazyKey(i) : objA;
    }
}
