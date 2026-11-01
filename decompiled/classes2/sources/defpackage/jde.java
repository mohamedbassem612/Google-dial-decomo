package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jde implements defpackage.koe {
    private final android.content.Context a;
    private final isj b;
    private final iqm c;
    private final rsr d;

    public jde(android.content.Context context, isj isjVar, iqm iqmVar, rsr rsrVar) {
        aooh.f(context, "appContext");
        aooh.f(isjVar, "beeslyCallLogDataIntegration");
        this.a = context;
        this.b = isjVar;
        this.c = iqmVar;
        this.d = rsrVar;
    }

    @Override // defpackage.koe
    public final defpackage.kod a(kiu kiuVar) {
        isq isqVar;
        java.lang.String string;
        aooh.f(kiuVar, "row");
        isj isjVar = this.b;
        if (!defpackage.hgz.aa(kiuVar, isjVar, this.d) || this.c.d() || (isqVar = (isq) defpackage.hgt.w(kiuVar, isjVar)) == null) {
            return null;
        }
        if (defpackage.hgz.s(isqVar)) {
            string = this.a.getString(2132017564);
        } else {
            string = defpackage.hgz.r(isqVar) ? this.a.getString(2132017565) : isqVar.e;
        }
        aooh.c(string);
        return new defpackage.kod(string, 2132086234);
    }
}
