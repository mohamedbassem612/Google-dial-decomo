package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acub extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acub(alg algVar, defpackage.fvx fvxVar, defpackage.fvs fvsVar, defpackage.adm admVar, cer cerVar, defpackage.fwz fwzVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = algVar;
        this.c = fvxVar;
        this.e = fvsVar;
        this.b = admVar;
        this.d = cerVar;
        this.f = fwzVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0169 A[LOOP:1: B:17:0x005e->B:47:0x0169, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x016d A[EDGE_INSN: B:69:0x016d->B:48:0x016d BREAK  A[LOOP:1: B:17:0x005e->B:47:0x0169], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [cer, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        long j;
        if (this.$cid == 0) {
            java.util.concurrent.CancellationException cancellationException = null;
            aooc.af(obj);
            try {
                acuc acucVar = acuc.a;
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.c;
                java.lang.Object obj5 = this.d;
                defpackage.actu actuVarA = defpackage.actt.a((android.content.ContentResolver) obj3, "name=Google Sans Flex&weight=400", (java.lang.String) obj4, (android.os.CancellationSignal) obj5);
                java.lang.Object obj6 = this.e;
                actz actzVar = (actz) obj6;
                defpackage.actu actuVarA2 = defpackage.actt.a((android.content.ContentResolver) obj3, actzVar.h, (java.lang.String) obj4, (android.os.CancellationSignal) obj5);
                android.graphics.fonts.FontFamily.Builder builderAJ = afsq.aJ((android.content.Context) obj2, actuVarA, actzVar, (android.os.CancellationSignal) obj5);
                android.graphics.fonts.FontFamily fontFamilyM = builderAJ != null ? da$.ExternalSyntheticApiModelOutline0.m(builderAJ) : cancellationException;
                android.graphics.fonts.FontFamily.Builder builderAJ2 = afsq.aJ((android.content.Context) obj2, actuVarA2, actzVar, (android.os.CancellationSignal) obj5);
                android.graphics.fonts.FontFamily fontFamilyM2 = builderAJ2 != null ? da$.ExternalSyntheticApiModelOutline0.m(builderAJ2) : cancellationException;
                aooh.c(fontFamilyM);
                android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM);
                int i2 = actzVar.d.h;
                int i3 = actzVar.e;
                android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilderM = da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, new android.graphics.fonts.FontStyle(i2, a.x(0, 1) ? 1 : 0));
                aooh.c(fontFamilyM2);
                android.graphics.Typeface typefaceM = da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilderM, fontFamilyM2));
                android.graphics.Paint paint = acuc.b;
                paint.setTypeface(typefaceM);
                aa$.ExternalSyntheticApiModelOutline0.m(paint, acty.a(((dmc) obj6).b, (android.content.Context) obj2));
                android.graphics.Typeface typeface = paint.getTypeface();
                ?? r1 = this.f;
                return typeface;
            } finally {
                this.f.s((java.util.concurrent.CancellationException) null);
            }
        }
        aooc.af(obj);
        alg algVar = (alg) this.a;
        if (aooh.n(algVar.f(), algVar.h()) && (((defpackage.fvx) this.c).b.c() == null || aooh.n(algVar.h(), this.e))) {
            ?? r5 = this.d;
            java.lang.Object obj7 = this.f;
            java.util.Iterator it = defpackage.hgu.ac(r5).iterator();
            while (it.hasNext()) {
                ((defpackage.fwz) obj7).h((defpackage.fvs) it.next());
            }
            defpackage.adm admVar = (defpackage.adm) this.b;
            long[] jArr = admVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr[i4];
                    char c = 7;
                    long j3 = -9187201950435737472L;
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 != length) {
                            break;
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = (~(i4 - length)) >>> 31;
                        int i6 = 0;
                        while (true) {
                            char c2 = c;
                            i = 8 - i5;
                            if (i6 >= i) {
                                break;
                            }
                            if ((j2 & 255) < 128) {
                                int i7 = (i4 << 3) + i6;
                                j = j3;
                                java.lang.Object obj8 = admVar.b[i7];
                                float f = admVar.c[i7];
                                if (!aooh.n((java.lang.String) obj8, ((defpackage.fvs) algVar.h()).c)) {
                                    admVar.e--;
                                    long[] jArr2 = admVar.a;
                                    int i8 = i7 >> 3;
                                    int i9 = (i7 & 7) << 3;
                                    long j4 = jArr2[i8] >>> i9;
                                    long j5 = jArr2[i8 + 1] << (64 - i9);
                                    int i10 = (i7 - 8) & admVar.d;
                                    int i11 = i10 >> 3;
                                    int i12 = (i10 & 7) << 3;
                                    long j6 = jArr2[i11] >>> i12;
                                    long j7 = jArr2[i11 + 1] << (64 - i12);
                                    long j8 = j4 | (j5 & ((-i9) >> 63));
                                    long j9 = j8 & ((~j8) << 6) & j;
                                    long j10 = j6 | (j7 & ((-i12) >> 63));
                                    long j11 = j10 & ((~j10) << 6) & j;
                                    int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j9) + java.lang.Long.numberOfLeadingZeros(j11);
                                    int i13 = admVar.d;
                                    long j12 = jArr2[i8] & (~(255 << i9));
                                    int i14 = (j9 != 0 ? 1 : 0) & (j11 != 0 ? 1 : 0) & ((iNumberOfTrailingZeros >>> 3) < 8 ? 1 : 0);
                                    long j13 = j12 | ((1 != i14 ? 254L : 128L) << i9);
                                    jArr2[i8] = j13;
                                    jArr2[(((i7 - 7) & i13) + (i13 & 7)) >> 3] = j13;
                                    admVar.f += i14;
                                    admVar.b[i7] = null;
                                }
                            } else {
                                j = j3;
                            }
                            j2 >>= 8;
                            i6++;
                            c = c2;
                            j3 = j;
                        }
                        if (i != 8) {
                            break;
                        }
                        if (i4 != length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [cer, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        java.lang.Object obj2 = this.a;
        if (i != 0) {
            java.lang.Object obj3 = this.c;
            java.lang.Object obj4 = this.e;
            return new defpackage.acub((alg) obj2, (defpackage.fvx) obj3, (defpackage.fvs) obj4, (defpackage.adm) this.b, (cer) this.d, (defpackage.fwz) this.f, aolnVar, 1);
        }
        java.lang.Object obj5 = this.b;
        java.lang.Object obj6 = this.c;
        java.lang.Object obj7 = this.d;
        return new defpackage.acub((android.content.Context) obj2, (android.content.ContentResolver) obj5, (java.lang.String) obj6, (android.os.CancellationSignal) obj7, (dmc) this.e, (aoud) this.f, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acub(android.content.Context context, android.content.ContentResolver contentResolver, java.lang.String str, android.os.CancellationSignal cancellationSignal, dmc dmcVar, aoud aoudVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = context;
        this.b = contentResolver;
        this.c = str;
        this.d = cancellationSignal;
        this.e = dmcVar;
        this.f = aoudVar;
    }
}
