package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ddz implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ddz(int i) {
        this.$cid = i;
        this.a = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
    }

    /* JADX WARN: Code duplicated, block: B:198:0x0413 A[DONT_INVERT, PHI: r9
      0x0413: PHI (r9v7 boolean) = (r9v6 boolean), (r9v8 boolean) binds: [B:170:0x03a8, B:197:0x0411] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0415 A[LOOP:6: B:169:0x039a->B:199:0x0415, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x044b  */
    /* JADX WARN: Code duplicated, block: B:217:0x044d  */
    /* JADX WARN: Code duplicated, block: B:255:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x040d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [aowi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [aoyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [aowv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v20, types: [androidx.window.extensions.embedding.ActivityEmbeddingComponent, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        boolean z;
        boolean z2;
        defpackage.cze czeVar;
        defpackage.cze czeVar2;
        boolean z3;
        int i = 4;
        java.util.Map map = null;
        final boolean z4 = false;
        switch (this.$cid) {
            case 0:
                ((defpackage.czb) obj).s((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case 1:
                defpackage.czi cziVar = (defpackage.czi) obj;
                if (((defpackage.dea) this.a).g().a() != null) {
                    defpackage.aco acoVar = czw.d;
                    int[] iArr = acoVar.b;
                    java.lang.Object[] objArr = acoVar.c;
                    long[] jArr = acoVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        z = false;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = (~(i2 - length)) >>> 31;
                                ?? r13 = z4;
                                while (true) {
                                    int i4 = 8 - i3;
                                    if (r13 < i4) {
                                        if ((255 & j) < 128) {
                                            ?? r15 = (i2 << 3) + r13;
                                            int i5 = iArr[r15];
                                            czu czuVar = (czu) objArr[r15];
                                            if (czw.b(cziVar, czuVar.a())) {
                                                czuVar.a();
                                            } else if (czw.b(cziVar, czuVar.b())) {
                                                czuVar.b();
                                            } else {
                                                z3 = (i5 == -1 || (czeVar = (defpackage.cze) czw.b.a(i5)) == null || (!czw.b(cziVar, czeVar) && ((czeVar2 = (defpackage.cze) czw.c.a(i5)) == null || !czw.b(cziVar, czeVar2)))) ? false : true;
                                                if (!z3) {
                                                }
                                            }
                                            z = true;
                                            if (!z3) {
                                            }
                                        }
                                        j >>= 8;
                                        r13++;
                                    } else if (i4 == 8) {
                                        if (i2 != length) {
                                            i2++;
                                            z4 = false;
                                        }
                                    }
                                }
                            } else if (i2 != length) {
                                i2++;
                                z4 = false;
                            }
                            if (z) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                    } else {
                        z = false;
                    }
                    int i6 = czu.a;
                    czv czvVar = czt.i;
                    if (czw.b(cziVar, czvVar.b) || czw.b(cziVar, czvVar.c)) {
                        z2 = true;
                        z = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        defpackage.cze[] czeVarArr = czw.a;
                        for (int i7 = 0; i7 < 4; i7++) {
                            if (czw.b(cziVar, czeVarArr[i7])) {
                                z4 = true;
                            }
                        }
                        if (z) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else if (z) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                return java.lang.Boolean.valueOf(z4);
            case 2:
                defpackage.deg degVar = ((defpackage.dem) this.a).a;
                return java.lang.Boolean.valueOf(degVar.getParent().requestSendAccessibilityEvent(degVar, (android.view.accessibility.AccessibilityEvent) obj));
            case 3:
                ((defpackage.dem) this.a).w((dgf) obj);
                return defpackage.aojh.a;
            case 4:
                java.lang.Object obj2 = this.a;
                defpackage.deg degVar2 = (defpackage.deg) obj2;
                defpackage.dfq dfqVar = degVar2.g;
                if (dfqVar != null) {
                    return dfqVar;
                }
                defpackage.gii giiVarD = degVar2.e.d();
                java.lang.Object parent = ((android.view.View) obj2).getParent();
                if (parent == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type android.view.View");
                }
                android.view.View view = (android.view.View) parent;
                java.lang.Object tag = view.getTag(2131427791);
                java.lang.String strValueOf = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                if (strValueOf == null) {
                    strValueOf = java.lang.String.valueOf(view.getId());
                }
                final defpackage.aaha aahaVarAT = giiVarD.aT();
                final java.lang.String strConcat = "SaveableStateRegistry:".concat(java.lang.String.valueOf(strValueOf));
                android.os.Bundle bundleC = aahaVarAT.c(strConcat);
                if (bundleC != null) {
                    defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
                    java.lang.Class cls = new defpackage.aooa(androidx.compose.ui.platform.ParcelableMapHolder.class).b;
                    if (cls == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                    }
                    androidx.compose.ui.platform.ParcelableMapHolder parcelableMapHolder = (androidx.compose.ui.platform.ParcelableMapHolder) ((android.os.Parcelable) defpackage.dpe.t(bundleC, "androidx.compose.ui.platform.DisposableSaveableStateRegistry", cls));
                    map = parcelableMapHolder != null ? parcelableMapHolder.a : null;
                    if (map == null) {
                        map = defpackage.aokd.a;
                    }
                }
                defpackage.dcx dcxVar = new defpackage.dcx(11);
                defpackage.cbd cbdVar = defpackage.cjz.a;
                defpackage.cjy cjyVar = new defpackage.cjy(map, dcxVar);
                if (aahaVarAT.d(strConcat) == null) {
                    try {
                        aahaVarAT.e(strConcat, new defpackage.bf(cjyVar, i));
                        z4 = true;
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
                defpackage.dfq dfqVar2 = new defpackage.dfq(cjyVar, new defpackage.aomy() { // from class: dfr
                    @Override // defpackage.aomy
                    public final java.lang.Object a() {
                        java.lang.String str = strConcat;
                        if (z4) {
                            defpackage.aogc aogcVar = ((defpackage.gim) aahaVarAT.a).d;
                            synchronized (aogcVar.b) {
                                java.lang.Object obj3 = aogcVar.c;
                                if (defpackage.adw.f((defpackage.adw) obj3, str)) {
                                    ((defpackage.adw) obj3).i(str);
                                }
                                java.lang.Object objI = ((defpackage.adw) aogcVar.a).i(str);
                                if (objI instanceof defpackage.gil) {
                                }
                            }
                        }
                        return defpackage.aojh.a;
                    }
                });
                degVar2.g = dfqVar2;
                return dfqVar2;
            case 5:
                return java.lang.Boolean.valueOf(((defpackage.deg) this.a).am());
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                if (defpackage.dft.b.compareAndSet(false, true)) {
                    this.a.b(defpackage.aojh.a);
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.csj csjVar = (defpackage.csj) obj;
                defpackage.cqf cqfVarB = csjVar.q().b();
                defpackage.aonn aonnVar = ((defpackage.dfu) this.a).a;
                if (aonnVar != null) {
                    aonnVar.a(cqfVarB, csjVar.q().a);
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.diq) obj).a(defpackage.din.A, new defpackage.dib(((defpackage.dib) this.a).a));
                return defpackage.aojh.a;
            case 9:
                ((java.util.List) obj).add(this.a.a());
                return java.lang.Boolean.TRUE;
            case 10:
                defpackage.dnj dnjVar = (defpackage.dnj) obj;
                defpackage.dnd dndVar = dnjVar.b;
                int i8 = dnjVar.c;
                int i9 = dnjVar.d;
                java.lang.Object obj3 = dnjVar.e;
                return ((defpackage.gat) this.a).m(new defpackage.dnj(null, dndVar, i8, i9)).a();
            case 11:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                java.lang.Object obj4 = this.a;
                if (th != null) {
                    ((defpackage.eei) obj4).h.Y(new defpackage.eeu(th));
                }
                defpackage.eei eeiVar = (defpackage.eei) obj4;
                if (eeiVar.d.b()) {
                    defpackage.eer eerVarJ = eeiVar.j();
                    eerVarJ.b.set(true);
                    eerVarJ.a.a();
                }
                return defpackage.aojh.a;
            case 12:
                ((defpackage.gat) this.a).c.d(null);
                return defpackage.aojh.a;
            case 13:
                this.a.e(null);
                return defpackage.aojh.a;
            case 14:
                return defpackage.dzn.n((defpackage.gab) this.a);
            case 15:
                defpackage.gin ginVar = (defpackage.gin) obj;
                if (ginVar == null) {
                    defpackage.aooh.i("it");
                }
                this.a.a(new defpackage.gff(ginVar));
                return defpackage.aojh.a;
            case 16:
                defpackage.gin ginVar2 = (defpackage.gin) obj;
                if (ginVar2 == null) {
                    defpackage.aooh.i("it");
                    defpackage.aooh.i("statement");
                }
                defpackage.ggd ggdVar = (defpackage.ggd) this.a;
                int i10 = ggdVar.g;
                if (i10 > 0) {
                    int i11 = 1;
                    while (true) {
                        int i12 = ggdVar.f[i11];
                        if (i12 == 1) {
                            ginVar2.i(i11);
                        } else if (i12 == 2) {
                            ginVar2.h(i11, ggdVar.b[i11]);
                        } else if (i12 == 3) {
                            ginVar2.g(i11, ggdVar.c[i11]);
                        } else if (i12 == 4) {
                            java.lang.String str = ggdVar.d[i11];
                            if (str == null) {
                                throw new java.lang.IllegalArgumentException("Required value was null.");
                            }
                            ginVar2.j(i11, str);
                        } else if (i12 == 5) {
                            byte[] bArr = ggdVar.e[i11];
                            if (bArr == null) {
                                throw new java.lang.IllegalArgumentException("Required value was null.");
                            }
                            ginVar2.f(i11, bArr);
                        }
                        if (i11 != i10) {
                            i11++;
                        }
                    }
                }
                return defpackage.aojh.a;
            case 17:
                if (((java.lang.String) obj) == null) {
                    defpackage.aooh.i("it");
                }
                if (((defpackage.gim) ((defpackage.cop) this.a).d).b) {
                    return defpackage.aojh.a;
                }
                throw new java.lang.IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            case 18:
                java.util.List list = (java.util.List) obj;
                defpackage.aooh.f(list, "activityStacks");
                java.lang.Object obj5 = this.a;
                ?? r3 = ((defpackage.gpd) obj5).c;
                r3.lock();
                try {
                    ?? r4 = ((defpackage.gpd) obj5).f;
                    java.util.Set<java.lang.String> setKeySet = ((android.util.ArrayMap) r4).keySet();
                    defpackage.aooh.e(setKeySet, "<get-keys>(...)");
                    ((android.util.ArrayMap) r4).clear();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj6 : list) {
                        if (ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m(obj6)) != null) {
                            arrayList.add(obj6);
                        }
                    }
                    java.util.List listBZ = defpackage.ajsz.bZ(arrayList);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(listBZ, 10));
                    java.util.Iterator it = listBZ.iterator();
                    while (it.hasNext()) {
                        androidx.window.extensions.embedding.ActivityStack activityStackM = ddz$.ExternalSyntheticApiModelOutline0.m(it.next());
                        java.lang.String strM = ddz$.ExternalSyntheticApiModelOutline0.m(activityStackM);
                        defpackage.aooh.c(strM);
                        arrayList2.add(new defpackage.aoiu(strM, activityStackM));
                    }
                    defpackage.ajsz.aU(r4, arrayList2);
                    if (!setKeySet.isEmpty()) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Set setKeySet2 = ((android.util.ArrayMap) r4).keySet();
                        defpackage.aooh.e(setKeySet2, "<get-keys>(...)");
                        for (java.lang.String str2 : setKeySet) {
                            if (!setKeySet2.contains(str2) && ddz$.ExternalSyntheticApiModelOutline0.m((androidx.window.extensions.embedding.ActivityEmbeddingComponent) ((defpackage.gpd) obj5).a, str2) == null) {
                                arrayList3.add(str2);
                            }
                        }
                        java.util.Iterator it2 = arrayList3.iterator();
                        defpackage.aooh.e(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            java.lang.Object next = it2.next();
                            defpackage.aooh.e(next, "next(...)");
                            java.lang.String str3 = (java.lang.String) next;
                            ((defpackage.gpd) obj5).d.remove(str3);
                            ((android.util.ArrayMap) ((defpackage.gpd) obj5).e).remove(str3);
                            break;
                        }
                    }
                    return defpackage.aojh.a;
                } finally {
                    r3.unlock();
                }
            case 19:
                defpackage.gjh gjhVar = (defpackage.gjh) obj;
                if (gjhVar == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA = gjhVar.a((java.lang.String) this.a);
                try {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        arrayList4.add(ginVarA.e(0));
                    }
                    ginVarA.close();
                    return arrayList4;
                } catch (java.lang.Throwable th2) {
                    ginVarA.close();
                    throw th2;
                }
            default:
                defpackage.gjh gjhVar2 = (defpackage.gjh) obj;
                if (gjhVar2 == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA2 = gjhVar2.a((java.lang.String) this.a);
                try {
                    ginVarA2.m();
                    return defpackage.aojh.a;
                } finally {
                    ginVarA2.close();
                }
        }
    }

    public /* synthetic */ ddz(int i, byte[] bArr) {
        this.$cid = i;
        this.a = "DELETE FROM WorkProgress";
    }

    public /* synthetic */ ddz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
