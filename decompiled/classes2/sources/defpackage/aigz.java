package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aigz implements java.io.Serializable {
    private static final long serialVersionUID = 4183982527943143214L;
    private final aify a;

    public aigz(aify aifyVar) {
        this.a = aifyVar;
    }

    java.lang.Object readResolve() {
        aify aifyVar = this.a;
        if (aifyVar.isEmpty()) {
            return defpackage.aiha.a;
        }
        return ahvr.aP(aifyVar, aify.p(defpackage.aikb.a)) ? defpackage.aiha.b : new defpackage.aiha(aifyVar);
    }
}
