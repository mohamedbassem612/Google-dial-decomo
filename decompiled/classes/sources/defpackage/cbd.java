package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class cbd {
    private final defpackage.cew a;

    public cbd(defpackage.aomy aomyVar) {
        this.a = new defpackage.ccg(aomyVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041 A[PHI: r4
      0x0041: PHI (r4v2 cew) = (r4v8 cew), (r4v9 cew) binds: [B:21:0x003f, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public static defpackage.cew c(defpackage.cdj cdjVar, defpackage.cew cewVar) {
        defpackage.cbh cbhVar;
        defpackage.cew cewVar2;
        defpackage.ceu ceuVar;
        defpackage.cbo cboVar;
        defpackage.cew cewVar3 = null;
        cewVar3 = null;
        cewVar3 = null;
        cewVar3 = null;
        cewVar3 = null;
        cewVar3 = null;
        if (cewVar instanceof defpackage.cbo) {
            if (cdjVar.e) {
                cboVar = (defpackage.cbo) cewVar;
                cboVar.a.b(cdjVar.a());
            }
        } else if (cewVar instanceof defpackage.ceu) {
            if ((cdjVar.b || cdjVar.f != null) && !cdjVar.e) {
                ceuVar = (defpackage.ceu) cewVar;
                if (defpackage.aooh.n(cdjVar.a(), ceuVar.a)) {
                    cewVar2 = cbhVar;
                    cewVar2 = ceuVar;
                    cewVar3 = cewVar2;
                }
            }
        } else if (cewVar instanceof defpackage.cbh) {
            cbhVar = (defpackage.cbh) cewVar;
            if (cdjVar.d == cbhVar.a) {
                cewVar2 = cbhVar;
                cewVar2 = ceuVar;
                cewVar3 = cewVar2;
            }
        }
        if (cewVar3 != null) {
            cewVar3 = cboVar;
            return cewVar3;
        }
        if (!cdjVar.e) {
            defpackage.aonj aonjVar = cdjVar.d;
            if (aonjVar != null) {
                cewVar3 = cboVar;
                return new defpackage.cbh(aonjVar);
            }
            cewVar3 = cboVar;
            return new defpackage.ceu(cdjVar.a());
        }
        java.lang.Object obj = cdjVar.f;
        defpackage.cen cenVar = cdjVar.c;
        if (cenVar == null) {
            cewVar3 = cboVar;
            cenVar = defpackage.cdu.c;
        }
        cewVar3 = cboVar;
        return new defpackage.cbo(new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cenVar));
    }

    public defpackage.cew a() {
        return this.a;
    }

    public abstract defpackage.cdj b(java.lang.Object obj);
}
