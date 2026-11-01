package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yqt extends aodx {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqt(anmc anmcVar, anmb anmbVar) {
        super(anmcVar, anmbVar);
        aooh.f(anmcVar, "channel");
        aooh.f(anmbVar, "callOptions");
    }

    public final /* synthetic */ aohh a(anmc anmcVar, anmb anmbVar) {
        return new defpackage.yqt(anmcVar, anmbVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.yqj yqjVar, anph anphVar, aoln aolnVar) {
        defpackage.yqn yqnVar;
        if (aolnVar instanceof defpackage.yqn) {
            yqnVar = (defpackage.yqn) aolnVar;
            int i = yqnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqnVar.c = i - Integer.MIN_VALUE;
            } else {
                yqnVar = new defpackage.yqn(this, aolnVar);
            }
        } else {
            yqnVar = new defpackage.yqn(this, aolnVar);
        }
        defpackage.yqn yqnVar2 = yqnVar;
        java.lang.Object objV = yqnVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = yqnVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            anpk anpkVarA = defpackage.yqm.f;
            if (anpkVarA == null) {
                synchronized (defpackage.yqm.class) {
                    anpkVarA = defpackage.yqm.f;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("com.google.android.apps.messaging.external.p2p.api.ExternalRcsService", "CheckIfRcsIsActive");
                        aalVarD.b();
                        defpackage.yqj yqjVar2 = defpackage.yqj.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new aohc(yqjVar2);
                        aalVarD.c = new aohc(defpackage.yqk.a);
                        anpkVarA = aalVarD.a();
                        defpackage.yqm.f = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            yqnVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, yqjVar, anmbVar, anphVar, yqnVar2);
            if (objV == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objV);
        }
        aooh.e(objV, "unaryRpc(...)");
        return objV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.yqw yqwVar, anph anphVar, aoln aolnVar) {
        defpackage.yqo yqoVar;
        if (aolnVar instanceof defpackage.yqo) {
            yqoVar = (defpackage.yqo) aolnVar;
            int i = yqoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqoVar.c = i - Integer.MIN_VALUE;
            } else {
                yqoVar = new defpackage.yqo(this, aolnVar);
            }
        } else {
            yqoVar = new defpackage.yqo(this, aolnVar);
        }
        defpackage.yqo yqoVar2 = yqoVar;
        java.lang.Object objV = yqoVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = yqoVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            anpk anpkVarA = defpackage.yqm.c;
            if (anpkVarA == null) {
                synchronized (defpackage.yqm.class) {
                    anpkVarA = defpackage.yqm.c;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("com.google.android.apps.messaging.external.p2p.api.ExternalRcsService", "PublishCapabilities");
                        aalVarD.b();
                        defpackage.yqw yqwVar2 = defpackage.yqw.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new aohc(yqwVar2);
                        aalVarD.c = new aohc(defpackage.yqx.a);
                        anpkVarA = aalVarD.a();
                        defpackage.yqm.c = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            yqoVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, yqwVar, anmbVar, anphVar, yqoVar2);
            if (objV == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objV);
        }
        aooh.e(objV, "unaryRpc(...)");
        return objV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.yqz yqzVar, anph anphVar, aoln aolnVar) {
        defpackage.yqp yqpVar;
        if (aolnVar instanceof defpackage.yqp) {
            yqpVar = (defpackage.yqp) aolnVar;
            int i = yqpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqpVar.c = i - Integer.MIN_VALUE;
            } else {
                yqpVar = new defpackage.yqp(this, aolnVar);
            }
        } else {
            yqpVar = new defpackage.yqp(this, aolnVar);
        }
        defpackage.yqp yqpVar2 = yqpVar;
        java.lang.Object objV = yqpVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = yqpVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            anpk anpkVarA = defpackage.yqm.b;
            if (anpkVarA == null) {
                synchronized (defpackage.yqm.class) {
                    anpkVarA = defpackage.yqm.b;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("com.google.android.apps.messaging.external.p2p.api.ExternalRcsService", "PullProtoMessage");
                        aalVarD.b();
                        defpackage.yqz yqzVar2 = defpackage.yqz.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new aohc(yqzVar2);
                        aalVarD.c = new aohc(defpackage.yra.a);
                        anpkVarA = aalVarD.a();
                        defpackage.yqm.b = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            yqpVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, yqzVar, anmbVar, anphVar, yqpVar2);
            if (objV == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objV);
        }
        aooh.e(objV, "unaryRpc(...)");
        return objV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.yrg yrgVar, anph anphVar, aoln aolnVar) {
        defpackage.yqq yqqVar;
        if (aolnVar instanceof defpackage.yqq) {
            yqqVar = (defpackage.yqq) aolnVar;
            int i = yqqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqqVar.c = i - Integer.MIN_VALUE;
            } else {
                yqqVar = new defpackage.yqq(this, aolnVar);
            }
        } else {
            yqqVar = new defpackage.yqq(this, aolnVar);
        }
        defpackage.yqq yqqVar2 = yqqVar;
        java.lang.Object objV = yqqVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = yqqVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            anpk anpkVarA = defpackage.yqm.d;
            if (anpkVarA == null) {
                synchronized (defpackage.yqm.class) {
                    anpkVarA = defpackage.yqm.d;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("com.google.android.apps.messaging.external.p2p.api.ExternalRcsService", "RetrieveCapabilities");
                        aalVarD.b();
                        defpackage.yrg yrgVar2 = defpackage.yrg.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new aohc(yrgVar2);
                        aalVarD.c = new aohc(defpackage.yrh.a);
                        anpkVarA = aalVarD.a();
                        defpackage.yqm.d = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            yqqVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, yrgVar, anmbVar, anphVar, yqqVar2);
            if (objV == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objV);
        }
        aooh.e(objV, "unaryRpc(...)");
        return objV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.yre yreVar, anph anphVar, aoln aolnVar) {
        defpackage.yqr yqrVar;
        if (aolnVar instanceof defpackage.yqr) {
            yqrVar = (defpackage.yqr) aolnVar;
            int i = yqrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqrVar.c = i - Integer.MIN_VALUE;
            } else {
                yqrVar = new defpackage.yqr(this, aolnVar);
            }
        } else {
            yqrVar = new defpackage.yqr(this, aolnVar);
        }
        defpackage.yqr yqrVar2 = yqrVar;
        java.lang.Object objV = yqrVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = yqrVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            anpk anpkVarA = defpackage.yqm.e;
            if (anpkVarA == null) {
                synchronized (defpackage.yqm.class) {
                    anpkVarA = defpackage.yqm.e;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("com.google.android.apps.messaging.external.p2p.api.ExternalRcsService", "RetrieveCapabilitiesInBatch");
                        aalVarD.b();
                        defpackage.yre yreVar2 = defpackage.yre.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new aohc(yreVar2);
                        aalVarD.c = new aohc(defpackage.yrf.a);
                        anpkVarA = aalVarD.a();
                        defpackage.yqm.e = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            yqrVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, yreVar, anmbVar, anphVar, yqrVar2);
            if (objV == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objV);
        }
        aooh.e(objV, "unaryRpc(...)");
        return objV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.yri yriVar, anph anphVar, aoln aolnVar) {
        defpackage.yqs yqsVar;
        if (aolnVar instanceof defpackage.yqs) {
            yqsVar = (defpackage.yqs) aolnVar;
            int i = yqsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yqsVar.c = i - Integer.MIN_VALUE;
            } else {
                yqsVar = new defpackage.yqs(this, aolnVar);
            }
        } else {
            yqsVar = new defpackage.yqs(this, aolnVar);
        }
        defpackage.yqs yqsVar2 = yqsVar;
        java.lang.Object objV = yqsVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = yqsVar2.c;
        if (i2 == 0) {
            aooc.af(objV);
            anmc anmcVar = ((aohh) this).a;
            anpk anpkVarA = defpackage.yqm.a;
            if (anpkVarA == null) {
                synchronized (defpackage.yqm.class) {
                    anpkVarA = defpackage.yqm.a;
                    if (anpkVarA == null) {
                        aal aalVarD = anpk.d();
                        aalVarD.b = anpj.a;
                        aalVarD.d = anpk.c("com.google.android.apps.messaging.external.p2p.api.ExternalRcsService", "SendProtoMessage");
                        aalVarD.b();
                        defpackage.yri yriVar2 = defpackage.yri.a;
                        akzq akzqVar = aohd.a;
                        aalVarD.e = new aohc(yriVar2);
                        aalVarD.c = new aohc(defpackage.yrj.a);
                        anpkVarA = aalVarD.a();
                        defpackage.yqm.a = anpkVarA;
                    }
                }
            }
            anmb anmbVar = ((aohh) this).b;
            yqsVar2.c = 1;
            objV = anty.v(anmcVar, anpkVarA, yriVar, anmbVar, anphVar, yqsVar2);
            if (objV == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objV);
        }
        aooh.e(objV, "unaryRpc(...)");
        return objV;
    }
}
