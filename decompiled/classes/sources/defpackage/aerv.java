package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerv {
    public final android.content.Context a;
    final defpackage.aoin b;
    final defpackage.aoin c;
    final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final defpackage.aoin g;
    public final defpackage.aoin h;
    public final defpackage.aoin i;
    public final defpackage.aoin j;
    public final defpackage.aoin k;
    public final defpackage.aoin l;
    public final defpackage.aoin m;
    public final defpackage.aoin n;
    public final defpackage.aoin o;
    public final defpackage.aevd p;

    public aerv(android.content.Context context, defpackage.aevd aevdVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8, defpackage.aoin aoinVar9, defpackage.aoin aoinVar10, defpackage.aoin aoinVar11, defpackage.aoin aoinVar12, defpackage.aoin aoinVar13, defpackage.aoin aoinVar14) {
        this.a = context;
        this.p = aevdVar;
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.h = aoinVar7;
        this.i = aoinVar8;
        this.j = aoinVar9;
        this.f = aoinVar5;
        this.g = aoinVar6;
        this.k = aoinVar10;
        this.l = aoinVar11;
        this.m = aoinVar12;
        this.n = aoinVar13;
        this.o = aoinVar14;
    }

    public static defpackage.aify a(ammj ammjVar, java.util.Map map, long j) {
        defpackage.aift aiftVar = new defpackage.aift(4);
        long j2 = 0;
        for (ammh ammhVar : ammjVar.c) {
            if (j >= 0) {
                long j3 = 1 + j2;
                if (j2 >= j) {
                    break;
                }
                j2 = j3;
            }
            defpackage.akzx akzxVarM = alfk.a.m();
            long j4 = ammhVar.b;
            akzxVarM.u();
            alfk alfkVar = akzxVarM.b;
            alfkVar.b |= 1;
            alfkVar.c = j4;
            if (!ammhVar.c.isEmpty()) {
                java.lang.String str = ammhVar.c;
                akzxVarM.u();
                alfk alfkVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                alfkVar2.b |= 2;
                alfkVar2.d = str;
            }
            amwp amwpVar = (amwp) map.get(ammhVar.e);
            if (amwpVar != null) {
                akzxVarM.u();
                alfk alfkVar3 = akzxVarM.b;
                alfkVar3.b |= 4;
                alfkVar3.e = amwpVar.a;
            }
            aiftVar.i(akzxVarM.r());
        }
        return aiftVar.g();
    }

    public static int b(defpackage.akzx akzxVar, int i) {
        for (int i2 = 0; i2 < ((defpackage.apef) akzxVar.b).q.size(); i2++) {
            apee apeeVarBj = akzxVar.bj(i2);
            if (apeeVarBj.c == i && (apeeVarBj.b & 2) == 0) {
                return i2;
            }
        }
        return -1;
    }
}
