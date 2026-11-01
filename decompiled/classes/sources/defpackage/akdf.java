package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akdf extends defpackage.aipo {
    private final defpackage.aify a;

    public akdf(java.lang.String str, defpackage.aify aifyVar) {
        super(str);
        this.a = aifyVar;
    }

    @Override // defpackage.aion
    public final void a(defpackage.aiom aiomVar) {
        int i = 0;
        while (true) {
            defpackage.aify aifyVar = this.a;
            if (i >= ((defpackage.aike) aifyVar).d) {
                return;
            }
            defpackage.aion aionVar = (defpackage.aion) aifyVar.get(i);
            if (aiomVar.U() || aionVar.b(aiomVar.r())) {
                aionVar.a(aiomVar);
            }
            i++;
        }
    }

    @Override // defpackage.aion
    public final boolean b(java.util.logging.Level level) {
        int i = 0;
        while (true) {
            defpackage.aify aifyVar = this.a;
            if (i >= ((defpackage.aike) aifyVar).d) {
                return false;
            }
            if (((defpackage.aion) aifyVar.get(i)).b(level)) {
                return true;
            }
            i++;
        }
    }
}
