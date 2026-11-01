package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iui implements defpackage.iue {
    public final defpackage.gfj a = new defpackage.iuf(this);
    public final defpackage.gfi b = new defpackage.iug(this);
    public final defpackage.gfi c = new defpackage.iuh(this);
    private final defpackage.gfy d;

    public iui(defpackage.gfy gfyVar) {
        this.d = gfyVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x017d A[SYNTHETIC] */
    public static final iuj k(defpackage.gin ginVar) {
        java.util.UUID uuid;
        int i;
        int i2;
        itz itzVar;
        iub iubVar;
        iud iudVar;
        iud iudVar2;
        java.lang.String strE;
        defpackage.aojl aojlVar;
        java.lang.Object obj;
        java.lang.Object next;
        int iQ = defpackage.dzk.Q(ginVar, "createdTimestampMs");
        int iQ2 = defpackage.dzk.Q(ginVar, "uniqueId");
        int iQ3 = defpackage.dzk.Q(ginVar, "callId");
        int iQ4 = defpackage.dzk.Q(ginVar, "callEndedTimestampMs");
        int iQ5 = defpackage.dzk.Q(ginVar, "transcriptionFilePath");
        int iQ6 = defpackage.dzk.Q(ginVar, "transcriptionText");
        int iQ7 = defpackage.dzk.Q(ginVar, "transcriptionCreationTimestampMs");
        int iQ8 = defpackage.dzk.Q(ginVar, "audioRecordingFilePath");
        int iQ9 = defpackage.dzk.Q(ginVar, "callType");
        int iQ10 = defpackage.dzk.Q(ginVar, "is_content_verdict_banner_dismissed");
        int iQ11 = defpackage.dzk.Q(ginVar, "is_eligible_for_survey");
        int iQ12 = defpackage.dzk.Q(ginVar, "duplexCallActions");
        int iQ13 = defpackage.dzk.Q(ginVar, "errorType");
        int iQ14 = defpackage.dzk.Q(ginVar, "user_contentState");
        int iQ15 = defpackage.dzk.Q(ginVar, "aicore_contentState");
        long jC = iQ == -1 ? 0L : ginVar.c(iQ);
        if (iQ2 == -1) {
            i = -1;
            uuid = null;
        } else {
            byte[] bArrN = ginVar.n(iQ2);
            defpackage.aooh.f(bArrN, "bytes");
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArrN);
            uuid = new java.util.UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
            i = -1;
        }
        java.lang.String strE2 = (iQ3 == i || ginVar.l(iQ3)) ? null : ginVar.e(iQ3);
        java.lang.Long lValueOf = (iQ4 == i || ginVar.l(iQ4)) ? null : java.lang.Long.valueOf(ginVar.c(iQ4));
        java.lang.String strE3 = (iQ5 == i || ginVar.l(iQ5)) ? null : ginVar.e(iQ5);
        java.lang.String strE4 = (iQ6 == i || ginVar.l(iQ6)) ? null : ginVar.e(iQ6);
        java.lang.Long lValueOf2 = (iQ7 == i || ginVar.l(iQ7)) ? null : java.lang.Long.valueOf(ginVar.c(iQ7));
        java.lang.String strE5 = (iQ8 == i || ginVar.l(iQ8)) ? null : ginVar.e(iQ8);
        java.lang.Integer numValueOf = (iQ9 == i || ginVar.l(iQ9)) ? null : java.lang.Integer.valueOf((int) ginVar.c(iQ9));
        boolean z = false;
        boolean z2 = (iQ10 == i || ((int) ginVar.c(iQ10)) == 0) ? false : true;
        boolean z3 = (iQ11 == i || ((int) ginVar.c(iQ11)) == 0) ? false : true;
        if (iQ12 != i) {
            if (ginVar.l(iQ12)) {
                i2 = -1;
            } else {
                byte[] bArrN2 = ginVar.n(iQ12);
                defpackage.aooh.f(bArrN2, "byteArray");
                kqy kqyVarY = defpackage.alad.y(kqy.a, bArrN2);
                defpackage.aooh.e(kqyVarY, "parseFrom(...)");
                itzVar = new itz(kqyVarY);
                iQ13 = iQ13;
                i2 = -1;
            }
            if (iQ13 == i2) {
                if (ginVar.l(iQ13)) {
                    i2 = -1;
                } else {
                    strE = ginVar.e(iQ13);
                    defpackage.aooh.f(strE, "nameInStorage");
                    aojlVar = new defpackage.aojl((defpackage.aojo) iua.n);
                    obj = null;
                    while (aojlVar.hasNext()) {
                        next = aojlVar.next();
                        if (!defpackage.aooh.n(((iua) next).o, strE)) {
                            if (!z) {
                                throw new java.lang.IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj = next;
                        }
                    }
                    if (z) {
                        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    iubVar = new iub((iua) obj);
                    iQ14 = iQ14;
                    i2 = -1;
                }
                if (iQ14 != i2 || ginVar.l(iQ14)) {
                    iudVar = null;
                } else {
                    iudVar = new iud(m(ginVar.e(iQ14)));
                }
                if (r16 != i2 || ginVar.l(r16)) {
                    iudVar2 = null;
                } else {
                    iudVar2 = new iud(m(ginVar.e(iQ15)));
                }
                return new iuj(jC, uuid, strE2, lValueOf, strE3, strE4, lValueOf2, strE5, numValueOf, itzVar, iubVar, iudVar, iudVar2, z2, z3);
            }
            iubVar = null;
            if (iQ14 != i2) {
                iudVar = null;
            } else {
                iudVar = null;
            }
            if (r16 != i2) {
                iudVar2 = null;
            } else {
                iudVar2 = null;
            }
            return new iuj(jC, uuid, strE2, lValueOf, strE3, strE4, lValueOf2, strE5, numValueOf, itzVar, iubVar, iudVar, iudVar2, z2, z3);
        }
        i2 = i;
        itzVar = null;
        if (iQ13 == i2) {
            if (ginVar.l(iQ13)) {
                strE = ginVar.e(iQ13);
                defpackage.aooh.f(strE, "nameInStorage");
                aojlVar = new defpackage.aojl((defpackage.aojo) iua.n);
                obj = null;
                while (aojlVar.hasNext()) {
                    next = aojlVar.next();
                    if (!defpackage.aooh.n(((iua) next).o, strE)) {
                        if (!z) {
                            throw new java.lang.IllegalArgumentException("Collection contains more than one matching element.");
                        }
                        z = true;
                        obj = next;
                    }
                }
                if (z) {
                    throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
                }
                iubVar = new iub((iua) obj);
                iQ14 = iQ14;
                i2 = -1;
            } else {
                i2 = -1;
            }
            if (iQ14 != i2) {
                iudVar = null;
            } else {
                iudVar = null;
            }
            if (r16 != i2) {
                iudVar2 = null;
            } else {
                iudVar2 = null;
            }
            return new iuj(jC, uuid, strE2, lValueOf, strE3, strE4, lValueOf2, strE5, numValueOf, itzVar, iubVar, iudVar, iudVar2, z2, z3);
        }
        iubVar = null;
        if (iQ14 != i2) {
            iudVar = null;
        } else {
            iudVar = null;
        }
        if (r16 != i2) {
            iudVar2 = null;
        } else {
            iudVar2 = null;
        }
        return new iuj(jC, uuid, strE2, lValueOf, strE3, strE4, lValueOf2, strE5, numValueOf, itzVar, iubVar, iudVar, iudVar2, z2, z3);
    }

    public static final java.lang.String l(int i) {
        switch (i - 1) {
            case 0:
                return "UNKNOWN";
            case 1:
                return "CLEAN";
            case 2:
                return "SPAM";
            case 3:
                return "SCAM";
            case 4:
                return "GENERATING";
            case 5:
                return "TRANSIENT_FAILURE";
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TERMINAL_FAILURE";
            default:
                throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: ".concat(iuc.a(i)));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int m(java.lang.String str) {
        switch (str.hashCode()) {
            case -1913451371:
                if (str.equals("TRANSIENT_FAILURE")) {
                    return iuc.f;
                }
                break;
            case 2539132:
                if (str.equals("SCAM")) {
                    return iuc.d;
                }
                break;
            case 2551625:
                if (str.equals("SPAM")) {
                    return iuc.c;
                }
                break;
            case 64208425:
                if (str.equals("CLEAN")) {
                    return iuc.b;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return iuc.a;
                }
                break;
            case 790795506:
                if (str.equals("GENERATING")) {
                    return iuc.e;
                }
                break;
            case 1666755239:
                if (str.equals("TERMINAL_FAILURE")) {
                    return iuc.g;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(java.lang.String.valueOf(str)));
    }

    @Override // defpackage.abwx
    public final java.lang.Object a(java.util.List list, java.util.List list2, java.util.List list3, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new aju(this, list, list2, list3, 6), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object b(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new gwo(this, collection, 10, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object c(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new gwo(rsrVarI.a, rsrVarI, 5), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object d(java.lang.String str, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new gwo(this, str, 6, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.String str, java.lang.String str2, java.lang.Object obj, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, (ity) obj, aonjVar, 4), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object f(java.lang.String str, java.lang.String str2, java.util.Set set, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.dez.n(this.d, new dqw(this, str, str2, set, aonjVar, 3), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object g(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new gwo(rsrVarI.a, rsrVarI, 8), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object h(defpackage.giv givVar, defpackage.aoln aolnVar) {
        java.util.TreeMap treeMap = defpackage.ggd.a;
        defpackage.rsr rsrVarI = defpackage.dez.t(givVar).i();
        return defpackage.dez.o(this.d, true, false, new gwo(rsrVarI.a, rsrVarI, 7), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object i(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new gwo(this, collection, 9, (byte[]) null), aolnVar);
    }

    @Override // defpackage.abwx
    public final java.lang.Object j(java.util.Collection collection, defpackage.aoln aolnVar) {
        collection.getClass();
        return defpackage.dez.o(this.d, false, true, new gwo(this, collection, 11, (byte[]) null), aolnVar);
    }
}
