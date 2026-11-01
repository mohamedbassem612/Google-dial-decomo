package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gim implements defpackage.gig, defpackage.gih {
    public final defpackage.aonj a;
    public boolean b;
    public boolean c = true;
    public final defpackage.aogc d;

    public gim(defpackage.aogc aogcVar, defpackage.aonj aonjVar) {
        this.d = aogcVar;
        this.a = aonjVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b1 A[LOOP:0: B:15:0x0072->B:26:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[EDGE_INSN: B:35:0x00b4->B:27:0x00b4 BREAK  A[LOOP:0: B:15:0x0072->B:26:0x00b1], SYNTHETIC] */
    @Override // defpackage.gig
    public final android.os.Bundle a() {
        defpackage.aoiu[] aoiuVarArr;
        android.os.Bundle bundleR;
        int i;
        defpackage.aogc aogcVar = this.d;
        synchronized (aogcVar.b) {
            java.util.Map mapB = ((defpackage.adw) aogcVar.c).b();
            if (mapB.isEmpty()) {
                aoiuVarArr = new defpackage.aoiu[0];
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(mapB.size());
                for (java.util.Map.Entry entry : mapB.entrySet()) {
                    arrayList.add(new defpackage.aoiu((java.lang.String) entry.getKey(), entry.getValue()));
                }
                aoiuVarArr = (defpackage.aoiu[]) arrayList.toArray(new defpackage.aoiu[0]);
            }
            bundleR = defpackage.dpe.r((defpackage.aoiu[]) java.util.Arrays.copyOf(aoiuVarArr, aoiuVarArr.length));
            java.lang.Object obj = aogcVar.a;
            java.lang.Object[] objArr = ((defpackage.adw) obj).b;
            java.lang.Object[] objArr2 = ((defpackage.adw) obj).c;
            long[] jArr = ((defpackage.adw) obj).a;
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
                                int i5 = (i2 << 3) + i4;
                                defpackage.gij.b(bundleR, (java.lang.String) objArr[i5], ((defpackage.gil) objArr2[i5]).a());
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
        }
        return bundleR;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:5:0x000e, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:11:0x0034, B:14:0x004b, B:16:0x005b, B:17:0x005e, B:19:0x0067, B:21:0x0070), top: B:31:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067 A[Catch: all -> 0x0095, TryCatch #0 {, blocks: (B:5:0x000e, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:11:0x0034, B:14:0x004b, B:16:0x005b, B:17:0x005e, B:19:0x0067, B:21:0x0070), top: B:31:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0070 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x000e, B:6:0x001a, B:8:0x0020, B:10:0x002c, B:11:0x0034, B:14:0x004b, B:16:0x005b, B:17:0x005e, B:19:0x0067, B:21:0x0070), top: B:31:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:24:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[LOOP:0: B:14:0x004b->B:25:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[EDGE_INSN: B:33:0x0093->B:26:0x0093 BREAK  A[LOOP:0: B:14:0x004b->B:25:0x0090], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[EDGE_INSN: B:34:0x0093->B:26:0x0093 BREAK  A[LOOP:0: B:14:0x004b->B:25:0x0090], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[EDGE_INSN: B:35:0x008c->B:23:0x008c BREAK  A[LOOP:1: B:17:0x005e->B:22:0x0088], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0088 A[SYNTHETIC] */
    @Override // defpackage.gih
    public final void b(android.os.Bundle bundle) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        long[] jArr;
        int length;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        this.b = true;
        defpackage.aogc aogcVar = this.d;
        synchronized (aogcVar.b) {
            if (bundle == null) {
                java.lang.Object obj = aogcVar.a;
                objArr = ((defpackage.adw) obj).b;
                objArr2 = ((defpackage.adw) obj).c;
                jArr = ((defpackage.adw) obj).a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    while (true) {
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            i2 = i - length;
                            i3 = 0;
                            while (true) {
                                i4 = 8 - ((~i2) >>> 31);
                                if (i3 < i4) {
                                    break;
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i5 = (i << 3) + i3;
                                    ((defpackage.gil) objArr2[i5]).b((android.os.Bundle) ((defpackage.adw) aogcVar.c).i((java.lang.String) objArr[i5]));
                                }
                                j >>= 8;
                                i3++;
                            }
                            if (i4 == 8) {
                                break;
                                break;
                            } else {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            } else {
                for (java.lang.String str : defpackage.gie.e(bundle).keySet()) {
                    android.os.Bundle bundleB = defpackage.gie.b(bundle, str);
                    if (bundleB != null) {
                        ((defpackage.adw) aogcVar.c).n(str, bundleB);
                    }
                }
                java.lang.Object obj2 = aogcVar.a;
                objArr = ((defpackage.adw) obj2).b;
                objArr2 = ((defpackage.adw) obj2).c;
                jArr = ((defpackage.adw) obj2).a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    while (true) {
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            i2 = i - length;
                            i3 = 0;
                            while (true) {
                                i4 = 8 - ((~i2) >>> 31);
                                if (i3 < i4) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i6 = (i << 3) + i3;
                                    ((defpackage.gil) objArr2[i6]).b((android.os.Bundle) ((defpackage.adw) aogcVar.c).i((java.lang.String) objArr[i6]));
                                }
                                j >>= 8;
                                i3++;
                            }
                            if (i4 == 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            throw th;
        }
    }
}
