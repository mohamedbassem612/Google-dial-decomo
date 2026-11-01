package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgm extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.yqu d;
    final /* synthetic */ defpackage.zgn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgm(defpackage.yqu yquVar, defpackage.zgn zgnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = yquVar;
        this.e = zgnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:103:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x020f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0213  */
    /* JADX WARN: Code duplicated, block: B:107:0x0218  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:112:0x022a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0235  */
    /* JADX WARN: Code duplicated, block: B:116:0x0249  */
    /* JADX WARN: Code duplicated, block: B:118:0x024f  */
    /* JADX WARN: Code duplicated, block: B:120:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x026f  */
    /* JADX WARN: Code duplicated, block: B:125:0x028c  */
    /* JADX WARN: Code duplicated, block: B:128:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:0x0159  */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.zfd zfdVar;
        defpackage.zge zgeVar;
        int i;
        int i2;
        int i3;
        defpackage.zgn zgnVar;
        defpackage.zgg zggVar;
        defpackage.zgf zgfVar;
        defpackage.zgf zgfVar2;
        defpackage.zfy zfyVar;
        int i4;
        defpackage.zfx zfxVar;
        defpackage.zfw zfwVar;
        aolu aoluVar = aolu.a;
        int i5 = this.c;
        if (i5 == 0) {
            aooc.af(obj);
            defpackage.yqu yquVar = this.d;
            if ((yquVar.b & 1) != 0) {
                defpackage.yql yqlVar = yquVar.c;
                if (yqlVar == null) {
                    yqlVar = defpackage.yql.a;
                }
                if ((yqlVar.b & 1) != 0) {
                    int i6 = yquVar.b;
                    if ((i6 & 4) != 0 && (i6 & 2) != 0) {
                        obj2 = yquVar.c;
                        if (obj2 == null) {
                            obj2 = defpackage.yql.a;
                        }
                        aooh.e(obj2, "getExternalRcsProtoMessage(...)");
                        defpackage.zgn zgnVar2 = this.e;
                        defpackage.yrd yrdVar = yquVar.e;
                        if (yrdVar == null) {
                            yrdVar = defpackage.yrd.a;
                        }
                        aooh.e(yrdVar, "getRemoteRcsIdentity(...)");
                        this.a = obj2;
                        this.c = 1;
                        if ((yrdVar.b & 1) != 0) {
                            obj = ((defpackage.uyg) zgnVar2.c.b).A(yrdVar.c, this);
                        } else {
                            obj = null;
                        }
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return null;
                }
            }
            defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "validateMessage$<anonymous>", 50, "InboundMessageValidator.kt").v("Broken message received");
            return null;
        }
        if (i5 != 1) {
            obj3 = this.b;
            obj2 = this.a;
            aooc.af(obj);
        } else {
            obj2 = this.a;
            aooc.af(obj);
        }
        zfdVar = (defpackage.zfd) obj;
        if (zfdVar != null) {
            try {
                zgeVar = (defpackage.zge) alad.v(defpackage.zge.a, ((defpackage.yql) obj2).c);
                aooh.c(zgeVar);
                i = zgeVar.b;
                if (i != 0) {
                    i2 = 4;
                } else if (i != 1) {
                    i2 = 1;
                } else if (i != 2) {
                    i2 = 2;
                } else if (i != 3) {
                    i2 = 0;
                } else {
                    i2 = 3;
                }
                if (i2 != 0) {
                    throw null;
                }
                i3 = i2 - 1;
                if (i3 != 0) {
                    zgnVar = this.e;
                    if (i == 1) {
                        zggVar = (defpackage.zgg) zgeVar.c;
                    } else {
                        zggVar = defpackage.zgg.a;
                    }
                    aooh.e(zggVar, "getStandardMessage(...)");
                    if ((zggVar.b & 1) != 0) {
                        zgfVar = zggVar.c;
                        if (zgfVar == null) {
                            zgfVar = defpackage.zgf.a;
                        }
                        aooh.e(zgfVar, "getStandardContent(...)");
                        if (!zgnVar.a(zgfVar)) {
                            zgfVar2 = zggVar.c;
                            if (zgfVar2 == null) {
                                zgfVar2 = defpackage.zgf.a;
                            }
                            aooh.e(zgfVar2, "getStandardContent(...)");
                            return new defpackage.zgj(zfdVar, (defpackage.zff) obj3, zgfVar2);
                        }
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceStandardMessageAction", 137, "InboundMessageValidator.kt").v("Invalid content in standardMessage");
                    } else {
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceStandardMessageAction", 132, "InboundMessageValidator.kt").v("Broken content in standardMessage");
                    }
                } else if (i3 != 1) {
                    defpackage.zgn zgnVar3 = this.e;
                    if (i == 2) {
                        zfyVar = (defpackage.zfy) zgeVar.c;
                    } else {
                        zfyVar = defpackage.zfy.a;
                    }
                    aooh.e(zfyVar, "getAckableStandardMessage(...)");
                    i4 = zfyVar.b;
                    if ((i4 & 2) != 0 || (i4 & 1) == 0) {
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckableStandardMessageAction", 154, "InboundMessageValidator.kt").v("Broken content in ackableStandardMessage");
                    } else {
                        defpackage.zfw zfwVar2 = zfyVar.d;
                        if (zfwVar2 == null) {
                            zfwVar2 = defpackage.zfw.a;
                        }
                        aooh.e(zfwVar2, "getAckContent(...)");
                        if (defpackage.zgn.b(zfwVar2)) {
                            defpackage.zgf zgfVar3 = zfyVar.c;
                            if (zgfVar3 == null) {
                                zgfVar3 = defpackage.zgf.a;
                            }
                            aooh.e(zgfVar3, "getStandardContent(...)");
                            if (zgnVar3.a(zgfVar3)) {
                                defpackage.zgf zgfVar4 = zfyVar.c;
                                if (zgfVar4 == null) {
                                    zgfVar4 = defpackage.zgf.a;
                                }
                                aooh.e(zgfVar4, "getStandardContent(...)");
                                akzx akzxVarM = defpackage.zfx.a.m();
                                aooh.f(akzxVarM, "builder");
                                defpackage.zfw zfwVar3 = zfyVar.d;
                                if (zfwVar3 == null) {
                                    zfwVar3 = defpackage.zfw.a;
                                }
                                aooh.e(zfwVar3, "getAckContent(...)");
                                aooh.f(zfwVar3, "value");
                                akzxVarM.u();
                                defpackage.zfx zfxVar2 = (defpackage.zfx) akzxVarM.b;
                                j$.util.Objects.requireNonNull(zfwVar3);
                                zfxVar2.c = zfwVar3;
                                zfxVar2.b |= 1;
                                alad aladVarP = akzxVarM.p();
                                aooh.e(aladVarP, "build(...)");
                                return new defpackage.zgk(zfdVar, (defpackage.zff) obj3, zgfVar4, (defpackage.zfx) aladVarP);
                            }
                            defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckableStandardMessageAction", 164, "InboundMessageValidator.kt").v("Invalid standardContent in ackableStandardMessage");
                        } else {
                            defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckableStandardMessageAction", 159, "InboundMessageValidator.kt").v("Invalid ackContent in ackableStandardMessage");
                        }
                    }
                } else if (i3 != 2) {
                    if (i == 3) {
                        zfxVar = (defpackage.zfx) zgeVar.c;
                    } else {
                        zfxVar = defpackage.zfx.a;
                    }
                    aooh.e(zfxVar, "getAckMessage(...)");
                    if ((zfxVar.b & 1) != 0) {
                        zfwVar = zfxVar.c;
                        if (zfwVar == null) {
                            zfwVar = defpackage.zfw.a;
                        }
                        aooh.e(zfwVar, "getAckContent(...)");
                        if (!defpackage.zgn.b(zfwVar)) {
                            return new defpackage.zgi(zfdVar, (defpackage.zff) obj3, zfxVar);
                        }
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckMessageAction", 187, "InboundMessageValidator.kt").v("Invalid ackContent in ackMessage");
                    } else {
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckMessageAction", 182, "InboundMessageValidator.kt").v("Broken content in ackMessage");
                    }
                } else {
                    if (i3 == 3) {
                        throw new aois();
                    }
                    defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "validateMessage$<anonymous>", 103, "InboundMessageValidator.kt").v("Unknown message type.");
                }
            } catch (alaz e) {
                defpackage.zgn.a.c().k(e).l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "validateMessage$<anonymous>", 79, "InboundMessageValidator.kt").v("Malformed payload received.");
            }
        } else {
            defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "validateMessage$<anonymous>", 71, "InboundMessageValidator.kt").v("Broken localRcsIdentity received");
        }
        return null;
        defpackage.zff zffVar = (defpackage.zff) obj;
        if (zffVar == null) {
            defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "validateMessage$<anonymous>", 61, "InboundMessageValidator.kt").v("Broken remoteRcsIdentity received");
        } else {
            defpackage.zgn zgnVar4 = this.e;
            defpackage.yqv yqvVar = this.d.d;
            if (yqvVar == null) {
                yqvVar = defpackage.yqv.a;
            }
            defpackage.uyg uygVar = zgnVar4.c;
            aooh.e(yqvVar, "getLocalRcsIdentity(...)");
            this.a = obj2;
            this.b = zffVar;
            this.c = 2;
            java.lang.Object objY = uygVar.y(yqvVar, this);
            if (objY == aoluVar) {
                return aoluVar;
            }
            obj3 = zffVar;
            obj = objY;
            zfdVar = (defpackage.zfd) obj;
            if (zfdVar != null) {
                zgeVar = (defpackage.zge) alad.v(defpackage.zge.a, ((defpackage.yql) obj2).c);
                aooh.c(zgeVar);
                i = zgeVar.b;
                if (i != 0) {
                    i2 = 4;
                } else if (i != 1) {
                    i2 = 1;
                } else if (i != 2) {
                    i2 = 2;
                } else if (i != 3) {
                    i2 = 0;
                } else {
                    i2 = 3;
                }
                if (i2 != 0) {
                    throw null;
                }
                i3 = i2 - 1;
                if (i3 != 0) {
                    zgnVar = this.e;
                    if (i == 1) {
                        zggVar = (defpackage.zgg) zgeVar.c;
                    } else {
                        zggVar = defpackage.zgg.a;
                    }
                    aooh.e(zggVar, "getStandardMessage(...)");
                    if ((zggVar.b & 1) != 0) {
                        zgfVar = zggVar.c;
                        if (zgfVar == null) {
                            zgfVar = defpackage.zgf.a;
                        }
                        aooh.e(zgfVar, "getStandardContent(...)");
                        if (!zgnVar.a(zgfVar)) {
                            zgfVar2 = zggVar.c;
                            if (zgfVar2 == null) {
                                zgfVar2 = defpackage.zgf.a;
                            }
                            aooh.e(zgfVar2, "getStandardContent(...)");
                            return new defpackage.zgj(zfdVar, (defpackage.zff) obj3, zgfVar2);
                        }
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceStandardMessageAction", 137, "InboundMessageValidator.kt").v("Invalid content in standardMessage");
                    } else {
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceStandardMessageAction", 132, "InboundMessageValidator.kt").v("Broken content in standardMessage");
                    }
                } else if (i3 != 1) {
                    defpackage.zgn zgnVar5 = this.e;
                    if (i == 2) {
                        zfyVar = (defpackage.zfy) zgeVar.c;
                    } else {
                        zfyVar = defpackage.zfy.a;
                    }
                    aooh.e(zfyVar, "getAckableStandardMessage(...)");
                    i4 = zfyVar.b;
                    if ((i4 & 2) != 0) {
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckableStandardMessageAction", 154, "InboundMessageValidator.kt").v("Broken content in ackableStandardMessage");
                    } else {
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckableStandardMessageAction", 154, "InboundMessageValidator.kt").v("Broken content in ackableStandardMessage");
                    }
                } else if (i3 != 2) {
                    if (i == 3) {
                        zfxVar = (defpackage.zfx) zgeVar.c;
                    } else {
                        zfxVar = defpackage.zfx.a;
                    }
                    aooh.e(zfxVar, "getAckMessage(...)");
                    if ((zfxVar.b & 1) != 0) {
                        zfwVar = zfxVar.c;
                        if (zfwVar == null) {
                            zfwVar = defpackage.zfw.a;
                        }
                        aooh.e(zfwVar, "getAckContent(...)");
                        if (!defpackage.zgn.b(zfwVar)) {
                            return new defpackage.zgi(zfdVar, (defpackage.zff) obj3, zfxVar);
                        }
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckMessageAction", 187, "InboundMessageValidator.kt").v("Invalid ackContent in ackMessage");
                    } else {
                        defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "produceAckMessageAction", 182, "InboundMessageValidator.kt").v("Broken content in ackMessage");
                    }
                } else {
                    if (i3 == 3) {
                        throw new aois();
                    }
                    defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "validateMessage$<anonymous>", 103, "InboundMessageValidator.kt").v("Unknown message type.");
                }
            } else {
                defpackage.zgn.a.d().l("com/google/android/callingshared/peertopeer/transport/rcs/inbound/InboundMessageValidator", "validateMessage$<anonymous>", 71, "InboundMessageValidator.kt").v("Broken localRcsIdentity received");
            }
        }
        return null;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.zgm(this.d, this.e, aolnVar);
    }
}
