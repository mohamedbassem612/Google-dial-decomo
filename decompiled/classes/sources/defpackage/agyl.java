package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agyl implements defpackage.agxy {
    public final /* synthetic */ defpackage.agym a;

    public agyl(defpackage.agym agymVar) {
        j$.util.Objects.requireNonNull(agymVar);
        this.a = agymVar;
    }

    @Override // defpackage.agxy
    public final void a(defpackage.agxx agxxVar) {
        boolean zQ;
        int iOrdinal = agxxVar.c.ordinal();
        if (iOrdinal == 0) {
            zQ = defpackage.anty.Q(this.a.d, null, defpackage.agxv.a);
        } else {
            if (iOrdinal != 1) {
                throw new java.lang.IllegalStateException("Unrecognized CallReason: ".concat(agxxVar.toString()));
            }
            java.util.concurrent.atomic.AtomicReference atomicReference = this.a.d;
            defpackage.agxv agxvVar = defpackage.agxv.a;
            defpackage.agxv agxvVar2 = defpackage.agxv.b;
            if (defpackage.anty.Q(atomicReference, agxvVar, agxvVar2)) {
                return;
            } else {
                zQ = defpackage.anty.Q(atomicReference, null, agxvVar2);
            }
        }
        if (zQ) {
            defpackage.agym agymVar = this.a;
            agymVar.a.execute(new defpackage.abqg(this, 20));
        }
    }
}
