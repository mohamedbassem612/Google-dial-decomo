package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dtd {
    static final boolean[] a = new boolean[3];

    static void a(defpackage.dsz dszVar, defpackage.dsq dsqVar, defpackage.dsy dsyVar) {
        dsyVar.p = -1;
        dsyVar.q = -1;
        int[] iArr = dszVar.aq;
        if (iArr[0] != 2 && dsyVar.aq[0] == 4) {
            defpackage.dsx dsxVar = dsyVar.J;
            int i = dsxVar.f;
            int iJ = dszVar.j();
            defpackage.dsx dsxVar2 = dsyVar.L;
            int i2 = iJ - dsxVar2.f;
            dsxVar.h = dsqVar.b(dsxVar);
            dsxVar2.h = dsqVar.b(dsxVar2);
            dsqVar.f(dsxVar.h, i);
            dsqVar.f(dsxVar2.h, i2);
            dsyVar.p = 2;
            dsyVar.Z = i;
            int i3 = i2 - i;
            dsyVar.V = i3;
            int i4 = dsyVar.ac;
            if (i3 < i4) {
                dsyVar.V = i4;
            }
        }
        if (iArr[1] == 2 || dsyVar.aq[1] != 4) {
            return;
        }
        defpackage.dsx dsxVar3 = dsyVar.K;
        int i5 = dsxVar3.f;
        int iH = dszVar.h();
        defpackage.dsx dsxVar4 = dsyVar.M;
        int i6 = iH - dsxVar4.f;
        dsxVar3.h = dsqVar.b(dsxVar3);
        dsxVar4.h = dsqVar.b(dsxVar4);
        dsqVar.f(dsxVar3.h, i5);
        dsqVar.f(dsxVar4.h, i6);
        if (dsyVar.ab > 0 || dsyVar.ah == 8) {
            defpackage.dsx dsxVar5 = dsyVar.N;
            dsxVar5.h = dsqVar.b(dsxVar5);
            dsqVar.f(dsxVar5.h, dsyVar.ab + i5);
        }
        dsyVar.q = 2;
        dsyVar.aa = i5;
        int i7 = i6 - i5;
        dsyVar.W = i7;
        int i8 = dsyVar.ad;
        if (i7 < i8) {
            dsyVar.W = i8;
        }
    }
}
