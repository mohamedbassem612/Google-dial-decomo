package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cdr extends defpackage.aomh implements defpackage.aono {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    java.lang.Object g;
    java.lang.Object h;
    int i;
    /* synthetic */ java.lang.Object j;
    final /* synthetic */ defpackage.cds k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdr(defpackage.cds cdsVar, defpackage.aoln aolnVar) {
        super(3, aolnVar);
        this.k = cdsVar;
    }

    public static final void d(java.util.List list, defpackage.cds cdsVar) {
        list.clear();
        synchronized (cdsVar.b) {
            java.util.List list2 = cdsVar.f;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((cck) list2.get(i));
            }
            list2.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[Catch: all -> 0x0102, LOOP:1: B:11:0x003c->B:21:0x0072, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:7:0x001a, B:8:0x0029, B:11:0x003c, B:13:0x004d, B:15:0x0057, B:17:0x005d, B:18:0x006a, B:23:0x007d, B:26:0x008a, B:28:0x0095, B:30:0x009f, B:32:0x00a5, B:33:0x00af, B:36:0x00b7, B:37:0x00ba, B:40:0x00ca, B:42:0x00d5, B:44:0x00df, B:46:0x00e5, B:47:0x00f2, B:50:0x00fa, B:51:0x00fd, B:21:0x0072), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[Catch: all -> 0x0102, LOOP:3: B:26:0x008a->B:36:0x00b7, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:7:0x001a, B:8:0x0029, B:11:0x003c, B:13:0x004d, B:15:0x0057, B:17:0x005d, B:18:0x006a, B:23:0x007d, B:26:0x008a, B:28:0x0095, B:30:0x009f, B:32:0x00a5, B:33:0x00af, B:36:0x00b7, B:37:0x00ba, B:40:0x00ca, B:42:0x00d5, B:44:0x00df, B:46:0x00e5, B:47:0x00f2, B:50:0x00fa, B:51:0x00fd, B:21:0x0072), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa A[Catch: all -> 0x0102, LOOP:5: B:40:0x00ca->B:50:0x00fa, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000b, B:7:0x001a, B:8:0x0029, B:11:0x003c, B:13:0x004d, B:15:0x0057, B:17:0x005d, B:18:0x006a, B:23:0x007d, B:26:0x008a, B:28:0x0095, B:30:0x009f, B:32:0x00a5, B:33:0x00af, B:36:0x00b7, B:37:0x00ba, B:40:0x00ca, B:42:0x00d5, B:44:0x00df, B:46:0x00e5, B:47:0x00f2, B:50:0x00fa, B:51:0x00fd, B:21:0x0072), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[EDGE_INSN: B:61:0x007d->B:23:0x007d BREAK  A[LOOP:1: B:11:0x003c->B:21:0x0072], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba A[EDGE_INSN: B:66:0x00ba->B:37:0x00ba BREAK  A[LOOP:3: B:26:0x008a->B:36:0x00b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd A[EDGE_INSN: B:71:0x00fd->B:51:0x00fd BREAK  A[LOOP:5: B:40:0x00ca->B:50:0x00fa], SYNTHETIC] */
    public static final void e(defpackage.cds cdsVar, java.util.List list, java.util.List list2, java.util.List list3, defpackage.ady adyVar, defpackage.ady adyVar2, defpackage.ady adyVar3, defpackage.ady adyVar4) {
        char c;
        long j;
        long j2;
        synchronized (cdsVar.b) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                defpackage.cbb cbbVar = (defpackage.cbb) list3.get(i);
                cbbVar.g();
                cdsVar.I(cbbVar);
            }
            list3.clear();
            java.lang.Object[] objArr = adyVar.b;
            long[] jArr = adyVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                j = 255;
                while (true) {
                    long j3 = jArr[i2];
                    c = 7;
                    j2 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j3 & 255) < 128) {
                                defpackage.cbb cbbVar2 = (defpackage.cbb) objArr[(i2 << 3) + i4];
                                cbbVar2.g();
                                cdsVar.I(cbbVar2);
                            }
                            j3 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } else {
                c = 7;
                j = 255;
                j2 = -9187201950435737472L;
            }
            adyVar.d();
            java.lang.Object[] objArr2 = adyVar2.b;
            long[] jArr2 = adyVar2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j4 = jArr2[i5];
                    if ((((~j4) << c) & j4 & j2) == j2) {
                        if (i5 != length2) {
                            break;
                            break;
                        }
                        i5++;
                    } else {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & j) < 128) {
                                ((defpackage.cbb) objArr2[(i5 << 3) + i7]).k();
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        } else if (i5 != length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
            }
            adyVar2.d();
            adyVar3.d();
            java.lang.Object[] objArr3 = adyVar4.b;
            long[] jArr3 = adyVar4.a;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j5 = jArr3[i8];
                    if ((((~j5) << c) & j5 & j2) == j2) {
                        if (i8 != length3) {
                            break;
                            break;
                        }
                        i8++;
                    } else {
                        int i9 = 8 - ((~(i8 - length3)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j5 & j) < 128) {
                                defpackage.cbb cbbVar3 = (defpackage.cbb) objArr3[(i8 << 3) + i10];
                                cbbVar3.g();
                                cdsVar.I(cbbVar3);
                            }
                            j5 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        } else if (i8 != length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            }
            adyVar4.d();
        }
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.cdr cdrVar = new defpackage.cdr(this.k, (defpackage.aoln) obj3);
        cdrVar.j = (defpackage.cci) obj2;
        return cdrVar.b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007d A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0098  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:20:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00df  */
    /* JADX WARN: Code duplicated, block: B:88:0x024d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r1v1, types: [cci, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00df -> B:23:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x024d -> B:10:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdr.b(java.lang.Object):java.lang.Object");
    }
}
