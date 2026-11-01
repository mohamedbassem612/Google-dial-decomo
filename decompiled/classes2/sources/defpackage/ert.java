package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ert {
    public static final defpackage.ert a = new defpackage.ert(aike.a);
    public final aify b;

    static {
        java.lang.String str = eum.a;
    }

    public ert(java.util.List list) {
        this.b = aify.n(list);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            aify aifyVar = this.b;
            if (i2 >= aifyVar.size()) {
                return false;
            }
            defpackage.ers ersVar = (defpackage.ers) aifyVar.get(i2);
            for (boolean z : ersVar.c) {
                if (z) {
                    if (ersVar.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ahvr.aP(this.b, ((defpackage.ert) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
