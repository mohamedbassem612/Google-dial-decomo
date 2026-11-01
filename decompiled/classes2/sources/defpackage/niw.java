package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class niw extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    long c;
    int d;
    final /* synthetic */ defpackage.njd e;
    final /* synthetic */ alta f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niw(defpackage.njd njdVar, alta altaVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = njdVar;
        this.f = altaVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:22:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object obj2;
        java.lang.Object objD;
        long jLongValue;
        defpackage.njd njdVar;
        java.lang.Object obj3;
        alsw alswVar;
        int iOrdinal;
        alsn alsnVar;
        java.lang.Object objC;
        java.lang.Object obj4;
        java.lang.Object obj5;
        altf altfVar;
        java.lang.Object objD2;
        defpackage.nik nijVar;
        java.lang.Object obj6;
        defpackage.nid nidVar;
        java.lang.Object objE;
        aolu aoluVar = aolu.a;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
            } else {
                if (i == 2) {
                    obj2 = this.a;
                    aooc.af(obj);
                    objD = obj;
                    jLongValue = ((java.lang.Number) objD).longValue();
                    njdVar = this.e;
                    j$.util.Optional optionalA = njdVar.j.a();
                    aooh.e(optionalA, "startLocalTimer(...)");
                    obj3 = (aeun) aooh.q(optionalA);
                    alswVar = (alsw) obj2;
                    iOrdinal = alsv.a(alswVar.b).ordinal();
                    if (iOrdinal != 0) {
                        if (alswVar.b == 1) {
                            alsnVar = (alsn) alswVar.c;
                        } else {
                            alsnVar = alsn.a;
                        }
                        aooh.e(alsnVar, "getRecording(...)");
                        boolean zQ = defpackage.njd.q(this.f);
                        this.a = obj2;
                        this.b = obj3;
                        this.c = jLongValue;
                        this.d = 4;
                        objC = njdVar.c(alsnVar, zQ, this);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        obj4 = obj2;
                        obj5 = obj3;
                        nijVar = (defpackage.nik) objC;
                        obj3 = obj5;
                        obj2 = obj4;
                    } else if (iOrdinal == 1) {
                        if (alswVar.b == 2) {
                            altfVar = (altf) alswVar.c;
                        } else {
                            altfVar = altf.a;
                        }
                        aooh.e(altfVar, "getTtsRequest(...)");
                        boolean zQ2 = defpackage.njd.q(this.f);
                        this.a = obj2;
                        this.b = obj3;
                        this.c = jLongValue;
                        this.d = 3;
                        objD2 = njdVar.d(altfVar, zQ2, this);
                        if (objD2 != aoluVar) {
                            return aoluVar;
                        }
                        obj4 = obj2;
                        obj5 = obj3;
                        nijVar = (defpackage.nik) objD2;
                        obj3 = obj5;
                        obj2 = obj4;
                    } else if (iOrdinal == 2 && iOrdinal != 3) {
                        throw new aois();
                    }
                    j$.util.Objects.checkIndex(0, 3);
                    if (nijVar != null) {
                        if (nijVar instanceof defpackage.nii) {
                            return ((defpackage.nii) nijVar).a;
                        }
                        if (nijVar instanceof defpackage.nij) {
                            obj6 = obj2;
                            defpackage.njd njdVar2 = this.e;
                            defpackage.nij nijVar2 = (defpackage.nij) nijVar;
                            defpackage.nih nihVar = nijVar2.a;
                            alta altaVar = this.f;
                            boolean z = nijVar2.b;
                            if (alsv.a(((alsw) obj6).b) == alsv.a) {
                                nidVar = null;
                            } else {
                                nidVar = null;
                            }
                            this.a = null;
                            this.b = null;
                            this.d = 5;
                            objE = njdVar2.e(nihVar, jLongValue, altaVar, z, nidVar, this);
                            if (objE == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    throw new aois();
                }
                if (i == 3) {
                    long j = this.c;
                    obj5 = this.b;
                    obj4 = this.a;
                    aooc.af(obj);
                    jLongValue = j;
                    objD2 = obj;
                    nijVar = (defpackage.nik) objD2;
                    obj3 = obj5;
                    obj2 = obj4;
                    j$.util.Objects.checkIndex(0, 3);
                    if (nijVar != null) {
                        if (nijVar instanceof defpackage.nii) {
                            return ((defpackage.nii) nijVar).a;
                        }
                        if (nijVar instanceof defpackage.nij) {
                            obj6 = obj2;
                            defpackage.njd njdVar3 = this.e;
                            defpackage.nij nijVar3 = (defpackage.nij) nijVar;
                            defpackage.nih nihVar2 = nijVar3.a;
                            alta altaVar2 = this.f;
                            boolean z2 = nijVar3.b;
                            if (alsv.a(((alsw) obj6).b) == alsv.a) {
                                nidVar = null;
                            } else {
                                nidVar = null;
                            }
                            this.a = null;
                            this.b = null;
                            this.d = 5;
                            objE = njdVar3.e(nihVar2, jLongValue, altaVar2, z2, nidVar, this);
                            if (objE == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    throw new aois();
                }
                if (i == 4) {
                    long j2 = this.c;
                    obj5 = this.b;
                    obj4 = this.a;
                    aooc.af(obj);
                    jLongValue = j2;
                    objC = obj;
                    nijVar = (defpackage.nik) objC;
                    obj3 = obj5;
                    obj2 = obj4;
                    j$.util.Objects.checkIndex(0, 3);
                    if (nijVar != null) {
                        if (nijVar instanceof defpackage.nii) {
                            return ((defpackage.nii) nijVar).a;
                        }
                        if (nijVar instanceof defpackage.nij) {
                            obj6 = obj2;
                            defpackage.njd njdVar4 = this.e;
                            defpackage.nij nijVar4 = (defpackage.nij) nijVar;
                            defpackage.nih nihVar3 = nijVar4.a;
                            alta altaVar3 = this.f;
                            boolean z3 = nijVar4.b;
                            if (alsv.a(((alsw) obj6).b) == alsv.a || obj3 == null) {
                                nidVar = null;
                            } else {
                                nidVar = new defpackage.nid((aeun) obj3, ruc.aT);
                            }
                            this.a = null;
                            this.b = null;
                            this.d = 5;
                            objE = njdVar4.e(nihVar3, jLongValue, altaVar3, z3, nidVar, this);
                            if (objE == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    throw new aois();
                }
                aooc.af(obj);
                objE = obj;
            }
            return (defpackage.Cnew) objE;
        }
        aooc.af(obj);
        defpackage.njd njdVar5 = this.e;
        defpackage.nvp nvpVar = defpackage.nvp.EVENT_DUPLEX_REQUEST_PLAYING_RECORDING;
        this.d = 1;
        if (njdVar5.f.x(nvpVar, this) == aoluVar) {
            return aoluVar;
        }
        obj2 = this.f.d;
        if (obj2 == null) {
            obj2 = alsw.a;
        }
        aooh.e(obj2, "getSpeech(...)");
        defpackage.njd njdVar6 = this.e;
        this.a = obj2;
        this.d = 2;
        objD = njdVar6.g.d(this);
        if (objD == aoluVar) {
            return aoluVar;
        }
        jLongValue = ((java.lang.Number) objD).longValue();
        njdVar = this.e;
        j$.util.Optional optionalA2 = njdVar.j.a();
        aooh.e(optionalA2, "startLocalTimer(...)");
        obj3 = (aeun) aooh.q(optionalA2);
        alswVar = (alsw) obj2;
        iOrdinal = alsv.a(alswVar.b).ordinal();
        if (iOrdinal != 0) {
            if (alswVar.b == 1) {
                alsnVar = (alsn) alswVar.c;
            } else {
                alsnVar = alsn.a;
            }
            aooh.e(alsnVar, "getRecording(...)");
            boolean zQ3 = defpackage.njd.q(this.f);
            this.a = obj2;
            this.b = obj3;
            this.c = jLongValue;
            this.d = 4;
            objC = njdVar.c(alsnVar, zQ3, this);
            if (objC != aoluVar) {
                return aoluVar;
            }
            obj4 = obj2;
            obj5 = obj3;
            nijVar = (defpackage.nik) objC;
            obj3 = obj5;
            obj2 = obj4;
        } else if (iOrdinal == 1) {
            nijVar = iOrdinal == 2 ? new defpackage.nij(null, false) : new defpackage.nij(null, false);
        } else {
            if (alswVar.b == 2) {
                altfVar = (altf) alswVar.c;
            } else {
                altfVar = altf.a;
            }
            aooh.e(altfVar, "getTtsRequest(...)");
            boolean zQ4 = defpackage.njd.q(this.f);
            this.a = obj2;
            this.b = obj3;
            this.c = jLongValue;
            this.d = 3;
            objD2 = njdVar.d(altfVar, zQ4, this);
            if (objD2 != aoluVar) {
                return aoluVar;
            }
            obj4 = obj2;
            obj5 = obj3;
            nijVar = (defpackage.nik) objD2;
            obj3 = obj5;
            obj2 = obj4;
        }
        j$.util.Objects.checkIndex(0, 3);
        if (nijVar != null) {
            if (nijVar instanceof defpackage.nii) {
                return ((defpackage.nii) nijVar).a;
            }
            if (nijVar instanceof defpackage.nij) {
                obj6 = obj2;
                defpackage.njd njdVar7 = this.e;
                defpackage.nij nijVar5 = (defpackage.nij) nijVar;
                defpackage.nih nihVar4 = nijVar5.a;
                alta altaVar4 = this.f;
                boolean z4 = nijVar5.b;
                if (alsv.a(((alsw) obj6).b) == alsv.a) {
                    nidVar = null;
                } else {
                    nidVar = null;
                }
                this.a = null;
                this.b = null;
                this.d = 5;
                objE = njdVar7.e(nihVar4, jLongValue, altaVar4, z4, nidVar, this);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                return (defpackage.Cnew) objE;
            }
        }
        throw new aois();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.niw(this.e, this.f, aolnVar);
    }
}
