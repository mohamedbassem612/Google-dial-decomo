package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class y extends defpackage.ab {
    private final boolean b;
    private boolean c;
    private vx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cj cjVar, boolean z) {
        super(cjVar);
        aooh.f(cjVar, "operation");
        this.b = z;
    }

    public final vx a(android.content.Context context) {
        aooh.f(context, "context");
        if (this.c) {
            return this.d;
        }
        cj cjVar = this.a;
        vx vxVarBd = a.bd(context, cjVar.a, cjVar.h == 2, this.b);
        this.d = vxVarBd;
        this.c = true;
        return vxVarBd;
    }
}
