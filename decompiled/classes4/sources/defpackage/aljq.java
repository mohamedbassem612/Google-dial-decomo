package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aljq {
    private static final aihd b = aihd.r(defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_SAY);
    public final java.util.List a = j$.util.DesugarCollections.synchronizedList(new java.util.ArrayList());

    public final aify a() {
        return aify.n(this.a);
    }

    public final void b(defpackage.almz almzVar) {
        this.a.add(almzVar);
    }

    public final void c(defpackage.almz almzVar) {
        aihd aihdVar = b;
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (aihdVar.contains(alnbVarB)) {
            b(almzVar);
        }
    }
}
