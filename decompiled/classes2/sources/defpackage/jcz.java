package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jcz implements ysg {
    private final aoin a;
    private final iqm b;
    private final jbm c;

    public jcz(aoin aoinVar, iqm iqmVar, jbm jbmVar) {
        aooh.f(aoinVar, "targetModelVersion");
        aooh.f(jbmVar, "beeslySettings");
        this.a = aoinVar;
        this.b = iqmVar;
        this.c = jbmVar;
    }

    public final int a() {
        return 290;
    }

    public final /* synthetic */ long b() {
        return 50009L;
    }

    public final /* synthetic */ long c() {
        return 65384L;
    }

    public final java.lang.Integer d() {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf((int) ((java.lang.Number) this.a.a()).longValue());
        if (numValueOf.intValue() <= 0) {
            return null;
        }
        return numValueOf;
    }

    public final java.lang.Object e(aoln aolnVar) {
        return this.b.e() ? this.c.g(aolnVar) : java.lang.Boolean.FALSE;
    }

    public final /* synthetic */ void f() {
    }
}
