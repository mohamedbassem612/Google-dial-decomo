package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxy extends defpackage.acya {
    private final ajcq a;

    public acxy(ajcq ajcqVar) {
        this.a = ajcqVar;
    }

    @Override // defpackage.acyb
    public final int b() {
        return 2;
    }

    @Override // defpackage.acya, defpackage.acyb
    public final ajcq c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acyb)) {
            return false;
        }
        defpackage.acyb acybVar = (defpackage.acyb) obj;
        return acybVar.b() == 2 && this.a.equals(acybVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
