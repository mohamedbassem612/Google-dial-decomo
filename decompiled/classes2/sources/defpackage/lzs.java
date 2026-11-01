package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lzs {
    private static final aimz a = aimz.i("com/android/dialer/conversationhistorycalldetails/dataservice/CoalescedRowLookup");
    private final zjm b;
    private final ahbv c;
    private final ahbv d;

    public lzs(ahbv ahbvVar, ahbv ahbvVar2, zjm zjmVar) {
        aooh.f(ahbvVar2, "dialerPhoneNumbers");
        this.d = ahbvVar;
        this.c = ahbvVar2;
        this.b = zjmVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062 A[PHI: r2 r7 r13
      0x0062: PHI (r2v3 kgz) = (r2v2 kgz), (r2v4 kgz) binds: [B:16:0x0047, B:33:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r7v1 kiu) = (r7v0 kiu), (r7v2 kiu) binds: [B:16:0x0047, B:33:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r13v3 ??) = (r13v1 ??), (r13v10 ??) binds: [B:16:0x0047, B:33:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10, types: [aolr, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b4 -> B:32:0x00b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r12, kiu r13, aoln r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lzs.a(java.util.List, kiu, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(kiu kiuVar, aoln aolnVar) {
        defpackage.lzp lzpVar;
        if (aolnVar instanceof defpackage.lzp) {
            lzpVar = (defpackage.lzp) aolnVar;
            int i = lzpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzpVar.c = i - Integer.MIN_VALUE;
            } else {
                lzpVar = new defpackage.lzp(this, aolnVar);
            }
        } else {
            lzpVar = new defpackage.lzp(this, aolnVar);
        }
        java.lang.Object objC = lzpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lzpVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            lzpVar.d = kiuVar;
            lzpVar.e = this;
            lzpVar.c = 1;
            objC = c(lzpVar);
            if (objC != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
            return objC;
        }
        this = lzpVar.e;
        kiuVar = lzpVar.d;
        aooc.af(objC);
        lzpVar.d = null;
        lzpVar.e = null;
        lzpVar.c = 2;
        java.lang.Object objA = this.a((java.util.List) objC, kiuVar, lzpVar);
        if (objA != aoluVar) {
            return objA;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.lzq lzqVar;
        if (aolnVar instanceof defpackage.lzq) {
            lzqVar = (defpackage.lzq) aolnVar;
            int i = lzqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzqVar.c = i - Integer.MIN_VALUE;
            } else {
                lzqVar = new defpackage.lzq(this, aolnVar);
            }
        } else {
            lzqVar = new defpackage.lzq(this, aolnVar);
        }
        java.lang.Object objD = lzqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lzqVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.d.x();
            lzqVar.c = 1;
            objD = aosv.D(ajcqVarX, lzqVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        kiv kivVar = (kiv) ((j$.util.Optional) objD).orElse((java.lang.Object) null);
        if (kivVar == null) {
            throw new java.lang.IllegalArgumentException("Unable to read coalesced rows from disk.");
        }
        alat alatVar = kivVar.b;
        aooh.e(alatVar, "getRowList(...)");
        return alatVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(kiu kiuVar, defpackage.hkd hkdVar, int i, aoln aolnVar) {
        defpackage.lzr lzrVar;
        if (aolnVar instanceof defpackage.lzr) {
            lzrVar = (defpackage.lzr) aolnVar;
            int i2 = lzrVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lzrVar.d = i2 - Integer.MIN_VALUE;
            } else {
                lzrVar = new defpackage.lzr(this, aolnVar);
            }
        } else {
            lzrVar = new defpackage.lzr(this, aolnVar);
        }
        java.lang.Object objD = lzrVar.b;
        aolu aoluVar = aolu.a;
        int i3 = lzrVar.d;
        if (i3 == 0) {
            aooc.af(objD);
            ahbv ahbvVar = this.c;
            defpackage.hkd hkdVar2 = kiuVar.f;
            if (hkdVar2 == null) {
                hkdVar2 = defpackage.hkd.a;
            }
            ajcq ajcqVarT = ahbvVar.t(hkdVar2, hkdVar);
            lzrVar.e = kiuVar;
            lzrVar.a = i;
            lzrVar.d = 1;
            objD = aosv.D(ajcqVarT, lzrVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = lzrVar.a;
            kiuVar = lzrVar.e;
            aooc.af(objD);
        }
        return java.lang.Boolean.valueOf(((java.lang.Boolean) objD).booleanValue() && kiuVar.i == i);
    }
}
