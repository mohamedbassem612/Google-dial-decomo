package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class beu implements defpackage.cjx, defpackage.cjt {
    public final defpackage.ady a;
    private final defpackage.cjx b;
    private final defpackage.cjt c;

    public beu(defpackage.cjx cjxVar, java.util.Map map, defpackage.cjt cjtVar) {
        defpackage.afz afzVar = new defpackage.afz(cjxVar, 17);
        defpackage.cbd cbdVar = defpackage.cjz.a;
        this.b = new defpackage.cjy(map, afzVar);
        this.c = cjtVar;
        defpackage.ady adyVar = defpackage.adz.a;
        this.a = new defpackage.ady(6);
    }

    @Override // defpackage.cjx
    public final java.lang.Object a(java.lang.String str) {
        return this.b.a(str);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0044 A[LOOP:0: B:5:0x000d->B:16:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0047 A[EDGE_INSN: B:20:0x0047->B:17:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:16:0x0044], SYNTHETIC] */
    @Override // defpackage.cjx
    public final java.util.Map b() {
        int i;
        defpackage.ady adyVar = this.a;
        java.lang.Object[] objArr = adyVar.b;
        long[] jArr = adyVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            this.c.d(objArr[(i2 << 3) + i4]);
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return this.b.b();
    }

    @Override // defpackage.cjt
    public final void c(java.lang.Object obj, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-858296452);
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
            this.c.c(obj, aonnVar, cavVarB, i2 & 126);
            boolean zD = cavVarB.D(this) | cavVarB.D(obj);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zD || objR == defpackage.cau.a) {
                objR = new defpackage.bet(this, obj, i4);
                cbtVar.ab(objR);
            }
            defpackage.cbp.c(obj, (defpackage.aonj) objR, cavVarB);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new aoz(this, obj, aonnVar, i, 4);
        }
    }

    @Override // defpackage.cjt
    public final void d(java.lang.Object obj) {
        this.c.d(obj);
    }

    @Override // defpackage.cjx
    public final boolean e(java.lang.Object obj) {
        return this.b.e(obj);
    }

    @Override // defpackage.cjx
    public final defpackage.adkz f(java.lang.String str, defpackage.aomy aomyVar) {
        return this.b.f(str, aomyVar);
    }
}
