package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dqa extends eac {
    final /* synthetic */ defpackage.dqc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqa(defpackage.dqc dqcVar) {
        super(1);
        this.a = dqcVar;
    }

    public final eax b(eax eaxVar, java.util.List list) {
        return this.a.j(eaxVar);
    }

    public final eab c(aiyy aiyyVar, eab eabVar) {
        dck dckVarO = this.a.x.o();
        if (!dckVarO.u()) {
            return eabVar;
        }
        long jL = dfd.l(dckVarO.k(0L));
        int iA = dpn.a(jL);
        if (iA < 0) {
            iA = 0;
        }
        int iB = dpn.b(jL);
        if (iB < 0) {
            iB = 0;
        }
        long jH = den.G(dckVarO).h();
        long j = jH >> 32;
        long j2 = jH & 4294967295L;
        long j3 = ((czc) dckVarO).c;
        long jL2 = dfd.l(dckVarO.k((((long) java.lang.Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L)));
        int iA2 = ((int) j) - dpn.a(jL2);
        if (iA2 < 0) {
            iA2 = 0;
        }
        int iB2 = ((int) j2) - dpn.b(jL2);
        int i = iB2 >= 0 ? iB2 : 0;
        if (iA == 0 && iB == 0 && iA2 == 0 && i == 0) {
            return eabVar;
        }
        return new eab(defpackage.dqc.l(eabVar.a, iA, iB, iA2, i), defpackage.dqc.l(eabVar.b, iA, iB, iA2, i));
    }
}
