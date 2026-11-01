package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lsl extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.ltu b;
    final /* synthetic */ defpackage.lsn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsl(defpackage.ltu ltuVar, defpackage.lsn lsnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = ltuVar;
        this.c = lsnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:17:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x0111  */
    /* JADX WARN: Code duplicated, block: B:42:0x013a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:45:0x014b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:55:0x018c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x01af  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0203  */
    /* JADX WARN: Code duplicated, block: B:74:0x020d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0213  */
    /* JADX WARN: Code duplicated, block: B:80:0x0222  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.lsn lsnVar;
        ampm ampmVar;
        defpackage.lsc lscVar;
        defpackage.lsn lsnVar2;
        defpackage.lsn lsnVar3;
        defpackage.lsn lsnVar4;
        ampm ampmVar2;
        defpackage.lsn lsnVar5;
        ampm ampmVar3;
        defpackage.lsn lsnVar6;
        defpackage.ltj ltjVar;
        defpackage.ltu ltuVar;
        defpackage.luj lujVar;
        defpackage.lui luiVarB;
        int iOrdinal;
        defpackage.lsn lsnVar7;
        defpackage.ltj ltjVar2;
        defpackage.lsn lsnVar8;
        defpackage.lsn lsnVar9;
        ampm ampmVar4;
        defpackage.ltu ltuVar2;
        defpackage.luj lujVar2;
        defpackage.lui luiVarB2;
        defpackage.lsn lsnVar10;
        defpackage.ltj ltjVar3;
        defpackage.lsn lsnVar11;
        java.lang.Long l;
        java.lang.Object objA;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        switch (i) {
            case 0:
                if (mni.bW(this.b.b) != 1) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 143, "ContactCheckerReceiverController.kt").v("Ignore the non-verification message");
                    return aojh.a;
                }
                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 147, "ContactCheckerReceiverController.kt").v("Received the verification from the caller");
                defpackage.lsn lsnVar12 = this.c;
                this.a = 1;
                obj = lsnVar12.h(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    lsnVar11 = this.c;
                    lsnVar11.k.b(mce.hu);
                    l = lsnVar11.r;
                    if (l != null) {
                        defpackage.lrc lrcVar = lsnVar11.l;
                        akzm akzmVarC = aldf.c(android.os.SystemClock.elapsedRealtime() - l.longValue());
                        aooh.e(akzmVarC, "fromMillis(...)");
                        this.a = 2;
                        objA = ahvr.ag(lrcVar.a, lrcVar.g, new defpackage.kdr(lrcVar, akzmVarC, (aoln) null, 5)).a(this);
                        if (objA != aoluVar) {
                            objA = aojh.a;
                        }
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                    }
                    ltuVar = this.b;
                    if (ltuVar.b == 2) {
                        lujVar = (defpackage.luj) ltuVar.c;
                    } else {
                        lujVar = defpackage.luj.a;
                    }
                    luiVarB = defpackage.lui.b(lujVar.c);
                    if (luiVarB == null) {
                        luiVarB = defpackage.lui.UNRECOGNIZED;
                    }
                    iOrdinal = luiVarB.ordinal();
                    if (iOrdinal == 1) {
                        lsnVar7 = this.c;
                        ltjVar2 = defpackage.ltj.VERIFIED;
                        this.a = 3;
                        if (lsnVar7.j(ltjVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                        lsnVar = this.c;
                        lsnVar.p = true;
                        ampmVar = ampm.b;
                        this.a = 4;
                        if (lsnVar.l.a(ampmVar, this) == aoluVar) {
                            return aoluVar;
                        }
                        this.c.t.a(ajcm.a);
                    } else if (iOrdinal == 2) {
                        lsnVar8 = this.c;
                        if (((java.lang.Boolean) lsnVar8.h.a()).booleanValue()) {
                            this.a = 5;
                            obj = lsnVar8.i(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 168, "ContactCheckerReceiverController.kt").v("lower the confidence level from SPOOF to NOT_SURE due to STIR/SHAKEN verification");
                                lsnVar5 = this.c;
                                lsnVar5.j.o(rmx.zT);
                                ampmVar3 = ampm.d;
                                this.a = 6;
                                if (lsnVar5.l.a(ampmVar3, this) == aoluVar) {
                                    return aoluVar;
                                }
                            } else {
                                lsnVar6 = this.c;
                                if (!((java.lang.Boolean) lsnVar6.i.a()).booleanValue()) {
                                    ltjVar = defpackage.ltj.SPOOFED;
                                    this.a = 7;
                                    if (lsnVar6.j(ltjVar, this) == aoluVar) {
                                        return aoluVar;
                                    }
                                    lsnVar4 = this.c;
                                    lsnVar4.q = true;
                                    ampmVar2 = ampm.c;
                                    this.a = 8;
                                    if (lsnVar4.l.a(ampmVar2, this) == aoluVar) {
                                        return aoluVar;
                                    }
                                    lsnVar3 = this.c;
                                    if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                                        kaw kawVar = lsnVar3.u;
                                        this.a = 9;
                                        obj = kawVar.e(this);
                                        if (obj == aoluVar) {
                                            return aoluVar;
                                        }
                                        if (((java.lang.Boolean) obj).booleanValue()) {
                                            lsnVar2 = this.c;
                                            if (lsnVar2.m.b()) {
                                                defpackage.lrh lrhVar = lsnVar2.n;
                                                this.a = 10;
                                                obj = aoov.aj(lrhVar.b, new defpackage.loe(lrhVar, (aoln) null, 4), this);
                                                if (obj == aoluVar) {
                                                    return aoluVar;
                                                }
                                                lscVar = (defpackage.lsc) obj;
                                                if (lscVar instanceof defpackage.lrz) {
                                                    defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                                                }
                                            }
                                        }
                                    }
                                    this.c.t.a(ajcm.a);
                                }
                            }
                        } else {
                            lsnVar6 = this.c;
                            if (!((java.lang.Boolean) lsnVar6.i.a()).booleanValue()) {
                                ltjVar = defpackage.ltj.SPOOFED;
                                this.a = 7;
                                if (lsnVar6.j(ltjVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                                lsnVar4 = this.c;
                                lsnVar4.q = true;
                                ampmVar2 = ampm.c;
                                this.a = 8;
                                if (lsnVar4.l.a(ampmVar2, this) == aoluVar) {
                                    return aoluVar;
                                }
                                lsnVar3 = this.c;
                                if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                                    kaw kawVar2 = lsnVar3.u;
                                    this.a = 9;
                                    obj = kawVar2.e(this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                    if (((java.lang.Boolean) obj).booleanValue()) {
                                        lsnVar2 = this.c;
                                        if (lsnVar2.m.b()) {
                                            defpackage.lrh lrhVar2 = lsnVar2.n;
                                            this.a = 10;
                                            obj = aoov.aj(lrhVar2.b, new defpackage.loe(lrhVar2, (aoln) null, 4), this);
                                            if (obj == aoluVar) {
                                                return aoluVar;
                                            }
                                            lscVar = (defpackage.lsc) obj;
                                            if (lscVar instanceof defpackage.lrz) {
                                                defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                                            }
                                        }
                                    }
                                }
                                this.c.t.a(ajcm.a);
                            }
                        }
                    } else if (iOrdinal != 3) {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 198, "ContactCheckerReceiverController.kt").v("Ignore other types of verification messages");
                    } else {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 194, "ContactCheckerReceiverController.kt").v("Ignore low-confidence verification messages");
                        lsnVar9 = this.c;
                        ampmVar4 = ampm.d;
                        this.a = 11;
                        if (lsnVar9.l.a(ampmVar4, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                } else {
                    ltuVar2 = this.b;
                    if (ltuVar2.b == 2) {
                        lujVar2 = (defpackage.luj) ltuVar2.c;
                    } else {
                        lujVar2 = defpackage.luj.a;
                    }
                    luiVarB2 = defpackage.lui.b(lujVar2.c);
                    if (luiVarB2 == null) {
                        luiVarB2 = defpackage.lui.UNRECOGNIZED;
                    }
                    if (luiVarB2 == defpackage.lui.VERIFIED) {
                        lsnVar10 = this.c;
                        ltjVar3 = defpackage.ltj.VERIFIED;
                        this.a = 12;
                        if (lsnVar10.j(ltjVar3, this) == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.lsn lsnVar13 = this.c;
                        lsnVar13.p = true;
                        lsnVar13.t.a(ajcm.a);
                    } else {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 208, "ContactCheckerReceiverController.kt").v("Ignore non-VERIFIED messages when caller has not verified before.");
                    }
                }
                return aojh.a;
            case 1:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    lsnVar11 = this.c;
                    lsnVar11.k.b(mce.hu);
                    l = lsnVar11.r;
                    if (l != null) {
                        defpackage.lrc lrcVar2 = lsnVar11.l;
                        akzm akzmVarC2 = aldf.c(android.os.SystemClock.elapsedRealtime() - l.longValue());
                        aooh.e(akzmVarC2, "fromMillis(...)");
                        this.a = 2;
                        objA = ahvr.ag(lrcVar2.a, lrcVar2.g, new defpackage.kdr(lrcVar2, akzmVarC2, (aoln) null, 5)).a(this);
                        if (objA != aoluVar) {
                            objA = aojh.a;
                        }
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                    }
                    ltuVar = this.b;
                    if (ltuVar.b == 2) {
                        lujVar = (defpackage.luj) ltuVar.c;
                    } else {
                        lujVar = defpackage.luj.a;
                    }
                    luiVarB = defpackage.lui.b(lujVar.c);
                    if (luiVarB == null) {
                        luiVarB = defpackage.lui.UNRECOGNIZED;
                    }
                    iOrdinal = luiVarB.ordinal();
                    if (iOrdinal == 1) {
                        lsnVar7 = this.c;
                        ltjVar2 = defpackage.ltj.VERIFIED;
                        this.a = 3;
                        if (lsnVar7.j(ltjVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                        lsnVar = this.c;
                        lsnVar.p = true;
                        ampmVar = ampm.b;
                        this.a = 4;
                        if (lsnVar.l.a(ampmVar, this) == aoluVar) {
                            return aoluVar;
                        }
                        this.c.t.a(ajcm.a);
                    } else if (iOrdinal == 2) {
                        lsnVar8 = this.c;
                        if (((java.lang.Boolean) lsnVar8.h.a()).booleanValue()) {
                            this.a = 5;
                            obj = lsnVar8.i(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 168, "ContactCheckerReceiverController.kt").v("lower the confidence level from SPOOF to NOT_SURE due to STIR/SHAKEN verification");
                                lsnVar5 = this.c;
                                lsnVar5.j.o(rmx.zT);
                                ampmVar3 = ampm.d;
                                this.a = 6;
                                if (lsnVar5.l.a(ampmVar3, this) == aoluVar) {
                                    return aoluVar;
                                }
                            } else {
                                lsnVar6 = this.c;
                                if (!((java.lang.Boolean) lsnVar6.i.a()).booleanValue()) {
                                    ltjVar = defpackage.ltj.SPOOFED;
                                    this.a = 7;
                                    if (lsnVar6.j(ltjVar, this) == aoluVar) {
                                        return aoluVar;
                                    }
                                    lsnVar4 = this.c;
                                    lsnVar4.q = true;
                                    ampmVar2 = ampm.c;
                                    this.a = 8;
                                    if (lsnVar4.l.a(ampmVar2, this) == aoluVar) {
                                        return aoluVar;
                                    }
                                    lsnVar3 = this.c;
                                    if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                                        kaw kawVar3 = lsnVar3.u;
                                        this.a = 9;
                                        obj = kawVar3.e(this);
                                        if (obj == aoluVar) {
                                            return aoluVar;
                                        }
                                        if (((java.lang.Boolean) obj).booleanValue()) {
                                            lsnVar2 = this.c;
                                            if (lsnVar2.m.b()) {
                                                defpackage.lrh lrhVar3 = lsnVar2.n;
                                                this.a = 10;
                                                obj = aoov.aj(lrhVar3.b, new defpackage.loe(lrhVar3, (aoln) null, 4), this);
                                                if (obj == aoluVar) {
                                                    return aoluVar;
                                                }
                                                lscVar = (defpackage.lsc) obj;
                                                if (lscVar instanceof defpackage.lrz) {
                                                    defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                                                }
                                            }
                                        }
                                    }
                                    this.c.t.a(ajcm.a);
                                }
                            }
                        } else {
                            lsnVar6 = this.c;
                            if (!((java.lang.Boolean) lsnVar6.i.a()).booleanValue()) {
                                ltjVar = defpackage.ltj.SPOOFED;
                                this.a = 7;
                                if (lsnVar6.j(ltjVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                                lsnVar4 = this.c;
                                lsnVar4.q = true;
                                ampmVar2 = ampm.c;
                                this.a = 8;
                                if (lsnVar4.l.a(ampmVar2, this) == aoluVar) {
                                    return aoluVar;
                                }
                                lsnVar3 = this.c;
                                if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                                    kaw kawVar4 = lsnVar3.u;
                                    this.a = 9;
                                    obj = kawVar4.e(this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                    if (((java.lang.Boolean) obj).booleanValue()) {
                                        lsnVar2 = this.c;
                                        if (lsnVar2.m.b()) {
                                            defpackage.lrh lrhVar4 = lsnVar2.n;
                                            this.a = 10;
                                            obj = aoov.aj(lrhVar4.b, new defpackage.loe(lrhVar4, (aoln) null, 4), this);
                                            if (obj == aoluVar) {
                                                return aoluVar;
                                            }
                                            lscVar = (defpackage.lsc) obj;
                                            if (lscVar instanceof defpackage.lrz) {
                                                defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                                            }
                                        }
                                    }
                                }
                                this.c.t.a(ajcm.a);
                            }
                        }
                    } else if (iOrdinal != 3) {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 198, "ContactCheckerReceiverController.kt").v("Ignore other types of verification messages");
                    } else {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 194, "ContactCheckerReceiverController.kt").v("Ignore low-confidence verification messages");
                        lsnVar9 = this.c;
                        ampmVar4 = ampm.d;
                        this.a = 11;
                        if (lsnVar9.l.a(ampmVar4, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                } else {
                    ltuVar2 = this.b;
                    if (ltuVar2.b == 2) {
                        lujVar2 = (defpackage.luj) ltuVar2.c;
                    } else {
                        lujVar2 = defpackage.luj.a;
                    }
                    luiVarB2 = defpackage.lui.b(lujVar2.c);
                    if (luiVarB2 == null) {
                        luiVarB2 = defpackage.lui.UNRECOGNIZED;
                    }
                    if (luiVarB2 == defpackage.lui.VERIFIED) {
                        lsnVar10 = this.c;
                        ltjVar3 = defpackage.ltj.VERIFIED;
                        this.a = 12;
                        if (lsnVar10.j(ltjVar3, this) == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.lsn lsnVar14 = this.c;
                        lsnVar14.p = true;
                        lsnVar14.t.a(ajcm.a);
                    } else {
                        defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 208, "ContactCheckerReceiverController.kt").v("Ignore non-VERIFIED messages when caller has not verified before.");
                    }
                }
                return aojh.a;
            case 2:
                ltuVar = this.b;
                if (ltuVar.b == 2) {
                    lujVar = (defpackage.luj) ltuVar.c;
                } else {
                    lujVar = defpackage.luj.a;
                }
                luiVarB = defpackage.lui.b(lujVar.c);
                if (luiVarB == null) {
                    luiVarB = defpackage.lui.UNRECOGNIZED;
                }
                iOrdinal = luiVarB.ordinal();
                if (iOrdinal == 1) {
                    lsnVar7 = this.c;
                    ltjVar2 = defpackage.ltj.VERIFIED;
                    this.a = 3;
                    if (lsnVar7.j(ltjVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    lsnVar = this.c;
                    lsnVar.p = true;
                    ampmVar = ampm.b;
                    this.a = 4;
                    if (lsnVar.l.a(ampmVar, this) == aoluVar) {
                        return aoluVar;
                    }
                    this.c.t.a(ajcm.a);
                } else if (iOrdinal == 2) {
                    lsnVar8 = this.c;
                    if (((java.lang.Boolean) lsnVar8.h.a()).booleanValue()) {
                        this.a = 5;
                        obj = lsnVar8.i(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 168, "ContactCheckerReceiverController.kt").v("lower the confidence level from SPOOF to NOT_SURE due to STIR/SHAKEN verification");
                            lsnVar5 = this.c;
                            lsnVar5.j.o(rmx.zT);
                            ampmVar3 = ampm.d;
                            this.a = 6;
                            if (lsnVar5.l.a(ampmVar3, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            lsnVar6 = this.c;
                            if (!((java.lang.Boolean) lsnVar6.i.a()).booleanValue()) {
                                ltjVar = defpackage.ltj.SPOOFED;
                                this.a = 7;
                                if (lsnVar6.j(ltjVar, this) == aoluVar) {
                                    return aoluVar;
                                }
                                lsnVar4 = this.c;
                                lsnVar4.q = true;
                                ampmVar2 = ampm.c;
                                this.a = 8;
                                if (lsnVar4.l.a(ampmVar2, this) == aoluVar) {
                                    return aoluVar;
                                }
                                lsnVar3 = this.c;
                                if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                                    kaw kawVar5 = lsnVar3.u;
                                    this.a = 9;
                                    obj = kawVar5.e(this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                    if (((java.lang.Boolean) obj).booleanValue()) {
                                        lsnVar2 = this.c;
                                        if (lsnVar2.m.b()) {
                                            defpackage.lrh lrhVar5 = lsnVar2.n;
                                            this.a = 10;
                                            obj = aoov.aj(lrhVar5.b, new defpackage.loe(lrhVar5, (aoln) null, 4), this);
                                            if (obj == aoluVar) {
                                                return aoluVar;
                                            }
                                            lscVar = (defpackage.lsc) obj;
                                            if (lscVar instanceof defpackage.lrz) {
                                                defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                                            }
                                        }
                                    }
                                }
                                this.c.t.a(ajcm.a);
                            }
                        }
                    } else {
                        lsnVar6 = this.c;
                        if (!((java.lang.Boolean) lsnVar6.i.a()).booleanValue()) {
                            ltjVar = defpackage.ltj.SPOOFED;
                            this.a = 7;
                            if (lsnVar6.j(ltjVar, this) == aoluVar) {
                                return aoluVar;
                            }
                            lsnVar4 = this.c;
                            lsnVar4.q = true;
                            ampmVar2 = ampm.c;
                            this.a = 8;
                            if (lsnVar4.l.a(ampmVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                            lsnVar3 = this.c;
                            if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                                kaw kawVar6 = lsnVar3.u;
                                this.a = 9;
                                obj = kawVar6.e(this);
                                if (obj == aoluVar) {
                                    return aoluVar;
                                }
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    lsnVar2 = this.c;
                                    if (lsnVar2.m.b()) {
                                        defpackage.lrh lrhVar6 = lsnVar2.n;
                                        this.a = 10;
                                        obj = aoov.aj(lrhVar6.b, new defpackage.loe(lrhVar6, (aoln) null, 4), this);
                                        if (obj == aoluVar) {
                                            return aoluVar;
                                        }
                                        lscVar = (defpackage.lsc) obj;
                                        if (lscVar instanceof defpackage.lrz) {
                                            defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                                        }
                                    }
                                }
                            }
                            this.c.t.a(ajcm.a);
                        }
                    }
                } else if (iOrdinal != 3) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 198, "ContactCheckerReceiverController.kt").v("Ignore other types of verification messages");
                } else {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 194, "ContactCheckerReceiverController.kt").v("Ignore low-confidence verification messages");
                    lsnVar9 = this.c;
                    ampmVar4 = ampm.d;
                    this.a = 11;
                    if (lsnVar9.l.a(ampmVar4, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 3:
                lsnVar = this.c;
                lsnVar.p = true;
                ampmVar = ampm.b;
                this.a = 4;
                if (lsnVar.l.a(ampmVar, this) == aoluVar) {
                    return aoluVar;
                }
                this.c.t.a(ajcm.a);
                return aojh.a;
            case 4:
                this.c.t.a(ajcm.a);
                return aojh.a;
            case 5:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.lsn.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 168, "ContactCheckerReceiverController.kt").v("lower the confidence level from SPOOF to NOT_SURE due to STIR/SHAKEN verification");
                    lsnVar5 = this.c;
                    lsnVar5.j.o(rmx.zT);
                    ampmVar3 = ampm.d;
                    this.a = 6;
                    if (lsnVar5.l.a(ampmVar3, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    lsnVar6 = this.c;
                    if (!((java.lang.Boolean) lsnVar6.i.a()).booleanValue()) {
                        ltjVar = defpackage.ltj.SPOOFED;
                        this.a = 7;
                        if (lsnVar6.j(ltjVar, this) == aoluVar) {
                            return aoluVar;
                        }
                        lsnVar4 = this.c;
                        lsnVar4.q = true;
                        ampmVar2 = ampm.c;
                        this.a = 8;
                        if (lsnVar4.l.a(ampmVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                        lsnVar3 = this.c;
                        if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                            kaw kawVar7 = lsnVar3.u;
                            this.a = 9;
                            obj = kawVar7.e(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                lsnVar2 = this.c;
                                if (lsnVar2.m.b()) {
                                    defpackage.lrh lrhVar7 = lsnVar2.n;
                                    this.a = 10;
                                    obj = aoov.aj(lrhVar7.b, new defpackage.loe(lrhVar7, (aoln) null, 4), this);
                                    if (obj == aoluVar) {
                                        return aoluVar;
                                    }
                                    lscVar = (defpackage.lsc) obj;
                                    if (lscVar instanceof defpackage.lrz) {
                                        defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                                    }
                                }
                            }
                        }
                        this.c.t.a(ajcm.a);
                    }
                }
                return aojh.a;
            case 6:
            case 11:
                return aojh.a;
            case 7:
                lsnVar4 = this.c;
                lsnVar4.q = true;
                ampmVar2 = ampm.c;
                this.a = 8;
                if (lsnVar4.l.a(ampmVar2, this) == aoluVar) {
                    return aoluVar;
                }
                lsnVar3 = this.c;
                if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                    kaw kawVar8 = lsnVar3.u;
                    this.a = 9;
                    obj = kawVar8.e(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        lsnVar2 = this.c;
                        if (lsnVar2.m.b()) {
                            defpackage.lrh lrhVar8 = lsnVar2.n;
                            this.a = 10;
                            obj = aoov.aj(lrhVar8.b, new defpackage.loe(lrhVar8, (aoln) null, 4), this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            lscVar = (defpackage.lsc) obj;
                            if (lscVar instanceof defpackage.lrz) {
                                defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                            }
                        }
                    }
                }
                this.c.t.a(ajcm.a);
                return aojh.a;
            case 8:
                lsnVar3 = this.c;
                if (((java.lang.Boolean) lsnVar3.f.a()).booleanValue()) {
                    kaw kawVar9 = lsnVar3.u;
                    this.a = 9;
                    obj = kawVar9.e(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        lsnVar2 = this.c;
                        if (lsnVar2.m.b()) {
                            defpackage.lrh lrhVar9 = lsnVar2.n;
                            this.a = 10;
                            obj = aoov.aj(lrhVar9.b, new defpackage.loe(lrhVar9, (aoln) null, 4), this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            lscVar = (defpackage.lsc) obj;
                            if (lscVar instanceof defpackage.lrz) {
                                defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                            }
                        }
                    }
                }
                this.c.t.a(ajcm.a);
                return aojh.a;
            case 9:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    lsnVar2 = this.c;
                    if (lsnVar2.m.b()) {
                        defpackage.lrh lrhVar10 = lsnVar2.n;
                        this.a = 10;
                        obj = aoov.aj(lrhVar10.b, new defpackage.loe(lrhVar10, (aoln) null, 4), this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        lscVar = (defpackage.lsc) obj;
                        if (lscVar instanceof defpackage.lrz) {
                            defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                        }
                    }
                }
                this.c.t.a(ajcm.a);
                return aojh.a;
            case 10:
                lscVar = (defpackage.lsc) obj;
                if (lscVar instanceof defpackage.lrz) {
                    defpackage.lsn.a.d().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController", "onRemoteEvent$<anonymous>", 187, "ContactCheckerReceiverController.kt").y("Failed to play audio/haptics: %s", ((defpackage.lrz) lscVar).a);
                }
                this.c.t.a(ajcm.a);
                return aojh.a;
            default:
                defpackage.lsn lsnVar15 = this.c;
                lsnVar15.p = true;
                lsnVar15.t.a(ajcm.a);
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.lsl(this.b, this.c, aolnVar);
    }
}
