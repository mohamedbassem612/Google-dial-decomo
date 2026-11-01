package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wjb {
    public final java.util.concurrent.Executor a;
    public final java.util.LinkedHashMap b;
    public akzx c;
    private final ajct d;

    public wjb(ajct ajctVar, aazc aazcVar) {
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(aazcVar, "clock");
        this.d = ajctVar;
        this.a = new ajdc(ajctVar);
        this.b = new java.util.LinkedHashMap();
        akzx akzxVarM = aiyr.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        this.c = akzxVarM;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final boolean c(amgo amgoVar) throws aois {
        int iOrdinal = defpackage.amgn.a(amgoVar.b).ordinal();
        if (iOrdinal == 0) {
            return (amgoVar.b == 2 ? (amgl) amgoVar.c : amgl.a).c;
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal != 2) {
            throw new aois();
        }
        throw new java.lang.IllegalStateException("invalid TranscriptionModeUpdate");
    }

    private static final int e(java.lang.String str) {
        if (str.length() == 0) {
            return 0;
        }
        return new aorg("\\s+").h(aoov.x(str).toString()).size();
    }

    private static final boolean f(defpackage.wmz wmzVar, int i) {
        int i2 = wmzVar.c;
        int I = wsc.I(i2);
        alat alatVar = null;
        if (I == 0) {
            throw null;
        }
        int i3 = I - 1;
        if (i3 == 0) {
            alatVar = (i2 == 2 ? (defpackage.wnc) wmzVar.d : defpackage.wnc.a).e;
        } else if (i3 == 1) {
            alatVar = (i2 == 3 ? (defpackage.wnb) wmzVar.d : defpackage.wnb.a).g;
        } else if (i3 == 3) {
            alatVar = (i2 == 5 ? (defpackage.wng) wmzVar.d : defpackage.wng.a).e;
        }
        if (alatVar != null && !alatVar.isEmpty()) {
            java.util.Iterator it = alatVar.iterator();
            while (it.hasNext()) {
                int iO = wsc.O(((defpackage.wke) it.next()).e);
                if (iO == 0) {
                    iO = 1;
                }
                if (iO == i) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final int g(java.lang.String str, int i, int i2) {
        if (str.length() == 0) {
            return 0;
        }
        java.lang.String strSubstring = str.substring(i, i2);
        aooh.e(strSubstring, "substring(...)");
        return e(strSubstring);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final aify a() throws aois {
        java.lang.String str;
        defpackage.wgw wgwVar;
        int iBz;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = this.b.values().iterator();
        while (true) {
            int i = 6;
            if (!it.hasNext()) {
                java.lang.Object objCollect = j$.util.Collection.-EL.stream(linkedHashMap.values()).map(new defpackage.vxb(new ukw(12), i)).collect(aido.a);
                aooh.e(objCollect, "collect(...)");
                return (aify) objCollect;
            }
            java.lang.Object next = it.next();
            aooh.e(next, "next(...)");
            defpackage.wmz wmzVar = (defpackage.wmz) next;
            int i2 = wmzVar.c;
            int I = wsc.I(i2);
            if (I == 0) {
                throw null;
            }
            int i3 = I - 1;
            int i4 = 3;
            if (i3 == 0) {
                str = (i2 == 2 ? (defpackage.wnc) wmzVar.d : defpackage.wnc.a).c;
            } else if (i3 == 1) {
                str = (i2 == 3 ? (defpackage.wnb) wmzVar.d : defpackage.wnb.a).c;
            } else if (i3 == 2) {
                str = null;
            } else if (i3 != 3) {
                if (i3 != 4 && i3 != 5) {
                    throw new aois();
                }
                str = null;
            } else {
                str = (i2 == 5 ? (defpackage.wng) wmzVar.d : defpackage.wng.a).c;
            }
            if (str != null && str.length() != 0) {
                int I2 = wsc.I(wmzVar.c);
                int i5 = I2 - 1;
                if (I2 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    wgwVar = defpackage.wgw.INFO;
                } else if (i5 == 1) {
                    wgwVar = defpackage.wgw.OPTION_DTMF;
                } else if (i5 == 2) {
                    wgwVar = defpackage.wgw.MUSIC_PLAYING;
                } else {
                    if (i5 != 3) {
                        if (i5 == 4 || i5 == 5) {
                            throw new java.lang.IllegalStateException("invalid tree item type");
                        }
                        throw new aois();
                    }
                    wgwVar = defpackage.wgw.OPTION_VOICE;
                }
                int iE = e(str);
                java.lang.Object obj = linkedHashMap.get(wgwVar);
                java.lang.Object obj2 = obj;
                if (obj == null) {
                    akzx akzxVarM = aiyq.a.m();
                    int I3 = wsc.I(wmzVar.c);
                    int i6 = I3 - 1;
                    if (I3 == 0) {
                        throw null;
                    }
                    if (i6 == 0) {
                        i4 = 2;
                    } else if (i6 != 1) {
                        if (i6 == 2) {
                            i4 = 5;
                        } else {
                            if (i6 != 3) {
                                if (i6 == 4 || i6 == 5) {
                                    throw new java.lang.IllegalStateException("invalid tree item type");
                                }
                                throw new aois();
                            }
                            i4 = 4;
                        }
                    }
                    akzxVarM.u();
                    aiyq aiyqVar = akzxVarM.b;
                    aiyqVar.c = i4 - 1;
                    aiyqVar.b |= 1;
                    obj2 = akzxVarM;
                }
                akzx akzxVar = (akzx) obj2;
                int i7 = akzxVar.b.d + iE;
                akzxVar.u();
                aiyq aiyqVar2 = akzxVar.b;
                aiyqVar2.b |= 2;
                aiyqVar2.d = i7;
                java.util.List<defpackage.wke> listT = wsc.T(wmzVar, 6);
                int iBz2 = 0;
                if (listT != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listT, 10));
                    for (defpackage.wke wkeVar : listT) {
                        arrayList.add(java.lang.Integer.valueOf(g(str, wkeVar.c, wkeVar.d)));
                    }
                    iBz = ajsz.bz(arrayList);
                } else {
                    iBz = 0;
                }
                if (iBz > 0) {
                    int i8 = akzxVar.b.e + iBz;
                    akzxVar.u();
                    aiyq aiyqVar3 = akzxVar.b;
                    aiyqVar3.b |= 4;
                    aiyqVar3.e = i8;
                    if (iE == iBz) {
                        int i9 = aiyqVar3.f + 1;
                        akzxVar.u();
                        aiyq aiyqVar4 = akzxVar.b;
                        aiyqVar4.b |= 8;
                        aiyqVar4.f = i9;
                    } else {
                        int i10 = aiyqVar3.g + 1;
                        akzxVar.u();
                        aiyq aiyqVar5 = akzxVar.b;
                        aiyqVar5.b |= 16;
                        aiyqVar5.g = i10;
                    }
                }
                java.util.List<defpackage.wke> listT2 = wsc.T(wmzVar, 5);
                if (listT2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(listT2, 10));
                    for (defpackage.wke wkeVar2 : listT2) {
                        arrayList2.add(java.lang.Integer.valueOf(g(str, wkeVar2.c, wkeVar2.d)));
                    }
                    iBz2 = ajsz.bz(arrayList2);
                }
                if (iBz2 > 0) {
                    int i11 = akzxVar.b.h + iBz2;
                    akzxVar.u();
                    aiyq aiyqVar6 = akzxVar.b;
                    aiyqVar6.b |= 32;
                    aiyqVar6.h = i11;
                    if (iE == iBz2) {
                        int i12 = aiyqVar6.i + 1;
                        akzxVar.u();
                        aiyq aiyqVar7 = akzxVar.b;
                        aiyqVar7.b |= 64;
                        aiyqVar7.i = i12;
                    } else {
                        int i13 = aiyqVar6.j + 1;
                        akzxVar.u();
                        aiyq aiyqVar8 = akzxVar.b;
                        aiyqVar8.b |= 128;
                        aiyqVar8.j = i13;
                    }
                }
                linkedHashMap.put(wgwVar, akzxVar);
            }
        }
    }

    public final void b(amgo amgoVar, long j) {
        aooh.f(amgoVar, "transcriptionModeUpdate");
        agsm.i(1067, ahvr.F(new defpackage.wja(this, amgoVar, j, 0), this.a), "failed to track transcription mode update", new java.lang.Object[0]);
    }

    public final void d(int i, boolean z, long j) {
        akzx akzxVarM = aiyp.a.m();
        akzxVarM.u();
        aiyp aiypVar = akzxVarM.b;
        aiypVar.c = i - 1;
        aiypVar.b |= 1;
        akzxVarM.u();
        aiyp aiypVar2 = akzxVarM.b;
        aiypVar2.b |= 2;
        aiypVar2.e = z;
        aify aifyVarA = a();
        akzxVarM.u();
        aiyp aiypVar3 = akzxVarM.b;
        alat alatVar = aiypVar3.d;
        if (!alatVar.c()) {
            aiypVar3.d = alad.J(alatVar);
        }
        akyl.i(aifyVarA, aiypVar3.d);
        long epochMilli = j$.time.Instant.now().toEpochMilli() - j;
        akzxVarM.u();
        aiyp aiypVar4 = akzxVarM.b;
        aiypVar4.b |= 32;
        aiypVar4.i = epochMilli;
        java.util.LinkedHashMap linkedHashMap = this.b;
        if (!linkedHashMap.values().isEmpty()) {
            java.util.Collection collectionValues = linkedHashMap.values();
            aooh.e(collectionValues, "<get-values>(...)");
            java.util.Iterator it = collectionValues.iterator();
            if (!it.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object next = it.next();
            while (it.hasNext()) {
                next = (defpackage.wmz) it.next();
            }
            long j2 = ((defpackage.wmz) next).f;
            akzxVarM.u();
            aiyp aiypVar5 = akzxVarM.b;
            aiypVar5.b |= 4;
            aiypVar5.f = j2;
            java.util.Collection collectionValues2 = linkedHashMap.values();
            aooh.e(collectionValues2, "<get-values>(...)");
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            for (java.lang.Object obj3 : collectionValues2) {
                defpackage.wmz wmzVar = (defpackage.wmz) obj3;
                aooh.c(wmzVar);
                if (f(wmzVar, 6)) {
                    obj2 = obj3;
                }
            }
            defpackage.wmz wmzVar2 = (defpackage.wmz) obj2;
            if (wmzVar2 != null) {
                int i2 = wmzVar2.g;
                akzxVarM.u();
                aiyp aiypVar6 = akzxVarM.b;
                aiypVar6.b |= 8;
                aiypVar6.g = i2;
            }
            java.util.Collection collectionValues3 = linkedHashMap.values();
            aooh.e(collectionValues3, "<get-values>(...)");
            for (java.lang.Object obj4 : collectionValues3) {
                defpackage.wmz wmzVar3 = (defpackage.wmz) obj4;
                aooh.c(wmzVar3);
                if (f(wmzVar3, 5)) {
                    obj = obj4;
                }
            }
            defpackage.wmz wmzVar4 = (defpackage.wmz) obj;
            if (wmzVar4 != null) {
                int i3 = wmzVar4.g;
                akzxVarM.u();
                aiyp aiypVar7 = akzxVarM.b;
                aiypVar7.b |= 16;
                aiypVar7.h = i3;
            }
        }
        akzx akzxVar = this.c;
        akzxVar.u();
        aiyr aiyrVar = akzxVar.b;
        aiyp aiypVarP = akzxVarM.p();
        aiyr aiyrVar2 = aiyr.a;
        j$.util.Objects.requireNonNull(aiypVarP);
        alat alatVar2 = aiyrVar.e;
        if (!alatVar2.c()) {
            aiyrVar.e = alad.J(alatVar2);
        }
        aiyrVar.e.add(aiypVarP);
    }
}
