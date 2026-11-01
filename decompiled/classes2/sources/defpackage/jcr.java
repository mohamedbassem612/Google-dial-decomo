package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jcr implements rvd {
    private final android.content.Context a;
    private final rlv b;

    public jcr(android.content.Context context, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        this.a = context;
        this.b = rlvVar;
    }

    public final android.content.Intent a() {
        return afsq.bP();
    }

    public final aw b() {
        this.b.o(rmx.xl);
        defpackage.jci jciVar = new defpackage.jci();
        amxr.g(jciVar);
        return jciVar;
    }

    public final aw c(rvq rvqVar) {
        aooh.f(rvqVar, "config");
        int i = rvqVar.c;
        if (i == 2) {
            if ((i == 2 ? (rvo) rvqVar.d : rvo.a).b == 9) {
                rvo rvoVar = rvqVar.c == 2 ? (rvo) rvqVar.d : rvo.a;
                if ((rvoVar.b == 9 ? (rvg) rvoVar.c : rvg.a).b) {
                    return defpackage.hhb.h();
                }
            }
        }
        return b();
    }

    public final ajcq d() {
        return anar.u();
    }

    public final ajcq e() {
        return aiql.z(j$.util.Optional.of(new rvb(this.a.getDrawable(2131231940), ruz.a, rvc.J, new rva(2132017558))));
    }
}
