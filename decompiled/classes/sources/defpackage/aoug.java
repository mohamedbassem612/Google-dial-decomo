package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoug extends defpackage.aoue {
    private final defpackage.aoul a;
    private final defpackage.aouh b;
    private final defpackage.aosh c;
    private final java.lang.Object g;

    public aoug(defpackage.aoul aoulVar, defpackage.aouh aouhVar, defpackage.aosh aoshVar, java.lang.Object obj) {
        this.a = aoulVar;
        this.b = aouhVar;
        this.c = aoshVar;
        this.g = obj;
    }

    @Override // defpackage.aoue
    public final void a(java.lang.Throwable th) {
        c(null);
    }

    @Override // defpackage.aoue
    public final boolean b() {
        return false;
    }

    public final void c(aoux aouxVar) {
        boolean z = defpackage.aosu.a;
        defpackage.aoul aoulVar = this.a;
        defpackage.aouh aouhVar = this.b;
        defpackage.aosh aoshVar = this.c;
        defpackage.aosh aoshVarT = defpackage.aoul.T(aoshVar);
        java.lang.Object obj = this.g;
        if (aoshVarT == null || !aoulVar.R(aouhVar, aoshVarT, obj)) {
            aouhVar.a.j(2);
            defpackage.aosh aoshVarT2 = defpackage.aoul.T(aoshVar);
            if (aoshVarT2 == null || !aoulVar.R(aouhVar, aoshVarT2, obj)) {
                aoulVar.fx(aoulVar.C(aouhVar, obj, aouxVar));
            }
        }
    }
}
