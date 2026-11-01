package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class bds {
    public defpackage.dpd a;
    public int b;
    public int c;
    public int e;
    public int f;
    final /* synthetic */ defpackage.bdu g;
    public defpackage.bfe[] h = defpackage.bdv.a;
    public int d = 1;

    public bds(defpackage.bdu bduVar) {
        this.g = bduVar;
    }

    public final void a(defpackage.bef befVar, defpackage.aoss aossVar, defpackage.apkl apklVar, int i, int i2, int i3) {
        defpackage.bfe[] bfeVarArr;
        defpackage.bfe[] bfeVarArr2 = this.h;
        int length = bfeVarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.e = i;
                this.f = i2;
                break;
            } else {
                defpackage.bfe bfeVar = bfeVarArr2[i4];
                if (bfeVar != null && bfeVar.v()) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = befVar.l().size();
        int length2 = this.h.length;
        while (true) {
            bfeVarArr = this.h;
            if (size >= length2) {
                break;
            }
            defpackage.bfe bfeVar2 = bfeVarArr[size];
            if (bfeVar2 != null) {
                bfeVar2.k();
            }
            size++;
        }
        if (bfeVarArr.length != befVar.l().size()) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.h, befVar.l().size());
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            this.h = (defpackage.bfe[]) objArrCopyOf;
        }
        this.a = new defpackage.dpd(befVar.i());
        this.b = i3;
        this.c = befVar.d();
        this.d = befVar.f();
        int size2 = befVar.l().size();
        defpackage.bdu bduVar = this.g;
        for (int i5 = 0; i5 < size2; i5++) {
            java.lang.Object objB = defpackage.beh.b(befVar, i5);
            defpackage.bdg bdgVar = objB instanceof defpackage.bdg ? (defpackage.bdg) objB : null;
            defpackage.bfe[] bfeVarArr3 = this.h;
            if (bdgVar == null) {
                defpackage.bfe bfeVar3 = bfeVarArr3[i5];
                if (bfeVar3 != null) {
                    bfeVar3.k();
                }
                this.h[i5] = null;
            } else {
                defpackage.bfe bfeVar4 = bfeVarArr3[i5];
                if (bfeVar4 == null) {
                    defpackage.bfe bfeVar5 = new defpackage.bfe(aossVar, apklVar, new apv(bduVar, 9));
                    this.h[i5] = bfeVar5;
                    bfeVar4 = bfeVar5;
                }
                bfeVar4.p(bdgVar.c);
            }
        }
    }
}
