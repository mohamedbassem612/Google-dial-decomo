package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eou extends eoa {
    public final adw a;

    public eou() {
        long[] jArr = adx.a;
        this.a = new adw(6);
    }

    public final void a(java.lang.Object obj) {
        defpackage.eot eotVar = (defpackage.eot) this.a.i(obj);
        if (eotVar != null) {
            eotVar.b.a();
        }
    }

    public final void d() {
        adw adwVar;
        int i;
        adw adwVar2 = this.a;
        if (adwVar2.d()) {
            adwVar = adx.b;
            if (adwVar == null) {
                aooh.h("null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
            }
        } else {
            adw adwVar3 = new adw(adwVar2.e);
            adwVar3.l(adwVar2);
            adwVar = adwVar3;
        }
        java.lang.Object[] objArr = adwVar.c;
        long[] jArr = adwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        defpackage.eot eotVar = (defpackage.eot) objArr[(i2 << 3) + i4];
                        eotVar.a();
                        a(eotVar.a);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}
