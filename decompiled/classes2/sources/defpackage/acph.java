package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acph {
    public static final ayy a = den.bb(8.0f, 2);

    public static final defpackage.bod a(long j, long j2, long j3, cav cavVar, int i) {
        long jM = (i & 1) != 0 ? cfd.M(0) : j;
        long jT = (i & 2) != 0 ? abrz.t(17, cavVar) : j2;
        long jT2 = (i & 4) != 0 ? abrz.t(25, cavVar) : j3;
        long jH = cqg.h(abrz.t(17, cavVar), 0.38f);
        long jH2 = cqg.h(abrz.t(17, cavVar), 0.38f);
        int i2 = defpackage.bna.a;
        bor borVarAk = den.ak(cavVar);
        defpackage.bod bodVar = borVarAk.Z;
        if (bodVar == null) {
            bodVar = new defpackage.bod(cfd.M(0), bos.b(borVarAk, 17), bos.b(borVarAk, 25), bos.b(borVarAk, 25), cfd.M(0), cqg.h(bos.b(borVarAk, 17), 0.38f), cqg.h(bos.b(borVarAk, 17), 0.38f), cqg.h(bos.b(borVarAk, 17), 0.38f));
            borVarAk.Z = bodVar;
        }
        long j4 = jT2;
        return bodVar.b(jM, jT, j4, j4, cfd.M(0), jH, jH2, jH2);
    }
}
