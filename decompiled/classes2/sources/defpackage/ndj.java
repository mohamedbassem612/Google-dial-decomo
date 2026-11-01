package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ndj extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    int f;
    int g;
    final /* synthetic */ defpackage.nej h;
    final /* synthetic */ defpackage.mmv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndj(defpackage.nej nejVar, defpackage.mmv mmvVar, aoln aolnVar) {
        super(1, aolnVar);
        this.h = nejVar;
        this.i = mmvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ndj(this.h, this.i, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:41:0x0124  */
    /* JADX WARN: Code duplicated, block: B:44:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0163  */
    /* JADX WARN: Code duplicated, block: B:48:0x0169  */
    /* JADX WARN: Code duplicated, block: B:51:0x017b  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object objC;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        defpackage.nej nejVar;
        defpackage.nmo nmoVar;
        defpackage.mmv mmvVar;
        int iOrdinal;
        java.lang.Object objG;
        java.lang.Object objG2;
        aimw aimwVar;
        aolu aoluVar = aolu.a;
        int i = this.g;
        int i2 = 3;
        int i3 = 1;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
            } else if (i == 2) {
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBeeslyDeferred$<anonymous>", 1288, "DobbyLifecycleController.kt").v("Failed to start Beesly since arbiter rejects.");
                    return aojh.a;
                }
                try {
                    this.h.V.m();
                    nejVar = this.h;
                    nmoVar = defpackage.nmo.BEESLY;
                    this.g = 3;
                    if (nejVar.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    mmvVar = this.i;
                    if (mmvVar == defpackage.mmv.c) {
                        this.h.X.a(qbc.cj);
                    } else if (mmvVar == defpackage.mmv.b) {
                        this.h.X.a(qbc.ck);
                    }
                    defpackage.nej nejVar2 = this.h;
                    this.g = 4;
                    defpackage.nrv.a.b().l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "updateCallType", 172, "DobbySessionWriter.kt").y("Updating call type to %s", mmvVar);
                    defpackage.npw npwVarAw = mni.aw(defpackage.nsm.a.m());
                    aooh.f(mmvVar, "<this>");
                    iOrdinal = mmvVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            i2 = 5;
                        } else if (iOrdinal != 2) {
                            throw new aois();
                        }
                    }
                    defpackage.nrv nrvVar = nejVar2.v;
                    npwVarAw.v(i2);
                    objG = nrvVar.g(npwVarAw.t(), this);
                    if (objG != aolu.a) {
                        objG = aojh.a;
                    }
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nej nejVar3 = this.h;
                    this.g = 5;
                    defpackage.npw npwVarAw2 = mni.aw(defpackage.nsm.a.m());
                    akzx akzxVar = (akzx) npwVarAw2.a;
                    akzxVar.u();
                    defpackage.nsm nsmVar = (defpackage.nsm) akzxVar.b;
                    nsmVar.n = a.T(4);
                    nsmVar.b |= 2048;
                    objG2 = nejVar3.v.g(npwVarAw2.t(), this);
                    if (objG2 != aolu.a) {
                        objG2 = aojh.a;
                    }
                    if (objG2 == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.lang.IllegalStateException e) {
                    defpackage.nej.a.b().k(e).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBeeslyDeferred$<anonymous>", 1299, "DobbyLifecycleController.kt").v("Failed to transition to AUDIO_PROCESSING as the call is not in RINGING or ACTIVE state.");
                    this.h.X.a(qbc.cl);
                    return aojh.a;
                }
            } else if (i == 3) {
                aooc.af(obj);
                mmvVar = this.i;
                if (mmvVar == defpackage.mmv.c) {
                    this.h.X.a(qbc.cj);
                } else if (mmvVar == defpackage.mmv.b) {
                    this.h.X.a(qbc.ck);
                }
                defpackage.nej nejVar4 = this.h;
                this.g = 4;
                defpackage.nrv.a.b().l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "updateCallType", 172, "DobbySessionWriter.kt").y("Updating call type to %s", mmvVar);
                defpackage.npw npwVarAw3 = mni.aw(defpackage.nsm.a.m());
                aooh.f(mmvVar, "<this>");
                iOrdinal = mmvVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        i2 = 5;
                    } else if (iOrdinal != 2) {
                        throw new aois();
                    }
                }
                defpackage.nrv nrvVar2 = nejVar4.v;
                npwVarAw3.v(i2);
                objG = nrvVar2.g(npwVarAw3.t(), this);
                if (objG != aolu.a) {
                    objG = aojh.a;
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
                defpackage.nej nejVar5 = this.h;
                this.g = 5;
                defpackage.npw npwVarAw4 = mni.aw(defpackage.nsm.a.m());
                akzx akzxVar2 = (akzx) npwVarAw4.a;
                akzxVar2.u();
                defpackage.nsm nsmVar2 = (defpackage.nsm) akzxVar2.b;
                nsmVar2.n = a.T(4);
                nsmVar2.b |= 2048;
                objG2 = nejVar5.v.g(npwVarAw4.t(), this);
                if (objG2 != aolu.a) {
                    objG2 = aojh.a;
                }
                if (objG2 == aoluVar) {
                    return aoluVar;
                }
            } else if (i == 4) {
                aooc.af(obj);
                defpackage.nej nejVar6 = this.h;
                this.g = 5;
                defpackage.npw npwVarAw5 = mni.aw(defpackage.nsm.a.m());
                akzx akzxVar3 = (akzx) npwVarAw5.a;
                akzxVar3.u();
                defpackage.nsm nsmVar3 = (defpackage.nsm) akzxVar3.b;
                nsmVar3.n = a.T(4);
                nsmVar3.b |= 2048;
                objG2 = nejVar6.v.g(npwVarAw5.t(), this);
                if (objG2 != aolu.a) {
                    objG2 = aojh.a;
                }
                if (objG2 == aoluVar) {
                    return aoluVar;
                }
            } else if (i != 5) {
                i3 = this.f;
                obj2 = this.e;
                objC = this.d;
                obj3 = this.c;
                java.lang.Object obj5 = this.b;
                obj4 = this.a;
                aooc.af(obj);
                aimwVar = obj5;
                ((aenj[]) obj2)[i3] = (aenj) obj;
                aimwVar.y((java.lang.String) obj3, new aepg(aenj.b((aenj) objC, (aenj[]) obj4)));
            } else {
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.nej nejVar7 = this.h;
        this.g = 1;
        obj = nejVar7.Z.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        int iOrdinal2 = nmoVarB.ordinal();
        if (iOrdinal2 != 1 && iOrdinal2 != 2) {
            aimw aimwVarL = defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBeeslyDeferred$<anonymous>", 1319, "DobbyLifecycleController.kt");
            objC = aenj.c((java.lang.String) null, nmoVarB);
            aenj[] aenjVarArr = new aenj[2];
            aenjVarArr[0] = new aenj(", events:");
            defpackage.nej nejVar8 = this.h;
            this.a = aenjVarArr;
            this.b = aimwVarL;
            this.c = "Can't start Beesly in state %s";
            this.d = objC;
            this.e = aenjVarArr;
            this.f = 1;
            this.g = 6;
            java.lang.Object objA = nejVar8.q.a(this);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj2 = aenjVarArr;
            obj3 = "Can't start Beesly in state %s";
            obj = objA;
            obj4 = obj2;
            aimwVar = aimwVarL;
            ((aenj[]) obj2)[i3] = (aenj) obj;
            aimwVar.y((java.lang.String) obj3, new aepg(aenj.b((aenj) objC, (aenj[]) obj4)));
            return aojh.a;
        }
        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBeeslyDeferred$<anonymous>", 1286, "DobbyLifecycleController.kt").v("Start Beesly");
        defpackage.nej nejVar9 = this.h;
        this.g = 2;
        obj = defpackage.nej.aa(nejVar9.Y, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startBeeslyDeferred$<anonymous>", 1288, "DobbyLifecycleController.kt").v("Failed to start Beesly since arbiter rejects.");
            return aojh.a;
        }
        this.h.V.m();
        nejVar = this.h;
        nmoVar = defpackage.nmo.BEESLY;
        this.g = 3;
        if (nejVar.O(nmoVar, this) == aoluVar) {
            return aoluVar;
        }
        mmvVar = this.i;
        if (mmvVar == defpackage.mmv.c) {
            this.h.X.a(qbc.cj);
        } else if (mmvVar == defpackage.mmv.b) {
            this.h.X.a(qbc.ck);
        }
        defpackage.nej nejVar10 = this.h;
        this.g = 4;
        defpackage.nrv.a.b().l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "updateCallType", 172, "DobbySessionWriter.kt").y("Updating call type to %s", mmvVar);
        defpackage.npw npwVarAw6 = mni.aw(defpackage.nsm.a.m());
        aooh.f(mmvVar, "<this>");
        iOrdinal = mmvVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i2 = 5;
            } else if (iOrdinal != 2) {
                throw new aois();
            }
        }
        defpackage.nrv nrvVar3 = nejVar10.v;
        npwVarAw6.v(i2);
        objG = nrvVar3.g(npwVarAw6.t(), this);
        if (objG != aolu.a) {
            objG = aojh.a;
        }
        if (objG == aoluVar) {
            return aoluVar;
        }
        defpackage.nej nejVar11 = this.h;
        this.g = 5;
        defpackage.npw npwVarAw7 = mni.aw(defpackage.nsm.a.m());
        akzx akzxVar4 = (akzx) npwVarAw7.a;
        akzxVar4.u();
        defpackage.nsm nsmVar4 = (defpackage.nsm) akzxVar4.b;
        nsmVar4.n = a.T(4);
        nsmVar4.b |= 2048;
        objG2 = nejVar11.v.g(npwVarAw7.t(), this);
        if (objG2 != aolu.a) {
            objG2 = aojh.a;
        }
        if (objG2 == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
