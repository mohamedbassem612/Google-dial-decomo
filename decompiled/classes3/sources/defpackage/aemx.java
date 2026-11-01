package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aemx extends defpackage.aemt {
    public static final ahyc a = new defpackage.aemx();

    @Override // defpackage.aemt
    public final void a(defpackage.aafw aafwVar, aemc aemcVar) {
        if (!aafwVar.g() || "null".equals(aafwVar.e())) {
            return;
        }
        aemcVar.c = aafwVar.e();
    }

    @Override // defpackage.aemt
    public final void b(defpackage.aafw aafwVar, aemc aemcVar) {
        if (!aafwVar.h() || "null".equals(aafwVar.f())) {
            return;
        }
        aemcVar.b = aafwVar.f();
    }

    @Override // defpackage.aemt
    public final void c(defpackage.aafw aafwVar, aemc aemcVar) {
        aemd aemdVar;
        int iA = aafwVar.a("is_dasher");
        if (iA != 1) {
            aemdVar = iA != 2 ? aemd.a : aemd.b;
        } else {
            aemdVar = aemd.c;
        }
        aemcVar.c(aemdVar);
    }
}
