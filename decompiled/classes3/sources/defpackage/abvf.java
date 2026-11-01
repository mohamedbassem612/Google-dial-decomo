package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abvf extends aomh implements aonn {
    int a;
    final /* synthetic */ abvh b;
    final /* synthetic */ java.util.List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvf(abvh abvhVar, java.util.List list, aoln aolnVar) {
        super(2, aolnVar);
        this.b = abvhVar;
        this.c = list;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objY;
        defpackage.abtw abtwVar;
        defpackage.abuc abucVar;
        defpackage.abuc abucVar2;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            objY = obj;
        } else {
            abvh abvhVar = this.b;
            java.util.List list = this.c;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier(((java.lang.Number) it.next()).longValue()));
            }
            aaum aaumVarD = abvhVar.c.d(arrayList);
            this.a = 1;
            objY = aooh.Y(aaumVarD, this);
            if (objY == aoluVar) {
                return aoluVar;
            }
        }
        java.util.List list2 = this.c;
        java.util.List list3 = (java.util.List) objY;
        aooh.c(list3);
        java.util.List listCc = ajsz.cc(list2, list3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(listCc, 10));
        java.util.Iterator it2 = listCc.iterator();
        while (it2.hasNext()) {
            aoiu aoiuVar = (aoiu) it2.next();
            long jLongValue = ((java.lang.Number) aoiuVar.a).longValue();
            java.lang.Object obj2 = aoiuVar.b;
            aooh.e(obj2, "<get-second>(...)");
            com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse getCallingCardResponse = (com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse) obj2;
            aooh.f(getCallingCardResponse, "getCallingCardResponse");
            defpackage.abuf abufVarK = abts.k(getCallingCardResponse.a.a);
            aooh.f(getCallingCardResponse, "getCallingCardResponse");
            android.net.Uri uri = getCallingCardResponse.c;
            java.lang.String str = getCallingCardResponse.d;
            com.google.android.gms.people.cpg.callingcard.CallingCardMetadata callingCardMetadata = getCallingCardResponse.e;
            int i2 = getCallingCardResponse.b;
            defpackage.abup abupVar = defpackage.abup.UNKNOWN;
            defpackage.abup abupVarJ = abts.j(i2);
            if (uri == null || str == null || callingCardMetadata == null || abupVarJ != defpackage.abup.CONTACT) {
                it2 = it2;
                abtwVar = null;
            } else {
                switch (str) {
                    case "video/webm":
                        abucVar = defpackage.abuc.g;
                        break;
                    case "image/avif":
                        abucVar = defpackage.abuc.e;
                        break;
                    case "image/webp":
                        abucVar = defpackage.abuc.d;
                        break;
                    case "image/gif":
                        abucVar = defpackage.abuc.a;
                        break;
                    case "image/png":
                        abucVar = defpackage.abuc.c;
                        break;
                    case "video/mp4":
                        abucVar = defpackage.abuc.f;
                        break;
                    default:
                        abucVar = defpackage.abuc.b;
                        break;
                }
                defpackage.zoe zoeVarD = ajee.D(defpackage.amjp.a.m());
                com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData callingCardFullScreenImageData = callingCardMetadata.b;
                if (callingCardFullScreenImageData != null) {
                    java.lang.Float fValueOf = java.lang.Float.valueOf(callingCardFullScreenImageData.a);
                    if (fValueOf.floatValue() == -2.1474836E9f) {
                        fValueOf = null;
                    }
                    java.lang.Float fValueOf2 = java.lang.Float.valueOf(callingCardFullScreenImageData.b);
                    if (fValueOf2.floatValue() == -2.1474836E9f) {
                        fValueOf2 = null;
                    }
                    java.lang.Float fValueOf3 = java.lang.Float.valueOf(callingCardFullScreenImageData.c);
                    if (fValueOf3.floatValue() == -2.1474836E9f) {
                        fValueOf3 = null;
                    }
                    if (fValueOf != null || fValueOf2 != null || fValueOf3 != null) {
                        ajyi ajyiVarO = amjk.o(amjn.a.m());
                        ajyi ajyiVarE = ajee.E(amjs.a.m());
                        if (fValueOf != null) {
                            ajyiVarE.aB(fValueOf.floatValue());
                        }
                        if (fValueOf2 != null) {
                            ajyiVarE.aC(fValueOf2.floatValue());
                        }
                        if (fValueOf3 != null) {
                            ajyiVarE.aD(fValueOf3.floatValue());
                        }
                        ajyiVarO.aM(ajyiVarE.aA());
                        zoeVarD.W(ajyiVarO.aL());
                    }
                }
                com.google.android.gms.people.cpg.callingcard.CallingCardFontData callingCardFontData = callingCardMetadata.a;
                if (callingCardFontData != null) {
                    java.lang.Float fValueOf4 = java.lang.Float.valueOf(callingCardFontData.e);
                    if (fValueOf4.floatValue() == r15) {
                        fValueOf4 = null;
                    }
                    float f = callingCardFontData.f;
                    java.lang.Float fValueOf5 = java.lang.Float.valueOf(f);
                    if (fValueOf5.floatValue() == r15) {
                        fValueOf5 = null;
                    }
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(callingCardFontData.g);
                    java.lang.Float f2 = fValueOf4;
                    if (numValueOf.intValue() == Integer.MIN_VALUE) {
                        numValueOf = null;
                    }
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(callingCardFontData.h);
                    abucVar2 = abucVar;
                    if (numValueOf2.intValue() == Integer.MIN_VALUE) {
                        numValueOf2 = null;
                    }
                    java.lang.Float fValueOf6 = java.lang.Float.valueOf(callingCardFontData.i);
                    if (fValueOf6.floatValue() == -822083584) {
                        fValueOf6 = null;
                    }
                    boolean z = false;
                    boolean z2 = (f == 0.0f || (f2 == null && fValueOf5 == null && numValueOf == null && numValueOf2 == null && fValueOf6 == null)) ? false : true;
                    float f3 = callingCardFontData.d;
                    if (f3 != 0) {
                        z = true;
                    } else if (z2) {
                        z2 = true;
                    }
                    java.lang.Float f4 = fValueOf6;
                    ajyi ajyiVarF = ajee.F(amjr.a.m());
                    if (z) {
                        defpackage.vaa vaaVarC = ajee.C(defpackage.amml.a.m());
                        vaaVarC.at(callingCardFontData.a);
                        vaaVarC.ar(callingCardFontData.c);
                        vaaVarC.as(callingCardFontData.b);
                        xtq xtqVarK = aknx.K(akzv.a.m());
                        xtqVarK.ao(f3);
                        vaaVarC.aq(xtqVarK.an());
                        ajyiVarF.aF(vaaVarC.ap());
                    }
                    if (z2) {
                        if (f2 != null) {
                            ajyiVarF.aI(f2.floatValue());
                        }
                        if (fValueOf5 != 0) {
                            ajyiVarF.aK(fValueOf5.floatValue());
                        }
                        if (numValueOf != null) {
                            ajyiVarF.aJ(numValueOf.intValue());
                        }
                        if (numValueOf2 != null) {
                            ajyiVarF.aG(numValueOf2.intValue());
                        }
                        if (f4 != null) {
                            ajyiVarF.aH(f4.floatValue());
                        }
                    }
                    zoeVarD.X(ajyiVarF.aE());
                } else {
                    abucVar2 = abucVar;
                }
                abtwVar = new defpackage.abtw(jLongValue, abupVarJ, uri, abucVar2, zoeVarD.V());
            }
            arrayList2.add(new defpackage.abud(jLongValue, abufVarK, abtwVar));
            it2 = it2;
        }
        return new defpackage.abue(arrayList2);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.abvf(this.b, this.c, aolnVar);
    }
}
