package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kyz implements zob {
    private final defpackage.kxr a;
    private final ajct b;

    public kyz(defpackage.kxr kxrVar, ajct ajctVar) {
        this.a = kxrVar;
        this.b = ajctVar;
    }

    public final ajcq a() {
        defpackage.kxr kxrVar = this.a;
        if (!kxrVar.f()) {
            return ajcm.a;
        }
        kxrVar.d();
        return ahvr.I(kxrVar.a(), new defpackage.ibe(10), this.b);
    }
}
