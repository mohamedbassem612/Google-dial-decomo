package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjn implements defpackage.cjp {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final defpackage.adw d = new defpackage.adw(6);

    public final void a() {
        if (this.b) {
            return;
        }
        if (this.c) {
            cjq.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        b();
        this.c = true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a A[LOOP:0: B:5:0x000d->B:28:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[EDGE_INSN: B:32:0x006d->B:29:0x006d BREAK  A[LOOP:0: B:5:0x000d->B:28:0x006a], SYNTHETIC] */
    public final void b() {
        int i;
        defpackage.adw adwVar = this.d;
        java.lang.Object[] objArr = adwVar.c;
        long[] jArr = adwVar.a;
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
                            java.lang.Object obj = objArr[(i2 << 3) + i4];
                            if (obj instanceof defpackage.adq) {
                                if (obj == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.retain.impl.SafeMultiValueMap>");
                                }
                                defpackage.adq adqVar = (defpackage.adq) obj;
                                java.lang.Object[] objArr2 = adqVar.a;
                                int i5 = adqVar.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    java.lang.Object obj2 = objArr2[i6];
                                    if (obj2 instanceof cjo) {
                                        ((cjo) obj2).a();
                                    }
                                }
                            } else if (obj instanceof cjo) {
                                ((cjo) obj).a();
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        adwVar.k();
    }
}
