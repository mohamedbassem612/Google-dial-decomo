package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxz extends defpackage.acya {
    private final defpackage.acvu a;

    public acxz(defpackage.acvu acvuVar) {
        this.a = acvuVar;
    }

    @Override // defpackage.acyb
    public final int b() {
        return 1;
    }

    @Override // defpackage.acya, defpackage.acyb
    public final defpackage.acvu d() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acyb)) {
            return false;
        }
        defpackage.acyb acybVar = (defpackage.acyb) obj;
        return acybVar.b() == 1 && this.a.equals(acybVar.d());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
