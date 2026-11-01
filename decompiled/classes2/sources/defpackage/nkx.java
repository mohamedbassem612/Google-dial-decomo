package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nkx extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    int d;
    long e;
    int f;
    final /* synthetic */ long g;
    final /* synthetic */ defpackage.nld h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkx(long j, defpackage.nld nldVar, aoln aolnVar) {
        super(2, aolnVar);
        this.g = j;
        this.h = nldVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:59:0x0174  */
    /* JADX WARN: Code duplicated, block: B:62:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0191  */
    /* JADX WARN: Code duplicated, block: B:73:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x020c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0213  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.nld nldVar;
        apdp apdpVar;
        java.lang.Object obj2;
        int i;
        java.lang.Object next;
        defpackage.mzg mzgVar;
        java.lang.String str;
        defpackage.mzf mzfVarB;
        defpackage.mzf mzfVar;
        int i2;
        int i3;
        defpackage.nld nldVar2;
        defpackage.mzf mzfVarB2;
        java.lang.String str2;
        java.lang.String str3;
        long jM;
        java.lang.Long l;
        long j;
        defpackage.mzf mzfVarB3;
        defpackage.nld nldVar3;
        boolean z;
        aolu aoluVar = aolu.a;
        int i4 = this.f;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    java.lang.Object obj3 = this.b;
                    apdpVar = (apdp) this.a;
                    aooc.af(obj);
                    obj2 = obj3;
                } else {
                    if (i4 == 2) {
                        mzgVar = (defpackage.mzg) this.a;
                        aooc.af(obj);
                        i = 0;
                        aimw aimwVarL = defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relaySuggestedReplyClicked$<anonymous>", 522, "DobbyCallScreenLiteUseCaseRunner.kt");
                        if (mzgVar != null || (str = mzgVar.c) == null) {
                            str = "NOT_FOUND";
                        }
                        aimwVarL.y("found reply %s", str);
                        if (mzgVar != null) {
                            mzfVarB = defpackage.mzf.b(mzgVar.e);
                            if (mzfVarB == null) {
                                mzfVarB = defpackage.mzf.UNRECOGNIZED;
                            }
                        } else {
                            mzfVarB = null;
                        }
                        mzfVar = defpackage.mzf.ACTION_REPORT_SPAM;
                        if (mzfVarB == mzfVar) {
                            i2 = 1;
                        } else {
                            i2 = i;
                        }
                        if (i2 != 0) {
                            i3 = 1;
                        } else {
                            if (mzgVar != null) {
                                mzfVarB3 = defpackage.mzf.b(mzgVar.e);
                                if (mzfVarB3 == null) {
                                    mzfVarB3 = defpackage.mzf.UNRECOGNIZED;
                                }
                            } else {
                                mzfVarB3 = null;
                            }
                            if (mzfVarB3 != defpackage.mzf.ACTION_END_CALL) {
                                i3 = i;
                            } else {
                                i3 = 1;
                            }
                        }
                        aoiu[] aoiuVarArr = new aoiu[2];
                        nldVar2 = this.h;
                        android.content.Context context = nldVar2.b;
                        aoiuVarArr[i] = new aoiu(mzfVar, context.getString(2132018392));
                        aoiuVarArr[1] = new aoiu(defpackage.mzf.ACTION_END_CALL, context.getString(2132018389));
                        java.util.Map mapAO = ajsz.aO(aoiuVarArr);
                        if (mzgVar != null) {
                            mzfVarB2 = defpackage.mzf.b(mzgVar.e);
                            if (mzfVarB2 == null) {
                                mzfVarB2 = defpackage.mzf.UNRECOGNIZED;
                            }
                        } else {
                            mzfVarB2 = null;
                        }
                        if (mzgVar != null) {
                            str2 = mzgVar.c;
                        } else {
                            str2 = null;
                        }
                        str3 = (java.lang.String) j$.util.Map.-EL.getOrDefault(mapAO, mzfVarB2, str2);
                        if (str3 != null) {
                            jM = nldVar2.m() + 1;
                            l = new java.lang.Long(jM);
                            this.a = null;
                            this.b = null;
                            this.c = i2;
                            this.d = i3;
                            this.e = jM;
                            this.f = 3;
                            if (nldVar2.n(str3, l, this) != aoluVar) {
                                return aoluVar;
                            }
                            j = jM;
                        }
                        return aojh.a;
                    }
                    j = this.e;
                    i3 = this.d;
                    i2 = this.c;
                    aooc.af(obj);
                    i = 0;
                }
                if (i3 != 0) {
                    nldVar3 = this.h;
                    if (((java.lang.Boolean) nldVar3.i.a()).booleanValue()) {
                        nldVar3.o = true;
                        nldVar3.y();
                    }
                    if (1 != i2) {
                        z = i;
                    } else {
                        z = 1;
                    }
                    nldVar3.B = new defpackage.nkq(j, z, 4);
                }
                return aojh.a;
            }
            aooc.af(obj);
            defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relaySuggestedReplyClicked$<anonymous>", 473, "DobbyCallScreenLiteUseCaseRunner.kt").x("relaySuggestedReplyClicked: %d", this.g);
            nldVar = this.h;
            apdpVar = nldVar.v;
            this.a = apdpVar;
            this.b = nldVar;
            this.f = 1;
            if (apdpVar.b(this) == aoluVar) {
                obj2 = nldVar;
                return aoluVar;
            }
            obj2 = nldVar;
            aimz aimzVar = defpackage.nld.a;
            if (!((defpackage.nld) obj2).k) {
                defpackage.nld.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relaySuggestedReplyClicked$<anonymous>$<anonymous>", 479, "DobbyCallScreenLiteUseCaseRunner.kt").v("relaySuggestedReplyClicked called but runner is not started.");
                aojh aojhVar = aojh.a;
                apdpVar.d();
                return aojhVar;
            }
            apdpVar.d();
            defpackage.nld nldVar4 = this.h;
            if (nldVar4.l) {
                defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relaySuggestedReplyClicked$<anonymous>", 484, "DobbyCallScreenLiteUseCaseRunner.kt").v("relaySuggestedReplyClicked: ignoring because ringing timed out.");
                return aojh.a;
            }
            if (((java.lang.Boolean) nldVar4.g.a()).booleanValue() && nldVar4.B()) {
                defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relaySuggestedReplyClicked$<anonymous>", 490, "DobbyCallScreenLiteUseCaseRunner.kt").x("relaySuggestedReplyClicked: ignoring click on %d because an action is already in progress.", this.g);
                return aojh.a;
            }
            defpackage.mze mzeVar = nldVar4.s.d;
            if (mzeVar == null) {
                mzeVar = defpackage.mze.a;
            }
            alat alatVar = mzeVar.b;
            aooh.e(alatVar, "getSuggestedRepliesList(...)");
            long j2 = this.g;
            java.util.Iterator it = alatVar.iterator();
            do {
                if (!it.hasNext()) {
                    i = 0;
                    next = null;
                    break;
                }
                next = it.next();
                i = 0;
            } while (((defpackage.mzg) next).b != j2);
            defpackage.mzg mzgVar2 = (defpackage.mzg) next;
            if (mzgVar2 != null) {
                defpackage.mzb mzbVarB = defpackage.mzb.b(mzgVar2.d);
                if (mzbVarB == null) {
                    mzbVarB = defpackage.mzb.UNRECOGNIZED;
                }
                if (mzbVarB != defpackage.mzb.DOBBY_BUTTON_STATE_ENABLED) {
                    defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relaySuggestedReplyClicked$<anonymous>$<anonymous>", 503, "DobbyCallScreenLiteUseCaseRunner.kt").y("Chip '%s' is not enabled, ignoring click.", mzgVar2.f);
                    return aojh.a;
                }
                nldVar4.s = defpackage.nld.E(nldVar4.s, new defpackage.bpd(j2, 4));
                this.a = mzgVar2;
                this.b = null;
                this.f = 2;
                if (nldVar4.p(this) == aoluVar) {
                    return aoluVar;
                }
            }
            mzgVar = mzgVar2;
            aimw aimwVarL2 = defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relaySuggestedReplyClicked$<anonymous>", 522, "DobbyCallScreenLiteUseCaseRunner.kt");
            if (mzgVar != null) {
                str = "NOT_FOUND";
            } else {
                str = "NOT_FOUND";
            }
            aimwVarL2.y("found reply %s", str);
            if (mzgVar != null) {
                mzfVarB = defpackage.mzf.b(mzgVar.e);
                if (mzfVarB == null) {
                    mzfVarB = defpackage.mzf.UNRECOGNIZED;
                }
            } else {
                mzfVarB = null;
            }
            mzfVar = defpackage.mzf.ACTION_REPORT_SPAM;
            if (mzfVarB == mzfVar) {
                i2 = 1;
            } else {
                i2 = i;
            }
            if (i2 != 0) {
                i3 = 1;
            } else {
                if (mzgVar != null) {
                    mzfVarB3 = defpackage.mzf.b(mzgVar.e);
                    if (mzfVarB3 == null) {
                        mzfVarB3 = defpackage.mzf.UNRECOGNIZED;
                    }
                } else {
                    mzfVarB3 = null;
                }
                if (mzfVarB3 != defpackage.mzf.ACTION_END_CALL) {
                    i3 = i;
                } else {
                    i3 = 1;
                }
            }
            aoiu[] aoiuVarArr2 = new aoiu[2];
            nldVar2 = this.h;
            android.content.Context context2 = nldVar2.b;
            aoiuVarArr2[i] = new aoiu(mzfVar, context2.getString(2132018392));
            aoiuVarArr2[1] = new aoiu(defpackage.mzf.ACTION_END_CALL, context2.getString(2132018389));
            java.util.Map mapAO2 = ajsz.aO(aoiuVarArr2);
            if (mzgVar != null) {
                mzfVarB2 = defpackage.mzf.b(mzgVar.e);
                if (mzfVarB2 == null) {
                    mzfVarB2 = defpackage.mzf.UNRECOGNIZED;
                }
            } else {
                mzfVarB2 = null;
            }
            if (mzgVar != null) {
                str2 = mzgVar.c;
            } else {
                str2 = null;
            }
            str3 = (java.lang.String) j$.util.Map.-EL.getOrDefault(mapAO2, mzfVarB2, str2);
            if (str3 != null) {
                jM = nldVar2.m() + 1;
                l = new java.lang.Long(jM);
                this.a = null;
                this.b = null;
                this.c = i2;
                this.d = i3;
                this.e = jM;
                this.f = 3;
                if (nldVar2.n(str3, l, this) != aoluVar) {
                    return aoluVar;
                }
                j = jM;
                if (i3 != 0) {
                    nldVar3 = this.h;
                    if (((java.lang.Boolean) nldVar3.i.a()).booleanValue()) {
                        nldVar3.o = true;
                        nldVar3.y();
                    }
                    if (1 != i2) {
                        z = i;
                    } else {
                        z = 1;
                    }
                    nldVar3.B = new defpackage.nkq(j, z, 4);
                }
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nkx(this.g, this.h, aolnVar);
    }
}
