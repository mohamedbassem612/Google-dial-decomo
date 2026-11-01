package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpc implements defpackage.fmi {
    private final defpackage.fla a;
    private final android.util.SparseArray b;
    private final long c;
    private final int d;

    public fpc(android.util.SparseArray sparseArray, long j, int i, long j2, long j3) {
        int i2;
        this.b = sparseArray;
        this.c = j;
        this.d = i;
        java.util.List list = (java.util.List) sparseArray.get(i);
        defpackage.fla flaVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                defpackage.fpb fpbVar = (defpackage.fpb) list.get(i4);
                jArrCopyOf3[i4] = fpbVar.a;
                jArrCopyOf[i4] = fpbVar.b;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                defpackage.etr.f("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = java.util.Arrays.copyOf(jArrCopyOf3, i7);
            }
            flaVar = new defpackage.fla(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.a = flaVar;
    }

    @Override // defpackage.fma
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fma
    public final defpackage.fly b(long j) {
        defpackage.fla flaVar = this.a;
        if (flaVar != null) {
            return flaVar.b(j);
        }
        defpackage.fmb fmbVar = defpackage.fmb.a;
        return new defpackage.fly(fmbVar, fmbVar);
    }

    @Override // defpackage.fma
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // defpackage.fma
    public final boolean d() {
        return f(this.d);
    }

    @Override // defpackage.fmi
    public final defpackage.fly e(long j, int i) {
        int i2;
        int i3;
        android.util.SparseArray sparseArray = this.b;
        java.util.List list = (java.util.List) sparseArray.get(i);
        if ((list == null || list.isEmpty()) && i != (i2 = this.d)) {
            list = (java.util.List) sparseArray.get(i2);
        }
        if (list == null || list.isEmpty()) {
            defpackage.fmb fmbVar = defpackage.fmb.a;
            return new defpackage.fly(fmbVar, fmbVar);
        }
        defpackage.fpb fpbVar = new defpackage.fpb(j, -1L, -1L);
        java.lang.String str = eum.a;
        int iBinarySearch = java.util.Collections.binarySearch(list, fpbVar);
        if (iBinarySearch < 0) {
            iBinarySearch = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i4 = iBinarySearch - 1;
                if (i4 < 0 || ((java.lang.Comparable) list.get(i4)).compareTo(fpbVar) != 0) {
                    break;
                }
                iBinarySearch = i4;
            }
        }
        if (iBinarySearch == -1) {
            defpackage.fpb fpbVar2 = (defpackage.fpb) list.get(0);
            defpackage.fmb fmbVar2 = new defpackage.fmb(fpbVar2.a, fpbVar2.b);
            return new defpackage.fly(fmbVar2, fmbVar2);
        }
        defpackage.fpb fpbVar3 = (defpackage.fpb) list.get(iBinarySearch);
        long j2 = fpbVar3.a;
        defpackage.fmb fmbVar3 = new defpackage.fmb(j2, fpbVar3.b);
        if (j2 >= j || (i3 = iBinarySearch + 1) >= list.size()) {
            return new defpackage.fly(fmbVar3, fmbVar3);
        }
        defpackage.fpb fpbVar4 = (defpackage.fpb) list.get(i3);
        return new defpackage.fly(fmbVar3, new defpackage.fmb(fpbVar4.a, fpbVar4.b));
    }

    @Override // defpackage.fmi
    public final boolean f(int i) {
        java.util.List list = (java.util.List) this.b.get(i);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
