package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xus implements defpackage.xuo {
    public final aca b = new defpackage.yfq();

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            aca acaVar = this.b;
            if (i >= ((aec) acaVar).d) {
                return;
            }
            ((defpackage.xur) acaVar.d(i)).a(acaVar.g(i), messageDigest);
            i++;
        }
    }

    public final java.lang.Object b(defpackage.xur xurVar) {
        aca acaVar = this.b;
        return acaVar.containsKey(xurVar) ? acaVar.get(xurVar) : xurVar.b;
    }

    public final void c(defpackage.xus xusVar) {
        this.b.i(xusVar.b);
    }

    public final void d(defpackage.xur xurVar, java.lang.Object obj) {
        this.b.put(xurVar, obj);
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xus) {
            return this.b.equals(((defpackage.xus) obj).b);
        }
        return false;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Options{values=" + this.b.toString() + '}';
    }
}
