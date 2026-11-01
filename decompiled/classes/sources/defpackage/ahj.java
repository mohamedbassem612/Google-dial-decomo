package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahj implements defpackage.cyb {
    public final defpackage.aoss a;
    public defpackage.cxi b;
    public defpackage.cxi c;
    private final /* synthetic */ defpackage.cyb g;
    private int i;
    private final defpackage.ccp h = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
    private final defpackage.cei j = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
    public final defpackage.adq e = new defpackage.adq(16);
    public final defpackage.adw f = new defpackage.adw(6);
    public int d = -1;

    public ahj(defpackage.cyb cybVar, defpackage.aoss aossVar) {
        this.g = cybVar;
        this.a = aossVar;
    }

    public final int a() {
        return this.j.c();
    }

    public final defpackage.cxi b() {
        defpackage.cxi cxiVar = this.c;
        if (cxiVar != null) {
            return cxiVar;
        }
        throw new java.lang.IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    public final defpackage.cxi d() {
        defpackage.cxi cxiVar = this.b;
        if (cxiVar != null) {
            return cxiVar;
        }
        throw new java.lang.IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // defpackage.cyb
    public final defpackage.cxi dd(defpackage.czb czbVar) {
        return this.g.dd(czbVar);
    }

    @Override // defpackage.cyb
    public final defpackage.cxi de(defpackage.cxi cxiVar) {
        return this.g.de(cxiVar);
    }

    @Override // defpackage.cyb
    public final long df(defpackage.cxi cxiVar, defpackage.cxi cxiVar2, boolean z) {
        return this.g.df(cxiVar, cxiVar2, z);
    }

    public final void f(boolean z) {
        int iT;
        int i;
        int i2 = this.i;
        if (z) {
            iT = i2 + 1;
            this.i = iT;
        } else {
            iT = defpackage.aooc.t(i2 - 1, 0);
            this.i = iT;
        }
        boolean z2 = iT > 0;
        if (z2 == i()) {
            return;
        }
        this.h.b(java.lang.Boolean.valueOf(z2));
        if (z2) {
            return;
        }
        defpackage.adw adwVar = this.f;
        java.lang.Object[] objArr = adwVar.c;
        long[] jArr = adwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = ~(i3 - length);
                int i5 = 0;
                while (true) {
                    i = 8 - (i4 >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        agx agxVar = (agx) objArr[(i3 << 3) + i5];
                        if (agxVar.b().size() <= 1) {
                            agxVar.c.e();
                            break;
                            break;
                        }
                        java.util.List listB = agxVar.b();
                        int i6 = agz.a;
                        int size = listB.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                agxVar.c.e();
                                break;
                            } else if (((agy) listB.get(i7)).d().e()) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                    }
                    j >>= 8;
                    i5++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void g(int i) {
        this.j.h(i);
    }

    public final void h() {
        g(a() + 1);
    }

    public final boolean i() {
        return ((java.lang.Boolean) this.h.a()).booleanValue();
    }
}
