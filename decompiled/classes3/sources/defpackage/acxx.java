package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxx extends defpackage.acya {
    private final defpackage.acui a;

    public acxx(defpackage.acui acuiVar) {
        this.a = acuiVar;
    }

    @Override // defpackage.acya, defpackage.acyb
    public final defpackage.acui a() {
        return this.a;
    }

    @Override // defpackage.acyb
    public final int b() {
        return 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acyb)) {
            return false;
        }
        defpackage.acyb acybVar = (defpackage.acyb) obj;
        return acybVar.b() == 3 && this.a.equals(acybVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
