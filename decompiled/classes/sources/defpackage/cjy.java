package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjy implements defpackage.cjx {
    private final defpackage.aonj a;
    private final defpackage.adw b;
    private defpackage.adw c;

    public cjy(java.util.Map map, defpackage.aonj aonjVar) {
        this.a = aonjVar;
        defpackage.adw adwVar = null;
        if (map != null && !map.isEmpty()) {
            defpackage.cbd cbdVar = defpackage.cjz.a;
            adwVar = new defpackage.adw(map.size());
            int iC = defpackage.adx.c(adwVar.e);
            int iNumberOfLeadingZeros = iC > 0 ? (-1) >>> java.lang.Integer.numberOfLeadingZeros(iC) : 0;
            if (iNumberOfLeadingZeros < adwVar.d) {
                adwVar.m(iNumberOfLeadingZeros);
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                adwVar.n(entry.getKey(), entry.getValue());
            }
        }
        this.b = adwVar;
    }

    @Override // defpackage.cjx
    public final java.lang.Object a(java.lang.String str) {
        defpackage.adw adwVar = this.b;
        java.util.List list = adwVar != null ? (java.util.List) adwVar.i(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
        }
        return list.get(0);
    }

    @Override // defpackage.cjx
    public final java.util.Map b() {
        int i;
        long[] jArr;
        long[] jArr2;
        char c;
        defpackage.adw adwVar = this.b;
        int i2 = 0;
        if (adwVar != null) {
            i = adwVar.e;
        } else {
            if (this.c == null) {
                return defpackage.aokd.a;
            }
            i = 0;
        }
        defpackage.adw adwVar2 = this.c;
        defpackage.adw adwVar3 = new defpackage.adw(i + (adwVar2 != null ? adwVar2.e : 0));
        if (adwVar != null) {
            adwVar3.l(adwVar);
        }
        defpackage.adw adwVar4 = this.c;
        if (adwVar4 != null) {
            java.lang.Object[] objArr = adwVar4.b;
            java.lang.Object[] objArr2 = adwVar4.c;
            long[] jArr3 = adwVar4.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr3[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i3 - length;
                        int i5 = i2;
                        while (true) {
                            int i6 = 8 - ((~i4) >>> 31);
                            if (i5 < i6) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i5;
                                    java.lang.Object obj = objArr[i7];
                                    java.util.List list = (java.util.List) objArr2[i7];
                                    java.lang.String str = (java.lang.String) obj;
                                    c = '\b';
                                    if (list.size() == 1) {
                                        java.lang.Object objA = ((defpackage.aomy) list.get(i2)).a();
                                        if (objA != null) {
                                            if (!e(objA)) {
                                                throw new java.lang.IllegalStateException(defpackage.cfd.o(objA));
                                            }
                                            java.util.List listSingletonList = java.util.Collections.singletonList(objA);
                                            defpackage.aooh.e(listSingletonList, "singletonList(...)");
                                            adwVar3.n(str, listSingletonList);
                                        }
                                        jArr2 = jArr3;
                                    } else {
                                        int size = list.size();
                                        java.util.ArrayList arrayList = new java.util.ArrayList(size);
                                        while (i2 < size) {
                                            long[] jArr4 = jArr3;
                                            java.lang.Object objA2 = ((defpackage.aomy) list.get(i2)).a();
                                            if (objA2 != null && !e(objA2)) {
                                                throw new java.lang.IllegalStateException(defpackage.cfd.o(objA2));
                                            }
                                            arrayList.add(objA2);
                                            i2++;
                                            jArr3 = jArr4;
                                        }
                                        jArr2 = jArr3;
                                        adwVar3.n(str, arrayList);
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    c = '\b';
                                }
                                j >>= c;
                                i5++;
                                jArr3 = jArr2;
                                i2 = 0;
                            } else {
                                jArr = jArr3;
                                if (i6 == 8) {
                                    break;
                                }
                            }
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i3 != length) {
                        i3++;
                        jArr3 = jArr;
                        i2 = 0;
                    }
                }
            }
        }
        return new defpackage.cke(adwVar3);
    }

    @Override // defpackage.cjx
    public final boolean e(java.lang.Object obj) {
        return ((java.lang.Boolean) this.a.a(obj)).booleanValue();
    }

    @Override // defpackage.cjx
    public final defpackage.adkz f(java.lang.String str, defpackage.aomy aomyVar) {
        defpackage.cbd cbdVar = defpackage.cjz.a;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!defpackage.aooh.s(str.charAt(i))) {
                defpackage.adw adwVar = this.c;
                if (adwVar == null) {
                    long[] jArr = defpackage.adx.a;
                    adwVar = new defpackage.adw(6);
                    this.c = adwVar;
                }
                java.lang.Object objA = adwVar.a(str);
                if (objA == null) {
                    objA = new java.util.ArrayList();
                    adwVar.n(str, objA);
                }
                ((java.util.List) objA).add(aomyVar);
                return new defpackage.adkz(adwVar, str, aomyVar);
            }
        }
        throw new java.lang.IllegalArgumentException("Registered key is empty or blank");
    }
}
