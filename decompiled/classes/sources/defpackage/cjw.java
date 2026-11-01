package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjw implements defpackage.cjt {
    public static final defpackage.ckb a = new defpackage.dko(new defpackage.bbd(5), new defpackage.ckc(1), 1);
    public final java.util.Map b;
    public defpackage.cjx c;
    public final defpackage.adw d;
    private final defpackage.aonj e;

    public cjw(java.util.Map map) {
        this.b = map;
        long[] jArr = defpackage.adx.a;
        this.d = new defpackage.adw(6);
        this.e = new defpackage.bjp(this, 10);
    }

    @Override // defpackage.cjt
    public final void c(java.lang.Object obj, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(533563200);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(this) ? 128 : 256;
        }
        int i4 = 0;
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cavVarB.K(obj);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj2 = defpackage.cau.a;
            if (objR == obj2) {
                defpackage.aonj aonjVar = this.e;
                if (!((java.lang.Boolean) aonjVar.a(obj)).booleanValue()) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bg(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                }
                java.util.Map map = (java.util.Map) this.b.get(obj);
                defpackage.cbd cbdVar = defpackage.cjz.a;
                defpackage.cka ckaVar = new defpackage.cka(new defpackage.cjy(map, aonjVar));
                cbtVar.ab(ckaVar);
                objR = ckaVar;
            }
            defpackage.cka ckaVar2 = (defpackage.cka) objR;
            defpackage.den.ac(new defpackage.cdj[]{defpackage.cjz.a.b(ckaVar2), defpackage.gik.a.b(ckaVar2)}, aonnVar, cavVarB, i2 & 112);
            defpackage.aojh aojhVar = defpackage.aojh.a;
            boolean zD = cavVarB.D(this) | cavVarB.D(obj) | cavVarB.D(ckaVar2);
            java.lang.Object objR2 = cbtVar.R();
            if (zD || objR2 == obj2) {
                objR2 = new defpackage.cju(this, obj, ckaVar2, i4);
                cbtVar.ab(objR2);
            }
            defpackage.cbp.c(aojhVar, (defpackage.aonj) objR2, cavVarB);
            cavVarB.q();
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aoz(this, obj, aonnVar, i, 11);
        }
    }

    @Override // defpackage.cjt
    public final void d(java.lang.Object obj) {
        if (this.d.i(obj) == null) {
            this.b.remove(obj);
        }
    }

    public cjw() {
        this((byte[]) null);
    }

    public /* synthetic */ cjw(byte[] bArr) {
        this(new java.util.LinkedHashMap());
    }
}
