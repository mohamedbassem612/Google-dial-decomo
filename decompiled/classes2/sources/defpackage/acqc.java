package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acqc {
    public static final defpackage.drs a = new defpackage.drs(true, true, 1002, 1536);
    public static final float b = 3.0f;
    public static final awa c;
    public static final ayy d;
    public static final ayy e;

    static {
        azc azcVar;
        defpackage.drs drsVar = defpackage.bra.a;
        c = defpackage.bra.a(true, true);
        d = defpackage.bra.c;
        if (((java.lang.Boolean) bsi.a.a()).booleanValue()) {
            float f = defpackage.bra.d;
            azcVar = new azc(16.0f, f, 10.0f, f);
        } else {
            int i = defpackage.brj.a;
            float f2 = defpackage.bra.d;
            azcVar = new azc(12.0f, f2, 12.0f, f2);
        }
        e = azcVar;
        if (((java.lang.Boolean) bsi.a.a()).booleanValue()) {
            den.bc(0.0f, 0.0f, 6.0f, 0.0f, 10);
        } else {
            new azc(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public static final defpackage.brb a(cav cavVar) {
        defpackage.drs drsVar = defpackage.bra.a;
        bor borVarAk = den.ak(cavVar);
        defpackage.brb brbVar = borVarAk.ah;
        if (brbVar != null) {
            return brbVar;
        }
        defpackage.brb brbVar2 = new defpackage.brb(bos.b(borVarAk, 17), bos.b(borVarAk, 18), bos.b(borVarAk, 18), cqg.h(bos.b(borVarAk, 17), 0.38f), cqg.h(bos.b(borVarAk, 17), 0.38f), cqg.h(bos.b(borVarAk, 17), 0.38f), cfd.M(0), cfd.M(0));
        borVarAk.ah = brbVar2;
        return brbVar2;
    }
}
