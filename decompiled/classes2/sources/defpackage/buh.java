package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class buh implements aonj {
    final /* synthetic */ boolean a;
    final /* synthetic */ defpackage.bun b;
    final /* synthetic */ boolean c;
    final /* synthetic */ aonj d;
    final /* synthetic */ boolean e;

    public buh(boolean z, defpackage.bun bunVar, boolean z2, aonj aonjVar, boolean z3) {
        this.a = z;
        this.b = bunVar;
        this.c = z2;
        this.d = aonjVar;
        this.e = z3;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        android.view.KeyEvent keyEvent = ((defpackage.cui) obj).a;
        if (!this.a) {
            return java.lang.Boolean.FALSE;
        }
        defpackage.bun bunVar = this.b;
        aopm aopmVar = bunVar.f;
        float fD = bunVar.d();
        int iJ = un.j(keyEvent);
        if (!a.x(iJ, 2)) {
            if (!a.x(iJ, 1)) {
                return java.lang.Boolean.FALSE;
            }
            if (this.e) {
                long jK = un.k(keyEvent);
                return (anty.ah(jK, un.h(19)) || anty.ah(jK, un.h(-1000000001)) || anty.ah(jK, un.h(20)) || anty.ah(jK, un.h(-1000000002)) || anty.ah(jK, un.h(122)) || anty.ah(jK, un.h(-1000000005)) || anty.ah(jK, un.h(123)) || anty.ah(jK, un.h(-1000000006)) || anty.ah(jK, un.h(92)) || anty.ah(jK, un.h(-1000000007)) || anty.ah(jK, un.h(93)) || anty.ah(jK, un.h(-1000000008))) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            }
            long jK2 = un.k(keyEvent);
            return (anty.ah(jK2, un.h(22)) || anty.ah(jK2, un.h(-1000000004)) || anty.ah(jK2, un.h(21)) || anty.ah(jK2, un.h(-1000000003)) || anty.ah(jK2, un.h(122)) || anty.ah(jK2, un.h(-1000000005)) || anty.ah(jK2, un.h(123)) || anty.ah(jK2, un.h(-1000000006)) || anty.ah(jK2, un.h(92)) || anty.ah(jK2, un.h(-1000000007)) || anty.ah(jK2, un.h(93)) || anty.ah(jK2, un.h(-1000000008))) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        }
        float fAbs = java.lang.Math.abs(((java.lang.Number) aopmVar.a()).floatValue() - ((java.lang.Number) aopmVar.b()).floatValue()) / 100.0f;
        int i = true == this.c ? -1 : 1;
        if (anty.ah(un.k(keyEvent), un.h(122)) || anty.ah(un.k(keyEvent), un.h(-1000000005))) {
            this.d.a(aopmVar.b());
            return java.lang.Boolean.TRUE;
        }
        if (anty.ah(un.k(keyEvent), un.h(123)) || anty.ah(un.k(keyEvent), un.h(-1000000006))) {
            this.d.a(aopmVar.a());
            return java.lang.Boolean.TRUE;
        }
        if (this.e) {
            long jK3 = un.k(keyEvent);
            if (anty.ah(jK3, un.h(19)) || anty.ah(jK3, un.h(-1000000001))) {
                this.d.a(aooc.D(java.lang.Float.valueOf(fD - (i * fAbs)), aopmVar));
                return java.lang.Boolean.TRUE;
            }
            if (anty.ah(jK3, un.h(20)) || anty.ah(jK3, un.h(-1000000002))) {
                this.d.a(aooc.D(java.lang.Float.valueOf(fD + (i * fAbs)), aopmVar));
                return java.lang.Boolean.TRUE;
            }
            if (anty.ah(jK3, un.h(92)) || anty.ah(jK3, un.h(-1000000007))) {
                this.d.a(aooc.D(java.lang.Float.valueOf(fD - ((i * 10) * fAbs)), aopmVar));
                return java.lang.Boolean.TRUE;
            }
            if (!anty.ah(jK3, un.h(93)) && !anty.ah(jK3, un.h(-1000000008))) {
                return java.lang.Boolean.FALSE;
            }
            this.d.a(aooc.D(java.lang.Float.valueOf(fD + (i * 10 * fAbs)), aopmVar));
            return java.lang.Boolean.TRUE;
        }
        long jK4 = un.k(keyEvent);
        if (anty.ah(jK4, un.h(22)) || anty.ah(jK4, un.h(-1000000004))) {
            this.d.a(aooc.D(java.lang.Float.valueOf(fD + (i * fAbs)), aopmVar));
            return java.lang.Boolean.TRUE;
        }
        if (anty.ah(jK4, un.h(21)) || anty.ah(jK4, un.h(-1000000003))) {
            this.d.a(aooc.D(java.lang.Float.valueOf(fD - (i * fAbs)), aopmVar));
            return java.lang.Boolean.TRUE;
        }
        if (anty.ah(jK4, un.h(92)) || anty.ah(jK4, un.h(-1000000007))) {
            this.d.a(aooc.D(java.lang.Float.valueOf(fD + (fAbs * 10.0f)), aopmVar));
            return java.lang.Boolean.TRUE;
        }
        if (!anty.ah(jK4, un.h(93)) && !anty.ah(jK4, un.h(-1000000008))) {
            return java.lang.Boolean.FALSE;
        }
        this.d.a(aooc.D(java.lang.Float.valueOf(fD - (fAbs * 10.0f)), aopmVar));
        return java.lang.Boolean.TRUE;
    }
}
