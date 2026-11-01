package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbp extends defpackage.dag {
    @Override // defpackage.dag
    public final int a(defpackage.dck dckVar, defpackage.cwk cwkVar) {
        defpackage.dbu dbuVarD = dckVar.D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD.dm(cwkVar);
    }

    @Override // defpackage.dag
    protected final long b(defpackage.dck dckVar, long j) {
        defpackage.dbu dbuVarD = dckVar.D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        long j2 = dbuVarD.h;
        return defpackage.mni.bl((((long) java.lang.Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L), j);
    }

    @Override // defpackage.dag
    public final java.util.Map c(defpackage.dck dckVar) {
        defpackage.dbu dbuVarD = dckVar.D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD.L().f();
    }
}
