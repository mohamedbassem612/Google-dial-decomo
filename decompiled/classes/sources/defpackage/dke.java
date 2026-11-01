package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dke {
    public static final long a;

    static {
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        a = defpackage.dpy.h(0L, Float.NaN);
    }

    public static final defpackage.dkd a(defpackage.dkd dkdVar, int i, int i2, long j, defpackage.dpa dpaVar, defpackage.dkg dkgVar, defpackage.dos dosVar, int i3, int i4, defpackage.dpc dpcVar) {
        int i5 = i2;
        defpackage.dpa dpaVar2 = dpaVar;
        int i6 = i3;
        int i7 = i4;
        long j2 = j & 1095216660480L;
        if (i == 0 || i == dkdVar.a) {
            defpackage.dpt[] dptVarArr = defpackage.dps.a;
            if ((j2 == 0 || j == dkdVar.c) && ((dpaVar2 == null || defpackage.aooh.n(dpaVar2, dkdVar.d)) && ((i5 == 0 || i5 == dkdVar.b) && ((dkgVar == null || defpackage.aooh.n(dkgVar, dkdVar.e)) && ((dosVar == null || defpackage.aooh.n(dosVar, dkdVar.f)) && ((i6 == 0 || i6 == dkdVar.g) && ((i7 == 0 || i7 == dkdVar.h) && (dpcVar == null || defpackage.aooh.n(dpcVar, dkdVar.i))))))))) {
                return dkdVar;
            }
        }
        defpackage.dpt[] dptVarArr2 = defpackage.dps.a;
        long j3 = j2 == 0 ? dkdVar.c : j;
        if (dpaVar2 == null) {
            dpaVar2 = dkdVar.d;
        }
        int i8 = i == 0 ? dkdVar.a : i;
        if (i5 == 0) {
            i5 = dkdVar.b;
        }
        defpackage.dkg dkgVar2 = dkdVar.e;
        if (dkgVar2 == null || dkgVar != null) {
            dkgVar2 = dkgVar;
        }
        defpackage.dos dosVar2 = dosVar == null ? dkdVar.f : dosVar;
        if (i6 == 0) {
            i6 = dkdVar.g;
        }
        if (i7 == 0) {
            i7 = dkdVar.h;
        }
        return new defpackage.dkd(i8, i5, j3, dpaVar2, dkgVar2, dosVar2, i6, i7, dpcVar == null ? dkdVar.i : dpcVar);
    }
}
